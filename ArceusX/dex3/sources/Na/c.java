package Na;

import Na.b;
import P9.o;
import P9.p;
import com.roblox.client.personasdk.R;
import java.util.List;
import jb.d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0013\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0007*\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LNa/c;", "LAa/b;", "LNa/b;", "<init>", "()V", "", "", "", "startIndex", "charsCount", "", "j", "(Ljava/util/List;II)Ljava/lang/String;", "i", "(Ljava/lang/String;I)Ljava/lang/String;", "d", "(Ljava/lang/String;II)Ljava/lang/String;", "h", "f", "g", "a", "(Ljava/lang/String;I)I", "sourceStringLength", "b", "(II)I", "expression", "data", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class c implements Aa.b, b {

    @NotNull
    public static final c a = new c();

    private c() {
    }

    private final int a(String str, int i) {
        Integer numValueOf = Integer.valueOf(str.length() + i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int b(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() > i2) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    private final String d(String str, int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return h(str, i, i2);
        }
        if (i >= 0 && i2 < 0) {
            String strSubstring = str.substring(i, str.length() + i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        if (i < 0 && i2 < 0) {
            return f(str, i, i2);
        }
        if (i >= 0 || i2 <= 0) {
            return null;
        }
        return g(str, i, i2);
    }

    private final String f(String str, int i, int i2) {
        String strSubstring = str.substring(a(str, i), b(str.length() + i2, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String g(String str, int i, int i2) {
        int iA = a(str, i);
        String strSubstring = str.substring(iA, b(i2 + iA, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String h(String str, int i, int i2) {
        String strSubstring = str.substring(i, b(i2 + i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final String i(String str, int i) {
        if (i >= 0) {
            String strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        if (Math.abs(i) > str.length()) {
            return str;
        }
        String strSubstring2 = str.substring(str.length() + i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return strSubstring2;
    }

    private final String j(List<? extends Object> list, int i, int i2) {
        Object objB;
        String strU = CollectionsKt.U(k(CollectionsKt.firstOrNull(list)), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        try {
            o.a aVar = o.e;
            if (list.size() == 2) {
                strU = a.i(strU, i);
            } else if (list.size() > 2) {
                strU = a.d(strU, i, i2);
            }
            objB = o.b(strU);
        } catch (Throwable th) {
            o.a aVar2 = o.e;
            objB = o.b(p.a(th));
        }
        if (o.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }

    @Override
    @NotNull
    public String e(Object expression, Object data) {
        List<? extends Object> listC = jb.a.c(expression);
        return a.j(listC, d.b(String.valueOf(jb.c.b(listC))), d.b(String.valueOf(jb.c.c(listC))));
    }

    @NotNull
    public List<String> k(Object obj) {
        return b.a.d(this, obj);
    }
}
