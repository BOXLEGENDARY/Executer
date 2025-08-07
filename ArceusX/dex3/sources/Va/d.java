package va;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lva/d;", "T", "Lva/e;", "Lkotlin/Function1;", "Lta/a;", "number", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lkotlin/jvm/functions/Function1;IILjava/util/List;)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "I", "c", "d", "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d<T> implements e<T> {

    @NotNull
    private final Function1<T, C0804a> number;

    private final int minDigits;

    private final int maxDigits;

    @NotNull
    private final List<Integer> zerosToAdd;

    public d(@NotNull Function1<? super T, C0804a> function1, int i, int i2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(function1, "number");
        Intrinsics.checkNotNullParameter(list, "zerosToAdd");
        this.number = function1;
        this.minDigits = i;
        this.maxDigits = i2;
        this.zerosToAdd = list;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is not in range 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is not in range " + i + "..9").toString());
        }
    }
}
