package l4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class ViewOnTouchListenerC2544a implements View.OnTouchListener {

    private final Dialog f21805d;

    private final int f21806e;

    private final int f21807i;

    private final int f21808v;

    public ViewOnTouchListenerC2544a(Dialog dialog, Rect rect) {
        this.f21805d = dialog;
        this.f21806e = rect.left;
        this.f21807i = rect.top;
        this.f21808v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f21806e + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f21807i + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i7 = this.f21808v;
            motionEventObtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f21805d.onTouchEvent(motionEventObtain);
    }
}
