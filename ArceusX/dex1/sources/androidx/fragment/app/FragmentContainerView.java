package androidx.fragment.app;

import S5.Cg.XjqcfAbdbc;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w7.Jld.EZYiRMRTxKdo;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020&H\u0001¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u001f\u0010:\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00028\u0000\"\n\b\u0000\u0010@*\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010K\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010,\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010L¨\u0006M"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", BuildConfig.FLAVOR, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/View;", "v", BuildConfig.FLAVOR, "a", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", BuildConfig.FLAVOR, "drawingTime", BuildConfig.FLAVOR, "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "d", "Ljava/util/List;", "disappearingFragmentChildren", "e", "transitioningFragmentViews", "i", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "Z", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    private final List<View> disappearingFragmentChildren;

    private final List<View> transitioningFragmentViews;

    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    private boolean drawDisappearingViewsFirst;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "a", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        public static final a f11017a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v7, WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, EZYiRMRTxKdo.KOUi);
            Intrinsics.checkNotNullParameter(v7, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v7, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a(View v7) {
        if (this.transitioningFragmentViews.contains(v7)) {
            this.disappearingFragmentChildren.add(v7);
        }
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (FragmentManager.D0(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        WindowInsetsCompat windowInsetsCompatZ;
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f11017a;
            Intrinsics.d(onApplyWindowInsetsListener);
            windowInsetsCompatZ = WindowInsetsCompat.toWindowInsetsCompat(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            windowInsetsCompatZ = Z.Z(this, windowInsetsCompat);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatZ, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatZ.isConsumed()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                Z.g(getChildAt(i7), windowInsetsCompatZ);
            }
        }
        return insets;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.m0(this).j0(getId());
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    @Override
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override
    public void removeViewAt(int index) {
        View childAt = getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(childAt, "view");
        a(childAt);
        super.removeViewAt(index);
    }

    @Override
    public void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override
    public void removeViews(int start, int count) {
        int i7 = start + count;
        for (int i8 = start; i8 < i7; i8++) {
            View childAt = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(childAt, "view");
            a(childAt);
        }
        super.removeViews(start, count);
    }

    @Override
    public void removeViewsInLayout(int start, int count) {
        int i7 = start + count;
        for (int i8 = start; i8 < i7; i8++) {
            View childAt = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(start, count);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.drawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.applyWindowInsetsListener = listener;
    }

    @Override
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7) {
        String str;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, XjqcfAbdbc.xJCCa);
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = M0.c.f2351e;
            Intrinsics.checkNotNullExpressionValue(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(M0.c.f2352f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = M0.c.f2351e;
        Intrinsics.checkNotNullExpressionValue(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(M0.c.f2352f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(M0.c.f2353g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentJ0 = fragmentManager.j0(id);
        if (classAttribute != null && fragmentJ0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = fragmentManager.u0().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.p().p(true).c(this, fragmentA, string).j();
        }
        fragmentManager.b1(this);
    }
}
