package ka;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.List;
import ka.M;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lo9/f;", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "initialValue", "<init>", "(Ljava/util/List;)V", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V", "Lka/y;", "a", "Lka/y;", "_selectedOptionsValue", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onChanged", "value", "()Ljava/util/List;", "c", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0729f {

    @NotNull
    private final y<List<Option>> _selectedOptionsValue;

    @NotNull
    private final g<List<Option>> onChanged;

    public C0729f(@NotNull List<Option> list) {
        Intrinsics.checkNotNullParameter(list, "initialValue");
        y<List<Option>> yVarA = M.a(list);
        this._selectedOptionsValue = yVarA;
        this.onChanged = i.m(yVarA, 1);
    }

    @NotNull
    public final g<List<Option>> a() {
        return this.onChanged;
    }

    @NotNull
    public final List<Option> b() {
        return (List) this._selectedOptionsValue.getValue();
    }

    public final void c(@NotNull List<Option> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this._selectedOptionsValue.setValue(list);
    }

    public C0729f(Option option) {
        List listD;
        if (option == null) {
            listD = CollectionsKt.j();
        } else {
            listD = CollectionsKt.d(option);
        }
        this((List<Option>) listD);
    }
}
