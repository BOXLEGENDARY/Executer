package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class W {

    private static Map<VelocityTracker, X> f10612a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i7) {
            return velocityTracker.getAxisVelocity(i7);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f10612a.containsKey(velocityTracker)) {
                f10612a.put(velocityTracker, new X());
            }
            f10612a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i7) {
        c(velocityTracker, i7, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i7, float f7) {
        velocityTracker.computeCurrentVelocity(i7, f7);
        X xE = e(velocityTracker);
        if (xE != null) {
            xE.c(i7, f7);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i7) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i7);
        }
        if (i7 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i7 == 1) {
            return velocityTracker.getYVelocity();
        }
        X xE = e(velocityTracker);
        if (xE != null) {
            return xE.d(i7);
        }
        return 0.0f;
    }

    private static X e(VelocityTracker velocityTracker) {
        return f10612a.get(velocityTracker);
    }
}
