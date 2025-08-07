package fb;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfb/n;", "", "", Text.type, "", "delimiters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "setText", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class SplitArguments {

    @NotNull
    private String text;

    @NotNull
    private final List<Object> delimiters;

    public SplitArguments(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, Text.type);
        Intrinsics.checkNotNullParameter(list, "delimiters");
        this.text = str;
        this.delimiters = list;
    }

    @NotNull
    public final List<Object> a() {
        return this.delimiters;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitArguments)) {
            return false;
        }
        SplitArguments splitArguments = (SplitArguments) other;
        return Intrinsics.b(this.text, splitArguments.text) && Intrinsics.b(this.delimiters, splitArguments.delimiters);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.delimiters.hashCode();
    }

    @NotNull
    public String toString() {
        return "SplitArguments(text=" + this.text + ", delimiters=" + this.delimiters + ")";
    }
}
