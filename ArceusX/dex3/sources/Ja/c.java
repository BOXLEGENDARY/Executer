package Ja;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"LJa/c;", "", "value", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "normalizeNumberString", "unwrapSingleNestedValue", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static Object a(c cVar, Object obj) {
            String string;
            Object intOrNull;
            Object objI = null;
            String str = obj instanceof String ? (String) obj : null;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                objI = intOrNull;
            } else if (str != null) {
                objI = StringsKt.i(str);
            }
            return (objI == null || (string = objI.toString()) == null) ? obj : string;
        }

        private static Object b(c cVar, Object obj) {
            if (!(obj instanceof List)) {
                return obj;
            }
            List list = (List) obj;
            return list.size() == 1 ? b(cVar, CollectionsKt.firstOrNull(list)) : obj;
        }

        public static Object c(@NotNull c cVar, Object obj) {
            Object objB = b(cVar, obj);
            return !Intrinsics.b(objB, obj) ? new SingleNestedValue(a(cVar, objB)) : a(cVar, obj);
        }
    }

    Object d(Object value);
}
