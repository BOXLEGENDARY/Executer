package b9;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lb9/d;", "Lb9/a;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "c", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "", "a", "Z", "b", "()Z", "isActive", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d implements InterfaceC0482a {

    private final boolean isActive;

    @Override
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public void c(@NotNull StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
    }
}
