package s;

import C.J;
import android.view.C1709w;
import android.view.LiveData;
import java.util.Objects;
import z.AbstractC3062q;
import z.C3043d0;

class Q0 {

    private final C.Q f23147a;

    private final C1709w<AbstractC3062q> f23148b;

    static class a {

        static final int[] f23149a;

        static {
            int[] iArr = new int[J.a.values().length];
            f23149a = iArr;
            try {
                iArr[J.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23149a[J.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23149a[J.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23149a[J.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23149a[J.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23149a[J.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23149a[J.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23149a[J.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    Q0(C.Q q7) {
        this.f23147a = q7;
        C1709w<AbstractC3062q> c1709w = new C1709w<>();
        this.f23148b = c1709w;
        c1709w.m(AbstractC3062q.a(AbstractC3062q.b.CLOSED));
    }

    private AbstractC3062q b() {
        return this.f23147a.c() ? AbstractC3062q.a(AbstractC3062q.b.OPENING) : AbstractC3062q.a(AbstractC3062q.b.PENDING_OPEN);
    }

    public LiveData<AbstractC3062q> a() {
        return this.f23148b;
    }

    public void c(J.a aVar, AbstractC3062q.a aVar2) {
        AbstractC3062q abstractC3062qB;
        switch (a.f23149a[aVar.ordinal()]) {
            case 1:
                abstractC3062qB = b();
                break;
            case 2:
                abstractC3062qB = AbstractC3062q.b(AbstractC3062q.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                abstractC3062qB = AbstractC3062q.b(AbstractC3062q.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                abstractC3062qB = AbstractC3062q.b(AbstractC3062q.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                abstractC3062qB = AbstractC3062q.b(AbstractC3062q.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C3043d0.a("CameraStateMachine", "New public camera state " + abstractC3062qB + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f23148b.f(), abstractC3062qB)) {
            return;
        }
        C3043d0.a("CameraStateMachine", "Publishing new public camera state " + abstractC3062qB);
        this.f23148b.m(abstractC3062qB);
    }
}
