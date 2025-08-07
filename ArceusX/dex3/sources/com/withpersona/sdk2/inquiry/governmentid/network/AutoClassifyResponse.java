package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import b8.b;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "Landroid/os/Parcelable;", "p", "ClassificationFailedResponse", "a", "IdAcceptedResponse", "IdClassesForCountry", "IdRejectedResponse", "Unknown", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public interface AutoClassifyResponse extends Parcelable {

    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "idClassesByCountries", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class ClassificationFailedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<ClassificationFailedResponse> CREATOR = new a();

        @NotNull
        private final List<IdClassesForCountry> idClassesByCountries;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClassificationFailedResponse> {
            @Override
            @NotNull
            public final ClassificationFailedResponse createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IdClassesForCountry.CREATOR.createFromParcel(parcel));
                }
                return new ClassificationFailedResponse(arrayList);
            }

            @Override
            @NotNull
            public final ClassificationFailedResponse[] newArray(int i) {
                return new ClassificationFailedResponse[i];
            }
        }

        public ClassificationFailedResponse(@NotNull List<IdClassesForCountry> list) {
            Intrinsics.checkNotNullParameter(list, "idClassesByCountries");
            this.idClassesByCountries = list;
        }

        @NotNull
        public final List<IdClassesForCountry> a() {
            return this.idClassesByCountries;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<IdClassesForCountry> list = this.idClassesByCountries;
            parcel.writeInt(list.size());
            Iterator<IdClassesForCountry> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "countryCode", "idClass", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "idConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "b", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "c", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdAcceptedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<IdAcceptedResponse> CREATOR = new a();

        @NotNull
        private final String countryCode;

        @NotNull
        private final String idClass;

        @NotNull
        private final Id idConfig;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdAcceptedResponse> {
            @Override
            @NotNull
            public final IdAcceptedResponse createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdAcceptedResponse(parcel.readString(), parcel.readString(), (Id) parcel.readParcelable(IdAcceptedResponse.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final IdAcceptedResponse[] newArray(int i) {
                return new IdAcceptedResponse[i];
            }
        }

        public IdAcceptedResponse(@NotNull String str, @NotNull String str2, @NotNull Id id) {
            Intrinsics.checkNotNullParameter(str, "countryCode");
            Intrinsics.checkNotNullParameter(str2, "idClass");
            Intrinsics.checkNotNullParameter(id, "idConfig");
            this.countryCode = str;
            this.idClass = str2;
            this.idConfig = id;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final String getIdClass() {
            return this.idClass;
        }

        @NotNull
        public final Id getIdConfig() {
            return this.idConfig;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.countryCode);
            parcel.writeString(this.idClass);
            parcel.writeParcelable(this.idConfig, flags);
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Landroid/os/Parcelable;", "", "countryName", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "idConfigs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "a", "i", "Ljava/util/List;", "c", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdClassesForCountry implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdClassesForCountry> CREATOR = new a();

        @NotNull
        private final String countryName;

        @NotNull
        private final String countryCode;

        @NotNull
        private final List<Id> idConfigs;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdClassesForCountry> {
            @Override
            @NotNull
            public final IdClassesForCountry createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(IdClassesForCountry.class.getClassLoader()));
                }
                return new IdClassesForCountry(string, string2, arrayList);
            }

            @Override
            @NotNull
            public final IdClassesForCountry[] newArray(int i) {
                return new IdClassesForCountry[i];
            }
        }

        public IdClassesForCountry(@NotNull String str, @NotNull String str2, @NotNull List<Id> list) {
            Intrinsics.checkNotNullParameter(str, "countryName");
            Intrinsics.checkNotNullParameter(str2, "countryCode");
            Intrinsics.checkNotNullParameter(list, "idConfigs");
            this.countryName = str;
            this.countryCode = str2;
            this.idConfigs = list;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final String getCountryName() {
            return this.countryName;
        }

        @NotNull
        public final List<Id> c() {
            return this.idConfigs;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.countryName);
            parcel.writeString(this.countryCode);
            List<Id> list = this.idConfigs;
            parcel.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "idClassesByCountries", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class IdRejectedResponse implements AutoClassifyResponse {

        @NotNull
        public static final Parcelable.Creator<IdRejectedResponse> CREATOR = new a();

        @NotNull
        private final List<IdClassesForCountry> idClassesByCountries;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdRejectedResponse> {
            @Override
            @NotNull
            public final IdRejectedResponse createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IdClassesForCountry.CREATOR.createFromParcel(parcel));
                }
                return new IdRejectedResponse(arrayList);
            }

            @Override
            @NotNull
            public final IdRejectedResponse[] newArray(int i) {
                return new IdRejectedResponse[i];
            }
        }

        public IdRejectedResponse(@NotNull List<IdClassesForCountry> list) {
            Intrinsics.checkNotNullParameter(list, "idClassesByCountries");
            this.idClassesByCountries = list;
        }

        @NotNull
        public final List<IdClassesForCountry> a() {
            return this.idClassesByCountries;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            List<IdClassesForCountry> list = this.idClassesByCountries;
            parcel.writeInt(list.size());
            Iterator<IdClassesForCountry> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Unknown implements AutoClassifyResponse {

        @NotNull
        public static final Unknown d = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Unknown> {
            @Override
            @NotNull
            public final Unknown createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.d;
            }

            @Override
            @NotNull
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -402570646;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;", "", "<init>", "()V", "Lcom/squareup/moshi/h$e;", "a", "()Lcom/squareup/moshi/h$e;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        static final Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final h.e a() {
            b bVarE = b.b(AutoClassifyResponse.class, "responseType").c(Unknown.d).e(IdAcceptedResponse.class, "id_accepted").e(ClassificationFailedResponse.class, "classification_failed").e(IdRejectedResponse.class, "id_rejected");
            Intrinsics.checkNotNullExpressionValue(bVarE, "withSubtype(...)");
            return bVarE;
        }
    }
}
