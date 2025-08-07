package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010\u0014¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "Landroid/os/Parcelable;", "", "nfcScanPrompt", "authenticating", "reading", "cancelNfcScan", "nfcScanSuccess", "enablePassportNfcText", "enablePassportNfcConfirmButtonText", "enablePassportNfcCancelButtonText", "connectionLostText", "connectionLostConfirmButtonText", "authenticationErrorText", "authenticationErrorConfirmButtonText", "genericErrorText", "genericErrorConfirmButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getNfcScanPrompt", "e", "getAuthenticating", "i", "getReading", "v", "getCancelNfcScan", "w", "getNfcScanSuccess", "y", "getEnablePassportNfcText", "z", "getEnablePassportNfcConfirmButtonText", "A", "getEnablePassportNfcCancelButtonText", "B", "getConnectionLostText", "C", "getConnectionLostConfirmButtonText", "D", "getAuthenticationErrorText", "E", "getAuthenticationErrorConfirmButtonText", "F", "getGenericErrorText", "G", "getGenericErrorConfirmButtonText", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PassportNfcStrings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PassportNfcStrings> CREATOR = new a();

    @NotNull
    private final String enablePassportNfcCancelButtonText;

    @NotNull
    private final String connectionLostText;

    @NotNull
    private final String connectionLostConfirmButtonText;

    @NotNull
    private final String authenticationErrorText;

    @NotNull
    private final String authenticationErrorConfirmButtonText;

    @NotNull
    private final String genericErrorText;

    @NotNull
    private final String genericErrorConfirmButtonText;

    @NotNull
    private final String nfcScanPrompt;

    @NotNull
    private final String authenticating;

    @NotNull
    private final String reading;

    @NotNull
    private final String cancelNfcScan;

    @NotNull
    private final String nfcScanSuccess;

    @NotNull
    private final String enablePassportNfcText;

    @NotNull
    private final String enablePassportNfcConfirmButtonText;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportNfcStrings> {
        @Override
        @NotNull
        public final PassportNfcStrings createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PassportNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        @NotNull
        public final PassportNfcStrings[] newArray(int i) {
            return new PassportNfcStrings[i];
        }
    }

    public PassportNfcStrings(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "nfcScanPrompt");
        Intrinsics.checkNotNullParameter(str2, "authenticating");
        Intrinsics.checkNotNullParameter(str3, "reading");
        Intrinsics.checkNotNullParameter(str4, "cancelNfcScan");
        Intrinsics.checkNotNullParameter(str5, "nfcScanSuccess");
        Intrinsics.checkNotNullParameter(str6, "enablePassportNfcText");
        Intrinsics.checkNotNullParameter(str7, "enablePassportNfcConfirmButtonText");
        Intrinsics.checkNotNullParameter(str8, "enablePassportNfcCancelButtonText");
        Intrinsics.checkNotNullParameter(str9, "connectionLostText");
        Intrinsics.checkNotNullParameter(str10, "connectionLostConfirmButtonText");
        Intrinsics.checkNotNullParameter(str11, "authenticationErrorText");
        Intrinsics.checkNotNullParameter(str12, "authenticationErrorConfirmButtonText");
        Intrinsics.checkNotNullParameter(str13, "genericErrorText");
        Intrinsics.checkNotNullParameter(str14, "genericErrorConfirmButtonText");
        this.nfcScanPrompt = str;
        this.authenticating = str2;
        this.reading = str3;
        this.cancelNfcScan = str4;
        this.nfcScanSuccess = str5;
        this.enablePassportNfcText = str6;
        this.enablePassportNfcConfirmButtonText = str7;
        this.enablePassportNfcCancelButtonText = str8;
        this.connectionLostText = str9;
        this.connectionLostConfirmButtonText = str10;
        this.authenticationErrorText = str11;
        this.authenticationErrorConfirmButtonText = str12;
        this.genericErrorText = str13;
        this.genericErrorConfirmButtonText = str14;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcStrings)) {
            return false;
        }
        PassportNfcStrings passportNfcStrings = (PassportNfcStrings) other;
        return Intrinsics.b(this.nfcScanPrompt, passportNfcStrings.nfcScanPrompt) && Intrinsics.b(this.authenticating, passportNfcStrings.authenticating) && Intrinsics.b(this.reading, passportNfcStrings.reading) && Intrinsics.b(this.cancelNfcScan, passportNfcStrings.cancelNfcScan) && Intrinsics.b(this.nfcScanSuccess, passportNfcStrings.nfcScanSuccess) && Intrinsics.b(this.enablePassportNfcText, passportNfcStrings.enablePassportNfcText) && Intrinsics.b(this.enablePassportNfcConfirmButtonText, passportNfcStrings.enablePassportNfcConfirmButtonText) && Intrinsics.b(this.enablePassportNfcCancelButtonText, passportNfcStrings.enablePassportNfcCancelButtonText) && Intrinsics.b(this.connectionLostText, passportNfcStrings.connectionLostText) && Intrinsics.b(this.connectionLostConfirmButtonText, passportNfcStrings.connectionLostConfirmButtonText) && Intrinsics.b(this.authenticationErrorText, passportNfcStrings.authenticationErrorText) && Intrinsics.b(this.authenticationErrorConfirmButtonText, passportNfcStrings.authenticationErrorConfirmButtonText) && Intrinsics.b(this.genericErrorText, passportNfcStrings.genericErrorText) && Intrinsics.b(this.genericErrorConfirmButtonText, passportNfcStrings.genericErrorConfirmButtonText);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.nfcScanPrompt.hashCode() * 31) + this.authenticating.hashCode()) * 31) + this.reading.hashCode()) * 31) + this.cancelNfcScan.hashCode()) * 31) + this.nfcScanSuccess.hashCode()) * 31) + this.enablePassportNfcText.hashCode()) * 31) + this.enablePassportNfcConfirmButtonText.hashCode()) * 31) + this.enablePassportNfcCancelButtonText.hashCode()) * 31) + this.connectionLostText.hashCode()) * 31) + this.connectionLostConfirmButtonText.hashCode()) * 31) + this.authenticationErrorText.hashCode()) * 31) + this.authenticationErrorConfirmButtonText.hashCode()) * 31) + this.genericErrorText.hashCode()) * 31) + this.genericErrorConfirmButtonText.hashCode();
    }

    @NotNull
    public String toString() {
        return "PassportNfcStrings(nfcScanPrompt=" + this.nfcScanPrompt + ", authenticating=" + this.authenticating + ", reading=" + this.reading + ", cancelNfcScan=" + this.cancelNfcScan + ", nfcScanSuccess=" + this.nfcScanSuccess + ", enablePassportNfcText=" + this.enablePassportNfcText + ", enablePassportNfcConfirmButtonText=" + this.enablePassportNfcConfirmButtonText + ", enablePassportNfcCancelButtonText=" + this.enablePassportNfcCancelButtonText + ", connectionLostText=" + this.connectionLostText + ", connectionLostConfirmButtonText=" + this.connectionLostConfirmButtonText + ", authenticationErrorText=" + this.authenticationErrorText + ", authenticationErrorConfirmButtonText=" + this.authenticationErrorConfirmButtonText + ", genericErrorText=" + this.genericErrorText + ", genericErrorConfirmButtonText=" + this.genericErrorConfirmButtonText + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.nfcScanPrompt);
        parcel.writeString(this.authenticating);
        parcel.writeString(this.reading);
        parcel.writeString(this.cancelNfcScan);
        parcel.writeString(this.nfcScanSuccess);
        parcel.writeString(this.enablePassportNfcText);
        parcel.writeString(this.enablePassportNfcConfirmButtonText);
        parcel.writeString(this.enablePassportNfcCancelButtonText);
        parcel.writeString(this.connectionLostText);
        parcel.writeString(this.connectionLostConfirmButtonText);
        parcel.writeString(this.authenticationErrorText);
        parcel.writeString(this.authenticationErrorConfirmButtonText);
        parcel.writeString(this.genericErrorText);
        parcel.writeString(this.genericErrorConfirmButtonText);
    }
}
