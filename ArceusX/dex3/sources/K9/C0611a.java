package k9;

import P9.h;
import P9.i;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001b\u0010\u0004\u001a\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "LP9/h;", "()Z", "isEspressoUiTest", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0611a {

    @NotNull
    private static final h a = i.b(C0238a.d);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0238a extends l implements Function0<Boolean> {
        public static final C0238a d = new C0238a();

        C0238a() {
            super(0);
        }

        @NotNull
        public final Boolean m611invoke() throws ClassNotFoundException {
            boolean z;
            try {
                Class.forName("androidx.test.espresso.Espresso");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final boolean a() {
        return ((Boolean) a.getValue()).booleanValue();
    }
}
