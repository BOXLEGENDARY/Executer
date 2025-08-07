package ha;

import android.net.Uri;
import com.roblox.client.personasdk.R;
import e.a;
import f.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LL8/H;", "", "", "Landroid/net/Uri;", "b", "()LL8/H;", "launchers_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0394q {
    @NotNull
    public static final C0376H<String[], Uri> b() {
        return new C0376H<>(new c(), new a() {
            public final void a(Object obj) {
                C0394q.c((Uri) obj);
            }
        });
    }

    public static final void c(Uri uri) {
        new C0396s().b(uri);
    }
}
