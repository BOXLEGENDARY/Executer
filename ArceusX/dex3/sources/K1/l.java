package K1;

import K1.c;
import P9.o;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ha.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"LK1/l;", "Landroid/view/View;", "T", "LK1/j;", "LK1/i;", "h", "()LK1/i;", "LK1/c;", "getWidth", "()LK1/c;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "e", "(III)LK1/c;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "f", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "()Landroid/view/View;", "view", "", "g", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface l<T extends View> extends j {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Function1<Throwable, Unit> {
        final l<T> d;
        final ViewTreeObserver e;
        final b i;

        a(l<T> lVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.d = lVar;
            this.e = viewTreeObserver;
            this.i = bVar;
        }

        public final void a(Throwable th) {
            this.d.f(this.e, this.i);
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"K1/l$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "d", "Z", "isResumed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        private boolean isResumed;
        final l<T> e;
        final ViewTreeObserver i;
        final ha.m<Size> v;

        b(l<T> lVar, ViewTreeObserver viewTreeObserver, ha.m<? super Size> mVar) {
            this.e = lVar;
            this.i = viewTreeObserver;
            this.v = mVar;
        }

        @Override
        public boolean onPreDraw() {
            Size sizeH = this.e.h();
            if (sizeH != null) {
                this.e.f(this.i, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.v.resumeWith(o.b(sizeH));
                }
            }
            return true;
        }
    }

    private default c e(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return c.b.a;
        }
        int i = paramSize - paddingSize;
        if (i > 0) {
            return K1.a.a(i);
        }
        int i2 = viewSize - paddingSize;
        if (i2 > 0) {
            return K1.a.a(i2);
        }
        return null;
    }

    default void f(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    private default c getHeight() {
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        return e(layoutParams != null ? layoutParams.height : -1, a().getHeight(), g() ? a().getPaddingTop() + a().getPaddingBottom() : 0);
    }

    private default c getWidth() {
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        return e(layoutParams != null ? layoutParams.width : -1, a().getWidth(), g() ? a().getPaddingLeft() + a().getPaddingRight() : 0);
    }

    default Size h() {
        c height;
        c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    static <T extends View> Object i(l<T> lVar, Continuation<? super Size> continuation) {
        Size sizeH = lVar.h();
        if (sizeH != null) {
            return sizeH;
        }
        n nVar = new n(S9.b.b(continuation), 1);
        nVar.C();
        ViewTreeObserver viewTreeObserver = lVar.a().getViewTreeObserver();
        b bVar = new b(lVar, viewTreeObserver, nVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        nVar.g(new a(lVar, viewTreeObserver, bVar));
        Object objZ = nVar.z();
        if (objZ == S9.b.c()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return objZ;
    }

    @NotNull
    T a();

    @Override
    default Object b(@NotNull Continuation<? super Size> continuation) {
        return i(this, continuation);
    }

    default boolean g() {
        return true;
    }
}
