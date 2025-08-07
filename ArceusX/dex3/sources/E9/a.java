package E9;

import com.roblox.client.personasdk.R;
import defpackage.f;
import defpackage.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LE9/a;", "Lh;", "LE9/b;", "operations", "<init>", "(LE9/b;)V", "", "logic", "data", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "LAa/b;", "operator", "d", "(Ljava/util/Map;Ljava/lang/Object;)LAa/b;", "expression", "a", "LE9/b;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a implements h {

    @NotNull
    private final LogicOperations operations;

    public a(@NotNull LogicOperations logicOperations) {
        Intrinsics.checkNotNullParameter(logicOperations, "operations");
        this.operations = logicOperations;
    }

    private final Object b(Object logic, Object data) {
        if (!(logic instanceof List)) {
            if (!(logic instanceof Map)) {
                return logic;
            }
            Map<?, ?> map = (Map) logic;
            return map.isEmpty() ? data : c(map, data);
        }
        Iterable iterable = (Iterable) logic;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), data));
        }
        return arrayList;
    }

    private final Object c(Map<?, ?> logic, Object data) throws f {
        Object objB;
        Object objN = CollectionsKt.N(logic.keySet());
        Object obj = logic.get(objN);
        if (CollectionsKt.F(this.operations.a().keySet(), objN)) {
            Aa.a aVar = this.operations.a().get(objN);
            if (aVar != null) {
                return aVar.a(obj, data, this);
            }
            return null;
        }
        Aa.b bVarD = d(this.operations.b(), objN);
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            objB = new ArrayList(CollectionsKt.t(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                objB.add(b(it.next(), data));
            }
        } else {
            objB = obj instanceof Map ? b(obj, data) : b(obj, data);
        }
        return bVarD.e(objB, data);
    }

    private final Aa.b d(Map<String, ? extends Aa.b> map, Object obj) throws f {
        Aa.b bVar = map.get(obj);
        if (bVar != null) {
            return bVar;
        }
        throw new f("Operation " + obj + " not found.");
    }

    @Override
    public Object a(@NotNull Map<String, ? extends Object> expression, Object data) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return b(expression, data);
    }
}
