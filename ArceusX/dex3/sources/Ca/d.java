package Ca;

import Ca.f;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ?\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LCa/d;", "LAa/a;", "LCa/f;", "<init>", "()V", "LCa/b;", "operationInput", "Lh;", "evaluator", "", "", "(LCa/b;Lh;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", "i", "(Lh;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "expression", "data", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class d implements Aa.a, f {

    @NotNull
    public static final d a = new d();

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    class a extends j implements Function2<ArrayOperationInputData, h, List<? extends Object>> {
        a(Object obj) {
            super(2, obj, d.class, "mapOrEmptyList", "mapOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @NotNull
        public final List<Object> invoke(@NotNull ArrayOperationInputData arrayOperationInputData, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(arrayOperationInputData, "p0");
            Intrinsics.checkNotNullParameter(hVar, "p1");
            return ((d) ((kotlin.jvm.internal.d) this).receiver).h(arrayOperationInputData, hVar);
        }
    }

    private d() {
    }

    public final List<Object> h(ArrayOperationInputData operationInput, h evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = CollectionsKt.j();
        }
        List<Object> list = listB;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.i(evaluator, it.next(), operationInput.a(), operationInput.getOperationDefault()));
        }
        return arrayList;
    }

    private final Object i(h hVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        return (map == null || (objA = hVar.a(map, obj)) == null) ? obj2 : objA;
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
}
