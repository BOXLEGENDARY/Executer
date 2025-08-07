package d1;

import android.database.sqlite.SQLiteStatement;
import c1.k;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld1/h;", "Ld1/g;", "Lc1/k;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", BuildConfig.FLAVOR, "I", "()I", BuildConfig.FLAVOR, "t1", "()J", "e", "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h extends g implements k {

    private final SQLiteStatement delegate;

    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        Intrinsics.checkNotNullParameter(sQLiteStatement, "delegate");
        this.delegate = sQLiteStatement;
    }

    @Override
    public int I() {
        return this.delegate.executeUpdateDelete();
    }

    @Override
    public long t1() {
        return this.delegate.executeInsert();
    }
}
