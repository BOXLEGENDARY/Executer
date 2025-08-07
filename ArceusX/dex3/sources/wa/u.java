package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lwa/u;", "Output", "Lwa/o;", "Lkotlin/Function1;", "", "operation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "storage", "", "input", "", "startIndex", "Lwa/k;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class u<Output> implements o<Output> {

    @NotNull
    private final Function1<Output, Unit> operation;

    public u(@NotNull Function1<? super Output, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "operation");
        this.operation = function1;
    }

    @Override
    @NotNull
    public Object a(Output storage, @NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.operation.invoke(storage);
        return k.INSTANCE.b(startIndex);
    }
}
