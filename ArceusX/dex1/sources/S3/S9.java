package S3;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import java.util.ArrayList;
import o3.C2678a;

public final class S9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strG = null;
        Rect rect = null;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 2) {
                rect = (Rect) C2678a.f(parcel, iT, Rect.CREATOR);
            } else if (iM == 3) {
                arrayListK = C2678a.k(parcel, iT, Point.CREATOR);
            } else if (iM == 4) {
                fR = C2678a.r(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                fR2 = C2678a.r(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzvj(strG, rect, arrayListK, fR, fR2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzvj[i7];
    }
}
