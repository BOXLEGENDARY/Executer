package p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

public final class C2718a extends I3.a implements IInterface {
    C2718a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void h3(TelemetryData telemetryData) throws RemoteException {
        Parcel parcelE0 = E0();
        I3.c.c(parcelE0, telemetryData);
        V0(1, parcelE0);
    }
}
