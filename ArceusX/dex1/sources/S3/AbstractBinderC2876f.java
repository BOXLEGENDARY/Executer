package s3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public abstract class AbstractBinderC2876f extends I3.b implements InterfaceC2877g {
    public AbstractBinderC2876f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override
    protected final boolean h3(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) I3.c.a(parcel, ModuleInstallStatusUpdate.CREATOR);
        I3.c.b(parcel);
        G5(moduleInstallStatusUpdate);
        return true;
    }
}
