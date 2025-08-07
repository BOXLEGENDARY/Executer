package E1;

import E1.i;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ha.C0361l;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LE1/b;", "LE1/i;", "Landroid/graphics/Bitmap;", "data", "LJ1/l;", "options", "<init>", "(Landroid/graphics/Bitmap;LJ1/l;)V", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "b", "LJ1/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements i {

    @NotNull
    private final Bitmap data;

    @NotNull
    private final C0361l options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LE1/b$a;", "LE1/i$a;", "Landroid/graphics/Bitmap;", "<init>", "()V", "data", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Landroid/graphics/Bitmap;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<Bitmap> {
        @Override
        @NotNull
        public i a(@NotNull Bitmap data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            return new b(data, options);
        }
    }

    public b(@NotNull Bitmap bitmap, @NotNull C0361l c0361l) {
        this.data = bitmap;
        this.options = c0361l;
    }

    @Override
    public Object a(@NotNull Continuation<? super h> continuation) {
        return new g(new BitmapDrawable(this.options.getContext().getResources(), this.data), false, okio.e.e);
    }
}
