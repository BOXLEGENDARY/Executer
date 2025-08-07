package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

public class b implements LeadingMarginSpan {
    private static final boolean y = false;
    private H9.c d;
    private final Paint e = g.a();
    private final RectF i = g.c();
    private final Rect v = g.b();
    private final int w;

    public b(@NonNull H9.c cVar, int i) {
        this.d = cVar;
        this.w = i;
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        if (z && N9.c.b(i6, charSequence, this)) {
            this.e.set(paint);
            this.d.g(this.e);
            int iSave = canvas.save();
            try {
                int iJ = this.d.j();
                int iL = this.d.l((int) ((this.e.descent() - this.e.ascent()) + 0.5f));
                int i10 = (iJ - iL) / 2;
                if (y) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iJ * this.w)) : (iJ * this.w) - i;
                    int i11 = i + (i10 * i2);
                    int i12 = (i2 * iL) + i11;
                    int i13 = i2 * width;
                    iMin = Math.min(i11, i12) + i13;
                    iMax = Math.max(i11, i12) + i13;
                } else {
                    if (i2 <= 0) {
                        i -= iJ;
                    }
                    iMin = i + i10;
                    iMax = iMin + iL;
                }
                int iDescent = (i4 + ((int) (((this.e.descent() + this.e.ascent()) / 2.0f) + 0.5f))) - (iL / 2);
                int i14 = iL + iDescent;
                int i15 = this.w;
                if (i15 == 0 || i15 == 1) {
                    this.i.set(iMin, iDescent, iMax, i14);
                    this.e.setStyle(this.w == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.i, this.e);
                } else {
                    this.v.set(iMin, iDescent, iMax, i14);
                    this.e.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.v, this.e);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return this.d.j();
    }
}
