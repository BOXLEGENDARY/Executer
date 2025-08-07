package androidx.transition;

import S5.Cg.XjqcfAbdbc;
import android.view.View;

public abstract class U extends y {

    private static final String[] f12254a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(B b2, int i7) {
        int[] iArr;
        if (b2 == null || (iArr = (int[]) b2.f12209a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i7];
    }

    @Override
    public void a(B b2) {
        View view = b2.f12210b;
        Integer numValueOf = (Integer) b2.f12209a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        b2.f12209a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        b2.f12209a.put("android:visibilityPropagation:center", iArr);
    }

    @Override
    public String[] b() {
        return f12254a;
    }

    public int e(B b2) {
        Integer num;
        if (b2 == null || (num = (Integer) b2.f12209a.get(XjqcfAbdbc.RzEaZRmuQUDNF)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(B b2) {
        return d(b2, 0);
    }

    public int g(B b2) {
        return d(b2, 1);
    }
}
