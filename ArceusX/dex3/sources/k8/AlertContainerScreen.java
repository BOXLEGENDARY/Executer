package k8;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk8/c;", "", "B", "Lk8/e;", "Lk8/d;", "beneathModals", "", "modals", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "()Ljava/util/List;", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class AlertContainerScreen<B> implements e<B, AlertScreen> {

    @NotNull
    private final B beneathModals;

    @NotNull
    private final List<AlertScreen> modals;

    public AlertContainerScreen(@NotNull B b, @NotNull List<AlertScreen> list) {
        Intrinsics.checkNotNullParameter(b, "beneathModals");
        Intrinsics.checkNotNullParameter(list, "modals");
        this.beneathModals = b;
        this.modals = list;
    }

    @Override
    @NotNull
    public B a() {
        return this.beneathModals;
    }

    @Override
    @NotNull
    public List<AlertScreen> c() {
        return this.modals;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) other;
        return Intrinsics.b(a(), alertContainerScreen.a()) && Intrinsics.b(c(), alertContainerScreen.c());
    }

    public int hashCode() {
        return (a().hashCode() * 31) + c().hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertContainerScreen(beneathModals=" + a() + ", modals=" + c() + ')';
    }

    public AlertContainerScreen(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? CollectionsKt.j() : list);
    }
}
