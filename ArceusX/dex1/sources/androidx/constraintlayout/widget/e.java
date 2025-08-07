package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class e extends ViewGroup {

    d f10014d;

    @Override
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f10014d == null) {
            this.f10014d = new d();
        }
        this.f10014d.g(this);
        return this.f10014d;
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public static class a extends ConstraintLayout.b {

        public float f10015A0;

        public float f10016B0;

        public float f10017p0;

        public boolean f10018q0;

        public float f10019r0;

        public float f10020s0;

        public float f10021t0;

        public float f10022u0;

        public float f10023v0;

        public float f10024w0;

        public float f10025x0;

        public float f10026y0;

        public float f10027z0;

        public a(int i7, int i8) {
            super(i7, i8);
            this.f10017p0 = 1.0f;
            this.f10018q0 = false;
            this.f10019r0 = 0.0f;
            this.f10020s0 = 0.0f;
            this.f10021t0 = 0.0f;
            this.f10022u0 = 0.0f;
            this.f10023v0 = 1.0f;
            this.f10024w0 = 1.0f;
            this.f10025x0 = 0.0f;
            this.f10026y0 = 0.0f;
            this.f10027z0 = 0.0f;
            this.f10015A0 = 0.0f;
            this.f10016B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10017p0 = 1.0f;
            this.f10018q0 = false;
            this.f10019r0 = 0.0f;
            this.f10020s0 = 0.0f;
            this.f10021t0 = 0.0f;
            this.f10022u0 = 0.0f;
            this.f10023v0 = 1.0f;
            this.f10024w0 = 1.0f;
            this.f10025x0 = 0.0f;
            this.f10026y0 = 0.0f;
            this.f10027z0 = 0.0f;
            this.f10015A0 = 0.0f;
            this.f10016B0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.O2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.P2) {
                    this.f10017p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10017p0);
                } else if (index == i.a3) {
                    this.f10019r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10019r0);
                    this.f10018q0 = true;
                } else if (index == i.X2) {
                    this.f10021t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10021t0);
                } else if (index == i.Y2) {
                    this.f10022u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10022u0);
                } else if (index == i.W2) {
                    this.f10020s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10020s0);
                } else if (index == i.U2) {
                    this.f10023v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10023v0);
                } else if (index == i.V2) {
                    this.f10024w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10024w0);
                } else if (index == i.Q2) {
                    this.f10025x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10025x0);
                } else if (index == i.R2) {
                    this.f10026y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10026y0);
                } else if (index == i.S2) {
                    this.f10027z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10027z0);
                } else if (index == i.T2) {
                    this.f10015A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10015A0);
                } else if (index == i.Z2) {
                    this.f10016B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f10016B0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
