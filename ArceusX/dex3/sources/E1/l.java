package E1;

import E1.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import ha.C0361l;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C0325r;
import okio.C0406d;
import okio.C0412j;
import okio.C0415m;
import okio.s;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\t\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LE1/l;", "LE1/i;", "Landroid/net/Uri;", "data", "LJ1/l;", "options", "<init>", "(Landroid/net/Uri;LJ1/l;)V", "", "b", "(Landroid/net/Uri;)Ljava/lang/Void;", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "LJ1/l;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements i {

    @NotNull
    private final Uri data;

    @NotNull
    private final C0361l options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LE1/l$b;", "LE1/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Landroid/net/Uri;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {
        private final boolean c(Uri data) {
            return Intrinsics.b(data.getScheme(), "android.resource");
        }

        @Override
        public i a(@NotNull Uri data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            if (c(data)) {
                return new l(data, options);
            }
            return null;
        }
    }

    public l(@NotNull Uri uri, @NotNull C0361l c0361l) {
        this.data = uri;
        this.options = c0361l;
    }

    private final Void b(Uri data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }

    @Override
    public Object a(@NotNull Continuation<? super h> continuation) throws Resources.NotFoundException, P9.d {
        Integer intOrNull;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (StringsKt.Y(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.X(this.data.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    b(this.data);
                    throw new P9.d();
                }
                int iIntValue = intOrNull.intValue();
                Context context = this.options.getContext();
                Resources resources = Intrinsics.b(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strJ = C0412j.j(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.b0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (!Intrinsics.b(strJ, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(C0325r.f(w.d(w.l(resources.openRawResource(iIntValue, typedValue2))), context, new s(authority, iIntValue, typedValue2.density)), strJ, okio.e.i);
                }
                Drawable drawableA = Intrinsics.b(authority, context.getPackageName()) ? C0406d.a(context, iIntValue) : C0406d.d(context, resources, iIntValue);
                boolean zU = C0412j.u(drawableA);
                if (zU) {
                    drawableA = new BitmapDrawable(context.getResources(), C0415m.a.a(drawableA, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
                }
                return new g(drawableA, zU, okio.e.i);
            }
        }
        b(this.data);
        throw new P9.d();
    }
}
