package fb;

import P9.o;
import com.roblox.client.personasdk.R;
import fb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfb/q;", "LAa/b;", "Lfb/o;", "<init>", "()V", "", "", "Lfb/r;", "b", "(Ljava/util/List;)Lfb/r;", "", "Lfb/s;", "c", "(Ljava/lang/String;)Lfb/s;", "a", "(Lfb/r;)Ljava/lang/String;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class q implements Aa.b, o {

    @NotNull
    public static final q a = new q();

    private q() {
    }

    private final String a(TrimArguments trimArguments) throws P9.m {
        s mode = trimArguments.getMode();
        if (Intrinsics.b(mode, s.c.a)) {
            return StringsKt.T0(trimArguments.getText(), new char[]{trimArguments.getChar()});
        }
        if (Intrinsics.b(mode, s.b.a)) {
            return StringsKt.S0(trimArguments.getText(), new char[]{trimArguments.getChar()});
        }
        if (Intrinsics.b(mode, s.a.a)) {
            return StringsKt.R0(trimArguments.getText(), new char[]{trimArguments.getChar()});
        }
        throw new P9.m();
    }

    private final TrimArguments b(List<? extends Object> list) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            Object obj = list.get(0);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
            char cA1 = StringsKt.a1((String) obj2);
            q qVar = a;
            Object obj3 = list.get(2);
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = P9.o.b(new TrimArguments((String) obj, cA1, qVar.c((String) obj3)));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        if (P9.o.e(objB) == null) {
            return (TrimArguments) objB;
        }
        return null;
    }

    private final s c(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 100571) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 2144573977 && str.equals("bothEnds")) {
                        return s.a.a;
                    }
                } else if (str.equals("start")) {
                    return s.c.a;
                }
            } else if (str.equals("end")) {
                return s.b.a;
            }
        }
        throw new IllegalStateException("Invalid TrimMode value");
    }

    @Override
    public Object e(Object expression, Object data) {
        TrimArguments trimArgumentsB = b(jb.a.c(expression));
        if (trimArgumentsB != null) {
            return a(trimArgumentsB);
        }
        return null;
    }
}
