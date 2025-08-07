package O3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import o3.C2678a;

public final class H8 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        double dP = 0.0d;
        int iV = 0;
        int iV2 = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 3:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 6:
                    pointArr = (Point[]) C2678a.j(parcel, iT, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) C2678a.f(parcel, iT, zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (zzq) C2678a.f(parcel, iT, zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (zzr) C2678a.f(parcel, iT, zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (zzt) C2678a.f(parcel, iT, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) C2678a.f(parcel, iT, zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (zzo) C2678a.f(parcel, iT, zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (zzk) C2678a.f(parcel, iT, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) C2678a.f(parcel, iT, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) C2678a.f(parcel, iT, zzm.CREATOR);
                    break;
                case 16:
                    bArrB = C2678a.b(parcel, iT);
                    break;
                case 17:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 18:
                    dP = C2678a.p(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzu(iV, strG, strG2, iV2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArrB, zN, dP);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzu[i7];
    }
}
