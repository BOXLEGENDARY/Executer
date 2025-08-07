package w4;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import c4.C1746b;
import c4.C1755k;
import r4.C2753b;
import r4.C2754c;
import x4.C2990a;

public class C2971a extends AppCompatTextView {
    public C2971a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void d(Resources.Theme theme, int i7) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i7, C1755k.f13246q4);
        int iQ = q(getContext(), typedArrayObtainStyledAttributes, C1755k.f13260s4, C1755k.f13267t4);
        typedArrayObtainStyledAttributes.recycle();
        if (iQ >= 0) {
            setLineHeight(iQ);
        }
    }

    private static boolean g(Context context) {
        return C2753b.b(context, C1746b.f12738d0, true);
    }

    private static int o(Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1755k.f13274u4, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1755k.f13281v4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void p(AttributeSet attributeSet, int i7, int i8) throws Resources.NotFoundException {
        int iO;
        Context context = getContext();
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (r(context, theme, attributeSet, i7, i8) || (iO = o(theme, attributeSet, i7, i8)) == -1) {
                return;
            }
            d(theme, iO);
        }
    }

    private static int q(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i7 = 0; i7 < iArr.length && iC < 0; i7++) {
            iC = C2754c.c(context, typedArray, iArr[i7], -1);
        }
        return iC;
    }

    private static boolean r(Context context, Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1755k.f13274u4, i7, i8);
        int iQ = q(context, typedArrayObtainStyledAttributes, C1755k.f13288w4, C1755k.f13296x4);
        typedArrayObtainStyledAttributes.recycle();
        return iQ != -1;
    }

    @Override
    public void setTextAppearance(Context context, int i7) throws Resources.NotFoundException {
        super.setTextAppearance(context, i7);
        if (g(context)) {
            d(context.getTheme(), i7);
        }
    }

    public C2971a(Context context, AttributeSet attributeSet, int i7) throws Resources.NotFoundException {
        super(C2990a.c(context, attributeSet, i7, 0), attributeSet, i7);
        p(attributeSet, i7, 0);
    }
}
