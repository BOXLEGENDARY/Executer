package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B {

    public View f12210b;

    public final Map<String, Object> f12209a = new HashMap();

    final ArrayList<AbstractC1733q> f12211c = new ArrayList<>();

    @Deprecated
    public B() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return this.f12210b == b2.f12210b && this.f12209a.equals(b2.f12209a);
    }

    public int hashCode() {
        return (this.f12210b.hashCode() * 31) + this.f12209a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12210b + "\n") + "    values:";
        for (String str2 : this.f12209a.keySet()) {
            str = str + "    " + str2 + ": " + this.f12209a.get(str2) + "\n";
        }
        return str;
    }

    public B(View view) {
        this.f12210b = view;
    }
}
