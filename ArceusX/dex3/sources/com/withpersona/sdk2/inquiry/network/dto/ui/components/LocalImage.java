package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
public final class LocalImage implements UiComponentConfig {

    @NotNull
    public static final String type = "image_local";
    private final Attributes attributes;

    @NotNull
    private final String name;
    private final LocalImageComponentStyle styles;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LocalImage> CREATOR = new Creator();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final h createAdapter$lambda$0(Type type, Set set, w wVar) {
            if (Intrinsics.b(type, Image.class)) {
                return b8.a.a(Image.class).d((Enum) null).nullSafe();
            }
            return null;
        }

        @NotNull
        public final h.e createAdapter() {
            return new h.e() {
                public final h create(Type type, Set set, w wVar) {
                    return LocalImage.Companion.createAdapter$lambda$0(type, set, wVar);
                }
            };
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<LocalImage> {
        @Override
        @NotNull
        public final LocalImage createFromParcel(@NotNull Parcel parcel) {
            return new LocalImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        @NotNull
        public final LocalImage[] newArray(int i) {
            return new LocalImage[i];
        }
    }

    @i(generateAdapter = false)
    public static final class Image {
        private static final T9.a $ENTRIES;
        private static final Image[] $VALUES;

        @g(name = "start_hero")
        public static final Image START_HERO = new Image("START_HERO", 0);

        @g(name = "document_start_hero")
        public static final Image DOCUMENT_START_HERO = new Image("DOCUMENT_START_HERO", 1);

        @g(name = "animated_check")
        public static final Image ANIMATED_CHECK = new Image("ANIMATED_CHECK", 2);

        @g(name = "failed_icon")
        public static final Image FAILED = new Image("FAILED", 3);

        @g(name = "id_front_icon")
        public static final Image ID_FRONT_FAILED = new Image("ID_FRONT_FAILED", 4);

        @g(name = "id_back_icon")
        public static final Image ID_BACK_FAILED = new Image("ID_BACK_FAILED", 5);

        @g(name = "failure_selfie_icon")
        public static final Image SELFIE_FAILED = new Image("SELFIE_FAILED", 6);

        @g(name = "failure_document_icon")
        public static final Image DOCUMENT_FAILED = new Image("DOCUMENT_FAILED", 7);

        @g(name = "passport_nfc_start_hero")
        public static final Image PASSPORT_NFC_START_HERO = new Image("PASSPORT_NFC_START_HERO", 8);

        @g(name = "passport_nfc_scan_hero")
        public static final Image PASSPORT_NFC_SCAN_HERO = new Image("PASSPORT_NFC_SCAN_HERO", 9);

        @g(name = "passport_nfc_scan_ready_hero")
        public static final Image PASSPORT_NFC_SCAN_READY_HERO = new Image("PASSPORT_NFC_SCAN_READY_HERO", 10);

        @g(name = "passport_nfc_check")
        public static final Image PASSPORT_NFC_CHECK = new Image("PASSPORT_NFC_CHECK", 11);

        @g(name = "government_id_nfc_scan_front_closed")
        public static final Image GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED = new Image("GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED", 12);

        @g(name = "government_id_nfc_scan_back_closed")
        public static final Image GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED = new Image("GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED", 13);

        @g(name = "government_id_nfc_scan_photo_page")
        public static final Image GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE = new Image("GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE", 14);

        @g(name = "government_id_nfc_scan_id_card")
        public static final Image GOVERNMENT_ID_NFC_SCAN_ID_CARD = new Image("GOVERNMENT_ID_NFC_SCAN_ID_CARD", 15);

        @g(name = "government_id_nfc_scan_back_then_front")
        public static final Image GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT = new Image("GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT", 16);

        @g(name = "create_persona_cta_card_icon")
        public static final Image CREATE_PERSONA_CTA_CARD_ICON = new Image("CREATE_PERSONA_CTA_CARD_ICON", 17);

        @g(name = "option_check_icon")
        public static final Image OPTION_CHECK_ICON = new Image("OPTION_CHECK_ICON", 18);

        @g(name = "option_flag_icon")
        public static final Image OPTION_FLAG_ICON = new Image("OPTION_FLAG_ICON", 19);

        @g(name = "option_globe_icon")
        public static final Image OPTION_GLOBE_ICON = new Image("OPTION_GLOBE_ICON", 20);

        @g(name = "option_home_icon")
        public static final Image OPTION_HOME_ICON = new Image("OPTION_HOME_ICON", 21);

        @g(name = "option_id_document_icon")
        public static final Image OPTION_ID_DOCUMENT_ICON = new Image("OPTION_ID_DOCUMENT_ICON", 22);

        @g(name = "option_id_icon")
        public static final Image OPTION_ID_ICON = new Image("OPTION_ID_ICON", 23);

        @g(name = "option_phone_icon")
        public static final Image OPTION_PHONE_ICON = new Image("OPTION_PHONE_ICON", 24);

        @g(name = "option_user_icon")
        public static final Image OPTION_USER_ICON = new Image("OPTION_USER_ICON", 25);

        private static final Image[] $values() {
            return new Image[]{START_HERO, DOCUMENT_START_HERO, ANIMATED_CHECK, FAILED, ID_FRONT_FAILED, ID_BACK_FAILED, SELFIE_FAILED, DOCUMENT_FAILED, PASSPORT_NFC_START_HERO, PASSPORT_NFC_SCAN_HERO, PASSPORT_NFC_SCAN_READY_HERO, PASSPORT_NFC_CHECK, GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED, GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED, GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE, GOVERNMENT_ID_NFC_SCAN_ID_CARD, GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT, CREATE_PERSONA_CTA_CARD_ICON, OPTION_CHECK_ICON, OPTION_FLAG_ICON, OPTION_GLOBE_ICON, OPTION_HOME_ICON, OPTION_ID_DOCUMENT_ICON, OPTION_ID_ICON, OPTION_PHONE_ICON, OPTION_USER_ICON};
        }

        static {
            Image[] imageArr$values = $values();
            $VALUES = imageArr$values;
            $ENTRIES = b.a(imageArr$values);
        }

        private Image(String str, int i) {
        }

        @NotNull
        public static T9.a<Image> getEntries() {
            return $ENTRIES;
        }

        public static Image valueOf(String str) {
            return (Image) Enum.valueOf(Image.class, str);
        }

        public static Image[] values() {
            return (Image[]) $VALUES.clone();
        }
    }

    public LocalImage(@NotNull String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle) {
        this.name = str;
        this.attributes = attributes;
        this.styles = localImageComponentStyle;
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

    public final LocalImageComponentStyle getStyles() {
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
        LocalImageComponentStyle localImageComponentStyle = this.styles;
        if (localImageComponentStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localImageComponentStyle.writeToParcel(parcel, i);
        }
    }

    @Override
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean hidden;
        private final Image imageKey;

        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override
            @NotNull
            public final Attributes createFromParcel(@NotNull Parcel parcel) {
                return new Attributes(parcel.readInt() == 0 ? null : Image.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            @NotNull
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public Attributes(Image image, JsonLogicBoolean jsonLogicBoolean) {
            this.imageKey = image;
            this.hidden = jsonLogicBoolean;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final Image getImageKey() {
            return this.imageKey;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Image image = this.imageKey;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(image.name());
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                jsonLogicBoolean.writeToParcel(parcel, i);
            }
        }

        public Attributes(Image image, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, (i & 2) != 0 ? null : jsonLogicBoolean);
        }
    }

    public LocalImage(String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : localImageComponentStyle);
    }
}
