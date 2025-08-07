package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcelable;
import b8.b;
import com.squareup.moshi.h;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import org.jetbrains.annotations.NotNull;

public interface UiComponentConfig extends Parcelable {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final h.e createAdapter() {
            return b.b(UiComponentConfig.class, "type").c(UnknownComponentConfig.INSTANCE).e(Text.class, Text.type).e(Title.class, Title.type).e(PrivacyPolicy.class, PrivacyPolicy.type).e(LocalImage.class, LocalImage.type).e(RemoteImage.class, RemoteImage.type).e(CompleteButton.class, CompleteButton.type).e(SubmitButton.class, SubmitButton.type).e(ActionButton.class, ActionButton.type).e(CancelButton.class, CancelButton.type).e(CombinedStepButton.class, CombinedStepButton.type).e(Footer.class, Footer.type).e(Branding.class, Branding.type).e(InputText.class, InputText.type).e(InputTextArea.class, InputTextArea.type).e(InputDate.class, InputDate.type).e(InputSelect.class, InputSelect.type).e(InputMultiSelect.class, InputMultiSelect.type).e(Spacer.class, Spacer.type).e(InputMaskedText.class, InputMaskedText.type).e(HorizontalStack.class, HorizontalStack.type).e(InputAddress.class, InputAddress.type).e(InputInternationalDb.class, InputInternationalDb.type).e(InputPhoneNumber.class, InputPhoneNumber.type).e(InputConfirmationCode.class, InputConfirmationCode.type).e(ClickableStack.class, ClickableStack.TYPE).e(InputCheckbox.class, InputCheckbox.type).e(InputCheckboxGroup.class, InputCheckboxGroup.type).e(InputNumber.class, InputNumber.type).e(InputCurrency.class, InputCurrency.type).e(QRCode.class, QRCode.type).e(CombinedStepImagePreview.class, CombinedStepImagePreview.type).e(ESignature.class, ESignature.type).e(GovernmentIdNfcScan.class, GovernmentIdNfcScan.type).e(InputRadioGroup.class, InputRadioGroup.type).e(CreatePersonaSheet.class, CreatePersonaSheet.type).e(VerifyPersonaButton.class, VerifyPersonaButton.type);
        }
    }

    UiComponentAttributes getAttributes();

    @NotNull
    String getName();
}
