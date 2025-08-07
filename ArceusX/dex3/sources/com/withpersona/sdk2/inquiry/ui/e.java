package com.withpersona.sdk2.inquiry.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.e0;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C0494f;
import com.squareup.workflow1.ui.E;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
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
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.ui.f;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import ha.C0456d;
import ha.C0750f;
import j9.C0601d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0726c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import l9.ComponentView;
import m9.C0633a;
import n9.C0688p;
import n9.InterfaceC0684l;
import n9.InterfaceC0689q;
import n9.S;
import n9.c0;
import org.jetbrains.annotations.NotNull;
import p9.C0733a;
import q9.v;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\u0016\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001b\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u0011*\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u0011*\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u0011*\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010 J%\u0010(\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&H\u0002¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u0002002\u0006\u0010\u001a\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J)\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002050\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002040&H\u0002¢\u0006\u0004\b6\u00107JE\u0010<\u001a\u00020\u00112\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000205092\f\u0010;\u001a\b\u0012\u0004\u0012\u0002040&H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020>*\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010C\u001a\u00020B*\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020\f0&H\u0002¢\u0006\u0004\bF\u0010GJ+\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002050\u000bH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00110]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00110]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010_R(\u0010f\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010k\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00110g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010n\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u00110g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010j¨\u0006p"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/e;", "Lcom/squareup/workflow1/ui/j;", "Lcom/withpersona/sdk2/inquiry/ui/f$d$a;", "Lx9/a;", "binding", "initialRendering", "<init>", "(Lx9/a;Lcom/withpersona/sdk2/inquiry/ui/f$d$a;)V", "rendering", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "", "", "", "componentParams", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "errors", "", "F", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/squareup/workflow1/ui/y;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "component", "d0", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/squareup/workflow1/ui/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/view/View;", "view", "O", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lcom/squareup/workflow1/ui/y;)V", "", "isLoading", "x", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V", "z", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "y", "Ll9/f;", "result", "", "components", "A", "(Ll9/f;Ljava/util/List;)V", "", "firstBelowTheFoldChildIndex", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "footerComponent", "G", "(Ll9/f;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "D", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Ll9/a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "B", "(Ljava/util/List;)Ljava/util/Map;", "initialComponentValues", "", "outMap", "componentViews", "C", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "L", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "K", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "M", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "N", "(Ljava/util/Map;)Ljava/util/Map;", "J", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/squareup/workflow1/ui/y;)V", "b", "Lx9/a;", "c", "Ljava/util/Map;", "componentNameToView", "Lr9/f;", "d", "Lr9/f;", "inputSelectBottomSheetController", "Lw9/j;", "e", "Lw9/j;", "signatureBottomSheetController", "Lw9/b;", "f", "Lw9/b;", "nestedUiBottomSheetController", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "onComplete", "h", "onCancel", "Lkotlin/Function2;", "i", "Lkotlin/jvm/functions/Function2;", "onClick", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "j", "Lkotlin/jvm/functions/Function1;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "k", "onVerifyPersonaClick", "l", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
@SuppressLint({"ResourceType"})
public final class e implements com.squareup.workflow1.ui.j<f.d.a> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final x9.a binding;

    @NotNull
    private final Map<String, View> componentNameToView;

    @NotNull
    private final C0750f inputSelectBottomSheetController;

    @NotNull
    private final w9.j signatureBottomSheetController;

    @NotNull
    private final w9.b nestedUiBottomSheetController;

    @NotNull
    private Function0<Unit> onComplete;

    @NotNull
    private Function0<Unit> onCancel;

    @NotNull
    private Function2<? super UiComponent, ? super Boolean, Unit> onClick;

    @NotNull
    private Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan;

    @NotNull
    private Function1<? super VerifyPersonaButtonComponent, Unit> onVerifyPersonaClick;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<WindowInsetsCompat, Unit> {
        final l9.f d;
        final e e;

        a(l9.f fVar, e eVar) {
            super(1);
            this.d = fVar;
            this.e = eVar;
        }

        public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            int i = insets.bottom;
            int i2 = insetsIgnoringVisibility.top;
            int iMax = Integer.max(insetsIgnoringVisibility.bottom, i);
            int i3 = insetsIgnoringVisibility.left;
            int i4 = insetsIgnoringVisibility.right;
            View footerView = this.d.getFooterView();
            if (footerView == null) {
                this.e.binding.j.setPadding(i3, i2, i4, iMax);
            } else {
                NestedScrollView nestedScrollView = this.e.binding.j;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nestedScroll");
                nestedScrollView.setPadding(i3, i2, i4, nestedScrollView.getPaddingBottom());
                footerView.setPadding(i3, footerView.getPaddingTop(), i4, iMax);
            }
            MaterialDivider materialDivider = this.e.binding.d;
            Intrinsics.checkNotNullExpressionValue(materialDivider, "footerDivider");
            ViewGroup.LayoutParams layoutParams = materialDivider.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = insetsIgnoringVisibility.bottom;
            materialDivider.setLayoutParams(marginLayoutParams);
            CoordinatorLayout coordinatorLayout = this.e.binding.f;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "footerSheetCoordinatorLayout");
            coordinatorLayout.setPadding(i3, coordinatorLayout.getPaddingTop(), i4, iMax);
        }

        public Object invoke(Object obj) {
            a((WindowInsetsCompat) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/e$b;", "Lcom/squareup/workflow1/ui/A;", "Lcom/withpersona/sdk2/inquiry/ui/f$d$a;", "<init>", "()V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "type", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion implements A<f.d.a> {
        private final C0494f<f.d.a> a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$d$a;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/f$d$a;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements aa.o<f.d.a, ViewEnvironment, Context, ViewGroup, View> {
            public static final a d = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            class C0210a extends kotlin.jvm.internal.j implements Function2<f.d.a, ViewEnvironment, Unit> {
                C0210a(Object obj) {
                    super(2, obj, e.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void f(@NotNull f.d.a aVar, @NotNull ViewEnvironment viewEnvironment) {
                    Intrinsics.checkNotNullParameter(aVar, "p0");
                    Intrinsics.checkNotNullParameter(viewEnvironment, "p1");
                    ((e) ((kotlin.jvm.internal.d) this).receiver).a(aVar, viewEnvironment);
                }

                public Object invoke(Object obj, Object obj2) {
                    f((f.d.a) obj, (ViewEnvironment) obj2);
                    return Unit.a;
                }
            }

            a() {
                super(4);
            }

            @NotNull
            public final View h(@NotNull f.d.a aVar, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(aVar, "initialRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "initialViewEnvironment");
                Intrinsics.checkNotNullParameter(context, "context");
                Context context2 = viewGroup != null ? viewGroup.getContext() : null;
                if (context2 == null) {
                    context2 = context;
                }
                x9.a aVarD = x9.a.d(LayoutInflater.from(context2).cloneInContext(context));
                CoordinatorLayout coordinatorLayoutC = aVarD.a();
                Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC, "getRoot(...)");
                Intrinsics.d(aVarD);
                E.a(coordinatorLayoutC, aVar, viewEnvironment, new C0210a(new e(aVarD, aVar)));
                CoordinatorLayout coordinatorLayoutC2 = aVarD.a();
                Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC2, "let(...)");
                return coordinatorLayoutC2;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public View a(@NotNull f.d.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override
        @NotNull
        public fa.c<? super f.d.a> getType() {
            return this.a.getType();
        }

        private Companion() {
            this.a = new C0494f<>(z.b(f.d.a.class), a.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "<anonymous parameter 0>", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<GovernmentIdNfcScanComponent, Unit> {
        public static final c d = new c();

        c() {
            super(1);
        }

        public final void a(@NotNull GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
            Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<anonymous parameter 0>");
        }

        public Object invoke(Object obj) {
            a((GovernmentIdNfcScanComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final d d = new d();

        d() {
            super(0);
        }

        public final void m596invoke() {
        }

        public Object invoke() {
            m596invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0211e extends kotlin.jvm.internal.l implements Function2<UiComponent, Boolean, Unit> {
        public static final C0211e d = new C0211e();

        C0211e() {
            super(2);
        }

        public final void a(@NotNull UiComponent uiComponent, boolean z) {
            Intrinsics.checkNotNullParameter(uiComponent, "<anonymous parameter 0>");
        }

        public Object invoke(Object obj, Object obj2) {
            a((UiComponent) obj, ((Boolean) obj2).booleanValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final f d = new f();

        f() {
            super(0);
        }

        public final void m597invoke() {
        }

        public Object invoke() {
            m597invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<VerifyPersonaButtonComponent, Unit> {
        public static final g d = new g();

        g() {
            super(1);
        }

        public final void a(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent) {
            Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "it");
        }

        public Object invoke(Object obj) {
            a((VerifyPersonaButtonComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/withpersona/sdk2/inquiry/ui/e$h", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class h extends BottomSheetBehavior.f {
        final BottomSheetBehavior<NestedScrollView> b;

        h(BottomSheetBehavior<NestedScrollView> bottomSheetBehavior) {
            this.b = bottomSheetBehavior;
        }

        public void b(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            e.this.binding.j.setPadding(e.this.binding.j.getPaddingLeft(), e.this.binding.j.getPaddingTop(), e.this.binding.j.getPaddingRight(), this.b.p0() + ((int) (slideOffset * (e.this.binding.h.getHeight() - this.b.p0()))));
        }

        public void c(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final f.d.a e;

        i(f.d.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m598invoke();
            return Unit.a;
        }

        public final void m598invoke() {
            if (e.this.inputSelectBottomSheetController.i() || e.this.signatureBottomSheetController.j()) {
                return;
            }
            if (this.e.getNavigationState().getShowBackButton()) {
                this.e.j().invoke();
            } else {
                this.e.k().invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.l implements Function0<Unit> {
        final f.d.a d;

        j(f.d.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m599invoke();
            return Unit.a;
        }

        public final void m599invoke() {
            this.d.k().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "tappedComponent", "", "isTappedComponentVisible", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.jvm.internal.l implements Function2<UiComponent, Boolean, Unit> {
        final f.d.a d;
        final e e;
        final List<ComponentView> i;

        k(f.d.a aVar, e eVar, List<ComponentView> list) {
            super(2);
            this.d = aVar;
            this.e = eVar;
            this.i = list;
        }

        public final void a(@NotNull UiComponent uiComponent, boolean z) {
            Intrinsics.checkNotNullParameter(uiComponent, "tappedComponent");
            this.d.l().invoke(uiComponent, Boolean.valueOf(z), this.e.B(this.i));
        }

        public Object invoke(Object obj, Object obj2) {
            a((UiComponent) obj, ((Boolean) obj2).booleanValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.jvm.internal.l implements Function1<Option, CharSequence> {
        public static final l d = new l();

        l() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "it");
            return option.getText();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.l implements Function0<Unit> {
        final UiComponent d;
        final e e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, Unit> {
            final UiComponent d;

            a(UiComponent uiComponent) {
                super(1);
                this.d = uiComponent;
            }

            public final void a(@NotNull List<Option> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                ((InputInternationalDbComponent) this.d).getCountryOptionsController().c(list);
                ((InputInternationalDbComponent) this.d).getIdTypeOptionsController().c(CollectionsKt.j());
                ((InputInternationalDbComponent) this.d).getIdValueController().c("");
            }

            public Object invoke(Object obj) {
                a((List) obj);
                return Unit.a;
            }
        }

        m(UiComponent uiComponent, e eVar) {
            super(0);
            this.d = uiComponent;
            this.e = eVar;
        }

        public Object invoke() {
            m600invoke();
            return Unit.a;
        }

        public final void m600invoke() {
            e.Z(this.e, ((InputInternationalDbComponent) this.d).getCountrySelectComponent(), new a(this.d));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.l implements Function0<Unit> {
        final UiComponent d;
        final e e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, Unit> {
            final UiComponent d;

            a(UiComponent uiComponent) {
                super(1);
                this.d = uiComponent;
            }

            public final void a(@NotNull List<Option> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                ((InputInternationalDbComponent) this.d).getIdTypeOptionsController().c(list);
                ((InputInternationalDbComponent) this.d).getIdValueController().c("");
            }

            public Object invoke(Object obj) {
                a((List) obj);
                return Unit.a;
            }
        }

        n(UiComponent uiComponent, e eVar) {
            super(0);
            this.d = uiComponent;
            this.e = eVar;
        }

        public Object invoke() {
            m601invoke();
            return Unit.a;
        }

        public final void m601invoke() {
            e.Z(this.e, ((InputInternationalDbComponent) this.d).o(), new a(this.d));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedItems", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, Unit> {
        final Function1<List<Option>, Unit> e;

        o(Function1<? super List<Option>, Unit> function1) {
            super(1);
            this.e = function1;
        }

        public final void a(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "selectedItems");
            e.this.binding.i.getBackButton().setEnabled(true);
            e.this.binding.i.setImportantForAccessibility(1);
            e.this.binding.l.setImportantForAccessibility(1);
            if (list.isEmpty()) {
                return;
            }
            this.e.invoke(list);
        }

        public Object invoke(Object obj) {
            a((List) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "cancelled", "Landroid/graphics/Bitmap;", "result", "", "a", "(ZLandroid/graphics/Bitmap;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.jvm.internal.l implements Function2<Boolean, Bitmap, Unit> {
        final UiComponent e;

        p(UiComponent uiComponent) {
            super(2);
            this.e = uiComponent;
        }

        public final void a(boolean z, Bitmap bitmap) {
            e.this.binding.i.getBackButton().setEnabled(true);
            e.this.binding.i.setImportantForAccessibility(1);
            e.this.binding.l.setImportantForAccessibility(1);
            if (z) {
                return;
            }
            ((ESignatureComponent) this.e).getBitmapController().c(bitmap);
        }

        public Object invoke(Object obj, Object obj2) {
            a(((Boolean) obj).booleanValue(), (Bitmap) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final View d;
        final f.d.a e;
        final e i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        public static final class a extends kotlin.jvm.internal.l implements Function1<SubmitButtonComponent, Boolean> {
            public static final a d = new a();

            public a() {
                super(1);
            }

            @NotNull
            public final Boolean invoke(@NotNull SubmitButtonComponent submitButtonComponent) {
                Intrinsics.checkNotNullParameter(submitButtonComponent, "it");
                return Boolean.TRUE;
            }
        }

        q(View view, f.d.a aVar, e eVar) {
            super(0);
            this.d = view;
            this.e = aVar;
            this.i = eVar;
        }

        public Object invoke() {
            m602invoke();
            return Unit.a;
        }

        public final void m602invoke() {
            if (C0733a.a.b(this.d)) {
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) C0726c.a(this.e.e(), z.b(SubmitButtonComponent.class), a.d);
                if (submitButtonComponent != null) {
                    this.i.onClick.invoke(submitButtonComponent, Boolean.valueOf(this.d.getVisibility() == 0));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedItems", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class r extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, Unit> {
        final TextInputLayout e;
        final c0<?> i;

        r(TextInputLayout textInputLayout, c0<?> c0Var) {
            super(1);
            this.e = textInputLayout;
            this.i = c0Var;
        }

        public final void a(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "selectedItems");
            e.this.binding.i.getBackButton().setEnabled(true);
            this.e.setEnabled(true);
            e.this.binding.i.setImportantForAccessibility(1);
            e.this.binding.l.setImportantForAccessibility(1);
            this.i.getSelectedOptionsController().c(list);
        }

        public Object invoke(Object obj) {
            a((List) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class s extends kotlin.jvm.internal.l implements Function1<UiComponent, Unit> {
        final f.d.a d;
        final SheetComponent e;

        s(f.d.a aVar, SheetComponent sheetComponent) {
            super(1);
            this.d = aVar;
            this.e = sheetComponent;
        }

        public final void a(@NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            this.d.n().invoke(this.e, uiComponent);
        }

        public Object invoke(Object obj) {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class t extends kotlin.jvm.internal.l implements Function1<UiComponent, Unit> {
        t() {
            super(1);
        }

        public final void a(@NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            e.this.nestedUiBottomSheetController.e();
        }

        public Object invoke(Object obj) {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    public e(@NotNull x9.a aVar, @NotNull f.d.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "binding");
        Intrinsics.checkNotNullParameter(aVar2, "initialRendering");
        this.binding = aVar;
        CoordinatorLayout coordinatorLayoutC = aVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC, "getRoot(...)");
        this.inputSelectBottomSheetController = new C0750f(coordinatorLayoutC);
        CoordinatorLayout coordinatorLayoutC2 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC2, "getRoot(...)");
        this.signatureBottomSheetController = new w9.j(coordinatorLayoutC2);
        CoordinatorLayout coordinatorLayoutC3 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC3, "getRoot(...)");
        this.nestedUiBottomSheetController = new w9.b(coordinatorLayoutC3);
        this.onComplete = f.d;
        this.onCancel = d.d;
        this.onClick = C0211e.d;
        this.launchNfcScan = c.d;
        this.onVerifyPersonaClick = g.d;
        Context context = aVar.a().getContext();
        l9.j jVar = l9.j.a;
        Intrinsics.d(context);
        l9.f fVarG = l9.j.g(jVar, context, new UiComponentScreen(aVar2.e(), aVar2.getStyles()), aVar2.getIsLoading(), false, false, 16, null);
        Integer numC = aVar2.c();
        if (numC != null) {
            aVar.k.setBackgroundColor(numC.intValue());
        }
        Drawable drawableA = aVar2.a(context);
        if (drawableA != null) {
            aVar.k.setBackground(drawableA);
            aVar.c.setBackgroundColor(0);
        }
        Integer numG = aVar2.g();
        if (numG != null) {
            aVar.i.setControlsColor(numG.intValue());
        }
        Set<Map.Entry<String, ComponentView>> setEntrySet = fVarG.getViewBindings().a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = P9.t.a(entry.getKey(), ((ComponentView) entry.getValue()).d());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        this.componentNameToView = linkedHashMap;
        this.binding.l.addView(fVarG.getContentView());
        if (aVar2.r() == StyleElements.PositionType.CENTER) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.f(this.binding.b);
            dVar.h(this.binding.l.getId(), 4, this.binding.b.getId(), 4);
            dVar.c(this.binding.b);
        }
        if (fVarG.getFooterView() != null) {
            A(fVarG, aVar2.e());
        }
        CoordinatorLayout coordinatorLayoutC4 = this.binding.a();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutC4, "getRoot(...)");
        C0601d.e(coordinatorLayoutC4, new a(fVarG, this));
    }

    private final void A(l9.f result, List<? extends UiComponent> components) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof FooterComponent) {
                arrayList.add(obj);
            }
        }
        FooterComponent footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        if (footerComponent == null) {
            return;
        }
        Footer.Attributes attributes = footerComponent.e().getAttributes();
        Integer firstBelowTheFoldChildIndex = attributes != null ? attributes.getFirstBelowTheFoldChildIndex() : null;
        if (firstBelowTheFoldChildIndex != null) {
            G(result, firstBelowTheFoldChildIndex.intValue(), footerComponent);
        } else {
            this.binding.c.addView(result.getFooterView());
        }
    }

    public final Map<String, ComponentParam> B(List<ComponentView> components) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> mapH = F.h();
        int i2 = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            C(mapH, linkedHashMap, components);
            Map<String, ? extends Object> mapN = N(linkedHashMap);
            if (Intrinsics.b(mapH, mapN) || i2 >= 20) {
                break;
            }
            i2++;
            mapH = mapN;
        }
        return linkedHashMap;
    }

    private final void C(Map<String, ? extends Object> initialComponentValues, Map<String, ComponentParam> outMap, List<ComponentView> componentViews) {
        Boolean value;
        for (ComponentView componentView : componentViews) {
            UiComponent component = componentView.getComponent();
            componentView.getView();
            InterfaceC0689q interfaceC0689q = component instanceof InterfaceC0689q ? (InterfaceC0689q) component : null;
            JsonLogicBoolean hidden = interfaceC0689q != null ? interfaceC0689q.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(initialComponentValues, initialComponentValues.get(component.getName()))) == null) ? false : value.booleanValue())) {
                if (component instanceof InputTextComponent) {
                    outMap.put(component.getName(), L(((InputTextComponent) component).getTextController().b()));
                } else if (component instanceof InputTextAreaComponent) {
                    outMap.put(component.getName(), L(((InputTextAreaComponent) component).getTextController().b()));
                } else if (component instanceof InputPhoneNumberComponent) {
                    outMap.put(component.getName(), L(((InputPhoneNumberComponent) component).getTextController().b()));
                } else if (component instanceof InputConfirmationCodeComponent) {
                    outMap.put(component.getName(), L(((InputConfirmationCodeComponent) component).getTextController().b()));
                } else if (component instanceof InputDateComponent) {
                    outMap.put(component.getName(), L(((InputDateComponent) component).getDateController().f()));
                } else if (component instanceof InputInternationalDbComponent) {
                    String name = component.getName();
                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                    outMap.put(name, new ComponentParam.InternationalDbParams(inputInternationalDbComponent.getSelectedCountry(), inputInternationalDbComponent.getSelectedIdType(), inputInternationalDbComponent.getIdValue()));
                } else if (component instanceof InputMaskedTextComponent) {
                    outMap.put(component.getName(), L(((InputMaskedTextComponent) component).getTextController().b()));
                } else if (component instanceof InputSelectComponent) {
                    InputSelectComponent inputSelectComponent = (InputSelectComponent) component;
                    if (!inputSelectComponent.b().isEmpty()) {
                        outMap.put(component.getName(), L(((Option) CollectionsKt.M(inputSelectComponent.b())).getValue()));
                    }
                } else if (component instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) component;
                    if (!inputMultiSelectComponent.b().isEmpty()) {
                        String name2 = component.getName();
                        List<Option> listB = inputMultiSelectComponent.b();
                        ArrayList arrayList = new ArrayList(CollectionsKt.t(listB, 10));
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Option) it.next()).getValue());
                        }
                        outMap.put(name2, M(arrayList));
                    }
                } else if (component instanceof InputAddressComponent) {
                    String name3 = component.getName();
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                    outMap.put(name3, new ComponentParam.Address(inputAddressComponent.getTextControllerForAddressStreet1().b(), inputAddressComponent.getTextControllerForAddressStreet2().b(), inputAddressComponent.getTextControllerForAddressCity().b(), inputAddressComponent.getTextControllerForAddressSubdivision().b(), inputAddressComponent.getTextControllerForAddressPostalCode().b()));
                } else if (component instanceof UiComponentGroup) {
                    List<UiComponent> children = ((UiComponentGroup) component).getChildren();
                    ArrayList arrayList2 = new ArrayList();
                    for (UiComponent uiComponent : children) {
                        View view = this.componentNameToView.get(uiComponent.getName());
                        ComponentView componentView2 = view == null ? null : new ComponentView(uiComponent, view);
                        if (componentView2 != null) {
                            arrayList2.add(componentView2);
                        }
                    }
                    C(initialComponentValues, outMap, arrayList2);
                } else if (component instanceof InputCheckboxComponent) {
                    outMap.put(component.getName(), new ComponentParam.ComponentBoolean(((InputCheckboxComponent) component).getTwoStateViewController().b()));
                } else if (component instanceof InputCheckboxGroupComponent) {
                    outMap.put(component.getName(), M(CollectionsKt.r0(((InputCheckboxGroupComponent) component).g())));
                } else if (component instanceof InputRadioGroupComponent) {
                    outMap.put(component.getName(), new ComponentParam.ComponentString(((InputRadioGroupComponent) component).getTextController().b()));
                } else if (component instanceof InputNumberComponent) {
                    Number numberB = ((InputNumberComponent) component).getNumberController().b();
                    if (numberB != null) {
                        outMap.put(component.getName(), K(numberB));
                    }
                } else if (component instanceof InputCurrencyComponent) {
                    Number numberB2 = ((InputCurrencyComponent) component).getNumberController().b();
                    if (numberB2 != null) {
                        outMap.put(component.getName(), K(numberB2));
                    }
                } else if (component instanceof ESignatureComponent) {
                    Bitmap bitmapB = ((ESignatureComponent) component).getBitmapController().b();
                    outMap.put(component.getName(), new ComponentParam.ESignature(bitmapB != null ? C0726c.d(bitmapB) : null));
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcData governmentIdNfcDataB = ((GovernmentIdNfcScanComponent) component).getNfcDataController().b();
                    if (governmentIdNfcDataB != null) {
                        outMap.put(component.getName(), new ComponentParam.GovernmentIdNfcScan(Base64.encodeToString(X9.h.g(t0.b.a(governmentIdNfcDataB.getDg1Uri())), 0), Base64.encodeToString(X9.h.g(t0.b.a(governmentIdNfcDataB.getDg2Uri())), 0), Base64.encodeToString(X9.h.g(t0.b.a(governmentIdNfcDataB.getSodUri())), 0), governmentIdNfcDataB.getChipAuthenticationStatus()));
                    }
                } else if (!(component instanceof ActionButtonComponent ? true : component instanceof CancelButtonComponent ? true : component instanceof CombinedStepButtonComponent ? true : component instanceof CompleteButtonComponent ? true : component instanceof SubmitButtonComponent ? true : component instanceof ImagePreviewComponent ? true : component instanceof LocalImageComponent ? true : component instanceof PrivacyPolicyComponent ? true : component instanceof QRCodeComponent ? true : component instanceof RemoteImageComponent ? true : component instanceof SpacerComponent ? true : component instanceof TextComponent ? true : component instanceof TitleComponent ? true : component instanceof BrandingComponent ? true : component instanceof CreatePersonaSheetComponent)) {
                    boolean z = component instanceof VerifyPersonaButtonComponent;
                }
            }
        }
    }

    private final void D(f.d.a rendering, final ClickableStackComponent component, final ConstraintLayout view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                com.withpersona.sdk2.inquiry.ui.e.E(component, this, view, view2);
            }
        });
        if (component.getIsActive()) {
            s9.h.a(view, component.e().getStyles());
        } else if (rendering.getIsLoading()) {
            s9.h.d(view, component.e().getStyles());
        }
    }

    public static final void E(ClickableStackComponent clickableStackComponent, e eVar, ConstraintLayout constraintLayout, View view) {
        Intrinsics.checkNotNullParameter(clickableStackComponent, "$component");
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(constraintLayout, "$view");
        clickableStackComponent.f(true);
        eVar.onClick.invoke(clickableStackComponent, Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }

    private final void F(f.d.a rendering, ViewEnvironment viewEnvironment, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors) {
        Object next;
        List<UiComponent> listE = rendering.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (obj instanceof SheetComponent) {
                arrayList.add(obj);
            }
        }
        SheetComponent sheetComponentC = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (sheetComponentC != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.b(((SheetComponent) next).getName(), sheetComponentC.getName())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SheetComponent sheetComponent = (SheetComponent) next;
            if (sheetComponent != null && !sheetComponent.getShowing()) {
                this.nestedUiBottomSheetController.e();
            }
        }
        if (this.nestedUiBottomSheetController.getCurrentSheetComponent() == null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SheetComponent sheetComponent2 = (SheetComponent) it2.next();
                if (!sheetComponent2.getShown()) {
                    sheetComponent2.U(true);
                    this.nestedUiBottomSheetController.g(sheetComponent2, viewEnvironment);
                    break;
                }
            }
        }
        SheetComponent sheetComponentC2 = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (sheetComponentC2 != null) {
            d0(rendering, viewEnvironment, sheetComponentC2, componentParams, errors);
        }
    }

    private final void G(l9.f result, int firstBelowTheFoldChildIndex, FooterComponent footerComponent) {
        this.binding.d.setVisibility(0);
        this.binding.f.setVisibility(0);
        View footerView = result.getFooterView();
        Drawable background = footerView != null ? footerView.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        Drawable background2 = this.binding.h.getBackground();
        LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(w9.c.k) : null;
        GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        this.binding.e.addView(result.getFooterView());
        UiComponent uiComponent = (UiComponent) CollectionsKt.O(footerComponent.getChildren(), firstBelowTheFoldChildIndex);
        final View view = this.componentNameToView.get(uiComponent != null ? uiComponent.getName() : null);
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(this.binding.h);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        this.binding.j.setVerticalFadingEdgeEnabled(false);
        if (view != null) {
            this.binding.g.setVisibility(0);
            this.binding.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i10, int i11) {
                    com.withpersona.sdk2.inquiry.ui.e.H(this.a, view, bottomSheetBehaviorM0, view2, i2, i3, i4, i5, i6, i7, i10, i11);
                }
            });
        } else {
            this.binding.g.setVisibility(4);
            this.binding.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i10, int i11) {
                    com.withpersona.sdk2.inquiry.ui.e.I(this.a, bottomSheetBehaviorM0, view2, i2, i3, i4, i5, i6, i7, i10, i11);
                }
            });
        }
        bottomSheetBehaviorM0.Y(new h(bottomSheetBehaviorM0));
    }

    public static final void H(e eVar, View view, BottomSheetBehavior bottomSheetBehavior, View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        int bottom = eVar.binding.e.getBottom();
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        eVar.binding.h.offsetDescendantRectToMyCoords(view, rect);
        int iP0 = bottomSheetBehavior.p0();
        bottomSheetBehavior.M0(rect.top);
        if (iP0 != bottomSheetBehavior.p0()) {
            NestedScrollView nestedScrollView = eVar.binding.j;
            nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), eVar.binding.j.getPaddingTop(), eVar.binding.j.getPaddingRight(), bottomSheetBehavior.p0());
        }
        bottomSheetBehavior.K0(bottom);
    }

    public static final void I(e eVar, BottomSheetBehavior bottomSheetBehavior, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        int bottom = eVar.binding.e.getBottom();
        bottomSheetBehavior.M0(bottom);
        bottomSheetBehavior.K0(bottom);
        NestedScrollView nestedScrollView = eVar.binding.j;
        nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), eVar.binding.j.getPaddingTop(), eVar.binding.j.getPaddingRight(), bottom);
    }

    private final ComponentParam.ComponentNumber K(Number number) {
        return new ComponentParam.ComponentNumber(number);
    }

    private final ComponentParam.ComponentString L(String str) {
        return new ComponentParam.ComponentString(str);
    }

    private final ComponentParam.ComponentStringList M(List<String> list) {
        return new ComponentParam.ComponentStringList(list);
    }

    private final Map<String, Object> N(Map<String, ? extends ComponentParam> map) {
        Set<Map.Entry<String, ? extends ComponentParam>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = P9.t.a(entry.getKey(), com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    private final void O(final f.d.a rendering, final UiComponent component, final View view, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors, final ViewEnvironment viewEnvironment) {
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String placeholder;
        InputAddressComponent inputAddressComponent;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        if (component instanceof CompleteButtonComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.e.P(this.d, view2);
                }
            });
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof SubmitButtonComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.e.Q(this.d, component, view, view2);
                }
            });
            buttonWithLoadingIndicator.setIsLoading(rendering.getIsLoading() && ((SubmitButtonComponent) component).getWasTapped());
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ActionButtonComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.e.R(this.d, component, view, view2);
                }
            });
            buttonWithLoadingIndicator2.setIsLoading(rendering.getIsLoading() && ((ActionButtonComponent) component).getWasTapped());
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof CancelButtonComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.e.S(this.d, view2);
                }
            });
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof VerifyPersonaButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.e.T(this.d, component, view2);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator3 != null) {
                buttonWithLoadingIndicator3.setIsLoading(rendering.getIsLoading() && ((VerifyPersonaButtonComponent) component).getWasTapped());
            }
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputTextComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout = (TextInputLayout) view;
            UiComponentError uiComponentError = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError = uiComponentError instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError : null;
            String message = uiInputComponentError != null ? uiInputComponentError.getMessage() : null;
            InputTextBasedComponentStyle styles = ((InputTextComponent) component).e().getStyles();
            u9.d.d(textInputLayout, message, styles != null ? styles.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputTextAreaComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            UiComponentError uiComponentError2 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError2 = uiComponentError2 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError2 : null;
            String message2 = uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null;
            InputTextBasedComponentStyle styles2 = ((InputTextAreaComponent) component).e().getStyles();
            u9.d.d(textInputLayout2, message2, styles2 != null ? styles2.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) component).getSubmitCodeHelper().b(new q(view, rendering, this));
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputAddressComponent) {
            Object tag = view.getTag();
            Intrinsics.e(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
            q9.d dVar = (q9.d) tag;
            List<View> listM = CollectionsKt.m(new TextInputLayout[]{dVar.f, dVar.n, dVar.b, dVar.m, dVar.l});
            InputAddressComponent inputAddressComponent2 = (InputAddressComponent) component;
            inputAddressComponent2.getTextControllerForAddressStreet1().c(inputAddressComponent2.getStreet1());
            Unit unit = Unit.a;
            inputAddressComponent2.getTextControllerForAddressStreet2().c(inputAddressComponent2.getStreet2());
            inputAddressComponent2.getTextControllerForAddressCity().c(inputAddressComponent2.getCity());
            inputAddressComponent2.getTextControllerForAddressSubdivision().c(inputAddressComponent2.getSubdivision());
            inputAddressComponent2.getTextControllerForAddressPostalCode().c(inputAddressComponent2.getPostalCode());
            List<Suggestion> listY = inputAddressComponent2.y();
            if (listY == null) {
                listY = CollectionsKt.j();
            }
            List<Suggestion> list = listY;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<Suggestion> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Suggestion) it.next()).toString());
            }
            List listR0 = CollectionsKt.r0(arrayList);
            InputAddress.AddressComponentStyle styles3 = inputAddressComponent2.e().getStyles();
            C0633a c0633a = new C0633a(context, android.R.layout.simple_list_item_1, listR0, (styles3 == null || (inputTextStyle2 = styles3.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            MaterialAutoCompleteTextView materialAutoCompleteTextView = dVar.g;
            Intrinsics.checkNotNullExpressionValue(materialAutoCompleteTextView, "addressFieldExpandedTextView");
            U(materialAutoCompleteTextView, c0633a, listM, dVar, rendering, component, list);
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = dVar.e;
            Intrinsics.checkNotNullExpressionValue(materialAutoCompleteTextView2, "addressFieldCollapsedTextView");
            U(materialAutoCompleteTextView2, c0633a, listM, dVar, rendering, component, list);
            if (Intrinsics.b(inputAddressComponent2.getIsAddressAutocompleteLoading(), Boolean.FALSE)) {
                Iterator it2 = listM.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                dVar.s.setVisibility(8);
            }
            if (errors.isEmpty()) {
                inputAddressComponent = inputAddressComponent2;
            } else {
                inputAddressComponent = inputAddressComponent2;
                inputAddressComponent.G(Boolean.FALSE);
            }
            if (Intrinsics.b(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.FALSE)) {
                dVar.i.setVisibility(8);
                dVar.j.setVisibility(0);
                dVar.k.setLabelFor(dVar.j.getId());
            } else if (Intrinsics.b(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.TRUE) || inputAddressComponent.getIsAddressComponentsCollapsed() == null) {
                dVar.i.setVisibility(0);
                dVar.j.setVisibility(8);
                dVar.k.setLabelFor(dVar.i.getId());
            }
            z(view, componentParams, component);
            for (View view2 : listM) {
                Intrinsics.d(view2);
                y(view2, componentParams, component, rendering.getIsLoading());
            }
            UiComponentError uiComponentError3 = errors.get(component.getName());
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = uiComponentError3 instanceof UiComponentError.UiInputAddressComponentError ? (UiComponentError.UiInputAddressComponentError) uiComponentError3 : null;
            InputAddress.AddressComponentStyle styles4 = inputAddressComponent.e().getStyles();
            TextBasedComponentStyle errorTextStyle = (styles4 == null || (inputTextStyle = styles4.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            if ((uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage() : null) != null) {
                TextInputLayout textInputLayout3 = dVar.d;
                Intrinsics.checkNotNullExpressionValue(textInputLayout3, "addressFieldCollapsed");
                u9.d.d(textInputLayout3, uiInputAddressComponentError.getMessage().get("street_1"), errorTextStyle);
                TextInputLayout textInputLayout4 = dVar.f;
                Intrinsics.checkNotNullExpressionValue(textInputLayout4, "addressFieldExpanded");
                u9.d.d(textInputLayout4, uiInputAddressComponentError.getMessage().get("street_1"), errorTextStyle);
                TextInputLayout textInputLayout5 = dVar.n;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "addressSuite");
                u9.d.d(textInputLayout5, uiInputAddressComponentError.getMessage().get("street_2"), errorTextStyle);
                TextInputLayout textInputLayout6 = dVar.b;
                Intrinsics.checkNotNullExpressionValue(textInputLayout6, "addressCity");
                u9.d.d(textInputLayout6, uiInputAddressComponentError.getMessage().get("city"), errorTextStyle);
                TextInputLayout textInputLayout7 = dVar.m;
                Intrinsics.checkNotNullExpressionValue(textInputLayout7, "addressSubdivision");
                u9.d.d(textInputLayout7, uiInputAddressComponentError.getMessage().get("subdivision"), errorTextStyle);
                TextInputLayout textInputLayout8 = dVar.l;
                Intrinsics.checkNotNullExpressionValue(textInputLayout8, "addressPostalCode");
                u9.d.d(textInputLayout8, uiInputAddressComponentError.getMessage().get("postal_code"), errorTextStyle);
            }
            Unit unit2 = Unit.a;
            return;
        }
        if (component instanceof InputSelectComponent ? true : component instanceof InputMultiSelectComponent) {
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            final TextInputLayout textInputLayout9 = (TextInputLayout) view;
            Intrinsics.e(component, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
            final S s2 = (S) component;
            final c0 c0Var = (c0) component;
            textInputLayout9.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    com.withpersona.sdk2.inquiry.ui.e.W(this.d, textInputLayout9, s2, c0Var, view3);
                }
            });
            EditText editText = textInputLayout9.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        com.withpersona.sdk2.inquiry.ui.e.X(this.d, textInputLayout9, s2, c0Var, view3);
                    }
                });
                Unit unit3 = Unit.a;
            }
            EditText editText2 = textInputLayout9.getEditText();
            if (editText2 != null) {
                editText2.setText(CollectionsKt.U(c0Var.getSelectedOptionsController().b(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, l.d, 30, (Object) null));
                Unit unit4 = Unit.a;
            }
            UiComponentError uiComponentError4 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError3 = uiComponentError4 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError4 : null;
            String message3 = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle styles5 = s2.getStyles();
            u9.d.d(textInputLayout9, message3, styles5 != null ? styles5.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            Intrinsics.e(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
            q9.m mVar = (q9.m) tag2;
            UiComponentError uiComponentError5 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError4 = uiComponentError5 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError5 : null;
            String message4 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView textView = mVar.c;
            Intrinsics.checkNotNullExpressionValue(textView, "radioGroupError");
            if (message4 != null && !StringsKt.Y(message4)) {
                z = false;
            }
            if (z) {
                textView.setVisibility(8);
                textView.setText("");
            } else {
                textView.setVisibility(0);
                textView.setText(message4);
            }
            x(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById = view.findViewById(l9.d.l0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            Iterator it3 = e0.a((ViewGroup) viewFindViewById).iterator();
            while (it3.hasNext()) {
                y((View) it3.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit5 = Unit.a;
            return;
        }
        if (component instanceof UiComponentGroup) {
            for (UiComponent uiComponent : ((UiComponentGroup) component).getChildren()) {
                View view3 = this.componentNameToView.get(uiComponent.getName());
                if (view3 != null) {
                    O(rendering, uiComponent, view3, componentParams, errors, viewEnvironment);
                }
            }
            if ((component instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                D(rendering, (ClickableStackComponent) component, (ConstraintLayout) view);
            }
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    com.withpersona.sdk2.inquiry.ui.e.Y(this.d, component, view, view4);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator4 != null) {
                buttonWithLoadingIndicator4.setIsLoading(rendering.getIsLoading() && ((ButtonComponent) component).getWasTapped());
            }
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputDateComponent) {
            Object tag3 = view.getTag();
            Intrinsics.e(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
            q9.f fVar = (q9.f) tag3;
            UiComponentError uiComponentError6 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError5 = uiComponentError6 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError6 : null;
            if (uiInputComponentError5 != null) {
                fVar.e.setText(uiInputComponentError5.getMessage());
                fVar.e.setVisibility(0);
            } else {
                fVar.e.setText("");
                fVar.e.setVisibility(8);
            }
            z(view, componentParams, component);
            View view4 = fVar.f;
            Intrinsics.checkNotNullExpressionValue(view4, "month");
            y(view4, componentParams, component, rendering.getIsLoading());
            View view5 = fVar.c;
            Intrinsics.checkNotNullExpressionValue(view5, "day");
            y(view5, componentParams, component, rendering.getIsLoading());
            View view6 = fVar.h;
            Intrinsics.checkNotNullExpressionValue(view6, "year");
            y(view6, componentParams, component, rendering.getIsLoading());
            Unit unit6 = Unit.a;
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            Object tag4 = view.getTag();
            Intrinsics.e(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
            q9.p pVar = (q9.p) tag4;
            UiComponentError uiComponentError7 = errors.get(component.getName());
            UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = uiComponentError7 instanceof UiComponentError.UiInputInternationalDbComponentError ? (UiComponentError.UiInputInternationalDbComponentError) uiComponentError7 : null;
            Map<String, String> message5 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
            com.withpersona.sdk2.inquiry.steps.ui.components.a.j((InputInternationalDbComponent) component, pVar, new m(component, this), new n(component, this), message5 != null ? message5.get("idb_country") : null, message5 != null ? message5.get("idb_type") : null, message5 != null ? message5.get("idb_value") : null);
            x(view, componentParams, component, rendering.getIsLoading());
            Unit unit7 = Unit.a;
            return;
        }
        if (component instanceof InputMaskedTextComponent) {
            UiComponentError uiComponentError8 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError6 = uiComponentError8 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError8 : null;
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout10 = (TextInputLayout) view;
            String message6 = uiInputComponentError6 != null ? uiInputComponentError6.getMessage() : null;
            InputTextBasedComponentStyle styles6 = ((InputMaskedTextComponent) component).e().getStyles();
            u9.d.d(textInputLayout10, message6, styles6 != null ? styles6.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputPhoneNumberComponent) {
            UiComponentError uiComponentError9 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError7 = uiComponentError9 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError9 : null;
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout11 = (TextInputLayout) view;
            String message7 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
            InputTextBasedComponentStyle styles7 = ((InputPhoneNumberComponent) component).e().getStyles();
            u9.d.d(textInputLayout11, message7, styles7 != null ? styles7.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputNumberComponent) {
            UiComponentError uiComponentError10 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError8 = uiComponentError10 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError10 : null;
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout12 = (TextInputLayout) view;
            String message8 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
            InputTextBasedComponentStyle styles8 = ((InputNumberComponent) component).e().getStyles();
            u9.d.d(textInputLayout12, message8, styles8 != null ? styles8.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputCurrencyComponent) {
            UiComponentError uiComponentError11 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError9 = uiComponentError11 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError11 : null;
            Intrinsics.e(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout13 = (TextInputLayout) view;
            String message9 = uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null;
            InputTextBasedComponentStyle styles9 = ((InputCurrencyComponent) component).e().getStyles();
            u9.d.d(textInputLayout13, message9, styles9 != null ? styles9.getErrorTextStyle() : null);
            x(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof InputCheckboxComponent) {
            Object tag5 = view.getTag();
            Intrinsics.e(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
            q9.i iVar = (q9.i) tag5;
            UiComponentError uiComponentError12 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError10 = uiComponentError12 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError12 : null;
            if (uiInputComponentError10 != null) {
                iVar.d.setText(uiInputComponentError10.getMessage());
                iVar.d.setVisibility(0);
            } else {
                iVar.d.setText("");
                iVar.d.setVisibility(8);
            }
            x(view, componentParams, component, rendering.getIsLoading());
            Unit unit8 = Unit.a;
            return;
        }
        if (component instanceof InputCheckboxGroupComponent) {
            Object tag6 = view.getTag();
            Intrinsics.e(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
            q9.j jVar = (q9.j) tag6;
            UiComponentError uiComponentError13 = errors.get(component.getName());
            UiComponentError.UiInputComponentError uiInputComponentError11 = uiComponentError13 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError13 : null;
            if (uiInputComponentError11 != null) {
                jVar.c.setText(uiInputComponentError11.getMessage());
                jVar.c.setVisibility(0);
            } else {
                jVar.c.setText("");
                jVar.c.setVisibility(8);
            }
            x(view, componentParams, component, rendering.getIsLoading());
            Unit unit9 = Unit.a;
            return;
        }
        if (!(component instanceof ESignatureComponent)) {
            if (!(component instanceof GovernmentIdNfcScanComponent)) {
                if (component instanceof CreatePersonaSheetComponent ? true : component instanceof ImagePreviewComponent ? true : component instanceof LocalImageComponent ? true : component instanceof PrivacyPolicyComponent ? true : component instanceof QRCodeComponent ? true : component instanceof RemoteImageComponent ? true : component instanceof SpacerComponent ? true : component instanceof TextComponent ? true : component instanceof TitleComponent ? true : component instanceof BrandingComponent) {
                    x(view, componentParams, component, rendering.getIsLoading());
                    return;
                }
                return;
            }
            Object tag7 = view.getTag();
            Intrinsics.e(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
            C0688p c0688p = (C0688p) tag7;
            ButtonWithLoadingIndicator launchButton = c0688p.getLaunchButton();
            launchButton.setIsLoading(rendering.getIsLoading() && ((GovernmentIdNfcScanComponent) component).getWasTapped());
            x(launchButton, componentParams, component, rendering.getIsLoading());
            launchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view7) {
                    com.withpersona.sdk2.inquiry.ui.e.b0(this.d, component, view7);
                }
            });
            UiComponentError uiComponentError14 = errors.get(component.getName());
            if (uiComponentError14 != null) {
                if (uiComponentError14 instanceof UiComponentError.UiInputComponentError) {
                    TextView errorLabel = c0688p.getErrorLabel();
                    errorLabel.setText(((UiComponentError.UiInputComponentError) uiComponentError14).getMessage());
                    errorLabel.setVisibility(0);
                    return;
                }
                if (!(uiComponentError14 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError)) {
                    Unit unit10 = Unit.a;
                    return;
                }
                TextInputLayout cardAccessNumber = c0688p.getCardAccessNumber();
                UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError14;
                String str = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles10 = governmentIdNfcScanComponent.e().getStyles();
                u9.d.d(cardAccessNumber, str, (styles10 == null || (cardAccessNumberStyle = styles10.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
                TextInputLayout documentNumber = c0688p.getDocumentNumber();
                String str2 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
                GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles11 = governmentIdNfcScanComponent.e().getStyles();
                u9.d.d(documentNumber, str2, (styles11 == null || (documentNumberStyle = styles11.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
                c0688p.getDateOfBirthBinding().e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
                c0688p.getDateOfBirthBinding().e.setVisibility(0);
                c0688p.getExpirationDateBinding().e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
                c0688p.getExpirationDateBinding().e.setVisibility(0);
                Unit unit11 = Unit.a;
                return;
            }
            return;
        }
        Object tag8 = view.getTag();
        Intrinsics.e(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
        v vVar = (v) tag8;
        UiComponentError uiComponentError15 = errors.get(component.getName());
        UiComponentError.UiInputComponentError uiInputComponentError12 = uiComponentError15 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) uiComponentError15 : null;
        if (uiInputComponentError12 != null) {
            vVar.d.setText(uiInputComponentError12.getMessage());
            vVar.d.setVisibility(0);
        } else {
            vVar.d.setText("");
            vVar.d.setVisibility(8);
        }
        ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
        ESignature.Attributes attributes = eSignatureComponent.e().getAttributes();
        if ((attributes != null ? attributes.getLabel() : null) != null) {
            TextView textView2 = vVar.e;
            ESignature.Attributes attributes2 = eSignatureComponent.e().getAttributes();
            textView2.setText(attributes2 != null ? attributes2.getLabel() : null);
            vVar.e.setVisibility(0);
        } else {
            vVar.e.setText("");
            vVar.e.setVisibility(8);
        }
        Bitmap bitmapB = eSignatureComponent.getBitmapController().b();
        if (bitmapB == null) {
            Object tag9 = view.getTag();
            Intrinsics.e(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag9).b.setVisibility(0);
            Object tag10 = view.getTag();
            Intrinsics.e(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            TextView textView3 = ((v) tag10).b;
            ESignature.Attributes attributes3 = eSignatureComponent.e().getAttributes();
            if (attributes3 == null || (placeholder = attributes3.getPlaceholder()) == null) {
                placeholder = "+ Add signature";
            }
            textView3.setText(placeholder);
            Object tag11 = view.getTag();
            Intrinsics.e(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag11).g.setVisibility(8);
            Object tag12 = view.getTag();
            Intrinsics.e(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag12).c.setVisibility(8);
        } else {
            Object tag13 = view.getTag();
            Intrinsics.e(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag13).g.setImageBitmap(bitmapB);
            Object tag14 = view.getTag();
            Intrinsics.e(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag14).b.setVisibility(8);
            Object tag15 = view.getTag();
            Intrinsics.e(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag15).g.setVisibility(0);
            Object tag16 = view.getTag();
            Intrinsics.e(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ((v) tag16).c.setVisibility(0);
        }
        vVar.f.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view7) {
                com.withpersona.sdk2.inquiry.ui.e.a0(this.d, component, rendering, viewEnvironment, view7);
            }
        });
        z(view, componentParams, component);
        View view7 = vVar.f;
        Intrinsics.checkNotNullExpressionValue(view7, "signatureContainer");
        y(view7, componentParams, component, rendering.getIsLoading());
        Unit unit12 = Unit.a;
    }

    public static final void P(e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        eVar.onComplete.invoke();
    }

    public static final void Q(e eVar, UiComponent uiComponent, View view, View view2) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        Intrinsics.checkNotNullParameter(view, "$view");
        eVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void R(e eVar, UiComponent uiComponent, View view, View view2) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        Intrinsics.checkNotNullParameter(view, "$view");
        eVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void S(e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        eVar.onCancel.invoke();
    }

    public static final void T(e eVar, UiComponent uiComponent, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        eVar.onVerifyPersonaClick.invoke(uiComponent);
    }

    private static final void U(final MaterialAutoCompleteTextView materialAutoCompleteTextView, C0633a c0633a, final List<? extends TextInputLayout> list, final q9.d dVar, final f.d.a aVar, final UiComponent uiComponent, final List<Suggestion> list2) {
        materialAutoCompleteTextView.setAdapter(c0633a);
        c0633a.notifyDataSetChanged();
        materialAutoCompleteTextView.setThreshold(1);
        materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                com.withpersona.sdk2.inquiry.ui.e.V(list, dVar, materialAutoCompleteTextView, aVar, uiComponent, list2, adapterView, view, i2, j2);
            }
        });
    }

    public static final void V(List list, q9.d dVar, MaterialAutoCompleteTextView materialAutoCompleteTextView, f.d.a aVar, UiComponent uiComponent, List list2, AdapterView adapterView, View view, int i2, long j2) {
        Intrinsics.checkNotNullParameter(list, "$allInputLayouts");
        Intrinsics.checkNotNullParameter(dVar, "$this_with");
        Intrinsics.checkNotNullParameter(materialAutoCompleteTextView, "$this_setupAddressAutoCompleteTextView");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        Intrinsics.checkNotNullParameter(list2, "$data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(false);
        }
        dVar.s.setVisibility(0);
        Context context = materialAutoCompleteTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C0456d.d(context);
        aVar.p().invoke(uiComponent, ((Suggestion) list2.get(i2)).getId());
    }

    public static final void W(e eVar, TextInputLayout textInputLayout, S s2, c0 c0Var, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(textInputLayout, "$textInputLayout");
        Intrinsics.checkNotNullParameter(s2, "$config");
        Intrinsics.checkNotNullParameter(c0Var, "$multiTextValueComponent");
        c0(eVar, textInputLayout, s2, c0Var);
    }

    public static final void X(e eVar, TextInputLayout textInputLayout, S s2, c0 c0Var, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(textInputLayout, "$textInputLayout");
        Intrinsics.checkNotNullParameter(s2, "$config");
        Intrinsics.checkNotNullParameter(c0Var, "$multiTextValueComponent");
        c0(eVar, textInputLayout, s2, c0Var);
    }

    public static final void Y(e eVar, UiComponent uiComponent, View view, View view2) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        Intrinsics.checkNotNullParameter(view, "$view");
        eVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void Z(e eVar, S s2, Function1<? super List<Option>, Unit> function1) {
        if (s2 == null) {
            return;
        }
        eVar.binding.i.getBackButton().setEnabled(false);
        eVar.binding.i.setImportantForAccessibility(4);
        eVar.binding.l.setImportantForAccessibility(4);
        eVar.inputSelectBottomSheetController.o(s2, eVar.new o(function1));
    }

    public static final void a0(e eVar, UiComponent uiComponent, f.d.a aVar, ViewEnvironment viewEnvironment, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        Intrinsics.checkNotNullParameter(aVar, "$rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "$viewEnvironment");
        eVar.binding.i.getBackButton().setEnabled(false);
        eVar.binding.i.setImportantForAccessibility(4);
        eVar.binding.l.setImportantForAccessibility(4);
        eVar.signatureBottomSheetController.p((ESignatureComponent) uiComponent, aVar.getStyles(), viewEnvironment, eVar.new p(uiComponent));
    }

    public static final void b0(e eVar, UiComponent uiComponent, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(uiComponent, "$component");
        eVar.launchNfcScan.invoke(uiComponent);
    }

    private static final void c0(e eVar, TextInputLayout textInputLayout, S s2, c0<?> c0Var) {
        eVar.binding.i.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        eVar.binding.i.setImportantForAccessibility(4);
        eVar.binding.l.setImportantForAccessibility(4);
        eVar.inputSelectBottomSheetController.o(s2, eVar.new r(textInputLayout, c0Var));
    }

    private final void d0(f.d.a rendering, ViewEnvironment viewEnvironment, SheetComponent component, Map<String, ? extends Object> componentParams, Map<String, ? extends UiComponentError> errors) {
        l9.g viewBindings;
        Map<String, ComponentView> mapA;
        if (component instanceof CreatePersonaSheetComponent) {
            CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) component).getCtaCard().getComponentNameMapping();
            List<Pair<String, Function1<UiComponent, Unit>>> listB = new NestedUiStep.a().a(componentNameMapping != null ? componentNameMapping.getStartButton() : null, new s(rendering, component)).a(componentNameMapping != null ? componentNameMapping.getDismissButton() : null, new t()).b();
            l9.f fVarD = this.nestedUiBottomSheetController.d();
            if (fVarD == null || (viewBindings = fVarD.getViewBindings()) == null || (mapA = viewBindings.a()) == null) {
                return;
            }
            for (Map.Entry<String, ComponentView> entry : mapA.entrySet()) {
                O(rendering, entry.getValue().c(), entry.getValue().d(), componentParams, errors, viewEnvironment);
            }
            for (Pair<String, Function1<UiComponent, Unit>> pair : listB) {
                String str = (String) pair.c();
                final Function1 function1 = (Function1) pair.d();
                final ComponentView componentView = mapA.get(str);
                if (componentView != null) {
                    componentView.d().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            com.withpersona.sdk2.inquiry.ui.e.e0(function1, componentView, view);
                        }
                    });
                }
            }
        }
    }

    public static final void e0(Function1 function1, ComponentView componentView, View view) {
        Intrinsics.checkNotNullParameter(function1, "$action");
        Intrinsics.checkNotNullParameter(componentView, "$componentView");
        function1.invoke(componentView.c());
    }

    private final void x(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z) {
        z(view, map, uiComponent);
        y(view, map, uiComponent, z);
    }

    private final void y(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z) {
        Boolean value;
        if (uiComponent instanceof InterfaceC0684l) {
            JsonLogicBoolean disabled = ((InterfaceC0684l) uiComponent).getDisabled();
            boolean z2 = false;
            boolean zBooleanValue = (disabled == null || (value = disabled.getValue(map, map.get(uiComponent.getName()))) == null) ? false : value.booleanValue();
            if (!z && !zBooleanValue) {
                z2 = true;
            }
            view.setEnabled(z2);
        }
    }

    private final void z(View view, Map<String, ? extends Object> map, UiComponent uiComponent) {
        Boolean value;
        if (uiComponent instanceof InterfaceC0689q) {
            InterfaceC0689q interfaceC0689q = (InterfaceC0689q) uiComponent;
            JsonLogicBoolean hidden = interfaceC0689q.getHidden();
            boolean zBooleanValue = (hidden == null || (value = hidden.getValue(map, map.get(uiComponent.getName()))) == null) ? false : value.booleanValue();
            view.setVisibility(zBooleanValue ? 8 : 0);
            Iterator<T> it = interfaceC0689q.i().iterator();
            while (it.hasNext()) {
                ((u9.a) it.next()).a(map, zBooleanValue);
            }
        }
    }

    @Override
    public void a(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.ui.f.d.a r23, @org.jetbrains.annotations.NotNull com.squareup.workflow1.ui.ViewEnvironment r24) {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.e.a(com.withpersona.sdk2.inquiry.ui.f$d$a, com.squareup.workflow1.ui.y):void");
    }
}
