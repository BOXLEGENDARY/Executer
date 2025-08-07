package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import bb.C0425b;
import bb.C0896b;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.c;
import com.withpersona.sdk2.inquiry.selfie.g;
import com.withpersona.sdk2.inquiry.selfie.n;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.AbstractC0559i;
import ha.C0428a;
import ha.C0456d;
import ha.C0553c;
import ha.C0586a;
import ha.C0645f;
import ha.C0648i;
import ha.CameraChoice;
import ha.CameraChoices;
import ha.EnumC0653n;
import ha.InterfaceC0455c;
import ha.InterfaceC0560j;
import java.io.File;
import java.util.List;
import ka.InterfaceC0570h;
import ka.Snapshot;
import ka.o;
import ka.r;
import ka.w;
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
import kotlin.jvm.internal.v;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import o8.InterfaceC0723a;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import u5.C0623j;

@Metadata(d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¤\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\b\u0088\u0001\u008a\u0001\u008c\u0001\u008e\u0001Bi\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&JC\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b-\u0010.JC\u00100\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020/2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b0\u00101JC\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u0002022\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105JC\u00107\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u0002062\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JC\u0010:\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u0002092\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;JC\u0010=\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020<2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b=\u0010>JC\u0010@\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020?2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b@\u0010AJC\u0010C\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020B2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020E2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bF\u0010GJC\u0010I\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020H2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bI\u0010JJC\u0010L\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020K2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bL\u0010MJC\u0010O\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020N2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bO\u0010PJC\u0010R\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020Q2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\bV\u0010UJ\u0017\u0010X\u001a\u00020W2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\bX\u0010YJ-\u0010]\u001a\u00020!2\u001c\u0010\\\u001a\u00180ZR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040[H\u0002¢\u0006\u0004\b]\u0010^JC\u0010`\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020_2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b`\u0010aJC\u0010c\u001a\u0002032\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020b2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bc\u0010dJE\u0010i\u001a\u00020K\"\f\b\u0000\u0010T*\u00020\u0003*\u00020e*\u00160ZR\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030[2\u0006\u0010f\u001a\u00028\u00002\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ3\u0010k\u001a\u00020!2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bk\u0010lJ;\u0010n\u001a\u00020!2\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010m\u001a\u00020\u0004H\u0002¢\u0006\u0004\bn\u0010oJ7\u0010r\u001a\u00020!*\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJ\u001b\u0010x\u001a\u00020w*\u00020t2\u0006\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bx\u0010yJ\u0013\u0010{\u001a\u00020z*\u00020\u0003H\u0002¢\u0006\u0004\b{\u0010|J$\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010}\u001a\u00020\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010~H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001JF\u0010\u0082\u0001\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00032\"\u0010+\u001a\u001e0*R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0085\u0001\u001a\u00020~2\u0007\u0010\u0084\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020!H\u0016¢\u0006\u0005\b\u0087\u0001\u0010#R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "La9/c;", "Landroid/content/Context;", "applicationContext", "LX8/b$a;", "submitVerificationWorker", "Lz9/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/c$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieDetectWorker", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "LY8/a;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "Lo8/a;", "cameraStatsManager", "Lh9/a;", "navigationStateManager", "Le9/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;LX8/b$a;Lz9/b$a;Lcom/withpersona/sdk2/inquiry/selfie/c$b;Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;LY8/a;Lcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lo8/a;Lh9/a;Le9/c;)V", "", "t", "()V", "", "R", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "renderState", "Lf8/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lf8/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "A", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "I", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "D", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "F", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "x", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "y", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "v", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "z", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "J", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "T", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;)Z", "r", "Lp8/a;", "S", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;)Lp8/a;", "Lf8/r$c;", "Lf8/r;", "updater", "N", "(Lf8/r$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "B", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "G", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lf8/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "s", "(Lf8/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "K", "(Lf8/k$a;)V", "output", "M", "(Lf8/k$a;Lcom/withpersona/sdk2/inquiry/selfie/p$c;)V", "", "error", "L", "(Lf8/k$a;Ljava/lang/Throwable;)V", "LV8/l;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "strings", "", "P", "(LV8/l;Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;)Ljava/lang/String;", "Le9/j;", "Q", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Le9/j;", "props", "Lf8/i;", "snapshot", "q", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "u", "(Lcom/withpersona/sdk2/inquiry/selfie/p$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lf8/k$a;)Ljava/lang/Object;", "state", "O", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lf8/i;", "close", "a", "Landroid/content/Context;", "b", "LX8/b$a;", "c", "Lz9/b$a;", "d", "Lcom/withpersona/sdk2/inquiry/selfie/c$b;", "e", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "f", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "g", "LY8/a;", "h", "Lcom/withpersona/sdk2/camera/b$a;", "i", "Ln8/f$a;", "j", "Lo8/a;", "k", "Lh9/a;", "l", "Le9/c;", "LA9/a;", "m", "LA9/a;", "webRtcManager", "n", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class p extends ka.k<Input, SelfieState, AbstractC0527c, Object> implements InterfaceC0455c {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final C0425b.a submitVerificationWorker;

    @NotNull
    private final C0896b.a webRtcWorkerFactory;

    @NotNull
    private final c.b selfieAnalyzeWorker;

    @NotNull
    private final g selfieDetectWorker;

    @NotNull
    private final PermissionRequestWorkflow permissionRequestWorkflow;

    @NotNull
    private final C0428a localVideoCaptureRenderer;

    @NotNull
    private final b.a cameraXControllerFactory;

    @NotNull
    private final C0645f.a camera2ManagerFactoryFactory;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    @NotNull
    private final C0586a navigationStateManager;

    @NotNull
    private final C0553c externalEventLogger;

    private final A9.a webRtcManager;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class A extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        A(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m539invoke();
            return Unit.a;
        }

        public final void m539invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class B extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        B(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m540invoke();
            return Unit.a;
        }

        public final void m540invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C extends kotlin.jvm.internal.l implements Function1<String, Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final SelfieState.FinalizeWebRtc i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.FinalizeWebRtc d;
            final String e;
            final p i;

            a(SelfieState.FinalizeWebRtc finalizeWebRtc, String str, p pVar) {
                super(1);
                this.d = finalizeWebRtc;
                this.e = str;
                this.i = pVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(new SelfieState.WebRtcFinished(this.d.o(), this.e, this.d.getCameraProperties(), this.d.getStartSelfieTimestamp(), q.a(cVar, false)));
                this.i.webRtcManager.c();
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.FinalizeWebRtc finalizeWebRtc) {
            super(1);
            this.d = aVar;
            this.e = pVar;
            this.i = finalizeWebRtc;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.d.b();
            p pVar = this.e;
            interfaceC0570hB.d(z.d(pVar, null, new a(this.i, str, pVar), 1, null));
        }

        public Object invoke(Object obj) {
            a((String) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class D extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final D d = new D();

        D() {
            super(0);
        }

        public final void m541invoke() {
        }

        public Object invoke() {
            m541invoke();
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class E extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        E(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m542invoke();
            return Unit.a;
        }

        public final void m542invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class F extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        F(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m543invoke();
            return Unit.a;
        }

        public final void m543invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class G extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        G(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m544invoke();
            return Unit.a;
        }

        public final void m544invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class H extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final Input d;

            a(Input input) {
                super(1);
                this.d = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(new SelfieState.WaitForCameraFeed(false, false, q.a(cVar, false), this.d.p(), this.d.getPoseConfigs(), 3, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        H(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Input input) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = input;
        }

        public Object invoke() {
            m545invoke();
            return Unit.a;
        }

        public final void m545invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class I extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.ReviewCaptures reviewCaptures = selfieStateC instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) selfieStateC : null;
                if (reviewCaptures == null) {
                    return;
                }
                cVar.e(new SelfieState.Submit(reviewCaptures.o(), reviewCaptures.getWebRtcObjectId(), reviewCaptures.getCameraProperties(), reviewCaptures.getStartSelfieTimestamp(), q.a(cVar, true)));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        I(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m546invoke();
            return Unit.a;
        }

        public final void m546invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class J extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final Input d;

            a(Input input) {
                super(1);
                this.d = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(new SelfieState.WaitForCameraFeed(false, false, q.a(cVar, false), this.d.p(), this.d.getPoseConfigs(), 3, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        J(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Input input) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = input;
        }

        public Object invoke() {
            m547invoke();
            return Unit.a;
        }

        public final void m547invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class K extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        K(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m548invoke();
            return Unit.a;
        }

        public final void m548invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class L extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        L(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m549invoke();
            return Unit.a;
        }

        public final void m549invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class M extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final Input d;

            a(Input input) {
                super(1);
                this.d = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(new SelfieState.WaitForCameraFeed(false, false, q.b(cVar, false, 1, null), this.d.p(), this.d.getPoseConfigs(), 3, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        M(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Input input) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = input;
        }

        public Object invoke() {
            m550invoke();
            return Unit.a;
        }

        public final void m550invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class N extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        N(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m551invoke();
            return Unit.a;
        }

        public final void m551invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class O extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        O(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m552invoke();
            return Unit.a;
        }

        public final void m552invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class P extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final SelfieState.ShowPoseHint i;
        final Input v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.ShowPoseHint d;
            final Input e;

            a(SelfieState.ShowPoseHint showPoseHint, Input input) {
                super(1);
                this.d = showPoseHint;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                List<Selfie.b> listA = this.d.a();
                cVar.e(new SelfieState.Capture(this.d.o(), listA, null, System.currentTimeMillis(), this.d.getAutoCaptureSupported(), this.d.getStartSelfieTimestamp(), this.d.getCameraProperties(), q.a(cVar, false), this.e.getPoseConfigs(), 4, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        P(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.ShowPoseHint showPoseHint, Input input) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = showPoseHint;
            this.v = input;
        }

        public Object invoke() {
            m553invoke();
            return Unit.a;
        }

        public final void m553invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i, this.v), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class Q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        Q(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m554invoke();
            return Unit.a;
        }

        public final void m554invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class R extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        R(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m555invoke();
            return Unit.a;
        }

        public final void m555invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class S extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        S(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m556invoke();
            return Unit.a;
        }

        public final void m556invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/g$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class T extends kotlin.jvm.internal.l implements Function1<g.a, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.StartCapture e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final g.a d;
            final SelfieState.StartCapture e;
            final Input i;

            a(g.a aVar, SelfieState.StartCapture startCapture, Input input) {
                super(1);
                this.d = aVar;
                this.e = startCapture;
                this.i = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) throws P9.m {
                SelfieState selfieStateQ;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.StartCapture startCapture = selfieStateC instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) selfieStateC : null;
                if (startCapture == null) {
                    return;
                }
                g.a aVar = this.d;
                if (Intrinsics.b(aVar, g.a.b.a)) {
                    selfieStateQ = new SelfieState.StartCaptureFaceDetected(this.e.a(), this.e.getStartCaptureTimestamp(), this.e.getCameraProperties(), this.e.getStartSelfieTimestamp(), q.a(cVar, false), this.i.getPoseConfigs());
                } else {
                    if (!(aVar instanceof g.a.Error)) {
                        throw new P9.m();
                    }
                    selfieStateQ = ((g.a.Error) this.d).getError() == V8.l.A ? startCapture.q((494 & 1) != 0 ? startCapture.centered : false, (494 & 2) != 0 ? startCapture.selfieError : null, (494 & 4) != 0 ? startCapture.posesNeeded : null, (494 & 8) != 0 ? startCapture.startCaptureTimestamp : 0L, (494 & 16) != 0 ? startCapture.autoCaptureSupported : false, (494 & 32) != 0 ? startCapture.startSelfieTimestamp : 0L, (494 & 64) != 0 ? startCapture.cameraProperties : null, (494 & 128) != 0 ? startCapture.backState : null, (494 & 256) != 0 ? startCapture.poseConfigs : null) : startCapture.q((494 & 1) != 0 ? startCapture.centered : false, (494 & 2) != 0 ? startCapture.selfieError : ((g.a.Error) this.d).getError(), (494 & 4) != 0 ? startCapture.posesNeeded : null, (494 & 8) != 0 ? startCapture.startCaptureTimestamp : 0L, (494 & 16) != 0 ? startCapture.autoCaptureSupported : false, (494 & 32) != 0 ? startCapture.startSelfieTimestamp : 0L, (494 & 64) != 0 ? startCapture.cameraProperties : null, (494 & 128) != 0 ? startCapture.backState : null, (494 & 256) != 0 ? startCapture.poseConfigs : null);
                }
                cVar.e(selfieStateQ);
            }

            public Object invoke(Object obj) throws P9.m {
                a((r.c) obj);
                return Unit.a;
            }
        }

        T(SelfieState.StartCapture startCapture, Input input) {
            super(1);
            this.e = startCapture;
            this.i = input;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull g.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "output");
            return z.d(p.this, null, new a(aVar, this.e, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class U extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final SelfieState.StartCapture i;
        final Input v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.StartCapture d;
            final Input e;

            a(SelfieState.StartCapture startCapture, Input input) {
                super(1);
                this.d = startCapture;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.StartCapture startCapture = selfieStateC instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) selfieStateC : null;
                if (startCapture == null) {
                    return;
                }
                cVar.e(new SelfieState.CountdownToManualCapture(3, null, startCapture.getCameraProperties(), startCapture.a(), System.currentTimeMillis(), startCapture.getAutoCaptureSupported(), this.d.getStartSelfieTimestamp(), q.a(cVar, false), this.e.getPoseConfigs(), 2, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        U(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.StartCapture startCapture, Input input) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = startCapture;
            this.v = input;
        }

        public Object invoke() {
            m557invoke();
            return Unit.a;
        }

        public final void m557invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i, this.v), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "absolutePath", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class V extends kotlin.jvm.internal.l implements Function1<String, Unit> {
        final Selfie.b d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;
        final SelfieState.StartCapture v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final SelfieState.StartCapture e;
            final Selfie.SelfieImage i;

            a(p pVar, SelfieState.StartCapture startCapture, Selfie.SelfieImage selfieImage) {
                super(1);
                this.d = pVar;
                this.e = startCapture;
                this.i = selfieImage;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(this.d.s(cVar, this.e, this.i));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        V(Selfie.b bVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.StartCapture startCapture) {
            super(1);
            this.d = bVar;
            this.e = aVar;
            this.i = pVar;
            this.v = startCapture;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "absolutePath");
            Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(str, Selfie.a.i, this.d, System.currentTimeMillis());
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.e.b();
            p pVar = this.i;
            interfaceC0570hB.d(z.d(pVar, null, new a(pVar, this.v, selfieImage), 1, null));
        }

        public Object invoke(Object obj) {
            a((String) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class W extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        W(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            p.this.L(this.e, th);
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class X extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        X(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m558invoke();
            return Unit.a;
        }

        public final void m558invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class Y extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        Y(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m559invoke();
            return Unit.a;
        }

        public final void m559invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class Z extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        Z(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m560invoke();
            return Unit.a;
        }

        public final void m560invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/g$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a0 extends kotlin.jvm.internal.l implements Function1<g.a, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.StartCaptureFaceDetected e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final g.a d;
            final SelfieState.StartCaptureFaceDetected e;
            final Input i;

            a(g.a aVar, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input) {
                super(1);
                this.d = aVar;
                this.e = startCaptureFaceDetected;
                this.i = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                g.a aVar = this.d;
                if (aVar instanceof g.a.Error) {
                    cVar.e(new SelfieState.StartCapture(false, ((g.a.Error) aVar).getError(), this.e.a(), this.e.getStartCaptureTimestamp(), false, this.e.getStartSelfieTimestamp(), this.e.getCameraProperties(), q.a(cVar, false), this.i.getPoseConfigs(), 17, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        a0(SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input) {
            super(1);
            this.e = startCaptureFaceDetected;
            this.i = input;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull g.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "output");
            return z.d(p.this, null, new a(aVar, this.e, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010)R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010;R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u0010)R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010;R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b@\u0010;R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\b<\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\b9\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00101\u001a\u0004\b7\u0010)R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\b5\u0010)R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bM\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bL\u0010)R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\bK\u0010)R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bG\u0010)R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b2\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b@\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bB\u0010V\u001a\u0004\b0\u0010WR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bQ\u0010X\u001a\u0004\bN\u0010YR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bT\u0010Z\u001a\u0004\bO\u0010[¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "orderedPoses", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/selfie/p$b$a;Lcom/withpersona/sdk2/inquiry/selfie/n;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "u", "b", "k", "c", "i", "d", "j", "e", "Z", "()Z", "f", "g", "h", "s", "v", "Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "w", "()Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "t", "()Lcom/withpersona/sdk2/inquiry/selfie/n;", "l", "Ljava/util/List;", "p", "()Ljava/util/List;", "m", "n", "o", "q", "r", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "y", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Input {

        @NotNull
        private final String sessionToken;

        @NotNull
        private final String inquiryId;

        @NotNull
        private final String fromComponent;

        @NotNull
        private final String fromStep;

        private final boolean backStepEnabled;

        private final boolean cancelButtonEnabled;

        @NotNull
        private final String fieldKeySelfie;

        private final boolean requireStrictSelfieCapture;

        private final boolean skipPromptPage;

        @NotNull
        private final Strings strings;

        @NotNull
        private final n selfieType;

        @NotNull
        private final List<Selfie.b> orderedPoses;

        private final String cameraPermissionsTitle;

        private final String cameraPermissionsRationale;

        private final String cameraPermissionsModalPositiveButton;

        private final String cameraPermissionsModalNegativeButton;

        private final String microphonePermissionsTitle;

        private final String microphonePermissionsRationale;

        private final String microphonePermissionsModalPositiveButton;

        private final String microphonePermissionsModalNegativeButton;

        private final StepStyles.SelfieStepStyle styles;

        @NotNull
        private final VideoCaptureConfig videoCaptureConfig;

        @NotNull
        private final NextStep.Selfie.AssetConfig assetConfig;

        @NotNull
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        @NotNull
        private final PoseConfigs poseConfigs;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b+\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b.\u0010\u001e¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$b$a;", "", "", Title.type, "prompt", "disclosure", "startButton", "capturePageTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "x", "b", "e", "c", "d", "w", "f", "v", "g", "m", "h", "o", "i", "p", "j", "t", "k", "n", "l", "u", "r", "s", "q", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Strings {

            @NotNull
            private final String title;

            @NotNull
            private final String prompt;

            @NotNull
            private final String disclosure;

            @NotNull
            private final String startButton;

            @NotNull
            private final String capturePageTitle;

            @NotNull
            private final String selfieHintTakePhoto;

            @NotNull
            private final String selfieHintCenterFace;

            @NotNull
            private final String selfieHintFaceTooClose;

            @NotNull
            private final String selfieHintFaceTooFar;

            @NotNull
            private final String selfieHintMultipleFaces;

            @NotNull
            private final String selfieHintFaceIncomplete;

            @NotNull
            private final String selfieHintPoseNotCentered;

            @NotNull
            private final String selfieHintLookLeft;

            @NotNull
            private final String selfieHintLookRight;

            @NotNull
            private final String selfieHintHoldStill;

            @NotNull
            private final String processingTitle;

            @NotNull
            private final String processingDescription;

            private final String selfieCheckPageTitle;

            private final String selfieCheckPageDescription;

            private final String selfieCheckPageLabelFront;

            private final String selfieCheckPageLabelLeft;

            private final String selfieCheckPageLabelRight;

            private final String selfieCheckPageBtnSubmit;

            private final String selfieCheckPageBtnRetake;

            public Strings(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
                Intrinsics.checkNotNullParameter(str, Title.type);
                Intrinsics.checkNotNullParameter(str2, "prompt");
                Intrinsics.checkNotNullParameter(str3, "disclosure");
                Intrinsics.checkNotNullParameter(str4, "startButton");
                Intrinsics.checkNotNullParameter(str5, "capturePageTitle");
                Intrinsics.checkNotNullParameter(str6, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(str7, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(str8, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(str9, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(str10, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(str11, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(str12, "selfieHintPoseNotCentered");
                Intrinsics.checkNotNullParameter(str13, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(str14, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(str15, "selfieHintHoldStill");
                Intrinsics.checkNotNullParameter(str16, "processingTitle");
                Intrinsics.checkNotNullParameter(str17, "processingDescription");
                this.title = str;
                this.prompt = str2;
                this.disclosure = str3;
                this.startButton = str4;
                this.capturePageTitle = str5;
                this.selfieHintTakePhoto = str6;
                this.selfieHintCenterFace = str7;
                this.selfieHintFaceTooClose = str8;
                this.selfieHintFaceTooFar = str9;
                this.selfieHintMultipleFaces = str10;
                this.selfieHintFaceIncomplete = str11;
                this.selfieHintPoseNotCentered = str12;
                this.selfieHintLookLeft = str13;
                this.selfieHintLookRight = str14;
                this.selfieHintHoldStill = str15;
                this.processingTitle = str16;
                this.processingDescription = str17;
                this.selfieCheckPageTitle = str18;
                this.selfieCheckPageDescription = str19;
                this.selfieCheckPageLabelFront = str20;
                this.selfieCheckPageLabelLeft = str21;
                this.selfieCheckPageLabelRight = str22;
                this.selfieCheckPageBtnSubmit = str23;
                this.selfieCheckPageBtnRetake = str24;
            }

            @NotNull
            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            @NotNull
            public final String getDisclosure() {
                return this.disclosure;
            }

            @NotNull
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.b(this.title, strings.title) && Intrinsics.b(this.prompt, strings.prompt) && Intrinsics.b(this.disclosure, strings.disclosure) && Intrinsics.b(this.startButton, strings.startButton) && Intrinsics.b(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.b(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.b(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.b(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.b(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.b(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.b(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.b(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.b(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.b(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.b(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.b(this.processingTitle, strings.processingTitle) && Intrinsics.b(this.processingDescription, strings.processingDescription) && Intrinsics.b(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.b(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.b(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.b(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.b(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.b(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.b(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake);
            }

            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31) + this.selfieHintHoldStill.hashCode()) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str = this.selfieCheckPageTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.selfieCheckPageDescription;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.selfieCheckPageLabelFront;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.selfieCheckPageLabelLeft;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.selfieCheckPageLabelRight;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieCheckPageBtnSubmit;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.selfieCheckPageBtnRetake;
                return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
            }

            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }

            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }

            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            @NotNull
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @NotNull
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @NotNull
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @NotNull
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @NotNull
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ")";
            }

            @NotNull
            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }

            @NotNull
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            @NotNull
            public final String getStartButton() {
                return this.startButton;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }
        }

        public Input(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3, boolean z4, @NotNull Strings strings, @NotNull n nVar, @NotNull List<? extends Selfie.b> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, StepStyles.SelfieStepStyle selfieStepStyle, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.Selfie.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextPosition, @NotNull PoseConfigs poseConfigs) {
            Intrinsics.checkNotNullParameter(str, "sessionToken");
            Intrinsics.checkNotNullParameter(str2, "inquiryId");
            Intrinsics.checkNotNullParameter(str3, "fromComponent");
            Intrinsics.checkNotNullParameter(str4, "fromStep");
            Intrinsics.checkNotNullParameter(str5, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(nVar, "selfieType");
            Intrinsics.checkNotNullParameter(list, "orderedPoses");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            this.sessionToken = str;
            this.inquiryId = str2;
            this.fromComponent = str3;
            this.fromStep = str4;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = str5;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.strings = strings;
            this.selfieType = nVar;
            this.orderedPoses = list;
            this.cameraPermissionsTitle = str6;
            this.cameraPermissionsRationale = str7;
            this.cameraPermissionsModalPositiveButton = str8;
            this.cameraPermissionsModalNegativeButton = str9;
            this.microphonePermissionsTitle = str10;
            this.microphonePermissionsRationale = str11;
            this.microphonePermissionsModalPositiveButton = str12;
            this.microphonePermissionsModalNegativeButton = str13;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.poseConfigs = poseConfigs;
        }

        @NotNull
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.b(this.sessionToken, input.sessionToken) && Intrinsics.b(this.inquiryId, input.inquiryId) && Intrinsics.b(this.fromComponent, input.fromComponent) && Intrinsics.b(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.b(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.b(this.strings, input.strings) && Intrinsics.b(this.selfieType, input.selfieType) && Intrinsics.b(this.orderedPoses, input.orderedPoses) && Intrinsics.b(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.b(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.b(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.b(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.b(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.b(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.b(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.b(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.b(this.styles, input.styles) && Intrinsics.b(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.b(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.b(this.poseConfigs, input.poseConfigs);
        }

        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @NotNull
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            String str = this.cameraPermissionsTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            return ((((((((iHashCode9 + (selfieStepStyle != null ? selfieStepStyle.hashCode() : 0)) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode();
        }

        @NotNull
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }

        @NotNull
        public final List<Selfie.b> p() {
            return this.orderedPoses;
        }

        @NotNull
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        public final n getSelfieType() {
            return this.selfieType;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ")";
        }

        @NotNull
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @NotNull
        public final Strings getStrings() {
            return this.strings;
        }

        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lkotlin/Unit;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b0 extends kotlin.jvm.internal.l implements Function1<Unit, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.StartCaptureFaceDetected e;
        final Input i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.StartCaptureFaceDetected d;
            final Input e;

            a(SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input) {
                super(1);
                this.d = startCaptureFaceDetected;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (cVar.c() instanceof SelfieState.StartCaptureFaceDetected) {
                    cVar.e(new SelfieState.CountdownToCapture(3, null, this.d.a(), this.d.getStartCaptureTimestamp(), this.d.getCameraProperties(), this.d.getStartSelfieTimestamp(), q.a(cVar, false), this.e.getPoseConfigs(), 2, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b0(SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input) {
            super(1);
            this.e = startCaptureFaceDetected;
            this.i = input;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
            return z.d(p.this, null, new a(this.e, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/selfie/p$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c$d;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0527c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0527c {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 869674411;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0527c {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1455860573;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends AbstractC0527c {

            @NotNull
            private final InternalErrorInfo cause;

            public Error(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.b(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0527c {

            @NotNull
            public static final d a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 905373494;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        public AbstractC0527c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0527c() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        c0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m561invoke();
            return Unit.a;
        }

        public final void m561invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0528d {

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001:\u0003#')B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b#\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b2\u00108R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b6\u0010;R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b<\u0010;R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b9\u0010?R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b=\u0010;R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bF\u00105R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bD\u0010G\u001a\u0004\b)\u0010HR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010I\u001a\u0004\b'\u0010J¨\u0006K"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "", Title.type, "message", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "assetOverrides", "", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lp8/a;", "videoCaptureMethod", "LA9/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lp8/a;LA9/a;ZLcom/withpersona/sdk2/camera/b$a;Ln8/f$a;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "e", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "l", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "f", "Z", "k", "()Z", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "i", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Lp8/a;", "n", "()Lp8/a;", "LA9/a;", "o", "()LA9/a;", "p", "Lcom/withpersona/sdk2/camera/b$a;", "()Lcom/withpersona/sdk2/camera/b$a;", "Ln8/f$a;", "()Ln8/f$a;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0528d {

            private final String title;

            private final String message;

            @NotNull
            private final b mode;

            private final StepStyles.SelfieStepStyle styles;

            @NotNull
            private final AssetOverrides assetOverrides;

            private final boolean requireStrictSelfieCapture;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function0<Unit> onCancel;

            @NotNull
            private final Function1<Throwable, Unit> onCameraError;

            @NotNull
            private final Function0<Unit> onPermissionChanged;

            @NotNull
            private final EnumC0732a videoCaptureMethod;

            private final A9.a webRtcManager;

            private final boolean isAudioRequired;

            @NotNull
            private final b.a cameraXControllerFactory;

            @NotNull
            private final C0645f.a camera2ManagerFactoryFactory;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$a;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "b", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class AssetOverrides {

                private final RemoteImage leftPoseImage;

                private final RemoteImage rightPoseImage;

                public AssetOverrides(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return Intrinsics.b(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.b(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0005\t\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "b", "()Z", "showProgress", "c", "d", "e", "f", "g", "h", "i", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$i;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static abstract class b {

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "b", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class C0170a extends b {

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public C0170a(@NotNull c cVar, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.overlay = cVar;
                        this.showProgress = z;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\r\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "", "countDown", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "showProgress", "<init>", "(IZJLcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "I", "c", "()I", "b", "Z", "e", "()Z", "J", "d", "()J", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class C0171b extends b {

                    private final int countDown;

                    private final boolean recordLocalVideo;

                    private final long maxRecordingLengthMs;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public C0171b(int i, boolean z, long j, @NotNull c cVar, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.countDown = i;
                        this.recordLocalVideo = z;
                        this.maxRecordingLengthMs = j;
                        this.overlay = cVar;
                        this.showProgress = z2;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    public final int getCountDown() {
                        return this.countDown;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "d", "()Lkotlin/jvm/functions/Function0;", "Z", "e", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class c extends b {

                    @NotNull
                    private final Function1<File, Unit> finalizeVideo;

                    @NotNull
                    private final Function0<Unit> onAnimationComplete;

                    private final boolean startFinalize;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public c(@NotNull Function1<? super File, Unit> function1, @NotNull Function0<Unit> function0, boolean z, @NotNull c cVar, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function1, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(function0, "onAnimationComplete");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.finalizeVideo = function1;
                        this.onAnimationComplete = function0;
                        this.startFinalize = z;
                        this.overlay = cVar;
                        this.showProgress = z2;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    @NotNull
                    public final Function1<File, Unit> c() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> d() {
                        return this.onAnimationComplete;
                    }

                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "b", "d", "c", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class C0172d extends b {

                    @NotNull
                    private final Function1<String, Unit> processImage;

                    @NotNull
                    private final Function1<Throwable, Unit> onError;

                    private final boolean forceCapture;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public C0172d(Function1 function1, Function1 function12, boolean z, c cVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function12, (i & 4) != 0 ? false : z, cVar, z2);
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> d() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> e() {
                        return this.processImage;
                    }

                    public C0172d(@NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, boolean z, @NotNull c cVar, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function1, "processImage");
                        Intrinsics.checkNotNullParameter(function12, "onError");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.processImage = function1;
                        this.onError = function12;
                        this.forceCapture = z;
                        this.overlay = cVar;
                        this.showProgress = z2;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function0;", "", "onCaptureClicked", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class e extends b {

                    @NotNull
                    private final Function0<Unit> onCaptureClicked;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public e(@NotNull Function0<Unit> function0, @NotNull c cVar, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function0, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.onCaptureClicked = function0;
                        this.overlay = cVar;
                        this.showProgress = z;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onCaptureClicked;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function0;", "", "poseHintComplete", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class f extends b {

                    @NotNull
                    private final Function0<Unit> poseHintComplete;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public f(@NotNull Function0<Unit> function0, @NotNull c cVar, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function0, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.poseHintComplete = function0;
                        this.overlay = cVar;
                        this.showProgress = z;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.poseHintComplete;
                    }
                }

                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class g extends b {

                    @NotNull
                    private final Function1<CameraProperties, Unit> previewReady;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public g(@NotNull Function1<? super CameraProperties, Unit> function1, @NotNull c cVar, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function1, "previewReady");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.previewReady = function1;
                        this.overlay = cVar;
                        this.showProgress = z;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    @NotNull
                    public final Function1<CameraProperties, Unit> c() {
                        return this.previewReady;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "d", "()Lkotlin/jvm/functions/Function0;", "b", "Z", "c", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class h extends b {

                    @NotNull
                    private final Function0<Unit> onComplete;

                    private final boolean imageCaptured;

                    @NotNull
                    private final c overlay;

                    private final boolean showProgress;

                    public h(@NotNull Function0<Unit> function0, boolean z, @NotNull c cVar, boolean z2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(function0, "onComplete");
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.onComplete = function0;
                        this.imageCaptured = z;
                        this.overlay = cVar;
                        this.showProgress = z2;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> d() {
                        return this.onComplete;
                    }
                }

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b$i;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;JZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "b", "J", "c", "()J", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
                public static final class i extends b {

                    @NotNull
                    private final c overlay;

                    private final long maxRecordingLengthMs;

                    private final boolean showProgress;

                    public i(@NotNull c cVar, long j, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(cVar, "overlay");
                        this.overlay = cVar;
                        this.maxRecordingLengthMs = j;
                        this.showProgress = z;
                    }

                    @Override
                    @NotNull
                    public c getOverlay() {
                        return this.overlay;
                    }

                    @Override
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public abstract c getOverlay();

                public abstract boolean getShowProgress();

                private b() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$a$c;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "y", "z", "A", "B", "C", "D", "E", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class c {
                private static final c[] F;
                private static final T9.a G;
                public static final c d = new c("CLEAR", 0);
                public static final c e = new c("CENTER", 1);
                public static final c i = new c("CENTER_COMPLETE", 2);
                public static final c v = new c("LOOK_LEFT_HINT", 3);
                public static final c w = new c("LOOK_LEFT", 4);
                public static final c y = new c("LOOK_LEFT_COMPLETE", 5);
                public static final c z = new c("LOOK_RIGHT_HINT", 6);
                public static final c A = new c("LOOK_RIGHT", 7);
                public static final c B = new c("LOOK_RIGHT_COMPLETE", 8);
                public static final c C = new c("FINALIZING", 9);
                public static final c D = new c("COMPLETE_WITH_CAPTURE", 10);
                public static final c E = new c("COMPLETE", 11);

                static {
                    c[] cVarArrC = c();
                    F = cVarArrC;
                    G = T9.b.a(cVarArrC);
                }

                private c(String str, int i2) {
                }

                private static final c[] c() {
                    return new c[]{d, e, i, v, w, y, z, A, B, C, D, E};
                }

                public static c valueOf(String str) {
                    return (c) Enum.valueOf(c.class, str);
                }

                public static c[] values() {
                    return (c[]) F.clone();
                }
            }

            public a(String str, String str2, @NotNull b bVar, StepStyles.SelfieStepStyle selfieStepStyle, @NotNull AssetOverrides assetOverrides, boolean z, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function03, @NotNull EnumC0732a enumC0732a, A9.a aVar, boolean z2, @NotNull b.a aVar2, @NotNull C0645f.a aVar3) {
                super(null);
                Intrinsics.checkNotNullParameter(bVar, "mode");
                Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "onBack");
                Intrinsics.checkNotNullParameter(function02, "onCancel");
                Intrinsics.checkNotNullParameter(function1, "onCameraError");
                Intrinsics.checkNotNullParameter(function03, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(enumC0732a, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(aVar2, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(aVar3, "camera2ManagerFactoryFactory");
                this.title = str;
                this.message = str2;
                this.mode = bVar;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.onCameraError = function1;
                this.onPermissionChanged = function03;
                this.videoCaptureMethod = enumC0732a;
                this.webRtcManager = aVar;
                this.isAudioRequired = z2;
                this.cameraXControllerFactory = aVar2;
                this.camera2ManagerFactoryFactory = aVar3;
            }

            @NotNull
            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            @NotNull
            public final C0645f.a getCamera2ManagerFactoryFactory() {
                return this.camera2ManagerFactoryFactory;
            }

            @NotNull
            public final b.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final b getMode() {
                return this.mode;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> g() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> h() {
                return this.onCameraError;
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onPermissionChanged;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final EnumC0732a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            public final A9.a getWebRtcManager() {
                return this.webRtcManager;
            }

            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001a\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b!\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u001b\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$b;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "", Title.type, "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onClick", "onBack", "onCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", "g", "c", "d", "h", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0528d {

            @NotNull
            private final String title;

            @NotNull
            private final String prompt;

            @NotNull
            private final String disclosure;

            @NotNull
            private final String start;

            private final StepStyles.SelfieStepStyle styles;

            private final RemoteImage instructionAsset;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> onClick;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function0<Unit> onCancel;

            public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, StepStyles.SelfieStepStyle selfieStepStyle, RemoteImage remoteImage, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
                super(null);
                Intrinsics.checkNotNullParameter(str, Title.type);
                Intrinsics.checkNotNullParameter(str2, "prompt");
                Intrinsics.checkNotNullParameter(str3, "disclosure");
                Intrinsics.checkNotNullParameter(str4, "start");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "onClick");
                Intrinsics.checkNotNullParameter(function02, "onBack");
                Intrinsics.checkNotNullParameter(function03, "onCancel");
                this.title = str;
                this.prompt = str2;
                this.disclosure = str3;
                this.start = str4;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.onClick = function0;
                this.onBack = function02;
                this.onCancel = function03;
            }

            @NotNull
            public final String getDisclosure() {
                return this.disclosure;
            }

            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> f() {
                return this.onClick;
            }

            @NotNull
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            public final String getStart() {
                return this.start;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$c;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lkotlin/Function0;", "", "rendered", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c extends AbstractC0528d {

            @NotNull
            private final Function0<Unit> rendered;

            public c(@NotNull Function0<Unit> function0) {
                super(null);
                Intrinsics.checkNotNullParameter(function0, "rendered");
                this.rendered = function0;
            }

            @NotNull
            public final Function0<Unit> a() {
                return this.rendered;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0013Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001f\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u0017\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "strings", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "g", "()Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0173d extends AbstractC0528d {

            @NotNull
            private final Strings strings;

            @NotNull
            private final List<Selfie> selfies;

            private final StepStyles.SelfieStepStyle styles;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> onUsePhotos;

            @NotNull
            private final Function0<Unit> onRetakePhotos;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function0<Unit> onCancel;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$d$a;", "", "", Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", "d", "e", "f", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class Strings {

                @NotNull
                private final String title;

                @NotNull
                private final String description;

                @NotNull
                private final String selfieLabelFront;

                @NotNull
                private final String selfieLabelLeft;

                @NotNull
                private final String selfieLabelRight;

                @NotNull
                private final String submitButton;

                @NotNull
                private final String retakeButton;

                public Strings(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
                    Intrinsics.checkNotNullParameter(str, Title.type);
                    Intrinsics.checkNotNullParameter(str2, "description");
                    Intrinsics.checkNotNullParameter(str3, "selfieLabelFront");
                    Intrinsics.checkNotNullParameter(str4, "selfieLabelLeft");
                    Intrinsics.checkNotNullParameter(str5, "selfieLabelRight");
                    Intrinsics.checkNotNullParameter(str6, "submitButton");
                    Intrinsics.checkNotNullParameter(str7, "retakeButton");
                    this.title = str;
                    this.description = str2;
                    this.selfieLabelFront = str3;
                    this.selfieLabelLeft = str4;
                    this.selfieLabelRight = str5;
                    this.submitButton = str6;
                    this.retakeButton = str7;
                }

                @NotNull
                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                public final String getRetakeButton() {
                    return this.retakeButton;
                }

                @NotNull
                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                @NotNull
                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                @NotNull
                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return Intrinsics.b(this.title, strings.title) && Intrinsics.b(this.description, strings.description) && Intrinsics.b(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.b(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.b(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.b(this.submitButton, strings.submitButton) && Intrinsics.b(this.retakeButton, strings.retakeButton);
                }

                @NotNull
                public final String getSubmitButton() {
                    return this.submitButton;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }
            }

            public C0173d(@NotNull Strings strings, @NotNull List<? extends Selfie> list, StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04) {
                super(null);
                Intrinsics.checkNotNullParameter(strings, "strings");
                Intrinsics.checkNotNullParameter(list, "selfies");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "onUsePhotos");
                Intrinsics.checkNotNullParameter(function02, "onRetakePhotos");
                Intrinsics.checkNotNullParameter(function03, "onBack");
                Intrinsics.checkNotNullParameter(function04, "onCancel");
                this.strings = strings;
                this.selfies = list;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = function0;
                this.onRetakePhotos = function02;
                this.onBack = function03;
                this.onCancel = function04;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> b() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> c() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onRetakePhotos;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onUsePhotos;
            }

            @NotNull
            public final List<Selfie> f() {
                return this.selfies;
            }

            @NotNull
            public final Strings getStrings() {
                return this.strings;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001c\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b\u0013\u0010&¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/p$d$e;", "Lcom/withpersona/sdk2/inquiry/selfie/p$d;", "", Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfie_release"}, k = 1, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class e extends AbstractC0528d {

            @NotNull
            private final String title;

            @NotNull
            private final String description;

            @NotNull
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            private final StepStyles.SelfieStepStyle styles;

            @NotNull
            private final NavigationState navigationState;

            @NotNull
            private final Function0<Unit> onBack;

            @NotNull
            private final Function0<Unit> onCancel;

            private final RemoteImage customLoadingAsset;

            public e(@NotNull String str, @NotNull String str2, @NotNull PendingPageTextPosition pendingPageTextPosition, StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, RemoteImage remoteImage) {
                super(null);
                Intrinsics.checkNotNullParameter(str, Title.type);
                Intrinsics.checkNotNullParameter(str2, "description");
                Intrinsics.checkNotNullParameter(pendingPageTextPosition, "pendingPageTextVerticalPosition");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(function0, "onBack");
                Intrinsics.checkNotNullParameter(function02, "onCancel");
                this.title = str;
                this.description = str2;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.customLoadingAsset = remoteImage;
            }

            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onCancel;
            }

            @NotNull
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }
        }

        public AbstractC0528d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0528d() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        d0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m562invoke();
            return Unit.a;
        }

        public final void m562invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0529e {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] iArr = new int[Selfie.b.values().length];
            try {
                iArr[Selfie.b.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Selfie.b.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Selfie.b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[V8.n.values().length];
            try {
                iArr2[V8.n.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[V8.n.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[V8.n.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[V8.l.values().length];
            try {
                iArr3[V8.l.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[V8.l.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[V8.l.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[V8.l.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[V8.l.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[V8.l.y.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[V8.l.z.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[V8.l.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[V8.l.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        e0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m563invoke();
            return Unit.a;
        }

        public final void m563invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", f = "SelfieWorkflow.kt", l = {134}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0530f extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        C0530f(Continuation<? super C0530f> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return p.this.new C0530f(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                C0623j c0623j = C0623j.a;
                Context context = p.this.applicationContext;
                this.d = 1;
                if (c0623j.a(context, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            A9.a aVar = p.this.webRtcManager;
            if (aVar != null) {
                aVar.c();
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LX8/b$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(LX8/b$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f0 extends kotlin.jvm.internal.l implements Function1<C0425b.AbstractC0051b, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

            a(p pVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
                super(1);
                this.d = pVar;
                this.e = aVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.M(this.e, AbstractC0527c.d.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
            final C0425b.AbstractC0051b i;

            b(p pVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, C0425b.AbstractC0051b abstractC0051b) {
                super(1);
                this.d = pVar;
                this.e = aVar;
                this.i = abstractC0051b;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.M(this.e, new AbstractC0527c.Error(((C0425b.AbstractC0051b.Error) this.i).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        f0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull C0425b.AbstractC0051b abstractC0051b) throws P9.m {
            Intrinsics.checkNotNullParameter(abstractC0051b, "it");
            if (abstractC0051b instanceof C0425b.AbstractC0051b.C0052b) {
                p pVar = p.this;
                return z.d(pVar, null, new a(pVar, this.e), 1, null);
            }
            if (!(abstractC0051b instanceof C0425b.AbstractC0051b.Error)) {
                throw new P9.m();
            }
            p pVar2 = p.this;
            return z.d(pVar2, null, new b(pVar2, this.e, abstractC0051b), 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", f = "SelfieWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0531g extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;

            a(p pVar) {
                super(1);
                this.d = pVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.N(cVar);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0531g(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Continuation<? super C0531g> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = pVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C0531g(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P9.p.b(obj);
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.e.b();
            p pVar = this.i;
            interfaceC0570hB.d(z.d(pVar, null, new a(pVar), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        g0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m564invoke();
            return Unit.a;
        }

        public final void m564invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/c$c;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0532h extends kotlin.jvm.internal.l implements Function1<c.AbstractC0156c, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.Capture e;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final c.AbstractC0156c d;
            final p e;
            final SelfieState.Capture i;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a v;

            a(c.AbstractC0156c abstractC0156c, p pVar, SelfieState.Capture capture, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
                super(1);
                this.d = abstractC0156c;
                this.e = pVar;
                this.i = capture;
                this.v = aVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                c.AbstractC0156c abstractC0156c = this.d;
                if (abstractC0156c instanceof c.AbstractC0156c.b) {
                    cVar.e(this.e.s(cVar, this.i, ((c.AbstractC0156c.b) abstractC0156c).getSelfie()));
                    return;
                }
                if (abstractC0156c instanceof c.AbstractC0156c.a) {
                    SelfieState.Capture capture = this.i;
                    cVar.e(capture.q((495 & 1) != 0 ? capture.selfies : null, (495 & 2) != 0 ? capture.posesNeeded : null, (495 & 4) != 0 ? capture.selfieError : null, (495 & 8) != 0 ? capture.startCaptureTimestamp : 0L, (495 & 16) != 0 ? capture.autoCaptureSupported : false, (495 & 32) != 0 ? capture.startSelfieTimestamp : 0L, (495 & 64) != 0 ? capture.cameraProperties : null, (495 & 128) != 0 ? capture.backState : null, (495 & 256) != 0 ? capture.poseConfigs : null));
                } else if (abstractC0156c instanceof c.AbstractC0156c.d) {
                    SelfieState.Capture capture2 = this.i;
                    cVar.e(capture2.q((495 & 1) != 0 ? capture2.selfies : null, (495 & 2) != 0 ? capture2.posesNeeded : null, (495 & 4) != 0 ? capture2.selfieError : ((c.AbstractC0156c.d) abstractC0156c).getError(), (495 & 8) != 0 ? capture2.startCaptureTimestamp : 0L, (495 & 16) != 0 ? capture2.autoCaptureSupported : false, (495 & 32) != 0 ? capture2.startSelfieTimestamp : 0L, (495 & 64) != 0 ? capture2.cameraProperties : null, (495 & 128) != 0 ? capture2.backState : null, (495 & 256) != 0 ? capture2.poseConfigs : null));
                } else if (abstractC0156c instanceof c.AbstractC0156c.C0157c) {
                    this.e.L(this.v, ((c.AbstractC0156c.C0157c) abstractC0156c).getError());
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0532h(SelfieState.Capture capture, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = capture;
            this.i = aVar;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull c.AbstractC0156c abstractC0156c) {
            Intrinsics.checkNotNullParameter(abstractC0156c, "output");
            p pVar = p.this;
            return z.d(pVar, null, new a(abstractC0156c, pVar, this.e, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        h0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m565invoke();
            return Unit.a;
        }

        public final void m565invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0533i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        C0533i(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m566invoke();
            return Unit.a;
        }

        public final void m566invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i0 extends kotlin.jvm.internal.l implements Function1<PermissionRequestWorkflow.Output, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.WaitForCameraFeed e;
        final Input i;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final SelfieState.WaitForCameraFeed e;
            final Input i;
            final p v;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a w;

            a(PermissionRequestWorkflow.Output aVar, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, p pVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar2) {
                super(1);
                this.d = aVar;
                this.e = waitForCameraFeed;
                this.i = input;
                this.v = pVar;
                this.w = aVar2;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.getPermissionState().getResult() == Q8.m.d) {
                    cVar.e(SelfieState.WaitForCameraFeed.r(this.e, true, false, null, null, null, 30, null));
                    return;
                }
                if (!this.i.getSkipPromptPage()) {
                    cVar.e(new SelfieState.ShowInstructions(null));
                } else if (this.i.getBackStepEnabled()) {
                    this.v.M(this.w, AbstractC0527c.a.a);
                } else {
                    this.v.M(this.w, new AbstractC0527c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i0(SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = waitForCameraFeed;
            this.i = input;
            this.v = aVar;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull PermissionRequestWorkflow.Output aVar) {
            Intrinsics.checkNotNullParameter(aVar, "it");
            p pVar = p.this;
            return z.d(pVar, null, new a(aVar, this.e, this.i, pVar, this.v), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0534j extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        C0534j(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m567invoke();
            return Unit.a;
        }

        public final void m567invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j0 extends kotlin.jvm.internal.l implements Function1<PermissionRequestWorkflow.Output, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.WaitForCameraFeed e;
        final Input i;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final SelfieState.WaitForCameraFeed e;
            final Input i;
            final p v;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a w;

            a(PermissionRequestWorkflow.Output aVar, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, p pVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar2) {
                super(1);
                this.d = aVar;
                this.e = waitForCameraFeed;
                this.i = input;
                this.v = pVar;
                this.w = aVar2;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.getPermissionState().getResult() == Q8.m.d) {
                    cVar.e(SelfieState.WaitForCameraFeed.r(this.e, false, true, null, null, null, 29, null));
                    return;
                }
                if (!this.i.getSkipPromptPage()) {
                    cVar.e(new SelfieState.ShowInstructions(null));
                } else if (this.i.getBackStepEnabled()) {
                    this.v.M(this.w, AbstractC0527c.a.a);
                } else {
                    this.v.M(this.w, new AbstractC0527c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j0(SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = waitForCameraFeed;
            this.i = input;
            this.v = aVar;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull PermissionRequestWorkflow.Output aVar) {
            Intrinsics.checkNotNullParameter(aVar, "it");
            p pVar = p.this;
            return z.d(pVar, null, new a(aVar, this.e, this.i, pVar, this.v), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0535k extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        C0535k(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m568invoke();
            return Unit.a;
        }

        public final void m568invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "a", "(Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k0 extends kotlin.jvm.internal.l implements Function1<CameraProperties, Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final Input i;
        final SelfieState.WaitForCameraFeed v;
        final long w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final Input e;
            final SelfieState.WaitForCameraFeed i;
            final CameraProperties v;
            final long w;

            a(p pVar, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, CameraProperties cameraProperties, long j) {
                super(1);
                this.d = pVar;
                this.e = input;
                this.i = waitForCameraFeed;
                this.v = cameraProperties;
                this.w = j;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d.S(this.e) == EnumC0732a.d) {
                    List<Selfie.b> listA = this.i.a();
                    cVar.e(new SelfieState.WaitForWebRtcSetup(this.e.getVideoCaptureConfig().getWebRtcJwt(), this.v, this.w, q.a(cVar, false), listA, this.e.getPoseConfigs()));
                    return;
                }
                cVar.e(new SelfieState.StartCapture(false, null, this.i.a(), System.currentTimeMillis(), false, this.w, this.v, q.a(cVar, false), this.e.getPoseConfigs(), 19, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, long j) {
            super(1);
            this.d = aVar;
            this.e = pVar;
            this.i = input;
            this.v = waitForCameraFeed;
            this.w = j;
        }

        public final void a(@NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.d.b();
            p pVar = this.e;
            interfaceC0570hB.d(z.d(pVar, null, new a(pVar, this.i, this.v, cameraProperties, this.w), 1, null));
        }

        public Object invoke(Object obj) {
            a((CameraProperties) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "absolutePath", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0536l extends kotlin.jvm.internal.l implements Function1<String, Unit> {
        final Selfie.b d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;
        final SelfieState.Capture v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final SelfieState.Capture e;
            final Selfie.SelfieImage i;

            a(p pVar, SelfieState.Capture capture, Selfie.SelfieImage selfieImage) {
                super(1);
                this.d = pVar;
                this.e = capture;
                this.i = selfieImage;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(this.d.s(cVar, this.e, this.i));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0536l(Selfie.b bVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.Capture capture) {
            super(1);
            this.d = bVar;
            this.e = aVar;
            this.i = pVar;
            this.v = capture;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "absolutePath");
            Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(str, Selfie.a.i, this.d, System.currentTimeMillis());
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.e.b();
            p pVar = this.i;
            interfaceC0570hB.d(z.d(pVar, null, new a(pVar, this.v, selfieImage), 1, null));
        }

        public Object invoke(Object obj) {
            a((String) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class l0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        l0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m569invoke();
            return Unit.a;
        }

        public final void m569invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0537m extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        C0537m(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            p.this.L(this.e, th);
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class m0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        m0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m570invoke();
            return Unit.a;
        }

        public final void m570invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0538n extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.CaptureTransition captureTransition = selfieStateC instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) selfieStateC : null;
                SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
                if (nextState != null) {
                    cVar.e(nextState);
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0538n(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m571invoke();
            return Unit.a;
        }

        public final void m571invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        n0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m572invoke();
            return Unit.a;
        }

        public final void m572invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0539o extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        C0539o(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m573invoke();
            return Unit.a;
        }

        public final void m573invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz9/b$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lz9/b$b;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o0 extends kotlin.jvm.internal.l implements Function1<C0896b.AbstractC0322b, r<? super Input, SelfieState, ? extends AbstractC0527c>> {
        final SelfieState.WaitForWebRtcSetup e;
        final Input i;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final CameraChoices e;
            final C0896b.AbstractC0322b i;
            final SelfieState.WaitForWebRtcSetup v;
            final Input w;
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a y;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0174a extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
                final p e;
                final SelfieState.WaitForWebRtcSetup i;
                final Input v;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0175a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
                    final SelfieState.WaitForWebRtcSetup d;
                    final Input e;

                    C0175a(SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, Input input) {
                        super(1);
                        this.d = waitForWebRtcSetup;
                        this.e = input;
                    }

                    public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        cVar.e(new SelfieState.StartCapture(false, null, this.d.a(), System.currentTimeMillis(), false, this.d.getStartSelfieTimestamp(), this.d.getCameraProperties(), q.a(cVar, false), this.e.getPoseConfigs(), 19, null));
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                C0174a(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, Input input) {
                    super(0);
                    this.d = aVar;
                    this.e = pVar;
                    this.i = waitForWebRtcSetup;
                    this.v = input;
                }

                public Object invoke() {
                    m574invoke();
                    return Unit.a;
                }

                public final void m574invoke() {
                    this.d.b().d(z.d(this.e, null, new C0175a(this.i, this.v), 1, null));
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
                final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
                final p e;

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
                static final class C0176a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
                    final p d;

                    C0176a(p pVar) {
                        super(1);
                        this.d = pVar;
                    }

                    public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                        Intrinsics.checkNotNullParameter(cVar, "$this$action");
                        this.d.webRtcManager.b();
                        cVar.e(new SelfieState.RestartCamera(false, false, q.a(cVar, false), 3, null));
                    }

                    public Object invoke(Object obj) {
                        a((r.c) obj);
                        return Unit.a;
                    }
                }

                b(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
                    super(0);
                    this.d = aVar;
                    this.e = pVar;
                }

                public Object invoke() {
                    m575invoke();
                    return Unit.a;
                }

                public final void m575invoke() {
                    InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.d.b();
                    p pVar = this.e;
                    interfaceC0570hB.d(z.d(pVar, null, new C0176a(pVar), 1, null));
                }
            }

            a(p pVar, CameraChoices cameraChoices, C0896b.AbstractC0322b abstractC0322b, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, Input input, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
                super(1);
                this.d = pVar;
                this.e = cameraChoices;
                this.i = abstractC0322b;
                this.v = waitForWebRtcSetup;
                this.w = input;
                this.y = aVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                CameraChoices cameraChoices;
                int i;
                int i2;
                CameraChoice primaryChoice;
                CameraChoice primaryChoice2;
                CameraChoice primaryChoice3;
                Size size;
                CameraChoice primaryChoice4;
                Size size2;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                A9.a aVar = this.d.webRtcManager;
                if (aVar != null) {
                    aVar.f(this.d.webRtcWorkerFactory.getService());
                }
                A9.a aVar2 = this.d.webRtcManager;
                if (aVar2 != null) {
                    aVar2.g(this.d.applicationContext);
                }
                CameraChoices cameraChoices2 = this.e;
                int height = 0;
                int width = (cameraChoices2 == null || (primaryChoice4 = cameraChoices2.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
                CameraChoices cameraChoices3 = this.e;
                if (cameraChoices3 != null && (primaryChoice3 = cameraChoices3.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
                    height = size.getHeight();
                }
                CameraChoices cameraChoices4 = this.e;
                if ((cameraChoices4 == null || (primaryChoice2 = cameraChoices4.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && ((cameraChoices = this.e) == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
                    i = width;
                    i2 = height;
                } else {
                    i2 = width;
                    i = height;
                }
                A9.a aVar3 = this.d.webRtcManager;
                if (aVar3 != null) {
                    aVar3.e(((C0896b.AbstractC0322b.C0323b) this.i).getResult().getUsername(), ((C0896b.AbstractC0322b.C0323b) this.i).getResult().getCredential(), ((C0896b.AbstractC0322b.C0323b) this.i).getResult().getServerUrl(), this.v.getWebRtcJwt(), i, i2, this.w.getVideoCaptureConfig().getRecordAudio(), new C0174a(this.y, this.d, this.v, this.w), new b(this.y, this.d));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
            final p e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
                final p d;

                a(p pVar) {
                    super(1);
                    this.d = pVar;
                }

                public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    A9.a aVar = this.d.webRtcManager;
                    if (aVar != null) {
                        aVar.b();
                    }
                    cVar.e(new SelfieState.RestartCamera(false, false, q.a(cVar, false), 3, null));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            b(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
                super(1);
                this.d = aVar;
                this.e = pVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.d.b();
                p pVar = this.e;
                interfaceC0570hB.d(z.d(pVar, null, new a(pVar), 1, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        o0(SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, Input input, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = waitForWebRtcSetup;
            this.i = input;
            this.v = aVar;
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull C0896b.AbstractC0322b abstractC0322b) throws CameraAccessException, P9.m {
            Intrinsics.checkNotNullParameter(abstractC0322b, "it");
            CameraChoices cameraChoicesA = C0648i.a(p.this.applicationContext, EnumC0653n.d);
            if (abstractC0322b instanceof C0896b.AbstractC0322b.C0323b) {
                p pVar = p.this;
                return z.d(pVar, null, new a(pVar, cameraChoicesA, abstractC0322b, this.e, this.i, this.v), 1, null);
            }
            if (!(abstractC0322b instanceof C0896b.AbstractC0322b.Error)) {
                throw new P9.m();
            }
            p pVar2 = p.this;
            return z.d(pVar2, null, new b(this.v, pVar2), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0177p extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        C0177p(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m576invoke();
            return Unit.a;
        }

        public final void m576invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class p0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        p0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m577invoke();
            return Unit.a;
        }

        public final void m577invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0540q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        C0540q(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m578invoke();
            return Unit.a;
        }

        public final void m578invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class q0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        q0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m579invoke();
            return Unit.a;
        }

        public final void m579invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "output", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/g$a;)Lf8/r;"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0541r extends kotlin.jvm.internal.l implements Function1<g.a, r<? super Input, SelfieState, ? extends AbstractC0527c>> {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final g.a d;

            a(g.a aVar) {
                super(1);
                this.d = aVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.CountdownToCapture countdownToCapture = selfieStateC instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) selfieStateC : null;
                if (countdownToCapture == null) {
                    return;
                }
                g.a aVar = this.d;
                if (aVar instanceof g.a.Error) {
                    cVar.e(countdownToCapture.q((253 & 1) != 0 ? countdownToCapture.countDown : 0, (253 & 2) != 0 ? countdownToCapture.selfieError : ((g.a.Error) aVar).getError(), (253 & 4) != 0 ? countdownToCapture.posesNeeded : null, (253 & 8) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (253 & 16) != 0 ? countdownToCapture.cameraProperties : null, (253 & 32) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (253 & 64) != 0 ? countdownToCapture.backState : null, (253 & 128) != 0 ? countdownToCapture.poseConfigs : null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0541r() {
            super(1);
        }

        @NotNull
        public final r<Input, SelfieState, AbstractC0527c> invoke(@NotNull g.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "output");
            return z.d(p.this, null, new a(aVar), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class r0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        r0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m580invoke();
            return Unit.a;
        }

        public final void m580invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", f = "SelfieWorkflow.kt", l = {808}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0542s extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;
        final SelfieState.CountdownToCapture v;
        final Input w;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.CountdownToCapture d;
            final Input e;

            a(SelfieState.CountdownToCapture countdownToCapture, Input input) {
                super(1);
                this.d = countdownToCapture;
                this.e = input;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.CountdownToCapture countdownToCapture = selfieStateC instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) selfieStateC : null;
                if (countdownToCapture == null) {
                    return;
                }
                int countDown = countdownToCapture.getCountDown();
                if (countDown > 1) {
                    cVar.e(countdownToCapture.q((253 & 1) != 0 ? countdownToCapture.countDown : countDown - 1, (253 & 2) != 0 ? countdownToCapture.selfieError : countdownToCapture.getSelfieError(), (253 & 4) != 0 ? countdownToCapture.posesNeeded : null, (253 & 8) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (253 & 16) != 0 ? countdownToCapture.cameraProperties : null, (253 & 32) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (253 & 64) != 0 ? countdownToCapture.backState : null, (253 & 128) != 0 ? countdownToCapture.poseConfigs : null));
                } else {
                    cVar.e(new SelfieState.Capture(null, countdownToCapture.a(), countdownToCapture.getSelfieError(), countdownToCapture.getStartCaptureTimestamp(), false, this.d.getStartSelfieTimestamp(), countdownToCapture.getCameraProperties(), q.a(cVar, false), this.e.getPoseConfigs(), 17, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0542s(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.CountdownToCapture countdownToCapture, Input input, Continuation<? super C0542s> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = pVar;
            this.v = countdownToCapture;
            this.w = input;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C0542s(this.e, this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                this.d = 1;
                if (ha.W.a(600L, this) == objC) {
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class s0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;
        final SelfieState.WebRtcFinished i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final SelfieState.WebRtcFinished d;

            a(SelfieState.WebRtcFinished webRtcFinished) {
                super(1);
                this.d = webRtcFinished;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(q.g(cVar, this.d.o(), this.d.getWebRtcObjectId(), this.d.getCameraProperties(), this.d.getStartSelfieTimestamp(), q.a(cVar, false)));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        s0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.WebRtcFinished webRtcFinished) {
            super(0);
            this.d = aVar;
            this.e = pVar;
            this.i = webRtcFinished;
        }

        public Object invoke() {
            m581invoke();
            return Unit.a;
        }

        public final void m581invoke() {
            this.d.b().d(z.d(this.e, null, new a(this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0543t extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        C0543t(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m582invoke();
            return Unit.a;
        }

        public final void m582invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class t0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        t0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m583invoke();
            return Unit.a;
        }

        public final void m583invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0544u extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        C0544u(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m584invoke();
            return Unit.a;
        }

        public final void m584invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class u0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        u0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(0);
            this.e = aVar;
        }

        public Object invoke() {
            m585invoke();
            return Unit.a;
        }

        public final void m585invoke() {
            p.this.M(this.e, AbstractC0527c.b.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0545v extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        C0545v(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m586invoke();
            return Unit.a;
        }

        public final void m586invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class v0 extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final Input i;

        v0(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Input input) {
            super(0);
            this.e = aVar;
            this.i = input;
        }

        public Object invoke() {
            m587invoke();
            return Unit.a;
        }

        public final void m587invoke() {
            Context context = p.this.applicationContext;
            ka.k<Input, SelfieState, AbstractC0527c, Object>.a aVar = this.e;
            Input input = this.i;
            q.e(context, aVar, input, p.this.r(input));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", f = "SelfieWorkflow.kt", l = {886}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0546w extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                int countDown;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                SelfieState.CountdownToManualCapture countdownToManualCapture = selfieStateC instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) selfieStateC : null;
                if (countdownToManualCapture != null && (countDown = countdownToManualCapture.getCountDown()) >= 1) {
                    cVar.e(countdownToManualCapture.q((508 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (508 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (508 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (508 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (508 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (508 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (508 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (508 & 128) != 0 ? countdownToManualCapture.backState : null, (508 & 256) != 0 ? countdownToManualCapture.poseConfigs : null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0546w(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Continuation<? super C0546w> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = pVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C0546w(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                this.d = 1;
                if (ha.W.a(1000L, this) == objC) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", f = "SelfieWorkflow.kt", l = {1445}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class w0 extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final v e;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a i;
        final p v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final v d;

            a(v vVar) {
                super(1);
                this.d = vVar;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                SelfieState selfieStateC = cVar.c();
                if ((selfieStateC instanceof b) && ((b) selfieStateC).g()) {
                    cVar.e(selfieStateC);
                    this.d.d = false;
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        w0(v vVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, Continuation<? super w0> continuation) {
            super(2, continuation);
            this.e = vVar;
            this.i = aVar;
            this.v = pVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new w0(this.e, this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.p.w0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "absolutePath", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0547x extends kotlin.jvm.internal.l implements Function1<String, Unit> {
        final Selfie.b d;
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;
        final p i;
        final SelfieState.CountdownToManualCapture v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
            final p d;
            final SelfieState.CountdownToManualCapture e;
            final Selfie.SelfieImage i;

            a(p pVar, SelfieState.CountdownToManualCapture countdownToManualCapture, Selfie.SelfieImage selfieImage) {
                super(1);
                this.d = pVar;
                this.e = countdownToManualCapture;
                this.i = selfieImage;
            }

            public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(this.d.s(cVar, this.e, this.i));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0547x(Selfie.b bVar, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar, SelfieState.CountdownToManualCapture countdownToManualCapture) {
            super(1);
            this.d = bVar;
            this.e = aVar;
            this.i = pVar;
            this.v = countdownToManualCapture;
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "absolutePath");
            Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(str, Selfie.a.i, this.d, System.currentTimeMillis());
            InterfaceC0570h<r<? super Input, SelfieState, ? extends AbstractC0527c>> interfaceC0570hB = this.e.b();
            p pVar = this.i;
            interfaceC0570hB.d(z.d(pVar, null, new a(pVar, this.v, selfieImage), 1, null));
        }

        public Object invoke(Object obj) {
            a((String) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/selfie/p$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/p$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class x0 extends kotlin.jvm.internal.l implements Function1<r<? super Input, SelfieState, ? extends AbstractC0527c>.c, Unit> {
        final AbstractC0527c d;

        x0(AbstractC0527c abstractC0527c) {
            super(1);
            this.d = abstractC0527c;
        }

        public final void a(@NotNull r<? super Input, SelfieState, ? extends AbstractC0527c>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.d(this.d);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0548y extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a e;

        C0548y(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar) {
            super(1);
            this.e = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            p.this.L(this.e, th);
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0549z extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Input, SelfieState, AbstractC0527c, Object>.a d;
        final p e;

        C0549z(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, p pVar) {
            super(0);
            this.d = aVar;
            this.e = pVar;
        }

        public Object invoke() {
            m588invoke();
            return Unit.a;
        }

        public final void m588invoke() {
            q.d(this.d, this.e.webRtcManager);
        }
    }

    public p(@NotNull Context context, @NotNull C0425b.a aVar, @NotNull C0896b.a aVar2, @NotNull c.b bVar, @NotNull g gVar, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull C0428a c0428a, @NotNull b.a aVar3, @NotNull C0645f.a aVar4, @NotNull InterfaceC0723a interfaceC0723a, @NotNull C0586a c0586a, @NotNull C0553c c0553c) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(aVar, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(aVar2, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(bVar, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(gVar, "selfieDetectWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(c0428a, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(aVar3, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(aVar4, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        Intrinsics.checkNotNullParameter(c0553c, "externalEventLogger");
        this.applicationContext = context;
        this.submitVerificationWorker = aVar;
        this.webRtcWorkerFactory = aVar2;
        this.selfieAnalyzeWorker = bVar;
        this.selfieDetectWorker = gVar;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = c0428a;
        this.cameraXControllerFactory = aVar3;
        this.camera2ManagerFactoryFactory = aVar4;
        this.cameraStatsManager = interfaceC0723a;
        this.navigationStateManager = c0586a;
        this.externalEventLogger = c0553c;
        this.webRtcManager = A9.b.b();
    }

    private final AbstractC0528d A(Input renderProps, SelfieState.RestartCamera renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        A9.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.c();
        }
        return new AbstractC0528d.c(new H(context, this, renderProps));
    }

    private final AbstractC0528d B(Input renderProps, SelfieState.ReviewCaptures renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(S8.e.K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String str = selfieCheckPageTitle;
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(S8.e.E);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String str2 = selfieCheckPageDescription;
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(S8.e.H);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String str3 = selfieCheckPageLabelFront;
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(S8.e.I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String str4 = selfieCheckPageLabelLeft;
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(S8.e.J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String str5 = selfieCheckPageLabelRight;
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(S8.e.G);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String str6 = selfieCheckPageBtnSubmit;
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(S8.e.F);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new AbstractC0528d.C0173d(new AbstractC0528d.C0173d.Strings(str, str2, str3, str4, str5, str6, selfieCheckPageBtnRetake), renderState.q(), renderProps.getStyles(), this.navigationStateManager.b(), new I(context, this), new J(context, this, renderProps), new K(context, this), new L(context));
    }

    private final AbstractC0528d.b C(Input renderProps, SelfieState.ShowInstructions renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        RemoteImage selfiePictograph;
        RemoteImage remoteImage;
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationStateB = this.navigationStateManager.b();
        n selfieType = renderProps.getSelfieType();
        if (Intrinsics.b(selfieType, n.a.a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
                remoteImage = selfiePictograph;
            }
            remoteImage = null;
        } else {
            if (!(Intrinsics.b(selfieType, n.c.a) ? true : Intrinsics.b(selfieType, n.b.a))) {
                throw new P9.m();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
                remoteImage = selfiePictograph;
            }
            remoteImage = null;
        }
        return new AbstractC0528d.b(title, prompt, disclosure, startButton, renderProps.getStyles(), remoteImage, navigationStateB, new M(context, this, renderProps), new N(context, this), new O(context));
    }

    private final AbstractC0528d D(Input renderProps, SelfieState.ShowPoseHint renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        V8.n nVar;
        String selfieHintLookLeft;
        AbstractC0528d.a.c cVar;
        int i = C0529e.a[((Selfie.b) CollectionsKt.M(renderState.a())).ordinal()];
        if (i == 1) {
            nVar = V8.n.e;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new P9.m();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            nVar = V8.n.i;
        }
        int[] iArr = C0529e.b;
        int i2 = iArr[nVar.ordinal()];
        if (i2 == 1) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i2 == 2) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookRight();
        } else {
            if (i2 != 3) {
                throw new P9.m();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintPoseNotCentered();
        }
        String str = selfieHintLookLeft;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        int i3 = iArr[nVar.ordinal()];
        if (i3 == 1) {
            cVar = AbstractC0528d.a.c.v;
        } else if (i3 == 2) {
            cVar = AbstractC0528d.a.c.z;
        } else {
            if (i3 != 3) {
                throw new P9.m();
            }
            cVar = AbstractC0528d.a.c.e;
        }
        return new AbstractC0528d.a(capturePageTitle, str, new AbstractC0528d.a.b.f(new P(context, this, renderState, renderProps), cVar, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Q(context, this), new R(context), q.c(context), new S(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d E(Input renderProps, SelfieState.StartCapture renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        String selfieHintTakePhoto;
        if (renderState.i().getAutoCaptureEnabled()) {
            w.l(context, this.selfieDetectWorker, kotlin.jvm.internal.z.j(g.class), "", new T(renderState, renderProps));
        }
        Selfie.b bVarH = renderState.h();
        boolean zG = renderState.g();
        if (!zG) {
            K(context);
        }
        AbstractC0528d.a.c cVar = renderState.getCentered() ? AbstractC0528d.a.c.e : AbstractC0528d.a.c.d;
        V8.l selfieError = renderState.getSelfieError();
        if (selfieError == null || (selfieHintTakePhoto = P(selfieError, renderProps.getStrings())) == null) {
            selfieHintTakePhoto = renderProps.getStrings().getSelfieHintTakePhoto();
        }
        return new AbstractC0528d.a(renderProps.getStrings().getCapturePageTitle(), selfieHintTakePhoto, zG ? r(renderProps) ? new AbstractC0528d.a.b.e(new U(context, this, renderState, renderProps), cVar, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)) : new AbstractC0528d.a.b.C0172d(new V(bVarH, context, this, renderState), new W(context), false, cVar, !Intrinsics.b(renderProps.getSelfieType(), n.b.a), 4, null) : new AbstractC0528d.a.b.C0170a(cVar, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), renderProps.getStyles(), q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new X(context, this), new Y(context), q.c(context), new Z(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d F(Input renderProps, SelfieState.StartCaptureFaceDetected renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        if (renderState.i().getAutoCaptureEnabled()) {
            w.l(context, this.selfieDetectWorker, kotlin.jvm.internal.z.j(g.class), "", new a0(renderState, renderProps));
        }
        w.l(context, o.Companion.b(ka.o.INSTANCE, 1000L, null, 2, null), kotlin.jvm.internal.z.k(ka.o.class, KTypeProjection.c.a(kotlin.jvm.internal.z.j(Unit.class))), "", new b0(renderState, renderProps));
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        return new AbstractC0528d.a(capturePageTitle, selfieHintHoldStill, new AbstractC0528d.a.b.C0170a(AbstractC0528d.a.c.e, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new c0(context, this), new d0(context), q.c(context), new e0(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d G(Input renderProps, SelfieState.Submit renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        w.l(context, this.submitVerificationWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.o(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp()), kotlin.jvm.internal.z.j(C0425b.class), "", new f0(context));
        C0586a.d(this.navigationStateManager, false, false, false, 4, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateB = this.navigationStateManager.b();
        g0 g0Var = new g0(context);
        h0 h0Var = new h0(context);
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new AbstractC0528d.e(processingTitle, processingDescription, pendingPageTextVerticalPosition, styles, navigationStateB, g0Var, h0Var, recordPage != null ? recordPage.getLoadingPictograph() : null);
    }

    private final Object H(Input renderProps, SelfieState.WaitForCameraFeed renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC0528d.a aVar = new AbstractC0528d.a(renderProps.getStrings().getCapturePageTitle(), null, new AbstractC0528d.a.b.g(new k0(context, this, renderProps, renderState, jCurrentTimeMillis), AbstractC0528d.a.c.d, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), renderProps.getStyles(), q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new l0(context, this), new m0(context), q.c(context), new n0(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
        if (!renderState.getHasRequestedCameraPermissions()) {
            Q8.l lVar = Q8.l.d;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle == null ? "" : cameraPermissionsTitle;
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(S8.e.D);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            String str2 = cameraPermissionsRationale;
            Context context2 = this.applicationContext;
            String string = context2.getString(S8.e.C, C0456d.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return com.withpersona.sdk2.inquiry.permissions.d.d(aVar, context, true, lVar, (19976 & 8) != 0 ? false : false, str, str2, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new i0(renderState, renderProps, context));
        }
        if (renderState.getHasRequestedAudioPermissions() || !r(renderProps) || !C0456d.f(this.applicationContext) || !renderProps.getVideoCaptureConfig().getRecordAudio()) {
            return aVar;
        }
        Q8.l lVar2 = Q8.l.e;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(S8.e.M);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        String str3 = microphonePermissionsRationale;
        Context context3 = this.applicationContext;
        String string2 = context3.getString(S8.e.L, C0456d.b(context3));
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        String str4 = microphonePermissionsTitle == null ? "" : microphonePermissionsTitle;
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        Intrinsics.d(string2);
        return com.withpersona.sdk2.inquiry.permissions.d.d(aVar, context, true, lVar2, (19976 & 8) != 0 ? false : false, str4, str3, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, styles, (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new j0(renderState, renderProps, context));
    }

    private final AbstractC0528d I(Input renderProps, SelfieState.WaitForWebRtcSetup renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), kotlin.jvm.internal.z.j(C0896b.class), "", new o0(renderState, renderProps, context));
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        return new AbstractC0528d.a(capturePageTitle, null, new AbstractC0528d.a.b.i(AbstractC0528d.a.c.d, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new p0(context, this), new q0(context), q.c(context), new r0(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d J(Input renderProps, SelfieState.WebRtcFinished renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        AbstractC0528d.a.b.h hVar = new AbstractC0528d.a.b.h(new s0(context, this, renderState), false, AbstractC0528d.a.c.E, !Intrinsics.b(renderProps.getSelfieType(), n.b.a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1<Throwable, Unit> function1C = q.c(context);
        A9.a aVar = this.webRtcManager;
        return new AbstractC0528d.a(capturePageTitle, null, hVar, styles, q.f(renderProps), requireStrictSelfieCapture, navigationStateB, new t0(context, this), new u0(context), function1C, new v0(context, renderProps), S(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final void K(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        v vVar = new v();
        vVar.d = true;
        context.a("check_if_manual_capture_enabled", new w0(vVar, context, this, null));
    }

    public final void L(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a aVar, Throwable th) {
        String message;
        String message2 = th.getMessage();
        if (message2 != null && StringsKt.K(message2, "ENOSPC", false, 2, (Object) null)) {
            M(aVar, new AbstractC0527c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th instanceof z.U)) {
            M(aVar, new AbstractC0527c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.K(message, "ENOSPC", false, 2, (Object) null)) {
            M(aVar, new AbstractC0527c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        M(aVar, new AbstractC0527c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th.getClass().getCanonicalName())));
    }

    public final void M(ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context, AbstractC0527c output) {
        A9.a aVar;
        if (((output instanceof AbstractC0527c.d) || (output instanceof AbstractC0527c.a) || (output instanceof AbstractC0527c.Error)) && (aVar = this.webRtcManager) != null) {
            aVar.c();
        }
        context.b().d(z.d(this, null, new x0(output), 1, null));
    }

    public final void N(r<? super Input, SelfieState, ? extends AbstractC0527c>.c updater) {
        updater.d(new AbstractC0527c.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    private final String P(V8.l lVar, Input.Strings strings) throws P9.m {
        switch (C0529e.c[lVar.ordinal()]) {
            case 1:
                return strings.getSelfieHintCenterFace();
            case 2:
                return strings.getSelfieHintFaceTooClose();
            case 3:
                return strings.getSelfieHintFaceTooFar();
            case 4:
                return strings.getSelfieHintMultipleFaces();
            case 5:
                return strings.getSelfieHintFaceIncomplete();
            case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return strings.getSelfieHintCenterFace();
            case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return strings.getSelfieHintPoseNotCentered();
            case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_loop:
                return strings.getSelfieHintCenterFace();
            case com.roblox.client.personasdk.R.styleable.LottieAnimationView_lottie_progress:
                return strings.getSelfieHintCenterFace();
            default:
                throw new P9.m();
        }
    }

    private final InterfaceC0560j Q(SelfieState selfieState) throws P9.m {
        InterfaceC0560j takePhoto;
        if (selfieState instanceof SelfieState.ShowInstructions) {
            return InterfaceC0560j.e.a;
        }
        if (selfieState instanceof SelfieState.ShowPoseHint) {
            Selfie.b bVarK = ((SelfieState.ShowPoseHint) selfieState).k();
            takePhoto = new InterfaceC0560j.LeadInAnimation(bVarK != null ? i.a(bVarK) : null);
        } else {
            if (selfieState instanceof SelfieState.RestartCamera) {
                return InterfaceC0560j.e.a;
            }
            if (!(selfieState instanceof a)) {
                if (selfieState instanceof SelfieState.CaptureTransition) {
                    return Q(((SelfieState.CaptureTransition) selfieState).getNextState());
                }
                if (selfieState instanceof SelfieState.FinalizeLocalVideoCapture ? true : selfieState instanceof SelfieState.FinalizeWebRtc ? true : selfieState instanceof SelfieState.WebRtcFinished) {
                    return InterfaceC0560j.b.a;
                }
                if (selfieState instanceof SelfieState.ReviewCaptures) {
                    return InterfaceC0560j.a.a;
                }
                if (selfieState instanceof SelfieState.Submit) {
                    return InterfaceC0560j.d.a;
                }
                throw new P9.m();
            }
            Selfie.b bVarK2 = ((a) selfieState).k();
            takePhoto = new InterfaceC0560j.TakePhoto(bVarK2 != null ? i.a(bVarK2) : null);
        }
        return takePhoto;
    }

    private final boolean R(SelfieState selfieState) throws P9.m {
        if (selfieState instanceof SelfieState.Capture ? true : selfieState instanceof SelfieState.CaptureTransition ? true : selfieState instanceof SelfieState.CountdownToCapture ? true : selfieState instanceof SelfieState.CountdownToManualCapture ? true : selfieState instanceof SelfieState.ShowPoseHint ? true : selfieState instanceof SelfieState.StartCapture ? true : selfieState instanceof SelfieState.StartCaptureFaceDetected ? true : selfieState instanceof SelfieState.WaitForCameraFeed ? true : selfieState instanceof SelfieState.WaitForWebRtcSetup ? true : selfieState instanceof SelfieState.FinalizeWebRtc ? true : selfieState instanceof SelfieState.WebRtcFinished ? true : selfieState instanceof SelfieState.FinalizeLocalVideoCapture) {
            return true;
        }
        if (selfieState instanceof SelfieState.ShowInstructions ? true : selfieState instanceof SelfieState.RestartCamera ? true : selfieState instanceof SelfieState.ReviewCaptures ? true : selfieState instanceof SelfieState.Submit) {
            return false;
        }
        throw new P9.m();
    }

    public final EnumC0732a S(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        A9.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.j()) : null;
        A9.a aVar2 = this.webRtcManager;
        Object objF = videoCaptureConfig.f(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.d()) : null, this.applicationContext);
        return P9.o.e(objF) == null ? (EnumC0732a) objF : EnumC0732a.i;
    }

    private final boolean T(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        A9.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.j()) : null;
        A9.a aVar2 = this.webRtcManager;
        Object objD = videoCaptureConfig.d(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.d()) : null, this.applicationContext);
        if (P9.o.e(objD) != null) {
            return false;
        }
        ((Boolean) objD).booleanValue();
        return true;
    }

    public final boolean r(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        A9.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.j()) : null;
        A9.a aVar2 = this.webRtcManager;
        Object objD = videoCaptureConfig.d(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.d()) : null, this.applicationContext);
        if (P9.o.e(objD) == null) {
            return ((Boolean) objD).booleanValue();
        }
        return false;
    }

    public final <T extends SelfieState & b> SelfieState.CaptureTransition s(r<? super Input, SelfieState, ?>.c cVar, T t, Selfie selfie) {
        SelfieState selfieStateG;
        T t2 = t;
        if (t2.a().size() > 1) {
            T t3 = t;
            selfieStateG = new SelfieState.ShowPoseHint(CollectionsKt.f0(t.o(), selfie), CollectionsKt.H(t3.a(), 1), t3.getAutoCaptureSupported(), t3.getCameraProperties(), t3.getStartSelfieTimestamp(), t.getBackState(), cVar.b().getPoseConfigs());
        } else if (S(cVar.b()) == EnumC0732a.e) {
            T t4 = t;
            selfieStateG = new SelfieState.FinalizeLocalVideoCapture(CollectionsKt.f0(t.o(), selfie), 3000L, false, false, t4.getCameraProperties(), t4.getStartSelfieTimestamp(), t.getBackState(), 12, null);
        } else if (S(cVar.b()) == EnumC0732a.d) {
            T t5 = t;
            selfieStateG = new SelfieState.FinalizeWebRtc(CollectionsKt.f0(t.o(), selfie), t5.getCameraProperties(), t5.getStartSelfieTimestamp(), t.getBackState());
        } else {
            T t6 = t;
            selfieStateG = q.g(cVar, CollectionsKt.f0(t.o(), selfie), null, t6.getCameraProperties(), t6.getStartSelfieTimestamp(), t.getBackState());
        }
        return new SelfieState.CaptureTransition(selfieStateG, t2.h(), t.getBackState());
    }

    private final void t() {
        A9.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.c();
        }
        this.cameraStatsManager.b();
    }

    private final AbstractC0528d v(Input renderProps, SelfieState.Capture renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        AbstractC0528d.a.c cVar;
        Selfie.b bVarH = renderState.h();
        if (renderState.i().getAutoCaptureEnabled()) {
            w.l(context, this.selfieAnalyzeWorker.a(bVarH), kotlin.jvm.internal.z.j(c.class), "", new C0532h(renderState, context));
        }
        String selfieHintLookLeft = bVarH == Selfie.b.e ? renderProps.getStrings().getSelfieHintLookLeft() : bVarH == Selfie.b.i ? renderProps.getStrings().getSelfieHintLookRight() : renderState.getSelfieError() != null ? P(renderState.getSelfieError(), renderProps.getStrings()) : bVarH == Selfie.b.d ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        int i = C0529e.a[bVarH.ordinal()];
        if (i == 1) {
            cVar = AbstractC0528d.a.c.w;
        } else if (i == 2) {
            cVar = AbstractC0528d.a.c.A;
        } else {
            if (i != 3) {
                throw new P9.m();
            }
            cVar = AbstractC0528d.a.c.e;
        }
        AbstractC0528d.a.c cVar2 = cVar;
        AbstractC0528d.a.b c0172d = renderState.g() ? new AbstractC0528d.a.b.C0172d(new C0536l(bVarH, context, this, renderState), new C0537m(context), false, cVar2, !Intrinsics.b(renderProps.getSelfieType(), n.b.a), 4, null) : new AbstractC0528d.a.b.C0170a(cVar2, !Intrinsics.b(renderProps.getSelfieType(), n.b.a));
        if (!renderState.g()) {
            K(context);
        }
        return new AbstractC0528d.a(renderProps.getStrings().getCapturePageTitle(), selfieHintLookLeft, c0172d, renderProps.getStyles(), q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new C0533i(context, this), new C0534j(context), q.c(context), new C0535k(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d w(Input renderProps, SelfieState.CaptureTransition renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        AbstractC0528d.a.c cVar;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            cVar = AbstractC0528d.a.c.D;
        } else {
            int i = C0529e.a[renderState.getCompletedPose().ordinal()];
            if (i == 1) {
                cVar = AbstractC0528d.a.c.y;
            } else if (i == 2) {
                cVar = AbstractC0528d.a.c.B;
            } else {
                if (i != 3) {
                    throw new P9.m();
                }
                cVar = AbstractC0528d.a.c.i;
            }
        }
        return new AbstractC0528d.a(capturePageTitle, null, new AbstractC0528d.a.b.h(new C0538n(context, this), true, cVar, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new C0539o(context, this), new C0177p(context), q.c(context), new C0540q(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d x(Input renderProps, SelfieState.CountdownToCapture renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        String selfieHintCenterFace;
        if (renderState.i().getAutoCaptureEnabled()) {
            w.l(context, this.selfieDetectWorker, kotlin.jvm.internal.z.j(g.class), "", new C0541r());
        }
        context.a("countdown_" + renderState.getCountDown(), new C0542s(context, this, renderState, renderProps, null));
        V8.l selfieError = renderState.getSelfieError();
        if (selfieError == null || (selfieHintCenterFace = P(selfieError, renderProps.getStrings())) == null) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintCenterFace();
        }
        return new AbstractC0528d.a(renderProps.getStrings().getCapturePageTitle(), selfieHintCenterFace, new AbstractC0528d.a.b.C0171b(renderState.getCountDown(), S(renderProps) == EnumC0732a.e, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), AbstractC0528d.a.c.e, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), renderProps.getStyles(), q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new C0543t(context, this), new C0544u(context), q.c(context), new C0545v(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d y(Input renderProps, SelfieState.CountdownToManualCapture renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        AbstractC0528d.a.c cVar;
        String selfieHintCenterFace;
        AbstractC0528d.a.b c0171b;
        Selfie.b bVar = (Selfie.b) CollectionsKt.M(renderState.a());
        int i = C0529e.a[bVar.ordinal()];
        if (i == 1) {
            cVar = AbstractC0528d.a.c.w;
        } else if (i == 2) {
            cVar = AbstractC0528d.a.c.A;
        } else {
            if (i != 3) {
                throw new P9.m();
            }
            cVar = AbstractC0528d.a.c.e;
        }
        AbstractC0528d.a.c cVar2 = cVar;
        context.a("countdown_to_manual_capture_" + renderState.getCountDown(), new C0546w(context, this, null));
        V8.l selfieError = renderState.getSelfieError();
        if (selfieError == null || (selfieHintCenterFace = P(selfieError, renderProps.getStrings())) == null) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintCenterFace();
        }
        String str = selfieHintCenterFace;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        if (renderState.getCountDown() == 0) {
            c0171b = new AbstractC0528d.a.b.C0172d(new C0547x(bVar, context, this, renderState), new C0548y(context), true, cVar2, !Intrinsics.b(renderProps.getSelfieType(), n.b.a));
        } else {
            c0171b = new AbstractC0528d.a.b.C0171b(renderState.getCountDown(), S(renderProps) == EnumC0732a.e, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), cVar2, !Intrinsics.b(renderProps.getSelfieType(), n.b.a));
        }
        return new AbstractC0528d.a(capturePageTitle, str, c0171b, styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new C0549z(context, this), new A(context), q.c(context), new B(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    private final AbstractC0528d z(Input renderProps, SelfieState.FinalizeWebRtc renderState, ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) {
        A9.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.h(new C(context, this, renderState));
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        return new AbstractC0528d.a(capturePageTitle, null, new AbstractC0528d.a.b.h(D.d, false, AbstractC0528d.a.c.C, !Intrinsics.b(renderProps.getSelfieType(), n.b.a)), styles, q.f(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new E(context, this), new F(context), q.c(context), new G(context, renderProps), S(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory);
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull SelfieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return com.squareup.workflow1.ui.q.a(state);
    }

    @Override
    public void close() {
        t();
    }

    @Override
    @NotNull
    public SelfieState d(@NotNull Input props, Snapshot snapshot) {
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
            SelfieState selfieState = (SelfieState) parcelable;
            if (selfieState != null) {
                return selfieState;
            }
        }
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.p(), props.getPoseConfigs(), 3, null) : new SelfieState.ShowInstructions(null);
    }

    @Override
    @NotNull
    public Object f(@NotNull Input renderProps, @NotNull SelfieState renderState, @NotNull ka.k<? super Input, SelfieState, ? extends AbstractC0527c, ? extends Object>.a context) throws P9.m {
        Object objG;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!R(renderState)) {
            context.a("close_camera", new C0530f(null));
        }
        if (!T(renderProps)) {
            context.a("output_webrtc_error", new C0531g(context, this, null));
        }
        boolean z = renderState instanceof SelfieState.Submit;
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z);
        this.externalEventLogger.c(new AbstractC0559i.e(renderProps.getFromStep(), Q(renderState)));
        if (renderState instanceof SelfieState.ShowInstructions) {
            objG = C(renderProps, (SelfieState.ShowInstructions) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            objG = I(renderProps, (SelfieState.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            objG = H(renderProps, (SelfieState.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            objG = A(renderProps, (SelfieState.RestartCamera) renderState, context);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            objG = D(renderProps, (SelfieState.ShowPoseHint) renderState, context);
        } else if (renderState instanceof SelfieState.StartCapture) {
            objG = E(renderProps, (SelfieState.StartCapture) renderState, context);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            objG = F(renderProps, (SelfieState.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            objG = x(renderProps, (SelfieState.CountdownToCapture) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            objG = y(renderProps, (SelfieState.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof SelfieState.Capture) {
            objG = v(renderProps, (SelfieState.Capture) renderState, context);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            objG = w(renderProps, (SelfieState.CaptureTransition) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            objG = this.localVideoCaptureRenderer.b(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            objG = z(renderProps, (SelfieState.FinalizeWebRtc) renderState, context);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            objG = J(renderProps, (SelfieState.WebRtcFinished) renderState, context);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            objG = B(renderProps, (SelfieState.ReviewCaptures) renderState, context);
        } else {
            if (!z) {
                throw new P9.m();
            }
            objG = G(renderProps, (SelfieState.Submit) renderState, context);
        }
        return objG instanceof AbstractC0528d.a ? com.withpersona.sdk2.inquiry.permissions.d.c(objG) : objG;
    }
}
