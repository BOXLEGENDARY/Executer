package R3;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import o3.C2678a;

public final class I6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                pointF = (PointF) C2678a.f(parcel, iT, PointF.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzpc(iV, pointF);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzpc[i7];
    }
}
