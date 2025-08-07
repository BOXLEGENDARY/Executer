package x1;

import P9.o;
import P9.p;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx1/c;", "LAa/b;", "<init>", "()V", "", "", "Lx1/d;", "c", "(Ljava/util/List;)Lx1/d;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "", "b", "(Lx1/d;)Ljava/lang/String;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class C0865c implements Aa.b {

    @NotNull
    public static final C0865c a = new C0865c();

    private C0865c() {
    }

    private final Integer a(List<? extends Object> list) {
        Object obj = list.get(4);
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj;
        if (number.doubleValue() != number.intValue()) {
            number = null;
        }
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    private final String b(JoinToStringArguments joinToStringArguments) {
        return CollectionsKt.U(joinToStringArguments.a(), joinToStringArguments.getSeparator(), joinToStringArguments.getPrefix(), joinToStringArguments.getPostfix(), joinToStringArguments.getLimit(), joinToStringArguments.getTruncated(), (Function1) null, 32, (Object) null);
    }

    private final JoinToStringArguments c(List<? extends Object> list) {
        Object objB;
        JoinToStringArguments joinToStringArguments;
        try {
            o.a aVar = o.e;
            Integer numA = a.a(list);
            if (numA != null) {
                int iIntValue = numA.intValue();
                List<Object> listC = jb.a.c(list.get(0));
                Object obj = list.get(1);
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = list.get(2);
                Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                Object obj3 = list.get(3);
                Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = list.get(5);
                Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.String");
                joinToStringArguments = new JoinToStringArguments(listC, str, str2, (String) obj3, iIntValue, (String) obj4);
            } else {
                joinToStringArguments = null;
            }
            objB = o.b(joinToStringArguments);
        } catch (Throwable th) {
            o.a aVar2 = o.e;
            objB = o.b(p.a(th));
        }
        if (o.e(objB) == null) {
            return (JoinToStringArguments) objB;
        }
        return null;
    }

    @Override
    public Object e(Object expression, Object data) {
        JoinToStringArguments joinToStringArgumentsC = c(jb.a.c(expression));
        if (joinToStringArgumentsC != null) {
            return b(joinToStringArgumentsC);
        }
        return null;
    }
}
