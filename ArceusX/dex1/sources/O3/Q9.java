package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import o3.C2678a;

public final class Q9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zzp zzpVar = null;
        String strG = null;
        String strG2 = null;
        zzq[] zzqVarArr = null;
        zzn[] zznVarArr = null;
        String[] strArrH = null;
        zzi[] zziVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    zzpVar = (zzp) C2678a.f(parcel, iT, zzp.CREATOR);
                    break;
                case 3:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    zzqVarArr = (zzq[]) C2678a.j(parcel, iT, zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (zzn[]) C2678a.j(parcel, iT, zzn.CREATOR);
                    break;
                case 7:
                    strArrH = C2678a.h(parcel, iT);
                    break;
                case 8:
                    zziVarArr = (zzi[]) C2678a.j(parcel, iT, zzi.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzl(zzpVar, strG, strG2, zzqVarArr, zznVarArr, strArrH, zziVarArr);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzl[i7];
    }
}
