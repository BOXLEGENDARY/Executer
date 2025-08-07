package E1;

import E1.i;
import K1.c;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import ha.C0361l;
import ha.InterfaceC0883h;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.C0325r;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"LE1/e;", "LE1/i;", "Landroid/net/Uri;", "data", "LJ1/l;", "options", "<init>", "(Landroid/net/Uri;LJ1/l;)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Landroid/net/Uri;)Z", "c", "Landroid/net/Uri;", "LJ1/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements i {

    @NotNull
    private final Uri data;

    @NotNull
    private final C0361l options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LE1/e$a;", "LE1/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "b", "(Landroid/net/Uri;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<Uri> {
        private final boolean c(Uri data) {
            return Intrinsics.b(data.getScheme(), "content");
        }

        @Override
        public i a(@NotNull Uri data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            if (c(data)) {
                return new e(data, options);
            }
            return null;
        }
    }

    public e(@NotNull Uri uri, @NotNull C0361l c0361l) {
        this.data = uri;
        this.options = c0361l;
    }

    private final Bundle d() {
        K1.c cVarD = this.options.getSize().d();
        c.a aVar = cVarD instanceof c.a ? (c.a) cVarD : null;
        if (aVar == null) {
            return null;
        }
        int i = aVar.px;
        K1.c cVarC = this.options.getSize().c();
        c.a aVar2 = cVarC instanceof c.a ? (c.a) cVarC : null;
        if (aVar2 == null) {
            return null;
        }
        int i2 = aVar2.px;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
        return bundle;
    }

    @Override
    public Object a(@NotNull Continuation<? super h> continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (b(this.data)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.data, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.data + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.data);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.data + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.data, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.data + "'.").toString());
            }
        }
        return new m(C0325r.f(w.d(w.l(inputStreamOpenInputStream)), this.options.getContext(), new okio.d(this.data)), contentResolver.getType(this.data), okio.e.i);
    }

    public final boolean b(@NotNull Uri data) {
        return Intrinsics.b(data.getAuthority(), "com.android.contacts") && Intrinsics.b(data.getLastPathSegment(), "display_photo");
    }

    public final boolean c(@NotNull Uri data) {
        List<String> pathSegments;
        int size;
        return Intrinsics.b(data.getAuthority(), "media") && (size = (pathSegments = data.getPathSegments()).size()) >= 3 && Intrinsics.b(pathSegments.get(size + (-3)), "audio") && Intrinsics.b(pathSegments.get(size + (-2)), "albums");
    }
}
