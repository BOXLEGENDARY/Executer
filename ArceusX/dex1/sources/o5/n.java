package o5;

import S4.C1529d;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

public class n {

    public static final C1529d<?> f22487b = C1529d.c(n.class).b(S4.q.h(C2692i.class)).b(S4.q.h(Context.class)).f(new S4.h() {
        @Override
        public final Object a(S4.e eVar) {
            return new n((Context) eVar.a(Context.class));
        }
    }).d();

    protected final Context f22488a;

    public n(Context context) {
        this.f22488a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f22488a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
