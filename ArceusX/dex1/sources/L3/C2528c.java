package l3;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import g0.C2457a;
import java.util.ArrayList;
import m3.C2571b;
import n3.C2651i;

public class C2528c extends Exception {

    private final C2457a f21786d;

    public C2528c(C2457a c2457a) {
        this.f21786d = c2457a;
    }

    @Override
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z7 = true;
        for (C2571b c2571b : this.f21786d.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C2651i.l((ConnectionResult) this.f21786d.get(c2571b));
            z7 &= !connectionResult.q();
            arrayList.add(c2571b.b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
