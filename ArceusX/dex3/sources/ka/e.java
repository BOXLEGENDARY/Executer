package Ka;

import Ka.c;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKa/e;", "LAa/b;", "LKa/c;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class e implements Aa.b, c {

    @NotNull
    public static final e a = new e();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "a", "(Ljava/util/List;)Ljava/lang/Double;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
    static final class a extends l implements Function1<List<? extends Double>, Double> {
        public static final a d = new a();

        a() {
            super(1);
        }

        public final Double invoke(@NotNull List<Double> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return CollectionsKt.b0(list);
        }
    }

    private e() {
    }

    public Double a(Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return c.a.a(this, obj, function1);
    }

    @Override
    public Object e(Object expression, Object data) {
        return a(expression, a.d);
    }
}
