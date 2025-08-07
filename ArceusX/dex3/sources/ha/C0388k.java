package ha;

import android.net.Uri;
import com.roblox.client.personasdk.R;
import e.a;
import e.g;
import f.d;
import f.f;
import f.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001f\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u0000¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"LL8/H;", "Landroid/net/Uri;", "", "h", "()LL8/H;", "", "", "", "d", "Le/g;", "f", "launchers_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0388k {
    @NotNull
    public static final C0376H<String[], List<Uri>> d() {
        return new C0376H<>(new d(), new a() {
            public final void a(Object obj) {
                C0388k.e((List) obj);
            }
        });
    }

    public static final void e(List list) {
        Intrinsics.checkNotNullParameter(list, "uriList");
        new C0398u().b(list);
    }

    @NotNull
    public static final C0376H<g, List<Uri>> f() {
        return new C0376H<>(new f(0, 1, (DefaultConstructorMarker) null), new a() {
            public final void a(Object obj) {
                C0388k.g((List) obj);
            }
        });
    }

    public static final void g(List list) {
        Intrinsics.checkNotNullParameter(list, "uriList");
        new C0398u().b(list);
    }

    @NotNull
    public static final C0376H<Uri, Boolean> h() {
        return new C0376H<>(new m(), new a() {
            public final void a(Object obj) {
                C0388k.i(((Boolean) obj).booleanValue());
            }
        });
    }

    public static final void i(boolean z) {
        new C0369A().b(z);
    }
}
