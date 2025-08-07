package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

public class a implements LeadingMarginSpan {
    private final H9.c d;
    private final Rect e = g.b();
    private final Paint i = g.a();

    public a(@NonNull H9.c cVar) {
        this.d = cVar;
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iK = this.d.k();
        this.i.set(paint);
        this.d.a(this.i);
        int i10 = i2 * iK;
        int i11 = i + i10;
        int i12 = i10 + i11;
        this.e.set(Math.min(i11, i12), i3, Math.max(i11, i12), i5);
        canvas.drawRect(this.e, this.i);
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return this.d.j();
    }
}
