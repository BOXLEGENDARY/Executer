package u5;

import P9.h;
import P9.i;
import X9.c;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.camera.core.n;
import com.roblox.client.personasdk.R;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/core/n;", "Ll8/y;", "e", "(Landroidx/camera/core/n;)Ll8/y;", "Landroid/media/Image;", "", "rotationDegrees", "d", "(Landroid/media/Image;I)Ll8/y;", "Landroid/graphics/Bitmap;", "c", "(Landroid/media/Image;I)Landroid/graphics/Bitmap;", "Ljava/nio/ByteBuffer;", "data", "Ll8/v;", "metadata", "a", "(Ljava/nio/ByteBuffer;Ll8/v;)Landroid/graphics/Bitmap;", "bitmap", "b", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "camera_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001c"}, d2 = {"l8/z$a", "Ll8/y;", "Landroid/media/Image;", "a", "Landroid/media/Image;", "l", "()Landroid/media/Image;", "image", "Lu5/a;", "b", "LP9/h;", "d", "()Lu5/a;", "inputImage", "Landroid/graphics/Bitmap;", "c", "e", "()Landroid/graphics/Bitmap;", "bitmap", "", "I", "getWidth", "()I", "width", "getHeight", "height", "f", "rotationDegrees", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements y {

        @NotNull
        private final Image image;

        @NotNull
        private final h inputImage;

        @NotNull
        private final h bitmap;

        private final int width;

        private final int height;

        private final int rotationDegrees;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0241a extends l implements Function0<Bitmap> {
            final Image d;
            final int e;

            C0241a(Image image, int i) {
                super(0);
                this.d = image;
                this.e = i;
            }

            public final Bitmap invoke() {
                return z.c(this.d, this.e);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu5/a;", "a", "()Lu5/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0242b extends l implements Function0<u5.a> {
            final Image d;
            final int e;

            C0242b(Image image, int i) {
                super(0);
                this.d = image;
                this.e = i;
            }

            @NotNull
            public final u5.a invoke() {
                u5.a aVarC = u5.a.c(this.d, this.e);
                Intrinsics.checkNotNullExpressionValue(aVarC, "fromMediaImage(...)");
                return aVarC;
            }
        }

        a(Image image, int i) {
            this.image = image;
            this.inputImage = i.b(new C0242b(image, i));
            this.bitmap = i.b(new C0241a(image, i));
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.rotationDegrees = i;
        }

        @Override
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }

        @Override
        @NotNull
        public u5.a d() {
            return (u5.a) this.inputImage.getValue();
        }

        @Override
        public Bitmap e() {
            return (Bitmap) this.bitmap.getValue();
        }

        @Override
        public int getHeight() {
            return this.height;
        }

        @Override
        public int getWidth() {
            return this.width;
        }

        @Override
        @NotNull
        public Image getImage() {
            return this.image;
        }
    }

    private static final Bitmap a(ByteBuffer byteBuffer, FrameMetadata frameMetadata) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, frameMetadata.getWidth(), frameMetadata.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, frameMetadata.getWidth(), frameMetadata.getHeight()), 80, byteArrayOutputStream);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                c.a(byteArrayOutputStream, (Throwable) null);
                Intrinsics.d(bitmapDecodeByteArray);
                return b(bitmapDecodeByteArray, frameMetadata.getRotation());
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static final Bitmap b(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (!Intrinsics.b(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static final Bitmap c(@NotNull Image image, int i) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        FrameMetadata frameMetadata = new FrameMetadata(image.getWidth(), image.getHeight(), i);
        C0619f c0619f = C0619f.a;
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        return a(c0619f.c(planes, image.getWidth(), image.getHeight()), frameMetadata);
    }

    @NotNull
    public static final y d(@NotNull Image image, int i) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new a(image, i);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public static final y e(@NotNull n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        try {
            Image imageL = nVar.l();
            if (imageL == null) {
                return null;
            }
            return d(imageL, nVar.D0().c());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
