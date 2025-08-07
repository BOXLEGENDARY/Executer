package u5;

import android.graphics.Bitmap;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Ll8/J;", "", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "c", "Ll8/J$a;", "Ll8/J$b;", "Ll8/J$c;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class J {

    @NotNull
    private final Bitmap bitmap;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll8/J$a;", "Ll8/J;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends J {
        public a(@NotNull Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll8/J$b;", "Ll8/J;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b extends J {
        public b(@NotNull Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll8/J$c;", "Ll8/J;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c extends J {
        public c(@NotNull Bitmap bitmap) {
            super(bitmap, null);
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }
    }

    public J(Bitmap bitmap, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap);
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    private J(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
