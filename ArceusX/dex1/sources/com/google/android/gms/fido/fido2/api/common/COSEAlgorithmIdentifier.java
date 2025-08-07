package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import n3.C2649g;
import n3.C2651i;

public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new s();

    private final com.google.android.gms.fido.fido2.api.common.a f14503d;

    public static class a extends Exception {
        public a(int i7) {
            super("Algorithm with COSE value " + i7 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.f14503d = (com.google.android.gms.fido.fido2.api.common.a) C2651i.l(aVar);
    }

    public static COSEAlgorithmIdentifier a(int i7) throws a {
        C3.b bVar;
        if (i7 == C3.b.LEGACY_RS1.c()) {
            bVar = C3.b.RS1;
        } else {
            C3.b[] bVarArrValues = C3.b.values();
            int length = bVarArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    for (C3.b bVar2 : C3.a.values()) {
                        if (bVar2.c() == i7) {
                            bVar = bVar2;
                        }
                    }
                    throw new a(i7);
                }
                C3.b bVar3 = bVarArrValues[i8];
                if (bVar3.c() == i7) {
                    bVar = bVar3;
                    break;
                }
                i8++;
            }
        }
        return new COSEAlgorithmIdentifier(bVar);
    }

    public int b() {
        return this.f14503d.c();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f14503d.c() == ((COSEAlgorithmIdentifier) obj).f14503d.c();
    }

    public int hashCode() {
        return C2649g.c(this.f14503d);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f14503d.c());
    }
}
