package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import o3.C2678a;

public final class C1385m8 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String strG = null;
        String strG2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    zznVarArr = (zzn[]) C2678a.j(parcel, iT, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
                    break;
                case 5:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 6:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 7:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    zN = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzr(zznVarArr, zzfVar, zzfVar2, strG, fR, strG2, zN);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzr[i7];
    }
}
