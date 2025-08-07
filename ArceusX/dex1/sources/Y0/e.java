package Y0;

import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"LY0/e;", "Lc1/h$c;", "delegate", "LY0/c;", "autoCloser", "<init>", "(Lc1/h$c;LY0/c;)V", "Lc1/h$b;", "configuration", "LY0/d;", "b", "(Lc1/h$b;)LY0/d;", "a", "Lc1/h$c;", "LY0/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements h.c {

    private final h.c delegate;

    private final c autoCloser;

    public e(h.c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "delegate");
        Intrinsics.checkNotNullParameter(cVar2, "autoCloser");
        this.delegate = cVar;
        this.autoCloser = cVar2;
    }

    @Override
    public d a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(this.delegate.a(configuration), this.autoCloser);
    }
}
