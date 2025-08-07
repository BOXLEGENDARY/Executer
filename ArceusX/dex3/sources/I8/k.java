package I8;

import androidx.lifecycle.E;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

public final class k {
    private final C9.h<E> a;

    public k(C9.h<E> hVar) {
        this.a = hVar;
    }

    public static k a(C9.h<E> hVar) {
        return new k(hVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.fallbackmode.i c(List<? extends NextStep> list, String str, E e) {
        return new com.withpersona.sdk2.inquiry.internal.fallbackmode.i(list, str, e);
    }

    public com.withpersona.sdk2.inquiry.internal.fallbackmode.i b(List<? extends NextStep> list, String str) {
        return c(list, str, (E) this.a.get());
    }
}
