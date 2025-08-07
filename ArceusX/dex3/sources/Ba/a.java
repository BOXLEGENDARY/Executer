package Ba;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LBa/a;", "", "wrappedValue", "", "c", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0008a {
        public static Boolean a(@NotNull a aVar, Object obj) {
            Double dI;
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
            if (!(obj instanceof String) || (dI = StringsKt.i((String) obj)) == null) {
                return null;
            }
            return Boolean.valueOf(((long) dI.doubleValue()) > 0);
        }
    }

    Boolean c(Object wrappedValue);
}
