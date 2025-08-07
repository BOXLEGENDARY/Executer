package ha;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import h7.l;
import ha.C2704j;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import s7.g;
import t7.f;
import t7.i;

public class C2697c {

    private static i f22519a;

    public static class a {
    }

    public static void a() {
        f22519a = null;
        CookieHandler.setDefault(null);
    }

    private static C2704j b(String str, String str2, a[] aVarArr, String str3) {
        return d(g.b(), str, str2, aVarArr, str3);
    }

    private static C2704j c(String str, String str2, a[] aVarArr, String str3, int i7, int i8) {
        OkHttpClient okHttpClientB = g.b();
        if (i7 >= 0 || i8 >= 0) {
            OkHttpClient.Builder builderNewBuilder = okHttpClientB.newBuilder();
            if (i7 >= 0) {
                builderNewBuilder.connectTimeout(i7, TimeUnit.MILLISECONDS);
            }
            if (i8 >= 0) {
                builderNewBuilder.readTimeout(i8, TimeUnit.MILLISECONDS);
            }
            okHttpClientB = builderNewBuilder.build();
        }
        return d(okHttpClientB, str, str2, aVarArr, str3);
    }

    private static C2704j d(OkHttpClient okHttpClient, String str, String str2, a[] aVarArr, String str3) {
        HashMap map = new HashMap();
        if (aVarArr != null && aVarArr.length > 0) {
            a aVar = aVarArr[0];
            throw null;
        }
        C2704j c2704j = new C2704j();
        c2704j.f22521a = str2 == null ? C2704j.a.GET : C2704j.a.POST;
        c2704j.f22523c = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Response responseA = new f().a(okHttpClient, str, str2, map, str3);
            c2704j.f22525e = responseA.code();
            c2704j.d(responseA.body().string());
            c2704j.c(responseA.header("Last-Modified", BuildConfig.FLAVOR));
        } catch (IOException e7) {
            l.k("rbx.httpagent", "IOException initial newCall(): url = " + str + ", exception = " + e7);
        } catch (NullPointerException unused) {
            l.k("rbx.httpagent", "null url in newCall()");
        } catch (SSLHandshakeException e8) {
            l.k("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str + ", exception = " + e8);
            c2704j.f22527g = true;
        }
        c2704j.f22526f = System.currentTimeMillis() - jCurrentTimeMillis;
        return c2704j;
    }

    public static void e(Context context) {
        if (f22519a == null) {
            i iVarC = i.c();
            f22519a = iVarC;
            CookieHandler.setDefault(iVarC);
        }
    }

    public static void f(File file, String str) {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static C2704j i(String str, String str2, a[] aVarArr) {
        return k(str, str2, aVarArr, null);
    }

    public static C2704j j(String str, String str2, a[] aVarArr, String str3) {
        return k(str, str2, aVarArr, str3);
    }

    public static C2704j k(String str, String str2, a[] aVarArr, String str3) {
        return b(str, str2, aVarArr, str3);
    }

    public static C2704j l(String str, String str2, a[] aVarArr, String str3, int i7, int i8) {
        return c(str, str2, aVarArr, str3, i7, i8);
    }
}
