package com.withpersona.sdk2.inquiry.internal;

import J8.InquiryAttributes;
import T8.SandboxScreen;
import T8.c;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.internal.b;
import com.withpersona.sdk2.inquiry.internal.i;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.internal.n;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.p;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import com.withpersona.sdk2.inquiry.ui.f;
import ha.C0458f;
import ha.C0553c;
import ha.C0586a;
import ha.EnumC0342d;
import ha.InterfaceC0336B;
import ha.InterfaceC0455c;
import ha.InterfaceC0551a;
import ha.InterfaceC0555e;
import ha.L;
import ha.W;
import j9.C0606i;
import j9.EnumC0605h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 k2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0005t\u0092\u0001vxB\u0081\u0001\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J;\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b+\u0010,JA\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050.2\u0006\u0010-\u001a\u00020\u00052\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u0002012\u0006\u0010-\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103JC\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b6\u00107JQ\u0010;\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u0002082\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\b;\u0010<JQ\u0010>\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020=2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\b>\u0010?JQ\u0010A\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020@2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\bA\u0010BJ[\u0010G\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0010F\u001a\u0004\u0018\u00010E2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\bG\u0010HJQ\u0010J\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020I2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\bJ\u0010KJC\u0010M\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020L2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bM\u0010NJQ\u0010P\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020O2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\bP\u0010QJQ\u0010S\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020R2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020509H\u0002¢\u0006\u0004\bS\u0010TJ;\u0010V\u001a\u00020\u00052\u0006\u0010(\u001a\u00020U2\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bV\u0010WJ\u0013\u0010Z\u001a\u00020Y*\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u0002082\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_JG\u0010f\u001a\u000205*\u00180`R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040a2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010d\u001a\u00020X2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bf\u0010gJ!\u0010k\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00022\b\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bk\u0010lJC\u0010m\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00032\"\u0010*\u001a\u001e0)R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u000205H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020i2\u0006\u0010q\u001a\u00020\u0003H\u0016¢\u0006\u0004\br\u0010sR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "La9/c;", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/internal/b$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/i$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/k$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/n$a;", "updateGpsLocationWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/o;", "governmentIdWorkflow", "Lcom/withpersona/sdk2/inquiry/selfie/p;", "selfieWorkflow", "Lcom/withpersona/sdk2/inquiry/ui/f;", "uiWorkflow", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "documentWorkflow", "LT8/c;", "sandboxFlags", "Le9/e;", "externalInquiryController", "Lh9/a;", "navigationStateManager", "Le9/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/b$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/i$b;Lcom/withpersona/sdk2/inquiry/internal/k$a;Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;Lcom/withpersona/sdk2/inquiry/internal/n$a;Lcom/withpersona/sdk2/inquiry/governmentid/o;Lcom/withpersona/sdk2/inquiry/selfie/p;Lcom/withpersona/sdk2/inquiry/ui/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;LT8/c;Le9/e;Lh9/a;Le9/c;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;", "renderState", "Lf8/k$a;", "context", "t", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;Lf8/k$a;)Ljava/lang/Object;", "screen", "LT8/i;", "J", "(Ljava/lang/Object;Lf8/k$a;)LT8/i;", "Lj9/i;", "K", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lj9/i;", "renderProps", "", "E", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lf8/k$a;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lkotlin/Function0;", "backAction", "B", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;", "u", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquiryFromTemplate;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;", "z", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ResumeFallbackInquiry;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LJ8/c;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "y", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;LJ8/c;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;", "v", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$CreateInquirySession;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;", "x", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;Lf8/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;", "A", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;", "C", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$UiStepRunning;Lf8/k$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;", "w", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$DocumentStepRunning;Lf8/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "q", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)Z", "LF8/B;", "stepState", "D", "(LF8/B;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState$ShowLoadingSpinner;", "Lf8/r$c;", "Lf8/r;", "", "sessionToken", "error", "errorMessage", "G", "(Lf8/r$c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;Ljava/lang/String;)V", "props", "Lf8/i;", "snapshot", "p", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "r", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;Lcom/withpersona/sdk2/inquiry/internal/InquiryState;Lf8/k$a;)Ljava/lang/Object;", "close", "()V", "state", "I", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lf8/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/internal/b$a;", "c", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "d", "Lcom/withpersona/sdk2/inquiry/internal/i$b;", "e", "Lcom/withpersona/sdk2/inquiry/internal/k$a;", "f", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/n$a;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/o;", "i", "Lcom/withpersona/sdk2/inquiry/selfie/p;", "j", "Lcom/withpersona/sdk2/inquiry/ui/f;", "k", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;", "l", "LT8/c;", "m", "Le9/e;", "n", "Lh9/a;", "o", "Le9/c;", "Output", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InquiryWorkflow extends ka.k<b, InquiryState, Output, Object> implements InterfaceC0455c {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final b.a createInquiryWorker;

    @NotNull
    private final a.C0126a inquirySessionWorker;

    @NotNull
    private final i.b pollingWorker;

    @NotNull
    private final k.a transitionBackWorker;

    @NotNull
    private final TransitionWorker.a transitionWorkerFactory;

    @NotNull
    private final n.a updateGpsLocationWorkerFactory;

    @NotNull
    private final com.withpersona.sdk2.inquiry.governmentid.o governmentIdWorkflow;

    @NotNull
    private final com.withpersona.sdk2.inquiry.selfie.p selfieWorkflow;

    @NotNull
    private final com.withpersona.sdk2.inquiry.ui.f uiWorkflow;

    @NotNull
    private final DocumentWorkflow documentWorkflow;

    @NotNull
    private final T8.c sandboxFlags;

    @NotNull
    private final InterfaceC0555e externalInquiryController;

    @NotNull
    private final C0586a navigationStateManager;

    @NotNull
    private final C0553c externalEventLogger;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends c {
            public a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lkotlin/Function0;", "", "onBack", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "b", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "c", "()Z", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends c {

            private final StepStyle styles;

            private final boolean useBasicSpinner;

            @NotNull
            private final Function0<Unit> onBack;

            public b(StepStyle stepStyle, boolean z, @NotNull Function0<Unit> function0) {
                super(null);
                Intrinsics.checkNotNullParameter(function0, "onBack");
                this.styles = stepStyle;
                this.useBasicSpinner = z;
                this.onBack = function0;
            }

            @NotNull
            public final Function0<Unit> a() {
                return this.onBack;
            }

            public final StepStyle getStyles() {
                return this.styles;
            }

            public final boolean getUseBasicSpinner() {
                return this.useBasicSpinner;
            }
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class d {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr2[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$1", f = "InquiryWorkflow.kt", l = {156}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<b, InquiryState, Output, Object>.a i;
        final InquiryState v;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le9/a;", "it", "", "a", "(Le9/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements ka.h {
            final ka.k<b, InquiryState, Output, Object>.a d;
            final InquiryWorkflow e;
            final InquiryState i;

            a(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState) {
                this.d = aVar;
                this.e = inquiryWorkflow;
                this.i = inquiryState;
            }

            public final Object c(@NotNull InterfaceC0551a interfaceC0551a, @NotNull Continuation<? super Unit> continuation) {
                if (interfaceC0551a instanceof InterfaceC0551a.CancelRequest) {
                    InquiryWorkflow.s(this.d, this.e, this.i, ((InterfaceC0551a.CancelRequest) interfaceC0551a).getForce());
                }
                return Unit.a;
            }
        }

        e(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryState inquiryState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.i = aVar;
            this.v = inquiryState;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return InquiryWorkflow.this.new e(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                ka.g<InterfaceC0551a> gVarC = InquiryWorkflow.this.externalInquiryController.c();
                a aVar = new a(this.i, InquiryWorkflow.this, this.v);
                this.d = 1;
                if (gVarC.a(aVar, this) == objC) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$2", f = "InquiryWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<b, InquiryState, Output, Object>.a e;
        final InquiryWorkflow i;
        final InquiryState v;

        f(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, Continuation<? super f> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = inquiryWorkflow;
            this.v = inquiryState;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.e, this.i, this.v, continuation);
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
            InquiryWorkflow.s(this.e, this.i, this.v, true);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<b, InquiryState, Output, Object>.a d;
        final InquiryWorkflow e;
        final InquiryState i;

        g(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState) {
            super(0);
            this.d = aVar;
            this.e = inquiryWorkflow;
            this.i = inquiryState;
        }

        public Object invoke() {
            m82invoke();
            return Unit.a;
        }

        public final void m82invoke() {
            InquiryWorkflow.s(this.d, this.e, this.i, false);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
        final InquiryState d;
        final boolean e;

        h(InquiryState inquiryState, boolean z) {
            super(1);
            this.d = inquiryState;
            this.e = z;
        }

        public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            String inquiryId = this.d.getInquiryId();
            String sessionToken = this.d.getSessionToken();
            StepStyle styles = this.d.getStyles();
            NextStep.CancelDialog cancelDialog = this.d.getCancelDialog();
            String title = cancelDialog != null ? cancelDialog.getTitle() : null;
            NextStep.CancelDialog cancelDialog2 = this.d.getCancelDialog();
            String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
            NextStep.CancelDialog cancelDialog3 = this.d.getCancelDialog();
            String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
            NextStep.CancelDialog cancelDialog4 = this.d.getCancelDialog();
            cVar.d(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, this.e));
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderComplete$1", f = "InquiryWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<b, InquiryState, Output, Object>.a e;
        final InquiryWorkflow i;
        final InquiryState.Complete v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.Complete d;

            a(InquiryState.Complete complete) {
                super(1);
                this.d = complete;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new Output.Complete(this.d.getInquiryId(), this.d.getInquiryStatus(), this.d.n(), this.d.getSessionToken()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, InquiryState.Complete complete, Continuation<? super i> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = inquiryWorkflow;
            this.v = complete;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.e, this.i, this.v, continuation);
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
            this.e.b().d(z.d(this.i, null, new a(this.v), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/a$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.jvm.internal.l implements Function1<a.b, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState.CreateInquirySession e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.CreateInquirySession d;
            final a.b e;

            a(InquiryState.CreateInquirySession createInquirySession, a.b bVar) {
                super(1);
                this.d = createInquirySession;
                this.e = bVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                TransitionStatus transitionStatus = null;
                cVar.e(new InquiryState.ShowLoadingSpinner(((a.b.Success) this.e).getSessionToken(), transitionStatus, this.d.getInquiryId(), null, true, ((a.b.Success) this.e).getInquirySessionConfig(), 2, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final InquiryState.CreateInquirySession e;
            final a.b i;

            b(InquiryWorkflow inquiryWorkflow, InquiryState.CreateInquirySession createInquirySession, a.b bVar) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = createInquirySession;
                this.i = bVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                InquiryWorkflow.H(this.d, cVar, this.e.getSessionToken(), ((a.b.Error) this.i).getCause(), null, 4, null);
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j(InquiryState.CreateInquirySession createInquirySession) {
            super(1);
            this.e = createInquirySession;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull a.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof a.b.Success) {
                return z.d(InquiryWorkflow.this, null, new a(this.e, bVar), 1, null);
            }
            if (!(bVar instanceof a.b.Error)) {
                throw new P9.m();
            }
            InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
            return z.d(inquiryWorkflow, null, new b(inquiryWorkflow, this.e, bVar), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.jvm.internal.l implements Function1<DocumentWorkflow.AbstractC0500c, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState.DocumentStepRunning e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.DocumentStepRunning d;

            a(InquiryState.DocumentStepRunning documentStepRunning) {
                super(1);
                this.d = documentStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                String inquiryId = this.d.getInquiryId();
                String sessionToken = this.d.getSessionToken();
                StepStyles.DocumentStepStyle styles = this.d.getStyles();
                NextStep.CancelDialog cancelDialog = this.d.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = this.d.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = this.d.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = this.d.getCancelDialog();
                cVar.d(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.DocumentStepRunning d;

            b(InquiryState.DocumentStepRunning documentStepRunning) {
                super(1);
                this.d = documentStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.DocumentStepRunning.i(this.d, null, null, TransitionStatus.TransitioningBack.d, null, null, null, null, null, null, null, 1019, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final DocumentWorkflow.AbstractC0500c e;
            final InquiryState.DocumentStepRunning i;

            c(InquiryWorkflow inquiryWorkflow, DocumentWorkflow.AbstractC0500c abstractC0500c, InquiryState.DocumentStepRunning documentStepRunning) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = abstractC0500c;
                this.i = documentStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.q(((DocumentWorkflow.AbstractC0500c.Errored) this.e).getCause())) {
                    cVar.e(this.d.D(this.i));
                } else {
                    InquiryWorkflow.H(this.d, cVar, this.i.getSessionToken(), ((DocumentWorkflow.AbstractC0500c.Errored) this.e).getCause(), null, 4, null);
                }
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.DocumentStepRunning d;

            d(InquiryState.DocumentStepRunning documentStepRunning) {
                super(1);
                this.d = documentStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.DocumentStepRunning.i(this.d, null, null, new TransitionStatus.CheckingForNextState(null, 1, null), null, null, null, null, null, null, null, 1019, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(InquiryState.DocumentStepRunning documentStepRunning) {
            super(1);
            this.e = documentStepRunning;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull DocumentWorkflow.AbstractC0500c abstractC0500c) throws P9.m {
            Intrinsics.checkNotNullParameter(abstractC0500c, "it");
            if (Intrinsics.b(abstractC0500c, DocumentWorkflow.AbstractC0500c.b.a)) {
                return z.d(InquiryWorkflow.this, null, new a(this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0500c, DocumentWorkflow.AbstractC0500c.a.a)) {
                return z.d(InquiryWorkflow.this, null, new b(this.e), 1, null);
            }
            if (abstractC0500c instanceof DocumentWorkflow.AbstractC0500c.Errored) {
                InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                return z.d(inquiryWorkflow, null, new c(inquiryWorkflow, abstractC0500c, this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0500c, DocumentWorkflow.AbstractC0500c.d.a)) {
                return z.d(InquiryWorkflow.this, null, new d(this.e), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.jvm.internal.l implements Function1<o.AbstractC0521b, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState.GovernmentIdStepRunning e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.GovernmentIdStepRunning d;

            a(InquiryState.GovernmentIdStepRunning governmentIdStepRunning) {
                super(1);
                this.d = governmentIdStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                String inquiryId = this.d.getInquiryId();
                String sessionToken = this.d.getSessionToken();
                StepStyles.GovernmentIdStepStyle styles = this.d.getStyles();
                NextStep.CancelDialog cancelDialog = this.d.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = this.d.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = this.d.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = this.d.getCancelDialog();
                cVar.d(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final o.AbstractC0521b e;
            final InquiryState.GovernmentIdStepRunning i;

            b(InquiryWorkflow inquiryWorkflow, o.AbstractC0521b abstractC0521b, InquiryState.GovernmentIdStepRunning governmentIdStepRunning) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = abstractC0521b;
                this.i = governmentIdStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.q(((o.AbstractC0521b.c) this.e).getCause())) {
                    cVar.e(this.d.D(this.i));
                } else {
                    InquiryWorkflow.H(this.d, cVar, this.i.getSessionToken(), ((o.AbstractC0521b.c) this.e).getCause(), null, 4, null);
                }
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.GovernmentIdStepRunning d;

            c(InquiryState.GovernmentIdStepRunning governmentIdStepRunning) {
                super(1);
                this.d = governmentIdStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.GovernmentIdStepRunning.i(this.d, null, null, new TransitionStatus.CheckingForNextState(null, 1, null), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.GovernmentIdStepRunning d;

            d(InquiryState.GovernmentIdStepRunning governmentIdStepRunning) {
                super(1);
                this.d = governmentIdStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.GovernmentIdStepRunning.i(this.d, null, null, TransitionStatus.TransitioningBack.d, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        l(InquiryState.GovernmentIdStepRunning governmentIdStepRunning) {
            super(1);
            this.e = governmentIdStepRunning;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull o.AbstractC0521b abstractC0521b) throws P9.m {
            Intrinsics.checkNotNullParameter(abstractC0521b, "it");
            if (Intrinsics.b(abstractC0521b, o.AbstractC0521b.C0113b.a)) {
                return z.d(InquiryWorkflow.this, null, new a(this.e), 1, null);
            }
            if (abstractC0521b instanceof o.AbstractC0521b.c) {
                InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                return z.d(inquiryWorkflow, null, new b(inquiryWorkflow, abstractC0521b, this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0521b, o.AbstractC0521b.d.a)) {
                return z.d(InquiryWorkflow.this, null, new c(this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0521b, o.AbstractC0521b.a.a)) {
                return z.d(InquiryWorkflow.this, null, new d(this.e), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/b$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class m extends kotlin.jvm.internal.l implements Function1<b.AbstractC0129b, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryAttributes e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final b.AbstractC0129b d;
            final InquiryWorkflow e;

            a(b.AbstractC0129b abstractC0129b, InquiryWorkflow inquiryWorkflow) {
                super(1);
                this.d = abstractC0129b;
                this.e = inquiryWorkflow;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (C0458f.e(((b.AbstractC0129b.Success) this.d).getInquiryId())) {
                    cVar.d(new Output.ReinitializeWithFallbackMode(((b.AbstractC0129b.Success) this.d).getInquiryId(), ((b.AbstractC0129b.Success) this.d).getFallbackSessionToken()));
                } else {
                    this.e.externalEventLogger.b(new InquiryEvent.StartEvent(((b.AbstractC0129b.Success) this.d).getInquiryId()));
                    cVar.e(new InquiryState.CreateInquirySession(((b.AbstractC0129b.Success) this.d).getInquiryId()));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final InquiryAttributes e;
            final b.AbstractC0129b i;

            b(InquiryWorkflow inquiryWorkflow, InquiryAttributes inquiryAttributes, b.AbstractC0129b abstractC0129b) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = inquiryAttributes;
                this.i = abstractC0129b;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.G(cVar, this.e.getSessionToken(), ((b.AbstractC0129b.Error) this.i).getCause(), ((b.AbstractC0129b.Error) this.i).getDebugMessage());
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        m(InquiryAttributes inquiryAttributes) {
            super(1);
            this.e = inquiryAttributes;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull b.AbstractC0129b abstractC0129b) throws P9.m {
            Intrinsics.checkNotNullParameter(abstractC0129b, "it");
            if (abstractC0129b instanceof b.AbstractC0129b.Success) {
                InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                return z.d(inquiryWorkflow, null, new a(abstractC0129b, inquiryWorkflow), 1, null);
            }
            if (!(abstractC0129b instanceof b.AbstractC0129b.Error)) {
                throw new P9.m();
            }
            InquiryWorkflow inquiryWorkflow2 = InquiryWorkflow.this;
            return z.d(inquiryWorkflow2, null, new b(inquiryWorkflow2, this.e, abstractC0129b), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/p$c;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class n extends kotlin.jvm.internal.l implements Function1<p.AbstractC0527c, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState.SelfieStepRunning e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.SelfieStepRunning d;

            a(InquiryState.SelfieStepRunning selfieStepRunning) {
                super(1);
                this.d = selfieStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                String inquiryId = this.d.getInquiryId();
                String sessionToken = this.d.getSessionToken();
                StepStyles.SelfieStepStyle styles = this.d.getStyles();
                NextStep.CancelDialog cancelDialog = this.d.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = this.d.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = this.d.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = this.d.getCancelDialog();
                cVar.d(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.SelfieStepRunning d;

            b(InquiryState.SelfieStepRunning selfieStepRunning) {
                super(1);
                this.d = selfieStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.SelfieStepRunning.i(this.d, null, null, new TransitionStatus.CheckingForNextState(null, 1, null), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.SelfieStepRunning d;

            c(InquiryState.SelfieStepRunning selfieStepRunning) {
                super(1);
                this.d = selfieStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.SelfieStepRunning.i(this.d, null, null, TransitionStatus.TransitioningBack.d, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final p.AbstractC0527c e;
            final InquiryState.SelfieStepRunning i;

            d(InquiryWorkflow inquiryWorkflow, p.AbstractC0527c abstractC0527c, InquiryState.SelfieStepRunning selfieStepRunning) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = abstractC0527c;
                this.i = selfieStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.q(((p.AbstractC0527c.Error) this.e).getCause())) {
                    cVar.e(this.d.D(this.i));
                } else {
                    InquiryWorkflow.H(this.d, cVar, this.i.getSessionToken(), ((p.AbstractC0527c.Error) this.e).getCause(), null, 4, null);
                }
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        n(InquiryState.SelfieStepRunning selfieStepRunning) {
            super(1);
            this.e = selfieStepRunning;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull p.AbstractC0527c abstractC0527c) throws P9.m {
            Intrinsics.checkNotNullParameter(abstractC0527c, "it");
            if (Intrinsics.b(abstractC0527c, p.AbstractC0527c.b.a)) {
                return z.d(InquiryWorkflow.this, null, new a(this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0527c, p.AbstractC0527c.d.a)) {
                return z.d(InquiryWorkflow.this, null, new b(this.e), 1, null);
            }
            if (Intrinsics.b(abstractC0527c, p.AbstractC0527c.a.a)) {
                return z.d(InquiryWorkflow.this, null, new c(this.e), 1, null);
            }
            if (!(abstractC0527c instanceof p.AbstractC0527c.Error)) {
                throw new P9.m();
            }
            InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
            return z.d(inquiryWorkflow, null, new d(inquiryWorkflow, abstractC0527c, this.e), 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderUiStep$1", f = "InquiryWorkflow.kt", l = {754}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<b, InquiryState, Output, Object>.a e;
        final InquiryWorkflow i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                InquiryState inquiryStateC = cVar.c();
                InquiryState.UiStepRunning uiStepRunning = inquiryStateC instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) inquiryStateC : null;
                if (uiStepRunning == null) {
                    return;
                }
                cVar.e(InquiryState.UiStepRunning.i(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 98303, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        o(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, Continuation<? super o> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = inquiryWorkflow;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.e, this.i, continuation);
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
                if (W.a(2000L, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            this.e.b().d(z.d(this.i, null, a.d, 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/f$c;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.jvm.internal.l implements Function1<f.c, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState.UiStepRunning e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.UiStepRunning d;

            a(InquiryState.UiStepRunning uiStepRunning) {
                super(1);
                this.d = uiStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                String inquiryId = this.d.getInquiryId();
                String sessionToken = this.d.getSessionToken();
                StepStyles.UiStepStyle styles = this.d.getStyles();
                NextStep.CancelDialog cancelDialog = this.d.getCancelDialog();
                String title = cancelDialog != null ? cancelDialog.getTitle() : null;
                NextStep.CancelDialog cancelDialog2 = this.d.getCancelDialog();
                String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
                NextStep.CancelDialog cancelDialog3 = this.d.getCancelDialog();
                String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
                NextStep.CancelDialog cancelDialog4 = this.d.getCancelDialog();
                cVar.d(new Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final f.c e;
            final InquiryState.UiStepRunning i;

            b(InquiryWorkflow inquiryWorkflow, f.c cVar, InquiryState.UiStepRunning uiStepRunning) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = cVar;
                this.i = uiStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.q(((f.c.d) this.e).getCause())) {
                    cVar.e(this.d.D(this.i));
                } else {
                    this.d.G(cVar, this.i.getSessionToken(), ((f.c.d) this.e).getCause(), ((f.c.d) this.e).getMessage());
                }
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.UiStepRunning d;
            final f.c e;

            c(InquiryState.UiStepRunning uiStepRunning, f.c cVar) {
                super(1);
                this.d = uiStepRunning;
                this.e = cVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.UiStepRunning.i(this.d, null, null, new TransitionStatus.Transitioning(new TransitionWorker.TransitionData(((f.c.FinishedWithoutTransition) this.e).getFromComponent(), ((f.c.FinishedWithoutTransition) this.e).a(), ((f.c.FinishedWithoutTransition) this.e).getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, 131067, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.UiStepRunning d;

            d(InquiryState.UiStepRunning uiStepRunning) {
                super(1);
                this.d = uiStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.UiStepRunning.i(this.d, null, null, new TransitionStatus.UpdateGpsLocation(null), null, null, null, null, null, null, false, false, false, null, null, null, null, null, 131067, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class e extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.UiStepRunning d;

            e(InquiryState.UiStepRunning uiStepRunning) {
                super(1);
                this.d = uiStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(InquiryState.UiStepRunning.i(this.d, null, null, TransitionStatus.TransitioningBack.d, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 131067, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class f extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryState.UiStepRunning d;

            f(InquiryState.UiStepRunning uiStepRunning) {
                super(1);
                this.d = uiStepRunning;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new Output.Complete(this.d.getInquiryId(), this.d.getInquiryStatus(), this.d.q(), this.d.getSessionToken()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        p(InquiryState.UiStepRunning uiStepRunning) {
            super(1);
            this.e = uiStepRunning;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull f.c cVar) throws P9.m {
            Intrinsics.checkNotNullParameter(cVar, "it");
            if (Intrinsics.b(cVar, f.c.b.a)) {
                return z.d(InquiryWorkflow.this, null, new a(this.e), 1, null);
            }
            if (cVar instanceof f.c.d) {
                InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                return z.d(inquiryWorkflow, null, new b(inquiryWorkflow, cVar, this.e), 1, null);
            }
            if (cVar instanceof f.c.FinishedWithoutTransition) {
                return z.d(InquiryWorkflow.this, null, new c(this.e, cVar), 1, null);
            }
            if (Intrinsics.b(cVar, f.c.e.a)) {
                return z.d(InquiryWorkflow.this, null, new d(this.e), 1, null);
            }
            if (cVar instanceof f.c.a) {
                return z.d(InquiryWorkflow.this, null, new e(this.e), 1, null);
            }
            if (cVar instanceof f.c.C0212c) {
                return z.d(InquiryWorkflow.this, null, new f(this.e), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class q extends kotlin.jvm.internal.l implements Function1<TransitionWorker.b, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState e;
        final String i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final TransitionWorker.b d;

            a(TransitionWorker.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(cVar.c().g(new TransitionStatus.UpdateGpsLocation(((TransitionWorker.b.Success) this.d).getNextState())));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        q(InquiryState inquiryState, String str) {
            super(1);
            this.e = inquiryState;
            this.i = str;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull TransitionWorker.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof TransitionWorker.b.Error) {
                return InquiryWorkflow.F(InquiryWorkflow.this, this.e, this.i, ((TransitionWorker.b.Error) bVar).getCause());
            }
            if (bVar instanceof TransitionWorker.b.Success) {
                return z.d(InquiryWorkflow.this, null, new a(bVar), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/n$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/n$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class r extends kotlin.jvm.internal.l implements Function1<n.b, ka.r<? super b, InquiryState, ? extends Output>> {
        final String e;
        final TransitionStatus i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final String e;
            final n.b i;

            a(InquiryWorkflow inquiryWorkflow, String str, n.b bVar) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = str;
                this.i = bVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                InquiryWorkflow.H(this.d, cVar, this.e, ((n.b.Error) this.i).getCause(), null, 4, null);
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final TransitionStatus d;

            b(TransitionStatus transitionStatus) {
                super(1);
                this.d = transitionStatus;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (((TransitionStatus.UpdateGpsLocation) this.d).getNextStep() != null) {
                    cVar.e(((TransitionStatus.UpdateGpsLocation) this.d).getNextStep());
                } else {
                    cVar.e(cVar.c().g(new TransitionStatus.CheckingForNextState(null, 1, null)));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        r(String str, TransitionStatus transitionStatus) {
            super(1);
            this.e = str;
            this.i = transitionStatus;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull n.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof n.b.Error) {
                InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
                return z.d(inquiryWorkflow, null, new a(inquiryWorkflow, this.e, bVar), 1, null);
            }
            if (Intrinsics.b(bVar, n.b.C0138b.a)) {
                return z.d(InquiryWorkflow.this, null, new b(this.i), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$c;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/i$c;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class s extends kotlin.jvm.internal.l implements Function1<i.c, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState e;
        final String i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final i.c d;

            a(i.c cVar) {
                super(1);
                this.d = cVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(((i.c.Success) this.d).getNextState());
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final i.c d;

            b(i.c cVar) {
                super(1);
                this.d = cVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(cVar.c().g(new TransitionStatus.CheckingForNextState(((i.c.PollingModeChanged) this.d).getNewPollingMode())));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        s(InquiryState inquiryState, String str) {
            super(1);
            this.e = inquiryState;
            this.i = str;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull i.c cVar) throws P9.m {
            Intrinsics.checkNotNullParameter(cVar, "it");
            if (cVar instanceof i.c.Success) {
                return z.d(InquiryWorkflow.this, null, new a(cVar), 1, null);
            }
            if (cVar instanceof i.c.Error) {
                return InquiryWorkflow.F(InquiryWorkflow.this, this.e, this.i, ((i.c.Error) cVar).getCause());
            }
            if (cVar instanceof i.c.PollingModeChanged) {
                return z.d(InquiryWorkflow.this, null, new b(cVar), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/k$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class t extends kotlin.jvm.internal.l implements Function1<k.b, ka.r<? super b, InquiryState, ? extends Output>> {
        final InquiryState e;
        final String i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final k.b d;

            a(k.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                ((k.b.Success) this.d).getNextState().f(true);
                cVar.e(((k.b.Success) this.d).getNextState());
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            final InquiryWorkflow d;
            final k.b e;
            final InquiryState i;
            final String v;

            b(InquiryWorkflow inquiryWorkflow, k.b bVar, InquiryState inquiryState, String str) {
                super(1);
                this.d = inquiryWorkflow;
                this.e = bVar;
                this.i = inquiryState;
                this.v = str;
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.q(((k.b.Error) this.e).getCause())) {
                    Parcelable parcelable = this.i;
                    if (parcelable instanceof InterfaceC0336B) {
                        cVar.e(this.d.D((InterfaceC0336B) parcelable));
                        return;
                    }
                }
                InquiryWorkflow.H(this.d, cVar, this.v, ((k.b.Error) this.e).getCause(), null, 4, null);
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        t(InquiryState inquiryState, String str) {
            super(1);
            this.e = inquiryState;
            this.i = str;
        }

        @NotNull
        public final ka.r<b, InquiryState, Output> invoke(@NotNull k.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof k.b.Success) {
                return z.d(InquiryWorkflow.this, null, new a(bVar), 1, null);
            }
            if (!(bVar instanceof k.b.Error)) {
                throw new P9.m();
            }
            InquiryWorkflow inquiryWorkflow = InquiryWorkflow.this;
            return z.d(inquiryWorkflow, null, new b(inquiryWorkflow, bVar, this.e, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class u extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
        final InternalErrorInfo d;
        final InquiryState e;
        final InquiryWorkflow i;
        final String v;

        u(InternalErrorInfo internalErrorInfo, InquiryState inquiryState, InquiryWorkflow inquiryWorkflow, String str) {
            super(1);
            this.d = internalErrorInfo;
            this.e = inquiryState;
            this.i = inquiryWorkflow;
            this.v = str;
        }

        public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) throws P9.m {
            Collection<UiComponentError> collectionValues;
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            InternalErrorInfo internalErrorInfo = this.d;
            if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
                if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo ? true : internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                    InquiryWorkflow.H(this.i, cVar, this.v, internalErrorInfo, null, 4, null);
                    return;
                }
                return;
            }
            ErrorResponse.Error responseError = ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).getResponseError();
            listR0 = null;
            List listR0 = null;
            if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
                InquiryState inquiryStateC = cVar.c();
                InquiryState.UiStepRunning uiStepRunning = inquiryStateC instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) inquiryStateC : null;
                if (uiStepRunning == null) {
                    return;
                }
                Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
                if (details != null && (collectionValues = details.values()) != null) {
                    listR0 = CollectionsKt.r0(collectionValues);
                }
                cVar.e(InquiryState.UiStepRunning.i(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, listR0, null, null, 114683, null));
                return;
            }
            if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
                InquiryState inquiryState = this.e;
                if (inquiryState instanceof InterfaceC0336B) {
                    cVar.e(this.i.D((InterfaceC0336B) inquiryState));
                    return;
                } else {
                    InquiryWorkflow.H(this.i, cVar, this.v, this.d, null, 4, null);
                    return;
                }
            }
            if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError ? true : responseError instanceof ErrorResponse.Error.InactiveTemplateError ? true : responseError instanceof ErrorResponse.Error.InvalidConfigError ? true : responseError instanceof ErrorResponse.Error.RateLimitExceededError ? true : responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError ? true : responseError instanceof ErrorResponse.Error.UnauthenticatedError ? true : responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
                z = false;
            }
            if (z) {
                if (!((InternalErrorInfo.NetworkErrorInfo) this.d).isRecoverable()) {
                    InquiryWorkflow.H(this.i, cVar, this.v, this.d, null, 4, null);
                    return;
                }
                InquiryState inquiryStateC2 = cVar.c();
                InquiryState.UiStepRunning uiStepRunning2 = inquiryStateC2 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) inquiryStateC2 : null;
                if (uiStepRunning2 == null) {
                    return;
                }
                cVar.e(InquiryState.UiStepRunning.i(uiStepRunning2, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, this.d, null, 98299, null));
            }
        }

        public Object invoke(Object obj) throws P9.m {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<b, InquiryState, Output, Object>.a e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        v(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() throws P9.m {
            m83invoke();
            return Unit.a;
        }

        public final void m83invoke() throws P9.m {
            InquiryWorkflow.this.sandboxFlags.f();
            this.e.b().d(z.d(InquiryWorkflow.this, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LT8/c$b;", "a", "()LT8/c$b;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class w extends kotlin.jvm.internal.l implements Function0<c.b> {
        w() {
            super(0);
        }

        @NotNull
        public final c.b invoke() {
            return InquiryWorkflow.this.sandboxFlags.getDebugForcedStatus();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class x extends kotlin.jvm.internal.l implements Function1<Boolean, Unit> {
        final ka.k<b, InquiryState, Output, Object>.a e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super b, InquiryState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super b, InquiryState, ? extends Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        x(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(boolean z) {
            InquiryWorkflow.this.sandboxFlags.e(z);
            this.e.b().d(z.d(InquiryWorkflow.this, null, a.d, 1, null));
        }

        public Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.a;
        }
    }

    public InquiryWorkflow(@NotNull Context context, @NotNull b.a aVar, @NotNull a.C0126a c0126a, @NotNull i.b bVar, @NotNull k.a aVar2, @NotNull TransitionWorker.a aVar3, @NotNull n.a aVar4, @NotNull com.withpersona.sdk2.inquiry.governmentid.o oVar, @NotNull com.withpersona.sdk2.inquiry.selfie.p pVar, @NotNull com.withpersona.sdk2.inquiry.ui.f fVar, @NotNull DocumentWorkflow documentWorkflow, @NotNull T8.c cVar, @NotNull InterfaceC0555e interfaceC0555e, @NotNull C0586a c0586a, @NotNull C0553c c0553c) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(aVar, "createInquiryWorker");
        Intrinsics.checkNotNullParameter(c0126a, "inquirySessionWorker");
        Intrinsics.checkNotNullParameter(bVar, "pollingWorker");
        Intrinsics.checkNotNullParameter(aVar2, "transitionBackWorker");
        Intrinsics.checkNotNullParameter(aVar3, "transitionWorkerFactory");
        Intrinsics.checkNotNullParameter(aVar4, "updateGpsLocationWorkerFactory");
        Intrinsics.checkNotNullParameter(oVar, "governmentIdWorkflow");
        Intrinsics.checkNotNullParameter(pVar, "selfieWorkflow");
        Intrinsics.checkNotNullParameter(fVar, "uiWorkflow");
        Intrinsics.checkNotNullParameter(documentWorkflow, "documentWorkflow");
        Intrinsics.checkNotNullParameter(cVar, "sandboxFlags");
        Intrinsics.checkNotNullParameter(interfaceC0555e, "externalInquiryController");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        Intrinsics.checkNotNullParameter(c0553c, "externalEventLogger");
        this.applicationContext = context;
        this.createInquiryWorker = aVar;
        this.inquirySessionWorker = c0126a;
        this.pollingWorker = bVar;
        this.transitionBackWorker = aVar2;
        this.transitionWorkerFactory = aVar3;
        this.updateGpsLocationWorkerFactory = aVar4;
        this.governmentIdWorkflow = oVar;
        this.selfieWorkflow = pVar;
        this.uiWorkflow = fVar;
        this.documentWorkflow = documentWorkflow;
        this.sandboxFlags = cVar;
        this.externalInquiryController = interfaceC0555e;
        this.navigationStateManager = c0586a;
        this.externalEventLogger = c0553c;
    }

    private final Object A(b renderProps, InquiryState.SelfieStepRunning renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) throws P9.m {
        String str;
        com.withpersona.sdk2.inquiry.selfie.p pVar;
        List listD;
        List arrayList;
        String fromStep = renderState.getFromStep();
        com.withpersona.sdk2.inquiry.selfie.p pVar2 = this.selfieWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromComponent = renderState.getFromComponent();
        String fromStep2 = renderState.getFromStep();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        String fieldKeySelfie = renderState.getFieldKeySelfie();
        boolean requireStrictSelfieCapture = renderState.getRequireStrictSelfieCapture();
        boolean skipPromptPage = renderState.getSkipPromptPage();
        p.Input.Strings stringsJ = J8.a.j(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        com.withpersona.sdk2.inquiry.selfie.n nVarA = com.withpersona.sdk2.inquiry.selfie.o.a(renderState.getSelfieType());
        List<NextStep.Selfie.SelfiePose> listW = renderState.w();
        if (listW == null || listW.isEmpty()) {
            str = fromStep;
            pVar = pVar2;
            int i2 = d.a[renderState.getSelfieType().ordinal()];
            if (i2 == 1) {
                listD = CollectionsKt.d(Selfie.b.d);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new P9.m();
                }
                listD = CollectionsKt.m(new Selfie.b[]{Selfie.b.d, Selfie.b.e, Selfie.b.i});
            }
            arrayList = listD;
        } else {
            List<NextStep.Selfie.SelfiePose> listW2 = renderState.w();
            str = fromStep;
            pVar = pVar2;
            arrayList = new ArrayList(CollectionsKt.t(listW2, 10));
            Iterator<T> it = listW2.iterator();
            while (it.hasNext()) {
                arrayList.add(com.withpersona.sdk2.inquiry.selfie.i.c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        String cameraPermissionsTitle = renderState.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnCancel();
        StepStyles.SelfieStepStyle styles = renderState.getStyles();
        NextStep.Selfie.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Selfie.AssetConfig(null, null, 3, null);
        }
        NextStep.Selfie.AssetConfig assetConfig2 = assetConfig;
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getPendingPageTextVerticalPosition();
        List<NextStep.Selfie.CaptureFileType> listR = renderState.r();
        List<NextStep.Selfie.VideoCaptureMethod> listE = renderState.E();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(listE, 10));
        Iterator<T> it2 = listE.iterator();
        while (it2.hasNext()) {
            arrayList2.add(EnumC0732a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        return new K8.b(context.c(pVar, new p.Input(sessionToken, inquiryId, fromComponent, fromStep2, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, stringsJ, nVarA, arrayList, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, new VideoCaptureConfig(0L, listR, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null), assetConfig2, pendingPageTextVerticalPosition, renderState.getPoseConfigs()), str, new n(renderState)), true ^ Intrinsics.b(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.d), renderState.getFromStep());
    }

    private final Object B(b renderProps, InquiryState.ShowLoadingSpinner renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) {
        C0586a.d(this.navigationStateManager, false, false, false, 4, null);
        return new c.b(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction);
    }

    private final Object C(b renderProps, InquiryState.UiStepRunning renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) {
        NextStep.Ui.PromptPage promptPage;
        NextStep.Ui.PromptPage promptPage2;
        NextStep.Ui.PromptPage promptPage3;
        NextStep.Ui.PromptPage promptPage4;
        NextStep.Ui.PromptPage promptPage5;
        NextStep.Ui.PromptPage promptPage6;
        NextStep.Ui.PromptPage promptPage7;
        String gpsFeatureTurnOnText = null;
        if (renderState.getTransitionError() != null) {
            context.a(ha.n.a(renderState.getTransitionError()).name(), new o(context, this, null));
        }
        String clientSideKey = renderState.getClientSideKey();
        com.withpersona.sdk2.inquiry.ui.f fVar = this.uiWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        List<UiComponentConfig> components = renderState.getComponents();
        String strW = renderState.w();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        boolean finalStep = renderState.getFinalStep();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        NextStep.Ui.Localizations localizations = renderState.getLocalizations();
        String gpsPermissionsTitle = (localizations == null || (promptPage7 = localizations.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsTitle();
        NextStep.Ui.Localizations localizations2 = renderState.getLocalizations();
        String gpsPermissionsPrompt = (localizations2 == null || (promptPage6 = localizations2.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsPrompt();
        NextStep.Ui.Localizations localizations3 = renderState.getLocalizations();
        String gpsPermissionsAllowButtonText = (localizations3 == null || (promptPage5 = localizations3.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsAllowButtonText();
        NextStep.Ui.Localizations localizations4 = renderState.getLocalizations();
        String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage4 = localizations4.getPromptPage()) == null) ? null : promptPage4.getGpsPermissionsBtnCancel();
        NextStep.Ui.Localizations localizations5 = renderState.getLocalizations();
        String gpsFeatureTitle = (localizations5 == null || (promptPage3 = localizations5.getPromptPage()) == null) ? null : promptPage3.getGpsFeatureTitle();
        NextStep.Ui.Localizations localizations6 = renderState.getLocalizations();
        String gpsFeaturePrompt = (localizations6 == null || (promptPage2 = localizations6.getPromptPage()) == null) ? null : promptPage2.getGpsFeaturePrompt();
        NextStep.Ui.Localizations localizations7 = renderState.getLocalizations();
        if (localizations7 != null && (promptPage = localizations7.getPromptPage()) != null) {
            gpsFeatureTurnOnText = promptPage.getGpsFeatureTurnOnText();
        }
        return new K8.b(new com.squareup.workflow1.ui.m(context.c(fVar, new f.Input(sessionToken, inquiryId, components, strW, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, gpsPermissionsTitle, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, renderState.getStyles(), renderState.v(), renderState.getTransitionStatus() != null, renderState.getTransitionError()), clientSideKey, new p(renderState)), renderState.getClientSideKey()), !Intrinsics.b(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.d), renderState.getClientSideKey());
    }

    public final InquiryState.ShowLoadingSpinner D(InterfaceC0336B stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.j(), null, stepState.l(), stepState.getStyles(), true, stepState.k(), 2, null);
    }

    private final void E(b renderProps, InquiryState renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) {
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        TransitionStatus transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof TransitionStatus.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            ka.w.l(context, this.transitionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig(), ((TransitionStatus.Transitioning) transitionStatus).getTransitionData()), kotlin.jvm.internal.z.j(TransitionWorker.class), "", new q(renderState, sessionToken));
            return;
        }
        if (transitionStatus instanceof TransitionStatus.UpdateGpsLocation) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            ka.w.l(context, this.updateGpsLocationWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.internal.n.class), "", new r(sessionToken, transitionStatus));
            return;
        }
        if (transitionStatus instanceof TransitionStatus.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            ka.w.l(context, this.pollingWorker.a(sessionToken, inquiryId, ((TransitionStatus.CheckingForNextState) transitionStatus).getPollingMode(), renderState.getInquirySessionConfig()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.internal.i.class), "", new s(renderState, sessionToken));
            return;
        }
        if (!Intrinsics.b(transitionStatus, TransitionStatus.TransitioningBack.d) || sessionToken == null || inquiryId == null || fromStep == null) {
            return;
        }
        ka.w.l(context, this.transitionBackWorker.a(sessionToken, inquiryId, fromStep, renderState.getInquirySessionConfig()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.internal.k.class), "", new t(renderState, sessionToken));
    }

    public static final ka.r<b, InquiryState, Output> F(InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, String str, InternalErrorInfo internalErrorInfo) {
        return z.d(inquiryWorkflow, null, new u(internalErrorInfo, inquiryState, inquiryWorkflow, str), 1, null);
    }

    public final void G(ka.r<? super b, InquiryState, ? extends Output>.c cVar, String str, InternalErrorInfo internalErrorInfo, String str2) throws P9.m {
        if (str2 == null) {
            str2 = ha.n.b(internalErrorInfo);
        }
        cVar.d(new Output.Error(str2, ha.n.a(internalErrorInfo), internalErrorInfo, str));
    }

    static void H(InquiryWorkflow inquiryWorkflow, r.c cVar, String str, InternalErrorInfo internalErrorInfo, String str2, int i2, Object obj) throws P9.m {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        inquiryWorkflow.G(cVar, str, internalErrorInfo, str2);
    }

    private final SandboxScreen<Object> J(Object screen, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) {
        return new SandboxScreen<>(screen, new v(context), new w(), this.sandboxFlags.b(), new x(context));
    }

    private final C0606i K(Object screen, InquiryState renderState) {
        return new C0606i(screen, renderState.getDidGoBack() ? EnumC0605h.e : EnumC0605h.d);
    }

    public final boolean q(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    public static final void s(ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a aVar, InquiryWorkflow inquiryWorkflow, InquiryState inquiryState, boolean z) {
        aVar.b().d(z.d(inquiryWorkflow, null, new h(inquiryState, z), 1, null));
    }

    private final Object t(InquiryState.Complete renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) {
        context.a("complete", new i(context, this, renderState, null));
        return new c.a();
    }

    private final Object u(b renderProps, InquiryState.CreateInquiryFromTemplate renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) {
        return y(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.n(), renderState.getThemeSetId(), 256, null), context, renderState.getStyles(), backAction);
    }

    private final Object v(b renderProps, InquiryState.CreateInquirySession renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) {
        C0586a.d(this.navigationStateManager, false, false, false, 4, null);
        ka.w.l(context, this.inquirySessionWorker.a(renderState.getInquiryId()), kotlin.jvm.internal.z.j(a.class), "", new j(renderState));
        return new c.b(renderState.getStyles(), true, backAction);
    }

    private final Object w(InquiryState.DocumentStepRunning renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) throws P9.m {
        DocumentWorkflow.EnumC0502e enumC0502e;
        DocumentWorkflow documentWorkflow;
        String fromStep = renderState.getFromStep();
        DocumentWorkflow documentWorkflow2 = this.documentWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        String title = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getTitle();
        String prompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getPrompt();
        String disclaimer = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getDisclaimer();
        String btnSubmit = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getBtnSubmit();
        String title2 = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getTitle();
        String description = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getDescription();
        String fieldKeyDocument = renderState.getDocumentStep().getConfig().getFieldKeyDocument();
        String kind = renderState.getDocumentStep().getConfig().getKind();
        String documentId = renderState.getDocumentStep().getConfig().getDocumentId();
        int i2 = d.b[renderState.getDocumentStep().getConfig().getStartPage().ordinal()];
        if (i2 == 1) {
            enumC0502e = DocumentWorkflow.EnumC0502e.d;
        } else {
            if (i2 != 2) {
                throw new P9.m();
            }
            enumC0502e = DocumentWorkflow.EnumC0502e.e;
        }
        DocumentWorkflow.EnumC0502e enumC0502e2 = enumC0502e;
        int documentFileLimit = renderState.getDocumentStep().getConfig().getDocumentFileLimit();
        Boolean backStepEnabled = renderState.getDocumentStep().getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = renderState.getDocumentStep().getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String cameraPermissionsTitle = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        StepStyles.DocumentStepStyle styles = renderState.getStyles();
        DocumentPages pages = renderState.getPages();
        NextStep.Document.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            documentWorkflow = documentWorkflow2;
            assetConfig = new NextStep.Document.AssetConfig(null, null, 3, null);
        } else {
            documentWorkflow = documentWorkflow2;
        }
        NextStep.Document.AssetConfig assetConfig2 = assetConfig;
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getDocumentStep().getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        return new K8.b(context.c(documentWorkflow, new DocumentWorkflow.Input(sessionToken, inquiryId, fromStep2, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, enumC0502e2, pages, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, styles, assetConfig2, pendingPageTextVerticalPosition), fromStep, new k(renderState)), !Intrinsics.b(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.d), renderState.getFromStep());
    }

    private final Object x(b renderProps, InquiryState.GovernmentIdStepRunning renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) throws P9.m {
        String fromStep = renderState.getFromStep();
        com.withpersona.sdk2.inquiry.governmentid.o oVar = this.governmentIdWorkflow;
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> listX = renderState.x();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listX.iterator();
        while (it.hasNext()) {
            IdConfig idConfigO = com.withpersona.sdk2.inquiry.governmentid.d.o((Id) it.next(), renderState.getCountryCode(), renderState.getManualCaptureButtonDelayMs());
            if (idConfigO != null) {
                arrayList.add(idConfigO);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> listW = renderState.w();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        List<NextStep.GovernmentId.LocalizationOverride> listD = renderState.D();
        o.C0520a.C0112a c0112aI = J8.a.i(localizations, listD != null ? CollectionsKt.k0(listD) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> listV = renderState.v();
        List<NextStep.GovernmentId.VideoCaptureMethod> listL = renderState.L();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(listL, 10));
        Iterator<T> it2 = listL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(EnumC0732a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig videoCaptureConfig = new com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig(0L, listV, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null);
        }
        return context.c(oVar, new o.C0520a(sessionToken, countryCode, arrayList, inquiryId, fromStep2, fromComponent, backStepEnabled, cancelButtonEnabled, listW, styles, c0112aI, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig, !Intrinsics.b(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.d), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig()), fromStep, new l(renderState));
    }

    private final Object y(b renderProps, InquiryAttributes attributes, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, StepStyle styles, Function0<Unit> backAction) {
        C0586a.d(this.navigationStateManager, false, false, false, 4, null);
        ka.w.l(context, this.createInquiryWorker.a(attributes), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.internal.b.class), "", new m(attributes));
        return new c.b(styles, true, backAction);
    }

    private final Object z(b renderProps, InquiryState.ResumeFallbackInquiry renderState, ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context, Function0<Unit> backAction) {
        return y(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, 2019, null), context, renderState.getStyles(), backAction);
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull InquiryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return com.squareup.workflow1.ui.q.a(state);
    }

    @Override
    public void close() {
        this.selfieWorkflow.close();
        this.governmentIdWorkflow.close();
    }

    @Override
    @NotNull
    public InquiryState d(@NotNull b props, Snapshot snapshot) throws P9.m {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            okio.h hVarB = snapshot.b();
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB == null) {
                parcelable = null;
            } else {
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
            InquiryState inquiryState = (InquiryState) parcelable;
            if (inquiryState != null) {
                return inquiryState;
            }
        }
        if (props instanceof b.TemplateProps) {
            b.TemplateProps templateProps = (b.TemplateProps) props;
            return new InquiryState.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.d(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate());
        }
        if (!(props instanceof b.InquiryProps)) {
            throw new P9.m();
        }
        b.InquiryProps inquiryProps = (b.InquiryProps) props;
        if (C0458f.e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new InquiryState.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken());
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken == null || sessionToken.length() == 0) {
            return new InquiryState.CreateInquirySession(inquiryProps.getInquiryId());
        }
        return new InquiryState.ShowLoadingSpinner(inquiryProps.getSessionToken(), new TransitionStatus.CheckingForNextState(null, 1, null), inquiryProps.getInquiryId(), null, true, InquirySessionConfig.INSTANCE.a());
    }

    @Override
    @NotNull
    public Object f(@NotNull b renderProps, @NotNull InquiryState renderState, @NotNull ka.k<? super b, InquiryState, ? extends Output, ? extends Object>.a context) throws P9.m {
        Object objT;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        E(renderProps, renderState, context);
        this.navigationStateManager.e(Intrinsics.b(renderState.getTransitionStatus(), TransitionStatus.TransitioningBack.d));
        g gVar = new g(context, this, renderState);
        context.a("controllerRequestCollector", new e(context, renderState, null));
        if (renderProps.getIsCancelled()) {
            context.a("cancel_inquiry", new f(context, this, renderState, null));
        }
        if (renderState instanceof InquiryState.CreateInquiryFromTemplate) {
            objT = u(renderProps, (InquiryState.CreateInquiryFromTemplate) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.ResumeFallbackInquiry) {
            objT = z(renderProps, (InquiryState.ResumeFallbackInquiry) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.CreateInquirySession) {
            objT = v(renderProps, (InquiryState.CreateInquirySession) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.ShowLoadingSpinner) {
            objT = B(renderProps, (InquiryState.ShowLoadingSpinner) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.GovernmentIdStepRunning) {
            objT = x(renderProps, (InquiryState.GovernmentIdStepRunning) renderState, context);
        } else if (renderState instanceof InquiryState.SelfieStepRunning) {
            objT = A(renderProps, (InquiryState.SelfieStepRunning) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.UiStepRunning) {
            objT = C(renderProps, (InquiryState.UiStepRunning) renderState, context, gVar);
        } else if (renderState instanceof InquiryState.DocumentStepRunning) {
            objT = w((InquiryState.DocumentStepRunning) renderState, context);
        } else {
            if (!(renderState instanceof InquiryState.Complete)) {
                throw new P9.m();
            }
            objT = t((InquiryState.Complete) renderState, context);
        }
        C0606i c0606iK = K(objT, renderState);
        return this.sandboxFlags.getIsSandboxModeEnabled() ? J(c0606iK, context) : c0606iK;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\rR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "", "LF8/d;", "a", "()LF8/d;", "environment", "", "getTheme", "()Ljava/lang/Integer;", "theme", "", "isCancelled", "()Z", "b", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b {
        @NotNull
        EnumC0342d getEnvironment();

        Integer getTheme();

        boolean getIsCancelled();

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000b\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "", "inquiryId", "sessionToken", "environmentId", "LF8/d;", "environment", "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LF8/d;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getEnvironmentId", "d", "LF8/d;", "()LF8/d;", "e", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "f", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class InquiryProps implements b {

            @NotNull
            private final String inquiryId;

            private final String sessionToken;

            private final String environmentId;

            @NotNull
            private final EnumC0342d environment;

            private final Integer theme;

            private final boolean isCancelled;

            public InquiryProps(@NotNull String str, String str2, String str3, @NotNull EnumC0342d enumC0342d, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(str, "inquiryId");
                Intrinsics.checkNotNullParameter(enumC0342d, "environment");
                this.inquiryId = str;
                this.sessionToken = str2;
                this.environmentId = str3;
                this.environment = enumC0342d;
                this.theme = num;
                this.isCancelled = z;
            }

            @Override
            @NotNull
            public EnumC0342d getEnvironment() {
                return this.environment;
            }

            @NotNull
            public final String getInquiryId() {
                return this.inquiryId;
            }

            public final String getSessionToken() {
                return this.sessionToken;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InquiryProps)) {
                    return false;
                }
                InquiryProps inquiryProps = (InquiryProps) other;
                return Intrinsics.b(this.inquiryId, inquiryProps.inquiryId) && Intrinsics.b(this.sessionToken, inquiryProps.sessionToken) && Intrinsics.b(this.environmentId, inquiryProps.environmentId) && this.environment == inquiryProps.environment && Intrinsics.b(this.theme, inquiryProps.theme) && this.isCancelled == inquiryProps.isCancelled;
            }

            @Override
            public Integer getTheme() {
                return this.theme;
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.environmentId;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            @Override
            public boolean getIsCancelled() {
                return this.isCancelled;
            }

            @NotNull
            public String toString() {
                return "InquiryProps(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environmentId=" + this.environmentId + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            public InquiryProps(String str, String str2, String str3, EnumC0342d enumC0342d, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, enumC0342d, num, (i & 32) != 0 ? false : z);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010\u0017R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b)\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b&\u0010+R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b\u001e\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u0013\u00104¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "", "templateId", "templateVersion", "accountId", "referenceId", "environmentId", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "LF8/d;", "environment", "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;LF8/d;Ljava/lang/Integer;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "h", "c", "d", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "LF8/d;", "()LF8/d;", "j", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "k", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class TemplateProps implements b {

            private final String templateId;

            private final String templateVersion;

            private final String accountId;

            private final String referenceId;

            private final String environmentId;

            private final Map<String, InquiryField> fields;

            private final String themeSetId;

            private final StaticInquiryTemplate staticInquiryTemplate;

            @NotNull
            private final EnumC0342d environment;

            private final Integer theme;

            private final boolean isCancelled;

            public TemplateProps(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate, @NotNull EnumC0342d enumC0342d, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(enumC0342d, "environment");
                this.templateId = str;
                this.templateVersion = str2;
                this.accountId = str3;
                this.referenceId = str4;
                this.environmentId = str5;
                this.fields = map;
                this.themeSetId = str6;
                this.staticInquiryTemplate = staticInquiryTemplate;
                this.environment = enumC0342d;
                this.theme = num;
                this.isCancelled = z;
            }

            @Override
            @NotNull
            public EnumC0342d getEnvironment() {
                return this.environment;
            }

            public final String getAccountId() {
                return this.accountId;
            }

            public final String getEnvironmentId() {
                return this.environmentId;
            }

            public final Map<String, InquiryField> d() {
                return this.fields;
            }

            public final String getReferenceId() {
                return this.referenceId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TemplateProps)) {
                    return false;
                }
                TemplateProps templateProps = (TemplateProps) other;
                return Intrinsics.b(this.templateId, templateProps.templateId) && Intrinsics.b(this.templateVersion, templateProps.templateVersion) && Intrinsics.b(this.accountId, templateProps.accountId) && Intrinsics.b(this.referenceId, templateProps.referenceId) && Intrinsics.b(this.environmentId, templateProps.environmentId) && Intrinsics.b(this.fields, templateProps.fields) && Intrinsics.b(this.themeSetId, templateProps.themeSetId) && Intrinsics.b(this.staticInquiryTemplate, templateProps.staticInquiryTemplate) && this.environment == templateProps.environment && Intrinsics.b(this.theme, templateProps.theme) && this.isCancelled == templateProps.isCancelled;
            }

            public final StaticInquiryTemplate getStaticInquiryTemplate() {
                return this.staticInquiryTemplate;
            }

            public final String getTemplateId() {
                return this.templateId;
            }

            @Override
            public Integer getTheme() {
                return this.theme;
            }

            public final String getTemplateVersion() {
                return this.templateVersion;
            }

            public int hashCode() {
                String str = this.templateId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.templateVersion;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accountId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.referenceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.environmentId;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Map<String, InquiryField> map = this.fields;
                int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
                String str6 = this.themeSetId;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
                int iHashCode8 = (((iHashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            public final String getThemeSetId() {
                return this.themeSetId;
            }

            @Override
            public boolean getIsCancelled() {
                return this.isCancelled;
            }

            @NotNull
            public String toString() {
                return "TemplateProps(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            public TemplateProps(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, EnumC0342d enumC0342d, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, enumC0342d, num, (i & 1024) != 0 ? false : z);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Landroid/os/Parcelable;", "", "j", "()Ljava/lang/String;", "sessionToken", "Cancel", "Complete", "Error", "ReinitializeWithFallbackMode", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface Output extends Parcelable {

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField;", "fields", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "e", "c", "i", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "v", "j", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Complete implements Output {

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @NotNull
            private final String inquiryId;

            @NotNull
            private final String inquiryStatus;

            @NotNull
            private final Map<String, InquiryField> fields;

            private final String sessionToken;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override
                @NotNull
                public final Complete createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                    }
                    return new Complete(string, string2, linkedHashMap, parcel.readString());
                }

                @Override
                @NotNull
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            public Complete(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends InquiryField> map, String str3) {
                Intrinsics.checkNotNullParameter(str, "inquiryId");
                Intrinsics.checkNotNullParameter(str2, "inquiryStatus");
                Intrinsics.checkNotNullParameter(map, "fields");
                this.inquiryId = str;
                this.inquiryStatus = str2;
                this.fields = map;
                this.sessionToken = str3;
            }

            @NotNull
            public final Map<String, InquiryField> a() {
                return this.fields;
            }

            @NotNull
            public final String getInquiryId() {
                return this.inquiryId;
            }

            @NotNull
            public final String getInquiryStatus() {
                return this.inquiryStatus;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.b(this.inquiryId, complete.inquiryId) && Intrinsics.b(this.inquiryStatus, complete.inquiryStatus) && Intrinsics.b(this.fields, complete.fields) && Intrinsics.b(this.sessionToken, complete.sessionToken);
            }

            public int hashCode() {
                int iHashCode = ((((this.inquiryId.hashCode() * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override
            public String getSessionToken() {
                return this.sessionToken;
            }

            @NotNull
            public String toString() {
                return "Complete(inquiryId=" + this.inquiryId + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.inquiryId);
                parcel.writeString(this.inquiryStatus);
                Map<String, InquiryField> map = this.fields;
                parcel.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), flags);
                }
                parcel.writeString(this.sessionToken);
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Error;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "errorCode", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "sessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "e", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "c", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "i", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "a", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "v", "j", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error implements Output {

            @NotNull
            public static final Parcelable.Creator<Error> CREATOR = new a();

            private final String debugMessage;

            @NotNull
            private final ErrorCode errorCode;

            @NotNull
            private final InternalErrorInfo cause;

            private final String sessionToken;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override
                @NotNull
                public final Error createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Error(parcel.readString(), parcel.readParcelable(Error.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
                }

                @Override
                @NotNull
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            public Error(String str, @NotNull ErrorCode errorCode, @NotNull InternalErrorInfo internalErrorInfo, String str2) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.debugMessage = str;
                this.errorCode = errorCode;
                this.cause = internalErrorInfo;
                this.sessionToken = str2;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }

            @NotNull
            public final ErrorCode getErrorCode() {
                return this.errorCode;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.b(this.debugMessage, error.debugMessage) && this.errorCode == error.errorCode && Intrinsics.b(this.cause, error.cause) && Intrinsics.b(this.sessionToken, error.sessionToken);
            }

            public int hashCode() {
                String str = this.debugMessage;
                int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.cause.hashCode()) * 31;
                String str2 = this.sessionToken;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override
            public String getSessionToken() {
                return this.sessionToken;
            }

            @NotNull
            public String toString() {
                return "Error(debugMessage=" + this.debugMessage + ", errorCode=" + this.errorCode + ", cause=" + this.cause + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.debugMessage);
                parcel.writeParcelable(this.errorCode, flags);
                parcel.writeParcelable(this.cause, flags);
                parcel.writeString(this.sessionToken);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$ReinitializeWithFallbackMode;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "", "inquiryId", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "a", "e", "j", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ReinitializeWithFallbackMode implements Output {

            @NotNull
            public static final Parcelable.Creator<ReinitializeWithFallbackMode> CREATOR = new a();

            @NotNull
            private final String inquiryId;

            private final String sessionToken;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReinitializeWithFallbackMode> {
                @Override
                @NotNull
                public final ReinitializeWithFallbackMode createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReinitializeWithFallbackMode(parcel.readString(), parcel.readString());
                }

                @Override
                @NotNull
                public final ReinitializeWithFallbackMode[] newArray(int i) {
                    return new ReinitializeWithFallbackMode[i];
                }
            }

            public ReinitializeWithFallbackMode(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "inquiryId");
                this.inquiryId = str;
                this.sessionToken = str2;
            }

            @NotNull
            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReinitializeWithFallbackMode)) {
                    return false;
                }
                ReinitializeWithFallbackMode reinitializeWithFallbackMode = (ReinitializeWithFallbackMode) other;
                return Intrinsics.b(this.inquiryId, reinitializeWithFallbackMode.inquiryId) && Intrinsics.b(this.sessionToken, reinitializeWithFallbackMode.sessionToken);
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override
            public String getSessionToken() {
                return this.sessionToken;
            }

            @NotNull
            public String toString() {
                return "ReinitializeWithFallbackMode(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.inquiryId);
                parcel.writeString(this.sessionToken);
            }
        }

        String getSessionToken();

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0011R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b \u00103¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "LM8/a;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", Title.type, "message", "resumeButtonText", "cancelButtonText", "", "force", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "f", "e", "j", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "v", "getTitle", "w", "a", "y", "b", "z", "c", "A", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Cancel implements Output, M8.a {

            @NotNull
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            private final boolean force;

            private final String inquiryId;

            private final String sessionToken;

            private final StepStyle styles;

            private final String title;

            private final String message;

            private final String resumeButtonText;

            private final String cancelButtonText;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Cancel> {
                @Override
                @NotNull
                public final Cancel createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancel(parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Cancel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override
                @NotNull
                public final Cancel[] newArray(int i) {
                    return new Cancel[i];
                }
            }

            public Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z) {
                this.inquiryId = str;
                this.sessionToken = str2;
                this.styles = stepStyle;
                this.title = str3;
                this.message = str4;
                this.resumeButtonText = str5;
                this.cancelButtonText = str6;
                this.force = z;
            }

            @Override
            public String getMessage() {
                return this.message;
            }

            @Override
            public String getResumeButtonText() {
                return this.resumeButtonText;
            }

            @Override
            public String getCancelButtonText() {
                return this.cancelButtonText;
            }

            @Override
            public boolean getForce() {
                return this.force;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cancel)) {
                    return false;
                }
                Cancel cancel = (Cancel) other;
                return Intrinsics.b(this.inquiryId, cancel.inquiryId) && Intrinsics.b(this.sessionToken, cancel.sessionToken) && Intrinsics.b(this.styles, cancel.styles) && Intrinsics.b(this.title, cancel.title) && Intrinsics.b(this.message, cancel.message) && Intrinsics.b(this.resumeButtonText, cancel.resumeButtonText) && Intrinsics.b(this.cancelButtonText, cancel.cancelButtonText) && this.force == cancel.force;
            }

            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override
            public StepStyle getStyles() {
                return this.styles;
            }

            @Override
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.inquiryId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sessionToken;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                StepStyle stepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (stepStyle == null ? 0 : stepStyle.hashCode())) * 31;
                String str3 = this.title;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.message;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.resumeButtonText;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.cancelButtonText;
                return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.force);
            }

            @Override
            public String getSessionToken() {
                return this.sessionToken;
            }

            @NotNull
            public String toString() {
                return "Cancel(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", styles=" + this.styles + ", title=" + this.title + ", message=" + this.message + ", resumeButtonText=" + this.resumeButtonText + ", cancelButtonText=" + this.cancelButtonText + ", force=" + this.force + ")";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.inquiryId);
                parcel.writeString(this.sessionToken);
                parcel.writeParcelable(this.styles, flags);
                parcel.writeString(this.title);
                parcel.writeString(this.message);
                parcel.writeString(this.resumeButtonText);
                parcel.writeString(this.cancelButtonText);
                parcel.writeInt(this.force ? 1 : 0);
            }

            public Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, stepStyle, str3, str4, str5, str6, (i & 128) != 0 ? false : z);
            }
        }
    }
}
