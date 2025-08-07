package R6;

import Q6.m;
import Q6.t;
import S6.j;
import S6.n;
import android.content.Context;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import bb.d;
import bb.t;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import g6.k;
import h7.l;
import h7.r;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import s7.g;

public class a {

    class C0047a implements d<ResponseBody> {

        final m.b f6072a;

        final Context f6073b;

        C0047a(m.b bVar, Context context) {
            this.f6072a = bVar;
            this.f6073b = context;
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
            Wa.c.d().j(new k("PushNotificationRegistrationFailed"));
        }

        public void b(bb.b<ResponseBody> bVar, t<ResponseBody> tVar) {
            if (tVar.b() != 200) {
                Wa.c.d().j(new k("PushNotificationRegistrationFailed"));
                return;
            }
            try {
                String strA = r.a(tVar);
                l.i("rbx.push", strA);
                a.this.d(this.f6072a, new n(new JSONObject(strA)), this.f6073b);
            } catch (JSONException e7) {
                e7.printStackTrace();
                Wa.c.d().j(new k("PushNotificationRegistrationFailed"));
            }
        }
    }

    class b implements d<ResponseBody> {
        b() {
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
            l.d("rbx.push", "deregisterCurrentDevice failed: " + th.getMessage());
        }

        public void b(bb.b<ResponseBody> bVar, t<ResponseBody> tVar) {
        }
    }

    class c implements d<ResponseBody> {

        final Context f6076a;

        final String f6077b;

        final String f6078c;

        final t.b f6079d;

        c(Context context, String str, String str2, t.b bVar) {
            this.f6076a = context;
            this.f6077b = str;
            this.f6078c = str2;
            this.f6079d = bVar;
        }

        public void a(bb.b<ResponseBody> bVar, Throwable th) {
            P.p("metadataInaccessible", this.f6077b, this.f6078c);
        }

        public void b(bb.b<ResponseBody> bVar, bb.t<ResponseBody> tVar) {
            String str = KwdswzaUHE.clhUPriw;
            if (tVar.b() != 200) {
                if (tVar.b() == 401) {
                    P.p("unauthenticated", this.f6077b, this.f6078c);
                    return;
                } else {
                    P.p("metadataInaccessible", this.f6077b, this.f6078c);
                    return;
                }
            }
            try {
                String strA = r.a(tVar);
                l.g(str, strA);
                a.this.e(this.f6076a, this.f6077b, this.f6078c, this.f6079d, new j(new JSONObject(strA)), new Q6.j());
            } catch (JSONException e7) {
                e7.printStackTrace();
                l.d(str, "RGLS.onMessageReceived() JSONException msg:" + e7.getMessage());
                P.p("metadataInaccessible", this.f6077b, this.f6078c);
            }
        }
    }

    private void c(Context context, String str, boolean z7, String str2, m.b bVar) {
        x7.c cVar = new x7.c(str, z7, str2, j6.d.a().J1() ? B7.a.a(false) : null);
        bb.b<ResponseBody> bVarN = C2374w.h().n(cVar);
        if (bVarN == null) {
            bVarN = h7.n.d() ? g.d().f().a(cVar) : g.d().f().f(cVar);
        }
        bVarN.u(new C0047a(bVar, context));
    }

    public void a() {
        g.d().f().c().u(new b());
    }

    public void b(Context context, String str, String str2, String str3, String str4, t.b bVar) {
        g.d().f().d(str, str2, str3).u(new c(context, str, str4, bVar));
    }

    void d(m.b bVar, n nVar, Context context) {
        bVar.a(nVar, context);
    }

    void e(Context context, String str, String str2, t.b bVar, j jVar, Q6.j jVar2) {
        bVar.a(jVar, context, str, str2, jVar2);
    }

    public void f(Context context, String str, String str2, boolean z7, m.b bVar) {
        c(context, str, z7, str2, bVar);
    }
}
