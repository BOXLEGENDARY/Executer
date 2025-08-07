package u5;

import P9.o;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ll8/b;", "", "LP9/o;", "Lm8/a;", "result", "", "isActiveAnalyzer", "<init>", "(Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AnalyzerResult {

    @NotNull
    private final Object result;

    private final boolean isActiveAnalyzer;

    public AnalyzerResult(@NotNull Object obj, boolean z) {
        this.result = obj;
        this.isActiveAnalyzer = z;
    }

    @NotNull
    public final Object getResult() {
        return this.result;
    }

    public final boolean getIsActiveAnalyzer() {
        return this.isActiveAnalyzer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzerResult)) {
            return false;
        }
        AnalyzerResult analyzerResult = (AnalyzerResult) other;
        return o.d(this.result, analyzerResult.result) && this.isActiveAnalyzer == analyzerResult.isActiveAnalyzer;
    }

    public int hashCode() {
        return (o.f(this.result) * 31) + Boolean.hashCode(this.isActiveAnalyzer);
    }

    @NotNull
    public String toString() {
        return "AnalyzerResult(result=" + o.i(this.result) + ", isActiveAnalyzer=" + this.isActiveAnalyzer + ")";
    }
}
