package okio;

import L0.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.Metadata;
import okio.C0404a;
import okio.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"LB1/l;", "", "<init>", "()V", "", "mimeType", "Lokio/g;", "source", "LB1/k;", "policy", "LB1/i;", "a", "(Ljava/lang/String;Lokio/g;LB1/k;)LB1/i;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;LB1/i;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "PAINT", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    @NotNull
    public static final l a = new l();

    @NotNull
    private static final Paint PAINT = new Paint(3);

    private l() {
    }

    @NotNull
    public final i a(String mimeType, @NotNull g source, @NotNull k policy) {
        if (!m.c(policy, mimeType)) {
            return i.d;
        }
        a aVar = new a(new j(source.peek().w1()));
        return new i(aVar.J(), aVar.y());
    }

    @NotNull
    public final Bitmap b(@NotNull Bitmap inBitmap, @NotNull i exifData) {
        if (!exifData.getIsFlipped() && !m.a(exifData)) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (m.a(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = m.b(exifData) ? Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), C0404a.c(inBitmap)) : Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), C0404a.c(inBitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(inBitmap, matrix, PAINT);
        inBitmap.recycle();
        return bitmapCreateBitmap;
    }
}
