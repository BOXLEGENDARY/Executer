package v8;

import android.content.Context;
import android.graphics.Bitmap;
import com.roblox.client.personasdk.R;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(Landroid/graphics/Bitmap;Landroid/content/Context;)Ljava/io/File;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0848p {
    @NotNull
    public static final File a(@NotNull Bitmap bitmap, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getCacheDir(), "persona_government_id_" + System.currentTimeMillis() + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            X9.c.a(fileOutputStream, (Throwable) null);
            return file;
        } finally {
        }
    }
}
