package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import g.C2447a;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private c mTabClickListener;
    LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private Spinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimator mVisibilityAnim;

    protected class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.mVisibilityAnim = null;
            scrollingTabContainerView.setVisibility(this.mFinalVisibility);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i7) {
            this.mFinalVisibility = i7;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    class a implements Runnable {

        final View f9192d;

        a(View view) {
            this.f9192d = view;
        }

        @Override
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f9192d.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f9192d.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.mTabSelector = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override
        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        @Override
        public Object getItem(int i7) {
            return ((d) ScrollingTabContainerView.this.mTabLayout.getChildAt(i7)).b();
        }

        @Override
        public long getItemId(int i7) {
            return i7;
        }

        @Override
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((a.c) getItem(i7), true);
            }
            ((d) view).a((a.c) getItem(i7));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i7);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        private final int[] f9196d;

        private a.c f9197e;

        private TextView f9198i;

        private ImageView f9199v;

        private View f9200w;

        public d(Context context, a.c cVar, boolean z7) {
            int i7 = C2447a.f20543e;
            super(context, null, i7);
            int[] iArr = {R.attr.background};
            this.f9196d = iArr;
            this.f9197e = cVar;
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, iArr, i7, 0);
            if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            if (z7) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f9197e = cVar;
            c();
        }

        public a.c b() {
            return this.f9197e;
        }

        public void c() {
            a.c cVar = this.f9197e;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f9200w = viewB;
                TextView textView = this.f9198i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9199v;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9199v.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f9200w;
            if (view != null) {
                removeView(view);
                this.f9200w = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f9199v == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f9199v = appCompatImageView;
                }
                this.f9199v.setImageDrawable(drawableC);
                this.f9199v.setVisibility(0);
            } else {
                ImageView imageView2 = this.f9199v;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f9199v.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f9198i;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f9198i.setText((CharSequence) null);
                }
            } else {
                if (this.f9198i == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C2447a.f20544f);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f9198i = appCompatTextView;
                }
                this.f9198i.setText(charSequenceD);
                this.f9198i.setVisibility(0);
            }
            ImageView imageView3 = this.f9199v;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            TooltipCompat.setTooltipText(this, zIsEmpty ? cVar.a() : null);
        }

        @Override
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override
        public void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0) {
                int measuredWidth = getMeasuredWidth();
                int i9 = ScrollingTabContainerView.this.mMaxTabWidth;
                if (measuredWidth > i9) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
                }
            }
        }

        @Override
        public void setSelected(boolean z7) {
            boolean z8 = isSelected() != z7;
            super.setSelected(z7);
            if (z8 && z7) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        setContentHeight(aVarB.f());
        this.mStackedTabMaxWidth = aVarB.e();
        LinearLayoutCompat linearLayoutCompatCreateTabLayout = createTabLayout();
        this.mTabLayout = linearLayoutCompatCreateTabLayout;
        addView(linearLayoutCompatCreateTabLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C2447a.f20547i);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C2447a.f20542d);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean isCollapsed() {
        Spinner spinner = this.mTabSpinner;
        return spinner != null && spinner.getParent() == this;
    }

    private void performCollapse() {
        if (isCollapsed()) {
            return;
        }
        if (this.mTabSpinner == null) {
            this.mTabSpinner = createSpinner();
        }
        removeView(this.mTabLayout);
        addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
        if (this.mTabSpinner.getAdapter() == null) {
            this.mTabSpinner.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mTabSelector = null;
        }
        this.mTabSpinner.setSelection(this.mSelectedTabIndex);
    }

    private boolean performExpand() {
        if (!isCollapsed()) {
            return false;
        }
        removeView(this.mTabSpinner);
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }

    public void addTab(a.c cVar, boolean z7) {
        d dVarCreateTabView = createTabView(cVar, false);
        this.mTabLayout.addView(dVarCreateTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z7) {
            dVarCreateTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i7) {
        View childAt = this.mTabLayout.getChildAt(i7);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.mTabSelector = aVar;
        post(aVar);
    }

    public void animateToVisibility(int i7) {
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i7 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(sAlphaInterpolator);
            viewPropertyAnimatorAlpha.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorAlpha, i7));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(sAlphaInterpolator);
        viewPropertyAnimatorAlpha2.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimatorAlpha2, i7));
        viewPropertyAnimatorAlpha2.start();
    }

    d createTabView(a.c cVar, boolean z7) {
        d dVar = new d(getContext(), cVar, z7);
        if (z7) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
        } else {
            dVar.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new c();
            }
            dVar.setOnClickListener(this.mTabClickListener);
        }
        return dVar;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.mStackedTabMaxWidth = aVarB.e();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
        ((d) view).b().e();
    }

    @Override
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        boolean z7 = mode == 1073741824;
        setFillViewport(z7);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i7) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i7) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z7 || !this.mAllowCollapse) {
            performExpand();
        } else {
            this.mTabLayout.measure(0, iMakeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(i7)) {
                performCollapse();
            } else {
                performExpand();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i7, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z7 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.mSelectedTabIndex);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i7) {
        this.mTabLayout.removeViewAt(i7);
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z7) {
        this.mAllowCollapse = z7;
    }

    public void setContentHeight(int i7) {
        this.mContentHeight = i7;
        requestLayout();
    }

    public void setTabSelected(int i7) {
        this.mSelectedTabIndex = i7;
        int childCount = this.mTabLayout.getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i8);
            boolean z7 = i8 == i7;
            childAt.setSelected(z7);
            if (z7) {
                animateToTab(i7);
            }
            i8++;
        }
        Spinner spinner = this.mTabSpinner;
        if (spinner == null || i7 < 0) {
            return;
        }
        spinner.setSelection(i7);
    }

    public void updateTab(int i7) {
        ((d) this.mTabLayout.getChildAt(i7)).c();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(a.c cVar, int i7, boolean z7) {
        d dVarCreateTabView = createTabView(cVar, false);
        this.mTabLayout.addView(dVarCreateTabView, i7, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z7) {
            dVarCreateTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
