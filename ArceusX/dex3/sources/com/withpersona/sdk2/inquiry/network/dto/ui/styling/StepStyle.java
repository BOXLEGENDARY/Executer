package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.jetbrains.annotations.NotNull;

public interface StepStyle extends Parcelable {
    Drawable backgroundImageDrawable(@NotNull Context context);

    Integer getBackgroundColorValue();

    ButtonSubmitComponentStyle getButtonPrimaryStyleValue();

    ButtonCancelComponentStyle getButtonSecondaryStyleValue();

    ButtonSubmitComponentStyle getCancelDialogCloseStyleValue();

    ButtonCancelComponentStyle getCancelDialogResumeStyleValue();

    Integer getFillColorValue();

    StyleElements.Size getModalBorderRadiusValue();

    StyleElements.SizeSet getModalPaddingValue();

    TextBasedComponentStyle getProcessingTextStyleValue();

    TextBasedComponentStyle getProcessingTitleStyleValue();

    Integer getStrokeColorValue();

    TextBasedComponentStyle getTextStyleValue();

    TextBasedComponentStyle getTitleStyleValue();
}
