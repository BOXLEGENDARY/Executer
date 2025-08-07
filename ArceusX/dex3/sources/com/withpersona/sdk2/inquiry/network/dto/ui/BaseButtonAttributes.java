package com.withpersona.sdk2.inquiry.network.dto.ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import org.jetbrains.annotations.NotNull;

public interface BaseButtonAttributes extends UiComponentAttributes {
    String getAutoSubmitCountdownText();

    Integer getAutoSubmitIntervalSeconds();

    Button.ButtonType getButtonType();

    JsonLogicBoolean getDisabled();

    JsonLogicBoolean getHidden();

    @NotNull
    String getText();
}
