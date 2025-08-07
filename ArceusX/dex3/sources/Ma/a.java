package Ma;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"LMa/a;", "", "value", "", "unwrap", "(Ljava/lang/Object;)D", "", "(Ljava/util/List;)D", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0039a {
        private static Double a(a aVar, Object obj) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                return StringsKt.i((String) obj);
            }
            if (obj instanceof List) {
                return b(aVar, (List) obj);
            }
            if (obj instanceof Boolean) {
                return Double.valueOf(jb.b.a(((Boolean) obj).booleanValue()));
            }
            if (obj == null) {
                return Double.valueOf(0.0d);
            }
            return null;
        }

        private static Double b(a aVar, List<?> list) {
            int size = list.size();
            if (size == 0) {
                return Double.valueOf(0.0d);
            }
            if (size != 1) {
                return null;
            }
            return a(aVar, CollectionsKt.M(list));
        }

        @NotNull
        public static List<Double> c(@NotNull a aVar, Object obj) {
            List<Object> listC = jb.a.c(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(a(aVar, it.next()));
            }
            return arrayList;
        }
    }
}
