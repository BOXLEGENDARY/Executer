package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C1620h0;
import g.C2447a;
import i.C2480a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q0.C2731a;

class v extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private C1620h0 mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    f mResolveHoverRunnable;
    private androidx.core.widget.g mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private d mSelector;
    private final Rect mSelectorRect;

    static class a {
        static void a(View view, float f7, float f8) {
            view.drawableHotspotChanged(f7, f8);
        }
    }

    static class b {

        private static Method f9338a;

        private static Method f9339b;

        private static Method f9340c;

        private static boolean f9341d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f9338a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f9339b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f9340c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f9341d = true;
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            }
        }

        static boolean a() {
            return f9341d;
        }

        static void b(v vVar, int i7, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f9338a.invoke(vVar, Integer.valueOf(i7), view, Boolean.FALSE, -1, -1);
                f9339b.invoke(vVar, Integer.valueOf(i7));
                f9340c.invoke(vVar, Integer.valueOf(i7));
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z7) {
            absListView.setSelectedChildViewEnabled(z7);
        }
    }

    private static class d extends C2480a {

        private boolean f9342e;

        d(Drawable drawable) {
            super(drawable);
            this.f9342e = true;
        }

        void b(boolean z7) {
            this.f9342e = z7;
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.f9342e) {
                super.draw(canvas);
            }
        }

        @Override
        public void setHotspot(float f7, float f8) {
            if (this.f9342e) {
                super.setHotspot(f7, f8);
            }
        }

        @Override
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f9342e) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override
        public boolean setState(int[] iArr) {
            if (this.f9342e) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f9342e) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    static class e {

        private static final Field f9343a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            f9343a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f9343a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z7) throws IllegalAccessException, IllegalArgumentException {
            Field field = f9343a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z7));
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            v vVar = v.this;
            vVar.mResolveHoverRunnable = null;
            vVar.removeCallbacks(this);
        }

        public void b() {
            v.this.post(this);
        }

        @Override
        public void run() {
            v vVar = v.this;
            vVar.mResolveHoverRunnable = null;
            vVar.drawableStateChanged();
        }
    }

    v(Context context, boolean z7) {
        super(context, null, C2447a.f20523D);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z7;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1620h0 c1620h0 = this.mClickAnimation;
        if (c1620h0 != null) {
            c1620h0.c();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        if (this.mSelectorRect.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.mSelectorRect);
        selector.draw(canvas);
    }

    private void positionSelectorCompat(int i7, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i7 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void positionSelectorLikeFocusCompat(int i7, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i7 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i7, view);
        if (z7) {
            Rect rect = this.mSelectorRect;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C2731a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorLikeTouchCompat(int i7, View view, float f7, float f8) throws IllegalAccessException, IllegalArgumentException {
        positionSelectorLikeFocusCompat(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        C2731a.k(selector, f7, f8);
    }

    private void setPressedItem(View view, int i7, float f7, float f8) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.mDrawsInPressedState = true;
        a.a(this, f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.mMotionPosition;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i7;
        a.a(view, f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i7, view, f7, f8);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void setSelectorEnabled(boolean z7) {
        d dVar = this.mSelector;
        if (dVar != null) {
            dVar.b(z7);
        }
    }

    private boolean superIsSelectedChildViewEnabled() {
        return u0.a.c() ? c.a(this) : e.a(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z7) throws IllegalAccessException, IllegalArgumentException {
        if (u0.a.c()) {
            c.b(this, z7);
        } else {
            e.b(this, z7);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    private void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    protected void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i7, boolean z7) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z7) {
                    iMin = Math.max(0, i7);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i7, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i7 >= 0 && i7 < count) {
                return i7;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View view = null;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i7, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return (i11 < 0 || i12 <= i11 || i14 <= 0 || measuredHeight == i10) ? i10 : i14;
            }
            if (i11 >= 0 && i12 >= i11) {
                i14 = measuredHeight;
            }
            i12++;
        }
        return measuredHeight;
    }

    @Override
    protected void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i7 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            f fVar = new f();
            this.mResolveHoverRunnable = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                updateSelectorStateCompat();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.mResolveHoverRunnable;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z7) {
        this.mListSelectionHidden = z7;
    }

    @Override
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.mSelector = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }
}
