package R3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import o3.C2678a;

public final class C1054e2 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        float fR8 = Float.MAX_VALUE;
        float fR9 = Float.MAX_VALUE;
        float fR10 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float fR11 = -1.0f;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 3:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 4:
                    fR2 = C2678a.r(parcel, iT);
                    break;
                case 5:
                    fR3 = C2678a.r(parcel, iT);
                    break;
                case 6:
                    fR4 = C2678a.r(parcel, iT);
                    break;
                case 7:
                    fR8 = C2678a.r(parcel, iT);
                    break;
                case 8:
                    fR9 = C2678a.r(parcel, iT);
                    break;
                case 9:
                    zznVarArr = (zzn[]) C2678a.j(parcel, iT, zzn.CREATOR);
                    break;
                case 10:
                    fR5 = C2678a.r(parcel, iT);
                    break;
                case 11:
                    fR6 = C2678a.r(parcel, iT);
                    break;
                case 12:
                    fR7 = C2678a.r(parcel, iT);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) C2678a.j(parcel, iT, zzd.CREATOR);
                    break;
                case 14:
                    fR10 = C2678a.r(parcel, iT);
                    break;
                case 15:
                    fR11 = C2678a.r(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzf(iV, iV2, fR, fR2, fR3, fR4, fR8, fR9, fR10, zznVarArr, fR5, fR6, fR7, zzdVarArr, fR11);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzf[i7];
    }
}
