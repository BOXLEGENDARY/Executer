package n3;

import com.google.android.gms.common.api.Status;
import l3.C2527b;
import l3.C2538m;

public class C2643a {
    public static C2527b a(Status status) {
        return status.q() ? new C2538m(status) : new C2527b(status);
    }
}
