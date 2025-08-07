package Ja;

import com.roblox.client.personasdk.R;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJa/d;", "", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        public static boolean a(@NotNull d dVar, Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                if (((Number) obj).doubleValue() == 0.0d) {
                    return false;
                }
            } else if (obj instanceof String) {
                if (((CharSequence) obj).length() <= 0 || Intrinsics.b(obj, "[]") || Intrinsics.b(obj, "null")) {
                    return false;
                }
            } else if (obj instanceof Collection) {
                if (((Collection) obj).isEmpty()) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && ((Object[]) obj).length == 0) {
                return false;
            }
            return true;
        }
    }
}
