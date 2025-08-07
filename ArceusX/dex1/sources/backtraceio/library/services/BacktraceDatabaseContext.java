package backtraceio.library.services;

import android.content.Context;
import backtraceio.library.enums.database.RetryOrder;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BacktraceDatabaseContext implements DatabaseContext {
    private static final transient String LOG_TAG = "BacktraceDatabaseContext";
    private final Context _applicationContext;
    private final String _path;
    private final int _retryNumber;
    private final Map<Integer, List<BacktraceDatabaseRecord>> batchRetry;
    private final RetryOrder retryOrder;
    private int totalRecords;
    private long totalSize;

    public BacktraceDatabaseContext(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this(context, backtraceDatabaseSettings.getDatabasePath(), backtraceDatabaseSettings.getRetryLimit(), backtraceDatabaseSettings.getRetryOrder());
    }

    private BacktraceDatabaseRecord getFirstRecord() {
        return getRecordFromCache(false);
    }

    private BacktraceDatabaseRecord getLastRecord() {
        return getRecordFromCache(true);
    }

    private BacktraceDatabaseRecord getRecordFromCache(boolean z7) {
        for (int i7 = this._retryNumber - 1; i7 >= 0; i7--) {
            List<BacktraceDatabaseRecord> list = this.batchRetry.get(Integer.valueOf(i7));
            if (list != null) {
                if (z7) {
                    Collections.reverse(list);
                }
                for (BacktraceDatabaseRecord backtraceDatabaseRecord : list) {
                    if (backtraceDatabaseRecord != null && !backtraceDatabaseRecord.locked) {
                        backtraceDatabaseRecord.locked = true;
                        return backtraceDatabaseRecord;
                    }
                }
            }
        }
        return null;
    }

    private void incrementBatches() {
        for (int i7 = this._retryNumber - 2; i7 >= 0; i7--) {
            List<BacktraceDatabaseRecord> list = this.batchRetry.get(Integer.valueOf(i7));
            this.batchRetry.put(Integer.valueOf(i7), new ArrayList());
            this.batchRetry.put(Integer.valueOf(i7 + 1), list);
        }
    }

    private void removeMaxRetries() {
        for (BacktraceDatabaseRecord backtraceDatabaseRecord : this.batchRetry.get(Integer.valueOf(this._retryNumber - 1))) {
            if (backtraceDatabaseRecord.valid()) {
                backtraceDatabaseRecord.delete();
                this.totalRecords--;
                this.totalSize -= backtraceDatabaseRecord.getSize();
            }
        }
    }

    private void setupBatch() {
        if (this._retryNumber == 0) {
            throw new IllegalArgumentException("Retry number must be greater than 0!");
        }
        for (int i7 = 0; i7 < this._retryNumber; i7++) {
            this.batchRetry.put(Integer.valueOf(i7), new ArrayList());
        }
    }

    @Override
    public BacktraceDatabaseRecord add(BacktraceData backtraceData) throws NullPointerException {
        String str = LOG_TAG;
        BacktraceLogger.d(str, "Adding new record to database context");
        if (backtraceData == null) {
            BacktraceLogger.e(str, "BacktraceData is null");
            throw new NullPointerException("BacktraceData");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecord = new BacktraceDatabaseRecord(backtraceData, this._path);
        backtraceDatabaseRecord.save();
        return add(backtraceDatabaseRecord);
    }

    @Override
    public void clear() {
        BacktraceLogger.d(LOG_TAG, "Deleting all records from database context");
        Iterator<Map.Entry<Integer, List<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<BacktraceDatabaseRecord> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                it2.next().delete();
            }
        }
        this.totalRecords = 0;
        this.totalSize = 0L;
        Iterator<Map.Entry<Integer, List<BacktraceDatabaseRecord>>> it3 = this.batchRetry.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().clear();
        }
    }

    @Override
    public boolean contains(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        if (backtraceDatabaseRecord == null) {
            throw new NullPointerException("BacktraceDatabaseRecord");
        }
        Iterator<Map.Entry<Integer, List<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            for (BacktraceDatabaseRecord backtraceDatabaseRecord2 : it.next().getValue()) {
                if (backtraceDatabaseRecord2 != null && backtraceDatabaseRecord2.id == backtraceDatabaseRecord.id) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int count() {
        return this.totalRecords;
    }

    @Override
    public boolean delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        if (backtraceDatabaseRecord == null) {
            return false;
        }
        for (Integer num : this.batchRetry.keySet()) {
            num.intValue();
            List<BacktraceDatabaseRecord> list = this.batchRetry.get(num);
            if (list != null) {
                Iterator<BacktraceDatabaseRecord> it = list.iterator();
                while (it.hasNext()) {
                    BacktraceDatabaseRecord next = it.next();
                    if (next != null && backtraceDatabaseRecord.id.equals(next.id)) {
                        next.delete();
                        try {
                            it.remove();
                            this.totalRecords--;
                            this.totalSize -= next.getSize();
                            return true;
                        } catch (Exception e7) {
                            BacktraceLogger.d(LOG_TAG, "Exception on removing record " + next.id.toString() + "from db context: " + e7.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public BacktraceDatabaseRecord first() {
        return this.retryOrder == RetryOrder.Queue ? getFirstRecord() : getLastRecord();
    }

    @Override
    public Iterable<BacktraceDatabaseRecord> get() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, List<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValue());
        }
        return arrayList;
    }

    @Override
    public long getDatabaseSize() {
        return this.totalSize;
    }

    @Override
    public void incrementBatchRetry() {
        removeMaxRetries();
        incrementBatches();
    }

    @Override
    public boolean isEmpty() {
        return this.totalRecords == 0;
    }

    @Override
    public BacktraceDatabaseRecord last() {
        return this.retryOrder == RetryOrder.Queue ? getLastRecord() : getFirstRecord();
    }

    @Override
    public boolean removeOldestRecord() {
        String str = LOG_TAG;
        BacktraceLogger.d(str, "Removing oldest record from database context");
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = first();
        if (backtraceDatabaseRecordFirst != null) {
            return delete(backtraceDatabaseRecordFirst);
        }
        BacktraceLogger.w(str, "Oldest record in database is null");
        return false;
    }

    private BacktraceDatabaseContext(Context context, String str, int i7, RetryOrder retryOrder) {
        this.batchRetry = new HashMap();
        this.totalSize = 0L;
        this.totalRecords = 0;
        this._applicationContext = context;
        this._path = str;
        this._retryNumber = i7;
        this.retryOrder = retryOrder;
        setupBatch();
    }

    @Override
    public BacktraceDatabaseRecord add(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        String str = LOG_TAG;
        BacktraceLogger.d(str, "Adding new record to database context");
        if (backtraceDatabaseRecord != null) {
            backtraceDatabaseRecord.locked = true;
            this.totalSize += backtraceDatabaseRecord.getSize();
            this.batchRetry.get(0).add(backtraceDatabaseRecord);
            this.totalRecords++;
            return backtraceDatabaseRecord;
        }
        BacktraceLogger.e(str, "Backtrace database record is null");
        throw new NullPointerException("BacktraceDatabaseRecord");
    }
}
