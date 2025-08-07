package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import o3.C2678a;

public final class C1349j5 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        boolean zN = false;
        int iV2 = 0;
        int iV3 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String strG = null;
        String strG2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    zzrVarArr = (zzr[]) C2678a.j(parcel, iT, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 6:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 7:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 8:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 9:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 10:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 11:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 12:
                    iV3 = C2678a.v(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strG, fR, strG2, iV, zN, iV2, iV3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzl[i7];
    }
}
