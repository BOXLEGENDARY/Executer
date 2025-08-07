package okio;

import K1.Size;
import K1.b;
import K1.h;
import P9.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ca.a;
import kotlin.Metadata;
import okio.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LO1/m;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap$Config;", "config", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "allowInexactSize", "LK1/i;", "size", "LK1/h;", "scale", "c", "(ZLandroid/graphics/Bitmap;LK1/i;LK1/h;)Z", "Landroid/graphics/drawable/Drawable;", "drawable", "a", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LK1/i;LK1/h;Z)Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0415m {

    @NotNull
    public static final C0415m a = new C0415m();

    private C0415m() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == C0404a.e(config);
    }

    private final boolean c(boolean allowInexactSize, Bitmap bitmap, Size size, h scale) {
        if (allowInexactSize) {
            return true;
        }
        return g.c(bitmap.getWidth(), bitmap.getHeight(), b.b(size) ? bitmap.getWidth() : C0412j.A(size.d(), scale), b.b(size) ? bitmap.getHeight() : C0412j.A(size.c(), scale), scale) == 1.0d;
    }

    @NotNull
    public final Bitmap a(@NotNull Drawable drawable, @NotNull Bitmap.Config config, @NotNull Size size, @NotNull h scale, boolean allowInexactSize) throws m {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(allowInexactSize, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iP = C0412j.p(drawableMutate);
        if (iP <= 0) {
            iP = 512;
        }
        int i = C0412j.i(drawableMutate);
        int i2 = i > 0 ? i : 512;
        double dC = g.c(iP, i2, b.b(size) ? iP : C0412j.A(size.d(), scale), b.b(size) ? i2 : C0412j.A(size.c(), scale), scale);
        int iA = a.a(iP * dC);
        int iA2 = a.a(dC * i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA, iA2, C0404a.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iA, iA2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }
}
