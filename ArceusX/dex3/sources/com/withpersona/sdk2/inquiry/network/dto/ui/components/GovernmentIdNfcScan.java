package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class GovernmentIdNfcScan implements UiComponentConfig {

    @NotNull
    public static final String cardAccessNumberName = "card_access_number";

    @NotNull
    public static final String dateOfBirthName = "date_of_birth";

    @NotNull
    public static final String documentNumberName = "document_number";

    @NotNull
    public static final String expirationDateName = "expiration_date";

    @NotNull
    public static final String launchButtonName = "launch_button";

    @NotNull
    public static final String type = "government_id_nfc_scan";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final GovernmentIdNfcScanStyles styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Creator();

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String authenticating;
        private final String authenticationErrorPrompt;
        private final String cardAccessNumberLabel;
        private final String connectionLostPrompt;
        private final String dateOfBirthLabel;
        private final JsonLogicBoolean disabled;
        private final String documentNumberLabel;
        private final String enableNfcPrompt;
        private final List<DataGroupTypes> enabledDataGroups;
        private final String expirationDateLabel;
        private final JsonLogicBoolean hidden;
        private final Boolean hidePrefilledInputs;
        private final String launchButtonText;
        private final String prefillCardAccessNumber;
        private final String prefillDateOfBirth;
        private final String prefillDocumentNumber;
        private final String prefillExpirationDate;
        private final String reading;
        private final String requiredText;
        private final String retryError;
        private final String scanDocumentError;
        private final String scanDocumentPrompt;
        private final String scanDocumentSuccess;
        private final String unsupportedDocumentType;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                ArrayList arrayList;
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel2 = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(DataGroupTypes.valueOf(parcel.readString()));
                    }
                }
                return new Attributes(jsonLogicBooleanCreateFromParcel, jsonLogicBooleanCreateFromParcel2, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<? extends DataGroupTypes> list, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19, String str20) {
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.documentNumberLabel = str;
            this.prefillCardAccessNumber = str2;
            this.prefillDocumentNumber = str3;
            this.dateOfBirthLabel = str4;
            this.prefillDateOfBirth = str5;
            this.cardAccessNumberLabel = str6;
            this.expirationDateLabel = str7;
            this.prefillExpirationDate = str8;
            this.launchButtonText = str9;
            this.scanDocumentPrompt = str10;
            this.scanDocumentSuccess = str11;
            this.enabledDataGroups = list;
            this.authenticating = str12;
            this.reading = str13;
            this.requiredText = str14;
            this.scanDocumentError = str15;
            this.enableNfcPrompt = str16;
            this.authenticationErrorPrompt = str17;
            this.hidePrefilledInputs = bool;
            this.connectionLostPrompt = str18;
            this.unsupportedDocumentType = str19;
            this.retryError = str20;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getAuthenticating() {
            return this.authenticating;
        }

        public final String getAuthenticationErrorPrompt() {
            return this.authenticationErrorPrompt;
        }

        public final String getCardAccessNumberLabel() {
            return this.cardAccessNumberLabel;
        }

        public final String getConnectionLostPrompt() {
            return this.connectionLostPrompt;
        }

        public final String getDateOfBirthLabel() {
            return this.dateOfBirthLabel;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getDocumentNumberLabel() {
            return this.documentNumberLabel;
        }

        public final String getEnableNfcPrompt() {
            return this.enableNfcPrompt;
        }

        public final List<DataGroupTypes> getEnabledDataGroups() {
            return this.enabledDataGroups;
        }

        public final String getExpirationDateLabel() {
            return this.expirationDateLabel;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final Boolean getHidePrefilledInputs() {
            return this.hidePrefilledInputs;
        }

        public final String getLaunchButtonText() {
            return this.launchButtonText;
        }

        public final String getPrefillCardAccessNumber() {
            return this.prefillCardAccessNumber;
        }

        public final String getPrefillDateOfBirth() {
            return this.prefillDateOfBirth;
        }

        public final String getPrefillDocumentNumber() {
            return this.prefillDocumentNumber;
        }

        public final String getPrefillExpirationDate() {
            return this.prefillExpirationDate;
        }

        public final String getReading() {
            return this.reading;
        }

        public final String getRequiredText() {
            return this.requiredText;
        }

        public final String getRetryError() {
            return this.retryError;
        }

        public final String getScanDocumentError() {
            return this.scanDocumentError;
        }

        public final String getScanDocumentPrompt() {
            return this.scanDocumentPrompt;
        }

        public final String getScanDocumentSuccess() {
            return this.scanDocumentSuccess;
        }

        public final String getUnsupportedDocumentType() {
            return this.unsupportedDocumentType;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.documentNumberLabel);
            parcel.writeString(this.prefillCardAccessNumber);
            parcel.writeString(this.prefillDocumentNumber);
            parcel.writeString(this.dateOfBirthLabel);
            parcel.writeString(this.prefillDateOfBirth);
            parcel.writeString(this.cardAccessNumberLabel);
            parcel.writeString(this.expirationDateLabel);
            parcel.writeString(this.prefillExpirationDate);
            parcel.writeString(this.launchButtonText);
            parcel.writeString(this.scanDocumentPrompt);
            parcel.writeString(this.scanDocumentSuccess);
            List<DataGroupTypes> list = this.enabledDataGroups;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<DataGroupTypes> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next().name());
                }
            }
            parcel.writeString(this.authenticating);
            parcel.writeString(this.reading);
            parcel.writeString(this.requiredText);
            parcel.writeString(this.scanDocumentError);
            parcel.writeString(this.enableNfcPrompt);
            parcel.writeString(this.authenticationErrorPrompt);
            Boolean bool = this.hidePrefilledInputs;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.connectionLostPrompt);
            parcel.writeString(this.unsupportedDocumentType);
            parcel.writeString(this.retryError);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> generateTextMonths() {
            ArrayList arrayList = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.getDefault());
            for (int i = 0; i < 12; i++) {
                calendar.set(2, i);
                arrayList.add(simpleDateFormat.format(calendar.getTime()));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScan> {
        @Override
        @NotNull
        public final GovernmentIdNfcScan createFromParcel(@NotNull Parcel parcel) {
            return new GovernmentIdNfcScan(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdNfcScanStyles.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final GovernmentIdNfcScan[] newArray(int i) {
            return new GovernmentIdNfcScan[i];
        }
    }

    @i(generateAdapter = false)
    public static final class DataGroupTypes {
        private static final T9.a $ENTRIES;
        private static final DataGroupTypes[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final DataGroupTypes Dg1 = new DataGroupTypes("Dg1", 0);
        public static final DataGroupTypes Dg2 = new DataGroupTypes("Dg2", 1);
        public static final DataGroupTypes Dg14 = new DataGroupTypes("Dg14", 2);
        public static final DataGroupTypes Sod = new DataGroupTypes("Sod", 3);
        public static final DataGroupTypes Unknown = new DataGroupTypes("Unknown", 4);

        public static final class Companion extends h<DataGroupTypes> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @z
            public void toJson(@NotNull t tVar, DataGroupTypes dataGroupTypes) {
            }

            private Companion() {
            }

            @f
            @NotNull
            public DataGroupTypes m240fromJson(@NotNull m mVar) {
                Object objM0 = mVar.M0();
                return Intrinsics.b(objM0, "dg1") ? DataGroupTypes.Dg1 : Intrinsics.b(objM0, "dg2") ? DataGroupTypes.Dg2 : Intrinsics.b(objM0, "dg14") ? DataGroupTypes.Dg14 : Intrinsics.b(objM0, "sod") ? DataGroupTypes.Sod : DataGroupTypes.Unknown;
            }
        }

        private static final DataGroupTypes[] $values() {
            return new DataGroupTypes[]{Dg1, Dg2, Dg14, Sod, Unknown};
        }

        static {
            DataGroupTypes[] dataGroupTypesArr$values = $values();
            $VALUES = dataGroupTypesArr$values;
            $ENTRIES = b.a(dataGroupTypesArr$values);
            Companion = new Companion(null);
        }

        private DataGroupTypes(String str, int i) {
        }

        @NotNull
        public static T9.a<DataGroupTypes> getEntries() {
            return $ENTRIES;
        }

        public static DataGroupTypes valueOf(String str) {
            return (DataGroupTypes) Enum.valueOf(DataGroupTypes.class, str);
        }

        public static DataGroupTypes[] values() {
            return (DataGroupTypes[]) $VALUES.clone();
        }
    }

    @i(generateAdapter = true)
    public static final class GovernmentIdNfcScanStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanStyles> CREATOR = new Creator();
        private final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.GovernmentIdNfcScanInputDateStyles inputDateStyle;
        private final AttributeStyles.GovernmentIdNfcScanInputTextStyles inputTextStyle;

        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanStyles> {
            @Override
            @NotNull
            public final GovernmentIdNfcScanStyles createFromParcel(@NotNull Parcel parcel) {
                return new GovernmentIdNfcScanStyles(parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.GovernmentIdNfcScanInputDateStyles.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScanStyles[] newArray(int i) {
                return new GovernmentIdNfcScanStyles[i];
            }
        }

        public GovernmentIdNfcScanStyles(AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles, AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles, AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles) {
            this.buttonPrimaryStyle = governmentIdNfcScanPrimaryButtonStyles;
            this.inputTextStyle = governmentIdNfcScanInputTextStyles;
            this.inputDateStyle = governmentIdNfcScanInputDateStyles;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final InputTextBasedComponentStyle getCardAccessNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputDate.InputDateComponentStyle getDateStyle() {
            AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null || (base = governmentIdNfcScanInputDateStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final InputTextBasedComponentStyle getDocumentNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final TextBasedComponentStyle getErrorLabelStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            InputTextBasedComponentStyle base2;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getErrorTextStyle();
        }

        public final AttributeStyles.GovernmentIdNfcScanInputDateStyles getInputDateStyle() {
            return this.inputDateStyle;
        }

        public final AttributeStyles.GovernmentIdNfcScanInputTextStyles getInputTextStyle() {
            return this.inputTextStyle;
        }

        public final ButtonSubmitComponentStyle getLaunchButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null || (base = governmentIdNfcScanPrimaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanPrimaryButtonStyles.writeToParcel(parcel, i);
            }
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputTextStyles.writeToParcel(parcel, i);
            }
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdNfcScanInputDateStyles.writeToParcel(parcel, i);
            }
        }
    }

    public GovernmentIdNfcScan(@NotNull String str, Attributes attributes, GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        this.name = str;
        this.attributes = attributes;
        this.styles = governmentIdNfcScanStyles;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public final GovernmentIdNfcScanStyles getStyles() {
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
        GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.styles;
        if (governmentIdNfcScanStyles == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            governmentIdNfcScanStyles.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }
}
