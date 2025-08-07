package defpackage;

import P9.o;
import P9.p;
import com.roblox.client.personasdk.R;
import defpackage.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0000\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0000\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0000\u0010\u0013¨\u0006\u0014"}, d2 = {"La;", "Le;", "Lh;", "evaluator", "<init>", "(Lh;)V", "", "", "", "expression", "data", "Lg;", "b", "(Ljava/util/Map;Ljava/lang/Object;)Lg;", "evaluatedValue", "c", "(Ljava/lang/Object;)Lg;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lh;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a implements e {

    @NotNull
    private final h evaluator;

    public a(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "evaluator");
        this.evaluator = hVar;
    }

    private final g b(Map<String, ? extends Object> expression, Object data) {
        Object objB;
        try {
            o.a aVar = o.e;
            objB = o.b(this.evaluator.a(expression, data));
        } catch (Throwable th) {
            o.a aVar2 = o.e;
            objB = o.b(p.a(th));
        }
        return o.e(objB) == null ? c(objB) : g.a.b.a;
    }

    private final g c(Object evaluatedValue) {
        return evaluatedValue != null ? new g.Success(d(evaluatedValue)) : g.a.c.a;
    }

    private final Object d(Object obj) {
        if (!(obj instanceof Double)) {
            return obj;
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue() % 1.0d;
        if (dDoubleValue != 0.0d && Math.signum(dDoubleValue) != Math.signum(1.0d)) {
            dDoubleValue += 1.0d;
        }
        return dDoubleValue == 0.0d ? Long.valueOf((long) number.doubleValue()) : obj;
    }

    @Override
    @NotNull
    public g a(@NotNull Map<String, ? extends Object> expression, Object data) {
        g gVarB;
        Intrinsics.checkNotNullParameter(expression, "expression");
        return ((!expression.isEmpty() ? expression : null) == null || (gVarB = b(expression, data)) == null) ? g.a.C0229a.a : gVarB;
    }
}
