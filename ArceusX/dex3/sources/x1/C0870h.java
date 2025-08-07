package x1;

import P9.m;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.AbstractC0871i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lx1/h;", "LAa/b;", "<init>", "()V", "", "Lx1/i;", "c", "(Ljava/lang/String;)Lx1/i;", "", "", "sortingMode", "b", "(Ljava/util/List;Lx1/i;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", "a", "(Lx1/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class C0870h implements Aa.b {

    @NotNull
    public static final C0870h a = new C0870h();

    private C0870h() {
    }

    private final Object a(AbstractC0871i sortingMode, Function0<? extends Object> ascSort, Function0<? extends Object> descSort) throws m {
        if (Intrinsics.b(sortingMode, AbstractC0871i.b.a)) {
            return descSort.invoke();
        }
        if (Intrinsics.b(sortingMode, AbstractC0871i.a.a)) {
            return ascSort.invoke();
        }
        if (Intrinsics.b(sortingMode, AbstractC0871i.c.a)) {
            return null;
        }
        throw new m();
    }

    private final Object b(List<? extends Object> list, AbstractC0871i abstractC0871i) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        if (Intrinsics.b(numValueOf, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(abstractC0871i, new C0868f(list), new C0869g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Boolean) {
                    arrayList2.add(obj2);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList2.size());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.b(numValueOf2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(abstractC0871i, new C0868f(list), new C0869g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Number) {
                    arrayList3.add(obj3);
                }
            }
            numValueOf3 = Integer.valueOf(arrayList3.size());
        } else {
            numValueOf3 = null;
        }
        if (!Intrinsics.b(numValueOf3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        List listJ = CollectionsKt.J(jb.a.b(list));
        return a(abstractC0871i, new C0868f(listJ), new C0869g(listJ));
    }

    private final AbstractC0871i c(String str) {
        return Intrinsics.b(str, "desc") ? AbstractC0871i.b.a : Intrinsics.b(str, "asc") ? AbstractC0871i.a.a : AbstractC0871i.c.a;
    }

    @Override
    public Object e(Object expression, Object data) {
        List<Object> listC = jb.a.c(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull(listC);
        List<? extends Object> list = objFirstOrNull instanceof List ? (List) objFirstOrNull : null;
        if (list == null) {
            return null;
        }
        C0870h c0870h = a;
        Object objB = jb.c.b(listC);
        return c0870h.b(list, c0870h.c(objB instanceof String ? (String) objB : null));
    }
}
