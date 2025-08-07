package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.C0645f;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import y8.CaptureTipsViewModel;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¡\u0003\u00109\u001a\u0002082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2 \b\u0002\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2 \b\u0002\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$j\u0002`'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u00172\b\b\u0002\u0010,\u001a\u00020\u00172\b\b\u0002\u0010-\u001a\u00020\u00172\u001a\b\u0002\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u00102\u001a\u00020\u001d2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "", Title.type, "message", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "LB8/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "autoCaptureRules", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "state", "", "autoCaptureRulesId", "Lcom/withpersona/sdk2/camera/b$a;", "cameraXControllerFactory", "Ln8/f$a;", "camera2ManagerFactoryFactory", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "Lp8/a;", "videoCaptureMethod", "enableAnalyzer", "showFinalizeUi", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "manualCaptureClicked", "checkPermissions", "remainingCaptureCount", "hintText", "Ly8/e;", "captureTips", "LA9/a;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;LB8/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/camera/b$a;Ln8/f$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp8/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Ly8/e;LA9/a;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "<anonymous parameter 0>", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<anonymous parameter 1>", "", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class a extends kotlin.jvm.internal.l implements Function2<List<? extends String>, CameraProperties, Unit> {
        public static final a d = new a();

        a() {
            super(2);
        }

        public final void a(@NotNull List<String> list, @NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(cameraProperties, "<anonymous parameter 1>");
        }

        public Object invoke(Object obj, Object obj2) {
            a((List) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "<anonymous parameter 0>", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<anonymous parameter 1>", "", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class b extends kotlin.jvm.internal.l implements Function2<List<? extends String>, CameraProperties, Unit> {
        public static final b d = new b();

        b() {
            super(2);
        }

        public final void a(@NotNull List<String> list, @NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(cameraProperties, "<anonymous parameter 1>");
        }

        public Object invoke(Object obj, Object obj2) {
            a((List) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class c extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        public static final c d = new c();

        c() {
            super(1);
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "<anonymous parameter 0>", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<anonymous parameter 1>", "", "a", "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class d extends kotlin.jvm.internal.l implements Function2<File, CameraProperties, Unit> {
        public static final d d = new d();

        d() {
            super(2);
        }

        public final void a(@NotNull File file, @NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(cameraProperties, "<anonymous parameter 1>");
        }

        public Object invoke(Object obj, Object obj2) {
            a((File) obj, (CameraProperties) obj2);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.l implements Function0<Unit> {
        public static final e d = new e();

        e() {
            super(0);
        }

        public final void m56invoke() {
        }

        public Object invoke() {
            m56invoke();
            return Unit.a;
        }
    }

    @NotNull
    public static final Screen.b a(@NotNull o.C0520a c0520a, @NotNull String str, @NotNull String str2, @NotNull Screen.b.a aVar, @NotNull Screen.Overlay overlay, @NotNull bb.b bVar, @NotNull IdConfig.b bVar2, @NotNull NavigationState navigationState, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, boolean z, @NotNull List<? extends AutoCaptureRule> list, @NotNull GovernmentIdState governmentIdState, int i, @NotNull b.a aVar2, @NotNull C0645f.a aVar3, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> function22, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull EnumC0732a enumC0732a, boolean z2, boolean z3, boolean z4, @NotNull Function2<? super File, ? super CameraProperties, Unit> function23, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, int i2, String str3, CaptureTipsViewModel captureTipsViewModel, A9.a aVar4) {
        Intrinsics.checkNotNullParameter(c0520a, "renderProps");
        Intrinsics.checkNotNullParameter(str, Title.type);
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(aVar, "captureButtonState");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(bVar, "idClass");
        Intrinsics.checkNotNullParameter(bVar2, "captureSide");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function2, "manuallyCapture");
        Intrinsics.checkNotNullParameter(function0, "close");
        Intrinsics.checkNotNullParameter(function02, "back");
        Intrinsics.checkNotNullParameter(list, "autoCaptureRules");
        Intrinsics.checkNotNullParameter(governmentIdState, "state");
        Intrinsics.checkNotNullParameter(aVar2, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(aVar3, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(function22, "autoCapture");
        Intrinsics.checkNotNullParameter(function1, "onCaptureError");
        Intrinsics.checkNotNullParameter(function12, "onCameraError");
        Intrinsics.checkNotNullParameter(enumC0732a, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(function23, "onLocalVideoFinalized");
        Intrinsics.checkNotNullParameter(function03, "manualCaptureClicked");
        Intrinsics.checkNotNullParameter(function04, "checkPermissions");
        return new Screen.b(str, str2, c0520a.getStrings().getCaptureDisclaimer(), aVar, overlay, bVar, bVar2, navigationState, function2, function0, function02, z, list, governmentIdState, i, c0520a.getStyles(), function22, function1, function12, i2, function03, function04, enumC0732a, z4, function23, z2, c0520a.getVideoCaptureConfig().getMaxRecordingLengthMs(), z3, str3, captureTipsViewModel, aVar4, c0520a.getAssetConfig().getCapturePage(), c0520a.getIsEnabled(), c0520a.getVideoCaptureConfig().getRecordAudio(), aVar2, aVar3);
    }
}
