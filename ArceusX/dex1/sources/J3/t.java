package j3;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class t extends o {

    private final Context f21144d;

    public t(Context context) {
        this.f21144d = context;
    }

    private final void O0() {
        if (v3.s.a(this.f21144d, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override
    public final void d2() {
        O0();
        C2493b c2493bB = C2493b.b(this.f21144d);
        GoogleSignInAccount googleSignInAccountC = c2493bB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f13982E;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = c2493bB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f21144d, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.E();
        } else {
            bVarA.j();
        }
    }

    @Override
    public final void r1() {
        O0();
        n.a(this.f21144d).b();
    }
}
