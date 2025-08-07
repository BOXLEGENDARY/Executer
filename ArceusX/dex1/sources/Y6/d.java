package y6;

import bb.t;
import com.roblox.client.a0;
import h7.l;
import ha.C2697c;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;
import s7.g;
import y6.f;

public class d extends f {

    private long f24462J;

    private b f24463K;

    class a implements Runnable {

        final boolean f24464d;

        final c f24465e;

        a(boolean z7, c cVar) {
            this.f24464d = z7;
            this.f24465e = cVar;
        }

        @Override
        public void run() {
            d.this.f24463K.a(this.f24464d, this.f24465e);
        }
    }

    public interface b {
        void a(boolean z7, c cVar);
    }

    public static class c {

        private long f24467a;

        private String f24468b;

        private String f24469c;

        private String f24470d;

        public c(long j7, String str, String str2, String str3) {
            this.f24467a = j7;
            this.f24468b = str;
            this.f24469c = str2;
            this.f24470d = str3;
        }

        public long a() {
            return this.f24467a;
        }

        public String b() {
            return this.f24469c;
        }

        public String c() {
            return this.f24468b;
        }

        public String d() {
            return this.f24470d;
        }

        public void e(String str) {
            this.f24469c = str;
        }

        public void f(String str) {
            this.f24468b = str;
        }
    }

    public d(long j7, b bVar) {
        this.f24462J = j7;
        this.f24463K = bVar;
    }

    private String x() throws IOException {
        A7.b bVar;
        List list;
        t tVarExecute = g.d().c().a(Long.toString(this.f24462J), (String) null, "420x420", "Png", Boolean.FALSE).execute();
        if (!tVarExecute.g() || (bVar = (A7.b) tVarExecute.a()) == null || (list = bVar.data) == null || list.get(0) == null) {
            return null;
        }
        return ((A7.a) bVar.data.get(0)).imageUrl;
    }

    private void y(boolean z7, c cVar) {
        if (this.f24463K != null) {
            f.u().post(new a(z7, cVar));
        }
    }

    @Override
    public void m() throws Throwable {
        String strA = C2697c.i(a0.s0(this.f24462J), null, null).a();
        l.i("rbx.catalog", "payload:" + strA);
        JSONObject jSONObject = new JSONObject(strA);
        y(true, new c(this.f24462J, jSONObject.getString("Name"), jSONObject.getString("Description"), x()));
    }

    @Override
    protected void v(f.a aVar) {
        y(false, null);
    }
}
