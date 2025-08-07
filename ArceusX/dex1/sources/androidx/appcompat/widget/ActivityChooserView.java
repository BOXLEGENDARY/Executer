package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.AbstractC1607b;
import androidx.core.view.Z;
import g.C2450d;
import g.C2452f;
import g.C2453g;
import g.C2454h;
import g.C2456j;
import java.lang.reflect.InvocationTargetException;
import y0.C3019t;

public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    final f mAdapter;
    private final g mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    final DataSetObserver mModelDataSetObserver;
    PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    AbstractC1607b mProvider;

    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mAdapter.notifyDataSetChanged();
        }

        @Override
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (ActivityChooserView.this.isShowingPopup()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC1607b abstractC1607b = ActivityChooserView.this.mProvider;
                if (abstractC1607b != null) {
                    abstractC1607b.subUiVisibilityChanged(true);
                }
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C3019t.F0(accessibilityNodeInfo).b0(true);
        }
    }

    class d extends ForwardingListener {
        d(View view) {
            super(view);
        }

        @Override
        public androidx.appcompat.view.menu.p getPopup() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override
        protected boolean onForwardingStarted() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView.this.showPopup();
            return true;
        }

        @Override
        protected boolean onForwardingStopped() {
            ActivityChooserView.this.dismissPopup();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        @Override
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.updateAppearance();
        }
    }

    private class f extends BaseAdapter {

        private ActivityChooserModel f9135d;

        private int f9136e = 4;

        private boolean f9137i;

        private boolean f9138v;

        private boolean f9139w;

        f() {
        }

        public int a() {
            return this.f9135d.f();
        }

        public ActivityChooserModel b() {
            return this.f9135d;
        }

        public ResolveInfo c() {
            return this.f9135d.h();
        }

        public int d() {
            return this.f9135d.i();
        }

        public boolean e() {
            return this.f9137i;
        }

        public int f() {
            int i7 = this.f9136e;
            this.f9136e = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i8 = 0; i8 < count; i8++) {
                view = getView(i8, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f9136e = i7;
            return iMax;
        }

        public void g(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel activityChooserModelB = ActivityChooserView.this.mAdapter.b();
            if (activityChooserModelB != null && ActivityChooserView.this.isShown()) {
                activityChooserModelB.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            this.f9135d = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            int iF = this.f9135d.f();
            if (!this.f9137i && this.f9135d.h() != null) {
                iF--;
            }
            int iMin = Math.min(iF, this.f9136e);
            return this.f9139w ? iMin + 1 : iMin;
        }

        @Override
        public Object getItem(int i7) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f9137i && this.f9135d.h() != null) {
                i7++;
            }
            return this.f9135d.e(i7);
        }

        @Override
        public long getItemId(int i7) {
            return i7;
        }

        @Override
        public int getItemViewType(int i7) {
            return (this.f9139w && i7 == getCount() - 1) ? 1 : 0;
        }

        @Override
        public View getView(int i7, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2453g.f20682f, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(C2452f.f20647R)).setText(ActivityChooserView.this.getContext().getString(C2454h.f20699b));
                return viewInflate;
            }
            if (view == null || view.getId() != C2452f.f20674x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2453g.f20682f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C2452f.f20672v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i7);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C2452f.f20647R)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f9137i && i7 == 0 && this.f9138v) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i7) {
            if (this.f9136e != i7) {
                this.f9136e = i7;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z7, boolean z8) {
            if (this.f9137i == z7 && this.f9138v == z8) {
                return;
            }
            this.f9137i = z7;
            this.f9138v = z8;
            notifyDataSetChanged();
        }

        public void j(boolean z7) {
            if (this.f9139w != z7) {
                this.f9139w = z7;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.mDefaultActivityButton) {
                if (view != activityChooserView.mExpandActivityOverflowButton) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.mIsSelectingDefaultActivity = false;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                return;
            }
            activityChooserView.dismissPopup();
            Intent intentB = ActivityChooserView.this.mAdapter.b().b(ActivityChooserView.this.mAdapter.b().g(ActivityChooserView.this.mAdapter.c()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override
        public void onDismiss() {
            a();
            AbstractC1607b abstractC1607b = ActivityChooserView.this.mProvider;
            if (abstractC1607b != null) {
                abstractC1607b.subUiVisibilityChanged(false);
            }
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.mIsSelectingDefaultActivity) {
                if (i7 > 0) {
                    activityChooserView.mAdapter.b().o(i7);
                    return;
                }
                return;
            }
            if (!activityChooserView.mAdapter.e()) {
                i7++;
            }
            Intent intentB = ActivityChooserView.this.mAdapter.b().b(i7);
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override
        public boolean onLongClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.mDefaultActivityButton) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.mAdapter.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.mIsSelectingDefaultActivity = true;
                activityChooserView2.showPopupUnchecked(activityChooserView2.mInitialActivityCount);
            }
            return true;
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public ActivityChooserModel getDataModel() {
        return this.mAdapter.b();
    }

    ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModelB = this.mAdapter.b();
        if (activityChooserModelB != null) {
            activityChooserModelB.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModelB = this.mAdapter.b();
        if (activityChooserModelB != null) {
            activityChooserModelB.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        this.mActivityChooserContent.layout(0, 0, i9 - i7, i10 - i8);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), 1073741824);
        }
        measureChild(view, i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.mAdapter.g(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i7) {
        this.mDefaultActionButtonContentDescription = i7;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i7) {
        this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i7));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i7) {
        this.mInitialActivityCount = i7;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setProvider(AbstractC1607b abstractC1607b) {
        this.mProvider = abstractC1607b;
    }

    public boolean showPopup() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    void showPopupUnchecked(int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.mAdapter.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        ?? r02 = this.mDefaultActivityButton.getVisibility() == 0 ? 1 : 0;
        int iA = this.mAdapter.a();
        if (i7 == Integer.MAX_VALUE || iA <= i7 + r02) {
            this.mAdapter.j(false);
            this.mAdapter.h(i7);
        } else {
            this.mAdapter.j(true);
            this.mAdapter.h(i7 - 1);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.mIsSelectingDefaultActivity || r02 == 0) {
            this.mAdapter.i(true, r02);
        } else {
            this.mAdapter.i(false, false);
        }
        listPopupWindow.setContentWidth(Math.min(this.mAdapter.f(), this.mListPopupMaxWidth));
        listPopupWindow.show();
        AbstractC1607b abstractC1607b = this.mProvider;
        if (abstractC1607b != null) {
            abstractC1607b.subUiVisibilityChanged(true);
        }
        listPopupWindow.getListView().setContentDescription(getContext().getString(C2454h.f20700c));
        listPopupWindow.getListView().setSelector(new ColorDrawable(0));
    }

    void updateAppearance() {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int iA = this.mAdapter.a();
        int iD = this.mAdapter.d();
        if (iA == 1 || (iA > 1 && iD > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo resolveInfoC = this.mAdapter.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(resolveInfoC.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.mDefaultActionButtonContentDescription, resolveInfoC.loadLabel(packageManager)));
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        } else {
            this.mActivityChooserContent.setBackgroundDrawable(null);
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mModelDataSetObserver = new a();
        this.mOnGlobalLayoutListener = new b();
        this.mInitialActivityCount = 4;
        int[] iArr = C2456j.f20735E;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        this.mInitialActivityCount = typedArrayObtainStyledAttributes.getInt(C2456j.f20742G, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C2456j.f20739F);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C2453g.f20681e, (ViewGroup) this, true);
        g gVar = new g();
        this.mCallbacks = gVar;
        View viewFindViewById = findViewById(C2452f.f20660j);
        this.mActivityChooserContent = viewFindViewById;
        this.mActivityChooserContentBackground = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C2452f.f20668r);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i8 = C2452f.f20673w;
        this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(i8);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C2452f.f20670t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i8);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.mAdapter = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2450d.f20577d));
    }
}
