package q3;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import n3.C2645c;

public class C2732a {

    private final String f22711a;

    private final String f22712b;

    private final C2645c f22713c;

    private final int f22714d;

    public C2732a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f22712b = string;
        this.f22711a = str;
        this.f22713c = new C2645c(str);
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f22711a, i7)) {
            i7++;
        }
        this.f22714d = i7;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f22711a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f22711a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f22712b.concat(str);
    }

    public boolean d(int i7) {
        return this.f22714d <= i7;
    }
}
