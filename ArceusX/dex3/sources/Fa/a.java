package Fa;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LFa/a;", "", "", "isFetchWholeDataValue", "(Ljava/lang/Object;)Z", "", "unwrapNested", "(Ljava/util/List;)Ljava/lang/Object;", "unwrapNestedValue", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0023a {
        private static boolean a(a aVar, Object obj) {
            return CollectionsKt.m(new Object[]{null, "", CollectionsKt.j()}).contains(obj);
        }

        public static List<String> b(@NotNull a aVar, Object obj) {
            String string;
            if (obj instanceof List) {
                obj = d(aVar, (List) obj);
            }
            List<String> listSplit$default = null;
            if (obj instanceof List) {
                return null;
            }
            if (obj != null && (string = obj.toString()) != null) {
                listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 0, 6, (Object) null);
            }
            return listSplit$default == null ? CollectionsKt.j() : listSplit$default;
        }

        private static Object c(a aVar, List<?> list) {
            Object objD;
            return (list.size() <= 1 && (objD = d(aVar, list)) != null) ? objD : list;
        }

        private static Object d(a aVar, List<?> list) {
            Object objFirstOrNull = CollectionsKt.firstOrNull(list);
            if (objFirstOrNull instanceof List) {
                return c(aVar, (List) objFirstOrNull);
            }
            if (a(aVar, objFirstOrNull)) {
                return null;
            }
            return objFirstOrNull;
        }
    }
}
