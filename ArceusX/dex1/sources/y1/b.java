package y1;

import android.net.Uri;
import backtraceio.library.logger.BacktraceLogger;
import com.github.luben.zstd.BuildConfig;
import g1.kQwt.YGBtcyQ;

public class b {

    private static final transient String f24417e = "b";

    private final String f24418a = "json";

    private String f24419b;

    private String f24420c;

    private Uri f24421d;

    public b(String str, String str2) {
        this.f24419b = str;
        this.f24420c = str2;
    }

    private Uri a() {
        return this.f24421d;
    }

    private String b() {
        return this.f24419b;
    }

    private Uri d() {
        String strB = b();
        return Uri.parse(String.format("%s%spost?format=%s&token=%s", strB, strB.endsWith("/") ? BuildConfig.FLAVOR : "/", "json", e()));
    }

    public Uri c() {
        String strReplace;
        String string = f().toString();
        if (string.contains("format=json")) {
            strReplace = string.replace("format=json", "format=minidump");
        } else {
            if (!string.contains("/json")) {
                return null;
            }
            strReplace = string.replace("/json", "/minidump");
        }
        return Uri.parse(strReplace);
    }

    public String e() {
        String str = this.f24420c;
        if (str != null) {
            return str;
        }
        String string = f().toString();
        int iLastIndexOf = string.lastIndexOf("/");
        if (string.contains("submit.backtrace.io")) {
            int i7 = iLastIndexOf - 64;
            if (i7 < 0) {
                return null;
            }
            return string.substring(i7, iLastIndexOf);
        }
        int iIndexOf = string.indexOf("token=");
        if (iIndexOf == -1) {
            return null;
        }
        return string.substring(iIndexOf + 6, iIndexOf + 70);
    }

    public Uri f() {
        Uri uriA = a();
        return uriA != null ? uriA : d();
    }

    public String g() {
        String string = f().toString();
        if (string.startsWith(YGBtcyQ.owTJRyoFqCTdKT)) {
            int iIndexOf = string.indexOf(47, 28);
            if (iIndexOf != -1) {
                return string.substring(28, iIndexOf);
            }
            BacktraceLogger.w(f24417e, "Missed universe in server URL: " + string);
            return null;
        }
        if (string.indexOf("backtrace.io") != -1) {
            Uri uri = Uri.parse(string);
            return uri.getHost().substring(0, uri.getHost().indexOf("."));
        }
        BacktraceLogger.w(f24417e, "Missed universe in server URL: " + string);
        return null;
    }
}
