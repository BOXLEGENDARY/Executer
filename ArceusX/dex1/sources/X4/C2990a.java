package x4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import c4.C1746b;

public class C2990a {

    private static final int[] f24327a = {R.attr.theme, C1746b.f12742f0};

    private static final int[] f24328b = {C1746b.f12707C};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24327a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24328b, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i7, int i8) {
        int iB = b(context, attributeSet, i7, i8);
        boolean z7 = (context instanceof d) && ((d) context).c() == iB;
        if (iB == 0 || z7) {
            return context;
        }
        d dVar = new d(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            dVar.getTheme().applyStyle(iA, true);
        }
        return dVar;
    }
}
