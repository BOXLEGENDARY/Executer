package ha;

import android.view.Window;
import com.roblox.client.personasdk.R;
import d9.InterfaceC0550a;
import d9.b;
import d9.c;
import d9.e;
import d9.g;
import d9.j;
import f9.C0575b;
import f9.InterfaceC0574a;
import i9.C0594a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, d2 = {"La9/x;", "", "", "controlNavigationBar", "controlStatusBar", "<init>", "(ZZ)V", "Ld9/j;", "appSetIDHelper", "Ld9/c;", "a", "(Ld9/j;)Ld9/c;", "Ld9/g;", "deviceInfoProvider", "Ld9/b;", "c", "(Ld9/g;)Ld9/b;", "Ld9/e;", "deviceIdProvider", "Ld9/a;", "b", "(Ld9/e;)Ld9/a;", "Lf9/b;", "imageHelper", "Lf9/a;", "e", "(Lf9/b;)Lf9/a;", "La9/s;", "fileHelper", "La9/g;", "d", "(La9/s;)La9/g;", "Landroid/view/Window;", "window", "Li9/a;", "f", "(Landroid/view/Window;)Li9/a;", "Z", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0479x {

    private final boolean controlNavigationBar;

    private final boolean controlStatusBar;

    public C0479x() {
        boolean z = false;
        this(z, z, 3, null);
    }

    @NotNull
    public final c a(@NotNull j appSetIDHelper) {
        Intrinsics.checkNotNullParameter(appSetIDHelper, "appSetIDHelper");
        return appSetIDHelper;
    }

    @NotNull
    public final InterfaceC0550a b(@NotNull e deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        return deviceIdProvider;
    }

    @NotNull
    public final b c(@NotNull g deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        return deviceInfoProvider;
    }

    @NotNull
    public final InterfaceC0459g d(@NotNull C0474s fileHelper) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        return fileHelper;
    }

    @NotNull
    public final InterfaceC0574a e(@NotNull C0575b imageHelper) {
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        return imageHelper;
    }

    @NotNull
    public final C0594a f(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return new C0594a(window, this.controlNavigationBar, this.controlStatusBar);
    }

    public C0479x(boolean z, boolean z2) {
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }

    public C0479x(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
