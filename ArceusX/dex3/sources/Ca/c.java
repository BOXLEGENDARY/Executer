package Ca;

import Ca.f;
import Ja.d;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\b\u0010\fJ=\u0010\u0013\u001a\u00020\u0012*\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LCa/c;", "LAa/a;", "LCa/f;", "LJa/d;", "<init>", "()V", "LCa/b;", "operationInput", "Lh;", "evaluator", "", "", "(LCa/b;Lh;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", "", "i", "(Lh;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Z", "expression", "data", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class c implements Aa.a, f, Ja.d {

    @NotNull
    public static final c a = new c();

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    class a extends j implements Function2<ArrayOperationInputData, h, List<? extends Object>> {
        a(Object obj) {
            super(2, obj, c.class, "filterOrEmptyList", "filterOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @NotNull
        public final List<Object> invoke(@NotNull ArrayOperationInputData arrayOperationInputData, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(arrayOperationInputData, "p0");
            Intrinsics.checkNotNullParameter(hVar, "p1");
            return ((c) ((kotlin.jvm.internal.d) this).receiver).h(arrayOperationInputData, hVar);
        }
    }

    private c() {
    }

    public final List<Object> h(ArrayOperationInputData operationInput, h evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = CollectionsKt.j();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (a.i(evaluator, obj, operationInput.a(), operationInput.getOperationDefault())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean i(h hVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        if (map != null && (objA = hVar.a(map, obj)) != null) {
            obj2 = objA;
        }
        return j(obj2);
    }

    @Override
    public Object a(Object expression, Object data, @NotNull h evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return c(expression, data, evaluator, new a(this));
    }

    @Override
    public Object b(Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return f.a.b(this, map, list);
    }

    @Override
    public Object c(Object obj, Object obj2, @NotNull h hVar, @NotNull Function2<? super ArrayOperationInputData, ? super h, ? extends Object> function2) {
        return f.a.c(this, obj, obj2, hVar, function2);
    }

    @Override
    @NotNull
    public ArrayOperationInputData d(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return f.a.a(this, list, obj, hVar);
    }

    @Override
    public List<Object> e(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return f.a.d(this, list, obj, hVar);
    }

    public boolean j(Object obj) {
        return d.a.a(this, obj);
    }
}
