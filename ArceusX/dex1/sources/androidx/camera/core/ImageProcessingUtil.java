package androidx.camera.core;

import C.InterfaceC0353t0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import java.nio.ByteBuffer;
import java.util.Locale;
import z.C3043d0;

public final class ImageProcessingUtil {

    private static int f9409a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(n nVar) {
        if (!l(nVar)) {
            C3043d0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(nVar) != a.ERROR_CONVERSION) {
            return true;
        }
        C3043d0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static a d(n nVar) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iD = nVar.s()[0].d();
        int iD2 = nVar.s()[1].d();
        int iD3 = nVar.s()[2].d();
        int iE = nVar.s()[0].e();
        int iE2 = nVar.s()[1].e();
        return nativeShiftPixel(nVar.s()[0].c(), iD, nVar.s()[1].c(), iD2, nVar.s()[2].c(), iD3, iE, iE2, width, height, iE, iE2, iE2) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static n e(InterfaceC0353t0 interfaceC0353t0, byte[] bArr) {
        x0.g.a(interfaceC0353t0.d() == 256);
        x0.g.g(bArr);
        Surface surfaceA = interfaceC0353t0.a();
        x0.g.g(surfaceA);
        if (nativeWriteJpegToSurface(bArr, surfaceA) != 0) {
            C3043d0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n nVarC = interfaceC0353t0.c();
        if (nVarC == null) {
            C3043d0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return nVarC;
    }

    public static Bitmap f(n nVar) {
        if (nVar.i() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iD = nVar.s()[0].d();
        int iD2 = nVar.s()[1].d();
        int iD3 = nVar.s()[2].d();
        int iE = nVar.s()[0].e();
        int iE2 = nVar.s()[1].e();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(nVar.s()[0].c(), iD, nVar.s()[1].c(), iD2, nVar.s()[2].c(), iD3, iE, iE2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static n g(final n nVar, InterfaceC0353t0 interfaceC0353t0, ByteBuffer byteBuffer, int i7, boolean z7) {
        if (!l(nVar)) {
            C3043d0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!k(i7)) {
            C3043d0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(nVar, interfaceC0353t0.a(), byteBuffer, i7, z7) == a.ERROR_CONVERSION) {
            C3043d0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            C3043d0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f9409a)));
            f9409a++;
        }
        final n nVarC = interfaceC0353t0.c();
        if (nVarC == null) {
            C3043d0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarC);
        sVar.b(new e.a() {
            @Override
            public final void b(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.m(nVarC, nVar, nVar2);
            }
        });
        return sVar;
    }

    private static a h(n nVar, Surface surface, ByteBuffer byteBuffer, int i7, boolean z7) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iD = nVar.s()[0].d();
        int iD2 = nVar.s()[1].d();
        int iD3 = nVar.s()[2].d();
        int iE = nVar.s()[0].e();
        int iE2 = nVar.s()[1].e();
        return nativeConvertAndroid420ToABGR(nVar.s()[0].c(), iD, nVar.s()[1].c(), iD2, nVar.s()[2].c(), iD3, iE, iE2, surface, byteBuffer, width, height, z7 ? iE : 0, z7 ? iE2 : 0, z7 ? iE2 : 0, i7) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i7) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i7, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i7) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i7, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean k(int i7) {
        return i7 == 0 || i7 == 90 || i7 == 180 || i7 == 270;
    }

    private static boolean l(n nVar) {
        return nVar.i() == 35 && nVar.s().length == 3;
    }

    public static void m(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    public static void n(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, Surface surface, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, Bitmap bitmap, int i12, int i13, int i14);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, boolean z7);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, ByteBuffer byteBuffer4, int i11, int i12, ByteBuffer byteBuffer5, int i13, int i14, ByteBuffer byteBuffer6, int i15, int i16, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i17, int i18, int i19);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i7, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static n o(final n nVar, InterfaceC0353t0 interfaceC0353t0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (!l(nVar)) {
            C3043d0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!k(i7)) {
            C3043d0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if ((i7 > 0 ? p(nVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i7) : aVar) == aVar) {
            C3043d0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final n nVarC = interfaceC0353t0.c();
        if (nVarC == null) {
            C3043d0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        s sVar = new s(nVarC);
        sVar.b(new e.a() {
            @Override
            public final void b(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.n(nVarC, nVar, nVar2);
            }
        });
        return sVar;
    }

    private static a p(n nVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int iD = nVar.s()[0].d();
        int iD2 = nVar.s()[1].d();
        int iD3 = nVar.s()[2].d();
        int iE = nVar.s()[1].e();
        Image imageB = I.a.b(imageWriter);
        if (imageB != null && nativeRotateYUV(nVar.s()[0].c(), iD, nVar.s()[1].c(), iD2, nVar.s()[2].c(), iD3, iE, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i7) == 0) {
            I.a.d(imageWriter, imageB);
            return a.SUCCESS;
        }
        return a.ERROR_CONVERSION;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        x0.g.g(bArr);
        x0.g.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        C3043d0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
