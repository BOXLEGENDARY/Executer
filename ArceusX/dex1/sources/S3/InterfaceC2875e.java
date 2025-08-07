package s3;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public interface InterfaceC2875e extends IInterface {
    void F2(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    void O5(Status status) throws RemoteException;

    void W3(Status status, ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void e4(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
