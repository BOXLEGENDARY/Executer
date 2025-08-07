package N3;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

public final class C0553y {

    private final String f2638a;

    private final C0551w f2639b;

    private C0551w f2640c;

    C0553y(String str, C0552x c0552x) {
        C0551w c0551w = new C0551w();
        this.f2639b = c0551w;
        this.f2640c = c0551w;
        str.getClass();
        this.f2638a = str;
    }

    public final C0553y a(String str, Object obj) {
        C0551w c0551w = new C0551w();
        this.f2640c.f2637c = c0551w;
        this.f2640c = c0551w;
        c0551w.f2636b = obj;
        c0551w.f2635a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f2638a);
        sb.append('{');
        C0551w c0551w = this.f2639b.f2637c;
        String str = BuildConfig.FLAVOR;
        while (c0551w != null) {
            Object obj = c0551w.f2636b;
            sb.append(str);
            String str2 = c0551w.f2635a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c0551w = c0551w.f2637c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
