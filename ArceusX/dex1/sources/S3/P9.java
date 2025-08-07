package S3;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import java.util.ArrayList;
import o3.C2678a;

public final class P9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        String strG = null;
        Rect rect = null;
        ArrayList arrayListK = null;
        String strG2 = null;
        ArrayList arrayListK2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) C2678a.f(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    arrayListK = C2678a.k(parcel, iT, Point.CREATOR);
                    break;
                case 4:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    arrayListK2 = C2678a.k(parcel, iT, zzvb.CREATOR);
                    break;
                case 6:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 7:
                    fR2 = C2678a.r(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzvd(strG, rect, arrayListK, strG2, arrayListK2, fR, fR2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzvd[i7];
    }
}
