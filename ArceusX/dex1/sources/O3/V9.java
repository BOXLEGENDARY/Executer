package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import o3.C2678a;

public final class V9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zzxw zzxwVar = null;
        String strG = null;
        String strG2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArrH = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    zzxwVar = (zzxw) C2678a.f(parcel, iT, zzxw.CREATOR);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) C2678a.j(parcel, iT, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) C2678a.j(parcel, iT, zzxu.CREATOR);
                    break;
                case 6:
                    strArrH = C2678a.h(parcel, iT);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) C2678a.j(parcel, iT, zzxp.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzxs(zzxwVar, strG, strG2, zzxxVarArr, zzxuVarArr, strArrH, zzxpVarArr);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzxs[i7];
    }
}
