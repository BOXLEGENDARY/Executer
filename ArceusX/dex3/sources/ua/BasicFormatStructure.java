package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lua/e;", "T", "Lua/s;", "Lua/l;", "directive", "<init>", "(Lua/l;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Lua/l;", "c", "()Lua/l;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class BasicFormatStructure<T> implements s<T> {

    @NotNull
    private final l<T> directive;

    public BasicFormatStructure(@NotNull l<? super T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "directive");
        this.directive = lVar;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        return this.directive.a();
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        return this.directive.b();
    }

    @NotNull
    public final l<T> c() {
        return this.directive;
    }

    public boolean equals(Object other) {
        return (other instanceof BasicFormatStructure) && Intrinsics.b(this.directive, ((BasicFormatStructure) other).directive);
    }

    public int hashCode() {
        return this.directive.hashCode();
    }

    @NotNull
    public String toString() {
        return "BasicFormatStructure(" + this.directive + ')';
    }
}
