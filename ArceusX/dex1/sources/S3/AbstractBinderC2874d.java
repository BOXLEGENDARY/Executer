package s3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public abstract class AbstractBinderC2874d extends I3.b implements InterfaceC2875e {
    public AbstractBinderC2874d() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override
    protected final boolean h3(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            Status status = (Status) I3.c.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) I3.c.a(parcel, ModuleAvailabilityResponse.CREATOR);
            I3.c.b(parcel);
            e4(status, moduleAvailabilityResponse);
        } else if (i7 == 2) {
            Status status2 = (Status) I3.c.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) I3.c.a(parcel, ModuleInstallResponse.CREATOR);
            I3.c.b(parcel);
            W3(status2, moduleInstallResponse);
        } else if (i7 == 3) {
            Status status3 = (Status) I3.c.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) I3.c.a(parcel, ModuleInstallIntentResponse.CREATOR);
            I3.c.b(parcel);
            F2(status3, moduleInstallIntentResponse);
        } else {
            if (i7 != 4) {
                return false;
            }
            Status status4 = (Status) I3.c.a(parcel, Status.CREATOR);
            I3.c.b(parcel);
            O5(status4);
        }
        return true;
    }
}
