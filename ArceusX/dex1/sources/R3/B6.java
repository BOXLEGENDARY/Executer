package R3;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import java.util.ArrayList;
import o3.C2678a;

public final class B6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                arrayListK = C2678a.k(parcel, iT, PointF.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzos(iV, arrayListK);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzos[i7];
    }
}
