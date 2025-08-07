package Ha;

import Ba.c;
import Ja.a;
import Ja.c;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"LHa/b;", "LBa/c;", "LJa/a;", "LJa/c;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface InterfaceC0347b extends Ba.c, Ja.a, Ja.c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static boolean a(@NotNull InterfaceC0347b interfaceC0347b, Object obj, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            Intrinsics.checkNotNullParameter(function2, "operator");
            List<Object> listC = jb.a.c(obj);
            Object objD = interfaceC0347b.d(CollectionsKt.firstOrNull(listC));
            Object objD2 = interfaceC0347b.d(jb.c.b(listC));
            C0348c c0348c = C0348c.a;
            List<Object> listA = c0348c.a(objD);
            List<Object> listA2 = c0348c.a(objD2);
            if (listA != null || listA2 != null) {
                if (!(listA != null ? listA.contains(objD2) : false)) {
                    if (!(listA2 != null ? listA2.contains(objD) : false)) {
                        return false;
                    }
                }
                return true;
            }
            List<Object> list = listC;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC0347b.a(it.next()));
            }
            return interfaceC0347b.b(arrayList, function2);
        }

        public static boolean b(@NotNull InterfaceC0347b interfaceC0347b, List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
            Intrinsics.checkNotNullParameter(function2, "operator");
            return c.a.b(interfaceC0347b, list, function2);
        }

        public static List<Comparable<?>> c(@NotNull InterfaceC0347b interfaceC0347b, Comparable<?> comparable, Comparable<?> comparable2) {
            return c.a.d(interfaceC0347b, comparable, comparable2);
        }

        public static List<Comparable<?>> d(@NotNull InterfaceC0347b interfaceC0347b, Comparable<?> comparable, Comparable<?> comparable2) {
            return c.a.e(interfaceC0347b, comparable, comparable2);
        }

        public static Object e(@NotNull InterfaceC0347b interfaceC0347b, Object obj) {
            return c.a.c(interfaceC0347b, obj);
        }

        public static Object f(@NotNull InterfaceC0347b interfaceC0347b, Object obj) {
            return a.C0028a.c(interfaceC0347b, obj);
        }

        public static Boolean g(@NotNull InterfaceC0347b interfaceC0347b, Object obj) {
            return c.a.f(interfaceC0347b, obj);
        }
    }
}
