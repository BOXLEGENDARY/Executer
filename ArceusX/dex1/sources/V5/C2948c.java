package v5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import com.appsflyer.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import k5.C2518a;
import n3.C2651i;
import u5.C2938a;

public class C2948c {

    private static final C2948c f24168a = new C2948c();

    private C2948c() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static C2948c f() {
        return f24168a;
    }

    public static Bitmap i(ByteBuffer byteBuffer, int i7, int i8, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, C2518a, InvocationTargetException {
        byte[] bArrL = l(j(byteBuffer, true).array(), i7, i8);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i9, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static ByteBuffer j(ByteBuffer byteBuffer, boolean z7) {
        int i7;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i8 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z7 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i9 = 0;
        while (true) {
            i7 = i8 * 4;
            if (i9 >= i7) {
                break;
            }
            byteBufferAllocate.put(i9, byteBuffer.get(i9));
            i9++;
        }
        for (int i10 = 0; i10 < i8 + i8; i10++) {
            byteBufferAllocate.put(i7 + i10, byteBuffer.get(((i10 % 2) * i8) + i7 + (i10 / 2)));
        }
        return byteBufferAllocate;
    }

    public static Bitmap k(Bitmap bitmap, int i7, int i8, int i9) {
        if (i7 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i8, i9);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        return Bitmap.createBitmap(bitmap, 0, 0, i8, i9, matrix, true);
    }

    private static byte[] l(byte[] bArr, int i7, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, C2518a, InvocationTargetException {
        YuvImage yuvImage = new YuvImage(bArr, 17, i7, i8, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i7, i8), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new C2518a("Image conversion error from NV21 format", 13, e7);
        }
    }

    private static final void m(Image.Plane plane, int i7, int i8, byte[] bArr, int i9, int i10) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i11 = i7 / (i8 / iLimit);
        int rowStride = 0;
        for (int i12 = 0; i12 < iLimit; i12++) {
            int pixelStride = rowStride;
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i9] = buffer.get(pixelStride);
                i9 += i10;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public byte[] b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    public Bitmap c(Image image, int i7) {
        C2651i.b(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return k(bitmapDecodeByteArray, i7, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer d(C2938a c2938a, boolean z7) throws C2518a {
        int iH = c2938a.h();
        if (iH != -1) {
            if (iH == 17) {
                return z7 ? a((ByteBuffer) C2651i.l(c2938a.f())) : (ByteBuffer) C2651i.l(c2938a.f());
            }
            if (iH == 35) {
                return h((Image.Plane[]) C2651i.l(c2938a.k()), c2938a.m(), c2938a.i());
            }
            if (iH == 842094169) {
                return j((ByteBuffer) C2651i.l(c2938a.f()), z7);
            }
            throw new C2518a("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) C2651i.l(c2938a.e());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i7 = width * height;
        int[] iArr = new int[i7];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i7;
        ByteBuffer byteBufferAllocate = z7 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < height; i10++) {
            int i11 = 0;
            while (i11 < width) {
                int i12 = iArr[i9];
                int i13 = i12 >> 16;
                int i14 = i12 >> 8;
                int i15 = i12 & 255;
                int i16 = i8 + 1;
                int i17 = i13 & 255;
                int i18 = i14 & 255;
                byteBufferAllocate.put(i8, (byte) Math.min(255, (((((i17 * 66) + (i18 * 129)) + (i15 * 25)) + 128) >> 8) + 16));
                if (i10 % 2 == 0 && i9 % 2 == 0) {
                    int i19 = ((((i17 * R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) - (i18 * 94)) - (i15 * 18)) + 128) >> 8;
                    int i20 = (((((i17 * (-38)) - (i18 * 74)) + (i15 * R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)) + 128) >> 8) + 128;
                    int i21 = i7 + 1;
                    byteBufferAllocate.put(i7, (byte) Math.min(255, i19 + 128));
                    i7 += 2;
                    byteBufferAllocate.put(i21, (byte) Math.min(255, i20));
                }
                i9++;
                i11++;
                i8 = i16;
            }
        }
        return byteBufferAllocate;
    }

    public Bitmap e(C2938a c2938a) throws C2518a {
        int iH = c2938a.h();
        if (iH == -1) {
            return k((Bitmap) C2651i.l(c2938a.e()), c2938a.l(), c2938a.m(), c2938a.i());
        }
        if (iH == 17) {
            return g((ByteBuffer) C2651i.l(c2938a.f()), c2938a.m(), c2938a.i(), c2938a.l());
        }
        if (iH == 35) {
            return g(h((Image.Plane[]) C2651i.l(c2938a.k()), c2938a.m(), c2938a.i()), c2938a.m(), c2938a.i(), c2938a.l());
        }
        if (iH == 842094169) {
            return i((ByteBuffer) C2651i.l(c2938a.f()), c2938a.m(), c2938a.i(), c2938a.l());
        }
        throw new C2518a("Unsupported image format", 13);
    }

    public Bitmap g(ByteBuffer byteBuffer, int i7, int i8, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, C2518a, InvocationTargetException {
        byte[] bArrL = l(b(byteBuffer), i7, i8);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i9, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer h(Image.Plane[] planeArr, int i7, int i8) {
        int i9 = i7 * i8;
        int i10 = i9 / 4;
        byte[] bArr = new byte[i10 + i10 + i9];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i11 = (i9 + i9) / 4;
        boolean z7 = buffer2.remaining() == i11 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z7) {
            planeArr[0].getBuffer().get(bArr, 0, i9);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i9, 1);
            buffer3.get(bArr, i9 + 1, i11 - 1);
        } else {
            m(planeArr[0], i7, i8, bArr, 0, 1);
            m(planeArr[1], i7, i8, bArr, i9 + 1, 2);
            m(planeArr[2], i7, i8, bArr, i9, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
