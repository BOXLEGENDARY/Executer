package A5;

import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;
import o5.C2692i;

public final class a {
    public static boolean a(AtomicReference<Boolean> atomicReference, String str) {
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean z7 = DynamiteModule.a(C2692i.c().b(), str) > 0;
        atomicReference.set(Boolean.valueOf(z7));
        return z7;
    }
}
