package fb;

import P9.o;
import com.roblox.client.personasdk.R;
import fb.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfb/i;", "LAa/b;", "Lfb/o;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class i implements Aa.b, o {

    @NotNull
    public static final i a = new i();

    private i() {
    }

    @Override
    public Object e(Object expression, Object data) {
        Object objB;
        List<Object> listC = jb.a.c(expression);
        try {
            o.a aVar = P9.o.e;
            Object obj = listC.get(0);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = listC.get(1);
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = listC.get(2);
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
            ReplaceData replaceData = new ReplaceData((String) obj, (String) obj2, (String) obj3);
            k.Companion companion = k.INSTANCE;
            Object obj4 = listC.get(3);
            Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.String");
            objB = P9.o.b(companion.a((String) obj4, replaceData).invoke());
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        if (P9.o.e(objB) == null) {
            return objB;
        }
        return null;
    }
}
