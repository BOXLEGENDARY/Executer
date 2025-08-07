package Ia;

import Ha.InterfaceC0347b;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LIa/c;", "LHa/b;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface c extends InterfaceC0347b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static boolean a(@NotNull c cVar, Object obj, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            Intrinsics.checkNotNullParameter(function2, "operator");
            List<Object> listC = jb.a.c(obj);
            if (listC.size() == 1) {
                return false;
            }
            List<Object> list = listC;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.a(it.next()));
            }
            return cVar.b(arrayList, function2);
        }

        public static boolean b(@NotNull c cVar, List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            Intrinsics.checkNotNullParameter(function2, "operator");
            return InterfaceC0347b.a.b(cVar, list, function2);
        }

        public static List<Comparable<?>> c(@NotNull c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return cVar.g(comparable, comparable2);
        }

        public static List<Comparable<?>> d(@NotNull c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return InterfaceC0347b.a.d(cVar, comparable, comparable2);
        }

        public static Object e(@NotNull c cVar, Object obj) {
            return InterfaceC0347b.a.e(cVar, obj);
        }

        public static Object f(@NotNull c cVar, Object obj) {
            Number number = obj instanceof Number ? (Number) obj : null;
            return number != null ? Double.valueOf(number.doubleValue()) : obj;
        }

        public static Boolean g(@NotNull c cVar, Object obj) {
            return InterfaceC0347b.a.g(cVar, obj);
        }
    }

    Object a(Object wrappedValue);
}
