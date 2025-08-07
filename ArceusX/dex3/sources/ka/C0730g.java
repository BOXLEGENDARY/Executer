package ka;

import com.roblox.client.personasdk.R;
import java.util.Set;
import ka.M;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lo9/g;", "", "", "", "initialValue", "<init>", "(Ljava/util/Set;)V", "Lka/y;", "a", "Lka/y;", "_stringSetValue", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onChanged", "value", "()Ljava/util/Set;", "c", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0730g {

    @NotNull
    private final y<Set<String>> _stringSetValue;

    @NotNull
    private final g<Set<String>> onChanged;

    public C0730g(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "initialValue");
        y<Set<String>> yVarA = M.a(set);
        this._stringSetValue = yVarA;
        this.onChanged = i.m(yVarA, 1);
    }

    @NotNull
    public final g<Set<String>> a() {
        return this.onChanged;
    }

    @NotNull
    public final Set<String> b() {
        return (Set) this._stringSetValue.getValue();
    }

    public final void c(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "value");
        this._stringSetValue.setValue(set);
    }
}
