package d1;

import android.database.sqlite.SQLiteProgram;
import c1.i;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ld1/g;", "Lc1/i;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "N0", "(I)V", BuildConfig.FLAVOR, "value", "c0", "(IJ)V", BuildConfig.FLAVOR, "M", "(ID)V", BuildConfig.FLAVOR, "B", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "j0", "(I[B)V", "close", "()V", "d", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class g implements i {

    private final SQLiteProgram delegate;

    public g(SQLiteProgram sQLiteProgram) {
        Intrinsics.checkNotNullParameter(sQLiteProgram, "delegate");
        this.delegate = sQLiteProgram;
    }

    @Override
    public void B(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindString(index, value);
    }

    @Override
    public void M(int index, double value) {
        this.delegate.bindDouble(index, value);
    }

    @Override
    public void N0(int index) {
        this.delegate.bindNull(index);
    }

    @Override
    public void c0(int index, long value) {
        this.delegate.bindLong(index, value);
    }

    @Override
    public void close() {
        this.delegate.close();
    }

    @Override
    public void j0(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindBlob(index, value);
    }
}
