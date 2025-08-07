package Ca;

import Ca.a;
import P9.t;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\t\u0010\u0012J1\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LCa/g;", "LAa/a;", "LCa/a;", "<init>", "()V", "LCa/b;", "operationInput", "", "initialValue", "Lh;", "evaluator", "g", "(LCa/b;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "accumulator", "evaluatedValue", "", "", "mappingOperation", "(Lh;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "current", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "expression", "data", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class g implements Aa.a, a {

    @NotNull
    public static final g a = new g();

    private g() {
    }

    private final Object g(ArrayOperationInputData operationInput, Object initialValue, h evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            return initialValue;
        }
        Iterator<T> it = listB.iterator();
        Object objH = initialValue;
        while (it.hasNext()) {
            objH = a.h(evaluator, objH, it.next(), operationInput.a());
            if (objH == null) {
                return operationInput.getOperationDefault();
            }
        }
        return objH == null ? initialValue : objH;
    }

    private final Object h(h hVar, Object obj, Object obj2, Map<String, ? extends Object> map) {
        if (map != null) {
            return hVar.a(map, a.i(obj, obj2));
        }
        return null;
    }

    private final Map<String, Object> i(Object accumulator, Object current) {
        return F.k(new Pair[]{t.a("accumulator", accumulator), t.a("current", current)});
    }

    @Override
    public Object a(Object expression, Object data, @NotNull h evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listC = jb.a.c(expression);
        g gVar = a;
        return gVar.g(gVar.d(listC, data, evaluator), jb.c.c(listC), evaluator);
    }

    @Override
    public Object b(Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return a.C0016a.b(this, map, list);
    }

    @Override
    @NotNull
    public ArrayOperationInputData d(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return a.C0016a.a(this, list, obj, hVar);
    }

    @Override
    public List<Object> e(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return a.C0016a.c(this, list, obj, hVar);
    }
}
