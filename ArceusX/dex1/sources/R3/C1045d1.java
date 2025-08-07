package R3;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import o3.C2678a;

public final class C1045d1 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        PointF[] pointFArr = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                pointFArr = (PointF[]) C2678a.j(parcel, iT, PointF.CREATOR);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzd(pointFArr, iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzd[i7];
    }
}
