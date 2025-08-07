package F3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import e3.C2420b;
import e3.C2421c;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;

public final class b extends com.google.android.gms.common.internal.c {

    private final Bundle f1260b0;

    public b(Context context, Looper looper, C2644b c2644b, C2421c c2421c, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, 16, c2644b, interfaceC2572c, interfaceC2577h);
        this.f1260b0 = c2421c == null ? new Bundle() : c2421c.a();
    }

    @Override
    protected final Bundle A() {
        return this.f1260b0;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final boolean o() {
        C2644b c2644bJ0 = j0();
        return (TextUtils.isEmpty(c2644bJ0.b()) || c2644bJ0.e(C2420b.f20415a).isEmpty()) ? false : true;
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }
}
