package r3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import o3.C2678a;

public final class C2748f implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                pendingIntent = (PendingIntent) C2678a.f(parcel, iT, PendingIntent.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ModuleInstallIntentResponse[i7];
    }
}
