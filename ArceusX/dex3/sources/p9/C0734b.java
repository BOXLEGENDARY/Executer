package p9;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lp9/b;", "", "<init>", "()V", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "b", "(Lkotlin/jvm/functions/Function0;)V", "submitCode", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0734b {

    @NotNull
    private Function0<Unit> submitCode = a.d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends l implements Function0<Unit> {
        public static final a d = new a();

        a() {
            super(0);
        }

        public Object invoke() {
            m687invoke();
            return Unit.a;
        }

        public final void m687invoke() {
        }
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.submitCode;
    }

    public final void b(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.submitCode = function0;
    }
}
