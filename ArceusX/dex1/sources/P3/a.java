package P3;

import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface {

    private final IBinder f3724d;

    protected a(IBinder iBinder, String str) {
        this.f3724d = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f3724d;
    }
}
