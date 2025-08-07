package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzg;
import o3.C2678a;

public final class s implements Parcelable.Creator<zzg> {
    @Override
    public final zzg createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 2:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    strG5 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    zzfVar = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 7:
                    zzfVar2 = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzg(strG, strG2, strG3, strG4, strG5, zzfVar, zzfVar2);
    }

    @Override
    public final zzg[] newArray(int i7) {
        return new zzg[i7];
    }
}
