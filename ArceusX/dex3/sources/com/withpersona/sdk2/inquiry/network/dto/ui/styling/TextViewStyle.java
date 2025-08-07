package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;

public interface TextViewStyle {
    String getFontNameValue();

    Double getFontSizeValue();

    StyleElements.FontWeight getFontWeightValue();

    StyleElements.PositionType getJustificationValue();

    Double getLetterSpacingValue();

    Double getLineHeightValue();

    StyleElements.SizeSet getMarginValue();

    Integer getTextColorHighlightValue();

    Integer getTextColorValue();
}
