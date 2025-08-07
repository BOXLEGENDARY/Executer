package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.j;
import l0.e;
import l0.g;
import l0.l;

public class Flow extends j {

    private g f9791E;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        this.f9791E = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f10142a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.f10147b1) {
                    this.f9791E.n2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f10152c1) {
                    this.f9791E.t1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.m1) {
                    this.f9791E.y1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.n1) {
                    this.f9791E.v1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f10157d1) {
                    this.f9791E.w1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f10164e1) {
                    this.f9791E.z1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f10171f1) {
                    this.f9791E.x1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f10178g1) {
                    this.f9791E.u1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.M1) {
                    this.f9791E.s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.C1) {
                    this.f9791E.h2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.L1) {
                    this.f9791E.r2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.w1) {
                    this.f9791E.b2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.E1) {
                    this.f9791E.j2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f10289y1) {
                    this.f9791E.d2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.G1) {
                    this.f9791E.l2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.A1) {
                    this.f9791E.f2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.v1) {
                    this.f9791E.a2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.D1) {
                    this.f9791E.i2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.x1) {
                    this.f9791E.c2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.F1) {
                    this.f9791E.k2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.J1) {
                    this.f9791E.p2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.z1) {
                    this.f9791E.e2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.I1) {
                    this.f9791E.o2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.B1) {
                    this.f9791E.g2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.K1) {
                    this.f9791E.q2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.H1) {
                    this.f9791E.m2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f9893v = this.f9791E;
        n();
    }

    @Override
    public void i(e eVar, boolean z7) {
        this.f9791E.f1(z7);
    }

    @Override
    public void o(l lVar, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.n1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.i1(), lVar.h1());
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        o(this.f9791E, i7, i8);
    }

    public void setFirstHorizontalBias(float f7) {
        this.f9791E.a2(f7);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f9791E.b2(i7);
        requestLayout();
    }

    public void setFirstVerticalBias(float f7) {
        this.f9791E.c2(f7);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f9791E.d2(i7);
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f9791E.e2(i7);
        requestLayout();
    }

    public void setHorizontalBias(float f7) {
        this.f9791E.f2(f7);
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f9791E.g2(i7);
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f9791E.h2(i7);
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f9791E.m2(i7);
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f9791E.n2(i7);
        requestLayout();
    }

    public void setPadding(int i7) {
        this.f9791E.t1(i7);
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f9791E.u1(i7);
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f9791E.w1(i7);
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f9791E.x1(i7);
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f9791E.z1(i7);
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f9791E.o2(i7);
        requestLayout();
    }

    public void setVerticalBias(float f7) {
        this.f9791E.p2(f7);
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f9791E.q2(i7);
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f9791E.r2(i7);
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f9791E.s2(i7);
        requestLayout();
    }
}
