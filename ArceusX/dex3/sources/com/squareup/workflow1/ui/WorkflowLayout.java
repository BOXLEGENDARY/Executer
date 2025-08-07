package com.squareup.workflow1.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.h;
import com.roblox.client.personasdk.R;
import ha.L;
import ha.N;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "newRendering", "Lcom/squareup/workflow1/ui/y;", "environment", "", "c", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V", "Landroidx/lifecycle/h;", "lifecycle", "Lka/g;", "renderings", "Landroidx/lifecycle/h$b;", "repeatOnLifecycle", "a", "(Landroidx/lifecycle/h;Lka/g;Landroidx/lifecycle/h$b;Lcom/squareup/workflow1/ui/y;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "d", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "showing", "Landroid/util/SparseArray;", "e", "Landroid/util/SparseArray;", "restoredChildState", "SavedState", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class WorkflowLayout extends FrameLayout {

    @NotNull
    private final WorkflowViewStub showing;

    private SparseArray<Parcelable> restoredChildState;

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1", f = "WorkflowLayout.kt", l = {87}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final androidx.lifecycle.h e;
        final h.b i;
        final ka.g<Object> v;
        final WorkflowLayout w;
        final ViewEnvironment y;

        @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1$1", f = "WorkflowLayout.kt", l = {212}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class C0064a extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final ka.g<Object> e;
            final WorkflowLayout i;
            final ViewEnvironment v;

            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"com/squareup/workflow1/ui/WorkflowLayout$a$a$a", "Lka/h;", "value", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
            public static final class C0065a implements ka.h<Object> {
                final WorkflowLayout d;
                final ViewEnvironment e;

                public C0065a(WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment) {
                    this.d = workflowLayout;
                    this.e = viewEnvironment;
                }

                public Object c(Object obj, @NotNull Continuation<? super Unit> continuation) {
                    this.d.c(obj, this.e);
                    return Unit.a;
                }
            }

            C0064a(ka.g<? extends Object> gVar, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, Continuation<? super C0064a> continuation) {
                super(2, continuation);
                this.e = gVar;
                this.i = workflowLayout;
                this.v = viewEnvironment;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0064a(this.e, this.i, this.v, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    P9.p.b(obj);
                    ka.g<Object> gVar = this.e;
                    C0065a c0065a = new C0065a(this.i, this.v);
                    this.d = 1;
                    if (gVar.a(c0065a, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P9.p.b(obj);
                }
                return Unit.a;
            }
        }

        a(androidx.lifecycle.h hVar, h.b bVar, ka.g<? extends Object> gVar, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = hVar;
            this.i = bVar;
            this.v = gVar;
            this.w = workflowLayout;
            this.y = viewEnvironment;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.e, this.i, this.v, this.w, this.y, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                androidx.lifecycle.h hVar = this.e;
                h.b bVar = this.i;
                C0064a c0064a = new C0064a(this.v, this.w, this.y, null);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(hVar, bVar, c0064a, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            return Unit.a;
        }
    }

    public WorkflowLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static void b(WorkflowLayout workflowLayout, androidx.lifecycle.h hVar, ka.g gVar, h.b bVar, ViewEnvironment viewEnvironment, int i, Object obj) {
        if ((i & 4) != 0) {
            bVar = h.b.v;
        }
        if ((i & 8) != 0) {
            viewEnvironment = new ViewEnvironment(null, 1, null);
        }
        workflowLayout.a(hVar, gVar, bVar, viewEnvironment);
    }

    public final void a(@NotNull androidx.lifecycle.h lifecycle, @NotNull ka.g<? extends Object> renderings, @NotNull h.b repeatOnLifecycle, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(renderings, "renderings");
        Intrinsics.checkNotNullParameter(repeatOnLifecycle, "repeatOnLifecycle");
        Intrinsics.checkNotNullParameter(environment, "environment");
        ha.g.d(androidx.lifecycle.m.a(lifecycle), (CoroutineContext) null, (N) null, new a(lifecycle, repeatOnLifecycle, renderings, this, environment, null), 3, (Object) null);
    }

    public final void c(@NotNull Object newRendering, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.showing.c(newRendering, environment);
        SparseArray<Parcelable> sparseArray = this.restoredChildState;
        if (sparseArray == null) {
            return;
        }
        this.restoredChildState = null;
        this.showing.getActual().restoreHierarchyState(sparseArray);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.restoredChildState = savedState.a();
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override
    @NotNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.d(parcelableOnSaveInstanceState);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.showing.getActual().saveHierarchyState(sparseArray);
        return new SavedState(parcelableOnSaveInstanceState, sparseArray);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Landroid/util/SparseArray;", "childState", "<init>", "(Landroid/os/Parcelable;Landroid/util/SparseArray;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Landroid/util/SparseArray;", "a", "()Landroid/util/SparseArray;", "CREATOR", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    private static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final SparseArray<Parcelable> childState;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
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

        public SavedState(Parcelable parcelable, @NotNull SparseArray<Parcelable> sparseArray) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(sparseArray, "childState");
            this.childState = sparseArray;
        }

        @NotNull
        public final SparseArray<Parcelable> a() {
            return this.childState;
        }

        @Override
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeSparseArray(this.childState);
        }

        public SavedState(@NotNull Parcel parcel) {
            super(parcel);
            Intrinsics.checkNotNullParameter(parcel, "source");
            SparseArray<Parcelable> sparseArray = parcel.readSparseArray(SavedState.class.getClassLoader());
            Intrinsics.d(sparseArray);
            Intrinsics.checkNotNullExpressionValue(sparseArray, "source.readSparseArray(S…class.java.classLoader)!!");
            this.childState = sparseArray;
        }
    }

    public WorkflowLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(o.d);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.showing = workflowViewStub;
    }
}
