package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import l0.l;

public abstract class j extends b {

    private boolean f10300C;

    private boolean f10301D;

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f10142a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.f10185h1) {
                    this.f10300C = true;
                } else if (index == i.o1) {
                    this.f10301D = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o(l lVar, int i7, int i8) {
    }

    @Override
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f10300C || this.f10301D) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i7 = 0; i7 < this.f9891e; i7++) {
                View viewById = constraintLayout.getViewById(this.f9890d[i7]);
                if (viewById != null) {
                    if (this.f10300C) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f10301D && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        d();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        d();
    }
}
