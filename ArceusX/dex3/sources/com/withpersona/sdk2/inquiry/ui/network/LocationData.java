package com.withpersona.sdk2.inquiry.ui.network;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "", "", "id", "addressStreet1", "addressStreet2", "addressCity", "addressSubdivision", "addressPostalCode", "addressCountryCode", "addressBusinessName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "e", "c", "f", "d", "g", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class LocationData {

    @NotNull
    private final String id;

    @g(name = "address_street_1")
    private final String addressStreet1;

    @g(name = "address_street_2")
    private final String addressStreet2;

    @g(name = "address_city")
    private final String addressCity;

    @g(name = "address_subdivision")
    private final String addressSubdivision;

    @g(name = "address_postal_code")
    private final String addressPostalCode;

    @g(name = "address_country_code")
    private final String addressCountryCode;

    @g(name = "address_business_name")
    private final String addressBusinessName;

    public LocationData(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.id = str;
        this.addressStreet1 = str2;
        this.addressStreet2 = str3;
        this.addressCity = str4;
        this.addressSubdivision = str5;
        this.addressPostalCode = str6;
        this.addressCountryCode = str7;
        this.addressBusinessName = str8;
    }

    public final String getAddressBusinessName() {
        return this.addressBusinessName;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    public final String getAddressPostalCode() {
        return this.addressPostalCode;
    }

    public final String getAddressStreet1() {
        return this.addressStreet1;
    }

    public final String getAddressStreet2() {
        return this.addressStreet2;
    }

    public final String getAddressSubdivision() {
        return this.addressSubdivision;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public LocationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}
