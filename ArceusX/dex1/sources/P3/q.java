package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import o3.C2678a;

public final class q implements Parcelable.Creator<zzs> {
    @Override
    public final zzs createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzs(iV);
    }

    @Override
    public final zzs[] newArray(int i7) {
        return new zzs[i7];
    }
}
