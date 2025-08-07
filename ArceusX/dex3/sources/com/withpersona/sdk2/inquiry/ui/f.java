package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.b;
import com.withpersona.sdk2.inquiry.ui.g;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import ha.AbstractC0559i;
import ha.C0456d;
import ha.C0553c;
import ha.C0586a;
import ha.L;
import ha.W;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ka.C0726c;
import ka.InterfaceC0570h;
import ka.Snapshot;
import ka.r;
import ka.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n9.C0681i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 O2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004?ACEBI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u001c*\u00180\u0018R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!JK\u0010&\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'JC\u0010(\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b(\u0010)J-\u0010.\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020+0*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001c0,H\u0002¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\u001c2\u0006\u00100\u001a\u00020+2\u0006\u00102\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b3\u00104J!\u00108\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109JC\u0010:\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00032\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002062\u0006\u0010<\u001a\u00020\u0003H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "nfcScanWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/b$a;", "createReusablePersonaWorkerFactory", "Lcom/withpersona/sdk2/inquiry/ui/g$a;", "verifyReusablePersonaWorkerFactory", "Lh9/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/a;", "componentWorkHelper", "Le9/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/b$a;Lcom/withpersona/sdk2/inquiry/ui/b$a;Lcom/withpersona/sdk2/inquiry/ui/g$a;Lh9/a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/ui/a;Le9/c;)V", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "", "o", "(Lf8/r$c;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "renderProps", "n", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V", "Lf8/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;", "nfcScan", "r", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V", "l", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lf8/k$a;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lkotlin/Function1;", "action", "p", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", "", "isTappedComponentVisible", "s", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V", "props", "Lf8/i;", "snapshot", "m", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/ui/UiState;", "q", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lf8/k$a;)Ljava/lang/Object;", "state", "t", "(Lcom/withpersona/sdk2/inquiry/ui/UiState;)Lf8/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "c", "Lcom/withpersona/sdk2/inquiry/ui/b$a;", "d", "Lcom/withpersona/sdk2/inquiry/ui/g$a;", "e", "Lh9/a;", "f", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "g", "Lcom/withpersona/sdk2/inquiry/ui/a;", "h", "Le9/c;", "i", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f extends ka.k<Input, UiState, c, Object> {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final b.a nfcScanWorkerFactory;

    @NotNull
    private final b.a createReusablePersonaWorkerFactory;

    @NotNull
    private final g.a verifyReusablePersonaWorkerFactory;

    @NotNull
    private final C0586a navigationStateManager;

    @NotNull
    private final PermissionRequestWorkflow permissionRequestWorkflow;

    @NotNull
    private final a componentWorkHelper;

    @NotNull
    private final C0553c externalEventLogger;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b*\u00103R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b/\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b:\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b<\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b6\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b5\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b4\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b=\u0010.R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bB\u00103R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bA\u0010E¨\u0006F"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$b;", "", "", "sessionToken", "inquiryId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "gpsPermissionsTitle", "gpsPermissionsRationale", "gpsPermissionsModalPositiveButton", "gpsPermissionsModalNegativeButton", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalPositiveButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "serverComponentErrors", "isSubmitting", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "transitionError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;ZLcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "n", "b", "k", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "o", "e", "Z", "()Z", "f", "g", "h", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "l", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "i", "j", "getGpsPermissionsModalPositiveButton", "m", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "q", "r", "s", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Input {

        @NotNull
        private final String sessionToken;

        @NotNull
        private final String inquiryId;

        @NotNull
        private final List<UiComponentConfig> components;

        @NotNull
        private final String stepName;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        private final boolean finalStep;

        @NotNull
        private final InquirySessionConfig inquirySessionConfig;

        private final String gpsPermissionsTitle;

        private final String gpsPermissionsRationale;

        private final String gpsPermissionsModalPositiveButton;

        private final String gpsPermissionsModalNegativeButton;

        private final String gpsFeatureTitle;

        private final String gpsFeatureRationale;

        private final String gpsFeatureModalPositiveButton;

        private final StepStyles.UiStepStyle styles;

        private final List<UiComponentError> serverComponentErrors;

        private final boolean isSubmitting;

        private final InternalErrorInfo transitionError;

        public Input(@NotNull String str, @NotNull String str2, @NotNull List<? extends UiComponentConfig> list, @NotNull String str3, boolean z, boolean z2, boolean z3, @NotNull InquirySessionConfig inquirySessionConfig, String str4, String str5, String str6, String str7, String str8, String str9, String str10, StepStyles.UiStepStyle uiStepStyle, List<? extends UiComponentError> list2, boolean z4, InternalErrorInfo internalErrorInfo) {
            Intrinsics.checkNotNullParameter(str, "sessionToken");
            Intrinsics.checkNotNullParameter(str2, "inquiryId");
            Intrinsics.checkNotNullParameter(list, "components");
            Intrinsics.checkNotNullParameter(str3, "stepName");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = str;
            this.inquiryId = str2;
            this.components = list;
            this.stepName = str3;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.inquirySessionConfig = inquirySessionConfig;
            this.gpsPermissionsTitle = str4;
            this.gpsPermissionsRationale = str5;
            this.gpsPermissionsModalPositiveButton = str6;
            this.gpsPermissionsModalNegativeButton = str7;
            this.gpsFeatureTitle = str8;
            this.gpsFeatureRationale = str9;
            this.gpsFeatureModalPositiveButton = str10;
            this.styles = uiStepStyle;
            this.serverComponentErrors = list2;
            this.isSubmitting = z4;
            this.transitionError = internalErrorInfo;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final List<UiComponentConfig> c() {
            return this.components;
        }

        public final boolean getFinalStep() {
            return this.finalStep;
        }

        public final String getGpsFeatureModalPositiveButton() {
            return this.gpsFeatureModalPositiveButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.b(this.sessionToken, input.sessionToken) && Intrinsics.b(this.inquiryId, input.inquiryId) && Intrinsics.b(this.components, input.components) && Intrinsics.b(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.b(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.b(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.b(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.b(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.b(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.b(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.b(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.b(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.b(this.styles, input.styles) && Intrinsics.b(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.b(this.transitionError, input.transitionError);
        }

        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        public final String getGpsPermissionsModalNegativeButton() {
            return this.gpsPermissionsModalNegativeButton;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.components.hashCode()) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            String str = this.gpsPermissionsTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gpsPermissionsRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsPermissionsModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsPermissionsModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gpsFeatureRationale;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.gpsFeatureModalPositiveButton;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode9 = (iHashCode8 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            List<UiComponentError> list = this.serverComponentErrors;
            int iHashCode10 = (((iHashCode9 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return iHashCode10 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0);
        }

        public final String getGpsPermissionsRationale() {
            return this.gpsPermissionsRationale;
        }

        public final String getGpsPermissionsTitle() {
            return this.gpsPermissionsTitle;
        }

        @NotNull
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @NotNull
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final List<UiComponentError> m() {
            return this.serverComponentErrors;
        }

        @NotNull
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        public final String getStepName() {
            return this.stepName;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", components=" + this.components + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", inquirySessionConfig=" + this.inquirySessionConfig + ", gpsPermissionsTitle=" + this.gpsPermissionsTitle + ", gpsPermissionsRationale=" + this.gpsPermissionsRationale + ", gpsPermissionsModalPositiveButton=" + this.gpsPermissionsModalPositiveButton + ", gpsPermissionsModalNegativeButton=" + this.gpsPermissionsModalNegativeButton + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalPositiveButton=" + this.gpsFeatureModalPositiveButton + ", styles=" + this.styles + ", serverComponentErrors=" + this.serverComponentErrors + ", isSubmitting=" + this.isSubmitting + ", transitionError=" + this.transitionError + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "b", "c", "d", "e", "f", "Lcom/withpersona/sdk2/inquiry/ui/f$c$a;", "Lcom/withpersona/sdk2/inquiry/ui/f$c$b;", "Lcom/withpersona/sdk2/inquiry/ui/f$c$c;", "Lcom/withpersona/sdk2/inquiry/ui/f$c$d;", "Lcom/withpersona/sdk2/inquiry/ui/f$c$e;", "Lcom/withpersona/sdk2/inquiry/ui/f$c$f;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$a;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements c {

            @NotNull
            public static final a a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1353460011;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$b;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements c {

            @NotNull
            public static final b a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -650975523;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$c;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0212c implements c {

            @NotNull
            public static final C0212c a = new C0212c();

            private C0212c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0212c);
            }

            public int hashCode() {
                return -584917881;
            }

            @NotNull
            public String toString() {
                return "Completed";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$d;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "message", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d implements c {

            private final String message;

            @NotNull
            private final InternalErrorInfo cause;

            public d(String str, @NotNull InternalErrorInfo internalErrorInfo) {
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.message = str;
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public final String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$e;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class e implements c {

            @NotNull
            public static final e a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1959736081;
            }

            @NotNull
            public String toString() {
                return "FinishedWithTransition";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c$f;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class FinishedWithoutTransition implements c {

            @NotNull
            private final UiComponent fromComponent;

            @NotNull
            private final Map<String, ComponentParam> componentParams;

            @NotNull
            private final String fromStep;

            public FinishedWithoutTransition(@NotNull UiComponent uiComponent, @NotNull Map<String, ? extends ComponentParam> map, @NotNull String str) {
                Intrinsics.checkNotNullParameter(uiComponent, "fromComponent");
                Intrinsics.checkNotNullParameter(map, "componentParams");
                Intrinsics.checkNotNullParameter(str, "fromStep");
                this.fromComponent = uiComponent;
                this.componentParams = map;
                this.fromStep = str;
            }

            @NotNull
            public final Map<String, ComponentParam> a() {
                return this.componentParams;
            }

            @NotNull
            public final UiComponent getFromComponent() {
                return this.fromComponent;
            }

            @NotNull
            public final String getFromStep() {
                return this.fromStep;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishedWithoutTransition)) {
                    return false;
                }
                FinishedWithoutTransition finishedWithoutTransition = (FinishedWithoutTransition) other;
                return Intrinsics.b(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.b(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.b(this.fromStep, finishedWithoutTransition.fromStep);
            }

            public int hashCode() {
                return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
            }

            @NotNull
            public String toString() {
                return "FinishedWithoutTransition(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$d;", "", "<init>", "()V", "a", "Lcom/withpersona/sdk2/inquiry/ui/f$d$a;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001*B\u0093\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012*\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u000e0\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001b\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u001b¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R;\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00138\u0006¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bA\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b3\u0010B\u001a\u0004\b/\u0010CR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bD\u0010:R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001b8\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b9\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010!\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b;\u0010PR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bQ\u0010:R)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bN\u0010GR\u0013\u0010T\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b1\u0010SR\u0013\u0010U\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\b=\u0010SR\u0013\u0010Y\u001a\u0004\u0018\u00010V8F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$d$a;", "Lcom/withpersona/sdk2/inquiry/ui/f$d;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function3;", "", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "", "onClick", "Lkotlin/Function0;", "onComplete", "onCancel", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "onVerifyPersonaClick", "Lcom/withpersona/sdk2/inquiry/ui/f$d$a$a;", "autoSubmit", "onBack", "Lkotlin/Function2;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "onSuggestionSelected", "isLoading", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "onCreateReusablePersonaClick", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Laa/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/ui/f$d$a$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "i", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Laa/n;", "l", "()Laa/n;", "Lkotlin/jvm/functions/Function0;", "m", "()Lkotlin/jvm/functions/Function0;", "f", "k", "g", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "q", "Lcom/withpersona/sdk2/inquiry/ui/f$d$a$a;", "()Lcom/withpersona/sdk2/inquiry/ui/f$d$a$a;", "j", "Lkotlin/jvm/functions/Function2;", "p", "()Lkotlin/jvm/functions/Function2;", "Z", "t", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "n", "Ljava/lang/String;", "()Ljava/lang/String;", "o", "", "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends d {

            @NotNull
            private final List<UiComponent> components;

            @NotNull
            private final List<UiComponentError> componentErrors;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final aa.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> onClick;

            @NotNull
            private final Function0<Unit> onComplete;

            @NotNull
            private final Function0<Unit> onCancel;

            @NotNull
            private final Function1<GovernmentIdNfcScanComponent, Unit> launchNfcScan;

            @NotNull
            private final Function1<VerifyPersonaButtonComponent, Unit> onVerifyPersonaClick;

            private final AutoSubmit autoSubmit;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function2<InputAddressComponent, String, Unit> onSuggestionSelected;

            private final boolean isLoading;

            private final StepStyles.UiStepStyle styles;

            private final String error;

            @NotNull
            private final Function0<Unit> onErrorDismissed;

            @NotNull
            private final Function2<CreatePersonaSheetComponent, UiComponent, Unit> onCreateReusablePersonaClick;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$d$a$a;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "component", "", "countdownText", "", "isReadyToSubmit", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class AutoSubmit {

                @NotNull
                private final ButtonComponent component;

                private final String countdownText;

                private final boolean isReadyToSubmit;

                public AutoSubmit(@NotNull ButtonComponent buttonComponent, String str, boolean z) {
                    Intrinsics.checkNotNullParameter(buttonComponent, "component");
                    this.component = buttonComponent;
                    this.countdownText = str;
                    this.isReadyToSubmit = z;
                }

                @NotNull
                public final ButtonComponent getComponent() {
                    return this.component;
                }

                public final String getCountdownText() {
                    return this.countdownText;
                }

                public final boolean getIsReadyToSubmit() {
                    return this.isReadyToSubmit;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AutoSubmit)) {
                        return false;
                    }
                    AutoSubmit autoSubmit = (AutoSubmit) other;
                    return Intrinsics.b(this.component, autoSubmit.component) && Intrinsics.b(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
                }

                public int hashCode() {
                    int iHashCode = this.component.hashCode() * 31;
                    String str = this.countdownText;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isReadyToSubmit);
                }

                @NotNull
                public String toString() {
                    return "AutoSubmit(component=" + this.component + ", countdownText=" + this.countdownText + ", isReadyToSubmit=" + this.isReadyToSubmit + ")";
                }
            }

            public a(@NotNull List<? extends UiComponent> list, @NotNull List<? extends UiComponentError> list2, @NotNull NavigationState navigationState, @NotNull aa.n<? super UiComponent, ? super Boolean, ? super Map<String, ? extends ComponentParam>, Unit> nVar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super GovernmentIdNfcScanComponent, Unit> function1, @NotNull Function1<? super VerifyPersonaButtonComponent, Unit> function12, AutoSubmit autoSubmit, @NotNull Function0<Unit> function03, @NotNull Function2<? super InputAddressComponent, ? super String, Unit> function2, boolean z, StepStyles.UiStepStyle uiStepStyle, String str, @NotNull Function0<Unit> function04, @NotNull Function2<? super CreatePersonaSheetComponent, ? super UiComponent, Unit> function22) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "components");
                Intrinsics.checkNotNullParameter(list2, "componentErrors");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(nVar, "onClick");
                Intrinsics.checkNotNullParameter(function0, "onComplete");
                Intrinsics.checkNotNullParameter(function02, "onCancel");
                Intrinsics.checkNotNullParameter(function1, "launchNfcScan");
                Intrinsics.checkNotNullParameter(function12, "onVerifyPersonaClick");
                Intrinsics.checkNotNullParameter(function03, "onBack");
                Intrinsics.checkNotNullParameter(function2, "onSuggestionSelected");
                Intrinsics.checkNotNullParameter(function04, "onErrorDismissed");
                Intrinsics.checkNotNullParameter(function22, "onCreateReusablePersonaClick");
                this.components = list;
                this.componentErrors = list2;
                this.navigationState = navigationState;
                this.onClick = nVar;
                this.onComplete = function0;
                this.onCancel = function02;
                this.launchNfcScan = function1;
                this.onVerifyPersonaClick = function12;
                this.autoSubmit = autoSubmit;
                this.onBack = function03;
                this.onSuggestionSelected = function2;
                this.isLoading = z;
                this.styles = uiStepStyle;
                this.error = str;
                this.onErrorDismissed = function04;
                this.onCreateReusablePersonaClick = function22;
            }

            public final Drawable a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.backgroundImageDrawable(context);
                }
                return null;
            }

            public final AutoSubmit getAutoSubmit() {
                return this.autoSubmit;
            }

            public final Integer c() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getBackgroundColorValue();
                }
                return null;
            }

            @NotNull
            public final List<UiComponentError> d() {
                return this.componentErrors;
            }

            @NotNull
            public final List<UiComponent> e() {
                return this.components;
            }

            public final String getError() {
                return this.error;
            }

            public final Integer g() {
                AttributeStyles.HeaderButtonColorStyle headerButtonColor;
                StyleElements.SimpleElementColor headerButton;
                StyleElements.SimpleElementColorValue base;
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                    return null;
                }
                return base.getValue();
            }

            @NotNull
            public final Function1<GovernmentIdNfcScanComponent, Unit> h() {
                return this.launchNfcScan;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> k() {
                return this.onCancel;
            }

            @NotNull
            public final aa.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> l() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> m() {
                return this.onComplete;
            }

            @NotNull
            public final Function2<CreatePersonaSheetComponent, UiComponent, Unit> n() {
                return this.onCreateReusablePersonaClick;
            }

            @NotNull
            public final Function0<Unit> o() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final Function2<InputAddressComponent, String, Unit> p() {
                return this.onSuggestionSelected;
            }

            @NotNull
            public final Function1<VerifyPersonaButtonComponent, Unit> q() {
                return this.onVerifyPersonaClick;
            }

            public final StyleElements.PositionType r() {
                StepStyles.UiStepStyle uiStepStyle = this.styles;
                if (uiStepStyle != null) {
                    return uiStepStyle.getPageLevelVerticalAlignment();
                }
                return null;
            }

            public final StepStyles.UiStepStyle getStyles() {
                return this.styles;
            }

            public final boolean getIsLoading() {
                return this.isLoading;
            }
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class e {
        public static final int[] a;

        static {
            int[] iArr = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/b$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/b$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0215f extends kotlin.jvm.internal.l implements Function1<b.InterfaceC0208b, ka.r<? super Input, UiState, ? extends c>> {
        final UiState.PendingAction d;
        final f e;
        final UiState.Displaying i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(c.C0212c.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState.Displaying d;
            final UiState.PendingAction e;

            b(UiState.Displaying displaying, UiState.PendingAction pendingAction) {
                super(1);
                this.d = displaying;
                this.e = pendingAction;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                CreatePersonaSheetComponent createPersonaSheetComponent = ((UiState.PendingAction.CreateReusablePersona) this.e).getCreatePersonaSheetComponent();
                CreatePersonaSheetComponent createPersonaSheetComponent2 = ((UiState.PendingAction.CreateReusablePersona) this.e).getCreatePersonaSheetComponent();
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, createPersonaSheetComponent, createPersonaSheetComponent2.a((207 & 1) != 0 ? createPersonaSheetComponent2.config : null, (207 & 2) != 0 ? createPersonaSheetComponent2.ctaCard : null, (207 & 4) != 0 ? createPersonaSheetComponent2.url : null, (207 & 8) != 0 ? createPersonaSheetComponent2.autoCompleteOnDismiss : false, (207 & 16) != 0 ? createPersonaSheetComponent2.shown : true, (207 & 32) != 0 ? createPersonaSheetComponent2.showing : false, (207 & 64) != 0 ? createPersonaSheetComponent2.hideWhenTappedOutside : false, (207 & 128) != 0 ? createPersonaSheetComponent2.screen : null)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final b.InterfaceC0208b d;
            final UiState.Displaying e;
            final f i;
            final UiState.PendingAction v;

            c(b.InterfaceC0208b interfaceC0208b, UiState.Displaying displaying, f fVar, UiState.PendingAction pendingAction) {
                super(1);
                this.d = interfaceC0208b;
                this.e = displaying;
                this.i = fVar;
                this.v = pendingAction;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                UiState.Displaying displayingA;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (((b.InterfaceC0208b.Error) this.d).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
                    UiState.Displaying displaying = this.e;
                    displayingA = displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : this.i.applicationContext.getString(S8.e.x), (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null);
                } else {
                    UiState.Displaying displaying2 = this.e;
                    List<UiComponent> components = displaying2.getComponents();
                    CreatePersonaSheetComponent createPersonaSheetComponent = ((UiState.PendingAction.CreateReusablePersona) this.v).getCreatePersonaSheetComponent();
                    CreatePersonaSheetComponent createPersonaSheetComponent2 = ((UiState.PendingAction.CreateReusablePersona) this.v).getCreatePersonaSheetComponent();
                    displayingA = displaying2.a((8062 & 1) != 0 ? displaying2.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, createPersonaSheetComponent, createPersonaSheetComponent2.a((207 & 1) != 0 ? createPersonaSheetComponent2.config : null, (207 & 2) != 0 ? createPersonaSheetComponent2.ctaCard : null, (207 & 4) != 0 ? createPersonaSheetComponent2.url : null, (207 & 8) != 0 ? createPersonaSheetComponent2.autoCompleteOnDismiss : false, (207 & 16) != 0 ? createPersonaSheetComponent2.shown : true, (207 & 32) != 0 ? createPersonaSheetComponent2.showing : false, (207 & 64) != 0 ? createPersonaSheetComponent2.hideWhenTappedOutside : false, (207 & 128) != 0 ? createPersonaSheetComponent2.screen : null)), (8062 & 2) != 0 ? displaying2.stepName : null, (8062 & 4) != 0 ? displaying2.componentErrors : null, (8062 & 8) != 0 ? displaying2.styles : null, (8062 & 16) != 0 ? displaying2.error : null, (8062 & 32) != 0 ? displaying2.nfcScan : null, (8062 & 64) != 0 ? displaying2.autoSubmit : null, (8062 & 128) != 0 ? displaying2.pendingAction : null, (8062 & 256) != 0 ? displaying2.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying2.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying2.componentParams : null, (8062 & 2048) != 0 ? displaying2.triggeringComponent : null, (8062 & 4096) != 0 ? displaying2.requestPermissionKey : null);
                }
                cVar.e(displayingA);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0215f(UiState.PendingAction pendingAction, f fVar, UiState.Displaying displaying) {
            super(1);
            this.d = pendingAction;
            this.e = fVar;
            this.i = displaying;
        }

        @NotNull
        public final ka.r<Input, UiState, c> invoke(@NotNull b.InterfaceC0208b interfaceC0208b) throws P9.m {
            Intrinsics.checkNotNullParameter(interfaceC0208b, "it");
            if (((UiState.PendingAction.CreateReusablePersona) this.d).getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
                return z.d(this.e, null, a.d, 1, null);
            }
            if (Intrinsics.b(interfaceC0208b, b.InterfaceC0208b.a.a)) {
                return z.d(this.e, null, new b(this.i, this.d), 1, null);
            }
            if (!(interfaceC0208b instanceof b.InterfaceC0208b.Error)) {
                throw new P9.m();
            }
            f fVar = this.e;
            return z.d(fVar, null, new c(interfaceC0208b, this.i, fVar, this.d), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/g$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<g.b, ka.r<? super Input, UiState, ? extends c>> {
        final UiState.Displaying e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(c.e.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final g.b d;
            final f e;
            final UiState.Displaying i;

            b(g.b bVar, f fVar, UiState.Displaying displaying) {
                super(1);
                this.d = bVar;
                this.e = fVar;
                this.i = displaying;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                UiState.Displaying displayingA;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (((g.b.Error) this.d).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo) {
                    String string = this.e.applicationContext.getString(S8.e.x);
                    UiState.Displaying displaying = this.i;
                    displayingA = displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : string, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null);
                } else {
                    UiState.Displaying displaying2 = this.i;
                    displayingA = displaying2.a((8062 & 1) != 0 ? displaying2.components : null, (8062 & 2) != 0 ? displaying2.stepName : null, (8062 & 4) != 0 ? displaying2.componentErrors : null, (8062 & 8) != 0 ? displaying2.styles : null, (8062 & 16) != 0 ? displaying2.error : null, (8062 & 32) != 0 ? displaying2.nfcScan : null, (8062 & 64) != 0 ? displaying2.autoSubmit : null, (8062 & 128) != 0 ? displaying2.pendingAction : null, (8062 & 256) != 0 ? displaying2.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying2.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying2.componentParams : null, (8062 & 2048) != 0 ? displaying2.triggeringComponent : null, (8062 & 4096) != 0 ? displaying2.requestPermissionKey : null);
                }
                cVar.e(displayingA);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        g(UiState.Displaying displaying) {
            super(1);
            this.e = displaying;
        }

        @NotNull
        public final ka.r<Input, UiState, c> invoke(@NotNull g.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (Intrinsics.b(bVar, g.b.a.a)) {
                return z.d(f.this, null, a.d, 1, null);
            }
            if (!(bVar instanceof g.b.Error)) {
                throw new P9.m();
            }
            f fVar = f.this;
            return z.d(fVar, null, new b(bVar, fVar, this.e), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<UiComponent, Unit> {
        final Function1<UiComponent, Unit> d;

        h(Function1<? super UiComponent, Unit> function1) {
            super(1);
            this.d = function1;
        }

        public final void a(@NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            this.d.invoke(uiComponent);
        }

        public Object invoke(Object obj) {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(c.a.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar) {
            super(0);
            this.d = aVar;
            this.e = fVar;
        }

        public Object invoke() {
            m603invoke();
            return Unit.a;
        }

        public final void m603invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "component", "", "addressId", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Ljava/lang/String;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.jvm.internal.l implements Function2<InputAddressComponent, String, Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;
        final UiState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final InputAddressComponent e;
            final String i;

            a(UiState uiState, InputAddressComponent inputAddressComponent, String str) {
                super(1);
                this.d = uiState;
                this.e = inputAddressComponent;
                this.i = str;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState uiState = this.d;
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                List<UiComponent> components = ((UiState.Displaying) uiState).getComponents();
                InputAddressComponent inputAddressComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, inputAddressComponent, inputAddressComponent.R(this.i).P(Boolean.TRUE)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, UiState uiState) {
            super(2);
            this.d = aVar;
            this.e = fVar;
            this.i = uiState;
        }

        public final void a(@NotNull InputAddressComponent inputAddressComponent, @NotNull String str) {
            Intrinsics.checkNotNullParameter(inputAddressComponent, "component");
            Intrinsics.checkNotNullParameter(str, "addressId");
            this.d.b().d(z.d(this.e, null, new a(this.i, inputAddressComponent, str), 1, null));
        }

        public Object invoke(Object obj, Object obj2) {
            a((InputAddressComponent) obj, (String) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;
        final UiState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;

            a(UiState uiState) {
                super(1);
                this.d = uiState;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = (UiState.Displaying) this.d;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, UiState uiState) {
            super(0);
            this.d = aVar;
            this.e = fVar;
            this.i = uiState;
        }

        public Object invoke() {
            m604invoke();
            return Unit.a;
        }

        public final void m604invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "createReusablePersonaComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "buttonClicked", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.jvm.internal.l implements Function2<CreatePersonaSheetComponent, UiComponent, Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;
        final UiState i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final CreatePersonaSheetComponent e;
            final UiComponent i;

            a(UiState uiState, CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent) {
                super(1);
                this.d = uiState;
                this.e = createPersonaSheetComponent;
                this.i = uiComponent;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState uiState = this.d;
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                List<UiComponent> components = ((UiState.Displaying) uiState).getComponents();
                CreatePersonaSheetComponent createPersonaSheetComponent = this.e;
                UiComponent uiComponent = this.i;
                ButtonComponent buttonComponent = uiComponent instanceof ButtonComponent ? (ButtonComponent) uiComponent : null;
                if (buttonComponent != null) {
                    buttonComponent.m(true);
                }
                Unit unit = Unit.a;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, createPersonaSheetComponent, C0681i.b(createPersonaSheetComponent, uiComponent, uiComponent)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : new UiState.PendingAction.CreateReusablePersona(this.e), (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        l(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, UiState uiState) {
            super(2);
            this.d = aVar;
            this.e = fVar;
            this.i = uiState;
        }

        public final void a(@NotNull CreatePersonaSheetComponent createPersonaSheetComponent, @NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(createPersonaSheetComponent, "createReusablePersonaComponent");
            Intrinsics.checkNotNullParameter(uiComponent, "buttonClicked");
            this.d.b().d(z.d(this.e, null, new a(this.i, createPersonaSheetComponent, uiComponent), 1, null));
        }

        public Object invoke(Object obj, Object obj2) {
            a((CreatePersonaSheetComponent) obj, (UiComponent) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class m extends kotlin.jvm.internal.l implements Function1<PermissionRequestWorkflow.Output, ka.r<? super Input, UiState, ? extends c>> {
        final ka.k<Input, UiState, c, Object>.a e;
        final boolean i;
        final UiState v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final ka.k<Input, UiState, c, Object>.a e;
            final f i;
            final boolean v;
            final UiState w;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0216a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
                final f d;

                C0216a(f fVar) {
                    super(1);
                    this.d = fVar;
                }

                public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$a");
                    UiState uiStateC = cVar.c();
                    UiState.Displaying displaying = uiStateC instanceof UiState.Displaying ? (UiState.Displaying) uiStateC : null;
                    if (displaying == null) {
                        return;
                    }
                    this.d.o(cVar, displaying);
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
                final f d;

                b(f fVar) {
                    super(1);
                    this.d = fVar;
                }

                public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$a");
                    UiState uiStateC = cVar.c();
                    UiState.Displaying displaying = uiStateC instanceof UiState.Displaying ? (UiState.Displaying) uiStateC : null;
                    if (displaying == null) {
                        return;
                    }
                    this.d.o(cVar, displaying);
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
                final UiState d;

                c(UiState uiState) {
                    super(1);
                    this.d = uiState;
                }

                public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    UiState uiState = this.d;
                    UiState.Displaying displaying = (UiState.Displaying) uiState;
                    cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : String.valueOf(Integer.parseInt(((UiState.Displaying) uiState).getRequestPermissionKey()) + 1)));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
                final UiState d;

                d(UiState uiState) {
                    super(1);
                    this.d = uiState;
                }

                public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    UiState.Displaying displaying = (UiState.Displaying) this.d;
                    cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class e {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.m.values().length];
                    try {
                        iArr[Q8.m.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.m.e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.m.i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(PermissionRequestWorkflow.Output output, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, boolean z, UiState uiState) {
                super(1);
                this.d = output;
                this.e = aVar;
                this.i = fVar;
                this.v = z;
                this.w = uiState;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = e.a[this.d.getPermissionState().getResult().ordinal()];
                if (i == 1) {
                    InterfaceC0570h<ka.r<? super Input, UiState, ? extends c>> interfaceC0570hB = this.e.b();
                    f fVar = this.i;
                    interfaceC0570hB.d(z.d(fVar, null, new C0216a(fVar), 1, null));
                } else if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.e.b().d(z.d(this.i, null, new d(this.w), 1, null));
                } else {
                    if (!this.v) {
                        this.e.b().d(z.d(this.i, null, new c(this.w), 1, null));
                        return;
                    }
                    InterfaceC0570h<ka.r<? super Input, UiState, ? extends c>> interfaceC0570hB2 = this.e.b();
                    f fVar2 = this.i;
                    interfaceC0570hB2.d(z.d(fVar2, null, new b(fVar2), 1, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        m(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, boolean z, UiState uiState) {
            super(1);
            this.e = aVar;
            this.i = z;
            this.v = uiState;
        }

        @NotNull
        public final ka.r<Input, UiState, c> invoke(@NotNull PermissionRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            f fVar = f.this;
            return z.d(fVar, null, new a(output, this.e, fVar, this.i, this.v), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class n extends kotlin.jvm.internal.l implements Function1<UiComponent, Unit> {
        final Input e;
        final UiState i;
        final ka.k<Input, UiState, c, Object>.a v;

        n(Input input, UiState uiState, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar) {
            super(1);
            this.e = input;
            this.i = uiState;
            this.v = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(uiComponent, "component");
            f.this.componentWorkHelper.d(this.e, (UiState.Displaying) this.i, this.v, uiComponent);
        }

        public Object invoke(Object obj) {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;", "component", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o extends kotlin.jvm.internal.l implements Function1<ButtonComponent, Boolean> {
        public static final o d = new o();

        o() {
            super(1);
        }

        @NotNull
        public final Boolean invoke(@NotNull ButtonComponent buttonComponent) {
            Intrinsics.checkNotNullParameter(buttonComponent, "component");
            return Boolean.valueOf(buttonComponent.getAutoSubmitIntervalSeconds() != null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Input, UiState, c, Object>.a e;
        final f i;
        final UiState v;
        final ButtonComponent w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final ButtonComponent e;

            a(UiState uiState, ButtonComponent buttonComponent) {
                super(1);
                this.d = uiState;
                this.e = buttonComponent;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                String strZ;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = (UiState.Displaying) this.d;
                ButtonComponent buttonComponent = this.e;
                Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
                Intrinsics.d(autoSubmitIntervalSeconds);
                int iIntValue = autoSubmitIntervalSeconds.intValue();
                String autoSubmitCountdownText = this.e.getAutoSubmitCountdownText();
                if (autoSubmitCountdownText != null) {
                    Integer autoSubmitIntervalSeconds2 = this.e.getAutoSubmitIntervalSeconds();
                    Intrinsics.d(autoSubmitIntervalSeconds2);
                    strZ = StringsKt.z(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, (Object) null);
                } else {
                    strZ = null;
                }
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : new UiState.Displaying.AutoSubmit(buttonComponent, iIntValue, strZ), (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        p(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, UiState uiState, ButtonComponent buttonComponent, Continuation<? super p> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = fVar;
            this.v = uiState;
            this.w = buttonComponent;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new p(this.e, this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P9.p.b(obj);
            this.e.b().d(z.d(this.i, null, new a(this.v, this.w), 1, null));
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", f = "UiWorkflow.kt", l = {145}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class q extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Input, UiState, c, Object>.a e;
        final f i;
        final UiState.Displaying.AutoSubmit v;
        final UiState w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState.Displaying.AutoSubmit d;
            final UiState e;

            a(UiState.Displaying.AutoSubmit autoSubmit, UiState uiState) {
                super(1);
                this.d = autoSubmit;
                this.e = uiState;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int countdown = this.d.getCountdown() - 1;
                UiState.Displaying displaying = (UiState.Displaying) this.e;
                ButtonComponent component = this.d.getComponent();
                String autoSubmitCountdownText = this.d.getComponent().getAutoSubmitCountdownText();
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? StringsKt.z(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, (Object) null) : null), (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        q(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, Continuation<? super q> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = fVar;
            this.v = autoSubmit;
            this.w = uiState;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.e, this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                this.d = 1;
                if (W.a(1000L, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            this.e.b().d(z.d(this.i, null, new a(this.v, this.w), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "uiComponent", "", "isTappedComponentVisible", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLjava/util/Map;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class r extends kotlin.jvm.internal.l implements aa.n<UiComponent, Boolean, Map<String, ? extends ComponentParam>, Unit> {
        final UiState e;
        final Input i;
        final ka.k<Input, UiState, c, Object>.a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final Map<String, ComponentParam> e;
            final UiComponent i;

            a(UiState uiState, Map<String, ? extends ComponentParam> map, UiComponent uiComponent) {
                super(1);
                this.d = uiState;
                this.e = map;
                this.i = uiComponent;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = (UiState.Displaying) this.d;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : true, (8062 & 1024) != 0 ? displaying.componentParams : this.e, (8062 & 2048) != 0 ? displaying.triggeringComponent : this.i, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final Map<String, ComponentParam> d;
            final UiComponent e;
            final f i;

            b(Map<String, ? extends ComponentParam> map, UiComponent uiComponent, f fVar) {
                super(1);
                this.d = map;
                this.e = uiComponent;
                this.i = fVar;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState uiStateC = cVar.c();
                UiState.Displaying displaying = uiStateC instanceof UiState.Displaying ? (UiState.Displaying) uiStateC : null;
                if (displaying == null) {
                    return;
                }
                UiState.Displaying displayingA = displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : this.d, (8062 & 2048) != 0 ? displaying.triggeringComponent : this.e, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null);
                cVar.e(displayingA);
                this.i.o(cVar, displayingA);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        r(UiState uiState, Input input, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar) {
            super(3);
            this.e = uiState;
            this.i = input;
            this.v = aVar;
        }

        public final void a(@NotNull UiComponent uiComponent, boolean z, @NotNull Map<String, ? extends ComponentParam> map) {
            Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
            Intrinsics.checkNotNullParameter(map, "componentParams");
            f.this.s(uiComponent, z, (UiState.Displaying) this.e);
            if (this.i.getInquirySessionConfig().getGpsCollectionRequirement() != GpsCollectionRequirement.i && !((UiState.Displaying) this.e).getHasRequestedGpsPermissions()) {
                this.v.b().d(z.d(f.this, null, new a(this.e, map, uiComponent), 1, null));
                return;
            }
            InterfaceC0570h<ka.r<? super Input, UiState, ? extends c>> interfaceC0570hB = this.v.b();
            f fVar = f.this;
            interfaceC0570hB.d(z.d(fVar, null, new b(map, uiComponent, fVar), 1, null));
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            a((UiComponent) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(c.C0212c.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        s(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar) {
            super(0);
            this.d = aVar;
            this.e = fVar;
        }

        public Object invoke() {
            m605invoke();
            return Unit.a;
        }

        public final void m605invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, UiState, c, Object>.a d;
        final f e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final Input d;

            a(Input input) {
                super(1);
                this.d = input;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(this.d.getFinalStep() ? c.C0212c.a : c.b.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        t(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, Input input) {
            super(0);
            this.d = aVar;
            this.e = fVar;
            this.i = input;
        }

        public Object invoke() {
            m606invoke();
            return Unit.a;
        }

        public final void m606invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class u extends kotlin.jvm.internal.l implements Function1<GovernmentIdNfcScanComponent, Unit> {
        final UiState e;
        final ka.k<Input, UiState, c, Object>.a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final GovernmentIdNfcScanComponent e;

            a(UiState uiState, GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
                super(1);
                this.d = uiState;
                this.e = governmentIdNfcScanComponent;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = (UiState.Displaying) this.d;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : new UiState.Displaying.NfcScan(this.e), (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        u(UiState uiState, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar) {
            super(1);
            this.e = uiState;
            this.i = aVar;
        }

        public final void a(@NotNull GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
            Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "component");
            f.this.s(governmentIdNfcScanComponent, true, (UiState.Displaying) this.e);
            this.i.b().d(z.d(f.this, null, new a(this.e, governmentIdNfcScanComponent), 1, null));
        }

        public Object invoke(Object obj) {
            a((GovernmentIdNfcScanComponent) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class v extends kotlin.jvm.internal.l implements Function1<VerifyPersonaButtonComponent, Unit> {
        final UiState e;
        final ka.k<Input, UiState, c, Object>.a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState d;
            final VerifyPersonaButtonComponent e;

            a(UiState uiState, VerifyPersonaButtonComponent verifyPersonaButtonComponent) {
                super(1);
                this.d = uiState;
                this.e = verifyPersonaButtonComponent;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = (UiState.Displaying) this.d;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : new UiState.PendingAction.VerifyReusablePersona(this.e), (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        v(UiState uiState, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar) {
            super(1);
            this.e = uiState;
            this.i = aVar;
        }

        public final void a(@NotNull VerifyPersonaButtonComponent verifyPersonaButtonComponent) {
            Intrinsics.checkNotNullParameter(verifyPersonaButtonComponent, "it");
            f.this.s(verifyPersonaButtonComponent, true, (UiState.Displaying) this.e);
            this.i.b().d(z.d(f.this, null, new a(this.e, verifyPersonaButtonComponent), 1, null));
        }

        public Object invoke(Object obj) {
            a((VerifyPersonaButtonComponent) obj);
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1", f = "UiWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class w extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        final UiState.Displaying.NfcScan A;
        final UiState.Displaying B;
        int d;
        final ka.k<Input, UiState, c, Object>.a e;
        final f i;
        final GovernmentIdNfcScanComponent v;
        final String w;
        final Date y;
        final Date z;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final GovernmentIdNfcScanComponent d;
            final f e;
            final String i;
            final Date v;
            final Date w;
            final UiState.Displaying.NfcScan y;
            final UiState.Displaying z;

            a(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, f fVar, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying) {
                super(1);
                this.d = governmentIdNfcScanComponent;
                this.e = fVar;
                this.i = str;
                this.v = date;
                this.w = date2;
                this.y = nfcScan;
                this.z = displaying;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                String string;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                GovernmentIdNfcScan.Attributes attributes = this.d.e().getAttributes();
                if (attributes == null || (string = attributes.getRequiredText()) == null) {
                    string = this.e.applicationContext.getString(S8.e.B);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                if (StringsKt.Y(this.i)) {
                    linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
                }
                if (this.v == null) {
                    linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
                }
                if (this.w == null) {
                    linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
                }
                List listD = CollectionsKt.d(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.y.getComponent().getName(), null, linkedHashMap, 2, null));
                UiState.Displaying displaying = this.z;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : listD, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        w(ka.k<? super Input, UiState, ? extends c, ? extends Object>.a aVar, f fVar, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, Continuation<? super w> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = fVar;
            this.v = governmentIdNfcScanComponent;
            this.w = str;
            this.y = date;
            this.z = date2;
            this.A = nfcScan;
            this.B = displaying;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new w(this.e, this.i, this.v, this.w, this.y, this.z, this.A, this.B, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P9.p.b(obj);
            InterfaceC0570h<ka.r<? super Input, UiState, ? extends c>> interfaceC0570hB = this.e.b();
            f fVar = this.i;
            interfaceC0570hB.d(z.d(fVar, null, new a(this.v, fVar, this.w, this.y, this.z, this.A, this.B), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class x extends kotlin.jvm.internal.l implements Function1<PassportNfcReaderOutput, ka.r<? super Input, UiState, ? extends c>> {
        final UiState.Displaying e;
        final UiState.Displaying.NfcScan i;
        final GovernmentIdNfcScanComponent v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState.Displaying d;

            a(UiState.Displaying displaying) {
                super(1);
                this.d = displaying;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState.Displaying.NfcScan d;
            final GovernmentIdNfcScanComponent e;
            final UiState.Displaying i;

            b(UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, UiState.Displaying displaying) {
                super(1);
                this.d = nfcScan;
                this.e = governmentIdNfcScanComponent;
                this.i = displaying;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                String scanDocumentError;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                String name = this.d.getComponent().getName();
                GovernmentIdNfcScan.Attributes attributes = this.e.e().getAttributes();
                if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
                    scanDocumentError = "";
                }
                List listD = CollectionsKt.d(new UiComponentError.UiInputComponentError(name, "", scanDocumentError));
                UiState.Displaying displaying = this.i;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : listD, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super Input, UiState, ? extends c>.c, Unit> {
            final UiState.Displaying.NfcScan d;
            final PassportNfcReaderOutput e;
            final UiState.Displaying i;

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

            c(UiState.Displaying.NfcScan nfcScan, PassportNfcReaderOutput passportNfcReaderOutput, UiState.Displaying displaying) {
                super(1);
                this.d = nfcScan;
                this.e = passportNfcReaderOutput;
                this.i = displaying;
            }

            public final void a(@NotNull ka.r<? super Input, UiState, ? extends c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.getComponent().getNfcDataController().c(new GovernmentIdNfcData(((PassportNfcReaderOutput.Success) this.e).getDg1Uri(), ((PassportNfcReaderOutput.Success) this.e).getDg2Uri(), ((PassportNfcReaderOutput.Success) this.e).getSodUri(), ((PassportNfcReaderOutput.Success) this.e).getChipAuthenticationStatus()));
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) C0726c.a(this.i.getComponents(), kotlin.jvm.internal.z.b(SubmitButtonComponent.class), a.d);
                if (submitButtonComponent != null) {
                    UiState.Displaying displaying = this.i;
                    cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : null, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : new UiState.Displaying.AutoSubmit(submitButtonComponent, 0, null), (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        x(UiState.Displaying displaying, UiState.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
            super(1);
            this.e = displaying;
            this.i = nfcScan;
            this.v = governmentIdNfcScanComponent;
        }

        @NotNull
        public final ka.r<Input, UiState, c> invoke(@NotNull PassportNfcReaderOutput passportNfcReaderOutput) throws P9.m {
            Intrinsics.checkNotNullParameter(passportNfcReaderOutput, "output");
            if (Intrinsics.b(passportNfcReaderOutput, PassportNfcReaderOutput.Cancel.d)) {
                return z.d(f.this, null, new a(this.e), 1, null);
            }
            if (passportNfcReaderOutput instanceof PassportNfcReaderOutput.Error) {
                return z.d(f.this, null, new b(this.i, this.v, this.e), 1, null);
            }
            if (passportNfcReaderOutput instanceof PassportNfcReaderOutput.Success) {
                return z.d(f.this, null, new c(this.i, passportNfcReaderOutput, this.e), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class y extends kotlin.jvm.internal.l implements Function1<UiComponent, Unit> {
        final boolean d;
        final UiComponent e;

        y(boolean z, UiComponent uiComponent) {
            super(1);
            this.d = z;
            this.e = uiComponent;
        }

        public final void a(@NotNull UiComponent uiComponent) {
            Intrinsics.checkNotNullParameter(uiComponent, "it");
            if (uiComponent instanceof n9.W) {
                ((n9.W) uiComponent).m(this.d ? Intrinsics.b(uiComponent.getName(), this.e.getName()) : true);
            }
        }

        public Object invoke(Object obj) {
            a((UiComponent) obj);
            return Unit.a;
        }
    }

    public f(@NotNull Context context, @NotNull b.a aVar, @NotNull b.a aVar2, @NotNull g.a aVar3, @NotNull C0586a c0586a, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull a aVar4, @NotNull C0553c c0553c) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(aVar, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(aVar2, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(aVar3, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(aVar4, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(c0553c, "externalEventLogger");
        this.applicationContext = context;
        this.nfcScanWorkerFactory = aVar;
        this.createReusablePersonaWorkerFactory = aVar2;
        this.verifyReusablePersonaWorkerFactory = aVar3;
        this.navigationStateManager = c0586a;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.componentWorkHelper = aVar4;
        this.externalEventLogger = c0553c;
    }

    private final void l(Input renderProps, UiState.Displaying renderState, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a context) {
        String url;
        UiState.PendingAction pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
            b.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) pendingAction;
            CreatePersonaSheet.Attributes attributes = createReusablePersona.getCreatePersonaSheetComponent().e().getAttributes();
            url = attributes != null ? attributes.getUrl() : null;
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ka.w.l(context, aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), kotlin.jvm.internal.z.j(b.class), "", new C0215f(pendingAction, this, renderState));
            return;
        }
        if (pendingAction instanceof UiState.PendingAction.VerifyReusablePersona) {
            g.a aVar2 = this.verifyReusablePersonaWorkerFactory;
            String sessionToken2 = renderProps.getSessionToken();
            String inquiryId2 = renderProps.getInquiryId();
            UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction;
            VerifyPersonaButton.Attributes attributes2 = verifyReusablePersona.getVerifyPersonaButtonComponent().e().getAttributes();
            url = attributes2 != null ? attributes2.getUrl() : null;
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ka.w.l(context, aVar2.a(sessionToken2, inquiryId2, url, verifyReusablePersona.getVerifyPersonaButtonComponent().getName()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.ui.g.class), "", new g(renderState));
        }
    }

    private final void n(Input renderProps, UiState renderState) throws P9.m {
        AbstractC0559i dVar;
        if (!(renderState instanceof UiState.Displaying)) {
            throw new P9.m();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            UiState.PendingAction pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof UiState.PendingAction.CreateReusablePersona) {
                dVar = new AbstractC0559i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof UiState.PendingAction.VerifyReusablePersona)) {
                    throw new P9.m();
                }
                dVar = new AbstractC0559i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new AbstractC0559i.d(renderProps.getStepName()) : new AbstractC0559i.f(renderProps.getStepName());
        }
        this.externalEventLogger.c(dVar);
    }

    public final void o(ka.r<? super Input, UiState, ? extends c>.c cVar, UiState.Displaying displaying) {
        UiComponent triggeringComponent = displaying.getTriggeringComponent();
        Map<String, ComponentParam> mapF = displaying.f();
        if (triggeringComponent == null || mapF == null) {
            return;
        }
        cVar.d(new c.FinishedWithoutTransition(triggeringComponent, mapF, displaying.getStepName()));
    }

    private final void p(List<? extends UiComponent> list, Function1<? super UiComponent, Unit> function1) {
        for (UiComponent uiComponent : list) {
            if (uiComponent instanceof UiComponentGroup) {
                p(((UiComponentGroup) uiComponent).getChildren(), new h(function1));
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    private final void r(Input renderProps, UiState.Displaying renderState, ka.k<? super Input, UiState, ? extends c, ? extends Object>.a context, UiState.Displaying.NfcScan nfcScan) {
        List<? extends P8.b> listM;
        String str;
        String scanDocumentError;
        String authenticationErrorPrompt;
        String connectionLostPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strB = component.getCardAccessNumberController().b();
        String strB2 = component.getDocumentNumberController().b();
        Date dateB = component.getDateOfBirthController().b();
        Date dateB2 = component.getExpirationDateController().b();
        if (StringsKt.Y(strB2) || dateB == null || dateB2 == null) {
            context.a("client_side_nfc_form_validation", new w(context, this, component, strB2, dateB, dateB2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strB2, dateB2, dateB);
        GovernmentIdNfcScan.Attributes attributes = component.e().getAttributes();
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listM = CollectionsKt.m(new P8.b[]{P8.b.d, P8.b.e, P8.b.v});
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i2 = e.a[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                P8.b bVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : P8.b.v : P8.b.i : P8.b.e : P8.b.d;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            listM = arrayList;
        }
        GovernmentIdNfcScan.Attributes attributes2 = nfcScan.getComponent().e().getAttributes();
        b.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes2 == null || (scanDocumentPrompt = attributes2.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
        String str3 = (attributes2 == null || (authenticating = attributes2.getAuthenticating()) == null) ? "" : authenticating;
        String str4 = (attributes2 == null || (reading = attributes2.getReading()) == null) ? "" : reading;
        Context context2 = this.applicationContext;
        int i3 = S8.e.y;
        String string = context2.getString(i3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str5 = (attributes2 == null || (scanDocumentSuccess = attributes2.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
        String str6 = (attributes2 == null || (enableNfcPrompt = attributes2.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
        String string2 = this.applicationContext.getString(S8.e.z);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(i3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes2 == null || (connectionLostPrompt = attributes2.getConnectionLostPrompt()) == null) {
            String scanDocumentError2 = attributes2 != null ? attributes2.getScanDocumentError() : null;
            str = scanDocumentError2 == null ? "" : scanDocumentError2;
        } else {
            str = connectionLostPrompt;
        }
        Context context3 = this.applicationContext;
        int i4 = S8.e.B;
        String string4 = context3.getString(i4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str7 = (attributes2 == null || (authenticationErrorPrompt = attributes2.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(i4);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str8 = (attributes2 == null || (scanDocumentError = attributes2.getScanDocumentError()) == null) ? "" : scanDocumentError;
        String string6 = this.applicationContext.getString(i4);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        ka.w.l(context, aVar.a(strB, mrzKey, new PassportNfcStrings(str2, str3, str4, string, str5, str6, string2, string3, str, string4, str7, string5, str8, string6), listM, renderProps.getStyles(), null), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.nfc.b.class), "", new x(renderState, nfcScan, component));
    }

    public final void s(UiComponent tappedUiComponent, boolean isTappedComponentVisible, UiState.Displaying renderState) {
        p(renderState.getComponents(), new y(isTappedComponentVisible, tappedUiComponent));
    }

    @Override
    @NotNull
    public UiState d(@NotNull Input props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            okio.h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrJ = hVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.d(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List<UiComponent> listE = com.withpersona.sdk2.inquiry.steps.ui.components.b.e(props.c());
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<UiComponentError> listM = props.m();
        if (listM == null) {
            listM = CollectionsKt.j();
        }
        return new UiState.Displaying(listE, stepName, listM, styles, null, null, null, null, false, false, null, null, null, 8176, null);
    }

    @Override
    @NotNull
    public Object f(@NotNull Input renderProps, @NotNull UiState renderState, @NotNull ka.k<? super Input, UiState, ? extends c, ? extends Object>.a context) throws P9.m {
        Q8.l lVar;
        d.a.AutoSubmit autoSubmit;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        n(renderProps, renderState);
        if (!(renderState instanceof UiState.Displaying)) {
            throw new P9.m();
        }
        UiState.Displaying displaying = (UiState.Displaying) renderState;
        l(renderProps, displaying, context);
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), displaying.getPendingAction() == null && !renderProps.getIsSubmitting());
        p(displaying.getComponents(), new n(renderProps, renderState, context));
        if (displaying.getNfcScan() != null) {
            r(renderProps, displaying, context, displaying.getNfcScan());
        }
        Q8.l lVar2 = renderProps.getInquirySessionConfig().getGpsPrecisionRequirement() == GpsPrecisionRequirement.d ? Q8.l.i : Q8.l.v;
        boolean z = renderProps.getInquirySessionConfig().getGpsCollectionRequirement() == GpsCollectionRequirement.e;
        String error = displaying.getError();
        if (error == null && renderProps.getTransitionError() != null) {
            error = this.applicationContext.getString(S8.e.x);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            ButtonComponent buttonComponent = (ButtonComponent) C0726c.a(displaying.getComponents(), kotlin.jvm.internal.z.b(ButtonComponent.class), o.d);
            if (buttonComponent != null) {
                context.a("begin_countdown", new p(context, this, renderState, buttonComponent, null));
            }
        }
        UiState.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 != null && autoSubmit2.getCountdown() >= 1) {
            context.a("countdown_" + autoSubmit2.getCountdown(), new q(context, this, autoSubmit2, renderState, null));
        }
        List<UiComponent> components = displaying.getComponents();
        List<UiComponentError> listD = displaying.d();
        List<UiComponentError> listM = renderProps.m();
        if (listM == null) {
            listM = CollectionsKt.j();
        }
        List listE0 = CollectionsKt.e0(listD, listM);
        NavigationState navigationStateB = this.navigationStateManager.b();
        r rVar = new r(renderState, renderProps, context);
        s sVar = new s(context, this);
        t tVar = new t(context, this, renderProps);
        u uVar = new u(renderState, context);
        v vVar = new v(renderState, context);
        if (renderProps.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            lVar = lVar2;
            autoSubmit = null;
        } else {
            lVar = lVar2;
            autoSubmit = new d.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0);
        }
        d.a aVar = new d.a(components, listE0, navigationStateB, rVar, sVar, tVar, uVar, vVar, autoSubmit, new i(context, this), new j(context, this, renderState), displaying.getPendingAction() != null || renderProps.getIsSubmitting(), displaying.getStyles(), str, new k(context, this, renderState), new l(context, this, renderState));
        boolean isRequestingGpsPermissions = displaying.getIsRequestingGpsPermissions();
        String gpsPermissionsTitle = renderProps.getGpsPermissionsTitle();
        if (gpsPermissionsTitle == null) {
            gpsPermissionsTitle = "";
        }
        String gpsPermissionsRationale = renderProps.getGpsPermissionsRationale();
        if (gpsPermissionsRationale == null) {
            gpsPermissionsRationale = "Gps permission are required to verify your identity";
        }
        String str2 = gpsPermissionsRationale;
        Context context2 = this.applicationContext;
        String string = context2.getString(S8.e.S, C0456d.b(context2));
        String gpsFeatureModalPositiveButton = renderProps.getGpsFeatureModalPositiveButton();
        if (gpsFeatureModalPositiveButton == null) {
            gpsFeatureModalPositiveButton = this.applicationContext.getString(S8.e.z);
            Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
        }
        String str3 = gpsFeatureModalPositiveButton;
        String gpsPermissionsModalNegativeButton = renderProps.getGpsPermissionsModalNegativeButton();
        if (gpsPermissionsModalNegativeButton == null) {
            gpsPermissionsModalNegativeButton = this.applicationContext.getString(S8.e.z);
            Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
        }
        String str4 = gpsPermissionsModalNegativeButton;
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String gpsFeatureTitle = renderProps.getGpsFeatureTitle();
        String gpsFeatureRationale = renderProps.getGpsFeatureRationale();
        String gpsPermissionsModalNegativeButton2 = renderProps.getGpsPermissionsModalNegativeButton();
        StepStyles.UiStepStyle styles = renderProps.getStyles();
        String requestPermissionKey = displaying.getRequestPermissionKey();
        Intrinsics.d(string);
        return com.withpersona.sdk2.inquiry.permissions.d.d(aVar, context, isRequestingGpsPermissions, lVar, z, gpsPermissionsTitle, str2, string, str3, str4, gpsFeatureTitle, gpsFeatureRationale, gpsPermissionsModalNegativeButton2, permissionRequestWorkflow, styles, requestPermissionKey, new m(context, z, renderState));
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return com.squareup.workflow1.ui.q.a(state);
    }
}
