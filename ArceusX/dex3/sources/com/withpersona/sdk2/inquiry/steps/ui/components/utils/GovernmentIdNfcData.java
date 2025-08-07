package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "LP8/a;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;LP8/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "e", "c", "i", "v", "LP8/a;", "a", "()LP8/a;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdNfcData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcData> CREATOR = new a();

    @NotNull
    private final Uri dg1Uri;

    @NotNull
    private final Uri dg2Uri;

    @NotNull
    private final Uri sodUri;

    @NotNull
    private final P8.a chipAuthenticationStatus;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdNfcData> {
        @Override
        @NotNull
        public final GovernmentIdNfcData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcData((Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), P8.a.valueOf(parcel.readString()));
        }

        @Override
        @NotNull
        public final GovernmentIdNfcData[] newArray(int i) {
            return new GovernmentIdNfcData[i];
        }
    }

    public GovernmentIdNfcData(@NotNull Uri uri, @NotNull Uri uri2, @NotNull Uri uri3, @NotNull P8.a aVar) {
        Intrinsics.checkNotNullParameter(uri, "dg1Uri");
        Intrinsics.checkNotNullParameter(uri2, "dg2Uri");
        Intrinsics.checkNotNullParameter(uri3, "sodUri");
        Intrinsics.checkNotNullParameter(aVar, "chipAuthenticationStatus");
        this.dg1Uri = uri;
        this.dg2Uri = uri2;
        this.sodUri = uri3;
        this.chipAuthenticationStatus = aVar;
    }

    @NotNull
    public final P8.a getChipAuthenticationStatus() {
        return this.chipAuthenticationStatus;
    }

    @NotNull
    public final Uri getDg1Uri() {
        return this.dg1Uri;
    }

    @NotNull
    public final Uri getDg2Uri() {
        return this.dg2Uri;
    }

    @NotNull
    public final Uri getSodUri() {
        return this.sodUri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcData)) {
            return false;
        }
        GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) other;
        return Intrinsics.b(this.dg1Uri, governmentIdNfcData.dg1Uri) && Intrinsics.b(this.dg2Uri, governmentIdNfcData.dg2Uri) && Intrinsics.b(this.sodUri, governmentIdNfcData.sodUri) && this.chipAuthenticationStatus == governmentIdNfcData.chipAuthenticationStatus;
    }

    public int hashCode() {
        return (((((this.dg1Uri.hashCode() * 31) + this.dg2Uri.hashCode()) * 31) + this.sodUri.hashCode()) * 31) + this.chipAuthenticationStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.dg1Uri + ", dg2Uri=" + this.dg2Uri + ", sodUri=" + this.sodUri + ", chipAuthenticationStatus=" + this.chipAuthenticationStatus + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.dg1Uri, flags);
        parcel.writeParcelable(this.dg2Uri, flags);
        parcel.writeParcelable(this.sodUri, flags);
        parcel.writeString(this.chipAuthenticationStatus.name());
    }
}
