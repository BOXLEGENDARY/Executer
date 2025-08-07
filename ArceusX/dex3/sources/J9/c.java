package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

public class c extends MetricAffectingSpan implements LeadingMarginSpan {
    private final H9.c d;
    private final Rect e = g.b();
    private final Paint i = g.a();

    public c(@NonNull H9.c cVar) {
        this.d = cVar;
    }

    private void a(TextPaint textPaint) {
        this.d.b(textPaint);
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        this.i.setStyle(Paint.Style.FILL);
        this.i.setColor(this.d.n(paint));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        this.e.set(i, i3, width, i5);
        canvas.drawRect(this.e, this.i);
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return this.d.o();
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
