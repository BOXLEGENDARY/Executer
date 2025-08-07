package va;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lva/g;", "T", "Lva/e;", "Lkotlin/Function1;", "", "number", "zeroPadding", "outputPlusOnExceededWidth", "<init>", "(Lkotlin/jvm/functions/Function1;ILjava/lang/Integer;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "I", "c", "Ljava/lang/Integer;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g<T> implements e<T> {

    @NotNull
    private final Function1<T, Integer> number;

    private final int zeroPadding;

    private final Integer outputPlusOnExceededWidth;

    public g(@NotNull Function1<? super T, Integer> function1, int i, Integer num) {
        Intrinsics.checkNotNullParameter(function1, "number");
        this.number = function1;
        this.zeroPadding = i;
        this.outputPlusOnExceededWidth = num;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (i <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i + ") exceeds the length of an Int").toString());
    }
}
