package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

public class k implements LeadingMarginSpan {
    private final H9.c d;
    private final Rect e = g.b();
    private final Paint i = g.a();

    public k(@NonNull H9.c cVar) {
        this.d = cVar;
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i10 = i3 + ((i5 - i3) / 2);
        this.i.set(paint);
        this.d.h(this.i);
        int strokeWidth = (int) ((((int) (this.i.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        this.e.set(i, i10 - strokeWidth, width, i10 + strokeWidth);
        canvas.drawRect(this.e, this.i);
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
