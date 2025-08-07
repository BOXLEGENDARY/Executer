package M8;

import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.InterfaceC0495g;
import i8.C0591c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u00020\u0006B-\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\u001a\u0010\u001a\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001b"}, d2 = {"LM8/i;", "", "B", "T", "Lk8/e;", "Li8/c;", "Lcom/squareup/workflow1/ui/g;", "baseScreen", "", "modals", "", "compatibilityKey", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "b", "Ljava/lang/Object;", "getBaseScreen", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "a", "beneathModals", "modal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i<B, T> implements k8.e<B, C0591c<T>>, InterfaceC0495g {

    @NotNull
    private final B baseScreen;

    @NotNull
    private final List<C0591c<T>> modals;

    @NotNull
    private final String compatibilityKey;

    @NotNull
    private final B beneathModals;

    public i(@NotNull B b, @NotNull List<C0591c<T>> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(b, "baseScreen");
        Intrinsics.checkNotNullParameter(list, "modals");
        Intrinsics.checkNotNullParameter(str, "compatibilityKey");
        this.baseScreen = b;
        this.modals = list;
        this.compatibilityKey = str;
        this.beneathModals = b;
    }

    @Override
    @NotNull
    public B a() {
        return this.beneathModals;
    }

    @Override
    @NotNull
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    @Override
    @NotNull
    public List<C0591c<T>> c() {
        return this.modals;
    }
}
