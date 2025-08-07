package com.squareup.workflow1.ui.modal;

import P9.m;
import aa.o;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.c;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.modal.ModalContainer;
import j8.C0597a;
import k8.AlertContainerScreen;
import k8.AlertScreen;
import k8.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/squareup/workflow1/ui/modal/a;", "Lcom/squareup/workflow1/ui/modal/ModalContainer;", "Lk8/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "dialogThemeResId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "Lk8/d$a;", "h", "(Lk8/d$a;)I", "initialModalRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "g", "(Lk8/d;Lcom/squareup/workflow1/ui/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "w", "I", "y", "a", "b", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class a extends ModalContainer<AlertScreen> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    private final int dialogThemeResId;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/modal/a$b;", "Lcom/squareup/workflow1/ui/A;", "Lk8/c;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lk8/c;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion implements A<AlertContainerScreen<?>> {
        private final C0071a a;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super AlertContainerScreen<?>> getType() {
            return this.a.getType();
        }

        private Companion() {
            this.a = new C0071a(0, 1, null);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public class c {
        public static final int[] a;

        static {
            int[] iArr = new int[AlertScreen.a.values().length];
            iArr[AlertScreen.a.POSITIVE.ordinal()] = 1;
            iArr[AlertScreen.a.NEGATIVE.ordinal()] = 2;
            iArr[AlertScreen.a.NEUTRAL.ordinal()] = 3;
            a = iArr;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    private final int h(AlertScreen.a aVar) throws m {
        int i = c.a[aVar.ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return -2;
        }
        if (i == 3) {
            return -3;
        }
        throw new m();
    }

    public static final void i(AlertScreen alertScreen, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(alertScreen, "$rendering");
        alertScreen.d().invoke(AlertScreen.b.C0237b.a);
    }

    public static final void j(AlertScreen alertScreen, AlertScreen.a aVar, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(alertScreen, "$rendering");
        Intrinsics.checkNotNullParameter(aVar, "$button");
        alertScreen.d().invoke(new AlertScreen.b.ButtonClicked(aVar));
    }

    @Override
    protected void d(@NotNull ModalContainer.a<AlertScreen> dialogRef) {
        Unit unit;
        Button buttonI;
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        androidx.appcompat.app.c cVarD = dialogRef.getDialog();
        final AlertScreen alertScreenF = dialogRef.f();
        int i = 0;
        if (alertScreenF.getCancelable()) {
            cVarD.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    com.squareup.workflow1.ui.modal.a.i(alertScreenF, dialogInterface);
                }
            });
            cVarD.setCancelable(true);
        } else {
            cVarD.setCancelable(false);
        }
        AlertScreen.a[] aVarArrValues = AlertScreen.a.values();
        int length = aVarArrValues.length;
        while (i < length) {
            final AlertScreen.a aVar = aVarArrValues[i];
            i++;
            String str = alertScreenF.a().get(aVar);
            if (str == null) {
                unit = null;
            } else {
                cVarD.l(h(aVar), str, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        com.squareup.workflow1.ui.modal.a.j(alertScreenF, aVar, dialogInterface, i2);
                    }
                });
                unit = Unit.a;
            }
            if (unit == null && (buttonI = cVarD.i(h(aVar))) != null) {
                buttonI.setVisibility(4);
            }
        }
        cVarD.m(alertScreenF.getMessage());
        cVarD.setTitle(alertScreenF.getTitle());
    }

    @Override
    @NotNull
    public ModalContainer.a<AlertScreen> b(@NotNull AlertScreen initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        androidx.appcompat.app.c cVarA = new c.a(getContext(), this.dialogThemeResId).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "Builder(context, dialogThemeResId)\n      .create()");
        ModalContainer.a<AlertScreen> aVar = new ModalContainer.a<>(initialModalRendering, initialViewEnvironment, cVarA, null, 8, null);
        d(aVar);
        return aVar;
    }

    public a(@NotNull Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogThemeResId = i3;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/squareup/workflow1/ui/modal/a$a;", "Lcom/squareup/workflow1/ui/A;", "Lk8/c;", "", "dialogThemeResId", "<init>", "(I)V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lk8/c;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "I", "Lfa/c;", "getType", "()Lfa/c;", "type", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    private static final class C0071a implements A<AlertContainerScreen<?>> {

        private final int dialogThemeResId;
        private final C0494f<AlertContainerScreen<?>> b;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lk8/c;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Lk8/c;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0072a extends l implements o<AlertContainerScreen<?>, ViewEnvironment, Context, ViewGroup, View> {
            final int d;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
            class C0073a extends j implements Function2<e<?, ? extends AlertScreen>, ViewEnvironment, Unit> {
                C0073a(Object obj) {
                    super(2, obj, a.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void f(@NotNull e<?, AlertScreen> eVar, @NotNull ViewEnvironment viewEnvironment) {
                    Intrinsics.checkNotNullParameter(eVar, "p0");
                    Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                    ((a) ((d) this).receiver).c(eVar, viewEnvironment);
                }

                public Object invoke(Object obj, Object obj2) {
                    f((e) obj, (ViewEnvironment) obj2);
                    return Unit.a;
                }
            }

            C0072a(int i) {
                super(4);
                this.d = i;
            }

            @NotNull
            public final View h(@NotNull AlertContainerScreen<?> alertContainerScreen, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(alertContainerScreen, "initialRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                a aVar = new a(context, null, 0, 0, this.d, 14, null);
                aVar.setId(C0597a.b);
                aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                E.a(aVar, alertContainerScreen, viewEnvironment, new C0073a(aVar));
                return aVar;
            }
        }

        public C0071a(int i) {
            this.dialogThemeResId = i;
            this.b = new C0494f<>(z.b(AlertContainerScreen.class), new C0072a(i));
        }

        @Override
        @NotNull
        public View a(@NotNull AlertContainerScreen<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.b.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super AlertContainerScreen<?>> getType() {
            return this.b.getType();
        }

        public C0071a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }
}
