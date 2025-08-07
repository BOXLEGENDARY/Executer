package Ka;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKa/c;", "", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static Double a(@NotNull c cVar, Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
            List listJ;
            Intrinsics.checkNotNullParameter(function1, "operation");
            List<Double> listB = obj != null ? jb.a.b(obj) : null;
            List listJ2 = listB != null ? CollectionsKt.J(listB) : null;
            if (!Intrinsics.b(listJ2 != null ? Integer.valueOf(listJ2.size()) : null, listB != null ? Integer.valueOf(listB.size()) : null) || listB == null || (listJ = CollectionsKt.J(listB)) == null) {
                return null;
            }
            return (Double) function1.invoke(listJ);
        }
    }
}
