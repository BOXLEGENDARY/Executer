package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/e;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "b", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;Lcom/squareup/workflow1/ui/y;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "c", "a", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements com.squareup.workflow1.ui.j<InquiryWorkflow.c.a> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final View view;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/e$a;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<InquiryWorkflow.c.a> {
        private final A<InquiryWorkflow.c.a> a;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        class C0131a extends kotlin.jvm.internal.j implements Function1<View, e> {
            public static final C0131a d = new C0131a();

            C0131a() {
                super(1, e.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @NotNull
            public final e invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "p0");
                return new e(view);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull InquiryWorkflow.c.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super InquiryWorkflow.c.a> getType() {
            return this.a.getType();
        }

        private Companion() {
            j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
            this.a = new com.squareup.workflow1.ui.l(z.b(InquiryWorkflow.c.a.class), ha.z.c, C0131a.d);
        }
    }

    public e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override
    public void a(@NotNull InquiryWorkflow.c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
    }
}
