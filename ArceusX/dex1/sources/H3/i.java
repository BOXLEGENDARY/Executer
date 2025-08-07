package H3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.appsflyer.R;
import com.google.android.gms.common.Feature;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;

public final class i extends com.google.android.gms.common.internal.c {
    public i(Context context, Looper looper, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, R.styleable.AppCompatTheme_windowNoTitle, c2644b, interfaceC2572c, interfaceC2577h);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
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
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder);
    }

    @Override
    public final Feature[] v() {
        return c.f1575e;
    }
}
