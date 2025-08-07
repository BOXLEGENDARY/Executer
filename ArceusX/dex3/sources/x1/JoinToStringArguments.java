package x1;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lx1/d;", "", "", "elementsToJoin", "", "separator", "prefix", "postfix", "", "limit", "truncated", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "d", "I", "f", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
final class JoinToStringArguments {

    @NotNull
    private final List<Object> elementsToJoin;

    @NotNull
    private final String separator;

    @NotNull
    private final String prefix;

    @NotNull
    private final String postfix;

    private final int limit;

    @NotNull
    private final String truncated;

    public JoinToStringArguments(@NotNull List<? extends Object> list, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "elementsToJoin");
        Intrinsics.checkNotNullParameter(str, "separator");
        Intrinsics.checkNotNullParameter(str2, "prefix");
        Intrinsics.checkNotNullParameter(str3, "postfix");
        Intrinsics.checkNotNullParameter(str4, "truncated");
        this.elementsToJoin = list;
        this.separator = str;
        this.prefix = str2;
        this.postfix = str3;
        this.limit = i;
        this.truncated = str4;
    }

    @NotNull
    public final List<Object> a() {
        return this.elementsToJoin;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getPostfix() {
        return this.postfix;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final String getSeparator() {
        return this.separator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinToStringArguments)) {
            return false;
        }
        JoinToStringArguments joinToStringArguments = (JoinToStringArguments) other;
        return Intrinsics.b(this.elementsToJoin, joinToStringArguments.elementsToJoin) && Intrinsics.b(this.separator, joinToStringArguments.separator) && Intrinsics.b(this.prefix, joinToStringArguments.prefix) && Intrinsics.b(this.postfix, joinToStringArguments.postfix) && this.limit == joinToStringArguments.limit && Intrinsics.b(this.truncated, joinToStringArguments.truncated);
    }

    @NotNull
    public final String getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        return (((((((((this.elementsToJoin.hashCode() * 31) + this.separator.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.postfix.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.truncated.hashCode();
    }

    @NotNull
    public String toString() {
        return "JoinToStringArguments(elementsToJoin=" + this.elementsToJoin + ", separator=" + this.separator + ", prefix=" + this.prefix + ", postfix=" + this.postfix + ", limit=" + this.limit + ", truncated=" + this.truncated + ")";
    }
}
