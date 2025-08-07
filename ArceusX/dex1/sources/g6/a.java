package G6;

import android.R;
import android.view.View;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.S;

public abstract class a {

    protected ActivityC1663h f1437a;

    public a(ActivityC1663h activityC1663h) {
        this.f1437a = activityC1663h;
    }

    protected boolean a() {
        ActivityC1663h activityC1663h = this.f1437a;
        if (activityC1663h == null) {
            return false;
        }
        return ((activityC1663h instanceof S) && ((S) activityC1663h).m0()) ? false : true;
    }

    protected int b() {
        View viewFindViewById = this.f1437a.findViewById(R.id.content);
        l7.b bVarA = l7.b.a(viewFindViewById.getRootView(), this.f1437a.getWindowManager(), viewFindViewById, ((S) this.f1437a).f0().c());
        return (bVarA.b - bVarA.g) - bVarA.c;
    }
}
