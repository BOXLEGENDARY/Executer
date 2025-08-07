package x1;

import com.roblox.client.personasdk.R;
import ib.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx1/b;", "LAa/a;", "Lib/a;", "<init>", "()V", "", "expression", "data", "Lh;", "evaluator", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class C0864b implements Aa.a, ib.a {

    @NotNull
    public static final C0864b a = new C0864b();

    private C0864b() {
    }

    @Override
    public Object a(Object expression, Object data, @NotNull defpackage.h evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listC = jb.a.c(expression);
        List<Object> listE = a.e(listC, data, evaluator);
        Map<String, ? extends Object> mapA = jb.c.a(listC);
        if (mapA == null || listE == null) {
            return null;
        }
        for (Object obj : listE) {
            if (Intrinsics.b(evaluator.a(mapA, obj), Boolean.TRUE)) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public List<Object> e(@NotNull List<? extends Object> list, Object obj, @NotNull defpackage.h hVar) {
        return a.C0235a.a(this, list, obj, hVar);
    }
}
