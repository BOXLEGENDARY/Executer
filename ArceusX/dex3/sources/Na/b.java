package Na;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u0003*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"LNa/b;", "", "value", "", "stringify", "(Ljava/lang/Object;)Ljava/lang/String;", "", "flattenNestedLists", "(Ljava/lang/Object;)Ljava/util/List;", "formatAsString", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static List<String> a(b bVar, Object obj) {
            List list = obj instanceof List ? (List) obj : null;
            if (list == null) {
                return CollectionsKt.d(b(bVar, obj));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.y(arrayList, a(bVar, it.next()));
            }
            return arrayList;
        }

        private static String b(b bVar, Object obj) {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.intValue()) {
                    return String.valueOf(number.intValue());
                }
            }
            return jb.a.h(obj);
        }

        private static String c(b bVar, Object obj) {
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CollectionsKt.y(arrayList, a(bVar, it.next()));
                }
                String strU = CollectionsKt.U(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                if (strU != null) {
                    return strU;
                }
            }
            return b(bVar, obj);
        }

        @NotNull
        public static List<String> d(@NotNull b bVar, Object obj) {
            List<Object> listC = jb.a.c(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(c(bVar, it.next()));
            }
            return arrayList;
        }
    }
}
