package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class StepStyles {

    @i(generateAdapter = true)
    public static final class CombinedStepAlignment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CombinedStepAlignment> CREATOR = new Creator();
        private final StyleElements.Position pendingPage;

        public static final class Creator implements Parcelable.Creator<CombinedStepAlignment> {
            @Override
            @NotNull
            public final CombinedStepAlignment createFromParcel(@NotNull Parcel parcel) {
                return new CombinedStepAlignment(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final CombinedStepAlignment[] newArray(int i) {
                return new CombinedStepAlignment[i];
            }
        }

        public CombinedStepAlignment(StyleElements.Position position) {
            this.pendingPage = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getPendingPage() {
            return this.pendingPage;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.pendingPage;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor imagePreview;

        public static final class Creator implements Parcelable.Creator<DocumentStepBorderColor> {
            @Override
            @NotNull
            public final DocumentStepBorderColor createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DocumentStepBorderColor[] newArray(int i) {
                return new DocumentStepBorderColor[i];
            }
        }

        public DocumentStepBorderColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.imagePreview = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getImagePreview() {
            return this.imagePreview;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.imagePreview;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepBorderRadius implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderRadius> CREATOR = new Creator();
        private final StyleElements.Measurement imagePreview;
        private final StyleElements.Measurement modal;

        public static final class Creator implements Parcelable.Creator<DocumentStepBorderRadius> {
            @Override
            @NotNull
            public final DocumentStepBorderRadius createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DocumentStepBorderRadius[] newArray(int i) {
                return new DocumentStepBorderRadius[i];
            }
        }

        public DocumentStepBorderRadius(StyleElements.Measurement measurement, StyleElements.Measurement measurement2) {
            this.modal = measurement;
            this.imagePreview = measurement2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getImagePreview() {
            return this.imagePreview;
        }

        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.imagePreview;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.MeasurementSet imagePreview;

        public static final class Creator implements Parcelable.Creator<DocumentStepBorderWidth> {
            @Override
            @NotNull
            public final DocumentStepBorderWidth createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DocumentStepBorderWidth[] newArray(int i) {
                return new DocumentStepBorderWidth[i];
            }
        }

        public DocumentStepBorderWidth(StyleElements.MeasurementSet measurementSet) {
            this.imagePreview = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getImagePreview() {
            return this.imagePreview;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.imagePreview;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor imagePreviewCropArea;
        private final StyleElements.SimpleElementColor imagePreviewMainArea;
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        public static final class Creator implements Parcelable.Creator<DocumentStepFillColor> {
            @Override
            @NotNull
            public final DocumentStepFillColor createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DocumentStepFillColor[] newArray(int i) {
                return new DocumentStepFillColor[i];
            }
        }

        public DocumentStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
            this.imagePreviewMainArea = simpleElementColor4;
            this.imagePreviewCropArea = simpleElementColor5;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getImagePreviewCropArea() {
            return this.imagePreviewCropArea;
        }

        public final StyleElements.SimpleElementColor getImagePreviewMainArea() {
            return this.imagePreviewMainArea;
        }

        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.imagePreviewMainArea;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.imagePreviewCropArea;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepImageLocalStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepImageLocalStyle> CREATOR = new Creator();
        private final DocumentStepImageLocalStyleContainer documentStartIcon;

        public static final class Creator implements Parcelable.Creator<DocumentStepImageLocalStyle> {
            @Override
            @NotNull
            public final DocumentStepImageLocalStyle createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepImageLocalStyle(parcel.readInt() == 0 ? null : DocumentStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DocumentStepImageLocalStyle[] newArray(int i) {
                return new DocumentStepImageLocalStyle[i];
            }
        }

        public DocumentStepImageLocalStyle(DocumentStepImageLocalStyleContainer documentStepImageLocalStyleContainer) {
            this.documentStartIcon = documentStepImageLocalStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final DocumentStepImageLocalStyleContainer getDocumentStartIcon() {
            return this.documentStartIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            DocumentStepImageLocalStyleContainer documentStepImageLocalStyleContainer = this.documentStartIcon;
            if (documentStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepImageLocalStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepImageLocalStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        public static final class Creator implements Parcelable.Creator<DocumentStepImageLocalStyleContainer> {
            @Override
            @NotNull
            public final DocumentStepImageLocalStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DocumentStepImageLocalStyleContainer[] newArray(int i) {
                return new DocumentStepImageLocalStyleContainer[i];
            }
        }

        public DocumentStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        public static final class Creator implements Parcelable.Creator<DocumentStepStrokeColor> {
            @Override
            @NotNull
            public final DocumentStepStrokeColor createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DocumentStepStrokeColor[] newArray(int i) {
                return new DocumentStepStrokeColor[i];
            }
        }

        public DocumentStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<DocumentStepStyle> CREATOR = new Creator();
        private final CombinedStepAlignment alignment;
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final DocumentStepBorderColor borderColor;
        private final DocumentStepBorderRadius borderRadius;
        private final DocumentStepBorderWidth borderWidth;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final DocumentStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final DocumentStepImageLocalStyle imageLocalStyle;
        private final StepPaddingStyle padding;
        private final DocumentStepStrokeColor strokeColor;
        private final DocumentStepTextBasedComponentStyle textStyle;
        private final DocumentStepTitleComponentStyle titleStyle;

        public static final class Creator implements Parcelable.Creator<DocumentStepStyle> {
            @Override
            @NotNull
            public final DocumentStepStyle createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final DocumentStepStyle[] newArray(int i) {
                return new DocumentStepStyle[i];
            }
        }

        public DocumentStepStyle(@g(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, DocumentStepTitleComponentStyle documentStepTitleComponentStyle, DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, DocumentStepStrokeColor documentStepStrokeColor, DocumentStepFillColor documentStepFillColor, DocumentStepBorderColor documentStepBorderColor, DocumentStepBorderRadius documentStepBorderRadius, DocumentStepBorderWidth documentStepBorderWidth, DocumentStepImageLocalStyle documentStepImageLocalStyle, StepPaddingStyle stepPaddingStyle, CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = documentStepTitleComponentStyle;
            this.textStyle = documentStepTextBasedComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = documentStepStrokeColor;
            this.fillColor = documentStepFillColor;
            this.borderColor = documentStepBorderColor;
            this.borderRadius = documentStepBorderRadius;
            this.borderWidth = documentStepBorderWidth;
            this.imageLocalStyle = documentStepImageLocalStyle;
            this.padding = stepPaddingStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override
        public Drawable backgroundImageDrawable(@NotNull Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final DocumentStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final DocumentStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        public final DocumentStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final DocumentStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (base = documentStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final DocumentStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        public final TextBasedComponentStyle getImageNameStyleValue() {
            StepTextBasedComponentStyleContainer imageName;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (imageName = documentStepTextBasedComponentStyle.getImageName()) == null) {
                return null;
            }
            return imageName.getBase();
        }

        public final Integer getImagePreviewBorderColor() {
            StyleElements.SimpleElementColor imagePreview;
            StyleElements.SimpleElementColorValue base;
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null || (imagePreview = documentStepBorderColor.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getImagePreviewBorderRadius() {
            StyleElements.Measurement imagePreview;
            StyleElements.Size base;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (imagePreview = documentStepBorderRadius.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getImagePreviewBorderWidth() {
            StyleElements.MeasurementSet imagePreview;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null || (imagePreview = documentStepBorderWidth.getImagePreview()) == null || (base = imagePreview.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getImagePreviewCropAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewCropArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewCropArea = documentStepFillColor.getImagePreviewCropArea()) == null || (base = imagePreviewCropArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewMainAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewMainArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewMainArea = documentStepFillColor.getImagePreviewMainArea()) == null || (base = imagePreviewMainArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewPlusIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewPlusIcon = documentStepFillColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewPlusIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewPlusIcon = documentStepStrokeColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewXIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewXIcon = documentStepFillColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getImagePreviewXIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewXIcon = documentStepStrokeColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (modal = documentStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingText;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (documentProcessingText = documentStepTextBasedComponentStyle.getDocumentProcessingText()) == null) {
                return null;
            }
            return documentProcessingText.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingTitle;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (documentProcessingTitle = documentStepTitleComponentStyle.getDocumentProcessingTitle()) == null) {
                return null;
            }
            return documentProcessingTitle.getBase();
        }

        public final DocumentStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (base = documentStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final DocumentStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (base = documentStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final DocumentStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (base = documentStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, i);
            }
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepTitleComponentStyle.writeToParcel(parcel, i);
            }
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepStrokeColor.writeToParcel(parcel, i);
            }
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepFillColor.writeToParcel(parcel, i);
            }
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderColor.writeToParcel(parcel, i);
            }
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderRadius.writeToParcel(parcel, i);
            }
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepBorderWidth.writeToParcel(parcel, i);
            }
            DocumentStepImageLocalStyle documentStepImageLocalStyle = this.imageLocalStyle;
            if (documentStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepImageLocalStyle.writeToParcel(parcel, i);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, i);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                combinedStepAlignment.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer documentProcessingText;
        private final StepTextBasedComponentStyleContainer imageName;

        public static final class Creator implements Parcelable.Creator<DocumentStepTextBasedComponentStyle> {
            @Override
            @NotNull
            public final DocumentStepTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DocumentStepTextBasedComponentStyle[] newArray(int i) {
                return new DocumentStepTextBasedComponentStyle[i];
            }
        }

        public DocumentStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.documentProcessingText = stepTextBasedComponentStyleContainer2;
            this.imageName = stepTextBasedComponentStyleContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getDocumentProcessingText() {
            return this.documentProcessingText;
        }

        public final StepTextBasedComponentStyleContainer getImageName() {
            return this.imageName;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.documentProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.imageName;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class DocumentStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer documentProcessingTitle;

        public static final class Creator implements Parcelable.Creator<DocumentStepTitleComponentStyle> {
            @Override
            @NotNull
            public final DocumentStepTitleComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new DocumentStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final DocumentStepTitleComponentStyle[] newArray(int i) {
                return new DocumentStepTitleComponentStyle[i];
            }
        }

        public DocumentStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.documentProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getDocumentProcessingTitle() {
            return this.documentProcessingTitle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.documentProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
        private final StyleElements.SimpleElementColor governmentIdReviewImageBox;
        private final StyleElements.SimpleElementColor governmentIdSelectOption;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderColor> {
            @Override
            @NotNull
            public final GovernmentIdStepBorderColor createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepBorderColor[] newArray(int i) {
                return new GovernmentIdStepBorderColor[i];
            }
        }

        public GovernmentIdStepBorderColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4) {
            this.base = simpleElementColor;
            this.governmentIdSelectOption = simpleElementColor2;
            this.governmentIdCaptureFeedBox = simpleElementColor3;
            this.governmentIdReviewImageBox = simpleElementColor4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOption;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.governmentIdReviewImageBox;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderRadius implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderRadius> CREATOR = new Creator();
        private final StyleElements.Measurement governmentIdCaptureFeedBox;
        private final StyleElements.Measurement governmentIdReviewImageBox;
        private final StyleElements.Measurement modal;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderRadius> {
            @Override
            @NotNull
            public final GovernmentIdStepBorderRadius createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepBorderRadius[] newArray(int i) {
                return new GovernmentIdStepBorderRadius[i];
            }
        }

        public GovernmentIdStepBorderRadius(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.modal = measurement;
            this.governmentIdCaptureFeedBox = measurement2;
            this.governmentIdReviewImageBox = measurement3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.Measurement getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement2 = this.governmentIdCaptureFeedBox;
            if (measurement2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement2.writeToParcel(parcel, i);
            }
            StyleElements.Measurement measurement3 = this.governmentIdReviewImageBox;
            if (measurement3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.MeasurementSet governmentIdCaptureFeedBox;
        private final StyleElements.MeasurementSet governmentIdReviewImageBox;
        private final StyleElements.MeasurementSet governmentIdSelectOption;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderWidth> {
            @Override
            @NotNull
            public final GovernmentIdStepBorderWidth createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepBorderWidth[] newArray(int i) {
                return new GovernmentIdStepBorderWidth[i];
            }
        }

        public GovernmentIdStepBorderWidth(StyleElements.MeasurementSet measurementSet, StyleElements.MeasurementSet measurementSet2, StyleElements.MeasurementSet measurementSet3) {
            this.governmentIdSelectOption = measurementSet;
            this.governmentIdCaptureFeedBox = measurementSet2;
            this.governmentIdReviewImageBox = measurementSet3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.MeasurementSet getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        public final StyleElements.MeasurementSet getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.governmentIdSelectOption;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
            StyleElements.MeasurementSet measurementSet2 = this.governmentIdCaptureFeedBox;
            if (measurementSet2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet2.writeToParcel(parcel, i);
            }
            StyleElements.MeasurementSet measurementSet3 = this.governmentIdReviewImageBox;
            if (measurementSet3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor capturePageHintIcon;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepFillColor> {
            @Override
            @NotNull
            public final GovernmentIdStepFillColor createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepFillColor[] newArray(int i) {
                return new GovernmentIdStepFillColor[i];
            }
        }

        public GovernmentIdStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.capturePageHintIcon = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.capturePageHintIcon;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepImageLocalStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyle> CREATOR = new Creator();
        private final GovernmentIdStepImageLocalStyleContainer illustration;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepImageLocalStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepImageLocalStyle(parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdStepImageLocalStyle[] newArray(int i) {
                return new GovernmentIdStepImageLocalStyle[i];
            }
        }

        public GovernmentIdStepImageLocalStyle(GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer) {
            this.illustration = governmentIdStepImageLocalStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final GovernmentIdStepImageLocalStyleContainer getIllustration() {
            return this.illustration;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer = this.illustration;
            if (governmentIdStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepImageLocalStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepImageLocalStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> {
            @Override
            @NotNull
            public final GovernmentIdStepImageLocalStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdStepImageLocalStyleContainer[] newArray(int i) {
                return new GovernmentIdStepImageLocalStyleContainer[i];
            }
        }

        public GovernmentIdStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepInputSelectStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepInputSelectStyle> CREATOR = new Creator();
        private final InputSelectStyleContainer base;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepInputSelectStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepInputSelectStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepInputSelectStyle(parcel.readInt() == 0 ? null : InputSelectStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdStepInputSelectStyle[] newArray(int i) {
                return new GovernmentIdStepInputSelectStyle[i];
            }
        }

        public GovernmentIdStepInputSelectStyle(InputSelectStyleContainer inputSelectStyleContainer) {
            this.base = inputSelectStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final InputSelectStyleContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            InputSelectStyleContainer inputSelectStyleContainer = this.base;
            if (inputSelectStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepPrimaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> CREATOR = new Creator();
        private final StepSubmitButtonComponentStyleContainer base;
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;
        private final StepSubmitButtonComponentStyleContainer submitPhotoButton;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepPrimaryButtonComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepPrimaryButtonComponentStyle[] newArray(int i) {
                return new GovernmentIdStepPrimaryButtonComponentStyle[i];
            }
        }

        public GovernmentIdStepPrimaryButtonComponentStyle(StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
            this.submitPhotoButton = stepSubmitButtonComponentStyleContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        public final StepSubmitButtonComponentStyleContainer getSubmitPhotoButton() {
            return this.submitPhotoButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(parcel, i);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3 = this.submitPhotoButton;
            if (stepSubmitButtonComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepRowHeight implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepRowHeight> CREATOR = new Creator();
        private final StyleElements.Measurement governmentIdSelectOptionMinRowHeight;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepRowHeight> {
            @Override
            @NotNull
            public final GovernmentIdStepRowHeight createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepRowHeight(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdStepRowHeight[] newArray(int i) {
                return new GovernmentIdStepRowHeight[i];
            }
        }

        public GovernmentIdStepRowHeight(StyleElements.Measurement measurement) {
            this.governmentIdSelectOptionMinRowHeight = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getGovernmentIdSelectOptionMinRowHeight() {
            return this.governmentIdSelectOptionMinRowHeight;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.governmentIdSelectOptionMinRowHeight;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepSecondaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> CREATOR = new Creator();
        private final StepCancelButtonComponentStyleContainer base;
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;
        private final StepCancelButtonComponentStyleContainer retakePhotoButton;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepSecondaryButtonComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepSecondaryButtonComponentStyle[] newArray(int i) {
                return new GovernmentIdStepSecondaryButtonComponentStyle[i];
            }
        }

        public GovernmentIdStepSecondaryButtonComponentStyle(StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
            this.retakePhotoButton = stepCancelButtonComponentStyleContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        public final StepCancelButtonComponentStyleContainer getRetakePhotoButton() {
            return this.retakePhotoButton;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(parcel, i);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3 = this.retakePhotoButton;
            if (stepCancelButtonComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;
        private final StyleElements.SimpleElementColor capturePageHintIcon;
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionChevron;
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStrokeColor> {
            @Override
            @NotNull
            public final GovernmentIdStepStrokeColor createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepStrokeColor[] newArray(int i) {
                return new GovernmentIdStepStrokeColor[i];
            }
        }

        public GovernmentIdStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5, StyleElements.SimpleElementColor simpleElementColor6) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.governmentIdSelectOptionChevron = simpleElementColor3;
            this.capturePageHintIcon = simpleElementColor4;
            this.governmentIdCaptureFeedBox = simpleElementColor5;
            this.captureOverlayHeaderButton = simpleElementColor6;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionChevron() {
            return this.governmentIdSelectOptionChevron;
        }

        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdSelectOptionChevron;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.capturePageHintIcon;
            if (simpleElementColor4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor4.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor5.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.captureOverlayHeaderButton;
            if (simpleElementColor6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor6.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepStyle> CREATOR = new Creator();
        private final CombinedStepAlignment alignment;
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final GovernmentIdStepBorderColor borderColor;
        private final GovernmentIdStepBorderRadius borderRadius;
        private final GovernmentIdStepBorderWidth borderWidth;
        private final GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final GovernmentIdStepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final GovernmentIdStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final GovernmentIdStepRowHeight height;
        private final GovernmentIdStepImageLocalStyle imageLocalStyle;
        private final GovernmentIdStepInputSelectStyle inputSelectStyle;
        private final StepPaddingStyle padding;
        private final GovernmentIdStepStrokeColor strokeColor;
        private final GovernmentIdStepTextBasedComponentStyle textStyle;
        private final GovernmentIdStepTitleComponentStyle titleStyle;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepRowHeight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepInputSelectStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final GovernmentIdStepStyle[] newArray(int i) {
                return new GovernmentIdStepStyle[i];
            }
        }

        public GovernmentIdStepStyle(@g(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle, GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle, GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle, GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, GovernmentIdStepRowHeight governmentIdStepRowHeight, GovernmentIdStepStrokeColor governmentIdStepStrokeColor, GovernmentIdStepFillColor governmentIdStepFillColor, GovernmentIdStepBorderColor governmentIdStepBorderColor, GovernmentIdStepBorderRadius governmentIdStepBorderRadius, GovernmentIdStepBorderWidth governmentIdStepBorderWidth, StepPaddingStyle stepPaddingStyle, GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle, GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle, CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = governmentIdStepTitleComponentStyle;
            this.textStyle = governmentIdStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = governmentIdStepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = governmentIdStepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.height = governmentIdStepRowHeight;
            this.strokeColor = governmentIdStepStrokeColor;
            this.fillColor = governmentIdStepFillColor;
            this.borderColor = governmentIdStepBorderColor;
            this.borderRadius = governmentIdStepBorderRadius;
            this.borderWidth = governmentIdStepBorderWidth;
            this.padding = stepPaddingStyle;
            this.inputSelectStyle = governmentIdStepInputSelectStyle;
            this.imageLocalStyle = governmentIdStepImageLocalStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override
        public Drawable backgroundImageDrawable(@NotNull Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Integer getActiveOptionBackgroundColorValue() {
            StyleElements.ComplexElementColor option;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (option = stepBackgroundColorStyle.getOption()) == null) {
                return null;
            }
            return option.getActive();
        }

        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final GovernmentIdStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final GovernmentIdStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        public final GovernmentIdStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final GovernmentIdStepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (base = governmentIdStepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (base = governmentIdStepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (cancelDialogClose = governmentIdStepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (cancelDialogResume = governmentIdStepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final Integer getCaptureHintIconFillColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (capturePageHintIcon = governmentIdStepFillColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getCaptureHintIconStrokeColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (capturePageHintIcon = governmentIdStepStrokeColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (captureOverlayHeaderButton = governmentIdStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getChevronColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionChevron;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionChevron = governmentIdStepStrokeColor.getGovernmentIdSelectOptionChevron()) == null || (base = governmentIdSelectOptionChevron.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (base = governmentIdStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final Integer getGovernmentIdCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdCaptureFeedBox = governmentIdStepBorderColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdCaptureFeedBoxBorderRadiusValue() {
            StyleElements.Measurement governmentIdCaptureFeedBox;
            StyleElements.Size base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdCaptureFeedBox = governmentIdStepBorderRadius.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getGovernmentIdCaptureFeedBoxBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdCaptureFeedBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdCaptureFeedBox = governmentIdStepBorderWidth.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdCaptureFeedBoxStrokeColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdCaptureFeedBox = governmentIdStepStrokeColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final TextBasedComponentStyle getGovernmentIdCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdCaptureHintText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdCaptureHintText = governmentIdStepTextBasedComponentStyle.getGovernmentIdCaptureHintText()) == null) {
                return null;
            }
            return governmentIdCaptureHintText.getBase();
        }

        public final Integer getGovernmentIdIconFillColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (governmentIdSelectOptionIcon = governmentIdStepFillColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getGovernmentIdIconStrokeColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionIcon = governmentIdStepStrokeColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdOptionBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdSelectOption;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdSelectOption = governmentIdStepBorderWidth.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdReviewImageBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdReviewImageBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdReviewImageBox = governmentIdStepBorderColor.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdReviewImageBoxBorderRadiusValue() {
            StyleElements.Measurement governmentIdReviewImageBox;
            StyleElements.Size base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdReviewImageBox = governmentIdStepBorderRadius.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final Double getGovernmentIdReviewImageBoxBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdReviewImageBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdReviewImageBox = governmentIdStepBorderWidth.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final Integer getGovernmentIdSelectOptionBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdSelectOption;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdSelectOption = governmentIdStepBorderColor.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getGovernmentIdSelectOptionMinRowHeight() {
            StyleElements.Measurement governmentIdSelectOptionMinRowHeight;
            StyleElements.Size base;
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepRowHeight.getGovernmentIdSelectOptionMinRowHeight()) == null || (base = governmentIdSelectOptionMinRowHeight.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        public final TextBasedComponentStyle getGovernmentIdVerticalOptionTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdVerticalOption;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdVerticalOption = governmentIdStepTextBasedComponentStyle.getGovernmentIdVerticalOption()) == null) {
                return null;
            }
            return governmentIdVerticalOption.getBase();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final GovernmentIdStepRowHeight getHeight() {
            return this.height;
        }

        public final GovernmentIdStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        public final GovernmentIdStepInputSelectStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        @Override
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (modal = governmentIdStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdProcessingText = governmentIdStepTextBasedComponentStyle.getGovernmentIdProcessingText()) == null) {
                return null;
            }
            return governmentIdProcessingText.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingTitle;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (governmentIdProcessingTitle = governmentIdStepTitleComponentStyle.getGovernmentIdProcessingTitle()) == null) {
                return null;
            }
            return governmentIdProcessingTitle.getBase();
        }

        public final ButtonCancelComponentStyle getRetakePhotoButtonStyleValue() {
            StepCancelButtonComponentStyleContainer retakePhotoButton;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (retakePhotoButton = governmentIdStepSecondaryButtonComponentStyle.getRetakePhotoButton()) == null) {
                return null;
            }
            return retakePhotoButton.getBase();
        }

        public final GovernmentIdStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (base = governmentIdStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final ButtonSubmitComponentStyle getSubmitPhotoButtonStyleValue() {
            StepSubmitButtonComponentStyleContainer submitPhotoButton;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (submitPhotoButton = governmentIdStepPrimaryButtonComponentStyle.getSubmitPhotoButton()) == null) {
                return null;
            }
            return submitPhotoButton.getBase();
        }

        public final GovernmentIdStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (base = governmentIdStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final GovernmentIdStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (base = governmentIdStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepTitleComponentStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepPrimaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepSecondaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepRowHeight.writeToParcel(parcel, i);
            }
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepStrokeColor.writeToParcel(parcel, i);
            }
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepFillColor.writeToParcel(parcel, i);
            }
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderColor.writeToParcel(parcel, i);
            }
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderRadius.writeToParcel(parcel, i);
            }
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepBorderWidth.writeToParcel(parcel, i);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = this.inputSelectStyle;
            if (governmentIdStepInputSelectStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepInputSelectStyle.writeToParcel(parcel, i);
            }
            GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle = this.imageLocalStyle;
            if (governmentIdStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdStepImageLocalStyle.writeToParcel(parcel, i);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                combinedStepAlignment.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer governmentIdCaptureHintText;
        private final StepTextBasedComponentStyleContainer governmentIdProcessingText;
        private final StepTextBasedComponentStyleContainer governmentIdVerticalOption;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepTextBasedComponentStyle[] newArray(int i) {
                return new GovernmentIdStepTextBasedComponentStyle[i];
            }
        }

        public GovernmentIdStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4) {
            this.base = stepTextBasedComponentStyleContainer;
            this.governmentIdVerticalOption = stepTextBasedComponentStyleContainer2;
            this.governmentIdCaptureHintText = stepTextBasedComponentStyleContainer3;
            this.governmentIdProcessingText = stepTextBasedComponentStyleContainer4;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdCaptureHintText() {
            return this.governmentIdCaptureHintText;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingText() {
            return this.governmentIdProcessingText;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdVerticalOption() {
            return this.governmentIdVerticalOption;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.governmentIdVerticalOption;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.governmentIdCaptureHintText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4 = this.governmentIdProcessingText;
            if (stepTextBasedComponentStyleContainer4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer4.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer governmentIdProcessingTitle;

        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTitleComponentStyle> {
            @Override
            @NotNull
            public final GovernmentIdStepTitleComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdStepTitleComponentStyle[] newArray(int i) {
                return new GovernmentIdStepTitleComponentStyle[i];
            }
        }

        public GovernmentIdStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.governmentIdProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingTitle() {
            return this.governmentIdProcessingTitle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.governmentIdProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class InputSelectStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectStyleContainer> CREATOR = new Creator();
        private final InputSelectComponentStyle base;

        public static final class Creator implements Parcelable.Creator<InputSelectStyleContainer> {
            @Override
            @NotNull
            public final InputSelectStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new InputSelectStyleContainer(parcel.readInt() == 0 ? null : InputSelectComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final InputSelectStyleContainer[] newArray(int i) {
                return new InputSelectStyleContainer[i];
            }
        }

        public InputSelectStyleContainer(InputSelectComponentStyle inputSelectComponentStyle) {
            this.base = inputSelectComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final InputSelectComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            InputSelectComponentStyle inputSelectComponentStyle = this.base;
            if (inputSelectComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSelectComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepBorderColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor selfieCaptureFeedBox;

        public static final class Creator implements Parcelable.Creator<SelfieStepBorderColor> {
            @Override
            @NotNull
            public final SelfieStepBorderColor createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SelfieStepBorderColor[] newArray(int i) {
                return new SelfieStepBorderColor[i];
            }
        }

        public SelfieStepBorderColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.selfieCaptureFeedBox = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.selfieCaptureFeedBox;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepBorderWidth> CREATOR = new Creator();
        private final StyleElements.MeasurementSet selfieCaptureFeedBox;

        public static final class Creator implements Parcelable.Creator<SelfieStepBorderWidth> {
            @Override
            @NotNull
            public final SelfieStepBorderWidth createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SelfieStepBorderWidth[] newArray(int i) {
                return new SelfieStepBorderWidth[i];
            }
        }

        public SelfieStepBorderWidth(StyleElements.MeasurementSet measurementSet) {
            this.selfieCaptureFeedBox = measurementSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.MeasurementSet measurementSet = this.selfieCaptureFeedBox;
            if (measurementSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurementSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;
        private final StyleElements.SimpleElementColor selfieCaptureIconFillColor;

        public static final class Creator implements Parcelable.Creator<SelfieStepFillColor> {
            @Override
            @NotNull
            public final SelfieStepFillColor createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final SelfieStepFillColor[] newArray(int i) {
                return new SelfieStepFillColor[i];
            }
        }

        public SelfieStepFillColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.selfieCaptureIconFillColor = simpleElementColor2;
            this.selfieCaptureIconBackgroundFillColor = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconBackgroundFillColor() {
            return this.selfieCaptureIconBackgroundFillColor;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconFillColor() {
            return this.selfieCaptureIconFillColor;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconFillColor;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.selfieCaptureIconBackgroundFillColor;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepImageLocalStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepImageLocalStyle> CREATOR = new Creator();
        private final SelfieStepImageLocalStyleContainer selfieStartIcon;

        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyle> {
            @Override
            @NotNull
            public final SelfieStepImageLocalStyle createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepImageLocalStyle(parcel.readInt() == 0 ? null : SelfieStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SelfieStepImageLocalStyle[] newArray(int i) {
                return new SelfieStepImageLocalStyle[i];
            }
        }

        public SelfieStepImageLocalStyle(SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer) {
            this.selfieStartIcon = selfieStepImageLocalStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final SelfieStepImageLocalStyleContainer getSelfieStartIcon() {
            return this.selfieStartIcon;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer = this.selfieStartIcon;
            if (selfieStepImageLocalStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepImageLocalStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepImageLocalStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepImageLocalStyleContainer> CREATOR = new Creator();
        private final LocalImageComponentStyle base;

        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyleContainer> {
            @Override
            @NotNull
            public final SelfieStepImageLocalStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SelfieStepImageLocalStyleContainer[] newArray(int i) {
                return new SelfieStepImageLocalStyleContainer[i];
            }
        }

        public SelfieStepImageLocalStyleContainer(LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localImageComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;
        private final StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;

        public static final class Creator implements Parcelable.Creator<SelfieStepStrokeColor> {
            @Override
            @NotNull
            public final SelfieStepStrokeColor createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final SelfieStepStrokeColor[] newArray(int i) {
                return new SelfieStepStrokeColor[i];
            }
        }

        public SelfieStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.selfieCaptureIconStrokeColor = simpleElementColor2;
            this.captureOverlayHeaderButton = simpleElementColor3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        public final StyleElements.SimpleElementColor getSelfieCaptureIconStrokeColor() {
            return this.selfieCaptureIconStrokeColor;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconStrokeColor;
            if (simpleElementColor2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor2.writeToParcel(parcel, i);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.captureOverlayHeaderButton;
            if (simpleElementColor3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<SelfieStepStyle> CREATOR = new Creator();
        private final CombinedStepAlignment alignment;
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final SelfieStepBorderColor borderColor;
        private final StepBorderRadiusStyle borderRadius;
        private final SelfieStepBorderWidth borderWidth;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final StepTextBasedComponentStyle disclaimerStyle;
        private final SelfieStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final SelfieStepImageLocalStyle imageLocalStyle;
        private final StepPaddingStyle padding;
        private final SelfieStepStrokeColor strokeColor;
        private final SelfieStepTextBasedComponentStyle textStyle;
        private final SelfieStepTitleComponentStyle titleStyle;

        public static final class Creator implements Parcelable.Creator<SelfieStepStyle> {
            @Override
            @NotNull
            public final SelfieStepStyle createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final SelfieStepStyle[] newArray(int i) {
                return new SelfieStepStyle[i];
            }
        }

        public SelfieStepStyle(@g(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, SelfieStepTitleComponentStyle selfieStepTitleComponentStyle, SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, SelfieStepStrokeColor selfieStepStrokeColor, SelfieStepBorderColor selfieStepBorderColor, SelfieStepBorderWidth selfieStepBorderWidth, SelfieStepFillColor selfieStepFillColor, SelfieStepImageLocalStyle selfieStepImageLocalStyle, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle, CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = selfieStepTitleComponentStyle;
            this.textStyle = selfieStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle;
            this.strokeColor = selfieStepStrokeColor;
            this.borderColor = selfieStepBorderColor;
            this.borderWidth = selfieStepBorderWidth;
            this.fillColor = selfieStepFillColor;
            this.imageLocalStyle = selfieStepImageLocalStyle;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override
        public Drawable backgroundImageDrawable(@NotNull Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final SelfieStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final SelfieStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (captureOverlayHeaderButton = selfieStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final SelfieStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (base = selfieStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final SelfieStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        @Override
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieProcessingText = selfieStepTextBasedComponentStyle.getSelfieProcessingText()) == null) {
                return null;
            }
            return selfieProcessingText.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingTitle;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (selfieProcessingTitle = selfieStepTitleComponentStyle.getSelfieProcessingTitle()) == null) {
                return null;
            }
            return selfieProcessingTitle.getBase();
        }

        public final Integer getSelfieCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor selfieCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null || (selfieCaptureFeedBox = selfieStepBorderColor.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Double getSelfieCaptureFeedBoxBorderWidthValue() {
            StyleElements.MeasurementSet selfieCaptureFeedBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null || (selfieCaptureFeedBox = selfieStepBorderWidth.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        public final TextBasedComponentStyle getSelfieCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer selfieCaptureHintText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieCaptureHintText = selfieStepTextBasedComponentStyle.getSelfieCaptureHintText()) == null) {
                return null;
            }
            return selfieCaptureHintText.getBase();
        }

        public final Integer getSelfieCaptureIconBackgroundFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconBackgroundFillColor = selfieStepFillColor.getSelfieCaptureIconBackgroundFillColor()) == null || (base = selfieCaptureIconBackgroundFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getSelfieCaptureIconFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconFillColor = selfieStepFillColor.getSelfieCaptureIconFillColor()) == null || (base = selfieCaptureIconFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getSelfieCaptureIconStrokeColor() {
            StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (selfieCaptureIconStrokeColor = selfieStepStrokeColor.getSelfieCaptureIconStrokeColor()) == null || (base = selfieCaptureIconStrokeColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final LocalImageComponentStyle getSelfieStartIconStyle() {
            SelfieStepImageLocalStyleContainer selfieStartIcon;
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null || (selfieStartIcon = selfieStepImageLocalStyle.getSelfieStartIcon()) == null) {
                return null;
            }
            return selfieStartIcon.getBase();
        }

        public final SelfieStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (base = selfieStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final SelfieStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (base = selfieStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final SelfieStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (base = selfieStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, i);
            }
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepTitleComponentStyle.writeToParcel(parcel, i);
            }
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepStrokeColor.writeToParcel(parcel, i);
            }
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepBorderColor.writeToParcel(parcel, i);
            }
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepBorderWidth.writeToParcel(parcel, i);
            }
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepFillColor.writeToParcel(parcel, i);
            }
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieStepImageLocalStyle.writeToParcel(parcel, i);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, i);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(parcel, i);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                combinedStepAlignment.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer selfieCaptureHintText;
        private final StepTextBasedComponentStyleContainer selfieProcessingText;

        public static final class Creator implements Parcelable.Creator<SelfieStepTextBasedComponentStyle> {
            @Override
            @NotNull
            public final SelfieStepTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final SelfieStepTextBasedComponentStyle[] newArray(int i) {
                return new SelfieStepTextBasedComponentStyle[i];
            }
        }

        public SelfieStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.selfieProcessingText = stepTextBasedComponentStyleContainer2;
            this.selfieCaptureHintText = stepTextBasedComponentStyleContainer3;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getSelfieCaptureHintText() {
            return this.selfieCaptureHintText;
        }

        public final StepTextBasedComponentStyleContainer getSelfieProcessingText() {
            return this.selfieProcessingText;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.selfieProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.selfieCaptureHintText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class SelfieStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer selfieProcessingTitle;

        public static final class Creator implements Parcelable.Creator<SelfieStepTitleComponentStyle> {
            @Override
            @NotNull
            public final SelfieStepTitleComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new SelfieStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final SelfieStepTitleComponentStyle[] newArray(int i) {
                return new SelfieStepTitleComponentStyle[i];
            }
        }

        public SelfieStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.selfieProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getSelfieProcessingTitle() {
            return this.selfieProcessingTitle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.selfieProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.ComplexElementColor option;

        public static final class Creator implements Parcelable.Creator<StepBackgroundColorStyle> {
            @Override
            @NotNull
            public final StepBackgroundColorStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final StepBackgroundColorStyle[] newArray(int i) {
                return new StepBackgroundColorStyle[i];
            }
        }

        public StepBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.ComplexElementColor complexElementColor) {
            this.base = simpleElementColor;
            this.option = complexElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getOption() {
            return this.option;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
            StyleElements.ComplexElementColor complexElementColor = this.option;
            if (complexElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                complexElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepBackgroundImageNameContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageNameContainer> CREATOR = new Creator();
        private final String localName;

        public static final class Creator implements Parcelable.Creator<StepBackgroundImageNameContainer> {
            @Override
            @NotNull
            public final StepBackgroundImageNameContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepBackgroundImageNameContainer(parcel.readString());
            }

            @Override
            @NotNull
            public final StepBackgroundImageNameContainer[] newArray(int i) {
                return new StepBackgroundImageNameContainer[i];
            }
        }

        public StepBackgroundImageNameContainer(String str) {
            this.localName = str;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getLocalName() {
            return this.localName;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.localName);
        }
    }

    @i(generateAdapter = true)
    public static final class StepBackgroundImageStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageStyle> CREATOR = new Creator();
        private final StepBackgroundImageStyleContainer base;

        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyle> {
            @Override
            @NotNull
            public final StepBackgroundImageStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepBackgroundImageStyle(parcel.readInt() == 0 ? null : StepBackgroundImageStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepBackgroundImageStyle[] newArray(int i) {
                return new StepBackgroundImageStyle[i];
            }
        }

        public StepBackgroundImageStyle(StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer) {
            this.base = stepBackgroundImageStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundImageStyleContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer = this.base;
            if (stepBackgroundImageStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepBackgroundImageStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageStyleContainer> CREATOR = new Creator();
        private final StepBackgroundImageNameContainer base;

        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyleContainer> {
            @Override
            @NotNull
            public final StepBackgroundImageStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepBackgroundImageStyleContainer(parcel.readInt() == 0 ? null : StepBackgroundImageNameContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepBackgroundImageStyleContainer[] newArray(int i) {
                return new StepBackgroundImageStyleContainer[i];
            }
        }

        public StepBackgroundImageStyleContainer(StepBackgroundImageNameContainer stepBackgroundImageNameContainer) {
            this.base = stepBackgroundImageNameContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepBackgroundImageNameContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepBackgroundImageNameContainer stepBackgroundImageNameContainer = this.base;
            if (stepBackgroundImageNameContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageNameContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement modal;

        public static final class Creator implements Parcelable.Creator<StepBorderRadiusStyle> {
            @Override
            @NotNull
            public final StepBorderRadiusStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepBorderRadiusStyle[] newArray(int i) {
                return new StepBorderRadiusStyle[i];
            }
        }

        public StepBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.modal = measurement;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                measurement.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepCancelButtonComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepCancelButtonComponentStyleContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        public static final class Creator implements Parcelable.Creator<StepCancelButtonComponentStyleContainer> {
            @Override
            @NotNull
            public final StepCancelButtonComponentStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepCancelButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepCancelButtonComponentStyleContainer[] newArray(int i) {
                return new StepCancelButtonComponentStyleContainer[i];
            }
        }

        public StepCancelButtonComponentStyleContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
            this.base = buttonCancelComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ButtonCancelComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.base;
            if (buttonCancelComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPaddingStyle> CREATOR = new Creator();
        private final StepPaddingStyleContainer modal;

        public static final class Creator implements Parcelable.Creator<StepPaddingStyle> {
            @Override
            @NotNull
            public final StepPaddingStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepPaddingStyle(parcel.readInt() == 0 ? null : StepPaddingStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepPaddingStyle[] newArray(int i) {
                return new StepPaddingStyle[i];
            }
        }

        public StepPaddingStyle(StepPaddingStyleContainer stepPaddingStyleContainer) {
            this.modal = stepPaddingStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepPaddingStyleContainer getModal() {
            return this.modal;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepPaddingStyleContainer stepPaddingStyleContainer = this.modal;
            if (stepPaddingStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepPaddingStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPaddingStyleContainer> CREATOR = new Creator();
        private final StyleElements.SizeSet base;

        public static final class Creator implements Parcelable.Creator<StepPaddingStyleContainer> {
            @Override
            @NotNull
            public final StepPaddingStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepPaddingStyleContainer(parcel.readInt() == 0 ? null : StyleElements.SizeSet.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepPaddingStyleContainer[] newArray(int i) {
                return new StepPaddingStyleContainer[i];
            }
        }

        public StepPaddingStyleContainer(StyleElements.SizeSet sizeSet) {
            this.base = sizeSet;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SizeSet getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SizeSet sizeSet = this.base;
            if (sizeSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                sizeSet.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepPrimaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPrimaryButtonComponentStyle> CREATOR = new Creator();
        private final StepSubmitButtonComponentStyleContainer base;
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;

        public static final class Creator implements Parcelable.Creator<StepPrimaryButtonComponentStyle> {
            @Override
            @NotNull
            public final StepPrimaryButtonComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final StepPrimaryButtonComponentStyle[] newArray(int i) {
                return new StepPrimaryButtonComponentStyle[i];
            }
        }

        public StepPrimaryButtonComponentStyle(StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepSecondaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepSecondaryButtonComponentStyle> CREATOR = new Creator();
        private final StepCancelButtonComponentStyleContainer base;
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;

        public static final class Creator implements Parcelable.Creator<StepSecondaryButtonComponentStyle> {
            @Override
            @NotNull
            public final StepSecondaryButtonComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final StepSecondaryButtonComponentStyle[] newArray(int i) {
                return new StepSecondaryButtonComponentStyle[i];
            }
        }

        public StepSecondaryButtonComponentStyle(StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepSubmitButtonComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepSubmitButtonComponentStyleContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public static final class Creator implements Parcelable.Creator<StepSubmitButtonComponentStyleContainer> {
            @Override
            @NotNull
            public final StepSubmitButtonComponentStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepSubmitButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepSubmitButtonComponentStyleContainer[] newArray(int i) {
                return new StepSubmitButtonComponentStyleContainer[i];
            }
        }

        public StepSubmitButtonComponentStyleContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;

        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyle> {
            @Override
            @NotNull
            public final StepTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new StepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepTextBasedComponentStyle[] newArray(int i) {
                return new StepTextBasedComponentStyle[i];
            }
        }

        public StepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer) {
            this.base = stepTextBasedComponentStyleContainer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class StepTextBasedComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepTextBasedComponentStyleContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyleContainer> {
            @Override
            @NotNull
            public final StepTextBasedComponentStyleContainer createFromParcel(@NotNull Parcel parcel) {
                return new StepTextBasedComponentStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final StepTextBasedComponentStyleContainer[] newArray(int i) {
                return new StepTextBasedComponentStyleContainer[i];
            }
        }

        public StepTextBasedComponentStyleContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                textBasedComponentStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepAlignment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepAlignment> CREATOR = new Creator();
        private final StyleElements.Position base;

        public static final class Creator implements Parcelable.Creator<UiStepAlignment> {
            @Override
            @NotNull
            public final UiStepAlignment createFromParcel(@NotNull Parcel parcel) {
                return new UiStepAlignment(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final UiStepAlignment[] newArray(int i) {
                return new UiStepAlignment[i];
            }
        }

        public UiStepAlignment(StyleElements.Position position) {
            this.base = position;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.Position position = this.base;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepFillColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<UiStepFillColor> {
            @Override
            @NotNull
            public final UiStepFillColor createFromParcel(@NotNull Parcel parcel) {
                return new UiStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final UiStepFillColor[] newArray(int i) {
                return new UiStepFillColor[i];
            }
        }

        public UiStepFillColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepStrokeColor> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public static final class Creator implements Parcelable.Creator<UiStepStrokeColor> {
            @Override
            @NotNull
            public final UiStepStrokeColor createFromParcel(@NotNull Parcel parcel) {
                return new UiStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final UiStepStrokeColor[] newArray(int i) {
                return new UiStepStrokeColor[i];
            }
        }

        public UiStepStrokeColor(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColor.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<UiStepStyle> CREATOR = new Creator();
        private final UiStepAlignment alignment;
        private final StepBackgroundColorStyle backgroundColor;
        private final StepBackgroundImageStyle backgroundImage;
        private final StepBorderRadiusStyle borderRadius;
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;
        private final UiStepFillColor fillColor;
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        private final StepPaddingStyle padding;
        private final UiStepStrokeColor strokeColor;
        private final UiStepTextBasedComponentStyle textStyle;
        private final UiStepTitleComponentStyle titleStyle;

        public static final class Creator implements Parcelable.Creator<UiStepStyle> {
            @Override
            @NotNull
            public final UiStepStyle createFromParcel(@NotNull Parcel parcel) {
                return new UiStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepAlignment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepBorderRadiusStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final UiStepStyle[] newArray(int i) {
                return new UiStepStyle[i];
            }
        }

        public UiStepStyle(@g(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, UiStepTitleComponentStyle uiStepTitleComponentStyle, UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, UiStepStrokeColor uiStepStrokeColor, UiStepFillColor uiStepFillColor, UiStepAlignment uiStepAlignment, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = uiStepTitleComponentStyle;
            this.textStyle = uiStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = uiStepStrokeColor;
            this.fillColor = uiStepFillColor;
            this.alignment = uiStepAlignment;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
        }

        @Override
        public Drawable backgroundImageDrawable(@NotNull Context context) {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            return StepStylesKt.getBackgroundDrawable(context, (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) ? null : base2.getLocalName());
        }

        public final AttributeStyles.HeaderButtonColorStyle component1() {
            return this.headerButtonColor;
        }

        public final UiStepAlignment component10() {
            return this.alignment;
        }

        public final StepPaddingStyle component11() {
            return this.padding;
        }

        public final StepBorderRadiusStyle component12() {
            return this.borderRadius;
        }

        public final StepBackgroundColorStyle component2() {
            return this.backgroundColor;
        }

        public final StepBackgroundImageStyle component3() {
            return this.backgroundImage;
        }

        public final UiStepTitleComponentStyle component4() {
            return this.titleStyle;
        }

        public final UiStepTextBasedComponentStyle component5() {
            return this.textStyle;
        }

        public final StepPrimaryButtonComponentStyle component6() {
            return this.buttonPrimaryStyle;
        }

        public final StepSecondaryButtonComponentStyle component7() {
            return this.buttonSecondaryStyle;
        }

        public final UiStepStrokeColor component8() {
            return this.strokeColor;
        }

        public final UiStepFillColor component9() {
            return this.fillColor;
        }

        @NotNull
        public final UiStepStyle copy(@g(name = "textColor") AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, UiStepTitleComponentStyle uiStepTitleComponentStyle, UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, UiStepStrokeColor uiStepStrokeColor, UiStepFillColor uiStepFillColor, UiStepAlignment uiStepAlignment, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle) {
            return new UiStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, uiStepTitleComponentStyle, uiStepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, uiStepStrokeColor, uiStepFillColor, uiStepAlignment, stepPaddingStyle, stepBorderRadiusStyle);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiStepStyle)) {
                return false;
            }
            UiStepStyle uiStepStyle = (UiStepStyle) obj;
            return Intrinsics.b(this.headerButtonColor, uiStepStyle.headerButtonColor) && Intrinsics.b(this.backgroundColor, uiStepStyle.backgroundColor) && Intrinsics.b(this.backgroundImage, uiStepStyle.backgroundImage) && Intrinsics.b(this.titleStyle, uiStepStyle.titleStyle) && Intrinsics.b(this.textStyle, uiStepStyle.textStyle) && Intrinsics.b(this.buttonPrimaryStyle, uiStepStyle.buttonPrimaryStyle) && Intrinsics.b(this.buttonSecondaryStyle, uiStepStyle.buttonSecondaryStyle) && Intrinsics.b(this.strokeColor, uiStepStyle.strokeColor) && Intrinsics.b(this.fillColor, uiStepStyle.fillColor) && Intrinsics.b(this.alignment, uiStepStyle.alignment) && Intrinsics.b(this.padding, uiStepStyle.padding) && Intrinsics.b(this.borderRadius, uiStepStyle.borderRadius);
        }

        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null || (base = uiStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Override
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null || (modal = stepPaddingStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.PositionType getPageLevelVerticalAlignment() {
            StyleElements.Position base;
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null || (base = uiStepAlignment.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingText;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (uiStepProcessingText = uiStepTextBasedComponentStyle.getUiStepProcessingText()) == null) {
                return null;
            }
            return uiStepProcessingText.getBase();
        }

        @Override
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingTitle;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (uiStepProcessingTitle = uiStepTitleComponentStyle.getUiStepProcessingTitle()) == null) {
                return null;
            }
            return uiStepProcessingTitle.getBase();
        }

        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null || (base = uiStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (base = uiStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (base = uiStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public int hashCode() {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            int iHashCode = (headerButtonColorStyle == null ? 0 : headerButtonColorStyle.hashCode()) * 31;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            int iHashCode2 = (iHashCode + (stepBackgroundColorStyle == null ? 0 : stepBackgroundColorStyle.hashCode())) * 31;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            int iHashCode3 = (iHashCode2 + (stepBackgroundImageStyle == null ? 0 : stepBackgroundImageStyle.hashCode())) * 31;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            int iHashCode4 = (iHashCode3 + (uiStepTitleComponentStyle == null ? 0 : uiStepTitleComponentStyle.hashCode())) * 31;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            int iHashCode5 = (iHashCode4 + (uiStepTextBasedComponentStyle == null ? 0 : uiStepTextBasedComponentStyle.hashCode())) * 31;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            int iHashCode6 = (iHashCode5 + (stepPrimaryButtonComponentStyle == null ? 0 : stepPrimaryButtonComponentStyle.hashCode())) * 31;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            int iHashCode7 = (iHashCode6 + (stepSecondaryButtonComponentStyle == null ? 0 : stepSecondaryButtonComponentStyle.hashCode())) * 31;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            int iHashCode8 = (iHashCode7 + (uiStepStrokeColor == null ? 0 : uiStepStrokeColor.hashCode())) * 31;
            UiStepFillColor uiStepFillColor = this.fillColor;
            int iHashCode9 = (iHashCode8 + (uiStepFillColor == null ? 0 : uiStepFillColor.hashCode())) * 31;
            UiStepAlignment uiStepAlignment = this.alignment;
            int iHashCode10 = (iHashCode9 + (uiStepAlignment == null ? 0 : uiStepAlignment.hashCode())) * 31;
            StepPaddingStyle stepPaddingStyle = this.padding;
            int iHashCode11 = (iHashCode10 + (stepPaddingStyle == null ? 0 : stepPaddingStyle.hashCode())) * 31;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            return iHashCode11 + (stepBorderRadiusStyle != null ? stepBorderRadiusStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UiStepStyle(headerButtonColor=" + this.headerButtonColor + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", titleStyle=" + this.titleStyle + ", textStyle=" + this.textStyle + ", buttonPrimaryStyle=" + this.buttonPrimaryStyle + ", buttonSecondaryStyle=" + this.buttonSecondaryStyle + ", strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", alignment=" + this.alignment + ", padding=" + this.padding + ", borderRadius=" + this.borderRadius + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButtonColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(parcel, i);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(parcel, i);
            }
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepTitleComponentStyle.writeToParcel(parcel, i);
            }
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepTextBasedComponentStyle.writeToParcel(parcel, i);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(parcel, i);
            }
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepStrokeColor.writeToParcel(parcel, i);
            }
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepFillColor.writeToParcel(parcel, i);
            }
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepAlignment.writeToParcel(parcel, i);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepPaddingStyle.writeToParcel(parcel, i);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepTextBasedComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer uiStepProcessingText;

        public static final class Creator implements Parcelable.Creator<UiStepTextBasedComponentStyle> {
            @Override
            @NotNull
            public final UiStepTextBasedComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new UiStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final UiStepTextBasedComponentStyle[] newArray(int i) {
                return new UiStepTextBasedComponentStyle[i];
            }
        }

        public UiStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.uiStepProcessingText = stepTextBasedComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getUiStepProcessingText() {
            return this.uiStepProcessingText;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.uiStepProcessingText;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepTitleComponentStyle> CREATOR = new Creator();
        private final StepTextBasedComponentStyleContainer base;
        private final StepTextBasedComponentStyleContainer uiStepProcessingTitle;

        public static final class Creator implements Parcelable.Creator<UiStepTitleComponentStyle> {
            @Override
            @NotNull
            public final UiStepTitleComponentStyle createFromParcel(@NotNull Parcel parcel) {
                return new UiStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final UiStepTitleComponentStyle[] newArray(int i) {
                return new UiStepTitleComponentStyle[i];
            }
        }

        public UiStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2) {
            this.base = stepTextBasedComponentStyleContainer;
            this.uiStepProcessingTitle = stepTextBasedComponentStyleContainer2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        public final StepTextBasedComponentStyleContainer getUiStepProcessingTitle() {
            return this.uiStepProcessingTitle;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(parcel, i);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.uiStepProcessingTitle;
            if (stepTextBasedComponentStyleContainer2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(parcel, i);
            }
        }
    }

    public StepStyles(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StepStyles() {
    }
}
