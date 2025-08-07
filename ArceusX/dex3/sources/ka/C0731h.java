package ka;

import com.roblox.client.personasdk.R;
import ka.M;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lo9/h;", "", "", "initialValue", "<init>", "(Z)V", "Lka/y;", "a", "Lka/y;", "_boolValue", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onChanged", "value", "()Z", "c", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0731h {

    @NotNull
    private final y<Boolean> _boolValue;

    @NotNull
    private final g<Boolean> onChanged;

    public C0731h(boolean z) {
        y<Boolean> yVarA = M.a(Boolean.valueOf(z));
        this._boolValue = yVarA;
        this.onChanged = i.m(yVarA, 1);
    }

    @NotNull
    public final g<Boolean> a() {
        return this.onChanged;
    }

    public final boolean b() {
        return ((Boolean) this._boolValue.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        this._boolValue.setValue(Boolean.valueOf(z));
    }
}
