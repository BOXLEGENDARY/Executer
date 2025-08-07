package backtraceio.library;

import android.content.Context;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import backtraceio.library.common.FileHelper;
import backtraceio.library.common.TypeHelper;
import backtraceio.library.common.serialization.DebugHelper;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.enums.database.RetryBehavior;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.interfaces.NativeCommunication;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.nativeHandler.CrashHandlerConfiguration;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.nativeCalls.BacktraceCrashHandlerWrapper;
import backtraceio.library.services.BacktraceDatabaseContext;
import backtraceio.library.services.BacktraceDatabaseFileContext;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import w7.Jld.EZYiRMRTxKdo;
import y1.b;

public class BacktraceDatabase implements Database {

    private static boolean f12653l;

    private static Timer f12654m;

    private final transient String f12655a;

    private Api f12656b;

    private Context f12657c;

    private DatabaseContext f12658d;

    private DatabaseFileContext f12659e;

    private BacktraceDatabaseSettings f12660f;

    private boolean f12661g;

    private Breadcrumbs f12662h;

    private CrashHandlerConfiguration f12663i;

    private boolean f12664j;

    private NativeCommunication f12665k;

    class a extends TimerTask {

        class C0138a implements OnServerResponseEventListener {

            final BacktraceDatabaseRecord f12667a;

            final CountDownLatch f12668b;

            C0138a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f12667a = backtraceDatabaseRecord;
                this.f12668b = countDownLatch;
            }

            @Override
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f12667a);
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f12655a, EZYiRMRTxKdo.HQBxkvJaC);
                    this.f12667a.close();
                }
                this.f12668b.countDown();
            }
        }

        a() {
        }

        @Override
        public void run() throws InterruptedException {
            String string = Calendar.getInstance().getTime().toString();
            BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - " + string);
            if (BacktraceDatabase.this.f12658d == null) {
                BacktraceLogger.w(BacktraceDatabase.this.f12655a, "Timer - database context is null: " + string);
                return;
            }
            if (BacktraceDatabase.this.f12658d.isEmpty()) {
                BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - database is empty (no records): " + string);
                return;
            }
            if (BacktraceDatabase.f12653l) {
                BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - another timer works now: " + string);
                return;
            }
            BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - continue working: " + string);
            boolean unused = BacktraceDatabase.f12653l = true;
            BacktraceDatabase.f12654m.cancel();
            BacktraceDatabase.f12654m.purge();
            Timer unused2 = BacktraceDatabase.f12654m = null;
            BacktraceDatabaseRecord backtraceDatabaseRecordFirst = BacktraceDatabase.this.f12658d.first();
            while (true) {
                if (backtraceDatabaseRecordFirst == null) {
                    break;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData(BacktraceDatabase.this.f12657c);
                if (backtraceData != null && backtraceData.getReport() != null) {
                    BacktraceDatabase.this.f12656b.send(backtraceData, new C0138a(backtraceDatabaseRecordFirst, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e7) {
                        BacktraceLogger.e(BacktraceDatabase.this.f12655a, "Error during waiting for result in Timer", e7);
                    }
                    if (backtraceDatabaseRecordFirst.valid() && !backtraceDatabaseRecordFirst.locked) {
                        BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f12655a, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(backtraceDatabaseRecordFirst);
                }
                backtraceDatabaseRecordFirst = BacktraceDatabase.this.f12658d.first();
            }
            BacktraceLogger.d(BacktraceDatabase.this.f12655a, EZYiRMRTxKdo.Pgp);
            boolean unused3 = BacktraceDatabase.f12653l = false;
            BacktraceDatabase.this.p();
        }
    }

    public BacktraceDatabase() {
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f12655a = simpleName;
        this.f12661g = false;
        this.f12664j = false;
        this.f12665k = new BacktraceCrashHandlerWrapper();
        BacktraceLogger.w(simpleName, "Disabled instance of BacktraceDatabase created, native crashes won't be captured");
    }

    private native void disable();

    private String k() {
        return this.f12660f.getDatabasePath();
    }

    public void l(long j7) {
        addAttribute("breadcrumbs.lastId", Long.toString(j7));
    }

    private void m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        n();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        BacktraceLogger.d(this.f12655a, "Loading " + this.f12658d.count() + " reports took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " milliseconds");
    }

    private void n() {
        Iterator<File> it = this.f12659e.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord fromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (fromFile != null) {
                if (fromFile.valid()) {
                    this.f12658d.add(fromFile);
                    q();
                    fromFile.close();
                } else {
                    fromFile.delete();
                }
            }
        }
    }

    private void o() {
        this.f12659e.removeOrphaned(this.f12658d.get());
    }

    public void p() {
        Timer timer = new Timer();
        f12654m = timer;
        timer.scheduleAtFixedRate(new a(), this.f12660f.getRetryInterval() * 1000, this.f12660f.getRetryInterval() * 1000);
    }

    private boolean q() {
        if (this.f12658d.count() + 1 > this.f12660f.getMaxRecordCount() && this.f12660f.getMaxRecordCount() != 0 && !this.f12658d.removeOldestRecord()) {
            BacktraceLogger.e(this.f12655a, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f12660f.getMaxDatabaseSize() == 0 || this.f12658d.getDatabaseSize() <= this.f12660f.getMaxDatabaseSize()) {
            return true;
        }
        int i7 = 5;
        while (this.f12658d.getDatabaseSize() > this.f12660f.getMaxDatabaseSize()) {
            this.f12658d.removeOldestRecord();
            i7--;
            if (i7 == 0) {
                break;
            }
        }
        return i7 != 0;
    }

    @Override
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map) {
        return add(backtraceReport, map, false);
    }

    public native void addAttribute(String str, String str2);

    @Override
    public Boolean addNativeAttribute(String str, Object obj) {
        if (!this.f12664j) {
            return Boolean.FALSE;
        }
        if (str == null || obj == null) {
            return Boolean.FALSE;
        }
        if (!TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(obj.getClass())) {
            return Boolean.FALSE;
        }
        addAttribute(str, obj.toString());
        return Boolean.TRUE;
    }

    @Override
    public void clear() {
        DatabaseContext databaseContext = this.f12658d;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f12659e;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f12658d;
        if (databaseContext == null || backtraceDatabaseRecord == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override
    public void disableNativeIntegration() {
        disable();
        this.f12664j = false;
    }

    @Override
    public void flush() {
        if (this.f12656b == null) {
            throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = this.f12658d.first();
        while (backtraceDatabaseRecordFirst != null) {
            BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData(this.f12657c);
            delete(backtraceDatabaseRecordFirst);
            if (backtraceData != null) {
                this.f12656b.send(backtraceData, null);
            }
            backtraceDatabaseRecordFirst = this.f12658d.first();
        }
    }

    @Override
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f12658d;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override
    public Breadcrumbs getBreadcrumbs() {
        return this.f12662h;
    }

    @Override
    public long getDatabaseSize() {
        return this.f12658d.getDatabaseSize();
    }

    @Override
    public BacktraceDatabaseSettings getSettings() {
        return this.f12660f;
    }

    @Override
    public void setApi(Api api) {
        this.f12656b = api;
    }

    @Override
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar) {
        return setupNativeIntegration(backtraceBase, bVar, false);
    }

    @Override
    public void start() {
        if (this.f12660f == null) {
            return;
        }
        DatabaseContext databaseContext = this.f12658d;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f12661g = true;
            return;
        }
        m();
        o();
        if (this.f12660f.getRetryBehavior() == RetryBehavior.ByInterval || this.f12660f.isAutoSendMode()) {
            p();
        }
        this.f12661g = true;
    }

    @Override
    public boolean validConsistency() {
        return this.f12659e.validFileConsistency();
    }

    @Override
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z7) {
        if (!this.f12661g || backtraceReport == null || !q()) {
            return null;
        }
        return this.f12658d.add(backtraceReport.toBacktraceData(this.f12657c, map, z7));
    }

    @Override
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z7) {
        return setupNativeIntegration(backtraceBase, bVar, z7, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z7, UnwindingMode unwindingMode) {
        if (this.f12661g && getSettings() != null) {
            if (!this.f12663i.isSupportedAbi().booleanValue()) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
            String string = bVar.c().toString();
            if (string == null) {
                return Boolean.FALSE;
            }
            String strUseCrashpadDirectory = this.f12663i.useCrashpadDirectory(getSettings().getDatabasePath());
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f12657c, backtraceBase.attributes);
            backtraceAttributes.attributes.put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.CrashAttributeType);
            String[] strArr = (String[]) backtraceAttributes.attributes.keySet().toArray(new String[0]);
            String[] strArr2 = (String[]) backtraceAttributes.attributes.values().toArray(new String[0]);
            int size = backtraceBase.attachments.size();
            String[] strArr3 = new String[size + 1];
            if (backtraceBase.attachments != null) {
                for (int i7 = 0; i7 < backtraceBase.attachments.size(); i7++) {
                    strArr3[i7] = backtraceBase.attachments.get(i7);
                }
            }
            strArr3[size] = this.f12662h.getBreadcrumbLogPath();
            boolean zInitializeJavaCrashHandler = this.f12665k.initializeJavaCrashHandler(string, strUseCrashpadDirectory, this.f12663i.getClassPath(), strArr, strArr2, strArr3, (String[]) this.f12663i.getCrashHandlerEnvironmentVariables(this.f12657c.getApplicationInfo()).toArray(new String[0]));
            this.f12664j = zInitializeJavaCrashHandler;
            if (zInitializeJavaCrashHandler && this.f12662h.isEnabled()) {
                this.f12662h.setOnSuccessfulBreadcrumbAddEventListener(new OnSuccessfulBreadcrumbAddEventListener() {
                    @Override
                    public final void onSuccessfulAdd(long j7) {
                        this.f24422a.l(j7);
                    }
                });
            }
            long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
            BacktraceLogger.d(this.f12655a, "Setup native integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return Boolean.valueOf(this.f12664j);
        }
        return Boolean.FALSE;
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f12655a = BacktraceDatabase.class.getSimpleName();
        this.f12661g = false;
        this.f12664j = false;
        this.f12665k = new BacktraceCrashHandlerWrapper();
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f12657c = context;
                this.f12660f = backtraceDatabaseSettings;
                this.f12658d = new BacktraceDatabaseContext(this.f12657c, backtraceDatabaseSettings);
                this.f12659e = new BacktraceDatabaseFileContext(k(), this.f12660f.getMaxDatabaseSize(), this.f12660f.getMaxRecordCount());
                this.f12662h = new BacktraceBreadcrumbs(k());
                this.f12663i = new CrashHandlerConfiguration();
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
