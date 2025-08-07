package com.withpersona.sdk2.inquiry.document;

import aa.n;
import aa.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.C0484b;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.squareup.workflow1.ui.x;
import com.withpersona.sdk2.inquiry.document.DocumentInstructionsView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import l9.ComponentView;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00060\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b%\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u00103R&\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0000068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;", "Lcom/squareup/workflow1/ui/b;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "onBack", "onCancel", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lc9/b;", "binding", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "Ll9/a;", "componentNameToComponentView", "g", "(Lc9/b;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Lcom/squareup/workflow1/ui/y;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "getUiScreen", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "e", "Ljava/util/List;", "getComponentNamesToActions", "()Ljava/util/List;", "i", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "v", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "w", "f", "Lcom/squareup/workflow1/ui/A;", "y", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "getViewFactory$annotations", "()V", "viewFactory", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DocumentInstructionsView implements InterfaceC0490b<DocumentInstructionsView>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentInstructionsView> CREATOR = new a();

    @NotNull
    private final UiComponentScreen uiScreen;

    @NotNull
    private final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    @NotNull
    private final NavigationState navigationState;

    @NotNull
    private final Function0<Unit> onBack;

    @NotNull
    private final Function0<Unit> onCancel;

    @NotNull
    private final A<DocumentInstructionsView> viewFactory;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentInstructionsView> {
        @Override
        @NotNull
        public final DocumentInstructionsView createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UiComponentScreen uiComponentScreen = (UiComponentScreen) parcel.readParcelable(DocumentInstructionsView.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new DocumentInstructionsView(uiComponentScreen, arrayList, (NavigationState) parcel.readParcelable(DocumentInstructionsView.class.getClassLoader()), parcel.readSerializable(), parcel.readSerializable());
        }

        @Override
        @NotNull
        public final DocumentInstructionsView[] newArray(int i) {
            return new DocumentInstructionsView[i];
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends l implements Function0<Unit> {
        b() {
            super(0);
        }

        public Object invoke() {
            m24invoke();
            return Unit.a;
        }

        public final void m24invoke() {
            DocumentInstructionsView.this.d().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        c() {
            super(0);
        }

        public Object invoke() {
            m25invoke();
            return Unit.a;
        }

        public final void m25invoke() {
            DocumentInstructionsView.this.f().invoke();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class d extends j implements n<LayoutInflater, ViewGroup, Boolean, C0484b> {
        public static final d d = new d();

        public d() {
            super(3, C0484b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        @NotNull
        public final C0484b f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return C0484b.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Lc9/b;", "binding", "Lcom/squareup/workflow1/ui/j;", "a", "(Lc9/b;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class e extends l implements Function1<C0484b, com.squareup.workflow1.ui.j<DocumentInstructionsView>> {
        final UiComponentScreen d;
        final Function2 e;
        final boolean i;
        final o v;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "RenderingT", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        public static final class a<RenderingT> implements com.squareup.workflow1.ui.j {
            final UiComponentScreen b;
            final C0484b c;
            final o d;
            final l9.f e;

            public a(UiComponentScreen uiComponentScreen, C0484b c0484b, o oVar, l9.f fVar) {
                this.b = uiComponentScreen;
                this.c = c0484b;
                this.d = oVar;
                this.e = fVar;
            }

            @Override
            public final void a(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(renderingt, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                Integer numC = this.b.c();
                if (numC != null) {
                    C0484b c0484b = this.c;
                    int iIntValue = numC.intValue();
                    c0484b.a().setBackgroundColor(iIntValue);
                    C0596c.a(viewEnvironment, iIntValue);
                }
                UiComponentScreen uiComponentScreen = this.b;
                Context context = this.c.a().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Drawable drawableBackgroundImageDrawable = uiComponentScreen.backgroundImageDrawable(context);
                if (drawableBackgroundImageDrawable != null) {
                    C0484b c0484b2 = this.c;
                    c0484b2.a().setBackground(drawableBackgroundImageDrawable);
                    c0484b2.d.setBackgroundColor(0);
                }
                o oVar = this.d;
                C0484b c0484b3 = this.c;
                Intrinsics.checkNotNullExpressionValue(c0484b3, "$binding");
                oVar.h(c0484b3, renderingt, viewEnvironment, this.e.getViewBindings().a());
            }
        }

        public e(UiComponentScreen uiComponentScreen, Function2 function2, boolean z, o oVar) {
            super(1);
            this.d = uiComponentScreen;
            this.e = function2;
            this.i = z;
            this.v = oVar;
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<DocumentInstructionsView> invoke(@NotNull C0484b c0484b) {
            Intrinsics.checkNotNullParameter(c0484b, "binding");
            return new a(this.d, c0484b, this.v, l9.j.a.j(c0484b, this.d, this.e, this.i));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc9/b;", "binding", "", "", "Ll9/a;", "<anonymous parameter 1>", "", "a", "(Lc9/b;Ljava/util/Map;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends l implements Function2<C0484b, Map<String, ? extends ComponentView>, Unit> {
        public static final f d = new f();

        f() {
            super(2);
        }

        public final void a(@NotNull C0484b c0484b, @NotNull Map<String, ComponentView> map) {
            Intrinsics.checkNotNullParameter(c0484b, "binding");
            Intrinsics.checkNotNullParameter(map, "<anonymous parameter 1>");
            ConstraintLayout constraintLayoutA = c0484b.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            C0601d.c(constraintLayoutA, false, false, false, false, 15, null);
        }

        public Object invoke(Object obj, Object obj2) {
            a((C0484b) obj, (Map) obj2);
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class g extends j implements o<C0484b, DocumentInstructionsView, ViewEnvironment, Map<String, ? extends ComponentView>, Unit> {
        g(Object obj) {
            super(4, obj, DocumentInstructionsView.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Lcom/squareup/workflow1/ui/ViewEnvironment;Ljava/util/Map;)V", 0);
        }

        public final void f(@NotNull C0484b c0484b, @NotNull DocumentInstructionsView documentInstructionsView, @NotNull ViewEnvironment viewEnvironment, @NotNull Map<String, ComponentView> map) {
            Intrinsics.checkNotNullParameter(c0484b, "p0");
            Intrinsics.checkNotNullParameter(documentInstructionsView, "p1");
            Intrinsics.checkNotNullParameter(viewEnvironment, "p2");
            Intrinsics.checkNotNullParameter(map, "p3");
            ((DocumentInstructionsView) ((kotlin.jvm.internal.d) this).receiver).g(c0484b, documentInstructionsView, viewEnvironment, map);
        }

        public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
            f((C0484b) obj, (DocumentInstructionsView) obj2, (ViewEnvironment) obj3, (Map) obj4);
            return Unit.a;
        }
    }

    public DocumentInstructionsView(@NotNull UiComponentScreen uiComponentScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> list, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(uiComponentScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(list, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function0, "onBack");
        Intrinsics.checkNotNullParameter(function02, "onCancel");
        this.uiScreen = uiComponentScreen;
        this.componentNamesToActions = list;
        this.navigationState = navigationState;
        this.onBack = function0;
        this.onCancel = function02;
        l9.j jVar = l9.j.a;
        f fVar = f.d;
        g gVar = new g(this);
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new x(z.b(DocumentInstructionsView.class), d.d, new e(uiComponentScreen, fVar, true, gVar));
    }

    public final void g(C0484b binding, DocumentInstructionsView rendering, ViewEnvironment viewEnvironment, Map<String, ComponentView> componentNameToComponentView) {
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNamesToActions) {
            String str = (String) pair.c();
            final Function1 function1 = (Function1) pair.d();
            final ComponentView componentView = componentNameToComponentView.get(str);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DocumentInstructionsView.h(function1, componentView, view);
                    }
                });
            }
        }
        NavigationState navigationState = rendering.navigationState;
        b bVar = rendering.new b();
        c cVar = rendering.new c();
        Pi2NavigationBar pi2NavigationBar = binding.e;
        Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
        ConstraintLayout constraintLayoutA = binding.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        C0588c.a(navigationState, bVar, cVar, pi2NavigationBar, constraintLayoutA);
    }

    public static final void h(Function1 function1, ComponentView componentView, View view) {
        Intrinsics.checkNotNullParameter(function1, "$action");
        Intrinsics.checkNotNullParameter(componentView, "$componentView");
        function1.invoke(componentView.c());
    }

    @Override
    @NotNull
    public A<DocumentInstructionsView> a() {
        return this.viewFactory;
    }

    @NotNull
    public final Function0<Unit> d() {
        return this.onBack;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Function0<Unit> f() {
        return this.onCancel;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.uiScreen, flags);
        List<Pair<String, Function1<UiComponent, Unit>>> list = this.componentNamesToActions;
        parcel.writeInt(list.size());
        Iterator<Pair<String, Function1<UiComponent, Unit>>> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable((Serializable) it.next());
        }
        parcel.writeParcelable(this.navigationState, flags);
        parcel.writeSerializable((Serializable) this.onBack);
        parcel.writeSerializable((Serializable) this.onCancel);
    }
}
