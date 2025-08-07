package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g0.C2457a;
import java.util.Map;
import o3.C2679b;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new o();

    Bundle f19123d;

    private Map<String, String> f19124e;

    public RemoteMessage(Bundle bundle) {
        this.f19123d = bundle;
    }

    public final Map<String, String> l() {
        if (this.f19124e == null) {
            Bundle bundle = this.f19123d;
            C2457a c2457a = new C2457a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c2457a.put(str, str2);
                    }
                }
            }
            this.f19124e = c2457a;
        }
        return this.f19124e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.e(parcel, 2, this.f19123d, false);
        C2679b.b(parcel, iA);
    }
}
