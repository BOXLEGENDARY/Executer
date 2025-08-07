package I4;

import android.graphics.Bitmap;
import com.google.android.renderscript.Range2d;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "function", "Landroid/graphics/Bitmap;", "inputBitmap", "", "alphaAllowed", "", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "a", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "tag", "bitmap", "Lcom/google/android/renderscript/Range2d;", "restriction", "e", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V", "", "sizeX", "sizeY", "d", "(Ljava/lang/String;IILcom/google/android/renderscript/Range2d;)V", "f", "(Landroid/graphics/Bitmap;)I", "renderscript-toolkit_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0026a {
        public static final int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final Bitmap a(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "inputBitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final void b(@NotNull String str, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(str, "function");
        Intrinsics.checkNotNullParameter(bitmap, "inputBitmap");
        if (z) {
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                throw new IllegalArgumentException(("RenderScript Toolkit. " + str + " supports only ARGB_8888 and ALPHA_8 bitmaps. " + bitmap.getConfig() + " provided.").toString());
            }
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("RenderScript Toolkit. " + str + " supports only ARGB_8888. " + bitmap.getConfig() + " provided.").toString());
        }
        if (bitmap.getWidth() * f(bitmap) == bitmap.getRowBytes()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + str + ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + bitmap.getRowBytes() + ", width={" + bitmap.getWidth() + ", and vectorSize=" + f(bitmap) + ".").toString());
    }

    public static void c(String str, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        b(str, bitmap, z);
    }

    public static final void d(@NotNull String str, int i, int i2, Range2d range2d) {
        Intrinsics.checkNotNullParameter(str, "tag");
    }

    public static final void e(@NotNull String str, @NotNull Bitmap bitmap, Range2d range2d) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        d(str, bitmap.getWidth(), bitmap.getHeight(), range2d);
    }

    public static final int f(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap.Config config = bitmap.getConfig();
        int i = config == null ? -1 : C0026a.a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
