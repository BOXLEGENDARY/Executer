package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() {
        @Override
        public final Object createFromParcel(Parcel parcel) {
            try {
                return Transport.c(parcel.readString());
            } catch (Transport.a e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override
        public final Object[] newArray(int i7) {
            return new Transport[i7];
        }
    };

    private final String f14449d;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f14449d = str;
    }

    public static Transport c(String str) throws a {
        for (Transport transport : values()) {
            if (str.equals(transport.f14449d)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        throw new a(String.format("Transport %s not supported", str));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return this.f14449d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14449d);
    }
}
