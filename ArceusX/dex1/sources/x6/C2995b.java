package x6;

import E6.k;
import android.content.Context;
import bb.d;
import bb.t;
import g1.kQwt.YGBtcyQ;
import h7.l;
import okhttp3.ResponseBody;
import s7.g;

public class C2995b implements o7.a {

    private static String f24332a;

    class a implements d<ResponseBody> {
        a() {
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
        }

        public void b(bb.b<ResponseBody> bVar, t<ResponseBody> tVar) {
            l.a("rbx.jni", "sendSessionReport() success:" + tVar.g());
        }
    }

    public C2995b(Context context) {
        f24332a = context.getFilesDir().getAbsolutePath();
    }

    public String a() {
        return Long.toString(k.e().g());
    }

    public String b() {
        return f24332a;
    }

    public String c() {
        return g7.c.c().k();
    }

    public String d() {
        return "2.684.688";
    }

    public void e(String str, String str2) throws NumberFormatException {
        long j7;
        try {
            j7 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            l.k(YGBtcyQ.uRCvvke, "sendSessionReport() could not parse placeId");
            j7 = -1;
        }
        g.d().a().a(j7, str).u(new a());
    }

    public void f(String str, String str2, String str3, long j7) throws NumberFormatException {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
