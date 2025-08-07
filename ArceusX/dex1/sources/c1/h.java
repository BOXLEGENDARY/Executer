package c1;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lc1/h;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "enabled", BuildConfig.FLAVOR, "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", BuildConfig.FLAVOR, "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lc1/g;", "o0", "()Lc1/g;", "writableDatabase", "a", "b", "c", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h extends Closeable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc1/h$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "version", "<init>", "(I)V", BuildConfig.FLAVOR, "fileName", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", "Lc1/g;", "db", "b", "(Lc1/g;)V", "d", "oldVersion", "newVersion", "g", "(Lc1/g;II)V", "e", "f", "c", "I", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        public final int version;

        public a(int i7) {
            this.version = i7;
        }

        private final void a(String fileName) {
            if (StringsKt.r(fileName, ":memory:", true)) {
                return;
            }
            int length = fileName.length() - 1;
            int i7 = 0;
            boolean z7 = false;
            while (i7 <= length) {
                boolean z8 = Intrinsics.g(fileName.charAt(!z7 ? i7 : length), 32) <= 0;
                if (z7) {
                    if (!z8) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z8) {
                    i7++;
                } else {
                    z7 = true;
                }
            }
            if (fileName.subSequence(i7, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + fileName);
            try {
                c1.b.c(new File(fileName));
            } catch (Exception e7) {
                Log.w("SupportSQLite", "delete failed: ", e7);
            }
        }

        public void b(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(g db) {
            Intrinsics.checkNotNullParameter(db, wtzgsqRsIZB.XWzSXzXBZEmnFGZ);
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listV = null;
            try {
                try {
                    listV = db.v();
                } finally {
                    if (listV != null) {
                        Iterator<T> it = listV.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
            if (listV != null) {
                return;
            }
        }

        public abstract void d(g db);

        public abstract void e(g db, int oldVersion, int newVersion);

        public void f(g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void g(g db, int oldVersion, int newVersion);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lc1/h$b;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "Lc1/h$a;", "callback", BuildConfig.FLAVOR, "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lc1/h$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lc1/h$a;", "d", "Z", "e", "f", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        public static final Companion INSTANCE = new Companion(null);

        public final Context context;

        public final String name;

        public final a callback;

        public final boolean useNoBackupDirectory;

        public final boolean allowDataLossOnRecovery;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lc1/h$b$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lc1/h$b;", "a", "()Lc1/h$b;", BuildConfig.FLAVOR, "name", "c", "(Ljava/lang/String;)Lc1/h$b$a;", "Lc1/h$a;", "callback", "b", "(Lc1/h$a;)Lc1/h$b$a;", BuildConfig.FLAVOR, "useNoBackupDirectory", "d", "(Z)Lc1/h$b$a;", "Landroid/content/Context;", "Ljava/lang/String;", "Lc1/h$a;", "Z", "e", "allowDataLossOnRecovery", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class a {

            private final Context context;

            private String name;

            private a callback;

            private boolean useNoBackupDirectory;

            private boolean allowDataLossOnRecovery;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.context = context;
            }

            public b a() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            public a b(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callback = callback;
                return this;
            }

            public a c(String name) {
                this.name = name;
                return this;
            }

            public a d(boolean useNoBackupDirectory) {
                this.useNoBackupDirectory = useNoBackupDirectory;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc1/h$b$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lc1/h$b$a;", "a", "(Landroid/content/Context;)Lc1/h$b$a;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private Companion() {
            }
        }

        public b(Context context, String str, a aVar, boolean z7, boolean z8) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(aVar, "callback");
            this.context = context;
            this.name = str;
            this.callback = aVar;
            this.useNoBackupDirectory = z7;
            this.allowDataLossOnRecovery = z8;
        }

        public static final a a(Context context) {
            return INSTANCE.a(context);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lc1/h$c;", BuildConfig.FLAVOR, "Lc1/h$b;", "configuration", "Lc1/h;", "a", "(Lc1/h$b;)Lc1/h;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        h a(b configuration);
    }

    @Override
    void close();

    String getDatabaseName();

    g o0();

    void setWriteAheadLoggingEnabled(boolean enabled);
}
