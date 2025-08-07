package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import g.C2456j;

class i extends PopupWindow {

    private static final boolean f9290b = false;

    private boolean f9291a;

    public i(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        a(context, attributeSet, i7, i8);
    }

    private void a(Context context, AttributeSet attributeSet, int i7, int i8) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2456j.a2, i7, i8);
        int i9 = C2456j.c2;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
            b(tintTypedArrayObtainStyledAttributes.getBoolean(i9, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.b2));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void b(boolean z7) {
        if (f9290b) {
            this.f9291a = z7;
        } else {
            androidx.core.widget.i.a(this, z7);
        }
    }

    @Override
    public void showAsDropDown(View view, int i7, int i8) {
        if (f9290b && this.f9291a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f9290b && this.f9291a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f9290b && this.f9291a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
