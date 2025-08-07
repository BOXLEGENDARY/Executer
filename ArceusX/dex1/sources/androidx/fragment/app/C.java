package androidx.fragment.app;

import android.view.View;
import androidx.transition.C1723g;
import g0.C2457a;
import java.util.ArrayList;

class C {

    static final E f10945a = new D();

    static final E f10946b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z7, C2457a<String, View> c2457a, boolean z8) {
        if (z7) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static E b() {
        try {
            return (E) C1723g.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(C2457a<String, String> c2457a, C2457a<String, View> c2457a2) {
        for (int size = c2457a.getSize() - 1; size >= 0; size--) {
            if (!c2457a2.containsKey(c2457a.k(size))) {
                c2457a.i(size);
            }
        }
    }

    static void d(ArrayList<View> arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i7);
        }
    }
}
