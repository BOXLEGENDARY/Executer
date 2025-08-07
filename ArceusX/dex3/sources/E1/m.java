package E1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"LE1/m;", "LE1/h;", "LB1/o;", "source", "", "mimeType", "LB1/e;", "dataSource", "<init>", "(LB1/o;Ljava/lang/String;LB1/e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LB1/o;", "c", "()LB1/o;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "LB1/e;", "()LB1/e;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends h {

    @NotNull
    private final o source;

    private final String mimeType;

    @NotNull
    private final okio.e dataSource;

    public m(@NotNull o oVar, String str, @NotNull okio.e eVar) {
        super(null);
        this.source = oVar;
        this.mimeType = str;
        this.dataSource = eVar;
    }

    @NotNull
    public final okio.e getDataSource() {
        return this.dataSource;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final o getSource() {
        return this.source;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m) {
            m mVar = (m) other;
            if (Intrinsics.b(this.source, mVar.source) && Intrinsics.b(this.mimeType, mVar.mimeType) && this.dataSource == mVar.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.dataSource.hashCode();
    }
}
