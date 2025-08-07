package gb;

import P9.o;
import P9.p;
import com.roblox.client.personasdk.R;
import fb.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgb/c;", "LAa/b;", "Lfb/o;", "<init>", "()V", "", "", "Lra/e;", "b", "(Ljava/util/List;)Ljava/util/List;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lgb/b;", "Lgb/b;", "formatter", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class c implements Aa.b, o {

    @NotNull
    public static final c a = new c();

    @NotNull
    private static final b formatter = new b();

    private c() {
    }

    private final Integer a(List<e> list) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            objB = P9.o.b(Integer.valueOf(((e) CollectionsKt.M(list)).compareTo((e) CollectionsKt.W(list))));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(p.a(th));
        }
        if (!P9.o.h(objB)) {
            if (P9.o.g(objB)) {
                objB = null;
            }
            return (Integer) objB;
        }
        int iIntValue = ((Number) objB).intValue();
        if (iIntValue > 0) {
            return 1;
        }
        return iIntValue < 0 ? -1 : 0;
    }

    private final List<e> b(List<? extends Object> list) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            Object obj = list.get(2);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            a aVarValueOf = a.valueOf((String) obj);
            b bVar = formatter;
            Object obj2 = list.get(0);
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
            e eVarA = bVar.a((String) obj2, aVarValueOf);
            Object obj3 = list.get(1);
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = P9.o.b(CollectionsKt.m(new e[]{eVarA, bVar.a((String) obj3, aVarValueOf)}));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(p.a(th));
        }
        if (P9.o.g(objB)) {
            objB = null;
        }
        return (List) objB;
    }

    @Override
    public Object e(Object expression, Object data) {
        List<e> listB = b(jb.a.c(expression));
        if (listB != null) {
            return a(listB);
        }
        return null;
    }
}
