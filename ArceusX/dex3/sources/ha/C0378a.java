package ha;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LL8/a;", "", "Lp/d;", "intent", "", "url", "<init>", "(Lp/d;Ljava/lang/String;)V", "a", "Lp/d;", "()Lp/d;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0378a {

    @NotNull
    private final d intent;

    @NotNull
    private final String url;

    public C0378a(@NotNull d dVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dVar, "intent");
        Intrinsics.checkNotNullParameter(str, "url");
        this.intent = dVar;
        this.url = str;
    }

    @NotNull
    public final d getIntent() {
        return this.intent;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
