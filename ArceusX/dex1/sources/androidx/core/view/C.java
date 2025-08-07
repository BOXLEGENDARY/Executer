package androidx.core.view;

import android.view.MotionEvent;

public final class C {
    public static boolean a(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }
}
