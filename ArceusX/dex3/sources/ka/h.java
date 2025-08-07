package Ka;

import Ma.a;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKa/h;", "LAa/b;", "LMa/a;", "<init>", "()V", "", "first", "second", "b", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "", "expression", "data", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class h implements Aa.b, Ma.a {

    @NotNull
    public static final h a = new h();

    private h() {
    }

    private final Double b(Double first, Double second) {
        if (first == null || second == null) {
            return null;
        }
        return Double.valueOf(first.doubleValue() - second.doubleValue());
    }

    @Override
    public Double e(Object expression, Object data) {
        List<Double> listC = c(expression);
        int size = listC.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            return a.b((Double) CollectionsKt.M(listC), listC.get(1));
        }
        Double d = (Double) CollectionsKt.M(listC);
        if (d != null) {
            return Double.valueOf(-d.doubleValue());
        }
        return null;
    }

    @NotNull
    public List<Double> c(Object obj) {
        return a.C0039a.c(this, obj);
    }
}
