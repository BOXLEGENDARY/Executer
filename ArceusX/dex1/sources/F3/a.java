package F3;

import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface {

    private final IBinder f1258d;

    private final String f1259e;

    protected a(IBinder iBinder, String str) {
        this.f1258d = iBinder;
        this.f1259e = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1258d;
    }
}
