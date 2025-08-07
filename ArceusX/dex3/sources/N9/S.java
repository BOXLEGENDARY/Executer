package n9;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Ln9/S;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "f", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "options", "", "c", "()Ljava/lang/String;", "label", "b", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface S {
    @NotNull
    List<Option> b();

    String c();

    @NotNull
    List<Option> d();

    boolean f();

    InputSelectBoxComponentStyle getStyles();
}
