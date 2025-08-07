package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

public class f extends MetricAffectingSpan implements LeadingMarginSpan {
    private final H9.c d;
    private final Rect e = g.b();
    private final Paint i = g.a();
    private final int v;

    public f(@NonNull H9.c cVar, int i) {
        this.d = cVar;
        this.v = i;
    }

    private void a(TextPaint textPaint) {
        this.d.e(textPaint, this.v);
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i10 = this.v;
        if ((i10 == 1 || i10 == 2) && N9.c.a(i7, charSequence, this)) {
            this.i.set(paint);
            this.d.d(this.i);
            float strokeWidth = this.i.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i11 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                this.e.set(i, i11, width, i5);
                canvas.drawRect(this.e, this.i);
            }
        }
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
