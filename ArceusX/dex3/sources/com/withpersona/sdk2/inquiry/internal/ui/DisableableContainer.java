package com.withpersona.sdk2.inquiry.internal.ui;

import G8.a;
import K8.b;
import aa.o;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.D;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.F;
import com.squareup.workflow1.ui.G;
import com.squareup.workflow1.ui.H;
import com.squareup.workflow1.ui.InterfaceC0495g;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.backstack.ViewStateCache;
import com.squareup.workflow1.ui.m;
import com.withpersona.sdk2.inquiry.internal.ui.DisableableContainer;
import fa.c;
import h8.C0584b;
import h8.InterfaceC0585c;
import ha.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)*B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LK8/b;", "newRendering", "Lcom/squareup/workflow1/ui/y;", "newViewEnvironment", "Landroid/view/View;", "b", "(LK8/b;Lcom/squareup/workflow1/ui/y;)Landroid/view/View;", "", "d", "(LK8/b;Lcom/squareup/workflow1/ui/y;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "LG8/a;", "LG8/a;", "binding", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "e", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "getCurrentView", "()Landroid/view/View;", "currentView", "i", "a", "SavedState", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DisableableContainer extends FrameLayout {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final a binding;

    @NotNull
    private final ViewStateCache viewStateCache;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$a;", "Lcom/squareup/workflow1/ui/A;", "LK8/b;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(LK8/b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<b> {
        private final C0494f<b> a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LK8/b;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(LK8/b;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0139a extends l implements o<b, ViewEnvironment, Context, ViewGroup, View> {
            public static final C0139a d = new C0139a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            class C0140a extends j implements Function2<b, ViewEnvironment, Unit> {
                C0140a(Object obj) {
                    super(2, obj, DisableableContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void f(@NotNull b bVar, @NotNull ViewEnvironment viewEnvironment) {
                    Intrinsics.checkNotNullParameter(bVar, "p0");
                    Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                    ((DisableableContainer) ((d) this).receiver).d(bVar, viewEnvironment);
                }

                public Object invoke(Object obj, Object obj2) {
                    f((b) obj, (ViewEnvironment) obj2);
                    return Unit.a;
                }
            }

            C0139a() {
                super(4);
            }

            @NotNull
            public final View h(@NotNull b bVar, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(bVar, "initialRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                DisableableContainer disableableContainer = new DisableableContainer(context, null, 0, 0, 14, null);
                disableableContainer.setId(y.d);
                disableableContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                E.a(disableableContainer, bVar, viewEnvironment, new C0140a(disableableContainer));
                return disableableContainer;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull b initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public c<? super b> getType() {
            return this.a.getType();
        }

        private Companion() {
            this.a = new C0494f<>(z.b(b.class), C0139a.d);
        }
    }

    public DisableableContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final View b(b newRendering, ViewEnvironment newViewEnvironment) {
        InterfaceC0585c interfaceC0585cC;
        m mVar = new m(newRendering.getScreen(), "disableable_container");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = E.b(currentView, mVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(CollectionsKt.d(mVar));
                E.g(view, mVar, newViewEnvironment);
                return view;
            }
        }
        C c = (C) newViewEnvironment.a(C.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewC = D.c(c, mVar, newViewEnvironment, context, this, new F() {
            @Override
            public final void a(View view2, Function0 function0) {
                DisableableContainer.c(view2, function0);
            }
        });
        E.h(viewC);
        this.viewStateCache.h(CollectionsKt.j(), currentView, viewC);
        this.binding.c.removeView(currentView);
        this.binding.c.addView(viewC);
        if (currentView != null && (interfaceC0585cC = InterfaceC0585c.INSTANCE.c(currentView)) != null) {
            interfaceC0585cC.P();
        }
        return viewC;
    }

    public static final void c(View view, Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(function0, "doStart");
        InterfaceC0585c.Companion.e(InterfaceC0585c.INSTANCE, view, null, 2, null);
        function0.invoke();
    }

    private final View getCurrentView() {
        if (this.binding.c.getChildCount() > 0) {
            return this.binding.c.getChildAt(0);
        }
        return null;
    }

    public final void d(@NotNull b newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        View viewB = b(newRendering, newViewEnvironment);
        setEnabled(newRendering.getIsEnabled());
        if (isEnabled()) {
            viewB.setAlpha(1.0f);
            this.binding.b.setVisibility(8);
        } else {
            viewB.setAlpha(0.5f);
            this.binding.b.setVisibility(0);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.d dVarC = C0584b.a.c(this);
        InterfaceC0495g.Companion companion = InterfaceC0495g.INSTANCE;
        G<?> gD = H.d(this);
        Object objC = gD == null ? null : gD.c();
        if (objC == null) {
            objC = null;
        }
        Intrinsics.d(objC);
        this.viewStateCache.a(InterfaceC0495g.Companion.b(companion, objC, null, 2, null), dVarC);
    }

    @Override
    protected void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override
    protected void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.viewStateCache.f(savedState.getSavedViewState());
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new SavedState(parcelableOnSaveInstanceState, this.viewStateCache.g());
        }
        return null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "a", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "CREATOR", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ViewStateCache.Saved savedViewState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableContainer$SavedState;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override
            @NotNull
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            @Override
            @NotNull
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            private Companion() {
            }
        }

        public SavedState(@NotNull Parcelable parcelable, @NotNull ViewStateCache.Saved saved) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(parcelable, "superState");
            Intrinsics.checkNotNullParameter(saved, "savedViewState");
            this.savedViewState = saved;
        }

        @NotNull
        public final ViewStateCache.Saved getSavedViewState() {
            return this.savedViewState;
        }

        @Override
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        public SavedState(@NotNull Parcel parcel) {
            super(parcel);
            Intrinsics.checkNotNullParameter(parcel, "source");
            Parcelable parcelable = parcel.readParcelable(ViewStateCache.Saved.class.getClassLoader());
            Intrinsics.d(parcelable);
            this.savedViewState = (ViewStateCache.Saved) parcelable;
        }
    }

    public DisableableContainer(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVarC = a.c(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        this.binding = aVarC;
        this.viewStateCache = new ViewStateCache();
    }
}
