package Ca;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LCa/e;", "LAa/b;", "<init>", "()V", "", "", "a", "(Ljava/util/List;)Ljava/util/List;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class e implements Aa.b {

    @NotNull
    public static final e a = new e();

    private e() {
    }

    private final List<Object> a(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CollectionsKt.y(arrayList, obj instanceof List ? (List) obj : CollectionsKt.d(obj));
        }
        return arrayList;
    }

    @Override
    @NotNull
    public Object e(Object expression, Object data) {
        return a(jb.a.c(expression));
    }
}
