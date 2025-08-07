package s;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.C2894g;
import x.C2983a;
import z.C3039b0;
import z.C3043d0;
import z.C3061p;

public final class C2858w implements C.H {

    private final Context f23514a;

    private final A.a f23515b;

    private final C.S f23516c;

    private final C.Q f23517d;

    private final t.O f23518e;

    private final List<String> f23519f;

    private final C2815h1 f23520g;

    private final long f23521h;

    private final Map<String, C2785T> f23522i = new HashMap();

    public C2858w(Context context, C.S s7, C3061p c3061p, long j7) throws C3039b0 {
        this.f23514a = context;
        this.f23516c = s7;
        t.O oB = t.O.b(context, s7.c());
        this.f23518e = oB;
        this.f23520g = C2815h1.c(context);
        this.f23519f = e(P0.b(this, c3061p));
        C2983a c2983a = new C2983a(oB);
        this.f23515b = c2983a;
        C.Q q7 = new C.Q(c2983a, 1);
        this.f23517d = q7;
        c2983a.a(q7);
        this.f23521h = j7;
    }

    private List<String> e(List<String> list) throws C3039b0 {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (O0.a(this.f23518e, str)) {
                arrayList.add(str);
            } else {
                C3043d0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override
    public Set<String> a() {
        return new LinkedHashSet(this.f23519f);
    }

    @Override
    public C.J b(String str) throws z.r {
        if (this.f23519f.contains(str)) {
            return new C2779M(this.f23514a, this.f23518e, str, f(str), this.f23515b, this.f23517d, this.f23516c.b(), this.f23516c.c(), this.f23520g, this.f23521h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override
    public A.a d() {
        return this.f23515b;
    }

    C2785T f(String str) throws z.r {
        try {
            C2785T c2785t = this.f23522i.get(str);
            if (c2785t != null) {
                return c2785t;
            }
            C2785T c2785t2 = new C2785T(str, this.f23518e);
            this.f23522i.put(str, c2785t2);
            return c2785t2;
        } catch (C2894g e7) {
            throw R0.a(e7);
        }
    }

    @Override
    public t.O c() {
        return this.f23518e;
    }
}
