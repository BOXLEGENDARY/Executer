package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/squareup/workflow1/ui/g;", "", "", "b", "()Ljava/lang/String;", "compatibilityKey", "a", "wf1-core-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public interface InterfaceC0495g {

    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/squareup/workflow1/ui/g$a;", "", "<init>", "()V", "value", "", "name", "a", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "wf1-core-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {
        static final Companion a = new Companion();

        private Companion() {
        }

        public static String b(Companion companion, Object obj, String str, int i, Object obj2) {
            if ((i & 2) != 0) {
                str = "";
            }
            return companion.a(obj, str);
        }

        @NotNull
        public final String a(@NotNull Object value, @NotNull String name) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(name, "name");
            InterfaceC0495g interfaceC0495g = value instanceof InterfaceC0495g ? (InterfaceC0495g) value : null;
            String strB = interfaceC0495g != null ? interfaceC0495g.b() : null;
            if (strB == null) {
                strB = value.getClass().getName();
            }
            return Intrinsics.m(strB, name.length() == 0 ? "" : Intrinsics.m("+", name));
        }
    }

    @NotNull
    String b();
}
