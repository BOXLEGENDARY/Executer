package ka;

import com.roblox.client.personasdk.R;
import fa.m;
import ka.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf8/o;", "OutputT", "", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public interface o<OutputT> {

    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0011"}, d2 = {"Lf8/o$a;", "", "<init>", "()V", "", "delayMs", "", "key", "Lf8/o;", "", "a", "(JLjava/lang/String;)Lf8/o;", "Lfa/m;", "b", "Lfa/m;", "getTYPE_OF_NOTHING$annotations", "TYPE_OF_NOTHING", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {
        static final Companion a = new Companion();

        @NotNull
        private static final m TYPE_OF_NOTHING = z.j(Void.class);

        private Companion() {
        }

        public static o b(Companion companion, long j, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.a(j, str);
        }

        @NotNull
        public final o<Unit> a(long delayMs, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new TimerWorker(delayMs, key);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class b {
        public static <OutputT> boolean a(@NotNull o<? extends OutputT> oVar, @NotNull o<?> oVar2) {
            Intrinsics.checkNotNullParameter(oVar, "this");
            Intrinsics.checkNotNullParameter(oVar2, "otherWorker");
            return Intrinsics.b(z.b(oVar2.getClass()), z.b(oVar.getClass()));
        }
    }

    boolean a(@NotNull o<?> otherWorker);

    @NotNull
    g<OutputT> run();
}
