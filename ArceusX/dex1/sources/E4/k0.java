package E4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class k0 {

    private final List f1141a = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f1141a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", m0Var.a());
            bundle.putLong("event_timestamp", m0Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void b(int i7) {
        this.f1141a.add(m0.c(i7, System.currentTimeMillis()));
    }
}
