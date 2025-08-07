package Y3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.signin.internal.zak;

public abstract class b extends I3.b implements c {
    public b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override
    protected final boolean h3(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        switch (i7) {
            case 3:
                I3.c.b(parcel);
                break;
            case 4:
                I3.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                I3.c.b(parcel);
                break;
            case 7:
                I3.c.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) I3.c.a(parcel, zak.CREATOR);
                I3.c.b(parcel);
                h2(zakVar);
                break;
            case 9:
                I3.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
