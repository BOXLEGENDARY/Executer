package B0;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LB0/d;", "LB0/c;", BuildConfig.FLAVOR, "type", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class C0293d extends AbstractC0292c {
    public C0293d(String str, Bundle bundle) {
        super(str, bundle);
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "data");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
