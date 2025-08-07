package V5;

import android.view.MotionEvent;
import h7.l;

public class j {

    public static int f7591b = 0;

    public static int f7592c = 1;

    public static int f7593d = 2;

    protected int f7594a = f7591b;

    public void a(int i7) {
        this.f7594a = i7;
    }

    public boolean b(MotionEvent motionEvent) {
        int i7 = this.f7594a;
        if (i7 > f7591b) {
            if (i7 == f7592c && (motionEvent.getFlags() & 1) == 1) {
                l.a("rbx.input", "WINDOW_IS_OBSCURED");
                return false;
            }
            if (this.f7594a == f7593d && (motionEvent.getFlags() & 2) == 2) {
                l.a("rbx.input", "WINDOW_IS_PARTIALLY_OBSCURED");
                return false;
            }
        }
        return true;
    }
}
