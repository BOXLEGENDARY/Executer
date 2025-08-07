package h8;

import androidx.annotation.NonNull;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lh8/a;", "Lb1/d;", "Landroidx/lifecycle/o;", "", "key", "lifecycleOwner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/o;)V", "Landroidx/lifecycle/h;", "getLifecycle", "()Landroidx/lifecycle/h;", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lb1/c;", "i", "Lb1/c;", "a", "()Lb1/c;", "controller", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0583a implements b1.d, o {

    @NotNull
    private final String key;
    private final o e;

    @NotNull
    private final b1.c controller;

    public C0583a(@NotNull String str, @NotNull o oVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(oVar, "lifecycleOwner");
        this.key = str;
        this.e = oVar;
        b1.c cVarA = b1.c.a(this);
        Intrinsics.checkNotNullExpressionValue(cVarA, "create(this)");
        this.controller = cVarA;
    }

    @NotNull
    public final b1.c getController() {
        return this.controller;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NonNull
    @NotNull
    public h getLifecycle() {
        return this.e.getLifecycle();
    }

    @NotNull
    public androidx.savedstate.a getSavedStateRegistry() {
        androidx.savedstate.a aVarB = this.controller.b();
        Intrinsics.checkNotNullExpressionValue(aVarB, "controller.savedStateRegistry");
        return aVarB;
    }
}
