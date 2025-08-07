package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.C2456j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    private OnInflateListener mInflateListener;
    private int mInflatedId;
    private WeakReference<View> mInflatedViewRef;
    private LayoutInflater mInflater;
    private int mLayoutResource;

    public interface OnInflateListener {
        void onInflate(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.mInflatedId;
    }

    public LayoutInflater getLayoutInflater() {
        return this.mInflater;
    }

    public int getLayoutResource() {
        return this.mLayoutResource;
    }

    public View inflate() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.mLayoutResource == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.mInflater;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.mLayoutResource, viewGroup, false);
        int i7 = this.mInflatedId;
        if (i7 != -1) {
            viewInflate.setId(i7);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.mInflatedViewRef = new WeakReference<>(viewInflate);
        OnInflateListener onInflateListener = this.mInflateListener;
        if (onInflateListener != null) {
            onInflateListener.onInflate(this, viewInflate);
        }
        return viewInflate;
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.mInflatedId = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.mLayoutResource = i7;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.mInflateListener = onInflateListener;
    }

    @Override
    public void setVisibility(int i7) {
        WeakReference<View> weakReference = this.mInflatedViewRef;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            inflate();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mLayoutResource = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.f20775Q3, i7, 0);
        this.mInflatedId = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20783T3, -1);
        this.mLayoutResource = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20781S3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C2456j.f20778R3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
