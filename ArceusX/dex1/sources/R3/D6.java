package R3;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import java.util.ArrayList;
import o3.C2678a;

public final class D6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        Rect rect = null;
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 0.0f;
        float fR7 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    rect = (Rect) C2678a.f(parcel, iT, Rect.CREATOR);
                    break;
                case 3:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 4:
                    fR2 = C2678a.r(parcel, iT);
                    break;
                case 5:
                    fR3 = C2678a.r(parcel, iT);
                    break;
                case 6:
                    fR4 = C2678a.r(parcel, iT);
                    break;
                case 7:
                    fR5 = C2678a.r(parcel, iT);
                    break;
                case 8:
                    fR6 = C2678a.r(parcel, iT);
                    break;
                case 9:
                    fR7 = C2678a.r(parcel, iT);
                    break;
                case 10:
                    arrayListK = C2678a.k(parcel, iT, zzpc.CREATOR);
                    break;
                case 11:
                    arrayListK2 = C2678a.k(parcel, iT, zzos.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzow(iV, rect, fR, fR2, fR3, fR4, fR5, fR6, fR7, arrayListK, arrayListK2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzow[i7];
    }
}
