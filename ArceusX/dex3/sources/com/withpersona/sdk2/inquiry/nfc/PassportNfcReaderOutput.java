package com.withpersona.sdk2.inquiry.nfc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Landroid/os/Parcelable;", "<init>", "()V", "Cancel", "Error", "a", "Success", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class PassportNfcReaderOutput implements Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Cancel extends PassportNfcReaderOutput {

        @NotNull
        public static final Cancel d = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override
            @NotNull
            public final Cancel createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.d;
            }

            @Override
            @NotNull
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
            super(null);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Cancel);
        }

        public int hashCode() {
            return -869674698;
        }

        @NotNull
        public String toString() {
            return "Cancel";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getDebugMessage", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "getCause", "()Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Error extends PassportNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        private final String debugMessage;

        @NotNull
        private final a cause;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override
            @NotNull
            public final Error createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String str, @NotNull a aVar) {
            super(null);
            Intrinsics.checkNotNullParameter(aVar, "cause");
            this.debugMessage = str;
            this.cause = aVar;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.debugMessage);
            parcel.writeString(this.cause.name());
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "LP8/a;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;LP8/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "e", "c", "i", "v", "LP8/a;", "a", "()LP8/a;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Success extends PassportNfcReaderOutput {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        @NotNull
        private final Uri dg1Uri;

        @NotNull
        private final Uri dg2Uri;

        @NotNull
        private final Uri sodUri;

        @NotNull
        private final P8.a chipAuthenticationStatus;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override
            @NotNull
            public final Success createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((Uri) parcel.readParcelable(Success.class.getClassLoader()), (Uri) parcel.readParcelable(Success.class.getClassLoader()), (Uri) parcel.readParcelable(Success.class.getClassLoader()), P8.a.valueOf(parcel.readString()));
            }

            @Override
            @NotNull
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(@NotNull Uri uri, @NotNull Uri uri2, @NotNull Uri uri3, @NotNull P8.a aVar) {
            super(null);
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

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable(this.dg1Uri, flags);
            parcel.writeParcelable(this.dg2Uri, flags);
            parcel.writeParcelable(this.sodUri, flags);
            parcel.writeString(this.chipAuthenticationStatus.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {
        public static final a d = new a("AuthenticationError", 0);
        public static final a e = new a("Unknown", 1);
        private static final a[] i;
        private static final T9.a v;

        static {
            a[] aVarArrC = c();
            i = aVarArrC;
            v = T9.b.a(aVarArrC);
        }

        private a(String str, int i2) {
        }

        private static final a[] c() {
            return new a[]{d, e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    public PassportNfcReaderOutput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PassportNfcReaderOutput() {
    }
}
