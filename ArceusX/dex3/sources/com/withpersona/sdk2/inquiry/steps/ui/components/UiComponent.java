package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001 \n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "config", "", "getName", "()Ljava/lang/String;", "name", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HorizontalStackComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface UiComponent extends Parcelable {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static String a(@NotNull UiComponent uiComponent) {
            return uiComponent.e().getName();
        }
    }

    @NotNull
    UiComponentConfig e();

    @NotNull
    String getName();
}
