package Ma;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0082\u0010¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMa/b;", "", "value", "unwrap", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static Object a(b bVar, Object obj) {
            while (!(obj instanceof Number)) {
                if (obj instanceof String) {
                    return StringsKt.i((String) obj);
                }
                if (!(obj instanceof List)) {
                    return null;
                }
                obj = CollectionsKt.firstOrNull((List) obj);
            }
            return Double.valueOf(((Number) obj).doubleValue());
        }

        @NotNull
        public static List<Object> b(@NotNull b bVar, Object obj) {
            List<Object> listC = jb.a.c(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(a(bVar, it.next()));
            }
            return arrayList;
        }
    }
}
