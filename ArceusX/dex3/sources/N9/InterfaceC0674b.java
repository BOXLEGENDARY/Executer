package n9;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.List;
import ka.C0731h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001a8&X¦\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001a8&X¦\u0004¢\u0006\f\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010$\u001a\u00020\u001a8&X¦\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001cR\u001a\u0010'\u001a\u00020\u001a8&X¦\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u001cR\u001a\u0010*\u001a\u00020\u001a8&X¦\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\u001c¨\u0006+"}, d2 = {"Ln9/b;", "", "", "newState", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "a", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "newString", "f", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "k", "o", "n", "c", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "searchResults", "d", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lo9/h;", "l", "()Lo9/h;", "isAddressFieldCollapsed$annotations", "()V", "isAddressFieldCollapsed", "Lcom/squareup/workflow1/ui/r;", "p", "()Lcom/squareup/workflow1/ui/r;", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "q", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "b", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "h", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "g", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface InterfaceC0674b {
    @NotNull
    InputAddressComponent a(Boolean newState);

    @NotNull
    com.squareup.workflow1.ui.r getTextControllerForAddressCity();

    @NotNull
    InputAddressComponent c(String newString);

    @NotNull
    InputAddressComponent d(List<Suggestion> searchResults);

    @NotNull
    InputAddressComponent f(String newString);

    @NotNull
    com.squareup.workflow1.ui.r getTextControllerForAddressPostalCode();

    @NotNull
    com.squareup.workflow1.ui.r getTextControllerForAddressSubdivision();

    @NotNull
    InputAddressComponent k(String newString);

    @NotNull
    C0731h getIsAddressFieldCollapsed();

    @NotNull
    InputAddressComponent n(String newString);

    @NotNull
    InputAddressComponent o(String newString);

    @NotNull
    com.squareup.workflow1.ui.r getTextControllerForAddressStreet1();

    @NotNull
    com.squareup.workflow1.ui.r getTextControllerForAddressStreet2();
}
