package d1;

import P9.i;
import U.Gw.oeVkjmfPcLbWm;
import Y3.qE.KpBmp;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import c1.h;
import com.github.luben.zstd.BuildConfig;
import d1.d;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import t2.Dbl.hgESaf;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003/01B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010&\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001e\u0010#*\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Ld1/d;", "Lc1/h;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "Lc1/h$a;", "callback", BuildConfig.FLAVOR, "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lc1/h$a;ZZ)V", "enabled", BuildConfig.FLAVOR, "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "d", "Landroid/content/Context;", "e", "Ljava/lang/String;", "i", "Lc1/h$a;", "v", "Z", "w", "LP9/h;", "Ld1/d$c;", "y", "LP9/h;", "lazyDelegate", "z", "writeAheadLoggingEnabled", "()Ld1/d$c;", "getDelegate$delegate", "(Ld1/d;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lc1/g;", "o0", "()Lc1/g;", "writableDatabase", "A", "a", "b", "c", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c1.h {

    private final Context context;

    private final String name;

    private final h.a callback;

    private final boolean useNoBackupDirectory;

    private final boolean allowDataLossOnRecovery;

    private final P9.h<c> lazyDelegate;

    private boolean writeAheadLoggingEnabled;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Ld1/d$b;", BuildConfig.FLAVOR, "Ld1/c;", "db", "<init>", "(Ld1/c;)V", "a", "Ld1/c;", "()Ld1/c;", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class b {

        private d1.c db;

        public b(d1.c cVar) {
            this.db = cVar;
        }

        public final d1.c getDb() {
            return this.db;
        }

        public final void b(d1.c cVar) {
            this.db = cVar;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 @2\u00020\u0001:\u0003ABCB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105¨\u0006D"}, d2 = {"Ld1/d$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "Ld1/d$b;", "dbRef", "Lc1/h$a;", "callback", BuildConfig.FLAVOR, "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ld1/d$b;Lc1/h$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "u", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "m", "Lc1/g;", "f", "(Z)Lc1/g;", "sqLiteDatabase", "Ld1/c;", "j", "(Landroid/database/sqlite/SQLiteDatabase;)Ld1/c;", BuildConfig.FLAVOR, "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", BuildConfig.FLAVOR, "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "d", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "e", "Ld1/d$b;", "getDbRef", "()Ld1/d$b;", "i", "Lc1/h$a;", "getCallback", "()Lc1/h$a;", "v", "Z", "getAllowDataLossOnRecovery", "()Z", "w", "migrated", "Le1/a;", "y", "Le1/a;", "lock", "z", "opened", "A", "a", "b", "c", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends SQLiteOpenHelper {

        public static final Companion INSTANCE = new Companion(null);

        private final Context context;

        private final b dbRef;

        private final h.a callback;

        private final boolean allowDataLossOnRecovery;

        private boolean migrated;

        private final e1.a lock;

        private boolean opened;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld1/d$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ld1/d$c$b;", "callbackName", BuildConfig.FLAVOR, "cause", "<init>", "(Ld1/d$c$b;Ljava/lang/Throwable;)V", "d", "Ld1/d$c$b;", "a", "()Ld1/d$c$b;", "e", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class a extends RuntimeException {

            private final b callbackName;

            private final Throwable cause;

            public a(b bVar, Throwable th) {
                super(th);
                Intrinsics.checkNotNullParameter(bVar, "callbackName");
                Intrinsics.checkNotNullParameter(th, "cause");
                this.callbackName = bVar;
                this.cause = th;
            }

            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ld1/d$c$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld1/d$c$c;", BuildConfig.FLAVOR, "<init>", "()V", "Ld1/d$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Ld1/c;", "a", "(Ld1/d$b;Landroid/database/sqlite/SQLiteDatabase;)Ld1/c;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d1.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                d1.c db = refHolder.getDb();
                if (db != null && db.f(sqLiteDatabase)) {
                    return db;
                }
                d1.c cVar = new d1.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public class C0180d {

            public static final int[] f20301a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20301a = iArr;
            }
        }

        public c(Context context, String str, final b bVar, final h.a aVar, boolean z7) {
            super(context, str, null, aVar.version, new DatabaseErrorHandler() {
                @Override
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.e(aVar, bVar, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, oeVkjmfPcLbWm.XyPBUVbVuk);
            Intrinsics.checkNotNullParameter(bVar, "dbRef");
            Intrinsics.checkNotNullParameter(aVar, "callback");
            this.context = context;
            this.dbRef = bVar;
            this.callback = aVar;
            this.allowDataLossOnRecovery = z7;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.lock = new e1.a(str, context.getCacheDir(), false);
        }

        public static final void e(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(aVar, "$callback");
            Intrinsics.checkNotNullParameter(bVar, "$dbRef");
            Companion companion = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabase, "dbObj");
            aVar.c(companion.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase m(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase u(boolean writable) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z7 = this.opened;
            if (databaseName != null && !z7 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(hgESaf.JHzqGY, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return m(writable);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m(writable);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i7 = C0180d.f20301a[aVar.getCallbackName().ordinal()];
                        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return m(writable);
                    } catch (a e7) {
                        throw e7.getCause();
                    }
                }
            }
        }

        @Override
        public void close() throws IOException {
            try {
                e1.a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        public final c1.g f(boolean writable) throws IOException {
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase sQLiteDatabaseU = u(writable);
                if (!this.migrated) {
                    d1.c cVarJ = j(sQLiteDatabaseU);
                    this.lock.d();
                    return cVarJ;
                }
                close();
                c1.g gVarF = f(writable);
                this.lock.d();
                return gVarF;
            } catch (Throwable th) {
                this.lock.d();
                throw th;
            }
        }

        public final d1.c j(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }

        @Override
        public void onConfigure(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated && this.callback.version != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(j(db));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, KpBmp.fIw);
            try {
                this.callback.d(j(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.migrated = true;
            try {
                this.callback.e(j(db), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override
        public void onOpen(SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated) {
                try {
                    this.callback.f(j(db));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.g(j(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld1/d$c;", "a", "()Ld1/d$c;"}, k = 3, mv = {1, 8, 0})
    static final class C0181d extends l implements Function0<c> {
        C0181d() {
            super(0);
        }

        public final c invoke() {
            c cVar;
            if (d.this.name == null || !d.this.useNoBackupDirectory) {
                cVar = new c(d.this.context, d.this.name, new b(null), d.this.callback, d.this.allowDataLossOnRecovery);
            } else {
                cVar = new c(d.this.context, new File(c1.d.a(d.this.context), d.this.name).getAbsolutePath(), new b(null), d.this.callback, d.this.allowDataLossOnRecovery);
            }
            c1.b.f(cVar, d.this.writeAheadLoggingEnabled);
            return cVar;
        }
    }

    public d(Context context, String str, h.a aVar, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "callback");
        this.context = context;
        this.name = str;
        this.callback = aVar;
        this.useNoBackupDirectory = z7;
        this.allowDataLossOnRecovery = z8;
        this.lazyDelegate = i.b(new C0181d());
    }

    private final c y() {
        return (c) this.lazyDelegate.getValue();
    }

    @Override
    public void close() throws IOException {
        if (this.lazyDelegate.a()) {
            y().close();
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public c1.g o0() {
        return y().f(true);
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.a()) {
            c1.b.f(y(), enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }
}
