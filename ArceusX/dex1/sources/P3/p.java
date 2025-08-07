package P3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import o3.C2678a;

public final class p implements Parcelable.Creator<zzq> {
    @Override
    public final zzq createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
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
                    zzjVar = (zzj) C2678a.f(parcel, iT, zzj.CREATOR);
                    break;
                case 8:
                    zzmVar = (zzm) C2678a.f(parcel, iT, zzm.CREATOR);
                    break;
                case 9:
                    zznVar = (zzn) C2678a.f(parcel, iT, zzn.CREATOR);
                    break;
                case 10:
                    zzpVar = (zzp) C2678a.f(parcel, iT, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) C2678a.f(parcel, iT, zzo.CREATOR);
                    break;
                case 12:
                    zzkVar = (zzk) C2678a.f(parcel, iT, zzk.CREATOR);
                    break;
                case 13:
                    zzgVar = (zzg) C2678a.f(parcel, iT, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) C2678a.f(parcel, iT, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) C2678a.f(parcel, iT, zzi.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzq(iV, strG, strG2, bArrB, pointArr, iV2, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar);
    }

    @Override
    public final zzq[] newArray(int i7) {
        return new zzq[i7];
    }
}
