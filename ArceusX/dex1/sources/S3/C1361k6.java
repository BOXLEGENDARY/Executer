package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import o3.C2678a;

public final class C1361k6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            C2678a.m(iT);
            C2678a.B(parcel, iT);
        }
        C2678a.l(parcel, iC);
        return new zzn();
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzn[i7];
    }
}
