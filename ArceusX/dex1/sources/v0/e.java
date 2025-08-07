package v0;

import android.util.Base64;
import java.util.List;
import t4.gYZ.uCYQMIHsy;

public final class e {

    private final String f24058a;

    private final String f24059b;

    private final String f24060c;

    private final List<List<byte[]>> f24061d;

    private final int f24062e = 0;

    private final String f24063f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f24058a = (String) x0.g.g(str);
        this.f24059b = (String) x0.g.g(str2);
        this.f24060c = (String) x0.g.g(str3);
        this.f24061d = (List) x0.g.g(list);
        this.f24063f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f24061d;
    }

    public int c() {
        return this.f24062e;
    }

    String d() {
        return this.f24063f;
    }

    public String e() {
        return this.f24058a;
    }

    public String f() {
        return this.f24059b;
    }

    public String g() {
        return this.f24060c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f24058a + ", mProviderPackage: " + this.f24059b + ", mQuery: " + this.f24060c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f24061d.size(); i7++) {
            sb.append(" [");
            List<byte[]> list = this.f24061d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i8), 0));
                sb.append(uCYQMIHsy.JLubQmQNvEW);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f24062e);
        return sb.toString();
    }
}
