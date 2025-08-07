package com.withpersona.sdk2.inquiry.selfie;

import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j;", "", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/f;", "selfieCameraScreenViewFactory", "", "Lcom/squareup/workflow1/ui/A;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/f;)Ljava/util/Set;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<A<?>> a(@NotNull f selfieCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return L.f(new A[]{h.INSTANCE, selfieCameraScreenViewFactory, m.INSTANCE, k.INSTANCE, l.INSTANCE});
        }

        private Companion() {
        }
    }

    @NotNull
    public static final Set<A<?>> a(@NotNull f fVar) {
        return INSTANCE.a(fVar);
    }
}
