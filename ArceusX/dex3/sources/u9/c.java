package u9;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu9/c;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "paint", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "textPaint", "updateDrawState", "d", "Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class c extends MetricAffectingSpan {

    @NotNull
    private final Typeface typeface;

    public c(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    @Override
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTypeface(this.typeface);
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.typeface);
        paint.setFlags(paint.getFlags() | 128);
    }
}
