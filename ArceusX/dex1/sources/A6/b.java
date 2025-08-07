package a6;

import android.database.SQLException;
import c1.g;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La6/b;", "LZ0/a;", "<init>", "()V", "Lc1/g;", "db", BuildConfig.FLAVOR, "a", "(Lc1/g;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements Z0.a {
    @Override
    public void a(g db) throws SQLException {
        Intrinsics.checkNotNullParameter(db, "db");
        db.z("DELETE FROM analytic_event");
    }
}
