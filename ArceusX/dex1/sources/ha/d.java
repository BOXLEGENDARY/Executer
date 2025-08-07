package ha;

import android.text.TextUtils;
import com.roblox.client.a0;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeGLInterface;
import h7.l;
import h7.u;
import h7.v;
import ha.C2704j;
import ha.InterfaceC2707m;
import ha.r;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import t2.Dbl.hgESaf;
import t4.gYZ.uCYQMIHsy;
import y0.xyyu.hkVlaTTCDY;

public class d {

    private static d f2082f;

    private final Object f2083a = new Object();

    private final List<String> f2084b = new ArrayList();

    private long f2085c;

    private final b f2086d;

    private final u f2087e;

    class a implements InterfaceC2707m {
        a() {
        }

        @Override
        public void a(C2704j c2704j) {
            if (c2704j.b() == 200 || c2704j.b() == 202) {
                return;
            }
            l.k("EventStreamManager", "addEvent: Failed to post events. Ignore and do nothing");
        }
    }

    interface b {
        r a(String str, String str2, InterfaceC2707m interfaceC2707m, String str3);
    }

    static class c implements b {
        c() {
        }

        @Override
        public r a(String str, String str2, InterfaceC2707m interfaceC2707m, String str3) {
            return new r(str, str2, interfaceC2707m, str3);
        }
    }

    d(b bVar, u uVar) {
        l.g("EventStreamManager", "[Constructor]: ENTER.");
        this.f2086d = bVar;
        this.f2087e = uVar;
    }

    private static String b(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = list.size();
        int i7 = 0;
        for (String str : list) {
            sb.append("\"");
            sb.append(str);
            sb.append("\"");
            i7++;
            if (i7 < size) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected static String o() {
        try {
            return URLEncoder.encode(a0.T0(), "UTF-8");
        } catch (UnsupportedEncodingException e7) {
            l.d("EventStreamManager", "Failed to URL-encode the user-agent. Exception: " + e7);
            return null;
        }
    }

    public static d p() {
        if (f2082f == null) {
            synchronized (d.class) {
                try {
                    if (f2082f == null) {
                        f2082f = new d(new c(), new v());
                    }
                } finally {
                }
            }
        }
        return f2082f;
    }

    private boolean s() {
        return this.f2084b.size() >= Math.min(j6.d.a().G2(), 900) || this.f2087e.b() - this.f2085c >= ((long) j6.d.a().w()) * 1000;
    }

    protected void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=");
        sb.append(String.format("%tFT%<tT.%<tLZ", Calendar.getInstance(TimeZone.getTimeZone("Z"))));
        sb.append(uCYQMIHsy.QsxTbyCx);
        sb.append(a0.f19895p);
        sb.append("&idfv=");
        sb.append(a0.f19895p);
        sb.append("&idfa=");
        h7.c.g();
        sb.append(h7.c.d());
        String str2 = sb.toString() + "&" + str;
        synchronized (this.f2083a) {
            try {
                this.f2084b.add(str2);
                if (this.f2084b.size() == 1) {
                    this.f2085c = this.f2087e.b();
                }
                if (s()) {
                    r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        a("evt=appLaunch&ctx=" + str + "&appStoreSource=google");
    }

    public void d(String str, String str2) {
        a("evt=buttonClick&ctx=" + str + "&btn=" + str2);
    }

    public void e(String str, String str2, String str3) {
        a("evt=buttonClick&ctx=" + str + "&btn=" + str2 + "&cstm=" + str3);
    }

    public void f(String str, String str2, String str3) {
        a("evt=clientSideError&ctx=" + str + "&error=" + str2 + "&data=" + str3);
    }

    public void g(String str, String str2, int i7, int i8) {
        a(hgESaf.ApINRLMlxWNVn + str + "&url=" + str2 + "&errorCode=" + i7 + "&serverErrorCode=" + i8);
    }

    public void h(String str, String str2, List<NameValuePair> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("evt=");
        sb.append(str);
        sb.append("&ctx=");
        sb.append(str2);
        if (list != null) {
            for (NameValuePair nameValuePair : list) {
                sb.append("&");
                sb.append(nameValuePair.getName());
                sb.append("=");
                sb.append(nameValuePair.getValue());
            }
        }
        a(sb.toString());
    }

    public void i(String str, boolean z7) {
        a("evt=pushNotificationOSSettingsChanged&ua=" + o() + "&ctx=" + str + "&enabled=" + z7);
    }

    public void j(String str) {
        a("evt=screenLoaded&ctx=" + str);
    }

    public void k(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("evt=sharingAppSelected&ua=");
        sb.append(o());
        sb.append("&ctx=");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown";
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.isEmpty(str2)) {
            str3 = string + "&status=Fail";
        } else {
            str3 = string + "&status=Success&appName=" + str2;
        }
        a(str3);
    }

    public void l(String str, String str2) {
        if (j6.d.a().z0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("evt=shareSheetLoad&ua=");
            sb.append(o());
            sb.append("&ctx=");
            if (TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            sb.append(str);
            sb.append("&link=");
            sb.append(str2);
            a(sb.toString());
        }
    }

    public void m(String str) {
        a(hkVlaTTCDY.IQYiei + str);
    }

    public void n() {
        a("evt=switchAccount");
    }

    public void q() {
        NativeGLInterface.nativeReleaseAllRbxEventStreams();
    }

    public void r() {
        synchronized (this.f2083a) {
            try {
                if (this.f2084b.isEmpty()) {
                    return;
                }
                l.a("EventStreamManager", "sendAllNow: # of events " + this.f2084b.size());
                String strB = b(this.f2084b);
                l.a("EventStreamManager", "sendAllNow: httpPostBody: " + strB);
                this.f2084b.clear();
                this.f2085c = 0L;
                this.f2086d.a(a0.B0(), strB, new a(), a0.O()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
