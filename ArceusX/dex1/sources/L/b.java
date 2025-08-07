package L;

import E.h;
import E.i;
import K0.wJ.BtcVLuo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import x0.g;
import z.C3043d0;

public final class b {

    public static final class a extends Exception {

        private final EnumC0029a f1932d;

        public enum EnumC0029a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC0029a enumC0029a) {
            super(str);
            this.f1932d = enumC0029a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i7;
        if (!i(rational)) {
            C3043d0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f7 = width;
        float f8 = height;
        float f9 = f7 / f8;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i8 = 0;
        if (rational.floatValue() > f9) {
            int iRound = Math.round((f7 / numerator) * denominator);
            i7 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f8 / denominator) * numerator);
            int i9 = (width - iRound2) / 2;
            width = iRound2;
            i7 = 0;
            i8 = i9;
        }
        return new Rect(i8, i7, width + i8, height + i7);
    }

    public static Bitmap b(n nVar) {
        int i7 = nVar.i();
        if (i7 == 1) {
            return e(nVar);
        }
        if (i7 == 35) {
            return ImageProcessingUtil.f(nVar);
        }
        if (i7 == 256 || i7 == 4101) {
            return c(nVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.i() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap c(n nVar) {
        byte[] bArrK = k(nVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrK, 0, bArrK.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap d(n.a[] aVarArr, int i7, int i8) {
        g.b(aVarArr.length == 1, BtcVLuo.LecOlWsSy);
        g.b(aVarArr[0].e() == 4, "Expect pixelStride=4");
        g.b(aVarArr[0].d() == i7 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        aVarArr[0].c().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, aVarArr[0].c(), aVarArr[0].d());
        return bitmapCreateBitmap;
    }

    private static Bitmap e(n nVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        nVar.s()[0].c().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, nVar.s()[0].c(), nVar.s()[0].d());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer f(Bitmap bitmap) {
        g.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static Rational g(int i7, Rational rational) {
        return (i7 == 90 || i7 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean j(int i7) {
        return i7 == 256 || i7 == 4101;
    }

    public static byte[] k(n nVar) {
        if (!j(nVar.i())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.i());
        }
        ByteBuffer byteBufferC = nVar.s()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return bArr;
    }

    public static Bitmap l(Bitmap bitmap, int i7) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] m(n nVar, Rect rect, int i7, int i8) throws a {
        if (nVar.i() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.i());
        }
        YuvImage yuvImage = new YuvImage(n(nVar), 17, nVar.getWidth(), nVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i iVar = new i(byteArrayOutputStream, h.b(nVar, i8));
        if (rect == null) {
            rect = new Rect(0, 0, nVar.getWidth(), nVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i7, iVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0029a.ENCODE_FAILED);
    }

    public static byte[] n(n nVar) {
        n.a aVar = nVar.s()[0];
        n.a aVar2 = nVar.s()[1];
        n.a aVar3 = nVar.s()[2];
        ByteBuffer byteBufferC = aVar.c();
        ByteBuffer byteBufferC2 = aVar2.c();
        ByteBuffer byteBufferC3 = aVar3.c();
        byteBufferC.rewind();
        byteBufferC2.rewind();
        byteBufferC3.rewind();
        int iRemaining = byteBufferC.remaining();
        byte[] bArr = new byte[((nVar.getWidth() * nVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i7 = 0; i7 < nVar.getHeight(); i7++) {
            byteBufferC.get(bArr, width, nVar.getWidth());
            width += nVar.getWidth();
            byteBufferC.position(Math.min(iRemaining, (byteBufferC.position() - nVar.getWidth()) + aVar.d()));
        }
        int height = nVar.getHeight() / 2;
        int width2 = nVar.getWidth() / 2;
        int iD = aVar3.d();
        int iD2 = aVar2.d();
        int iE = aVar3.e();
        int iE2 = aVar2.e();
        byte[] bArr2 = new byte[iD];
        byte[] bArr3 = new byte[iD2];
        for (int i8 = 0; i8 < height; i8++) {
            byteBufferC3.get(bArr2, 0, Math.min(iD, byteBufferC3.remaining()));
            byteBufferC2.get(bArr3, 0, Math.min(iD2, byteBufferC2.remaining()));
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < width2; i11++) {
                int i12 = width + 1;
                bArr[width] = bArr2[i9];
                width += 2;
                bArr[i12] = bArr3[i10];
                i9 += iE;
                i10 += iE2;
            }
        }
        return bArr;
    }
}
