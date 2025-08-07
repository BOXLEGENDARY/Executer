package com.withpersona.sdk2.inquiry.network.dto.ui;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import org.jetbrains.annotations.NotNull;

public interface InputSelectBoxComponentStyle {
    Integer getBaseBackgroundColorValue();

    Integer getBaseBorderColorValue();

    Integer getBaseTextColor();

    @NotNull
    TextBasedComponentStyle getErrorTextStyle();

    Integer getFocusedBackgroundColorValue();

    Integer getHeaderCancelButtonColor();

    @NotNull
    TextBasedComponentStyle getTextBasedStyle();
}
