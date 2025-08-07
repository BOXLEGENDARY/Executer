package K3;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import t4.gYZ.uCYQMIHsy;

public final class C0479n {

    private final String f1885a;

    private final C0475l f1886b;

    private C0475l f1887c;

    C0479n(String str, C0477m c0477m) {
        C0475l c0475l = new C0475l(null);
        this.f1886b = c0475l;
        this.f1887c = c0475l;
        str.getClass();
        this.f1885a = str;
    }

    public final C0479n a(String str, int i7) {
        String strValueOf = String.valueOf(i7);
        C0471j c0471j = new C0471j(null);
        this.f1887c.f1884c = c0471j;
        this.f1887c = c0471j;
        c0471j.f1883b = strValueOf;
        c0471j.f1882a = "errorCode";
        return this;
    }

    public final C0479n b(String str, Object obj) {
        C0475l c0475l = new C0475l(null);
        this.f1887c.f1884c = c0475l;
        this.f1887c = c0475l;
        c0475l.f1883b = obj;
        c0475l.f1882a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f1885a);
        sb.append('{');
        C0475l c0475l = this.f1886b.f1884c;
        String str = BuildConfig.FLAVOR;
        while (c0475l != null) {
            Object obj = c0475l.f1883b;
            sb.append(str);
            String str2 = c0475l.f1882a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c0475l = c0475l.f1884c;
            str = uCYQMIHsy.wSfrAx;
        }
        sb.append('}');
        return sb.toString();
    }
}
