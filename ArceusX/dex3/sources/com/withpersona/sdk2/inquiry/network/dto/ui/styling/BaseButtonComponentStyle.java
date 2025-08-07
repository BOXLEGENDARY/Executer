package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;

public interface BaseButtonComponentStyle {
    Integer getActiveBackgroundColorValue();

    Integer getActiveBorderColorValue();

    Integer getActiveTextColorValue();

    Integer getBaseBackgroundColorValue();

    Integer getBaseBorderColorValue();

    Integer getBaseTextColorValue();

    Double getBorderRadiusValue();

    Double getBorderWidthValue();

    Integer getDisabledBackgroundColorValue();

    Integer getDisabledBorderColorValue();

    Integer getDisabledTextColorValue();

    String getFontNameValue();

    Double getFontSizeValue();

    StyleElements.FontWeight getFontWeightValue();

    Double getHeightValue();

    StyleElements.PositionType getJustificationValue();

    Double getLetterSpacingValue();

    Double getLineHeightValue();

    StyleElements.SizeSet getMarginValue();

    StyleElements.SizeSet getPaddingValue();

    Double getWidthValue();
}
