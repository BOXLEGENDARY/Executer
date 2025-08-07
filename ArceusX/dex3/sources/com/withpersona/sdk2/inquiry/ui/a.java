package com.withpersona.sdk2.inquiry.ui;

import android.graphics.Bitmap;
import bb.C0874a;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.f;
import com.withpersona.sdk2.inquiry.ui.network.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0562B;
import ka.TypedWorker;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.reflect.KTypeProjection;
import n9.InterfaceC0674b;
import n9.InterfaceC0675c;
import n9.InterfaceC0682j;
import n9.c0;
import n9.j0;
import n9.k0;
import n9.l0;
import n9.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142&\u0010\u001b\u001a\"0\u0016R\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0018j\u0002`\u00172\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/a;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Ly9/a$a;", "addressDetailsWorker", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Ly9/a$a;)V", "", "isFieldBlank", "", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "componentErrors", "", "componentName", "subComponentName", "b", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "context", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "", "d", "(Lcom/withpersona/sdk2/inquiry/ui/f$b;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lf8/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "Ly9/a$a;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {

    @NotNull
    private final b.a addressAutocompleteWorker;

    @NotNull
    private final C0874a.C0318a addressDetailsWorker;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0184a extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0185a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0185a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((l0) uiComponent).a(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.length() == 0, this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        C0184a(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0185a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "response", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/network/b$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<b.AbstractC0218b, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0186a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final b.AbstractC0218b d;
            final UiState.Displaying e;
            final UiComponent i;

            C0186a(b.AbstractC0218b abstractC0218b, UiState.Displaying displaying, UiComponent uiComponent) {
                super(1);
                this.d = abstractC0218b;
                this.e = displaying;
                this.i = uiComponent;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                b.AbstractC0218b abstractC0218b = this.d;
                if (!(abstractC0218b instanceof b.AbstractC0218b.C0219b)) {
                    boolean z = abstractC0218b instanceof b.AbstractC0218b.a;
                    return;
                }
                UiState.Displaying displaying = this.e;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.i;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).d(((b.AbstractC0218b.C0219b) this.d).a()).Q(null)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull b.AbstractC0218b abstractC0218b) {
            Intrinsics.checkNotNullParameter(abstractC0218b, "response");
            return C0562B.c(null, new C0186a(abstractC0218b, this.d, this.e), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly9/a$b;", "response", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ly9/a$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<C0874a.b, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0187a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final C0874a.b i;

            C0187a(UiState.Displaying displaying, UiComponent uiComponent, C0874a.b bVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = bVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                Boolean bool = Boolean.FALSE;
                InputAddressComponent inputAddressComponentF = ((InterfaceC0674b) uiComponent).a(bool).f(((C0874a.b.C0320b) this.i).getResult().getAddressStreet1());
                String addressStreet2 = ((C0874a.b.C0320b) this.i).getResult().getAddressStreet2();
                if (addressStreet2 == null) {
                    addressStreet2 = "";
                }
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, inputAddressComponentF.k(addressStreet2).o(((C0874a.b.C0320b) this.i).getResult().getAddressCity()).n(((C0874a.b.C0320b) this.i).getResult().getAddressSubdivision()).c(((C0874a.b.C0320b) this.i).getResult().getAddressPostalCode()).R(null).P(bool)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final C0874a.b d;

            b(C0874a.b bVar) {
                super(1);
                this.d = bVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(new f.c.d("Couldn't load address.", ((C0874a.b.C0319a) this.d).getCause()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull C0874a.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "response");
            if (bVar instanceof C0874a.b.C0320b) {
                return C0562B.c(null, new C0187a(this.d, this.e, bVar), 1, null);
            }
            if (bVar instanceof C0874a.b.C0319a) {
                return C0562B.c(null, new b(bVar), 1, null);
            }
            throw new P9.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Z)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.jvm.internal.l implements Function1<Boolean, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0188a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final boolean i;

            C0188a(UiState.Displaying displaying, UiComponent uiComponent, boolean z) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = z;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((j0) uiComponent).a(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        d(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> a(boolean z) {
            return C0562B.c(null, new C0188a(this.d, this.e, z), 1, null);
        }

        public Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/Number;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.jvm.internal.l implements Function1<Number, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0189a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final Number i;
            final a v;

            C0189a(UiState.Displaying displaying, UiComponent uiComponent, Number number, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = number;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((k0) uiComponent).b(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i == null, this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(Number number) {
            return C0562B.c(null, new C0189a(this.d, this.e, number, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/graphics/Bitmap;", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Landroid/graphics/Bitmap;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends kotlin.jvm.internal.l implements Function1<Bitmap, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0190a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final Bitmap i;

            C0190a(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = bitmap;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0675c) uiComponent).b(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        f(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(Bitmap bitmap) {
            return C0562B.c(null, new C0190a(this.d, this.e, bitmap), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newDate", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0191a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0191a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                List<UiComponent> listH = com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0682j) uiComponent).a(this.i));
                a aVar = this.v;
                String str = this.i;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : listH, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(aVar, str == null || str.length() == 0, this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        g(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(String str) {
            return C0562B.c(null, new C0191a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0192a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0192a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).l(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), GovernmentIdNfcScan.cardAccessNumberName), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        h(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newValue");
            return C0562B.c(null, new C0192a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0193a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0193a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).o(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), GovernmentIdNfcScan.documentNumberName), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newValue");
            return C0562B.c(null, new C0193a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newDate", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0194a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0194a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                List<UiComponent> listH = com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).n(this.i));
                a aVar = this.v;
                String str = this.i;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : listH, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : aVar.b(str == null || str.length() == 0, this.d.d(), this.e.getName(), GovernmentIdNfcScan.dateOfBirthName), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(String str) {
            return C0562B.c(null, new C0194a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newDate", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0195a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0195a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                List<UiComponent> listH = com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).p(this.i));
                a aVar = this.v;
                String str = this.i;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : listH, (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : aVar.b(str == null || str.length() == 0, this.d.d(), this.e.getName(), GovernmentIdNfcScan.expirationDateName), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(String str) {
            return C0562B.c(null, new C0195a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/util/List;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class l extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0196a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final List<Option> i;
            final a v;

            C0196a(UiState.Displaying displaying, UiComponent uiComponent, List<Option> list, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = list;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((c0) uiComponent).g(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.isEmpty(), this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        l(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "selectedOptions");
            return C0562B.c(null, new C0196a(this.d, this.e, list, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "newValue", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class m extends kotlin.jvm.internal.l implements Function1<GovernmentIdNfcData, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0197a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final GovernmentIdNfcData i;

            C0197a(UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = governmentIdNfcData;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).q(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        m(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(GovernmentIdNfcData governmentIdNfcData) {
            return C0562B.c(null, new C0197a(this.d, this.e, governmentIdNfcData), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/util/List;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class n extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0198a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final List<Option> i;
            final a v;

            C0198a(UiState.Displaying displaying, UiComponent uiComponent, List<Option> list, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = list;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InputInternationalDbComponent) uiComponent).t((Option) CollectionsKt.firstOrNull(this.i))), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.isEmpty(), this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        n(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "newText");
            return C0562B.c(null, new C0198a(this.d, this.e, list, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/util/List;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class o extends kotlin.jvm.internal.l implements Function1<List<? extends Option>, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0199a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final List<Option> i;
            final a v;

            C0199a(UiState.Displaying displaying, UiComponent uiComponent, List<Option> list, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = list;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InputInternationalDbComponent) uiComponent).v((Option) CollectionsKt.firstOrNull(this.i))), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.isEmpty(), this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        o(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull List<Option> list) {
            Intrinsics.checkNotNullParameter(list, "newText");
            return C0562B.c(null, new C0199a(this.d, this.e, list, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class p extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0200a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0200a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InputInternationalDbComponent) uiComponent).w(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.length() == 0, this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        p(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0200a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "stringSet", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/util/Set;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class q extends kotlin.jvm.internal.l implements Function1<Set<? extends String>, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0201a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final Set<String> i;
            final a v;

            C0201a(UiState.Displaying displaying, UiComponent uiComponent, Set<String> set, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = set;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((o0) uiComponent).a(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : a.c(this.v, this.i.isEmpty(), this.d.d(), this.e.getName(), null, 8, null), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        q(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "stringSet");
            return C0562B.c(null, new C0201a(this.d, this.e, set, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newState", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Z)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class r extends kotlin.jvm.internal.l implements Function1<Boolean, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0202a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final boolean i;

            C0202a(UiState.Displaying displaying, UiComponent uiComponent, boolean z) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = z;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).a(Boolean.valueOf(this.i))), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : null, (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        r(UiState.Displaying displaying, UiComponent uiComponent) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> a(boolean z) {
            return C0562B.c(null, new C0202a(this.d, this.e, z), 1, null);
        }

        public Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class s extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0203a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0203a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).f(this.i).Q(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), "street_1"), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        s(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0203a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class t extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0204a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0204a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).k(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), "street_2"), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        t(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0204a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class u extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0205a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0205a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).o(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), "city"), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        u(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0205a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class v extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0206a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0206a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).n(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), "subdivision"), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        v(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0206a(this.d, this.e, str, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "newText", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "a", "(Ljava/lang/String;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class w extends kotlin.jvm.internal.l implements Function1<String, ka.r<? super f.Input, UiState, ? extends f.c>> {
        final UiState.Displaying d;
        final UiComponent e;
        final a i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/ui/f$b;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/f$c;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0207a extends kotlin.jvm.internal.l implements Function1<ka.r<? super f.Input, UiState, ? extends f.c>.c, Unit> {
            final UiState.Displaying d;
            final UiComponent e;
            final String i;
            final a v;

            C0207a(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar) {
                super(1);
                this.d = displaying;
                this.e = uiComponent;
                this.i = str;
                this.v = aVar;
            }

            public final void a(@NotNull ka.r<? super f.Input, UiState, ? extends f.c>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                UiState.Displaying displaying = this.d;
                List<UiComponent> components = displaying.getComponents();
                UiComponent uiComponent = this.e;
                cVar.e(displaying.a((8062 & 1) != 0 ? displaying.components : com.withpersona.sdk2.inquiry.steps.ui.components.b.h(components, uiComponent, ((InterfaceC0674b) uiComponent).c(this.i)), (8062 & 2) != 0 ? displaying.stepName : null, (8062 & 4) != 0 ? displaying.componentErrors : this.v.b(this.i.length() == 0, this.d.d(), this.e.getName(), "postal_code"), (8062 & 8) != 0 ? displaying.styles : null, (8062 & 16) != 0 ? displaying.error : null, (8062 & 32) != 0 ? displaying.nfcScan : null, (8062 & 64) != 0 ? displaying.autoSubmit : null, (8062 & 128) != 0 ? displaying.pendingAction : null, (8062 & 256) != 0 ? displaying.hasRequestedGpsPermissions : false, (8062 & 512) != 0 ? displaying.isRequestingGpsPermissions : false, (8062 & 1024) != 0 ? displaying.componentParams : null, (8062 & 2048) != 0 ? displaying.triggeringComponent : null, (8062 & 4096) != 0 ? displaying.requestPermissionKey : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        w(UiState.Displaying displaying, UiComponent uiComponent, a aVar) {
            super(1);
            this.d = displaying;
            this.e = uiComponent;
            this.i = aVar;
        }

        @NotNull
        public final ka.r<f.Input, UiState, f.c> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "newText");
            return C0562B.c(null, new C0207a(this.d, this.e, str, this.i), 1, null);
        }
    }

    public a(@NotNull b.a aVar, @NotNull C0874a.C0318a c0318a) {
        Intrinsics.checkNotNullParameter(aVar, "addressAutocompleteWorker");
        Intrinsics.checkNotNullParameter(c0318a, "addressDetailsWorker");
        this.addressAutocompleteWorker = aVar;
        this.addressDetailsWorker = c0318a;
    }

    public final List<UiComponentError> b(boolean isFieldBlank, List<? extends UiComponentError> componentErrors, String componentName, String subComponentName) {
        Object next;
        List<? extends UiComponentError> list = componentErrors;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.b(((UiComponentError) next).getName(), componentName)) {
                break;
            }
        }
        UiComponentError uiComponentError = (UiComponentError) next;
        if (!isFieldBlank) {
            if (uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
                UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
                Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : message.entrySet()) {
                    if (!Intrinsics.b(entry.getKey(), subComponentName)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            } else {
                if (!(uiComponentError instanceof UiComponentError.UiInputAddressComponentError)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!Intrinsics.b(((UiComponentError) obj).getName(), componentName)) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
                UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentError;
                Map<String, String> message2 = uiInputAddressComponentError.getMessage();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry2 : message2.entrySet()) {
                    if (!Intrinsics.b(entry2.getKey(), subComponentName)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                uiInputAddressComponentError.setMessage(linkedHashMap2);
            }
        }
        return componentErrors;
    }

    static List c(a aVar, boolean z, List list, String str, String str2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return aVar.b(z, list, str, str2);
    }

    public final void d(@NotNull f.Input renderProps, @NotNull UiState.Displaying renderState, @NotNull ka.k<? super f.Input, UiState, ? extends f.c, ? extends Object>.a context, @NotNull UiComponent component) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof l0) {
            ka.w.l(context, new TypedWorker(z.j(String.class), ((l0) component).getTextController().a()), z.k(ka.o.class, KTypeProjection.c.a(z.j(String.class))), component.getName(), new C0184a(renderState, component, this));
            return;
        }
        if (component instanceof c0) {
            ka.g<List<Option>> gVarA = ((c0) component).getSelectedOptionsController().a();
            KTypeProjection.a aVar = KTypeProjection.c;
            ka.w.l(context, new TypedWorker(z.k(List.class, aVar.a(z.j(Option.class))), gVarA), z.k(ka.o.class, aVar.a(z.k(List.class, aVar.a(z.j(Option.class))))), component.getName(), new l(renderState, component, this));
            return;
        }
        if (component instanceof o0) {
            ka.g<Set<String>> gVarA2 = ((o0) component).getStringSetController().a();
            KTypeProjection.a aVar2 = KTypeProjection.c;
            ka.w.l(context, new TypedWorker(z.k(Set.class, aVar2.a(z.j(String.class))), gVarA2), z.k(ka.o.class, aVar2.a(z.k(Set.class, aVar2.a(z.j(String.class))))), component.getName(), new q(renderState, component, this));
            return;
        }
        if (component instanceof InterfaceC0674b) {
            ka.g<Boolean> gVarA3 = ((InterfaceC0674b) component).getIsAddressFieldCollapsed().a();
            Class cls = Boolean.TYPE;
            TypedWorker typedWorker = new TypedWorker(z.j(cls), gVarA3);
            String str = component.getName() + "UpdateCollapsedState";
            r rVar = new r(renderState, component);
            KTypeProjection.a aVar3 = KTypeProjection.c;
            ka.w.l(context, typedWorker, z.k(ka.o.class, aVar3.a(z.j(cls))), str, rVar);
            InterfaceC0674b interfaceC0674b = (InterfaceC0674b) component;
            ka.w.l(context, new TypedWorker(z.j(String.class), interfaceC0674b.getTextControllerForAddressStreet1().a()), z.k(ka.o.class, aVar3.a(z.j(String.class))), component.getName() + "UpdateAddressStreet1", new s(renderState, component, this));
            ka.w.l(context, new TypedWorker(z.j(String.class), interfaceC0674b.getTextControllerForAddressStreet2().a()), z.k(ka.o.class, aVar3.a(z.j(String.class))), component.getName() + "UpdateAddressStreet2", new t(renderState, component, this));
            ka.w.l(context, new TypedWorker(z.j(String.class), interfaceC0674b.getTextControllerForAddressCity().a()), z.k(ka.o.class, aVar3.a(z.j(String.class))), component.getName() + "UpdateAddressCity", new u(renderState, component, this));
            ka.w.l(context, new TypedWorker(z.j(String.class), interfaceC0674b.getTextControllerForAddressSubdivision().a()), z.k(ka.o.class, aVar3.a(z.j(String.class))), component.getName() + "UpdateAddressSubdivision", new v(renderState, component, this));
            ka.w.l(context, new TypedWorker(z.j(String.class), interfaceC0674b.getTextControllerForAddressPostalCode().a()), z.k(ka.o.class, aVar3.a(z.j(String.class))), component.getName() + "UpdateAddressPostalCode", new w(renderState, component, this));
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                String searchQuery = inputAddressComponent.getSearchQuery();
                if (searchQuery != null) {
                    ka.w.l(context, this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), z.j(com.withpersona.sdk2.inquiry.ui.network.b.class), component.getName(), new b(renderState, component));
                }
                String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                if (selectedSearchResultId != null) {
                    ka.w.l(context, this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), z.j(C0874a.class), "", new c(renderState, component));
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof j0) {
            ka.g<Boolean> gVarA4 = ((j0) component).getTwoStateViewController().a();
            Class cls2 = Boolean.TYPE;
            ka.w.l(context, new TypedWorker(z.j(cls2), gVarA4), z.k(ka.o.class, KTypeProjection.c.a(z.j(cls2))), component.getName(), new d(renderState, component));
            return;
        }
        if (component instanceof k0) {
            ka.w.l(context, new TypedWorker(z.f(Number.class), ((k0) component).getNumberController().a()), z.k(ka.o.class, KTypeProjection.c.a(z.f(Number.class))), component.getName(), new e(renderState, component, this));
            return;
        }
        if (component instanceof InterfaceC0675c) {
            ka.w.l(context, new TypedWorker(z.f(Bitmap.class), ((InterfaceC0675c) component).getBitmapController().a()), z.k(ka.o.class, KTypeProjection.c.a(z.f(Bitmap.class))), component.getName(), new f(renderState, component));
            return;
        }
        if (component instanceof InterfaceC0682j) {
            ka.w.l(context, new TypedWorker(z.f(String.class), ((InterfaceC0682j) component).getDateController().e()), z.k(ka.o.class, KTypeProjection.c.a(z.f(String.class))), component.getName(), new g(renderState, component, this));
            return;
        }
        if (!(component instanceof GovernmentIdNfcScanComponent)) {
            if (component instanceof InputInternationalDbComponent) {
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                ka.g<List<Option>> gVarA5 = inputInternationalDbComponent.getCountryOptionsController().a();
                KTypeProjection.a aVar4 = KTypeProjection.c;
                ka.w.l(context, new TypedWorker(z.k(List.class, aVar4.a(z.j(Option.class))), gVarA5), z.k(ka.o.class, aVar4.a(z.k(List.class, aVar4.a(z.j(Option.class))))), component.getName() + ":country", new n(renderState, component, this));
                ka.w.l(context, new TypedWorker(z.k(List.class, aVar4.a(z.j(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().a()), z.k(ka.o.class, aVar4.a(z.k(List.class, aVar4.a(z.j(Option.class))))), component.getName() + ":idType", new o(renderState, component, this));
                ka.w.l(context, new TypedWorker(z.j(String.class), inputInternationalDbComponent.getIdValueController().a()), z.k(ka.o.class, aVar4.a(z.j(String.class))), component.getName() + ":idValue", new p(renderState, component, this));
                return;
            }
            return;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
        TypedWorker typedWorker2 = new TypedWorker(z.j(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().a());
        String str2 = component.getName() + "UpdateCardAccessNumber";
        h hVar = new h(renderState, component, this);
        KTypeProjection.a aVar5 = KTypeProjection.c;
        ka.w.l(context, typedWorker2, z.k(ka.o.class, aVar5.a(z.j(String.class))), str2, hVar);
        ka.w.l(context, new TypedWorker(z.j(String.class), governmentIdNfcScanComponent.getDocumentNumberController().a()), z.k(ka.o.class, aVar5.a(z.j(String.class))), component.getName() + "UpdateDocumentNumber", new i(renderState, component, this));
        ka.w.l(context, new TypedWorker(z.f(String.class), governmentIdNfcScanComponent.getDateOfBirthController().e()), z.k(ka.o.class, aVar5.a(z.f(String.class))), component.getName() + "UpdateDateOfBirth", new j(renderState, component, this));
        ka.w.l(context, new TypedWorker(z.f(String.class), governmentIdNfcScanComponent.getExpirationDateController().e()), z.k(ka.o.class, aVar5.a(z.f(String.class))), component.getName() + "UpdateExpirationDate", new k(renderState, component, this));
        ka.w.l(context, new TypedWorker(z.f(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().a()), z.k(ka.o.class, aVar5.a(z.f(GovernmentIdNfcData.class))), component.getName(), new m(renderState, component));
    }
}
