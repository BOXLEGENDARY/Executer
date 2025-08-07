package V8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "LV8/l;", "a", "(Ljava/lang/Throwable;)LV8/l;", "selfie_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class m {
    @NotNull
    public static final l a(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof G.b ? l.d : th instanceof G.c ? l.e : th instanceof G.d ? l.i : th instanceof G.f ? l.v : th instanceof G.g ? l.y : th instanceof G.e ? l.z : th instanceof G.a ? l.A : l.B;
    }
}
