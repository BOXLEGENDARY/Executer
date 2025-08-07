package backtraceio.library.services;

import backtraceio.library.common.FileHelper;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;

public class BacktraceDatabaseFileContext implements DatabaseFileContext {
    private static final transient String LOG_TAG = "BacktraceDatabaseFileContext";
    private final File _databaseDirectory;
    private final String _databasePath;
    private final long _maxDatabaseSize;
    private final int _maxRecordNumber;
    private final String recordFilterRegex = ".*-record.json";
    private final String _crashpadDatabasePathPrefix = "crashpad";

    public BacktraceDatabaseFileContext(String str, long j7, int i7) {
        this._databasePath = str;
        this._maxDatabaseSize = j7;
        this._maxRecordNumber = i7;
        this._databaseDirectory = new File(str);
    }

    @Override
    public void clear() {
        BacktraceLogger.d(LOG_TAG, "Removing all files from database file context");
        Iterator<File> it = getAll().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @Override
    public Iterable<File> getAll() {
        File[] fileArrListFiles = this._databaseDirectory.listFiles();
        return fileArrListFiles == null ? Collections.emptyList() : Arrays.asList(fileArrListFiles);
    }

    @Override
    public Iterable<File> getRecords() {
        BacktraceLogger.d(LOG_TAG, "Getting files from file context");
        final Pattern patternCompile = Pattern.compile(".*-record.json");
        File[] fileArrListFiles = this._databaseDirectory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return patternCompile.matcher(file.getName()).matches();
            }
        });
        return fileArrListFiles == null ? Collections.emptyList() : Arrays.asList(fileArrListFiles);
    }

    @Override
    public void removeOrphaned(Iterable<BacktraceDatabaseRecord> iterable) {
        BacktraceLogger.d(LOG_TAG, "Removing orphaned files from file context");
        ArrayList arrayList = new ArrayList();
        Iterator<BacktraceDatabaseRecord> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().id.toString());
        }
        for (File file : getAll()) {
            if (!file.isDirectory() || !file.getName().endsWith("crashpad")) {
                if (FileHelper.getFileExtension(file).equals("json")) {
                    int iLastIndexOf = file.getName().lastIndexOf(45);
                    if (iLastIndexOf == -1) {
                        BacktraceLogger.d(LOG_TAG, "Deleting file - name is incorrect");
                        file.delete();
                    } else if (!arrayList.contains(file.getName().substring(0, iLastIndexOf))) {
                        BacktraceLogger.d(LOG_TAG, "Deleting file - file id is not in existing collection");
                        file.delete();
                    }
                } else {
                    BacktraceLogger.d(LOG_TAG, "Deleting file - it is not a JSON file");
                    file.delete();
                }
            }
        }
    }

    @Override
    public boolean validFileConsistency() {
        BacktraceLogger.d(LOG_TAG, "Checking the consistency of files in file context");
        long j7 = 0;
        long length = 0;
        for (File file : getAll()) {
            if (file.getName().matches(".*-record.json")) {
                j7++;
                int i7 = this._maxRecordNumber;
                if (i7 != 0 && i7 < j7) {
                    BacktraceLogger.w(LOG_TAG, "Total number of records is bigger than allowed");
                    return false;
                }
            }
            length += file.length();
            long j8 = this._maxDatabaseSize;
            if (j8 != 0 && length > j8) {
                BacktraceLogger.w(LOG_TAG, "Database size is bigger than allowed");
                return false;
            }
        }
        return true;
    }
}
