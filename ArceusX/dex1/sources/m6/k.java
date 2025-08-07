package M6;

import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "productId", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)Z", "a", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "productId");
        return StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null).contains("nonconsumable");
    }

    public static final boolean b(String str) {
        Intrinsics.checkNotNullParameter(str, "productId");
        return StringsKt.split$default(str, new String[]{GObvYfBKohxpYX.kOlB}, false, 0, 6, (Object) null).contains("playpoints");
    }
}
