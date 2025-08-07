package D4;

import E4.p0;
import android.content.Context;
import android.content.Intent;

final class b0 implements K {

    final AbstractC0374e f931a;

    final Intent f932b;

    final Context f933c;

    final d0 f934d;

    b0(d0 d0Var, AbstractC0374e abstractC0374e, Intent intent, Context context) {
        this.f934d = d0Var;
        this.f931a = abstractC0374e;
        this.f932b = intent;
        this.f933c = context;
    }

    @Override
    public final void A(int i7) {
        d0 d0Var = this.f934d;
        d0Var.f944g.post(new c0(d0Var, this.f931a, 6, i7));
    }

    @Override
    public final void a() {
        if (this.f932b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((p0) this.f934d).f1157a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f932b.putExtra("triggered_from_app_after_verification", true);
            this.f933c.sendBroadcast(this.f932b);
        }
    }

    @Override
    public final void zza() {
        d0 d0Var = this.f934d;
        d0Var.f944g.post(new c0(d0Var, this.f931a, 5, 0));
    }
}
