package ha;

import android.net.Uri;
import com.roblox.client.personasdk.R;
import ja.a;
import java.util.List;
import ka.B;
import ka.D;
import ka.h;
import ka.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0096A¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LL8/u;", "Lka/B;", "", "Landroid/net/Uri;", "<init>", "()V", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "", "b", "(Ljava/util/List;)Z", "e", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0398u implements B<List<? extends Uri>> {

    @NotNull
    private static final x<List<Uri>> i = D.b(0, 1, a.e, 1, (Object) null);
    private final x<List<Uri>> d = i;

    public Object a(@NotNull h<? super List<? extends Uri>> hVar, @NotNull Continuation<?> continuation) {
        return this.d.a(hVar, continuation);
    }

    public final boolean b(@NotNull List<Uri> uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return i.f(uri);
    }
}
