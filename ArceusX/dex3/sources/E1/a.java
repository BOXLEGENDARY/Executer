package E1;

import E1.i;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import ha.C0361l;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import okio.C0325r;
import okio.C0412j;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LE1/a;", "LE1/i;", "Landroid/net/Uri;", "data", "LJ1/l;", "options", "<init>", "(Landroid/net/Uri;LJ1/l;)V", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "b", "LJ1/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements i {

    @NotNull
    private final Uri data;

    @NotNull
    private final C0361l options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LE1/a$a;", "LE1/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Landroid/net/Uri;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0019a implements i.a<Uri> {
        @Override
        public i a(@NotNull Uri data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            if (C0412j.q(data)) {
                return new a(data, options);
            }
            return null;
        }
    }

    public a(@NotNull Uri uri, @NotNull C0361l c0361l) {
        this.data = uri;
        this.options = c0361l;
    }

    @Override
    public Object a(@NotNull Continuation<? super h> continuation) {
        String strU = CollectionsKt.U(CollectionsKt.H(this.data.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        return new m(C0325r.f(w.d(w.l(this.options.getContext().getAssets().open(strU))), this.options.getContext(), new okio.a(strU)), C0412j.j(MimeTypeMap.getSingleton(), strU), okio.e.i);
    }
}
