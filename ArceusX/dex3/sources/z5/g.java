package z5;

import P9.o;
import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ImageLightCondition;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.y;
import z5.a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001a\u0010'\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lm8/g;", "Lm8/d;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "", "imageWidth", "imageHeight", "Landroid/graphics/Rect;", "region", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "b", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;", "averageLuma", "", "e", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D", "", "histogram", "sampleSize", "lowerPercentile", "higherPercentile", "c", "([JIDD)I", "Ll8/y;", "image", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "[B", "byteArr", "Landroid/util/Size;", "Landroid/util/Size;", "getPreferredImageSize", "()Landroid/util/Size;", "preferredImageSize", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g implements d {

    @NotNull
    private final byte[] byteArr = new byte[32768];

    @NotNull
    private final Size preferredImageSize = new Size(0, 0);

    private final ImageLightCondition b(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        if (imageWidth == 0 || imageHeight == 0) {
            return null;
        }
        long[] jArr = new long[256];
        yPlaneBuffer.rewind();
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        if (iWidth2 > 32768) {
            return null;
        }
        int i = region.bottom;
        long j = 0;
        for (int i2 = region.top; i2 < i; i2++) {
            yPlaneBuffer.position((i2 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i3 = 0; i3 < iWidth2; i3++) {
                int i4 = this.byteArr[i3] & 255;
                j += i4;
                jArr[i4] = jArr[i4] + 1;
            }
        }
        double d = j / iWidth;
        return new ImageLightCondition(d / 255.0d, e(yPlaneBuffer, imageWidth, (int) d, region), d(this, jArr, iWidth, 0.0d, 0.0d, 12, null) / 255.0d, iWidth);
    }

    private final int c(long[] histogram, int sampleSize, double lowerPercentile, double higherPercentile) {
        double d = 100;
        double d2 = sampleSize;
        double dFloor = Math.floor((lowerPercentile / d) * d2);
        double dFloor2 = Math.floor((higherPercentile / d) * d2);
        int length = histogram.length;
        int i = 0;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = 0;
                break;
            }
            j2 += histogram[i2];
            if (j2 > dFloor) {
                break;
            }
            i2++;
        }
        double d3 = d2 - dFloor2;
        int length2 = histogram.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                j += histogram[length2];
                if (j > d3) {
                    i = length2;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length2 = i3;
            }
        }
        return i - i2;
    }

    static int d(g gVar, long[] jArr, int i, double d, double d2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            d = 1.0d;
        }
        double d3 = d;
        if ((i2 & 8) != 0) {
            d2 = 99.0d;
        }
        return gVar.c(jArr, i, d3, d2);
    }

    private final double e(ByteBuffer yPlaneBuffer, int imageWidth, int averageLuma, Rect region) {
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        int i = region.bottom;
        long j = 0;
        for (int i2 = region.top; i2 < i; i2++) {
            yPlaneBuffer.position((i2 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i3 = 0; i3 < iWidth2; i3++) {
                int i4 = (this.byteArr[i3] & 255) - averageLuma;
                j += i4 * i4;
            }
        }
        return Math.sqrt(j / iWidth) / 128.0d;
    }

    @Override
    public Object a(@NotNull y yVar, Rect rect, @NotNull Continuation<? super o<? extends a>> continuation) {
        int width = yVar.getImage().getWidth();
        int height = yVar.getImage().getHeight();
        Image.Plane[] planes = yVar.getImage().getPlanes();
        Image.Plane plane = planes != null ? planes[0] : null;
        if (plane == null) {
            o.a aVar = o.e;
            return o.b(a.b.a);
        }
        if (rect == null) {
            rect = new Rect(0, 0, width, height);
        }
        ByteBuffer buffer = plane.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ImageLightCondition imageLightConditionB = b(buffer, width, height, rect);
        if (imageLightConditionB == null) {
            o.a aVar2 = o.e;
            return o.b(a.b.a);
        }
        o.a aVar3 = o.e;
        return o.b(new a.e(imageLightConditionB));
    }
}
