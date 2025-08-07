package ha;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL8/H;", "LL8/a;", "", "b", "()LL8/H;", "launchers_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0381d {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"L8/d$a", "Lf/a;", "LL8/a;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;LL8/a;)Landroid/content/Intent;", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Integer;", "launchers_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends f.a<C0378a, Integer> {
        a() {
        }

        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull C0378a input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intent = input.getIntent().a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            intent.setData(Uri.parse(input.getUrl()));
            return intent;
        }

        @NotNull
        public Integer parseResult(int resultCode, Intent intent) {
            return Integer.valueOf(resultCode);
        }
    }

    @NotNull
    public static final C0376H<C0378a, Integer> b() {
        return new C0376H<>(new a(), new e.a() {
            public final void a(Object obj) {
                C0381d.c(((Integer) obj).intValue());
            }
        });
    }

    public static final void c(int i) {
        new C0383f().b(i);
    }
}
