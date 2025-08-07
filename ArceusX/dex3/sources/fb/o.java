package fb;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfb/o;", "", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface o {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static String a(@NotNull o oVar, Object obj) {
            List<Object> listC = jb.a.c(obj);
            if (listC.size() > 1) {
                return null;
            }
            Object objFirstOrNull = CollectionsKt.firstOrNull(listC);
            if (objFirstOrNull instanceof String) {
                return (String) objFirstOrNull;
            }
            return null;
        }
    }
}
