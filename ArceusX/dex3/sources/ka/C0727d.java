package ka;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import ka.M;
import ka.g;
import ka.i;
import ka.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lo9/d;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "initialValue", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)V", "Lka/y;", "a", "Lka/y;", "_nfcData", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onChanged", "value", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "c", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0727d {

    @NotNull
    private final y<GovernmentIdNfcData> _nfcData;

    @NotNull
    private final g<GovernmentIdNfcData> onChanged;

    public C0727d(GovernmentIdNfcData governmentIdNfcData) {
        y<GovernmentIdNfcData> yVarA = M.a(governmentIdNfcData);
        this._nfcData = yVarA;
        this.onChanged = i.m(yVarA, 1);
    }

    @NotNull
    public final g<GovernmentIdNfcData> a() {
        return this.onChanged;
    }

    public final GovernmentIdNfcData b() {
        return (GovernmentIdNfcData) this._nfcData.getValue();
    }

    public final void c(GovernmentIdNfcData governmentIdNfcData) {
        this._nfcData.setValue(governmentIdNfcData);
    }
}
