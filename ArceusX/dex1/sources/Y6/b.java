package y6;

import android.util.Log;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import s7.g;
import y6.f;

public class b extends f {

    private String f24452J;

    @Deprecated
    private long f24453K;

    private String f24454L;

    private c f24455M;

    class a implements Runnable {

        final String f24456d;

        a(String str) {
            this.f24456d = str;
        }

        @Override
        public void run() {
            b.this.f24455M.b(this.f24456d);
        }
    }

    class RunnableC0240b implements Runnable {

        final String f24458d;

        final String f24459e;

        RunnableC0240b(String str, String str2) {
            this.f24458d = str;
            this.f24459e = str2;
        }

        @Override
        public void run() {
            b.this.f24455M.a(this.f24458d, this.f24459e);
        }
    }

    public interface c {
        void a(String str, String str2);

        void b(String str);
    }

    @Deprecated
    public b(long j7, String str, c cVar) {
        super(f.t().h(Long.toString(j7)));
        this.f24453K = j7;
        this.f24452J = str;
        this.f24455M = cVar;
    }

    private void x(String str, String str2) {
        if (this.f24455M != null) {
            f.u().post(new RunnableC0240b(str, str2));
        }
    }

    private void y(String str) {
        if (this.f24455M != null) {
            f.u().post(new a(str));
        }
    }

    private void z(String str, String str2) {
        String str3 = str2 != null ? str2 : "Send Failed";
        if (str2 == null) {
            str = "failed";
        }
        x(str, str3);
    }

    @Override
    public void m() throws Throwable {
        String[] strArr = {this.f24452J};
        String strString = ((ResponseBody) (j6.d.a().D() ? g.d().d().a(new y7.c(this.f24454L, strArr)).execute() : g.d().d().b(new y7.d(this.f24453K, strArr)).execute()).a()).string();
        Log.v(T5.a.f7450a, "CPMJ.onRun() payload:" + strString);
        JSONArray jSONArray = new JSONObject(strString).getJSONArray("messages");
        if (jSONArray.length() <= 0) {
            z("failed", "No messages in the response");
            return;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        String string = jSONObject.getString("status");
        if ("success".equals(string)) {
            y(jSONObject.getString("id"));
        } else {
            z(string, "Send Failed");
        }
    }

    @Override
    protected void v(f.a aVar) {
        z(null, null);
    }

    public b(String str, String str2, c cVar) {
        super(f.t().h(str));
        this.f24454L = str;
        this.f24452J = str2;
        this.f24455M = cVar;
    }
}
