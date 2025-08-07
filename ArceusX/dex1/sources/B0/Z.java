package B0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LB0/Z;", BuildConfig.FLAVOR, "LB0/i;", "credential", "<init>", "(LB0/i;)V", "a", "LB0/i;", "()LB0/i;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z {

    private final AbstractC0298i credential;

    public Z(AbstractC0298i abstractC0298i) {
        Intrinsics.checkNotNullParameter(abstractC0298i, "credential");
        this.credential = abstractC0298i;
    }

    public final AbstractC0298i getCredential() {
        return this.credential;
    }
}
