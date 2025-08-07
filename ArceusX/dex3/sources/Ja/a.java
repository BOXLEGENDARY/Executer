package Ja;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LJa/a;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "unwrapList", "(Ljava/util/List;)Ljava/lang/Object;", "unwrapNotBooleanSingleElement", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0028a {
        private static Object a(a aVar, List<?> list) {
            return jb.a.g(list) ? Double.valueOf(0.0d) : list.isEmpty() ? "" : b(aVar, list);
        }

        private static Object b(a aVar, List<?> list) {
            if (((list.size() != 1 || (CollectionsKt.firstOrNull(list) instanceof Boolean)) ? null : list) != null) {
                return aVar.a(CollectionsKt.firstOrNull(list));
            }
            return null;
        }

        public static Object c(@NotNull a aVar, Object obj) {
            Object objA;
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                objA = StringsKt.i((String) obj);
                if (objA == null) {
                    return obj;
                }
            } else {
                if (!(obj instanceof List)) {
                    return obj instanceof Boolean ? Double.valueOf(jb.b.a(((Boolean) obj).booleanValue())) : obj;
                }
                objA = a(aVar, (List) obj);
                if (objA == null) {
                    return obj;
                }
            }
            return objA;
        }
    }

    Object a(Object wrappedValue);
}
