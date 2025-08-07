package b9;

import androidx.lifecycle.E;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, d2 = {"Lb9/e;", "Lb9/a;", "Landroidx/lifecycle/E;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/E;)V", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "c", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "()Ljava/util/ArrayList;", "Landroidx/lifecycle/E;", "b", "Ljava/util/ArrayList;", "collectedData", "", "Z", "()Z", "isActive", "d", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements InterfaceC0482a {

    @NotNull
    private final E savedStateHandle;

    @NotNull
    private final ArrayList<StepData> collectedData;

    private final boolean isActive;

    public e(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "savedStateHandle");
        this.savedStateHandle = e;
        ArrayList<StepData> arrayList = (ArrayList) e.e("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.collectedData = arrayList == null ? new ArrayList<>() : arrayList;
        this.isActive = true;
    }

    @NotNull
    public ArrayList<StepData> a() {
        return new ArrayList<>(this.collectedData);
    }

    @Override
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public void c(@NotNull StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
        this.collectedData.add(stepData);
        this.savedStateHandle.m("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData", this.collectedData);
    }
}
