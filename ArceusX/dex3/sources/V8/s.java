package V8;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V", "selfie_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class s {
    public static final void a(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        Iterator<T> it = selfieState.o().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }
}
