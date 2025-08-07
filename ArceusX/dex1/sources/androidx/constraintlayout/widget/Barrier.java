package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import l0.C2525a;

public class Barrier extends b {

    private int f9792C;

    private int f9793D;

    private C2525a f9794E;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(l0.e eVar, int i7, boolean z7) {
        this.f9793D = i7;
        if (z7) {
            int i8 = this.f9792C;
            if (i8 == 5) {
                this.f9793D = 1;
            } else if (i8 == 6) {
                this.f9793D = 0;
            }
        } else {
            int i9 = this.f9792C;
            if (i9 == 5) {
                this.f9793D = 0;
            } else if (i9 == 6) {
                this.f9793D = 1;
            }
        }
        if (eVar instanceof C2525a) {
            ((C2525a) eVar).m1(this.f9793D);
        }
    }

    public int getMargin() {
        return this.f9794E.i1();
    }

    public int getType() {
        return this.f9792C;
    }

    @Override
    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        this.f9794E = new C2525a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f10142a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.p1) {
                    this.f9794E.l1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.r1) {
                    this.f9794E.n1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f9893v = this.f9794E;
        n();
    }

    @Override
    public void i(l0.e eVar, boolean z7) {
        p(eVar, this.f9792C, z7);
    }

    public boolean o() {
        return this.f9794E.g1();
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f9794E.l1(z7);
    }

    public void setDpMargin(int i7) {
        this.f9794E.n1((int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i7) {
        this.f9794E.n1(i7);
    }

    public void setType(int i7) {
        this.f9792C = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
