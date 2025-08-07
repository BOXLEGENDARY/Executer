package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.Locale;

public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    f14513v(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<ErrorCode> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return ErrorCode.f(parcel.readInt());
            } catch (ErrorCode.a e7) {
                throw new IllegalArgumentException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new ErrorCode[i7];
        }
    };

    private final int f14517d;

    public static class a extends Exception {
        public a(int i7) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i7)));
        }
    }

    ErrorCode(int i7) {
        this.f14517d = i7;
    }

    public static ErrorCode f(int i7) throws a {
        for (ErrorCode errorCode : values()) {
            if (i7 == errorCode.f14517d) {
                return errorCode;
            }
        }
        throw new a(i7);
    }

    public int c() {
        return this.f14517d;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f14517d);
    }
}
