package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import ha.C0327b;
import ha.C0456d;
import ha.EnumC0329d;
import java.util.ArrayList;
import java.util.List;
import ka.C0562B;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import u5.AbstractC0622i;
import u5.B;
import u5.C;
import u5.E;
import u5.F;
import u5.N;
import v8.EnumC0820A;
import v8.InterfaceC0833a;
import v8.InterfaceC0835c;
import y8.CaptureTipsViewModel;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aC\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aj\u0002`\u001c*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00140\u001fR\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030 2\b\b\u0002\u0010!\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0099\u0001\u00107\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u000201002\b\b\u0002\u00104\u001a\u0002032\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b7\u00108\u001aO\u0010:\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0012H\u0000¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010=\u001a\u00020<*\u00020$H\u0000¢\u0006\u0004\b=\u0010>\u001a+\u0010C\u001a\u000205*\u00020?2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020\u0012H\u0000¢\u0006\u0004\bC\u0010D\u001a#\u0010E\u001a\u000205*\u00020?2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u000205H\u0000¢\u0006\u0004\bE\u0010F\u001a#\u0010G\u001a\u000205*\u00020?2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u000205H\u0000¢\u0006\u0004\bG\u0010F\u001a\u001f\u0010J\u001a\u0004\u0018\u000105*\u00020?2\b\u0010I\u001a\u0004\u0018\u00010HH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001d\u0010M\u001a\u0004\u0018\u00010L*\u00020\u00032\u0006\u0010@\u001a\u00020$H\u0000¢\u0006\u0004\bM\u0010N\u001a\u0019\u0010P\u001a\b\u0012\u0004\u0012\u00020O00*\u00020\u0003H\u0000¢\u0006\u0004\bP\u0010Q\u001aG\u0010S\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010R\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "LC8/b;", "videoCaptureHelper", "", "l", "(Lf8/k$a;LC8/b;)V", "a", "(Lf8/k$a;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", "", "checkPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "LM8/i;", "s", "(Ljava/lang/Object;Landroid/content/Context;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/o$a;ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)LM8/i;", "r", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "d", "(Lf8/k$a;)Lkotlin/jvm/functions/Function1;", "Lf8/r$c;", "Lf8/r;", "addCurrentState", "b", "(Lf8/r$c;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "currentSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "n", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;LC8/b;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;)V", "useVideoCapture", "m", "(Landroid/content/Context;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "q", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;", "side", "selectedId", "isAutoClassification", "j", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Z)Ljava/lang/String;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Ljava/lang/String;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "k", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a$a;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Ljava/lang/String;", "Ly8/e;", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ly8/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "h", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;)Ljava/util/List;", "output", "p", "(Lf8/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/o$b;LC8/b;)V", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[IdConfig.b.values().length];
            try {
                iArr[IdConfig.b.v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.b.w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.b.y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.b.z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.b.A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        public static final b d = new b();

        b() {
            super(1);
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.d(o.AbstractC0521b.C0113b.a);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cameraError", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final Throwable d;

            a(Throwable th) {
                super(1);
                this.d = th;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new o.AbstractC0521b.c(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + this.d.getClass().getCanonicalName())));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new o.AbstractC0521b.c(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0119c extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0119c d = new C0119c();

            C0119c() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.c().d();
                cVar.e(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final d d = new d();

            d() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new o.AbstractC0521b.c(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class e extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final e d = new e();

            e() {
                super(1);
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.c().d();
                cVar.e(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "cameraError");
            if (!(th instanceof AbstractC0622i)) {
                this.d.b().d(C0562B.c(null, new a(th), 1, null));
                return;
            }
            AbstractC0622i abstractC0622i = (AbstractC0622i) th;
            if (abstractC0622i instanceof B) {
                return;
            }
            if (abstractC0622i instanceof C) {
                this.d.b().d(C0562B.c(null, b.d, 1, null));
                return;
            }
            if (abstractC0622i instanceof F) {
                this.d.b().d(C0562B.c(null, C0119c.d, 1, null));
            } else if (abstractC0622i instanceof N) {
                this.d.b().d(C0562B.c(null, d.d, 1, null));
            } else if (abstractC0622i instanceof E) {
                this.d.b().d(C0562B.c(null, e.d, 1, null));
            }
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        final C0327b d;

        d(C0327b c0327b) {
            super(1);
            this.d = c0327b;
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            GovernmentIdState backState = cVar.c().getBackState();
            C0327b c0327b = this.d;
            if (c0327b != null) {
                c0327b.a();
            }
            if (backState != null) {
                backState.n(true);
                cVar.e(backState);
            } else if (cVar.b().getBackStepEnabled()) {
                cVar.d(o.AbstractC0521b.a.a);
            } else {
                cVar.d(o.AbstractC0521b.C0113b.a);
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        final List<Q8.l> d;

        e(List<? extends Q8.l> list) {
            super(1);
            this.d = list;
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            GovernmentIdState governmentIdStateC = cVar.c();
            if (governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture) {
                cVar.e(GovernmentIdState.WaitForAutocapture.p((GovernmentIdState.WaitForAutocapture) governmentIdStateC, null, null, null, null, null, 0, null, null, null, null, this.d.contains(Q8.l.d), this.d.contains(Q8.l.e), null, null, 13311, null));
            } else {
                cVar.c().d();
                cVar.e(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, null, null, 127, null));
            }
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        final boolean A;
        final EnumC0732a B;
        final CameraProperties C;
        final String D;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a E;
        final GovernmentIdState d;
        final GovernmentId e;
        final int i;
        final List<IdPart> v;
        final o.C0520a w;
        final C0327b y;
        final IdConfig z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
            final C0327b e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0120a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                final C0327b d;

                C0120a(C0327b c0327b) {
                    super(1);
                    this.d = c0327b;
                }

                public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    GovernmentIdState governmentIdStateC = cVar.c();
                    GovernmentIdState.WaitForAutocapture waitForAutocapture = governmentIdStateC instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) governmentIdStateC : null;
                    if (waitForAutocapture != null) {
                        cVar.e(GovernmentIdState.WaitForAutocapture.p(waitForAutocapture, null, null, null, null, null, 0, null, this.d.d() ? EnumC0329d.e : EnumC0329d.i, null, null, false, false, null, null, 16255, null));
                    }
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            a(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
                super(0);
                this.d = aVar;
                this.e = c0327b;
            }

            public Object invoke() {
                m80invoke();
                return Unit.a;
            }

            public final void m80invoke() {
                this.d.b().d(C0562B.c(null, new C0120a(this.e), 1, null));
            }
        }

        f(GovernmentIdState governmentIdState, GovernmentId governmentId, int i, List<? extends IdPart> list, o.C0520a c0520a, C0327b c0327b, IdConfig idConfig, boolean z, EnumC0732a enumC0732a, CameraProperties cameraProperties, String str, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = governmentIdState;
            this.e = governmentId;
            this.i = i;
            this.v = list;
            this.w = c0520a;
            this.y = c0327b;
            this.z = idConfig;
            this.A = z;
            this.B = enumC0732a;
            this.C = cameraProperties;
            this.D = str;
            this.E = aVar;
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) throws P9.m {
            GovernmentIdState submit;
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            if (cVar.c().getClass() != this.d.getClass()) {
                return;
            }
            List<GovernmentId> listF0 = this.e != null ? CollectionsKt.f0(cVar.c().l(), this.e) : cVar.c().l();
            int i = this.i == this.v.size() ? this.i : this.i + 1;
            IdPart idPart = (IdPart) CollectionsKt.O(this.v, i);
            if (idPart instanceof IdPart.SideIdPart) {
                if (!this.w.l() || this.y.d()) {
                    IdPart.SideIdPart sideIdPart = (IdPart.SideIdPart) idPart;
                    submit = new GovernmentIdState.WaitForAutocapture(sideIdPart, listF0, new CaptureConfig.IdCaptureConfig(this.z), p.i(cVar.b(), sideIdPart.getSide()), this.v, i, p.b(cVar, this.A), this.y.d() ? EnumC0329d.e : EnumC0329d.i, this.w.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, null, new a(this.E, this.y), 7680, null);
                } else {
                    submit = new GovernmentIdState.ChooseCaptureMethod((IdPart.SideIdPart) idPart, listF0, this.v, i, new CaptureConfig.IdCaptureConfig(this.z), false, p.b(cVar, this.A), null, 160, null);
                }
            } else {
                if (idPart != null) {
                    throw new P9.m();
                }
                if (this.B == EnumC0732a.d && !(cVar.c() instanceof GovernmentIdState.FinalizeWebRtc) && !(cVar.c() instanceof GovernmentIdState.ReviewSelectedImage)) {
                    submit = new GovernmentIdState.FinalizeWebRtc((IdPart) CollectionsKt.W(this.v), listF0, this.v, i, p.b(cVar, this.A), this.z, this.C);
                } else if (this.B != EnumC0732a.e || (cVar.c() instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (cVar.c() instanceof GovernmentIdState.ReviewSelectedImage)) {
                    submit = new GovernmentIdState.Submit(this.z, listF0, null, this.v, i, p.b(cVar, this.A), new GovernmentIdRequestArguments(listF0, this.w.getFieldKeyDocument(), this.w.getFieldKeyIdClass()), this.D, this.C, 4, null);
                } else {
                    submit = new GovernmentIdState.FinalizeLocalVideoCapture(this.z, listF0, (IdPart) CollectionsKt.W(this.v), this.v, i, p.b(cVar, this.A), new GovernmentIdRequestArguments(listF0, this.w.getFieldKeyDocument(), this.w.getFieldKeyIdClass()), 0L, false, 384, null);
                }
            }
            cVar.e(submit);
        }

        public Object invoke(Object obj) throws P9.m {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
        final o.AbstractC0521b d;

        g(o.AbstractC0521b abstractC0521b) {
            super(1);
            this.d = abstractC0521b;
        }

        public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "$this$action");
            cVar.d(this.d);
        }

        public Object invoke(Object obj) {
            a((r.c) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<PermissionRequestWorkflow.Output, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0121a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                public static final C0121a d = new C0121a();

                C0121a() {
                    super(1);
                }

                public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    Parcelable parcelable = (GovernmentIdState) cVar.c();
                    if (parcelable instanceof InterfaceC0833a) {
                        cVar.e(((InterfaceC0833a) parcelable).a(false));
                    }
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class b {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.m.values().length];
                    try {
                        iArr[Q8.m.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.m.i.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.m.e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(PermissionRequestWorkflow.Output output, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
                super(1);
                this.d = output;
                this.e = aVar;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = b.a[this.d.getPermissionState().getResult().ordinal()];
                if (i == 1 || i == 2) {
                    this.e.b().d(C0562B.c(null, C0121a.d, 1, null));
                } else {
                    if (i != 3) {
                        return;
                    }
                    p.l(this.e, null);
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        h(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(@NotNull PermissionRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            return C0562B.c(null, new a(output, this.d), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i extends kotlin.jvm.internal.l implements Function1<PermissionRequestWorkflow.Output, ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final PermissionRequestWorkflow.Output d;
            final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0122a extends kotlin.jvm.internal.l implements Function1<ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
                public static final C0122a d = new C0122a();

                C0122a() {
                    super(1);
                }

                public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    Parcelable parcelable = (GovernmentIdState) cVar.c();
                    if (parcelable instanceof InterfaceC0835c) {
                        cVar.e(((InterfaceC0835c) parcelable).b(false));
                    }
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class b {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.m.values().length];
                    try {
                        iArr[Q8.m.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.m.i.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.m.e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(PermissionRequestWorkflow.Output output, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
                super(1);
                this.d = output;
                this.e = aVar;
            }

            public final void a(@NotNull ka.r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = b.a[this.d.getPermissionState().getResult().ordinal()];
                if (i == 1 || i == 2) {
                    this.e.b().d(C0562B.c(null, C0122a.d, 1, null));
                } else {
                    if (i != 3) {
                        return;
                    }
                    p.l(this.e, null);
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(1);
            this.d = aVar;
        }

        @NotNull
        public final ka.r<o.C0520a, GovernmentIdState, o.AbstractC0521b> invoke(@NotNull PermissionRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            return C0562B.c(null, new a(output, this.d), 1, null);
        }
    }

    public static final void a(@NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.b().d(C0562B.c(null, b.d, 1, null));
    }

    public static final GovernmentIdState b(@NotNull ka.r<?, GovernmentIdState, ?>.c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z ? cVar.c() : cVar.c().getBackState();
    }

    public static GovernmentIdState c(r.c cVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return b(cVar, z);
    }

    @NotNull
    public static final Function1<Throwable, Unit> d(@NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new c(aVar);
    }

    @NotNull
    public static final String e(@NotNull o.C0520a.C0112a c0112a, @NotNull IdConfig.b bVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c0112a, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "side");
        Intrinsics.checkNotNullParameter(str, "selectedId");
        String str2 = c0112a.m().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.m().get(bVar.getKey());
        return str3 == null ? "" : str3;
    }

    public static final CaptureTipsViewModel f(@NotNull o.C0520a c0520a, @NotNull IdConfig.b bVar) throws P9.m {
        CaptureTipsViewModel captureTipsViewModel;
        String idFrontHelpModalTitle;
        String idFrontHelpModalPrompt;
        String idFrontHelpModalHints;
        String idFrontHelpModalContinueButtonText;
        String idBackHelpModalTitle;
        String idBackHelpModalPrompt;
        String idBackHelpModalHints;
        String idBackHelpModalContinueButtonText;
        String barcodeHelpModalTitle;
        String barcodeHelpModalPrompt;
        String barcodeHelpModalHints;
        String barcodeHelpModalContinueButtonText;
        Intrinsics.checkNotNullParameter(c0520a, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "side");
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            String helpButtonText = c0520a.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = c0520a.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = c0520a.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = c0520a.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = c0520a.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            captureTipsViewModel = new CaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, bVar);
        } else if (i2 == 2) {
            String helpButtonText2 = c0520a.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = c0520a.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = c0520a.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = c0520a.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = c0520a.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
                return null;
            }
            captureTipsViewModel = new CaptureTipsViewModel(helpButtonText2, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHints, idBackHelpModalContinueButtonText, bVar);
        } else {
            if (i2 == 3) {
                return null;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return null;
                }
                throw new P9.m();
            }
            String helpButtonText3 = c0520a.getStrings().getHelpButtonText();
            if (helpButtonText3 == null || (barcodeHelpModalTitle = c0520a.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = c0520a.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = c0520a.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = c0520a.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
                return null;
            }
            captureTipsViewModel = new CaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, bVar);
        }
        return captureTipsViewModel;
    }

    @NotNull
    public static final String g(@NotNull o.C0520a.C0112a c0112a, @NotNull IdConfig.b bVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c0112a, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "side");
        Intrinsics.checkNotNullParameter(str, "selectedId");
        String str2 = c0112a.t().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.t().get(bVar.getKey());
        return str3 == null ? "" : str3;
    }

    @NotNull
    public static final List<EnabledIdClass> h(@NotNull o.C0520a c0520a) {
        Intrinsics.checkNotNullParameter(c0520a, "<this>");
        List<IdConfig> listG = c0520a.g();
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listG, 10));
        for (IdConfig idConfig : listG) {
            EnumC0820A icon = idConfig.getIcon();
            String idClassKey = c0520a.getStrings().G().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    @NotNull
    public static final Screen.b.a i(@NotNull o.C0520a c0520a, @NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(bVar, "currentSide");
        return bVar == IdConfig.b.A ? Screen.b.a.e : (Intrinsics.b(c0520a.getCountryCode(), "US") || bVar != IdConfig.b.w) ? Screen.b.a.i : Screen.b.a.e;
    }

    @NotNull
    public static final String j(@NotNull o.C0520a.C0112a c0112a, @NotNull IdConfig.b bVar, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(c0112a, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "side");
        Intrinsics.checkNotNullParameter(str, "selectedId");
        if (z && c0112a.getAutoClassificationCaptureTipText() != null) {
            return c0112a.getAutoClassificationCaptureTipText();
        }
        String str2 = c0112a.Z().get(bVar.getKey() + "-" + str);
        if (str2 != null) {
            return str2;
        }
        String str3 = c0112a.Z().get(bVar.getKey());
        return str3 == null ? "" : str3;
    }

    public static final String k(@NotNull o.C0520a.C0112a c0112a, Hint hint) throws P9.m {
        Intrinsics.checkNotNullParameter(c0112a, "<this>");
        if (Intrinsics.b(hint, HoldStillHint.d)) {
            return c0112a.getHintHoldStill();
        }
        if (Intrinsics.b(hint, LowLightHint.d)) {
            return c0112a.getHintLowLight();
        }
        if (hint == null) {
            return null;
        }
        throw new P9.m();
    }

    public static final void l(@NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.b().d(C0562B.c(null, new d(c0327b), 1, null));
    }

    public static final void m(@NotNull Context context, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull o.C0520a c0520a, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "renderContext");
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        List listO = CollectionsKt.o(new Q8.l[]{Q8.l.d});
        if (z && C0456d.f(context)) {
            listO.add(Q8.l.e);
        }
        List<Q8.l> listA = com.withpersona.sdk2.inquiry.permissions.d.a(context, listO);
        if (listA.isEmpty()) {
            return;
        }
        aVar.b().d(C0562B.c(null, new e(listA), 1, null));
    }

    public static final void n(@NotNull GovernmentIdState governmentIdState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull o.C0520a c0520a, GovernmentId governmentId, @NotNull IdConfig idConfig, @NotNull C0327b c0327b, @NotNull CameraProperties cameraProperties, boolean z, @NotNull List<? extends IdPart> list, int i2, String str) {
        Intrinsics.checkNotNullParameter(governmentIdState, "renderState");
        Intrinsics.checkNotNullParameter(aVar, "renderContext");
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(idConfig, "id");
        Intrinsics.checkNotNullParameter(c0327b, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(list, "parts");
        aVar.b().d(C0562B.c(null, new f(governmentIdState, governmentId, i2, list, c0520a, c0327b, idConfig, z, c0327b.e(c0520a), cameraProperties, str, aVar), 1, null));
    }

    public static final void p(@NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull o.AbstractC0521b abstractC0521b, @NotNull C0327b c0327b) {
        Intrinsics.checkNotNullParameter(aVar, "context");
        Intrinsics.checkNotNullParameter(abstractC0521b, "output");
        Intrinsics.checkNotNullParameter(c0327b, "videoCaptureHelper");
        if ((abstractC0521b instanceof o.AbstractC0521b.d) || (abstractC0521b instanceof o.AbstractC0521b.a) || (abstractC0521b instanceof o.AbstractC0521b.c)) {
            c0327b.a();
        }
        aVar.b().d(C0562B.c(null, new g(abstractC0521b), 1, null));
    }

    @NotNull
    public static final GovernmentId.b q(@NotNull IdConfig.b bVar) throws P9.m {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            return GovernmentId.b.d;
        }
        if (i2 == 2) {
            return GovernmentId.b.e;
        }
        if (i2 == 3) {
            return GovernmentId.b.d;
        }
        if (i2 != 4 && i2 != 5) {
            throw new P9.m();
        }
        return GovernmentId.b.e;
    }

    @NotNull
    public static final M8.i<Object, Object> r(@NotNull Object obj, @NotNull Context context, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull o.C0520a c0520a, boolean z, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "renderContext");
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Q8.l lVar = Q8.l.e;
        String microphonePermissionsTitle = c0520a.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = c0520a.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(S8.e.M);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string = context.getString(S8.e.L, C0456d.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return com.withpersona.sdk2.inquiry.permissions.d.d(obj, aVar, z, lVar, (19976 & 8) != 0 ? false : false, str, str2, string, c0520a.getStrings().getMicrophonePermissionsAllowButtonText(), c0520a.getStrings().getMicrophonePermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, c0520a.getStyles(), (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new h(aVar));
    }

    @NotNull
    public static final M8.i<Object, Object> s(@NotNull Object obj, @NotNull Context context, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, @NotNull o.C0520a c0520a, boolean z, @NotNull PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "renderContext");
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Q8.l lVar = Q8.l.d;
        String cameraPermissionsTitle = c0520a.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = c0520a.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(S8.e.m);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string = context.getString(S8.e.l, C0456d.b(context));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return com.withpersona.sdk2.inquiry.permissions.d.d(obj, aVar, z, lVar, (19976 & 8) != 0 ? false : false, str, str2, string, c0520a.getStrings().getCameraPermissionsAllowButtonText(), c0520a.getStrings().getCameraPermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, c0520a.getStyles(), (19976 & 16384) != 0 ? "" : null, new i(aVar));
    }
}
