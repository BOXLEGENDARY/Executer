package w9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lw9/b;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "sheetComponent", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/squareup/workflow1/ui/y;)V", "e", "()V", "a", "Landroid/view/ViewGroup;", "Ll9/h;", "b", "Ll9/h;", "currentBottomSheet", "c", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V", "currentSheetComponent", "Ll9/f;", "d", "()Ll9/f;", "uiScreenGenerationResult", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @NotNull
    private final ViewGroup contentView;

    private l9.h currentBottomSheet;

    private SheetComponent currentSheetComponent;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final SheetComponent d;
        final b e;
        final View i;

        a(SheetComponent sheetComponent, b bVar, View view) {
            super(0);
            this.d = sheetComponent;
            this.e = bVar;
            this.i = view;
        }

        public Object invoke() {
            m708invoke();
            return Unit.a;
        }

        public final void m708invoke() {
            this.d.J0(true);
            this.d.U(false);
            this.e.contentView.removeView(this.i);
            this.e.f(null);
            this.e.currentBottomSheet = null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0300b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final kotlin.jvm.internal.y<Function0<Unit>> d;

        C0300b(kotlin.jvm.internal.y<Function0<Unit>> yVar) {
            super(0);
            this.d = yVar;
        }

        public final void m709invoke() {
            ((Function0) this.d.d).invoke();
        }

        public Object invoke() {
            m709invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final c d = new c();

        c() {
            super(0);
        }

        public Object invoke() {
            m710invoke();
            return Unit.a;
        }

        public final void m710invoke() {
        }
    }

    public b(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "contentView");
        this.contentView = viewGroup;
    }

    public final SheetComponent getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    public final l9.f d() {
        l9.h hVar = this.currentBottomSheet;
        if (hVar != null) {
            return hVar.getUiScreenGenerationResult();
        }
        return null;
    }

    public final void e() {
        l9.h hVar = this.currentBottomSheet;
        BottomSheetBehavior<?> bottomSheetBehaviorG = hVar != null ? hVar.g() : null;
        if (bottomSheetBehaviorG != null) {
            bottomSheetBehaviorG.R0(5);
        }
        this.currentSheetComponent = null;
    }

    public final void f(SheetComponent sheetComponent) {
        this.currentSheetComponent = sheetComponent;
    }

    public final void g(@NotNull SheetComponent sheetComponent, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(sheetComponent, "sheetComponent");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.d = c.d;
        l9.h hVar = new l9.h(sheetComponent.H0(), CollectionsKt.j(), new C0300b(yVar), null, sheetComponent.S0());
        this.currentBottomSheet = hVar;
        com.squareup.workflow1.ui.A<l9.h> a3 = hVar.a();
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewA = a3.a(hVar, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewA);
        E.h(viewA);
        yVar.d = new a(sheetComponent, this, viewA);
    }
}
