package m3;

import android.app.Activity;
import androidx.fragment.app.ActivityC1663h;
import n3.C2651i;

public class C2574e {

    private final Object f22024a;

    public C2574e(Activity activity) {
        C2651i.m(activity, "Activity must not be null");
        this.f22024a = activity;
    }

    public final Activity a() {
        return (Activity) this.f22024a;
    }

    public final ActivityC1663h b() {
        return (ActivityC1663h) this.f22024a;
    }

    public final boolean c() {
        return this.f22024a instanceof Activity;
    }

    public final boolean d() {
        return this.f22024a instanceof ActivityC1663h;
    }
}
