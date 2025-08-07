package e3;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import j3.C2498g;
import l3.AbstractC2532g;
import l3.C2526a;
import n3.C2644b;

final class C2423e extends C2526a.AbstractC0203a {
    C2423e() {
    }

    @Override
    public final C2526a.f a(Context context, Looper looper, C2644b c2644b, Object obj, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        return new C2498g(context, looper, c2644b, (GoogleSignInOptions) obj, aVar, bVar);
    }
}
