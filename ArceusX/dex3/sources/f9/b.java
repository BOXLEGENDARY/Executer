package F9;

import P9.o;
import P9.p;
import com.roblox.client.personasdk.R;
import java.util.List;
import jb.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF9/b;", "", "", "formattedArgument", "Lkotlin/Function2;", "", "formatFloatingPoint", "formatAsFloatingDecimal", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        private static String a(b bVar, String str, String str2, Function2<? super String, ? super Double, String> function2) {
            Double dI;
            if (!new Regex("%[\\d|.]*[f]").d(str) || (dI = StringsKt.i(str2)) == null) {
                return null;
            }
            return (String) function2.invoke(str, Double.valueOf(dI.doubleValue()));
        }

        public static String b(@NotNull b bVar, Object obj, Object obj2, @NotNull Function2<? super String, ? super Double, String> function2) {
            Object objB;
            Intrinsics.checkNotNullParameter(function2, "formatFloatingPoint");
            List<Object> listC = jb.a.c(obj);
            String strValueOf = String.valueOf(CollectionsKt.firstOrNull(listC));
            String strValueOf2 = String.valueOf(c.b(listC));
            try {
                o.a aVar = o.e;
                objB = o.b(a(bVar, strValueOf, strValueOf2, function2));
            } catch (Throwable th) {
                o.a aVar2 = o.e;
                objB = o.b(p.a(th));
            }
            if (o.e(objB) == null) {
                return (String) objB;
            }
            return null;
        }
    }
}
