package i8;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\b*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006!"}, d2 = {"Li8/c;", "", "StackedT", "bottom", "", "rest", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "R", "Lkotlin/Function1;", "transform", "d", "(Lkotlin/jvm/functions/Function1;)Li8/c;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "frames", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "top", "backStack", "wf1-container-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0591c<StackedT> {

    @NotNull
    private final List<StackedT> frames;

    @NotNull
    private final StackedT top;

    @NotNull
    private final List<StackedT> backStack;

    public C0591c(@NotNull StackedT stackedt, @NotNull List<? extends StackedT> list) {
        Intrinsics.checkNotNullParameter(stackedt, "bottom");
        Intrinsics.checkNotNullParameter(list, "rest");
        List<StackedT> listE0 = CollectionsKt.e0(CollectionsKt.d(stackedt), list);
        this.frames = listE0;
        this.top = (StackedT) CollectionsKt.W(listE0);
        this.backStack = listE0.subList(0, listE0.size() - 1);
    }

    @NotNull
    public final List<StackedT> a() {
        return this.backStack;
    }

    @NotNull
    public final List<StackedT> b() {
        return this.frames;
    }

    @NotNull
    public final StackedT c() {
        return this.top;
    }

    @NotNull
    public final <R> C0591c<R> d(@NotNull Function1<? super StackedT, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        List<StackedT> list = this.frames;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return C0592d.a(arrayList);
    }

    public boolean equals(Object other) {
        C0591c c0591c = other instanceof C0591c ? (C0591c) other : null;
        return Intrinsics.b(c0591c != null ? c0591c.frames : null, this.frames);
    }

    public int hashCode() {
        return this.frames.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) C0591c.class.getSimpleName());
        sb.append('(');
        sb.append(this.frames);
        sb.append(')');
        return sb.toString();
    }
}
