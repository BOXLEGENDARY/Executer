package g8;

import com.roblox.client.personasdk.R;
import g8.e;
import ha.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg8/g;", "Lg8/e$a;", "", "key", "Lha/z0;", "job", "<init>", "(Ljava/lang/String;Lha/z0;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lha/z0;", "c", "()Lha/z0;", "Lg8/g;", "e", "()Lg8/g;", "f", "(Lg8/g;)V", "nextListNode", "wf1-workflow-runtime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class g implements e.a<g> {

    @NotNull
    private final String key;

    @NotNull
    private final z0 job;

    private g nextListNode;

    public g(@NotNull String str, @NotNull z0 z0Var) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(z0Var, "job");
        this.key = str;
        this.job = z0Var;
    }

    @NotNull
    public final z0 getJob() {
        return this.job;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Override
    public g a() {
        return this.nextListNode;
    }

    @Override
    public void b(g gVar) {
        this.nextListNode = gVar;
    }
}
