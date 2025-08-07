package Ea;

import Fa.a;
import com.roblox.client.personasdk.R;
import java.util.List;
import java.util.Map;
import jb.d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u0004\u0018\u00010\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LEa/c;", "LAa/b;", "LFa/a;", "<init>", "()V", "", "", "", "expression", "data", "a", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "indexParts", "b", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "indexes", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class c implements Aa.b, Fa.a {

    @NotNull
    public static final c a = new c();

    private c() {
    }

    private final Object a(List<String> list, Object obj, Object obj2) {
        if (!list.isEmpty()) {
            obj2 = b(obj2, list);
        }
        if (!d(obj2, obj)) {
            return obj2;
        }
        List list2 = obj instanceof List ? (List) obj : null;
        if (list2 != null) {
            return jb.c.b(list2);
        }
        return null;
    }

    private final Object b(Object value, List<String> indexParts) {
        if (value instanceof List) {
            return indexParts.size() == 1 ? ((List) value).get(d.b((String) CollectionsKt.M(indexParts))) : c(indexParts, (List) value);
        }
        if (!(value instanceof Map)) {
            return value;
        }
        Object obj = ((Map) value).get(CollectionsKt.M(indexParts));
        for (String str : CollectionsKt.H(indexParts, 1)) {
            Map map = obj instanceof Map ? (Map) obj : null;
            obj = map != null ? map.get(str) : null;
        }
        return obj;
    }

    private final Object c(List<String> indexes, List<? extends Object> data) {
        String str = (String) CollectionsKt.firstOrNull(indexes);
        if (str == null) {
            return null;
        }
        Object objO = CollectionsKt.O(data, d.b(str));
        return objO instanceof List ? a.c(indexes.subList(1, indexes.size()), (List) objO) : CollectionsKt.O(data, d.b(str));
    }

    private final boolean d(Object value, Object expression) {
        return (Intrinsics.b(value, expression) || value == null) && (expression instanceof List) && ((List) expression).size() > 1;
    }

    @Override
    public Object e(Object expression, Object data) {
        List<String> listF = f(jb.a.c(expression));
        if (listF != null) {
            return a(listF, expression, data);
        }
        return null;
    }

    public List<String> f(Object obj) {
        return a.C0023a.b(this, obj);
    }
}
