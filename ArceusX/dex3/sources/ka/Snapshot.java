package ka;

import P9.i;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.e;
import okio.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Lf8/i;", "", "Lkotlin/Function0;", "Lokio/h;", "toByteString", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlin/jvm/functions/Function0;", "b", "LP9/h;", "()Lokio/h;", "bytes", "c", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class Snapshot {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function0<okio.h> toByteString;

    @NotNull
    private final P9.h bytes;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf8/i$a;", "", "<init>", "()V", "Lokio/h;", "byteString", "Lf8/i;", "b", "(Lokio/h;)Lf8/i;", "Lkotlin/Function0;", "lazy", "a", "(Lkotlin/jvm/functions/Function0;)Lf8/i;", "Lkotlin/Function1;", "Lokio/f;", "", "c", "(Lkotlin/jvm/functions/Function1;)Lf8/i;", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/h;", "a", "()Lokio/h;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class h extends l implements Function0<okio.h> {
            final okio.h d;

            h(okio.h hVar) {
                super(0);
                this.d = hVar;
            }

            @NotNull
            public final okio.h invoke() {
                return this.d;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/h;", "a", "()Lokio/h;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0571b extends l implements Function0<okio.h> {
            final Function1<f, Unit> d;

            C0571b(Function1<? super f, Unit> function1) {
                super(0);
                this.d = function1;
            }

            @NotNull
            public final okio.h invoke() {
                e eVar = new e();
                this.d.invoke(eVar);
                return eVar.C0();
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Snapshot a(@NotNull Function0<? extends okio.h> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        @NotNull
        public final Snapshot b(@NotNull okio.h byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return new Snapshot(new h(byteString), null);
        }

        @NotNull
        public final Snapshot c(@NotNull Function1<? super f, Unit> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return a(new C0571b(lazy));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/h;", "a", "()Lokio/h;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class h extends l implements Function0<okio.h> {
        h() {
            super(0);
        }

        @NotNull
        public final okio.h invoke() {
            return (okio.h) Snapshot.this.toByteString.invoke();
        }
    }

    public Snapshot(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    @NotNull
    public final okio.h b() {
        return (okio.h) this.bytes.getValue();
    }

    public boolean equals(Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.b(b(), snapshot.b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public String toString() {
        return "Snapshot(" + b() + ')';
    }

    private Snapshot(Function0<? extends okio.h> function0) {
        this.toByteString = function0;
        this.bytes = i.b(new h());
    }
}
