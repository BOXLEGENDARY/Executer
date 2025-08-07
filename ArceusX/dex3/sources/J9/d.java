package J9;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

public class d extends MetricAffectingSpan {
    private final H9.c d;

    public d(@NonNull H9.c cVar) {
        this.d = cVar;
    }

    private void a(TextPaint textPaint) {
        this.d.c(textPaint);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
        textPaint.bgColor = this.d.m(textPaint);
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
