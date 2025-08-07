package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

class e implements f.d {

    private static final ThreadLocal<StringBuilder> f10810b = new ThreadLocal<>();

    private final TextPaint f10811a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f10811a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f10810b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override
    public boolean a(CharSequence charSequence, int i7, int i8, int i9) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i7 < i8) {
            sbB.append(charSequence.charAt(i7));
            i7++;
        }
        return androidx.core.graphics.b.a(this.f10811a, sbB.toString());
    }
}
