package okio;

import K1.Size;
import K1.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LO1/r;", "LO1/o;", "LO1/s;", "logger", "<init>", "(LO1/s;)V", "LK1/i;", "size", "", "a", "(LK1/i;)Z", "b", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class r implements InterfaceC0417o {
    public r(InterfaceC0420s interfaceC0420s) {
    }

    @Override
    public boolean a(@NotNull Size size) {
        c cVarD = size.d();
        if ((cVarD instanceof c.a ? ((c.a) cVarD).px : Integer.MAX_VALUE) > 100) {
            c cVarC = size.c();
            if ((cVarC instanceof c.a ? ((c.a) cVarC).px : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getAllowHardware() {
        return C0416n.a.b(null);
    }
}
