package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

public final class p extends j {

    private static Paint f10894y;

    public p(h hVar) {
        super(hVar);
    }

    private static Paint c() {
        if (f10894y == null) {
            TextPaint textPaint = new TextPaint();
            f10894y = textPaint;
            textPaint.setColor(f.b().c());
            f10894y.setStyle(Paint.Style.FILL);
        }
        return f10894y;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        if (f.b().i()) {
            canvas.drawRect(f7, i9, f7 + b(), i11, c());
        }
        a().a(canvas, f7, i10, paint);
    }
}
