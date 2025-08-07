package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.Z;
import g.C2447a;
import g.C2456j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ListPopupWindow implements androidx.appcompat.view.menu.p {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    v mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final f mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final j mResizePopupRunnable;
    private final h mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final i mTouchInterceptor;

    class a extends ForwardingListener {
        a(View view) {
            super(view);
        }

        @Override
        public ListPopupWindow getPopup() {
            return ListPopupWindow.this;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            View anchorView = ListPopupWindow.this.getAnchorView();
            if (anchorView == null || anchorView.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.show();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
            v vVar;
            if (i7 == -1 || (vVar = ListPopupWindow.this.mDropDownList) == null) {
                return;
            }
            vVar.setListSelectionHidden(false);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class d {
        static int a(PopupWindow popupWindow, View view, int i7, boolean z7) {
            return popupWindow.getMaxAvailableHeight(view, i7, z7);
        }
    }

    static class e {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z7) {
            popupWindow.setIsClippedToScreen(z7);
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        @Override
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class h implements AbsListView.OnScrollListener {
        h() {
        }

        @Override
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }

        @Override
        public void onScrollStateChanged(AbsListView absListView, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i7 != 1 || ListPopupWindow.this.isInputMethodNotNeeded() || ListPopupWindow.this.mPopup.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.mHandler.removeCallbacks(listPopupWindow.mResizePopupRunnable);
            ListPopupWindow.this.mResizePopupRunnable.run();
        }
    }

    private class i implements View.OnTouchListener {
        i() {
        }

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.mPopup) != null && popupWindow.isShowing() && x7 >= 0 && x7 < ListPopupWindow.this.mPopup.getWidth() && y7 >= 0 && y7 < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.mHandler.postDelayed(listPopupWindow.mResizePopupRunnable, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.mHandler.removeCallbacks(listPopupWindow2.mResizePopupRunnable);
            return false;
        }
    }

    private class j implements Runnable {
        j() {
        }

        @Override
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            v vVar = ListPopupWindow.this.mDropDownList;
            if (vVar == null || !Z.Q(vVar) || ListPopupWindow.this.mDropDownList.getCount() <= ListPopupWindow.this.mDropDownList.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.mDropDownList.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.mListItemExpandMaximum) {
                listPopupWindow.mPopup.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(TAG, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(TAG, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C2447a.f20527H);
    }

    private int buildDropDown() {
        int measuredHeight;
        int i7;
        int iMakeMeasureSpec;
        int i8;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new b();
            v vVarCreateDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = vVarCreateDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                vVarCreateDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new c());
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.mDropDownList;
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i9 = this.mPromptPosition;
                if (i9 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i9 != 1) {
                    Log.e(TAG, "Invalid hint position " + this.mPromptPosition);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i10 = this.mDropDownWidth;
                if (i10 >= 0) {
                    i8 = Integer.MIN_VALUE;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i10, i8), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.mPopup.setContentView(view);
        } else {
            View view3 = this.mPromptView;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            int i11 = rect.top;
            i7 = rect.bottom + i11;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -i11;
            }
        } else {
            this.mTempRect.setEmpty();
            i7 = 0;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, this.mPopup.getInputMethodMode() == 2);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxAvailableHeight + i7;
        }
        int i12 = this.mDropDownWidth;
        if (i12 == -2) {
            int i13 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.mTempRect;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i12 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            int i14 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.mTempRect;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect3.left + rect3.right), 1073741824);
        }
        int iMeasureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(iMakeMeasureSpec, 0, -1, maxAvailableHeight - measuredHeight, -1);
        if (iMeasureHeightOfChildrenCompat > 0) {
            measuredHeight += i7 + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
        }
        return iMeasureHeightOfChildrenCompat + measuredHeight;
    }

    private int getMaxAvailableHeight(View view, int i7, boolean z7) {
        return d.a(this.mPopup, view, i7, z7);
    }

    private static boolean isConfirmKey(int i7) {
        return i7 == 66 || i7 == 23;
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            e.b(this.mPopup, z7);
            return;
        }
        Method method = sSetClipToWindowEnabledMethod;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i(TAG, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void clearListSelection() {
        v vVar = this.mDropDownList;
        if (vVar != null) {
            vVar.setListSelectionHidden(true);
            vVar.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new a(view);
    }

    v createDropDownListView(Context context, boolean z7) {
        return new v(context, z7);
    }

    @Override
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    @Override
    public ListView getListView() {
        return this.mDropDownList;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    public Object getSelectedItem() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedItemPosition();
        }
        return -1;
    }

    public View getSelectedView() {
        if (isShowing()) {
            return this.mDropDownList.getSelectedView();
        }
        return null;
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.mModal;
    }

    @Override
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean onKeyDown(int i7, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iLookForSelectablePosition;
        int count;
        if (isShowing() && i7 != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i7))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean zIsAboveAnchor = this.mPopup.isAboveAnchor();
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iLookForSelectablePosition = zAreAllItemsEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
            } else {
                iLookForSelectablePosition = Integer.MAX_VALUE;
                count = Integer.MIN_VALUE;
            }
            if ((!zIsAboveAnchor && i7 == 19 && selectedItemPosition <= iLookForSelectablePosition) || (zIsAboveAnchor && i7 == 20 && selectedItemPosition >= count)) {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            if (this.mDropDownList.onKeyDown(i7, keyEvent)) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                show();
                if (i7 == 19 || i7 == 20 || i7 == 23 || i7 == 66) {
                    return true;
                }
            } else if (zIsAboveAnchor || i7 != 20) {
                if (zIsAboveAnchor && i7 == 19 && selectedItemPosition == iLookForSelectablePosition) {
                    return true;
                }
            } else if (selectedItemPosition == count) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !isShowing()) {
            return false;
        }
        View view = this.mDropDownAnchorView;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.mDropDownList.onKeyUp(i7, keyEvent);
        if (zOnKeyUp && isConfirmKey(i7)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean performItemClick(int i7) {
        if (!isShowing()) {
            return false;
        }
        if (this.mItemClickListener == null) {
            return true;
        }
        v vVar = this.mDropDownList;
        this.mItemClickListener.onItemClick(vVar, vVar.getChildAt(i7 - vVar.getFirstVisiblePosition()), i7, vVar.getAdapter().getItemId(i7));
        return true;
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new g();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        v vVar = this.mDropDownList;
        if (vVar != null) {
            vVar.setAdapter(this.mAdapter);
        }
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public void setAnimationStyle(int i7) {
        this.mPopup.setAnimationStyle(i7);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i7) {
        Drawable background = this.mPopup.getBackground();
        if (background == null) {
            setWidth(i7);
            return;
        }
        background.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        this.mDropDownWidth = rect.left + rect.right + i7;
    }

    public void setDropDownAlwaysVisible(boolean z7) {
        this.mDropDownAlwaysVisible = z7;
    }

    public void setDropDownGravity(int i7) {
        this.mDropDownGravity = i7;
    }

    public void setEpicenterBounds(Rect rect) {
        this.mEpicenterBounds = rect != null ? new Rect(rect) : null;
    }

    public void setForceIgnoreOutsideTouch(boolean z7) {
        this.mForceIgnoreOutsideTouch = z7;
    }

    public void setHeight(int i7) {
        if (i7 < 0 && -2 != i7 && -1 != i7) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = i7;
    }

    public void setHorizontalOffset(int i7) {
        this.mDropDownHorizontalOffset = i7;
    }

    public void setInputMethodMode(int i7) {
        this.mPopup.setInputMethodMode(i7);
    }

    void setListItemExpandMax(int i7) {
        this.mListItemExpandMaximum = i7;
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public void setModal(boolean z7) {
        this.mModal = z7;
        this.mPopup.setFocusable(z7);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    public void setOverlapAnchor(boolean z7) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z7;
    }

    public void setPromptPosition(int i7) {
        this.mPromptPosition = i7;
    }

    public void setPromptView(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (zIsShowing) {
            show();
        }
    }

    public void setSelection(int i7) {
        v vVar = this.mDropDownList;
        if (!isShowing() || vVar == null) {
            return;
        }
        vVar.setListSelectionHidden(false);
        vVar.setSelection(i7);
        if (vVar.getChoiceMode() != 0) {
            vVar.setItemChecked(i7, true);
        }
    }

    public void setSoftInputMode(int i7) {
        this.mPopup.setSoftInputMode(i7);
    }

    public void setVerticalOffset(int i7) {
        this.mDropDownVerticalOffset = i7;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i7) {
        this.mDropDownWidth = i7;
    }

    public void setWindowLayoutType(int i7) {
        this.mDropDownWindowLayoutType = i7;
    }

    @Override
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iBuildDropDown = buildDropDown();
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        androidx.core.widget.i.b(this.mPopup, this.mDropDownWindowLayoutType);
        if (this.mPopup.isShowing()) {
            if (Z.Q(getAnchorView())) {
                int width = this.mDropDownWidth;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i7 = this.mDropDownHeight;
                if (i7 == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        iBuildDropDown = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    iBuildDropDown = i7;
                }
                this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
                this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, width < 0 ? -1 : width, iBuildDropDown < 0 ? -1 : iBuildDropDown);
                return;
            }
            return;
        }
        int width2 = this.mDropDownWidth;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i8 = this.mDropDownHeight;
        if (i8 == -1) {
            iBuildDropDown = -1;
        } else if (i8 != -2) {
            iBuildDropDown = i8;
        }
        this.mPopup.setWidth(width2);
        this.mPopup.setHeight(iBuildDropDown);
        setPopupClipToScreenEnabled(true);
        this.mPopup.setOutsideTouchable((this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            androidx.core.widget.i.a(this.mPopup, this.mOverlapAnchor);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetEpicenterBoundsMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, this.mEpicenterBounds);
                } catch (Exception e7) {
                    Log.e(TAG, "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            e.a(this.mPopup, this.mEpicenterBounds);
        }
        androidx.core.widget.i.c(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (this.mModal) {
            return;
        }
        this.mHandler.post(this.mHideSelector);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20527H);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new j();
        this.mTouchInterceptor = new i();
        this.mScrollListener = new h();
        this.mHideSelector = new f();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.n1, i7, i8);
        this.mDropDownHorizontalOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.o1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.p1, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.i iVar = new androidx.appcompat.widget.i(context, attributeSet, i7, i8);
        this.mPopup = iVar;
        iVar.setInputMethodMode(1);
    }
}
