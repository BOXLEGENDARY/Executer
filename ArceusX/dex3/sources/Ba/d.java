package Ba;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LBa/d;", "LAa/b;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class d implements Aa.b {

    @NotNull
    public static final d a = new d();

    private d() {
    }

    @Override
    public Boolean e(Object expression, Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(jb.a.c(expression));
        Object objB = jb.c.b(jb.a.c(expression));
        return objB instanceof String ? Boolean.valueOf(StringsKt.K((CharSequence) objB, String.valueOf(objFirstOrNull), false, 2, (Object) null)) : objB instanceof List ? Boolean.valueOf(((List) objB).contains(objFirstOrNull)) : Boolean.FALSE;
    }
}
