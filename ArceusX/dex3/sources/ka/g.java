package Ka;

import Ka.c;
import Ma.b;
import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKa/g;", "LAa/b;", "LKa/c;", "LMa/b;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class g implements Aa.b, c, Ma.b {

    @NotNull
    public static final g a = new g();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "a", "(Ljava/util/List;)Ljava/lang/Double;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
    static final class a extends l implements Function1<List<? extends Double>, Double> {
        public static final a d = new a();

        a() {
            super(1);
        }

        public final Double invoke(@NotNull List<Double> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = Double.valueOf(((Number) next).doubleValue() * ((Number) it.next()).doubleValue());
            }
            return (Double) next;
        }
    }

    private g() {
    }

    public Double a(Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return c.a.a(this, obj, function1);
    }

    @NotNull
    public List<Object> b(Object obj) {
        return b.a.b(this, obj);
    }

    @Override
    public Object e(Object expression, Object data) {
        List<Object> listC = jb.a.c(expression);
        int size = listC.size();
        if (size != 0) {
            return size != 1 ? a(b(expression), a.d) : CollectionsKt.M(listC);
        }
        return null;
    }
}
