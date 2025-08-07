package wa;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwa/q;", "Output", "", "", "Lwa/o;", "operations", "followedBy", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class q<Output> {

    @NotNull
    private final List<o<Output>> operations;

    @NotNull
    private final List<q<Output>> followedBy;

    public q(@NotNull List<? extends o<? super Output>> list, @NotNull List<? extends q<? super Output>> list2) {
        Intrinsics.checkNotNullParameter(list, "operations");
        Intrinsics.checkNotNullParameter(list2, "followedBy");
        this.operations = list;
        this.followedBy = list2;
    }

    @NotNull
    public final List<q<Output>> a() {
        return this.followedBy;
    }

    @NotNull
    public final List<o<Output>> b() {
        return this.operations;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.U(this.operations, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + '(' + CollectionsKt.U(this.followedBy, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ')';
    }
}
