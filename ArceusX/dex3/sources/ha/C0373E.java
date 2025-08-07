package ha;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.roblox.client.personasdk.R;
import e.a;
import f.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LL8/H;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "b", "()LL8/H;", "launchers_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0373E {
    @NotNull
    public static final C0376H<IntentSenderRequest, ActivityResult> b() {
        return new C0376H<>(new l(), new a() {
            public final void a(Object obj) {
                C0373E.c((ActivityResult) obj);
            }
        });
    }

    public static final void c(ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "success");
        new C0375G().b(activityResult);
    }
}
