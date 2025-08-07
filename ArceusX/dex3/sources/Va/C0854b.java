package va;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012*\u0010\u0007\u001a&\u0012\"\u0012 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tR8\u0010\u0007\u001a&\u0012\"\u0012 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lva/b;", "T", "Lva/e;", "", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "formatters", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0854b<T> implements e<T> {

    @NotNull
    private final List<Pair<Function1<T, Boolean>, e<T>>> formatters;

    public C0854b(@NotNull List<? extends Pair<? extends Function1<? super T, Boolean>, ? extends e<? super T>>> list) {
        Intrinsics.checkNotNullParameter(list, "formatters");
        this.formatters = list;
    }
}
