package ha;

import android.net.Uri;
import com.roblox.client.personasdk.R;
import e.c;
import e.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"LL8/g;", "", "Le/c;", "Landroid/net/Uri;", "pictureLaunchResultLauncher", "", "", "openDocumentsResultLauncher", "Le/g;", "selectFromPhotoLibraryLauncher", "<init>", "(Le/c;Le/c;Le/c;)V", "c", "()Le/c;", "a", "b", "Le/c;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0384g {

    @NotNull
    private final c<Uri> pictureLaunchResultLauncher;

    @NotNull
    private final c<String[]> openDocumentsResultLauncher;

    @NotNull
    private final c<g> selectFromPhotoLibraryLauncher;

    public C0384g(@NotNull c<Uri> cVar, @NotNull c<String[]> cVar2, @NotNull c<g> cVar3) {
        Intrinsics.checkNotNullParameter(cVar, "pictureLaunchResultLauncher");
        Intrinsics.checkNotNullParameter(cVar2, "openDocumentsResultLauncher");
        Intrinsics.checkNotNullParameter(cVar3, "selectFromPhotoLibraryLauncher");
        this.pictureLaunchResultLauncher = cVar;
        this.openDocumentsResultLauncher = cVar2;
        this.selectFromPhotoLibraryLauncher = cVar3;
    }

    @NotNull
    public final c<String[]> a() {
        return this.openDocumentsResultLauncher;
    }

    @NotNull
    public final c<g> b() {
        return this.selectFromPhotoLibraryLauncher;
    }

    @NotNull
    public final c<Uri> c() {
        return this.pictureLaunchResultLauncher;
    }
}
