package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/squareup/workflow1/ui/w;", "Lcom/squareup/workflow1/ui/C;", "", "Lfa/c;", "Lcom/squareup/workflow1/ui/A;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([Lcom/squareup/workflow1/ui/A;)V", "", "RenderingT", "renderingType", "a", "(Lfa/c;)Lcom/squareup/workflow1/ui/A;", "b", "Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class w implements C {

    @NotNull
    private final Map<fa.c<?>, A<?>> bindings;

    private w(Map<fa.c<?>, ? extends A<?>> map) {
        this.bindings = map;
    }

    @Override
    public <RenderingT> A<RenderingT> a(@NotNull fa.c<? extends RenderingT> renderingType) {
        Intrinsics.checkNotNullParameter(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof A) {
            return (A) obj;
        }
        return null;
    }

    public w(@NotNull A<?>... aArr) {
        Intrinsics.checkNotNullParameter(aArr, "bindings");
        ArrayList arrayList = new ArrayList(aArr.length);
        int length = aArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            A<?> a = aArr[i2];
            i2++;
            arrayList.add(P9.t.a(a.getType(), a));
        }
        Map mapQ = kotlin.collections.F.q(arrayList);
        if (mapQ.keySet().size() == aArr.length) {
            this((Map<fa.c<?>, ? extends A<?>>) mapQ);
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(aArr.length);
        int length2 = aArr.length;
        while (i < length2) {
            A<?> a3 = aArr[i];
            i++;
            arrayList2.add(a3.getType());
        }
        sb.append(arrayList2);
        sb.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb.toString().toString());
    }
}
