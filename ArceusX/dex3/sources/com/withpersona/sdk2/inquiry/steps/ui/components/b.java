package com.withpersona.sdk2.inquiry.steps.ui.components;

import P9.m;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;
import n9.s0;
import org.jetbrains.annotations.NotNull;
import s9.d;

@Metadata(d1 = {"\u0000R\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00060\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001a\u001a\u00020\u0019*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "old", "new", "h", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "e", "(Ljava/util/List;)Ljava/util/List;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Ln9/s0;", "uiComponentHelper", "Lcom/google/android/material/button/MaterialButton;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Ln9/s0;)Lcom/google/android/material/button/MaterialButton;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Ln9/s0;)Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "", "d", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;)I", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[Button.ButtonType.values().length];
            try {
                iArr[Button.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0183b extends l implements Function0<Unit> {
        final MaterialButton d;
        final BaseButtonComponentStyle e;

        C0183b(MaterialButton materialButton, BaseButtonComponentStyle baseButtonComponentStyle) {
            super(0);
            this.d = materialButton;
            this.e = baseButtonComponentStyle;
        }

        public Object invoke() throws m {
            m594invoke();
            return Unit.a;
        }

        public final void m594invoke() throws m {
            d.f(this.d, this.e, false, false, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final ButtonWithLoadingIndicator d;
        final BaseButtonComponentStyle e;

        c(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
            super(0);
            this.d = buttonWithLoadingIndicator;
            this.e = baseButtonComponentStyle;
        }

        public Object invoke() throws m {
            m595invoke();
            return Unit.a;
        }

        public final void m595invoke() throws m {
            d.d(this.d, this.e);
        }
    }

    private static final boolean a(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 == null || StringsKt.Y(prefillAddressStreet1)) {
            InputAddress.Attributes attributes2 = inputAddress.getAttributes();
            String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
            if (prefillAddressStreet2 == null || StringsKt.Y(prefillAddressStreet2)) {
                InputAddress.Attributes attributes3 = inputAddress.getAttributes();
                String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
                if (prefillAddressCity == null || StringsKt.Y(prefillAddressCity)) {
                    InputAddress.Attributes attributes4 = inputAddress.getAttributes();
                    String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
                    if (prefillAddressPostalCode == null || StringsKt.Y(prefillAddressPostalCode)) {
                        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
                        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
                        if (prefillAddressSubdivision == null || StringsKt.Y(prefillAddressSubdivision)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final MaterialButton b(@NotNull ButtonComponent buttonComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(buttonComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        BaseButtonComponentStyle styles = buttonComponent.e().getStyles();
        if (styles == null) {
            MaterialButton materialButton = new MaterialButton(s0Var.getContext(), (AttributeSet) null, d(buttonComponent.e()));
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                materialButton.setText(attributes.getText());
            }
            return materialButton;
        }
        MaterialButton materialButton2 = new MaterialButton(s0Var.getContext());
        BaseButtonAttributes attributes2 = buttonComponent.e().getAttributes();
        if (attributes2 != null) {
            materialButton2.setText(attributes2.getText());
        }
        s0Var.d(new C0183b(materialButton2, styles));
        return materialButton2;
    }

    @NotNull
    public static final ButtonWithLoadingIndicator c(@NotNull ButtonComponent buttonComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(buttonComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        BaseButtonComponentStyle styles = buttonComponent.e().getStyles();
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(s0Var.getContext(), d(buttonComponent.e()));
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            return buttonWithLoadingIndicator;
        }
        ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(s0Var.getContext(), 0);
        BaseButtonAttributes attributes2 = buttonComponent.e().getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        s0Var.d(new c(buttonWithLoadingIndicator2, styles));
        return buttonWithLoadingIndicator2;
    }

    private static final int d(Button button) throws m {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i = buttonType == null ? -1 : a.a[buttonType.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return S8.a.a;
            }
            throw new m();
        }
        return c4.b.v;
    }

    @NotNull
    public static final List<UiComponent> e(@NotNull List<? extends UiComponentConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponentG = g((UiComponentConfig) it.next());
            if (uiComponentG != null) {
                arrayList.add(uiComponentG);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final RemoteImageComponent f(@NotNull RemoteImage remoteImage) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        return new RemoteImageComponent(remoteImage);
    }

    public static final UiComponent g(@NotNull UiComponentConfig uiComponentConfig) {
        Intrinsics.checkNotNullParameter(uiComponentConfig, "<this>");
        if (uiComponentConfig instanceof Branding) {
            return new BrandingComponent((Branding) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Button) {
            if (uiComponentConfig instanceof ActionButton) {
                return new ActionButtonComponent((ActionButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof CancelButton) {
                return new CancelButtonComponent((CancelButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof CombinedStepButton) {
                return new CombinedStepButtonComponent((CombinedStepButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof CompleteButton) {
                return new CompleteButtonComponent((CompleteButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof SubmitButton) {
                return new SubmitButtonComponent((SubmitButton) uiComponentConfig);
            }
            if (uiComponentConfig instanceof VerifyPersonaButton) {
                return new VerifyPersonaButtonComponent((VerifyPersonaButton) uiComponentConfig);
            }
            throw new m();
        }
        if (uiComponentConfig instanceof ClickableStack) {
            return new ClickableStackComponent((ClickableStack) uiComponentConfig, null, false, 6, null);
        }
        if (uiComponentConfig instanceof CombinedStepImagePreview) {
            return new ImagePreviewComponent((CombinedStepImagePreview) uiComponentConfig);
        }
        int i = 2;
        Bitmap bitmap = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        if (uiComponentConfig instanceof ESignature) {
            return new ESignatureComponent((ESignature) uiComponentConfig, bitmap, i, objArr24 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof Footer) {
            return new FooterComponent((Footer) uiComponentConfig, null, 2, null);
        }
        if (uiComponentConfig instanceof GovernmentIdNfcScan) {
            return new GovernmentIdNfcScanComponent((GovernmentIdNfcScan) uiComponentConfig, null, null, null, null, null, 62, null);
        }
        if (uiComponentConfig instanceof HorizontalStack) {
            return new HorizontalStackComponent((HorizontalStack) uiComponentConfig, objArr23 == true ? 1 : 0, i, objArr22 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputAddress) {
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            return new InputAddressComponent(inputAddress, null, null, null, null, null, null, null, null, null, Boolean.valueOf(a(inputAddress)), 1022, null);
        }
        if (uiComponentConfig instanceof InputCheckbox) {
            return new InputCheckboxComponent((InputCheckbox) uiComponentConfig, false, i, objArr21 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputCheckboxGroup) {
            return new InputCheckboxGroupComponent((InputCheckboxGroup) uiComponentConfig, objArr20 == true ? 1 : 0, i, objArr19 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputConfirmationCode) {
            return new InputConfirmationCodeComponent((InputConfirmationCode) uiComponentConfig, objArr18 == true ? 1 : 0, i, objArr17 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputDate) {
            return new InputDateComponent((InputDate) uiComponentConfig, objArr16 == true ? 1 : 0, i, objArr15 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputMaskedText) {
            return new InputMaskedTextComponent((InputMaskedText) uiComponentConfig, objArr14 == true ? 1 : 0, i, objArr13 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputMultiSelect) {
            return InputMultiSelectComponent.INSTANCE.a((InputMultiSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputNumber) {
            return new InputNumberComponent((InputNumber) uiComponentConfig, objArr12 == true ? 1 : 0, i, objArr11 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            return new InputPhoneNumberComponent((InputPhoneNumber) uiComponentConfig, objArr10 == true ? 1 : 0, i, objArr9 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputRadioGroup) {
            return new InputRadioGroupComponent((InputRadioGroup) uiComponentConfig, objArr8 == true ? 1 : 0, i, objArr7 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputSelect) {
            return InputSelectComponent.INSTANCE.a((InputSelect) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputText) {
            return new InputTextComponent((InputText) uiComponentConfig, objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof InputTextArea) {
            return new InputTextAreaComponent((InputTextArea) uiComponentConfig, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        }
        if (uiComponentConfig instanceof LocalImage) {
            return new LocalImageComponent((LocalImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof PrivacyPolicy) {
            return new PrivacyPolicyComponent((PrivacyPolicy) uiComponentConfig);
        }
        if (uiComponentConfig instanceof QRCode) {
            return new QRCodeComponent((QRCode) uiComponentConfig);
        }
        if (uiComponentConfig instanceof RemoteImage) {
            return f((RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Spacer) {
            return new SpacerComponent((Spacer) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Text) {
            return new TextComponent((Text) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Title) {
            return new TitleComponent((Title) uiComponentConfig);
        }
        if (uiComponentConfig instanceof CreatePersonaSheet) {
            return CreatePersonaSheetComponent.INSTANCE.a((CreatePersonaSheet) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputCurrency) {
            return new InputCurrencyComponent((InputCurrency) uiComponentConfig, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        if (!(uiComponentConfig instanceof InputInternationalDb)) {
            if (Intrinsics.b(uiComponentConfig, UnknownComponentConfig.INSTANCE)) {
                return null;
            }
            throw new m();
        }
        return new InputInternationalDbComponent((InputInternationalDb) uiComponentConfig, null, null, null, 14, null);
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> h(@org.jetbrains.annotations.NotNull java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> r3, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent r4, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.components.b.h(java.util.List, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent):java.util.List");
    }
}
