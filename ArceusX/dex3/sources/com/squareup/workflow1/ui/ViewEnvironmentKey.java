package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/z;", "", "T", "Lfa/c;", "type", "<init>", "(Lfa/c;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lfa/c;", "()Ljava/lang/Object;", "default", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public abstract class ViewEnvironmentKey<T> {

    @NotNull
    private final fa.c<T> type;

    public ViewEnvironmentKey(@NotNull fa.c<T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "type");
        this.type = cVar;
    }

    @NotNull
    public abstract T a();

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && !Intrinsics.b(kotlin.jvm.internal.z.b(getClass()), kotlin.jvm.internal.z.b(other.getClass()))) {
            return false;
        }
        fa.c<T> cVar = this.type;
        if (other != null) {
            return Intrinsics.b(cVar, ((ViewEnvironmentKey) other).type);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.ViewEnvironmentKey<*>");
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewEnvironmentKey(" + this.type + ")-" + super.toString();
    }
}
