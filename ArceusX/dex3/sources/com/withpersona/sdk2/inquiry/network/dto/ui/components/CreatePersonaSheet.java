package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class CreatePersonaSheet implements UiComponentConfig {

    @NotNull
    public static final String type = "button_create_persona";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final CreatePersonaSheetStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CreatePersonaSheet> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class CreatePersonaSheetStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CreatePersonaSheetStyle> CREATOR = new Creator();
        private final AttributeStyles.FooterColorStyle backgroundColor;
        private final AttributeStyles.FooterBorderWidthStyle borderWidth;
        private final AttributeStyles.FooterPaddingStyle padding;

        public static final class Creator implements Parcelable.Creator<CreatePersonaSheetStyle> {
            @Override
            @NotNull
            public final CreatePersonaSheetStyle createFromParcel(@NotNull Parcel parcel) {
                return new CreatePersonaSheetStyle(parcel.readInt() == 0 ? null : AttributeStyles.FooterColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.FooterPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.FooterBorderWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final CreatePersonaSheetStyle[] newArray(int i) {
                return new CreatePersonaSheetStyle[i];
            }
        }

        public CreatePersonaSheetStyle(AttributeStyles.FooterColorStyle footerColorStyle, AttributeStyles.FooterPaddingStyle footerPaddingStyle, AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle) {
            this.backgroundColor = footerColorStyle;
            this.padding = footerPaddingStyle;
            this.borderWidth = footerBorderWidthStyle;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.FooterColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.FooterBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.FooterPaddingStyle getPadding() {
            return this.padding;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.FooterColorStyle footerColorStyle = this.backgroundColor;
            if (footerColorStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerColorStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.FooterPaddingStyle footerPaddingStyle = this.padding;
            if (footerPaddingStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerPaddingStyle.writeToParcel(parcel, i);
            }
            AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = this.borderWidth;
            if (footerBorderWidthStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                footerBorderWidthStyle.writeToParcel(parcel, i);
            }
        }
    }

    public static final class Creator implements Parcelable.Creator<CreatePersonaSheet> {
        @Override
        @NotNull
        public final CreatePersonaSheet createFromParcel(@NotNull Parcel parcel) {
            return new CreatePersonaSheet(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreatePersonaSheetStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final CreatePersonaSheet[] newArray(int i) {
            return new CreatePersonaSheet[i];
        }
    }

    @i(generateAdapter = true)
    public static final class Pages implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Pages> CREATOR = new Creator();
        private final CardCtaPage ctaCard;

        public static final class Creator implements Parcelable.Creator<Pages> {
            @Override
            @NotNull
            public final Pages createFromParcel(@NotNull Parcel parcel) {
                return new Pages(parcel.readInt() == 0 ? null : CardCtaPage.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final Pages[] newArray(int i) {
                return new Pages[i];
            }
        }

        public Pages(CardCtaPage cardCtaPage) {
            this.ctaCard = cardCtaPage;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final CardCtaPage getCtaCard() {
            return this.ctaCard;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            CardCtaPage cardCtaPage = this.ctaCard;
            if (cardCtaPage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cardCtaPage.writeToParcel(parcel, i);
            }
        }
    }

    public CreatePersonaSheet(@NotNull String str, Attributes attributes, CreatePersonaSheetStyle createPersonaSheetStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = createPersonaSheetStyle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public final Integer getBackgroundColor() {
        AttributeStyles.FooterColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (backgroundColor = createPersonaSheetStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final StyleElements.SizeSet getBorderWidth() {
        AttributeStyles.FooterBorderWidthStyle borderWidth;
        StyleElements.MeasurementSet base;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (borderWidth = createPersonaSheetStyle.getBorderWidth()) == null || (base = borderWidth.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final StyleElements.SizeSet getPadding() {
        AttributeStyles.FooterPaddingStyle padding;
        StyleElements.MeasurementSet base;
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null || (padding = createPersonaSheetStyle.getPadding()) == null || (base = padding.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final CreatePersonaSheetStyle getStyles() {
        return this.styles;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributes.writeToParcel(parcel, i);
        }
        CreatePersonaSheetStyle createPersonaSheetStyle = this.styles;
        if (createPersonaSheetStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createPersonaSheetStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    public static final class CardCtaPage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CardCtaPage> CREATOR = new Creator();
        private final ComponentNameMapping componentNameMapping;

        @NotNull
        private final NextStep.Ui uiStep;

        @i(generateAdapter = true)
        public static final class ComponentNameMapping implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
            private final String dismissButton;
            private final String startButton;

            public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                @Override
                @NotNull
                public final ComponentNameMapping createFromParcel(@NotNull Parcel parcel) {
                    return new ComponentNameMapping(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final ComponentNameMapping[] newArray(int i) {
                    return new ComponentNameMapping[i];
                }
            }

            public ComponentNameMapping() {
                String str = null;
                this(str, str, 3, str);
            }

            public static ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = componentNameMapping.startButton;
                }
                if ((i & 2) != 0) {
                    str2 = componentNameMapping.dismissButton;
                }
                return componentNameMapping.copy(str, str2);
            }

            public final String component1() {
                return this.startButton;
            }

            public final String component2() {
                return this.dismissButton;
            }

            @NotNull
            public final ComponentNameMapping copy(String str, String str2) {
                return new ComponentNameMapping(str, str2);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ComponentNameMapping)) {
                    return false;
                }
                ComponentNameMapping componentNameMapping = (ComponentNameMapping) obj;
                return Intrinsics.b(this.startButton, componentNameMapping.startButton) && Intrinsics.b(this.dismissButton, componentNameMapping.dismissButton);
            }

            public final String getDismissButton() {
                return this.dismissButton;
            }

            public final String getStartButton() {
                return this.startButton;
            }

            public int hashCode() {
                String str = this.startButton;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.dismissButton;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "ComponentNameMapping(startButton=" + this.startButton + ", dismissButton=" + this.dismissButton + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                parcel.writeString(this.startButton);
                parcel.writeString(this.dismissButton);
            }

            public ComponentNameMapping(String str, String str2) {
                this.startButton = str;
                this.dismissButton = str2;
            }

            public ComponentNameMapping(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }
        }

        public static final class Creator implements Parcelable.Creator<CardCtaPage> {
            @Override
            @NotNull
            public final CardCtaPage createFromParcel(@NotNull Parcel parcel) {
                return new CardCtaPage(NextStep.Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
            }

            @Override
            @NotNull
            public final CardCtaPage[] newArray(int i) {
                return new CardCtaPage[i];
            }
        }

        public CardCtaPage(@NotNull NextStep.Ui ui, ComponentNameMapping componentNameMapping) {
            this.uiStep = ui;
            this.componentNameMapping = componentNameMapping;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final ComponentNameMapping getComponentNameMapping() {
            return this.componentNameMapping;
        }

        @NotNull
        public final NextStep.Ui getUiStep() {
            return this.uiStep;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            this.uiStep.writeToParcel(parcel, i);
            ComponentNameMapping componentNameMapping = this.componentNameMapping;
            if (componentNameMapping == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                componentNameMapping.writeToParcel(parcel, i);
            }
        }

        public CardCtaPage(NextStep.Ui ui, ComponentNameMapping componentNameMapping, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(ui, (i & 2) != 0 ? null : componentNameMapping);
        }
    }

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final Boolean autoCompleteOnDismiss;

        @NotNull
        private final Pages pages;
        private final String url;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                Boolean boolValueOf;
                Pages pagesCreateFromParcel = Pages.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Attributes(pagesCreateFromParcel, string, boolValueOf);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(@NotNull Pages pages, String str, Boolean bool) {
            this.pages = pages;
            this.url = str;
            this.autoCompleteOnDismiss = bool;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Boolean getAutoCompleteOnDismiss() {
            return this.autoCompleteOnDismiss;
        }

        @NotNull
        public final Pages getPages() {
            return this.pages;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            int iBooleanValue;
            this.pages.writeToParcel(parcel, i);
            parcel.writeString(this.url);
            Boolean bool = this.autoCompleteOnDismiss;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                parcel.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            parcel.writeInt(iBooleanValue);
        }

        public Attributes(Pages pages, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pages, str, (i & 4) != 0 ? null : bool);
        }
    }
}
