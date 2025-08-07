package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class UiComponentError implements Parcelable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion extends h<UiComponentError> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(m mVar) {
            m mVarI0 = mVar.I0();
            mVarI0.e();
            while (mVarI0.u()) {
                if (Intrinsics.b(mVarI0.Z(), "type")) {
                    return mVarI0.n0();
                }
                mVarI0.f1();
            }
            return null;
        }

        private Companion() {
        }

        @f
        public UiComponentError m200fromJson(@NotNull m mVar) {
            w wVarD = new w.b().d();
            String jsonType = getJsonType(mVar);
            if (jsonType == null) {
                return null;
            }
            int iHashCode = jsonType.hashCode();
            if (iHashCode != -816959144) {
                if (iHashCode != -212588636) {
                    if (iHashCode == 1658531967 && jsonType.equals(InputAddress.type)) {
                        return (UiComponentError) wVarD.c(UiInputAddressComponentError.class).fromJson(mVar);
                    }
                } else if (jsonType.equals(InputInternationalDb.type)) {
                    return (UiComponentError) wVarD.c(UiInputInternationalDbComponentError.class).fromJson(mVar);
                }
            } else if (jsonType.equals("gov_id_nfc")) {
                return (UiComponentError) wVarD.c(UiGovernmentIdNfcScanComponentError.class).fromJson(mVar);
            }
            return (UiComponentError) wVarD.c(UiInputComponentError.class).fromJson(mVar);
        }

        @z
        public void toJson(@NotNull t tVar, UiComponentError uiComponentError) {
            w wVarD = new w.b().d();
            if (uiComponentError instanceof UiGovernmentIdNfcScanComponentError) {
                wVarD.c(UiGovernmentIdNfcScanComponentError.class).toJson(tVar, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputAddressComponentError) {
                wVarD.c(UiInputAddressComponentError.class).toJson(tVar, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputComponentError) {
                wVarD.c(UiInputComponentError.class).toJson(tVar, uiComponentError);
            } else if (uiComponentError instanceof UiInputInternationalDbComponentError) {
                wVarD.c(UiInputInternationalDbComponentError.class).toJson(tVar, uiComponentError);
            } else if (uiComponentError == null) {
                tVar.h0();
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputAddressComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            @Override
            @NotNull
            public final UiInputAddressComponentError createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(string, string2, linkedHashMap);
            }

            @Override
            @NotNull
            public final UiInputAddressComponentError[] newArray(int i) {
                return new UiInputAddressComponentError[i];
            }
        }

        public UiInputAddressComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        public static UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputAddressComponentError.type;
            }
            if ((i & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiInputAddressComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiInputAddressComponentError(str, str2, map);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) obj;
            return Intrinsics.b(this.name, uiInputAddressComponentError.name) && Intrinsics.b(this.type, uiInputAddressComponentError.type) && Intrinsics.b(this.message, uiInputAddressComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiInputAddressComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();

        @NotNull
        private final String message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            @Override
            @NotNull
            public final UiInputComponentError createFromParcel(@NotNull Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final UiInputComponentError[] newArray(int i) {
                return new UiInputComponentError[i];
            }
        }

        public UiInputComponentError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = str3;
        }

        public static UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputComponentError.type;
            }
            if ((i & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final String component3() {
            return this.message;
        }

        @NotNull
        public final UiInputComponentError copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            return new UiInputComponentError(str, str2, str3);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) obj;
            return Intrinsics.b(this.name, uiInputComponentError.name) && Intrinsics.b(this.type, uiInputComponentError.type) && Intrinsics.b(this.message, uiInputComponentError.message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiInputComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            @Override
            @NotNull
            public final UiInputInternationalDbComponentError createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(string, string2, linkedHashMap);
            }

            @Override
            @NotNull
            public final UiInputInternationalDbComponentError[] newArray(int i) {
                return new UiInputInternationalDbComponentError[i];
            }
        }

        public UiInputInternationalDbComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        public static UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.type;
            }
            if ((i & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiInputInternationalDbComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiInputInternationalDbComponentError(str, str2, map);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) obj;
            return Intrinsics.b(this.name, uiInputInternationalDbComponentError.name) && Intrinsics.b(this.type, uiInputInternationalDbComponentError.type) && Intrinsics.b(this.message, uiInputInternationalDbComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiInputInternationalDbComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String getType();

    @i(generateAdapter = true)
    public static final class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();

        @NotNull
        private Map<String, String> message;

        @NotNull
        private final String name;

        @NotNull
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            @Override
            @NotNull
            public final UiGovernmentIdNfcScanComponentError createFromParcel(@NotNull Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(string, string2, linkedHashMap);
            }

            @Override
            @NotNull
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i) {
                return new UiGovernmentIdNfcScanComponentError[i];
            }
        }

        public UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "gov_id_nfc" : str2, map);
        }

        public static UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.type;
            }
            if ((i & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.message;
        }

        @NotNull
        public final UiGovernmentIdNfcScanComponentError copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            return new UiGovernmentIdNfcScanComponentError(str, str2, map);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) obj;
            return Intrinsics.b(this.name, uiGovernmentIdNfcScanComponentError.name) && Intrinsics.b(this.type, uiGovernmentIdNfcScanComponentError.type) && Intrinsics.b(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        @NotNull
        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override
        @NotNull
        public String getName() {
            return this.name;
        }

        @Override
        @NotNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(@NotNull Map<String, String> map) {
            this.message = map;
        }

        @NotNull
        public String toString() {
            return "UiGovernmentIdNfcScanComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public UiGovernmentIdNfcScanComponentError(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }
    }

    private UiComponentError() {
    }
}
