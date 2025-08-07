package y6;

import h7.l;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import s7.g;
import y6.f;

public class C3030a extends f {

    private String f24449J;

    @Deprecated
    private long f24450K;

    private String f24451L;

    public interface InterfaceC0239a {
    }

    @Deprecated
    public C3030a(long j7, String str, InterfaceC0239a interfaceC0239a) {
        this.f24450K = j7;
        this.f24449J = str;
    }

    private void w(boolean z7) {
    }

    @Override
    public void m() throws Throwable {
        if (j6.d.a().D()) {
            String strString = ((ResponseBody) g.d().d().c(new y7.a(new String[]{this.f24451L})).execute().a()).string();
            l.i(T5.a.f7450a, "payload:" + strString);
            w("success".equals(new JSONObject(strString).optString("status")));
            return;
        }
        String strString2 = ((ResponseBody) g.d().d().d(new y7.b(new long[]{this.f24450K})).execute().a()).string();
        l.i(T5.a.f7450a, "payload:" + strString2);
        w("success".equals(new JSONObject(strString2).optString("status")));
    }

    @Override
    protected void v(f.a aVar) {
        w(false);
    }

    public C3030a(String str, String str2, InterfaceC0239a interfaceC0239a) {
        this.f24451L = str;
        this.f24449J = str2;
    }
}
