package android.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.C1685T;
import android.view.C1703q;
import android.view.InterfaceC1701o;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.savedstate.a;
import b1.c;
import b1.d;
import b1.e;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010/\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0013\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/activity/q;", "Landroid/app/Dialog;", "Landroidx/lifecycle/o;", "Landroidx/activity/G;", "Lb1/d;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "c", "Landroidx/lifecycle/q;", "d", "Landroidx/lifecycle/q;", "_lifecycleRegistry", "Lb1/c;", "e", "Lb1/c;", "savedStateRegistryController", "Landroidx/activity/OnBackPressedDispatcher;", "i", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "b", "()Landroidx/lifecycle/q;", "lifecycleRegistry", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "savedStateRegistry", "Landroidx/lifecycle/h;", "getLifecycle", "()Landroidx/lifecycle/h;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class q extends Dialog implements InterfaceC1701o, G, d {

    private C1703q _lifecycleRegistry;

    private final c savedStateRegistryController;

    private final OnBackPressedDispatcher onBackPressedDispatcher;

    public q(Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = c.INSTANCE.a(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
            @Override
            public final void run() {
                q.d(this.f8472d);
            }
        });
    }

    private final C1703q b() {
        C1703q c1703q = this._lifecycleRegistry;
        if (c1703q != null) {
            return c1703q;
        }
        C1703q c1703q2 = new C1703q(this);
        this._lifecycleRegistry = c1703q2;
        return c1703q2;
    }

    public static final void d(q qVar) {
        super.onBackPressed();
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, params);
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.d(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        C1685T.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.d(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        C1586K.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.d(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        e.b(decorView3, this);
    }

    @Override
    public AbstractC1694h getLifecycle() {
        return b();
    }

    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override
    public a getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override
    public void onBackPressed() {
        this.onBackPressedDispatcher.l();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.o(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        b().j(AbstractC1694h.a.ON_CREATE);
    }

    @Override
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override
    protected void onStart() {
        super.onStart();
        b().j(AbstractC1694h.a.ON_RESUME);
    }

    @Override
    protected void onStop() {
        b().j(AbstractC1694h.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override
    public void setContentView(int layoutResID) {
        c();
        super.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, params);
    }
}
