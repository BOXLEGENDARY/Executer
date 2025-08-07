package A9;

import P9.h;
import P9.i;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "LA9/a;", "b", "()LA9/a;", "", "a", "LP9/h;", "d", "()Z", "webRtcWrapperExists", "webrtc_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @NotNull
    private static final h a = i.b(a.d);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends l implements Function0<Boolean> {
        public static final a d = new a();

        a() {
            super(0);
        }

        @NotNull
        public final Boolean m0invoke() {
            return Boolean.valueOf(b.c() != null);
        }
    }

    public static final A9.a b() {
        Class<?> clsC = c();
        Object objNewInstance = clsC != null ? clsC.newInstance() : null;
        if (objNewInstance instanceof A9.a) {
            return (A9.a) objNewInstance;
        }
        return null;
    }

    public static final Class<?> c() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final boolean d() {
        return ((Boolean) a.getValue()).booleanValue();
    }
}
