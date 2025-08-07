package g8;

import com.roblox.client.personasdk.R;
import java.util.List;
import ka.C0567e;
import ka.t;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lf8/t;", "a", "(Ljava/util/List;)Lf8/t;", "wf1-workflow-runtime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0578c {
    @NotNull
    public static final t a(@NotNull List<? extends t> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.isEmpty() ? C0567e.a : list.size() == 1 ? (t) CollectionsKt.i0(list) : new C0577b(list);
    }
}
