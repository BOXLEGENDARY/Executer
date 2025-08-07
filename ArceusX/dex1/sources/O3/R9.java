package O3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import o3.C2678a;

public final class R9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    bArrB = C2678a.b(parcel, iT);
                    break;
                case 5:
                    pointArr = (Point[]) C2678a.j(parcel, iT, Point.CREATOR);
                    break;
                case 6:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 7:
                    zzxuVar = (zzxu) C2678a.f(parcel, iT, zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (zzxx) C2678a.f(parcel, iT, zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (zzxy) C2678a.f(parcel, iT, zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (zzya) C2678a.f(parcel, iT, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) C2678a.f(parcel, iT, zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (zzxv) C2678a.f(parcel, iT, zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (zzxr) C2678a.f(parcel, iT, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) C2678a.f(parcel, iT, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) C2678a.f(parcel, iT, zzxt.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzyb(iV, strG, strG2, bArrB, pointArr, iV2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzyb[i7];
    }
}
