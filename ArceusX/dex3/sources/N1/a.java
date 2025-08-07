package N1;

import K1.h;
import N1.c;
import P9.m;
import android.graphics.drawable.Drawable;
import ha.AbstractC0357h;
import ha.C0354e;
import ha.C0365p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LN1/a;", "LN1/c;", "LN1/d;", "target", "LJ1/h;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(LN1/d;LJ1/h;IZ)V", "", "a", "()V", "LN1/d;", "b", "LJ1/h;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements c {

    @NotNull
    private final d target;

    @NotNull
    private final AbstractC0357h result;

    private final int durationMillis;

    private final boolean preferExactIntrinsicSize;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LN1/a$a;", "LN1/c$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "LN1/d;", "target", "LJ1/h;", "result", "LN1/c;", "a", "(LN1/d;LJ1/h;)LN1/c;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "I", "getDurationMillis", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0040a implements c.a {

        private final int durationMillis;

        private final boolean preferExactIntrinsicSize;

        public C0040a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        @Override
        @NotNull
        public c a(@NotNull d target, @NotNull AbstractC0357h result) {
            if ((result instanceof C0365p) && ((C0365p) result).getDataSource() != e.d) {
                return new a(target, result, this.durationMillis, this.preferExactIntrinsicSize);
            }
            return c.a.b.a(target, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof C0040a) {
                C0040a c0040a = (C0040a) other;
                if (this.durationMillis == c0040a.durationMillis && this.preferExactIntrinsicSize == c0040a.preferExactIntrinsicSize) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.durationMillis * 31) + Boolean.hashCode(this.preferExactIntrinsicSize);
        }

        public C0040a(int i, boolean z) {
            this.durationMillis = i;
            this.preferExactIntrinsicSize = z;
            if (i <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public C0040a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    public a(@NotNull d dVar, @NotNull AbstractC0357h abstractC0357h, int i, boolean z) {
        this.target = dVar;
        this.result = abstractC0357h;
        this.durationMillis = i;
        this.preferExactIntrinsicSize = z;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override
    public void a() throws m {
        Drawable drawableG = this.target.g();
        Drawable drawable = this.result.getDrawable();
        h scale = this.result.getRequest().getScale();
        int i = this.durationMillis;
        AbstractC0357h abstractC0357h = this.result;
        D1.b bVar = new D1.b(drawableG, drawable, scale, i, ((abstractC0357h instanceof C0365p) && ((C0365p) abstractC0357h).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        AbstractC0357h abstractC0357h2 = this.result;
        if (abstractC0357h2 instanceof C0365p) {
            this.target.b(bVar);
        } else {
            if (!(abstractC0357h2 instanceof C0354e)) {
                throw new m();
            }
            this.target.c(bVar);
        }
    }
}
