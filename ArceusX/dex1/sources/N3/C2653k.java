package n3;

import android.content.Context;
import android.content.res.Resources;

public class C2653k {

    private final Resources f22285a;

    private final String f22286b;

    public C2653k(Context context) {
        C2651i.l(context);
        Resources resources = context.getResources();
        this.f22285a = resources;
        this.f22286b = resources.getResourcePackageName(com.google.android.gms.common.j.f14354a);
    }

    public String a(String str) {
        int identifier = this.f22285a.getIdentifier(str, "string", this.f22286b);
        if (identifier == 0) {
            return null;
        }
        return this.f22285a.getString(identifier);
    }
}
