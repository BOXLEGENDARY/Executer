package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ4\u0010\r\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R'\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/squareup/workflow1/ui/y;", "", "", "Lcom/squareup/workflow1/ui/z;", "map", "<init>", "(Ljava/util/Map;)V", "T", "key", "a", "(Lcom/squareup/workflow1/ui/z;)Ljava/lang/Object;", "Lkotlin/Pair;", "pair", "c", "(Lkotlin/Pair;)Lcom/squareup/workflow1/ui/y;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class ViewEnvironment {

    @NotNull
    private final Map<ViewEnvironmentKey<?>, Object> map;

    public ViewEnvironment() {
        Map map = null;
        this(map, 1, map);
    }

    @NotNull
    public final <T> T a(@NotNull ViewEnvironmentKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.map.get(key);
        if (t == null) {
            t = null;
        }
        return t == null ? key.a() : t;
    }

    @NotNull
    public final Map<ViewEnvironmentKey<?>, Object> b() {
        return this.map;
    }

    @NotNull
    public final <T> ViewEnvironment c(@NotNull Pair<? extends ViewEnvironmentKey<T>, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        return new ViewEnvironment(kotlin.collections.F.n(this.map, pair));
    }

    public boolean equals(Object other) {
        ViewEnvironment viewEnvironment = other instanceof ViewEnvironment ? (ViewEnvironment) other : null;
        if (viewEnvironment == null) {
            return false;
        }
        return Intrinsics.b(viewEnvironment.b(), b());
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewEnvironment(" + this.map + ')';
    }

    public ViewEnvironment(@NotNull Map<ViewEnvironmentKey<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public ViewEnvironment(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.F.h() : map);
    }
}
