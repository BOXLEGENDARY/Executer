package fb;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfb/p;", "LAa/b;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class p implements Aa.b {

    @NotNull
    public static final p a = new p();

    private p() {
    }

    @Override
    public Object e(Object expression, Object data) {
        List listSplit$default;
        List listH;
        Object objFirstOrNull = CollectionsKt.firstOrNull(jb.a.c(expression));
        String str = objFirstOrNull instanceof String ? (String) objFirstOrNull : null;
        if (str == null || (listSplit$default = StringsKt.split$default(str, new String[]{""}, false, 0, 6, (Object) null)) == null || (listH = CollectionsKt.H(listSplit$default, 1)) == null) {
            return null;
        }
        return CollectionsKt.I(listH, 1);
    }
}
