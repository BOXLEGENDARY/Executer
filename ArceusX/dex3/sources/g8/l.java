package g8;

import com.roblox.client.personasdk.R;
import ka.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u00020\u0007\"\u001a\b\u0000\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0004\b\u0003\u0010\u0004*\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf8/q;", "W", "I", "O", "R", "", "key", "Lg8/k;", "a", "(Lf8/q;Ljava/lang/String;)Lg8/k;", "wf1-workflow-runtime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class l {
    @NotNull
    public static final <W extends q<? super I, ? extends O, ? extends R>, I, O, R> WorkflowNodeId a(@NotNull W w, @NotNull String str) {
        Intrinsics.checkNotNullParameter(w, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        return new WorkflowNodeId(w, str);
    }

    public static WorkflowNodeId b(q qVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return a(qVar, str);
    }
}
