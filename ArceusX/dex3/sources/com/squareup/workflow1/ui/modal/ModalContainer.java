package com.squareup.workflow1.ui.modal;

import P9.h;
import P9.i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.d;
import androidx.lifecycle.o;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C0496h;
import com.squareup.workflow1.ui.G;
import com.squareup.workflow1.ui.H;
import com.squareup.workflow1.ui.InterfaceC0495g;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowViewStub;
import com.squareup.workflow1.ui.androidx.WorkflowSavedStateRegistryAggregator;
import com.squareup.workflow1.ui.modal.ModalContainer;
import h8.C0584b;
import h8.InterfaceC0585c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.e;
import k8.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003678B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000fH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0014¢\u0006\u0004\b$\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "ModalRenderingT", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lk8/e;", "newScreen", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "c", "(Lk8/e;Lcom/squareup/workflow1/ui/y;)V", "initialModalRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "b", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "baseViewStub", "", "e", "Ljava/util/List;", "dialogs", "Lh8/c;", "i", "LP9/h;", "getParentLifecycleOwner", "()Lh8/c;", "parentLifecycleOwner", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "v", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "stateRegistryAggregator", "a", "KeyAndBundle", "SavedState", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public abstract class ModalContainer<ModalRenderingT> extends FrameLayout {

    @NotNull
    private final WorkflowViewStub baseViewStub;

    @NotNull
    private List<a<ModalRenderingT>> dialogs;

    @NotNull
    private final h parentLifecycleOwner;

    @NotNull
    private final WorkflowSavedStateRegistryAggregator stateRegistryAggregator;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "Landroid/os/Parcelable;", "", "compatibilityKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class KeyAndBundle implements Parcelable {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String compatibilityKey;

        @NotNull
        private final Bundle bundle;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<KeyAndBundle> {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override
            @NotNull
            public KeyAndBundle createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Intrinsics.d(string);
                Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
                Bundle bundle = parcel.readBundle(KeyAndBundle.class.getClassLoader());
                Intrinsics.d(bundle);
                Intrinsics.checkNotNullExpressionValue(bundle, "parcel.readBundle(KeyAnd…class.java.classLoader)!!");
                return new KeyAndBundle(string, bundle);
            }

            @Override
            @NotNull
            public KeyAndBundle[] newArray(int size) {
                return new KeyAndBundle[size];
            }

            private Companion() {
            }
        }

        public KeyAndBundle(@NotNull String str, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "compatibilityKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.compatibilityKey = str;
            this.bundle = bundle;
        }

        @NotNull
        public final Bundle getBundle() {
            return this.bundle;
        }

        @NotNull
        public final String getCompatibilityKey() {
            return this.compatibilityKey;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyAndBundle)) {
                return false;
            }
            KeyAndBundle keyAndBundle = (KeyAndBundle) other;
            return Intrinsics.b(this.compatibilityKey, keyAndBundle.compatibilityKey) && Intrinsics.b(this.bundle, keyAndBundle.bundle);
        }

        public int hashCode() {
            return (this.compatibilityKey.hashCode() * 31) + this.bundle.hashCode();
        }

        @NotNull
        public String toString() {
            return "KeyAndBundle(compatibilityKey=" + this.compatibilityKey + ", bundle=" + this.bundle + ')';
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.compatibilityKey);
            parcel.writeBundle(this.bundle);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ModalRenderingT", "Lh8/c;", "a", "()Lh8/c;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends l implements Function0<InterfaceC0585c> {
        final ModalContainer<ModalRenderingT> d;

        b(ModalContainer<ModalRenderingT> modalContainer) {
            super(0);
            this.d = modalContainer;
        }

        @NotNull
        public final InterfaceC0585c invoke() {
            InterfaceC0585c interfaceC0585cC = InterfaceC0585c.INSTANCE.c(this.d);
            if (interfaceC0585cC != null) {
                return interfaceC0585cC;
            }
            throw new IllegalStateException(Intrinsics.m("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ", this.d).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "ModalRenderingT", "Landroid/view/View;", "it", "Landroidx/lifecycle/h;", "a", "(Landroid/view/View;)Landroidx/lifecycle/h;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class c extends l implements Function1<View, androidx.lifecycle.h> {
        final ModalContainer<ModalRenderingT> d;

        c(ModalContainer<ModalRenderingT> modalContainer) {
            super(1);
            this.d = modalContainer;
        }

        @NotNull
        public final androidx.lifecycle.h invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            androidx.lifecycle.h lifecycle = this.d.getParentLifecycleOwner().getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "parentLifecycleOwner.lifecycle");
            return lifecycle;
        }
    }

    public ModalContainer(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.baseViewStub = workflowViewStub;
        this.dialogs = CollectionsKt.j();
        this.parentLifecycleOwner = i.a(P9.l.i, new b(this));
        this.stateRegistryAggregator = new WorkflowSavedStateRegistryAggregator();
    }

    public final InterfaceC0585c getParentLifecycleOwner() {
        return (InterfaceC0585c) this.parentLifecycleOwner.getValue();
    }

    @NotNull
    protected abstract a<ModalRenderingT> b(@NotNull ModalRenderingT initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment);

    public final void c(@NotNull e<?, ? extends ModalRenderingT> newScreen, @NotNull ViewEnvironment viewEnvironment) {
        a<ModalRenderingT> aVarB;
        Intrinsics.checkNotNullParameter(newScreen, "newScreen");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.baseViewStub.c(newScreen.a(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (ModalRenderingT modalrenderingt : newScreen.c()) {
            int i2 = i + 1;
            if (i >= this.dialogs.size() || !C0496h.a(this.dialogs.get(i).f(), modalrenderingt)) {
                final a<ModalRenderingT> aVarB2 = b(modalrenderingt, viewEnvironment);
                aVarB2.k(InterfaceC0495g.INSTANCE.a(modalrenderingt, String.valueOf(i)));
                View viewB = f.b(aVarB2.getDialog());
                if (viewB != null) {
                    InterfaceC0585c.INSTANCE.d(viewB, new c(this));
                    this.stateRegistryAggregator.h(viewB, aVarB2.g());
                    viewB.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(aVarB2, this) {

                        @NotNull
                        private final ModalContainer$update$2$1$2$dismissOnDestroy$1 dismissOnDestroy;

                        private androidx.lifecycle.h lifecycle;
                        final ModalContainer.a<ModalRenderingT> i;
                        final ModalContainer<ModalRenderingT> v;

                        {
                            this.i = aVarB2;
                            this.v = this;
                            this.dismissOnDestroy = new d() {
                                public void onDestroy(@NotNull o owner) {
                                    Intrinsics.checkNotNullParameter(owner, "owner");
                                    aVarB2.c();
                                }
                            };
                        }

                        @NotNull
                        public final ModalContainer$update$2$1$2$dismissOnDestroy$1 getDismissOnDestroy() {
                            return this.dismissOnDestroy;
                        }

                        @Override
                        public void onViewAttachedToWindow(@NotNull View v) {
                            Intrinsics.checkNotNullParameter(v, "v");
                            androidx.lifecycle.h lifecycle = this.v.getParentLifecycleOwner().getLifecycle();
                            lifecycle.a(getDismissOnDestroy());
                            this.lifecycle = lifecycle;
                        }

                        @Override
                        public void onViewDetachedFromWindow(@NotNull View v) {
                            Intrinsics.checkNotNullParameter(v, "v");
                            androidx.lifecycle.h hVar = this.lifecycle;
                            if (hVar != null) {
                                hVar.d(this.dismissOnDestroy);
                            }
                            this.lifecycle = null;
                        }
                    });
                }
                aVarB2.getDialog().show();
                aVarB = aVarB2;
            } else {
                aVarB = a.b(this.dialogs.get(i), modalrenderingt, viewEnvironment, null, null, 12, null);
                d(aVarB);
            }
            arrayList.add(aVarB);
            i = i2;
        }
        Iterator it = CollectionsKt.c0(this.dialogs, arrayList).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        WorkflowSavedStateRegistryAggregator workflowSavedStateRegistryAggregator = this.stateRegistryAggregator;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a) it2.next()).g());
        }
        workflowSavedStateRegistryAggregator.j(arrayList2);
        this.dialogs = arrayList;
    }

    protected abstract void d(@NotNull a<ModalRenderingT> dialogRef);

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
        this.stateRegistryAggregator.f(InterfaceC0495g.Companion.b(companion, objC, null, 2, null), dVarC);
    }

    @Override
    protected void onDetachedFromWindow() {
        this.stateRegistryAggregator.g();
        super.onDetachedFromWindow();
    }

    @Override
    protected void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            if (savedState.a().size() == this.dialogs.size()) {
                List<KeyAndBundle> listA = savedState.a();
                List<a<ModalRenderingT>> list = this.dialogs;
                Iterator<T> it = listA.iterator();
                Iterator<T> it2 = list.iterator();
                ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.t(listA, 10), CollectionsKt.t(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    ((a) it2.next()).i((KeyAndBundle) it.next());
                    arrayList.add(Unit.a);
                }
            }
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
        List<a<ModalRenderingT>> list = this.dialogs;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).j());
        }
        return new SavedState(parcelableOnSaveInstanceState, arrayList);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "dialogBundles", "<init>", "(Landroid/os/Parcelable;Ljava/util/List;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    private static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final List<KeyAndBundle> dialogBundles;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
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

        public SavedState(Parcelable parcelable, @NotNull List<KeyAndBundle> list) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(list, "dialogBundles");
            this.dialogBundles = list;
        }

        @NotNull
        public final List<KeyAndBundle> a() {
            return this.dialogBundles;
        }

        @Override
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeTypedList(this.dialogBundles);
        }

        public SavedState(@NotNull Parcel parcel) {
            super(parcel);
            Intrinsics.checkNotNullParameter(parcel, "source");
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, KeyAndBundle.INSTANCE);
            this.dialogBundles = arrayList;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b'\u0010\u001fR\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "", "ModalRenderingT", "modalRendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "Landroid/app/Dialog;", "dialog", "extra", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/app/Dialog;Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/app/Dialog;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "j", "()Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "keyAndBundle", "", "i", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;)V", "c", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "Lcom/squareup/workflow1/ui/y;", "h", "()Lcom/squareup/workflow1/ui/y;", "Landroid/app/Dialog;", "d", "()Landroid/app/Dialog;", "e", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "savedStateRegistryKey", "wf1-container-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    protected static final class a<ModalRenderingT> {

        @NotNull
        private final ModalRenderingT modalRendering;

        @NotNull
        private final ViewEnvironment viewEnvironment;

        @NotNull
        private final Dialog dialog;

        private final Object extra;

        public String savedStateRegistryKey;

        public a(@NotNull ModalRenderingT modalrenderingt, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, Object obj) {
            Intrinsics.checkNotNullParameter(modalrenderingt, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.modalRendering = modalrenderingt;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj;
        }

        public static a b(a aVar, Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = aVar.modalRendering;
            }
            if ((i & 2) != 0) {
                viewEnvironment = aVar.viewEnvironment;
            }
            if ((i & 4) != 0) {
                dialog = aVar.dialog;
            }
            if ((i & 8) != 0) {
                obj2 = aVar.extra;
            }
            return aVar.a(obj, viewEnvironment, dialog, obj2);
        }

        @NotNull
        public final a<ModalRenderingT> a(@NotNull ModalRenderingT modalRendering, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, Object extra) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            a<ModalRenderingT> aVar = new a<>(modalRendering, viewEnvironment, dialog, extra);
            aVar.k(g());
            return aVar;
        }

        public final void c() {
            InterfaceC0585c interfaceC0585cC;
            View viewB = f.b(this.dialog);
            if (viewB != null && (interfaceC0585cC = InterfaceC0585c.INSTANCE.c(viewB)) != null) {
                interfaceC0585cC.P();
            }
            this.dialog.dismiss();
        }

        @NotNull
        public final Dialog getDialog() {
            return this.dialog;
        }

        public final Object getExtra() {
            return this.extra;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.b(a.class, other == null ? null : other.getClass())) {
                return false;
            }
            if (other != null) {
                return Intrinsics.b(this.dialog, ((a) other).dialog);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
        }

        @NotNull
        public final ModalRenderingT f() {
            return this.modalRendering;
        }

        @NotNull
        public final String g() {
            String str = this.savedStateRegistryKey;
            if (str != null) {
                return str;
            }
            Intrinsics.v("savedStateRegistryKey");
            return null;
        }

        @NotNull
        public final ViewEnvironment getViewEnvironment() {
            return this.viewEnvironment;
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public final void i(@NotNull KeyAndBundle keyAndBundle) {
            Intrinsics.checkNotNullParameter(keyAndBundle, "keyAndBundle");
            if (Intrinsics.b(InterfaceC0495g.Companion.b(InterfaceC0495g.INSTANCE, this.modalRendering, null, 2, null), keyAndBundle.getCompatibilityKey())) {
                Window window = this.dialog.getWindow();
                Intrinsics.d(window);
                window.restoreHierarchyState(keyAndBundle.getBundle());
            }
        }

        @NotNull
        public final KeyAndBundle j() {
            Window window = this.dialog.getWindow();
            Intrinsics.d(window);
            Bundle bundleSaveHierarchyState = window.saveHierarchyState();
            String strB = InterfaceC0495g.Companion.b(InterfaceC0495g.INSTANCE, this.modalRendering, null, 2, null);
            Intrinsics.checkNotNullExpressionValue(bundleSaveHierarchyState, "saved");
            return new KeyAndBundle(strB, bundleSaveHierarchyState);
        }

        public final void k(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.savedStateRegistryKey = str;
        }

        public a(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, dialog, (i & 8) != 0 ? null : obj2);
        }
    }
}
