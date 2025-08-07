package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zze;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import o3.C2678a;

public final class t implements Parcelable.Creator<zzh> {
    @Override
    public final zzh createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zzl zzlVar = null;
        String strG = null;
        String strG2 = null;
        zzm[] zzmVarArr = null;
        zzj[] zzjVarArr = null;
        String[] strArrH = null;
        zze[] zzeVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    zzlVar = (zzl) C2678a.f(parcel, iT, zzl.CREATOR);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    zzmVarArr = (zzm[]) C2678a.j(parcel, iT, zzm.CREATOR);
                    break;
                case 5:
                    zzjVarArr = (zzj[]) C2678a.j(parcel, iT, zzj.CREATOR);
                    break;
                case 6:
                    strArrH = C2678a.h(parcel, iT);
                    break;
                case 7:
                    zzeVarArr = (zze[]) C2678a.j(parcel, iT, zze.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzh(zzlVar, strG, strG2, zzmVarArr, zzjVarArr, strArrH, zzeVarArr);
    }

    @Override
    public final zzh[] newArray(int i7) {
        return new zzh[i7];
    }
}
