package y0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class C3020u {

    private final Object f24413a;

    static class a extends AccessibilityNodeProvider {

        final C3020u f24414a;

        a(C3020u c3020u) {
            this.f24414a = c3020u;
        }

        @Override
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
            C3019t c3019tB = this.f24414a.b(i7);
            if (c3019tB == null) {
                return null;
            }
            return c3019tB.E0();
        }

        @Override
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i7) {
            List<C3019t> listC = this.f24414a.c(str, i7);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(listC.get(i8).E0());
            }
            return arrayList;
        }

        @Override
        public AccessibilityNodeInfo findFocus(int i7) {
            C3019t c3019tD = this.f24414a.d(i7);
            if (c3019tD == null) {
                return null;
            }
            return c3019tD.E0();
        }

        @Override
        public boolean performAction(int i7, int i8, Bundle bundle) {
            return this.f24414a.f(i7, i8, bundle);
        }
    }

    static class b extends a {
        b(C3020u c3020u) {
            super(c3020u);
        }

        @Override
        public void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f24414a.a(i7, C3019t.F0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C3020u() {
        this.f24413a = new b(this);
    }

    public void a(int i7, C3019t c3019t, String str, Bundle bundle) {
    }

    public C3019t b(int i7) {
        return null;
    }

    public List<C3019t> c(String str, int i7) {
        return null;
    }

    public C3019t d(int i7) {
        return null;
    }

    public Object e() {
        return this.f24413a;
    }

    public boolean f(int i7, int i8, Bundle bundle) {
        return false;
    }

    public C3020u(Object obj) {
        this.f24413a = obj;
    }
}
