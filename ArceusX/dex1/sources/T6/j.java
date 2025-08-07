package t6;

import g6.C2468d;
import org.json.JSONException;
import q7.b;

public class j extends q7.b {

    private class a implements b.b {
        public void a(q7.a aVar) {
            h7.l.i("RBHybridModuleOverlay", "RBHybridModuleOverlay CloseOverlay.execute() " + aVar.f());
            Wa.c.d().j(new C2468d());
        }

        private a() {
        }
    }

    private class b implements b.b {
        public void a(q7.a aVar) {
            h7.l.i("RBHybridModuleOverlay", "RBHybridModuleOverlay SetSubmitState.execute() " + aVar.f());
            try {
                Wa.c.d().j(new g6.j(aVar.f().getString("submitButtonState")));
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }

        private b() {
        }
    }

    public j() {
        super("Overlay");
        d("close", new a());
        d("setSubmitState", new b());
    }
}
