package J9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class h implements LeadingMarginSpan {
    private final H9.c d;
    private final String e;
    private final Paint i = g.a();
    private int v;

    public h(@NonNull H9.c cVar, @NonNull String str) {
        this.d = cVar;
        this.e = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
            if (hVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (h hVar : hVarArr) {
                    hVar.v = (int) (paint.measureText(hVar.e) + 0.5f);
                }
            }
        }
    }

    @Override
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && N9.c.b(i6, charSequence, this)) {
            this.i.set(paint);
            this.d.g(this.i);
            int iMeasureText = (int) (this.i.measureText(this.e) + 0.5f);
            int iJ = this.d.j();
            if (iMeasureText > iJ) {
                this.v = iMeasureText;
                iJ = iMeasureText;
            } else {
                this.v = 0;
            }
            canvas.drawText(this.e, i2 > 0 ? (i + (iJ * i2)) - iMeasureText : i + (i2 * iJ) + (iJ - iMeasureText), i4, this.i);
        }
    }

    @Override
    public int getLeadingMargin(boolean z) {
        return Math.max(this.v, this.d.j());
    }
}
