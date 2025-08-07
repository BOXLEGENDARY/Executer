package Q8;

import android.content.Context;
import androidx.activity.result.IntentSenderRequest;

public final class i {
    private final C9.h<e.c<IntentSenderRequest>> a;
    private final C9.h<Context> b;

    public i(C9.h<e.c<IntentSenderRequest>> hVar, C9.h<Context> hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static i a(C9.h<e.c<IntentSenderRequest>> hVar, C9.h<Context> hVar2) {
        return new i(hVar, hVar2);
    }

    public static com.withpersona.sdk2.inquiry.permissions.a c(e.c<IntentSenderRequest> cVar, Context context) {
        return new com.withpersona.sdk2.inquiry.permissions.a(cVar, context);
    }

    public com.withpersona.sdk2.inquiry.permissions.a b() {
        return c((e.c) this.a.get(), (Context) this.b.get());
    }
}
