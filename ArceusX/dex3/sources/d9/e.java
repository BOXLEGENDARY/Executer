package d9;

import android.content.Context;
import android.content.SharedPreferences;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Ld9/e;", "Ld9/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "LP9/h;", "d", "()Landroid/content/SharedPreferences;", "prefs", "", "value", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "deviceId", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements InterfaceC0550a {

    @NotNull
    private final Context context;

    @NotNull
    private final P9.h prefs;

    private String deviceId;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "a", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<SharedPreferences> {
        a() {
            super(0);
        }

        public final SharedPreferences invoke() {
            return e.this.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
        }
    }

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = P9.i.b(new a());
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.prefs.getValue();
    }

    @Override
    public void a(String str) {
        if ((!Intrinsics.b(str, this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            d().edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }

    @Override
    public String b() {
        String str = this.deviceId;
        return str == null ? d().getString("DEVICE_ID", null) : str;
    }
}
