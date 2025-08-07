package n3;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import l3.AbstractC2535j;
import n3.C2650h;

final class C2625A implements AbstractC2535j.a {

    final AbstractC2535j f22245a;

    final C1574k f22246b;

    final C2650h.a f22247c;

    final InterfaceC2627C f22248d;

    C2625A(AbstractC2535j abstractC2535j, C1574k c1574k, C2650h.a aVar, InterfaceC2627C interfaceC2627C) {
        this.f22245a = abstractC2535j;
        this.f22246b = c1574k;
        this.f22247c = aVar;
        this.f22248d = interfaceC2627C;
    }

    @Override
    public final void a(Status status) {
        if (!status.r()) {
            this.f22246b.b(C2643a.a(status));
        } else {
            this.f22246b.c(this.f22247c.a(this.f22245a.b(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
