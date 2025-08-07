package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public abstract class j extends ReplacementSpan {

    private final h f10865e;

    private final Paint.FontMetricsInt f10864d = new Paint.FontMetricsInt();

    private short f10866i = -1;

    private short f10867v = -1;

    private float f10868w = 1.0f;

    j(h hVar) {
        x0.g.h(hVar, "metadata cannot be null");
        this.f10865e = hVar;
    }

    public final h a() {
        return this.f10865e;
    }

    final int b() {
        return this.f10866i;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f10864d);
        Paint.FontMetricsInt fontMetricsInt2 = this.f10864d;
        this.f10868w = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f10865e.e();
        this.f10867v = (short) (this.f10865e.e() * this.f10868w);
        short sI = (short) (this.f10865e.i() * this.f10868w);
        this.f10866i = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f10864d;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
