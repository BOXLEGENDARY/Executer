package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J1\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/workflow1/ui/C;", "", "RenderingT", "Lfa/c;", "renderingType", "Lcom/squareup/workflow1/ui/A;", "a", "(Lfa/c;)Lcom/squareup/workflow1/ui/A;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public interface C {

    @NotNull
    public static final Companion INSTANCE = Companion.b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/squareup/workflow1/ui/C$a;", "Lcom/squareup/workflow1/ui/z;", "Lcom/squareup/workflow1/ui/C;", "<init>", "()V", "b", "()Lcom/squareup/workflow1/ui/C;", "default", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion extends ViewEnvironmentKey<C> {
        static final Companion b = new Companion();

        private Companion() {
            super(kotlin.jvm.internal.z.b(C.class));
        }

        @Override
        @NotNull
        public C a() {
            return D.a();
        }
    }

    <RenderingT> A<RenderingT> a(@NotNull fa.c<? extends RenderingT> renderingType);
}
