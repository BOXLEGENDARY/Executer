package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.workflow1.ui.A;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/j;", "", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/j$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/h;", "governmentIdCameraScreenViewFactory", "", "Lcom/squareup/workflow1/ui/A;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/h;)Ljava/util/Set;", "Lcom/squareup/moshi/h$e;", "Lcom/withpersona/sdk2/inquiry/network/MoshiJsonAdapter;", "a", "()Ljava/util/Set;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<h.e> a() {
            return L.c(AutoClassifyResponse.INSTANCE.a());
        }

        @NotNull
        public final Set<A<?>> b(@NotNull h governmentIdCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return L.f(new A[]{i.INSTANCE, governmentIdCameraScreenViewFactory, k.INSTANCE, n.INSTANCE, com.squareup.workflow1.ui.modal.a.INSTANCE, ScreenWithTransitionContainer.INSTANCE, w8.j.INSTANCE});
        }

        private Companion() {
        }
    }

    @NotNull
    public static final Set<h.e> a() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<A<?>> b(@NotNull h hVar) {
        return INSTANCE.b(hVar);
    }
}
