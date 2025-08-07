package ha;

import com.roblox.client.personasdk.R;
import e.b;
import e.c;
import f.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"LL8/H;", "I", "O", "Le/c;", "Lf/a;", "contract", "Le/a;", "callback", "<init>", "(Lf/a;Le/a;)V", "input", "Landroidx/core/app/c;", "options", "", "c", "(Ljava/lang/Object;Landroidx/core/app/c;)V", "d", "()V", "Le/b;", "activityResultCaller", "e", "(Le/b;)V", "a", "Lf/a;", "()Lf/a;", "b", "Le/a;", "Le/c;", "currentLauncher", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0376H<I, O> extends c<I> {

    @NotNull
    private final a<I, O> contract;

    @NotNull
    private final e.a<O> callback;

    private c<I> currentLauncher;

    public C0376H(@NotNull a<I, O> aVar, @NotNull e.a<O> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "contract");
        Intrinsics.checkNotNullParameter(aVar2, "callback");
        this.contract = aVar;
        this.callback = aVar2;
    }

    @NotNull
    public a<I, O> a() {
        return this.contract;
    }

    public void c(I input, androidx.core.app.c options) {
        c<I> cVar = this.currentLauncher;
        if (cVar != null) {
            cVar.c(input, options);
        }
    }

    public void d() {
        c<I> cVar = this.currentLauncher;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void e(@NotNull b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.currentLauncher = activityResultCaller.registerForActivityResult(a(), this.callback);
    }
}
