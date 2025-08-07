package l9;

import P9.m;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.C0484b;
import com.google.android.material.button.MaterialButton;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import ha.C0456d;
import ha.C0458f;
import j9.C0601d;
import j9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;
import n9.C0661C;
import n9.C0673a;
import n9.C0676d;
import n9.C0677e;
import n9.C0678f;
import n9.C0679g;
import n9.C0680h;
import n9.C0681i;
import n9.C0685m;
import n9.C0686n;
import n9.C0687o;
import n9.C0690s;
import n9.C0692u;
import n9.C0695x;
import n9.C0697z;
import n9.D;
import n9.E;
import n9.K;
import n9.L;
import n9.M;
import n9.N;
import n9.Q;
import n9.T;
import n9.U;
import n9.V;
import n9.Y;
import n9.d0;
import n9.e0;
import n9.g0;
import n9.m0;
import n9.p0;
import n9.q0;
import n9.r;
import n9.r0;
import n9.s0;
import n9.u0;
import org.jetbrains.annotations.NotNull;
import q9.s;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJU\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u00062$\u0010#\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\"0!0 0\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010)JM\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062&\u0010.\u001a\"\u0012\u0004\u0012\u00020*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0-\u0012\u0004\u0012\u00020\"\u0018\u00010,2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b0\u00101J7\u00102\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\"2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Ll9/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "isLoading", "", "", "Ll9/a;", "viewBindings", "Ln9/s0;", "uiComponentHelper", "isModal", "shouldApplyFocus", "Landroid/view/View;", "e", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZLjava/util/Map;Ln9/s0;ZZ)Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "component", "d", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;ZLjava/util/Map;Ln9/s0;)Landroid/view/View;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "componentViews", "i", "(Ljava/util/List;Landroid/content/Context;ZLjava/util/List;Ln9/s0;)Ljava/util/List;", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "Ll9/h;", "h", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Ll9/h;", "Lc9/b;", "binding", "Lkotlin/Function2;", "", "initialRendering", "Ll9/f;", "j", "(Lc9/b;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Ll9/f;", "f", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZ)Ll9/f;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentView", "b", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {

    @NotNull
    public static final j a = new j();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends l implements Function0<Unit> {
        final s0 d;

        a(s0 s0Var) {
            super(0);
            this.d = s0Var;
        }

        public Object invoke() {
            m614invoke();
            return Unit.a;
        }

        public final void m614invoke() {
            this.d.c();
        }
    }

    private j() {
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "$it");
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    private final View d(Context context, FooterComponent component, boolean isLoading, Map<String, ComponentView> viewBindings, s0 uiComponentHelper) throws m {
        ArrayList arrayList = new ArrayList();
        List<View> listI = i(CollectionsKt.d(component), context, isLoading, arrayList, uiComponentHelper);
        for (Object obj : arrayList) {
            viewBindings.put(((ComponentView) obj).c().getName(), obj);
        }
        return (View) CollectionsKt.M(listI);
    }

    private final View e(Context context, UiComponentScreen uiScreen, boolean isLoading, Map<String, ComponentView> viewBindings, s0 uiComponentHelper, boolean isModal, boolean shouldApplyFocus) throws m {
        List<? extends UiComponent> listJ;
        ComponentView componentView;
        View viewD;
        s sVarD = s.d(uiComponentHelper.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sVarD, "inflate(...)");
        ConstraintLayout constraintLayoutA = sVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        List<UiComponent> components = uiScreen.getComponents();
        if (components != null) {
            listJ = new ArrayList<>();
            for (Object obj : components) {
                if (!(((UiComponent) obj) instanceof FooterComponent)) {
                    listJ.add(obj);
                }
            }
        } else {
            listJ = CollectionsKt.j();
        }
        ArrayList arrayList = new ArrayList();
        List<View> listI = i(listJ, context, isLoading, arrayList, uiComponentHelper);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(constraintLayoutA);
        for (View view : listI) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            constraintLayoutA.addView(view);
            dVar.h(view.getId(), 6, 0, 6);
            dVar.h(view.getId(), 7, 0, 7);
            dVar.l(view.getId(), -2);
            dVar.k(view.getId(), 0);
            dVar.A(view.getId(), 0.5f);
        }
        for (Object obj2 : arrayList) {
            viewBindings.put(((ComponentView) obj2).c().getName(), obj2);
        }
        if (listI.size() > 1) {
            List<View> list = listI;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.t(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it.next()).getId()));
            }
            int i = 0;
            dVar.q(0, 3, 0, 4, CollectionsKt.q0(arrayList2), (float[]) null, 3);
            if (uiScreen.getStyles() == null) {
                Iterator<? extends UiComponent> it2 = listJ.iterator();
                while (true) {
                    int i2 = i;
                    if (!it2.hasNext()) {
                        break;
                    }
                    i = i2 + 1;
                    UiComponent next = it2.next();
                    if (!(next instanceof SpacerComponent) && (componentView = (ComponentView) viewBindings.get(next.getName())) != null && (viewD = componentView.d()) != null && i2 != CollectionsKt.l(listJ)) {
                        dVar.z(viewD.getId(), 4, (int) C0458f.a(16.0d));
                    }
                }
            }
        }
        if (!isModal) {
            constraintLayoutA.setPadding(constraintLayoutA.getPaddingLeft(), constraintLayoutA.getPaddingTop(), constraintLayoutA.getPaddingRight(), (int) C0458f.a(24.0d));
        }
        dVar.c(constraintLayoutA);
        Context context2 = sVarD.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!C0456d.g(context2) && shouldApplyFocus) {
            b(constraintLayoutA);
        }
        ConstraintLayout constraintLayoutA2 = sVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA2, "getRoot(...)");
        return constraintLayoutA2;
    }

    public static f g(j jVar, Context context, UiComponentScreen uiComponentScreen, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        return jVar.f(context, uiComponentScreen, z, z2, z3);
    }

    private final List<View> i(List<? extends UiComponent> components, Context context, boolean isLoading, List<ComponentView> componentViews, s0 uiComponentHelper) throws m {
        MaterialButton materialButtonG;
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : components) {
            if (uiComponent instanceof ActionButtonComponent) {
                materialButtonG = C0673a.a((ActionButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof CancelButtonComponent) {
                materialButtonG = C0677e.a((CancelButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof CombinedStepButtonComponent) {
                materialButtonG = C0679g.a((CombinedStepButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof CompleteButtonComponent) {
                materialButtonG = C0680h.a((CompleteButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof SubmitButtonComponent) {
                materialButtonG = p0.a((SubmitButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof ESignatureComponent) {
                materialButtonG = C0685m.c((ESignatureComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                materialButtonG = C0687o.a((GovernmentIdNfcScanComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof ImagePreviewComponent) {
                materialButtonG = C0690s.a((ImagePreviewComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputAddressComponent) {
                materialButtonG = C0692u.d((InputAddressComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputCheckboxComponent) {
                materialButtonG = C0695x.c((InputCheckboxComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputCheckboxGroupComponent) {
                materialButtonG = C0697z.b((InputCheckboxGroupComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputConfirmationCodeComponent) {
                materialButtonG = C0661C.e((InputConfirmationCodeComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputDateComponent) {
                materialButtonG = E.b((InputDateComponent) uiComponent, uiComponentHelper, null, 2, null);
            } else if (uiComponent instanceof InputMaskedTextComponent) {
                materialButtonG = K.f((InputMaskedTextComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputMultiSelectComponent) {
                materialButtonG = L.a((InputMultiSelectComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputNumberComponent) {
                materialButtonG = M.a((InputNumberComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputPhoneNumberComponent) {
                materialButtonG = N.a((InputPhoneNumberComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputRadioGroupComponent) {
                materialButtonG = Q.c((InputRadioGroupComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputSelectComponent) {
                materialButtonG = T.a((InputSelectComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputTextComponent) {
                materialButtonG = V.b((InputTextComponent) uiComponent, uiComponentHelper, null, 2, null);
            } else if (uiComponent instanceof LocalImageComponent) {
                materialButtonG = Y.c((LocalImageComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof PrivacyPolicyComponent) {
                materialButtonG = d0.a((PrivacyPolicyComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof QRCodeComponent) {
                materialButtonG = e0.a((QRCodeComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof RemoteImageComponent) {
                materialButtonG = g0.i((RemoteImageComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof SpacerComponent) {
                materialButtonG = m0.a((SpacerComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof TextComponent) {
                materialButtonG = q0.a((TextComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof TitleComponent) {
                materialButtonG = r0.a((TitleComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof InputTextAreaComponent) {
                materialButtonG = U.a((InputTextAreaComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof BrandingComponent) {
                materialButtonG = C0676d.a((BrandingComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof CreatePersonaSheetComponent) {
                materialButtonG = C0681i.a((CreatePersonaSheetComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof VerifyPersonaButtonComponent) {
                materialButtonG = u0.a((VerifyPersonaButtonComponent) uiComponent, uiComponentHelper);
            } else if (uiComponent instanceof ClickableStackComponent) {
                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                materialButtonG = C0678f.a(clickableStackComponent, uiComponentHelper, componentViews, a.i(clickableStackComponent.getChildren(), context, isLoading, componentViews, uiComponentHelper));
            } else if (uiComponent instanceof HorizontalStackComponent) {
                HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) uiComponent;
                materialButtonG = r.a(horizontalStackComponent, uiComponentHelper, componentViews, a.i(horizontalStackComponent.getChildren(), context, isLoading, componentViews, uiComponentHelper));
            } else if (uiComponent instanceof FooterComponent) {
                FooterComponent footerComponent = (FooterComponent) uiComponent;
                materialButtonG = C0686n.a(footerComponent, uiComponentHelper, componentViews, a.i(footerComponent.getChildren(), context, isLoading, componentViews, uiComponentHelper));
            } else if (uiComponent instanceof InputCurrencyComponent) {
                materialButtonG = D.a((InputCurrencyComponent) uiComponent, uiComponentHelper);
            } else {
                if (!(uiComponent instanceof InputInternationalDbComponent)) {
                    throw new m();
                }
                materialButtonG = com.withpersona.sdk2.inquiry.steps.ui.components.a.g((InputInternationalDbComponent) uiComponent, uiComponentHelper);
            }
            if (materialButtonG != null) {
                componentViews.add(new ComponentView(uiComponent, materialButtonG));
            }
            if (materialButtonG != null) {
                arrayList.add(materialButtonG);
            }
        }
        return arrayList;
    }

    public final void b(@NotNull ConstraintLayout parentView) {
        Object next;
        Editable text;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ArrayList<View> focusables = parentView.getFocusables(2);
        Intrinsics.checkNotNullExpressionValue(focusables, "getFocusables(...)");
        Iterator<T> it = focusables.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view = (View) next;
            if ((view instanceof EditText) && ((text = ((EditText) view).getText()) == null || StringsKt.Y(text))) {
                break;
            }
        }
        final View view2 = (View) next;
        if (view2 != null) {
            view2.requestFocus();
            view2.post(new Runnable() {
                @Override
                public final void run() {
                    j.c(view2);
                }
            });
        }
    }

    @NotNull
    public final f f(@NotNull Context context, @NotNull UiComponentScreen uiScreen, boolean isLoading, boolean isModal, boolean shouldApplyFocus) throws m {
        FooterComponent footerComponent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s0 s0Var = new s0(context);
        View viewE = e(context, uiScreen, isLoading, linkedHashMap, s0Var, isModal, shouldApplyFocus);
        List<UiComponent> components = uiScreen.getComponents();
        if (components != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : components) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        } else {
            footerComponent = null;
        }
        View viewD = footerComponent != null ? d(context, footerComponent, isLoading, linkedHashMap, s0Var) : null;
        o.b(viewE, new a(s0Var));
        return new f(new g(linkedHashMap), viewE, viewD);
    }

    @NotNull
    public final h h(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, String cancelButtonName) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        return new h(uiScreen, componentNamesToActions, onCancelled, cancelButtonName, false, 16, null);
    }

    @NotNull
    public final f j(@NotNull C0484b binding, @NotNull UiComponentScreen uiScreen, Function2<? super C0484b, ? super Map<String, ComponentView>, Unit> initialRendering, boolean shouldApplyFocus) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Context context = binding.a().getContext();
        Intrinsics.d(context);
        f fVarG = g(this, context, uiScreen, false, shouldApplyFocus, false, 16, null);
        if (uiScreen.f() == StyleElements.PositionType.CENTER) {
            binding.c.setFillViewport(true);
            fVarG.getContentView().setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            View contentView = fVarG.getContentView();
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            contentView.setLayoutParams(layoutParams2);
        }
        binding.b.addView(fVarG.getContentView());
        ConstraintLayout constraintLayoutC = binding.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutC, "getRoot(...)");
        C0601d.c(constraintLayoutC, false, false, false, false, 13, null);
        if (fVarG.getFooterView() != null) {
            binding.d.addView(fVarG.getFooterView());
            C0601d.c(fVarG.getFooterView(), false, false, false, false, 2, null);
        }
        if (initialRendering != null) {
            initialRendering.invoke(binding, fVarG.getViewBindings().a());
        }
        Integer numD = uiScreen.d();
        if (numD != null) {
            binding.e.setControlsColor(numD.intValue());
        }
        return fVarG;
    }
}
