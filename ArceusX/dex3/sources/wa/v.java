package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import wa.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwa/v;", "Receiver", "Lwa/e;", "", "minLength", "maxLength", "Lwa/a;", "setter", "", "name", "", "multiplyByMinus1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lwa/a;Ljava/lang/String;Z)V", "storage", "", "input", "start", "end", "Lwa/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lwa/g;", "c", "Ljava/lang/Integer;", "d", "e", "Lwa/a;", "f", "Z", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class v<Receiver> extends e<Receiver> {

    private final Integer minLength;

    private final Integer maxLength;

    @NotNull
    private final a<Receiver, Integer> setter;

    private final boolean multiplyByMinus1;

    public v(Integer num, Integer num2, @NotNull a<? super Receiver, Integer> aVar, @NotNull String str, boolean z) {
        super(Intrinsics.b(num, num2) ? num : null, str, null);
        Intrinsics.checkNotNullParameter(aVar, "setter");
        Intrinsics.checkNotNullParameter(str, "name");
        this.minLength = num;
        this.maxLength = num2;
        this.setter = aVar;
        this.multiplyByMinus1 = z;
        if (getLength() == null || new IntRange(1, 9).m(getLength().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + getWhatThisExpects() + ": " + getLength()).toString());
    }

    @Override
    public g a(Receiver storage, @NotNull CharSequence input, int start, int end) {
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = this.maxLength;
        if (num != null && end - start > num.intValue()) {
            return new g.d(this.maxLength.intValue());
        }
        Integer num2 = this.minLength;
        if (num2 != null && end - start < num2.intValue()) {
            return new g.c(this.minLength.intValue());
        }
        Integer numE = f.e(input, start, end);
        if (numE == null) {
            return g.b.a;
        }
        a<Receiver, Integer> aVar = this.setter;
        boolean z = this.multiplyByMinus1;
        int iIntValue = numE.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        return f.f(aVar, storage, Integer.valueOf(iIntValue));
    }
}
