package Ka;

import Ma.a;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKa/b;", "LAa/b;", "LMa/a;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class b implements Aa.b, Ma.a {

    @NotNull
    public static final b a = new b();

    private b() {
    }

    @Override
    public Double e(Object expression, Object data) {
        List<Double> listB = b(expression);
        if (listB.size() < 2) {
            listB = null;
        }
        if (listB == null) {
            return null;
        }
        Double d = listB.get(1);
        Double d2 = (Double) CollectionsKt.M(listB);
        if (d2 == null || d == null || Intrinsics.a(d, 0.0d)) {
            return null;
        }
        return Double.valueOf(d2.doubleValue() / d.doubleValue());
    }

    @NotNull
    public List<Double> b(Object obj) {
        return a.C0039a.c(this, obj);
    }
}
