package ua;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lua/f;", "T", "Lua/h;", "", "Lua/s;", "formats", "<init>", "(Ljava/util/List;)V", "Lva/e;", "a", "()Lva/e;", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "cachedFormatter", "c", "Lwa/q;", "cachedParser", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0817f<T> extends ConcatenatedFormatStructure<T> {

    @NotNull
    private final va.e<T> cachedFormatter;

    @NotNull
    private final wa.q<T> cachedParser;

    public C0817f(@NotNull List<? extends s<? super T>> list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "formats");
        this.cachedFormatter = super.a();
        this.cachedParser = super.b();
    }

    @Override
    @NotNull
    public va.e<T> a() {
        return this.cachedFormatter;
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        return this.cachedParser;
    }
}
