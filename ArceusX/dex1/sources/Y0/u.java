package Y0;

import S5.Cg.XjqcfAbdbc;
import android.database.Cursor;
import android.database.SQLException;
import c1.h;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u001f\u0012\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"LY0/u;", "Lc1/h$a;", "LY0/h;", "configuration", "LY0/u$b;", "delegate", BuildConfig.FLAVOR, "identityHash", "legacyHash", "<init>", "(LY0/h;LY0/u$b;Ljava/lang/String;Ljava/lang/String;)V", "Lc1/g;", "db", BuildConfig.FLAVOR, "h", "(Lc1/g;)V", "j", "i", "b", "d", BuildConfig.FLAVOR, "oldVersion", "newVersion", "g", "(Lc1/g;II)V", "e", "f", "c", "LY0/h;", "LY0/u$b;", "Ljava/lang/String;", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class u extends h.a {

    public static final Companion INSTANCE = new Companion(null);

    private h configuration;

    private final b delegate;

    private final String identityHash;

    private final String legacyHash;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"LY0/u$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lc1/g;", "db", BuildConfig.FLAVOR, "b", "(Lc1/g;)Z", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(c1.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorQ0 = db.q0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z7 = false;
                if (cursorQ0.moveToFirst()) {
                    if (cursorQ0.getInt(0) == 0) {
                        z7 = true;
                    }
                }
                X9.c.a(cursorQ0, (Throwable) null);
                return z7;
            } finally {
            }
        }

        public final boolean b(c1.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorQ0 = db.q0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z7 = false;
                if (cursorQ0.moveToFirst()) {
                    if (cursorQ0.getInt(0) != 0) {
                        z7 = true;
                    }
                }
                X9.c.a(cursorQ0, (Throwable) null);
                return z7;
            } finally {
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"LY0/u$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "version", "<init>", "(I)V", "Lc1/g;", "db", BuildConfig.FLAVOR, "b", "(Lc1/g;)V", "a", "d", "c", "LY0/u$c;", "g", "(Lc1/g;)LY0/u$c;", "f", "e", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        public final int version;

        public b(int i7) {
            this.version = i7;
        }

        public abstract void a(c1.g db);

        public abstract void b(c1.g db);

        public abstract void c(c1.g db);

        public abstract void d(c1.g db);

        public abstract void e(c1.g db);

        public abstract void f(c1.g db);

        public abstract c g(c1.g db);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LY0/u$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "isValid", BuildConfig.FLAVOR, "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c {

        public final boolean isValid;

        public final String expectedFoundMsg;

        public c(boolean z7, String str) {
            this.isValid = z7;
            this.expectedFoundMsg = str;
        }
    }

    public u(h hVar, b bVar, String str, String str2) {
        super(bVar.version);
        Intrinsics.checkNotNullParameter(hVar, "configuration");
        Intrinsics.checkNotNullParameter(bVar, "delegate");
        Intrinsics.checkNotNullParameter(str, "identityHash");
        Intrinsics.checkNotNullParameter(str2, "legacyHash");
        this.configuration = hVar;
        this.delegate = bVar;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    private final void h(c1.g db) throws SQLException {
        if (!INSTANCE.b(db)) {
            c cVarG = this.delegate.g(db);
            if (cVarG.isValid) {
                this.delegate.e(db);
                j(db);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.expectedFoundMsg);
            }
        }
        Cursor cursorX0 = db.X0(new c1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorX0.moveToFirst() ? cursorX0.getString(0) : null;
            X9.c.a(cursorX0, (Throwable) null);
            if (Intrinsics.b(this.identityHash, string) || Intrinsics.b(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                X9.c.a(cursorX0, th);
                throw th2;
            }
        }
    }

    private final void i(c1.g db) throws SQLException {
        db.z(XjqcfAbdbc.SXAToHisfGpAsDo);
    }

    private final void j(c1.g db) throws SQLException {
        i(db);
        db.z(t.a(this.identityHash));
    }

    @Override
    public void b(c1.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
    }

    @Override
    public void d(c1.g db) throws SQLException {
        Intrinsics.checkNotNullParameter(db, "db");
        boolean zA = INSTANCE.a(db);
        this.delegate.a(db);
        if (!zA) {
            c cVarG = this.delegate.g(db);
            if (!cVarG.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.expectedFoundMsg);
            }
        }
        j(db);
        this.delegate.c(db);
    }

    @Override
    public void e(c1.g db, int oldVersion, int newVersion) throws SQLException {
        Intrinsics.checkNotNullParameter(db, "db");
        g(db, oldVersion, newVersion);
    }

    @Override
    public void f(c1.g db) throws SQLException {
        Intrinsics.checkNotNullParameter(db, "db");
        super.f(db);
        h(db);
        this.delegate.d(db);
        this.configuration = null;
    }

    @Override
    public void g(c1.g db, int oldVersion, int newVersion) throws SQLException {
        List<Z0.b> listD;
        Intrinsics.checkNotNullParameter(db, "db");
        h hVar = this.configuration;
        if (hVar == null || (listD = hVar.migrationContainer.d(oldVersion, newVersion)) == null) {
            h hVar2 = this.configuration;
            if (hVar2 != null && !hVar2.a(oldVersion, newVersion)) {
                this.delegate.b(db);
                this.delegate.a(db);
                return;
            }
            throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.delegate.f(db);
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            ((Z0.b) it.next()).a(db);
        }
        c cVarG = this.delegate.g(db);
        if (cVarG.isValid) {
            this.delegate.e(db);
            j(db);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.expectedFoundMsg);
        }
    }
}
