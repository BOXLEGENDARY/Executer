package Ba;

import Ba.b;
import com.roblox.client.personasdk.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ=\u0010\f\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\nJ-\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LBa/c;", "LBa/b;", "", "", "values", "Lkotlin/Function2;", "", "", "operator", "b", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "", "compare", "first", "second", "compareOrNull", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface c extends b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static boolean a(c cVar, List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
            Integer numC = c(cVar, (Comparable) CollectionsKt.firstOrNull(list), (Comparable) jb.c.b(list));
            if (numC != null) {
                return ((Boolean) function2.invoke(Integer.valueOf(numC.intValue()), 0)).booleanValue();
            }
            return false;
        }

        public static boolean b(@NotNull c cVar, List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            List<Comparable<?>> listD;
            Intrinsics.checkNotNullParameter(function2, "operator");
            if (list == null || (listD = jb.a.d(list)) == null) {
                return false;
            }
            return a(cVar, listD, function2);
        }

        private static Integer c(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            List<Comparable<?>> listF = cVar.f(comparable, comparable2);
            if (listF == null) {
                return null;
            }
            List<Comparable<?>> list = listF;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Comparable) it.next()) != null) {
                        if (!z || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((Comparable) it2.next()) == null) {
                                    return null;
                                }
                            }
                        }
                        return Integer.valueOf(R9.a.a((Comparable) CollectionsKt.firstOrNull(listF), (Comparable) jb.c.b(listF)));
                    }
                }
            }
            return Integer.valueOf(R9.a.a((Comparable) CollectionsKt.firstOrNull(listF), (Comparable) jb.c.b(listF)));
        }

        public static List<Comparable<?>> d(@NotNull c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return b.a.a(cVar, comparable, comparable2);
        }

        public static List<Comparable<?>> e(@NotNull c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return b.a.b(cVar, comparable, comparable2);
        }

        public static Boolean f(@NotNull c cVar, Object obj) {
            return b.a.c(cVar, obj);
        }
    }

    boolean b(List<? extends Object> values, @NotNull Function2<? super Integer, ? super Integer, Boolean> operator);
}
