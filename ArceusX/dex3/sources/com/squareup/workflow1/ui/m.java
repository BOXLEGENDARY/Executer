package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/squareup/workflow1/ui/m;", "", "W", "Lcom/squareup/workflow1/ui/g;", "wrapped", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "c", "Ljava/lang/String;", "getName", "d", "compatibilityKey", "wf1-core-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class m<W> implements InterfaceC0495g {

    @NotNull
    private final W wrapped;

    @NotNull
    private final String name;

    @NotNull
    private final String compatibilityKey;

    public m(@NotNull W w, @NotNull String str) {
        Intrinsics.checkNotNullParameter(w, "wrapped");
        Intrinsics.checkNotNullParameter(str, "name");
        this.wrapped = w;
        this.name = str;
        if (StringsKt.Y(str)) {
            throw new IllegalArgumentException("name must not be blank.");
        }
        this.compatibilityKey = InterfaceC0495g.INSTANCE.a(w, str);
    }

    @NotNull
    public final W a() {
        return this.wrapped;
    }

    @Override
    @NotNull
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return Intrinsics.b(this.wrapped, mVar.wrapped) && Intrinsics.b(this.name, mVar.name);
    }

    public int hashCode() {
        return (this.wrapped.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return super.toString() + ": " + getCompatibilityKey();
    }
}
