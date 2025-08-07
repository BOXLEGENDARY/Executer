package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class C1731o extends U {

    private float f12337b = 3.0f;

    private int f12338c = 80;

    private int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1731o.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int i7 = this.f12338c;
        return (i7 == 3 || i7 == 5 || i7 == 8388611 || i7 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override
    public long c(ViewGroup viewGroup, AbstractC1733q abstractC1733q, B b2, B b3) {
        int i7;
        int iCenterX;
        int iCenterY;
        B b8 = b2;
        if (b8 == null && b3 == null) {
            return 0L;
        }
        Rect rectT = abstractC1733q.t();
        if (b3 == null || e(b8) == 0) {
            i7 = -1;
        } else {
            b8 = b3;
            i7 = 1;
        }
        int iF = f(b8);
        int iG = g(b8);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (rectT != null) {
            iCenterX = rectT.centerX();
            iCenterY = rectT.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fH = h(viewGroup, iF, iG, iCenterX, iCenterY, iRound, iRound2, width, height) / i(viewGroup);
        long jS = abstractC1733q.s();
        if (jS < 0) {
            jS = 300;
        }
        return Math.round(((jS * i7) / this.f12337b) * fH);
    }

    public void j(int i7) {
        this.f12338c = i7;
    }
}
