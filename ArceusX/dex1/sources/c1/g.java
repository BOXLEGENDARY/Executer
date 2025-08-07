package c1;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e0\u001dH&¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR(\u0010,\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)\u0018\u00010(8fX¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lc1/g;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "sql", "Lc1/k;", "J", "(Ljava/lang/String;)Lc1/k;", BuildConfig.FLAVOR, "p", "()V", "f0", "v0", "d0", BuildConfig.FLAVOR, "V0", "()Z", "query", "Landroid/database/Cursor;", "q0", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lc1/j;", "X0", "(Lc1/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "K0", "(Lc1/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "z", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bindArgs", "e0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isOpen", "getPath", "()Ljava/lang/String;", "path", "d1", "isWriteAheadLoggingEnabled", BuildConfig.FLAVOR, "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g extends Closeable {
    k J(String sql);

    Cursor K0(j query, CancellationSignal cancellationSignal);

    boolean V0();

    Cursor X0(j query);

    void d0();

    boolean d1();

    void e0(String sql, Object[] bindArgs) throws SQLException;

    void f0();

    String getPath();

    boolean isOpen();

    void p();

    Cursor q0(String query);

    List<Pair<String, String>> v();

    void v0();

    void z(String sql) throws SQLException;
}
