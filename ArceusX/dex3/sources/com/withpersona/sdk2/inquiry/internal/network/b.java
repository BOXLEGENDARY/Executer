package com.withpersona.sdk2.inquiry.internal.network;

import J8.q;
import bb.InterfaceC0424a;
import bb.InterfaceC0759b;
import bb.InterfaceC0875b;
import bb.InterfaceC0895a;
import bb.u;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.workflow1.ui.A;
import com.squareup.workflow1.ui.C;
import com.squareup.workflow1.ui.D;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.internal.InquiryField;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.internal.e;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.g;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.ui.DisableableContainer;
import com.withpersona.sdk2.inquiry.network.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.steps.ui.network.NumberAdapter;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\"\u001a\u00070\u0002¢\u0006\u0002\b!H\u0007¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b&\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/b;", "", "", "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lbb/u;", "retrofit", "LJ8/q;", "d", "(Lbb/u;)LJ8/q;", "Ly9/b;", "k", "(Lbb/u;)Ly9/b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "c", "(Lbb/u;)Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "LX8/a;", "i", "(Lbb/u;)LX8/a;", "Ls8/b;", "a", "(Lbb/u;)Ls8/b;", "webRtcRetrofit", "Lz9/a;", "m", "(Lbb/u;)Lz9/a;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "b", "(Lbb/u;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lcom/withpersona/sdk2/inquiry/network/ServerEndpoint;", "j", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String serverEndpoint;

    @NotNull
    private final String webRtcServerEndpoint;

    @NotNull
    private final String fallbackModeServerEndpoint;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00070\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00100\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u00100\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/b$a;", "", "<init>", "()V", "", "Lcom/squareup/workflow1/ui/A;", "viewBindings", "Lcom/squareup/workflow1/ui/C;", "f", "(Ljava/util/Set;)Lcom/squareup/workflow1/ui/C;", "d", "()Ljava/util/Set;", "", "Lcom/withpersona/sdk2/inquiry/network/HttpHeader;", "e", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/MoshiJsonAdapter;", "a", "Lcom/withpersona/sdk2/inquiry/network/JsonAdapterBinding;", "b", "Lcom/squareup/moshi/h$e;", "c", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Object> a() {
            return L.f(new Object[]{CreateInquiryRequest.Data.INSTANCE, CreateInquirySessionResponse.GpsCollectionRequirement.INSTANCE, CreateInquirySessionResponse.GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.a, InquiryFieldMap.b, NextStep.GovernmentId.SelectPage.Companion, NextStep.GovernmentId.PassportNfcOption.Companion, NextStep.GovernmentId.CaptureFileType.Companion, NextStep.GovernmentId.VideoCaptureMethod.Companion, NextStep.Selfie.CaptureFileType.Companion, NextStep.Selfie.VideoCaptureMethod.Companion, Button.ButtonType.Companion, InputText.InputType.Companion, InputText.AutofillHint.Companion, RemoteImage.ContentType.Companion, GovernmentIdNfcScan.DataGroupTypes.Companion, UiComponentError.Companion, StyleElements.PositionType.Companion, StyleElements.DPSize.Companion, StyleElements.Size.Companion, StyleElements.FontName.Companion, StyleElements.FontWeight.Companion, StyleElements.Axis.Companion, JsonLogicBoolean.Companion, NumberAdapter.a, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.Companion});
        }

        @NotNull
        public final Set<JsonAdapterBinding<?>> b() {
            return L.d();
        }

        @NotNull
        public final Set<h.e> c() {
            return L.c(InquiryField.e.a());
        }

        @NotNull
        public final Set<A<?>> d() {
            return L.f(new A[]{g.INSTANCE, e.INSTANCE, BackStackContainer.INSTANCE, DisableableContainer.INSTANCE, ScreenWithTransitionContainer.INSTANCE});
        }

        @NotNull
        public final String e() {
            return "Persona/1.0 (Android) Inquiry/2.14.2";
        }

        @NotNull
        public final C f(@NotNull Set<A<?>> viewBindings) {
            Intrinsics.checkNotNullParameter(viewBindings, "viewBindings");
            A[] aArr = (A[]) viewBindings.toArray(new A[0]);
            return D.b((A[]) Arrays.copyOf(aArr, aArr.length));
        }

        private Companion() {
        }
    }

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "serverEndpoint");
        Intrinsics.checkNotNullParameter(str2, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(str3, "fallbackModeServerEndpoint");
        this.serverEndpoint = str;
        this.webRtcServerEndpoint = str2;
        this.fallbackModeServerEndpoint = str3;
    }

    @NotNull
    public static final Set<Object> e() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<JsonAdapterBinding<?>> f() {
        return INSTANCE.b();
    }

    @NotNull
    public static final Set<h.e> g() {
        return INSTANCE.c();
    }

    @NotNull
    public static final Set<A<?>> h() {
        return INSTANCE.d();
    }

    @NotNull
    public static final C l(@NotNull Set<A<?>> set) {
        return INSTANCE.f(set);
    }

    @NotNull
    public final InterfaceC0759b a(@NotNull u retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(InterfaceC0759b.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (InterfaceC0759b) objB;
    }

    @NotNull
    public final FallbackModeService b(@NotNull u fallbackModeRetrofit) {
        Intrinsics.checkNotNullParameter(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objB = fallbackModeRetrofit.d().c(this.fallbackModeServerEndpoint).e().b(FallbackModeService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (FallbackModeService) objB;
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.network.a c(@NotNull u retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(com.withpersona.sdk2.inquiry.governmentid.network.a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (com.withpersona.sdk2.inquiry.governmentid.network.a) objB;
    }

    @NotNull
    public final q d(@NotNull u retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(q.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (q) objB;
    }

    @NotNull
    public final InterfaceC0424a i(@NotNull u retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(InterfaceC0424a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (InterfaceC0424a) objB;
    }

    @NotNull
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    public final InterfaceC0875b k(@NotNull u retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objB = retrofit.b(InterfaceC0875b.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (InterfaceC0875b) objB;
    }

    @NotNull
    public final InterfaceC0895a m(@NotNull u webRtcRetrofit) {
        Intrinsics.checkNotNullParameter(webRtcRetrofit, "webRtcRetrofit");
        Object objB = webRtcRetrofit.d().c(this.webRtcServerEndpoint).e().b(InterfaceC0895a.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        return (InterfaceC0895a) objB;
    }
}
