package com.withpersona.sdk2.inquiry.shared.ui;

import P9.t;
import aa.o;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.transition.n;
import androidx.transition.p;
import androidx.transition.q;
import androidx.transition.x;
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
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import fa.c;
import h8.C0584b;
import h8.InterfaceC0585c;
import ha.C0470o;
import i8.EnumC0589a;
import j8.C0597a;
import j9.C0606i;
import j9.EnumC0605h;
import kotlin.Metadata;
import kotlin.Pair;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 -2\u00020\u0001:\u0002./B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lj9/i;", "newRendering", "Lcom/squareup/workflow1/ui/y;", "newViewEnvironment", "", "c", "(Lj9/i;Lcom/squareup/workflow1/ui/y;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "Lj9/h;", "transition", "b", "(Landroid/view/View;Landroid/view/View;Lj9/h;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "d", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "Lcom/squareup/workflow1/ui/m;", "e", "Lcom/squareup/workflow1/ui/m;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "i", "a", "SavedState", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public class ScreenWithTransitionContainer extends FrameLayout {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ViewStateCache viewStateCache;

    private m<?> currentRendering;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;", "Lcom/squareup/workflow1/ui/A;", "Lj9/i;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lj9/i;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<C0606i> {
        private final C0494f<C0606i> a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lj9/i;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Lj9/i;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0179a extends l implements o<C0606i, ViewEnvironment, Context, ViewGroup, View> {
            public static final C0179a d = new C0179a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            class C0180a extends j implements Function2<C0606i, ViewEnvironment, Unit> {
                C0180a(Object obj) {
                    super(2, obj, ScreenWithTransitionContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void f(@NotNull C0606i c0606i, @NotNull ViewEnvironment viewEnvironment) throws P9.m {
                    Intrinsics.checkNotNullParameter(c0606i, "p0");
                    Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                    ((ScreenWithTransitionContainer) ((d) this).receiver).c(c0606i, viewEnvironment);
                }

                public Object invoke(Object obj, Object obj2) throws P9.m {
                    f((C0606i) obj, (ViewEnvironment) obj2);
                    return Unit.a;
                }
            }

            C0179a() {
                super(4);
            }

            @NotNull
            public final View h(@NotNull C0606i c0606i, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(c0606i, "initialRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenWithTransitionContainer screenWithTransitionContainer = new ScreenWithTransitionContainer(context, null, 0, 0, 14, null);
                screenWithTransitionContainer.setId(C0470o.h);
                screenWithTransitionContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                E.a(screenWithTransitionContainer, c0606i, viewEnvironment, new C0180a(screenWithTransitionContainer));
                return screenWithTransitionContainer;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull C0606i initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public c<? super C0606i> getType() {
            return this.a.getType();
        }

        private Companion() {
            this.a = new C0494f<>(z.b(C0606i.class), C0179a.d);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class b {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0605h.values().length];
            try {
                iArr[EnumC0605h.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0605h.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0605h.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public ScreenWithTransitionContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public static final void d(View view, Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(function0, "doStart");
        InterfaceC0585c.Companion.e(InterfaceC0585c.INSTANCE, view, null, 2, null);
        function0.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    protected void b(View oldViewMaybe, @NotNull View newView, @NotNull EnumC0605h transition) throws P9.m {
        Pair pairA;
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        int i = C0597a.a;
        View viewFindViewById = oldViewMaybe.findViewById(i);
        View viewFindViewById2 = newView.findViewById(i);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        int i2 = b.a[transition.ordinal()];
        if (i2 == 1) {
            pairA = t.a(8388611, 8388613);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new P9.m();
                }
                x.e(new n(this, newView), (q) null);
                return;
            }
            pairA = t.a(8388613, 8388611);
        }
        androidx.transition.z zVarX0 = new androidx.transition.z().q0(new p(((Number) pairA.a()).intValue()).b(oldViewMaybe)).q0(new p(((Number) pairA.b()).intValue()).b(viewFindViewById2)).x0(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(zVarX0, "setInterpolator(...)");
        x.c(this);
        x.e(new n(this, newView), zVarX0);
    }

    protected final void c(@NotNull C0606i newRendering, @NotNull ViewEnvironment newViewEnvironment) throws P9.m {
        InterfaceC0585c interfaceC0585cC;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentC = newViewEnvironment.c(t.a(EnumC0589a.INSTANCE, EnumC0589a.First));
        m<?> mVar = new m<>(newRendering.getScreen(), "screen_with_transition");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = E.b(currentView, mVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(CollectionsKt.d(mVar));
                E.g(view, mVar, viewEnvironmentC);
                return;
            }
        }
        C c = (C) viewEnvironmentC.a(C.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewC = D.c(c, mVar, viewEnvironmentC, context, this, new F() {
            @Override
            public final void a(View view2, Function0 function0) {
                ScreenWithTransitionContainer.d(view2, function0);
            }
        });
        E.h(viewC);
        b(currentView, viewC, newRendering.getTransition());
        if (currentView != null && (interfaceC0585cC = InterfaceC0585c.INSTANCE.c(currentView)) != null) {
            interfaceC0585cC.P();
        }
        this.currentRendering = mVar;
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "a", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "CREATOR", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ViewStateCache.Saved savedViewState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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

    public ScreenWithTransitionContainer(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new ViewStateCache();
    }
}
