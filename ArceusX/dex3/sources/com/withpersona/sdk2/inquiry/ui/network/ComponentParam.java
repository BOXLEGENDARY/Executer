package com.withpersona.sdk2.inquiry.ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Landroid/os/Parcelable;", "()V", "Adapter", "Address", "ComponentBoolean", "ComponentNumber", "ComponentString", "ComponentStringList", "ESignature", "GovernmentIdNfcScan", "InternationalDbParams", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class ComponentParam implements Parcelable {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "<init>", "()V", "Lcom/squareup/moshi/m;", "reader", "fromJson", "(Lcom/squareup/moshi/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lcom/squareup/moshi/t;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Adapter extends h<ComponentParam> {

        @NotNull
        public static final Adapter a = new Adapter();

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class a {
            public static final int[] a;

            static {
                int[] iArr = new int[P8.a.values().length];
                try {
                    iArr[P8.a.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[P8.a.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[P8.a.i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[P8.a.v.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        private Adapter() {
        }

        @f
        public ComponentParam m607fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return null;
        }

        @z
        public void toJson(@NotNull t writer, ComponentParam value) throws P9.m {
            String str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value instanceof ComponentString) {
                writer.b1(((ComponentString) value).getValue());
                return;
            }
            if (value instanceof ComponentStringList) {
                writer.b();
                Iterator<String> it = ((ComponentStringList) value).a().iterator();
                while (it.hasNext()) {
                    writer.b1(it.next());
                }
                writer.m();
                return;
            }
            if (value instanceof Address) {
                writer.f();
                Address address = (Address) value;
                String street1 = address.getStreet1();
                if (street1 != null) {
                    writer.Z("street_1");
                    writer.b1(street1);
                }
                String street2 = address.getStreet2();
                if (street2 != null) {
                    writer.Z("street_2");
                    writer.b1(street2);
                }
                String city = address.getCity();
                if (city != null) {
                    writer.Z("city");
                    writer.b1(city);
                }
                String subdivision = address.getSubdivision();
                if (subdivision != null) {
                    writer.Z("subdivision");
                    writer.b1(subdivision);
                }
                String postalCode = address.getPostalCode();
                if (postalCode != null) {
                    writer.Z("postal_code");
                    writer.b1(postalCode);
                }
                writer.y();
                return;
            }
            if (value instanceof ComponentBoolean) {
                writer.f1(((ComponentBoolean) value).getValue());
                return;
            }
            if (value instanceof ComponentNumber) {
                writer.b1(new BigDecimal(((ComponentNumber) value).getValue().doubleValue()).toPlainString());
                return;
            }
            if (value instanceof ESignature) {
                writer.b1(((ESignature) value).getSignatureImageString());
                return;
            }
            if (!(value instanceof GovernmentIdNfcScan)) {
                if (value instanceof InternationalDbParams) {
                    writer.f();
                    InternationalDbParams internationalDbParams = (InternationalDbParams) value;
                    String country = internationalDbParams.getCountry();
                    if (country != null) {
                        writer.Z("idb_country");
                        writer.b1(country);
                    }
                    String type = internationalDbParams.getType();
                    if (type != null) {
                        writer.Z("idb_type");
                        writer.b1(type);
                    }
                    String value2 = internationalDbParams.getValue();
                    if (value2 != null) {
                        writer.Z("idb_value");
                        writer.b1(value2);
                    }
                    writer.y();
                    return;
                }
                return;
            }
            writer.f();
            GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) value;
            P8.a chipAuthenticationStatus = governmentIdNfcScan.getChipAuthenticationStatus();
            if (chipAuthenticationStatus != null) {
                writer.Z("caFlag");
                int i = a.a[chipAuthenticationStatus.ordinal()];
                if (i == 1) {
                    str = "notRequested";
                } else if (i == 2) {
                    str = "notSupported";
                } else if (i == 3) {
                    str = "failed";
                } else {
                    if (i != 4) {
                        throw new P9.m();
                    }
                    str = "success";
                }
                writer.b1(str);
            }
            String dg1 = governmentIdNfcScan.getDg1();
            if (dg1 != null) {
                writer.Z("dg1");
                writer.b1(dg1);
            }
            String dg2 = governmentIdNfcScan.getDg2();
            if (dg2 != null) {
                writer.Z("dg2");
                writer.b1(dg2);
            }
            String sod = governmentIdNfcScan.getSod();
            if (sod != null) {
                writer.Z("sod");
                writer.b1(sod);
            }
            writer.y();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "street1", "street2", "city", "subdivision", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "i", "a", "v", "f", "w", "b", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Address extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        private final String street1;

        private final String street2;

        private final String city;

        private final String subdivision;

        private final String postalCode;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Address> {
            @Override
            @NotNull
            public final Address createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.postalCode = str5;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getStreet1() {
            return this.street1;
        }

        public final String getStreet2() {
            return this.street2;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final String getSubdivision() {
            return this.subdivision;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.street1);
            parcel.writeString(this.street2);
            parcel.writeString(this.city);
            parcel.writeString(this.subdivision);
            parcel.writeString(this.postalCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Z", "a", "()Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ComponentBoolean extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentBoolean> CREATOR = new a();

        private final boolean value;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComponentBoolean> {
            @Override
            @NotNull
            public final ComponentBoolean createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentBoolean(parcel.readInt() != 0);
            }

            @Override
            @NotNull
            public final ComponentBoolean[] newArray(int i) {
                return new ComponentBoolean[i];
            }
        }

        public ComponentBoolean(boolean z) {
            super(null);
            this.value = z;
        }

        public final boolean getValue() {
            return this.value;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.value ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/Number;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/Number;", "a", "()Ljava/lang/Number;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ComponentNumber extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentNumber> CREATOR = new a();

        @NotNull
        private final Number value;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComponentNumber> {
            @Override
            @NotNull
            public final ComponentNumber createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentNumber((Number) parcel.readSerializable());
            }

            @Override
            @NotNull
            public final ComponentNumber[] newArray(int i) {
                return new ComponentNumber[i];
            }
        }

        public ComponentNumber(@NotNull Number number) {
            super(null);
            Intrinsics.checkNotNullParameter(number, "value");
            this.value = number;
        }

        @NotNull
        public final Number getValue() {
            return this.value;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeSerializable(this.value);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ComponentString extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentString> CREATOR = new a();

        @NotNull
        private final String value;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComponentString> {
            @Override
            @NotNull
            public final ComponentString createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentString(parcel.readString());
            }

            @Override
            @NotNull
            public final ComponentString[] newArray(int i) {
                return new ComponentString[i];
            }
        }

        public ComponentString(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.value);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "", "value", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ComponentStringList extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ComponentStringList> CREATOR = new a();

        @NotNull
        private final List<String> value;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ComponentStringList> {
            @Override
            @NotNull
            public final ComponentStringList createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ComponentStringList(parcel.createStringArrayList());
            }

            @Override
            @NotNull
            public final ComponentStringList[] newArray(int i) {
                return new ComponentStringList[i];
            }
        }

        public ComponentStringList(@NotNull List<String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "value");
            this.value = list;
        }

        @NotNull
        public final List<String> a() {
            return this.value;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeStringList(this.value);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "signatureImageString", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ESignature extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<ESignature> CREATOR = new a();

        private final String signatureImageString;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ESignature> {
            @Override
            @NotNull
            public final ESignature createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ESignature(parcel.readString());
            }

            @Override
            @NotNull
            public final ESignature[] newArray(int i) {
                return new ESignature[i];
            }
        }

        public ESignature(String str) {
            super(null);
            this.signatureImageString = str;
        }

        public final String getSignatureImageString() {
            return this.signatureImageString;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.signatureImageString);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "dg1", "dg2", "sod", "LP8/a;", "chipAuthenticationStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP8/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "c", "i", "v", "LP8/a;", "a", "()LP8/a;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class GovernmentIdNfcScan extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new a();

        private final String dg1;

        private final String dg2;

        private final String sod;

        private final P8.a chipAuthenticationStatus;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdNfcScan> {
            @Override
            @NotNull
            public final GovernmentIdNfcScan createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdNfcScan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : P8.a.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final GovernmentIdNfcScan[] newArray(int i) {
                return new GovernmentIdNfcScan[i];
            }
        }

        public GovernmentIdNfcScan(String str, String str2, String str3, P8.a aVar) {
            super(null);
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = aVar;
        }

        public final P8.a getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        public final String getDg1() {
            return this.dg1;
        }

        public final String getDg2() {
            return this.dg2;
        }

        public final String getSod() {
            return this.sod;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.dg1);
            parcel.writeString(this.dg2);
            parcel.writeString(this.sod);
            P8.a aVar = this.chipAuthenticationStatus;
            if (aVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(aVar.name());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "country", "type", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "b", "i", "c", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class InternationalDbParams extends ComponentParam {

        @NotNull
        public static final Parcelable.Creator<InternationalDbParams> CREATOR = new a();

        private final String country;

        private final String type;

        private final String value;

        @kotlin.Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InternationalDbParams> {
            @Override
            @NotNull
            public final InternationalDbParams createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternationalDbParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override
            @NotNull
            public final InternationalDbParams[] newArray(int i) {
                return new InternationalDbParams[i];
            }
        }

        public InternationalDbParams(String str, String str2, String str3) {
            super(null);
            this.country = str;
            this.type = str2;
            this.value = str3;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.country);
            parcel.writeString(this.type);
            parcel.writeString(this.value);
        }
    }

    public ComponentParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComponentParam() {
    }
}
