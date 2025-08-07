package Ba;

import Ba.a;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LBa/b;", "LBa/a;", "", "first", "second", "", "f", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "g", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface b extends Ba.a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static List<Comparable<?>> a(@NotNull b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            boolean z = comparable instanceof Number;
            return (z && (comparable2 instanceof Number)) ? CollectionsKt.m(new Double[]{Double.valueOf(((Number) comparable).doubleValue()), Double.valueOf(((Number) comparable2).doubleValue())}) : ((comparable instanceof String) && (comparable2 instanceof Number)) ? CollectionsKt.m(new Double[]{StringsKt.i((String) comparable), Double.valueOf(((Number) comparable2).doubleValue())}) : (z && (comparable2 instanceof String)) ? CollectionsKt.m(new Double[]{Double.valueOf(((Number) comparable).doubleValue()), StringsKt.i((String) comparable2)}) : ((comparable instanceof Boolean) || (comparable2 instanceof Boolean)) ? CollectionsKt.m(new Boolean[]{bVar.c(comparable), bVar.c(comparable2)}) : bVar.g(comparable, comparable2);
        }

        public static List<Comparable<?>> b(@NotNull b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            if (comparable != 0 && comparable2 != 0 && comparable.getClass() == comparable2.getClass()) {
                return CollectionsKt.m(new Comparable[]{comparable, comparable2});
            }
            if (comparable == 0 && comparable2 == 0) {
                return CollectionsKt.m(new Void[]{(Void) comparable, (Void) comparable2});
            }
            return null;
        }

        public static Boolean c(@NotNull b bVar, Object obj) {
            return a.C0008a.a(bVar, obj);
        }
    }

    List<Comparable<?>> f(Comparable<?> first, Comparable<?> second);

    List<Comparable<?>> g(Comparable<?> first, Comparable<?> second);
}
