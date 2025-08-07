package u5;

import android.media.Image;
import com.roblox.client.personasdk.R;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll8/f;", "", "<init>", "()V", "", "Landroid/media/Image$Plane;", "planes", "", "width", "height", "", "a", "([Landroid/media/Image$Plane;II)Z", "plane", "", "out", "offset", "pixelStride", "", "b", "(Landroid/media/Image$Plane;II[BII)V", "yuv420888planes", "Ljava/nio/ByteBuffer;", "c", "([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0619f {

    @NotNull
    public static final C0619f a = new C0619f();

    private C0619f() {
    }

    private final boolean a(Image.Plane[] planes, int width, int height) {
        int i = width * height;
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        boolean z = buffer2.remaining() == ((i * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        return z;
    }

    private final void b(Image.Plane plane, int width, int height, byte[] out, int offset, int pixelStride) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i = width / (height / iLimit);
        int rowStride = 0;
        for (int i2 = 0; i2 < iLimit; i2++) {
            int pixelStride2 = rowStride;
            for (int i3 = 0; i3 < i; i3++) {
                out[offset] = buffer.get(pixelStride2);
                offset += pixelStride;
                pixelStride2 += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    @NotNull
    public final ByteBuffer c(@NotNull Image.Plane[] yuv420888planes, int width, int height) {
        Intrinsics.checkNotNullParameter(yuv420888planes, "yuv420888planes");
        int i = width * height;
        byte[] bArr = new byte[((i / 4) * 2) + i];
        if (a(yuv420888planes, width, height)) {
            yuv420888planes[0].getBuffer().rewind();
            yuv420888planes[0].getBuffer().get(bArr, 0, i);
            ByteBuffer buffer = yuv420888planes[1].getBuffer();
            yuv420888planes[2].getBuffer().get(bArr, i, 1);
            buffer.get(bArr, i + 1, ((i * 2) / 4) - 1);
        } else {
            b(yuv420888planes[0], width, height, bArr, 0, 1);
            b(yuv420888planes[1], width, height, bArr, i + 1, 2);
            b(yuv420888planes[2], width, height, bArr, i, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }
}
