package j3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class n {

    private static n f21140d;

    final C2493b f21141a;

    GoogleSignInAccount f21142b;

    GoogleSignInOptions f21143c;

    private n(Context context) {
        C2493b c2493bB = C2493b.b(context);
        this.f21141a = c2493bB;
        this.f21142b = c2493bB.c();
        this.f21143c = c2493bB.d();
    }

    public static synchronized n a(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized n d(Context context) {
        n nVar = f21140d;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(context);
        f21140d = nVar2;
        return nVar2;
    }

    public final synchronized void b() {
        this.f21141a.a();
        this.f21142b = null;
        this.f21143c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f21141a.f(googleSignInAccount, googleSignInOptions);
        this.f21142b = googleSignInAccount;
        this.f21143c = googleSignInOptions;
    }
}
