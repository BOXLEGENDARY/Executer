package N1;

import N1.c;
import P9.m;
import ha.AbstractC0357h;
import ha.C0354e;
import ha.C0365p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LN1/b;", "LN1/c;", "LN1/d;", "target", "LJ1/h;", "result", "<init>", "(LN1/d;LJ1/h;)V", "", "a", "()V", "LN1/d;", "b", "LJ1/h;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements c {

    @NotNull
    private final d target;

    @NotNull
    private final AbstractC0357h result;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LN1/b$a;", "LN1/c$a;", "<init>", "()V", "LN1/d;", "target", "LJ1/h;", "result", "LN1/c;", "a", "(LN1/d;LJ1/h;)LN1/c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c.a {
        @Override
        @NotNull
        public c a(@NotNull d target, @NotNull AbstractC0357h result) {
            return new b(target, result);
        }

        public boolean equals(Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(@NotNull d dVar, @NotNull AbstractC0357h abstractC0357h) {
        this.target = dVar;
        this.result = abstractC0357h;
    }

    @Override
    public void a() throws m {
        AbstractC0357h abstractC0357h = this.result;
        if (abstractC0357h instanceof C0365p) {
            this.target.b(((C0365p) abstractC0357h).getDrawable());
        } else {
            if (!(abstractC0357h instanceof C0354e)) {
                throw new m();
            }
            this.target.c(((C0354e) abstractC0357h).getDrawable());
        }
    }
}
