package R3;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

public final class O6 {

    private final String f5320a;

    private final N6 f5321b;

    private N6 f5322c;

    O6(String str, L6 l62) {
        N6 n62 = new N6(null);
        this.f5321b = n62;
        this.f5322c = n62;
        this.f5320a = str;
    }

    private final O6 e(String str, Object obj) {
        M6 m62 = new M6(null);
        this.f5322c.f5301c = m62;
        this.f5322c = m62;
        m62.f5300b = obj;
        m62.f5299a = str;
        return this;
    }

    public final O6 a(String str, float f7) {
        e(str, String.valueOf(f7));
        return this;
    }

    public final O6 b(String str, int i7) {
        e(str, String.valueOf(i7));
        return this;
    }

    public final O6 c(String str, Object obj) {
        N6 n62 = new N6(null);
        this.f5322c.f5301c = n62;
        this.f5322c = n62;
        n62.f5300b = obj;
        n62.f5299a = str;
        return this;
    }

    public final O6 d(String str, boolean z7) {
        e("trackingEnabled", String.valueOf(z7));
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f5320a);
        sb.append('{');
        N6 n62 = this.f5321b.f5301c;
        String str = BuildConfig.FLAVOR;
        while (n62 != null) {
            Object obj = n62.f5300b;
            sb.append(str);
            String str2 = n62.f5299a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            n62 = n62.f5301c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
