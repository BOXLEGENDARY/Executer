package ka;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"!\u0010\b\u001a\u00020\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfa/m;", "type", "Lf8/s;", "b", "(Lfa/m;)Lf8/s;", "Lf8/q;", "a", "(Lf8/q;)Lf8/s;", "identifier", "wf1-workflow-core"}, k = 5, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final class m {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    class a extends j implements Function0<String> {
        a(Object obj) {
            super(0, obj, InterfaceC0565c.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
        }

        public final String invoke() {
            return ((InterfaceC0565c) ((d) this).receiver).b();
        }
    }

    @NotNull
    public static final s a(@NotNull q<?, ?, ?> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        InterfaceC0565c interfaceC0565c = qVar instanceof InterfaceC0565c ? (InterfaceC0565c) qVar : null;
        return new s(z.b(qVar.getClass()), interfaceC0565c == null ? null : interfaceC0565c.c(), interfaceC0565c != null ? new a(interfaceC0565c) : null);
    }

    @NotNull
    public static final s b(@NotNull fa.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "type");
        return new s(mVar, null, null, 6, null);
    }
}
