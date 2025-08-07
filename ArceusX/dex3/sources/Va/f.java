package va;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lva/f;", "T", "Lva/e;", "formatter", "Lkotlin/Function1;", "", "allSubFormatsNegative", "alwaysOutputSign", "<init>", "(Lva/e;Lkotlin/jvm/functions/Function1;Z)V", "a", "Lva/e;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Z", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f<T> implements e<T> {

    @NotNull
    private final e<T> formatter;

    @NotNull
    private final Function1<T, Boolean> allSubFormatsNegative;

    private final boolean alwaysOutputSign;

    public f(@NotNull e<? super T> eVar, @NotNull Function1<? super T, Boolean> function1, boolean z) {
        Intrinsics.checkNotNullParameter(eVar, "formatter");
        Intrinsics.checkNotNullParameter(function1, "allSubFormatsNegative");
        this.formatter = eVar;
        this.allSubFormatsNegative = function1;
        this.alwaysOutputSign = z;
    }
}
