package ha;

import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LJ1/f;", "Landroidx/lifecycle/h;", "<init>", "()V", "Landroidx/lifecycle/n;", "observer", "", "a", "(Landroidx/lifecycle/n;)V", "d", "", "toString", "()Ljava/lang/String;", "J1/f$a", "c", "LJ1/f$a;", "owner", "Landroidx/lifecycle/h$b;", "b", "()Landroidx/lifecycle/h$b;", "currentState", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0355f extends h {

    @NotNull
    public static final C0355f b = new C0355f();

    @NotNull
    private static final a owner = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"J1/f$a", "Landroidx/lifecycle/o;", "LJ1/f;", "a", "()LJ1/f;", "lifecycle", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements o {
        a() {
        }

        public C0355f getLifecycle() {
            return C0355f.b;
        }
    }

    private C0355f() {
    }

    public void a(@NotNull n observer) {
        if (!(observer instanceof d)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        d dVar = (d) observer;
        a aVar = owner;
        dVar.onCreate(aVar);
        dVar.onStart(aVar);
        dVar.onResume(aVar);
    }

    @NotNull
    public h.b b() {
        return h.b.w;
    }

    public void d(@NotNull n observer) {
    }

    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
