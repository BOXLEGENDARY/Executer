package y0;

import android.view.accessibility.AccessibilityManager;

public final class C3002c {

    public interface a {
        void onTouchExplorationStateChanged(boolean z7);
    }

    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        final a f24359a;

        b(a aVar) {
            this.f24359a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f24359a.equals(((b) obj).f24359a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24359a.hashCode();
        }

        @Override
        public void onTouchExplorationStateChanged(boolean z7) {
            this.f24359a.onTouchExplorationStateChanged(z7);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
