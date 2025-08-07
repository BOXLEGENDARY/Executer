package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private Runnable mTriggerLongPress;

    private class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            ForwardingListener.this.onLongPress();
        }
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.mTapTimeout = tapTimeout;
        this.mLongPressTimeout = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void clearCallbacks() {
        Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.mDisallowIntercept;
        if (runnable2 != null) {
            this.mSrc.removeCallbacks(runnable2);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        v vVar;
        View view = this.mSrc;
        androidx.appcompat.view.menu.p popup = getPopup();
        if (popup == null || !popup.isShowing() || (vVar = (v) popup.getListView()) == null || !vVar.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, motionEventObtainNoHistory);
        toLocalMotionEvent(vVar, motionEventObtainNoHistory);
        boolean zOnForwardedEvent = vVar.onForwardedEvent(motionEventObtainNoHistory, this.mActivePointerId);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zOnForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    private boolean onTouchObserved(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.onTouchObserved(android.view.MotionEvent):boolean");
    }

    private static boolean pointInView(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p getPopup();

    protected boolean onForwardingStarted() {
        androidx.appcompat.view.menu.p popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        androidx.appcompat.view.menu.p popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    void onLongPress() {
        clearCallbacks();
        View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.mForwarding = true;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.mForwarding;
        if (z8) {
            z7 = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z7 = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z7) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.mForwarding = z7;
        return z7 || z8;
    }

    @Override
    public void onViewAttachedToWindow(View view) {
    }

    @Override
    public void onViewDetachedFromWindow(View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        Runnable runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }
}
