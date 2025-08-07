package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Metadata;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.W;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ln9/l;", "Ln9/q;", "Ln9/W;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "config", "", "t0", "()Z", "m", "(Z)V", "wasTapped", "", "getAutoSubmitCountdownText", "()Ljava/lang/String;", "autoSubmitCountdownText", "", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "autoSubmitIntervalSeconds", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CombinedStepButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface ButtonComponent extends UiComponent, InterfaceC0684l, InterfaceC0689q, W {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static String a(@NotNull ButtonComponent buttonComponent) {
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                return attributes.getAutoSubmitCountdownText();
            }
            return null;
        }

        public static Integer b(@NotNull ButtonComponent buttonComponent) {
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                return attributes.getAutoSubmitIntervalSeconds();
            }
            return null;
        }

        public static JsonLogicBoolean c(@NotNull ButtonComponent buttonComponent) {
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                return attributes.getDisabled();
            }
            return null;
        }

        public static JsonLogicBoolean d(@NotNull ButtonComponent buttonComponent) {
            BaseButtonAttributes attributes = buttonComponent.e().getAttributes();
            if (attributes != null) {
                return attributes.getHidden();
            }
            return null;
        }

        @NotNull
        public static String e(@NotNull ButtonComponent buttonComponent) {
            return UiComponent.a.a(buttonComponent);
        }
    }

    @Override
    @NotNull
    Button e();

    String getAutoSubmitCountdownText();

    Integer getAutoSubmitIntervalSeconds();

    void m(boolean z);

    boolean t0();
}
