package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "me", "you", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "wf1-core-common"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0496h {
    public static final boolean a(@NotNull Object obj, @NotNull Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "me");
        Intrinsics.checkNotNullParameter(obj2, "you");
        if (!Intrinsics.b(kotlin.jvm.internal.z.b(obj.getClass()), kotlin.jvm.internal.z.b(obj2.getClass()))) {
            return false;
        }
        if (obj instanceof InterfaceC0495g) {
            return Intrinsics.b(((InterfaceC0495g) obj).getName(), ((InterfaceC0495g) obj2).getName());
        }
        return true;
    }
}
