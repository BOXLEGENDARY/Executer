package fb;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfb/h;", "", "", Text.type, "regexPattern", "", "regexOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class MatchArguments {

    @NotNull
    private final String text;

    @NotNull
    private final String regexPattern;

    @NotNull
    private final List<Object> regexOptions;

    public MatchArguments(@NotNull String str, @NotNull String str2, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, Text.type);
        Intrinsics.checkNotNullParameter(str2, "regexPattern");
        Intrinsics.checkNotNullParameter(list, "regexOptions");
        this.text = str;
        this.regexPattern = str2;
        this.regexOptions = list;
    }

    @NotNull
    public final List<Object> a() {
        return this.regexOptions;
    }

    @NotNull
    public final String getRegexPattern() {
        return this.regexPattern;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchArguments)) {
            return false;
        }
        MatchArguments matchArguments = (MatchArguments) other;
        return Intrinsics.b(this.text, matchArguments.text) && Intrinsics.b(this.regexPattern, matchArguments.regexPattern) && Intrinsics.b(this.regexOptions, matchArguments.regexOptions);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.regexPattern.hashCode()) * 31) + this.regexOptions.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchArguments(text=" + this.text + ", regexPattern=" + this.regexPattern + ", regexOptions=" + this.regexOptions + ")";
    }
}
