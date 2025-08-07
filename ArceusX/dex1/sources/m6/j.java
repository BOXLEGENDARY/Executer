package M6;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import ka.oik.UJEa;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"LM6/j;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "()Ljava/util/Set;", "productKey", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    private final SharedPreferences sharedPreferences;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = context.getSharedPreferences("google_store_prefs", 0);
    }

    private final Set<String> b() {
        Set<String> setU0;
        Set<String> stringSet = this.sharedPreferences.getStringSet("granted_product_keys", new LinkedHashSet());
        return (stringSet == null || (setU0 = CollectionsKt.u0(stringSet)) == null) ? new LinkedHashSet() : setU0;
    }

    public final void a(String productKey) {
        Intrinsics.checkNotNullParameter(productKey, "productKey");
        Set<String> setB = b();
        setB.add(productKey);
        this.sharedPreferences.edit().putStringSet("granted_product_keys", CollectionsKt.v0(setB)).apply();
    }

    public final boolean c(String productKey) {
        Intrinsics.checkNotNullParameter(productKey, UJEa.iQoUBbokaB);
        return b().contains(productKey);
    }
}
