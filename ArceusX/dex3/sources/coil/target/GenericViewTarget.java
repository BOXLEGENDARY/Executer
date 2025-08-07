package coil.target;

import L1.b;
import N1.d;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\f¨\u0006 "}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "LL1/b;", "LN1/d;", "Landroidx/lifecycle/d;", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "f", "(Landroid/graphics/drawable/Drawable;)V", "error", "c", "result", "b", "Landroidx/lifecycle/o;", "owner", "onStart", "(Landroidx/lifecycle/o;)V", "onStop", "drawable", "k", "i", "", "d", "Z", "isStarted", "g", "()Landroid/graphics/drawable/Drawable;", "h", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GenericViewTarget<T extends View> implements b<T>, d, androidx.lifecycle.d {

    private boolean isStarted;

    @Override
    public void b(@NotNull Drawable result) {
        k(result);
    }

    @Override
    public void c(Drawable error) {
        k(error);
    }

    @Override
    public void f(Drawable placeholder) {
        k(placeholder);
    }

    @Override
    public abstract Drawable g();

    public abstract void h(Drawable drawable);

    protected final void i() {
        Object objG = g();
        Animatable animatable = objG instanceof Animatable ? (Animatable) objG : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void k(Drawable drawable) {
        Object objG = g();
        Animatable animatable = objG instanceof Animatable ? (Animatable) objG : null;
        if (animatable != null) {
            animatable.stop();
        }
        h(drawable);
        i();
    }

    public void onStart(@NotNull o owner) {
        this.isStarted = true;
        i();
    }

    public void onStop(@NotNull o owner) {
        this.isStarted = false;
        i();
    }
}
