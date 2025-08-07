package La;

import Ba.c;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\b\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LLa/e;", "LBa/c;", "", "", "Lkotlin/Function2;", "", "", "operator", "between", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface e extends Ba.c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static boolean a(e eVar, List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
            return eVar.b(CollectionsKt.m(new Comparable[]{(Comparable) CollectionsKt.firstOrNull(list), (Comparable) jb.c.b(list)}), function2) && eVar.b(CollectionsKt.m(new Comparable[]{(Comparable) jb.c.b(list), (Comparable) jb.c.c(list)}), function2);
        }

        public static boolean b(@NotNull e eVar, List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            Intrinsics.checkNotNullParameter(function2, "operator");
            return c.a.b(eVar, list, function2);
        }

        public static boolean c(@NotNull e eVar, List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            List<Comparable<?>> listD;
            Intrinsics.checkNotNullParameter(function2, "operator");
            if (list == null || (listD = jb.a.d(list)) == null) {
                return false;
            }
            if (listD.size() == 2) {
                return eVar.b(listD, function2);
            }
            if (listD.size() > 2) {
                return a(eVar, listD, function2);
            }
            return false;
        }

        public static List<Comparable<?>> d(@NotNull e eVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return c.a.d(eVar, comparable, comparable2);
        }

        public static List<Comparable<?>> e(@NotNull e eVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return c.a.e(eVar, comparable, comparable2);
        }

        public static Boolean f(@NotNull e eVar, Object obj) {
            return c.a.f(eVar, obj);
        }
    }
}
