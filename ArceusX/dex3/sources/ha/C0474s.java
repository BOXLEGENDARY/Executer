package ha;

import android.webkit.MimeTypeMap;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La9/s;", "La9/g;", "<init>", "()V", "", "path", "a", "(Ljava/lang/String;)Ljava/lang/String;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0474s implements InterfaceC0459g {
    @Override
    @NotNull
    public String a(@NotNull String path) {
        String mimeTypeFromExtension;
        Intrinsics.checkNotNullParameter(path, "path");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
        return (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) ? "image/*" : mimeTypeFromExtension;
    }
}
