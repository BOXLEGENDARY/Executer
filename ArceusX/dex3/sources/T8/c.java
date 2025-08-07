package T8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0007\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"LT8/c;", "", "<init>", "()V", "", "f", "", "a", "Z", "c", "()Z", "d", "(Z)V", "isSandboxModeEnabled", "LT8/c$b;", "<set-?>", "b", "LT8/c$b;", "()LT8/c$b;", "debugForcedStatus", "e", "simulateGovIdNfc", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    private boolean isSandboxModeEnabled;

    @NotNull
    private b debugForcedStatus = b.e;

    private boolean simulateGovIdNfc = true;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LT8/c$a;", "", "<init>", "()V", "LT8/c$b;", "", "a", "(LT8/c$b;)Ljava/lang/String;", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class C0048a {
            public static final int[] a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            int i = C0048a.a[bVar.ordinal()];
            if (i == 1) {
                return "failed";
            }
            if (i == 2) {
                return "passed";
            }
            throw new P9.m();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LT8/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "sandbox_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        public static final b d = new b("Failed", 0);
        public static final b e = new b("Passed", 1);
        private static final b[] i;
        private static final T9.a v;

        static {
            b[] bVarArrC = c();
            i = bVarArrC;
            v = T9.b.a(bVarArrC);
        }

        private b(String str, int i2) {
        }

        private static final b[] c() {
            return new b[]{d, e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) i.clone();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0049c {
        public static final int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @NotNull
    public final b getDebugForcedStatus() {
        return this.debugForcedStatus;
    }

    public final boolean b() {
        return this.isSandboxModeEnabled && this.simulateGovIdNfc;
    }

    public final boolean getIsSandboxModeEnabled() {
        return this.isSandboxModeEnabled;
    }

    public final void d(boolean z) {
        this.isSandboxModeEnabled = z;
    }

    public final void e(boolean z) {
        this.simulateGovIdNfc = z;
    }

    public final void f() throws P9.m {
        b bVar;
        int i = C0049c.a[this.debugForcedStatus.ordinal()];
        if (i == 1) {
            bVar = b.e;
        } else {
            if (i != 2) {
                throw new P9.m();
            }
            bVar = b.d;
        }
        this.debugForcedStatus = bVar;
    }
}
