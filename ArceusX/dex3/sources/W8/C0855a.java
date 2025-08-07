package w8;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.o;
import com.withpersona.sdk2.inquiry.governmentid.p;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import ha.C0327b;
import ha.C0586a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0562B;
import ka.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import n9.S;
import org.jetbrains.annotations.NotNull;
import v8.EnumC0834b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw8/a;", "", "Lh9/a;", "navigationStateManager", "<init>", "(Lh9/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lf8/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "context", "LC8/b;", "videoCaptureHelper", "Lw8/b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lf8/k$a;LC8/b;)Lw8/b;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/o$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lf8/k$a;LC8/b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "Lh9/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0855a {

    @NotNull
    private final C0586a navigationStateManager;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0291a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0834b.values().length];
            try {
                iArr[EnumC0834b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0834b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0292a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0292a d = new C0292a();

            C0292a() {
                super(1);
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                String countryCode;
                String str;
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState governmentIdStateC = cVar.c();
                GovernmentIdState.AutoClassificationError autoClassificationError = governmentIdStateC instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) governmentIdStateC : null;
                if (autoClassificationError == null) {
                    return;
                }
                if (autoClassificationError.r().size() == 1) {
                    IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.M(autoClassificationError.r());
                    String idClassKey = idConfigForCountry.c().size() == 1 ? ((IdConfig) CollectionsKt.M(idConfigForCountry.c())).getIdClassKey() : null;
                    countryCode = idConfigForCountry.getCountryCode();
                    str = idClassKey;
                } else {
                    countryCode = null;
                    str = null;
                }
                cVar.e(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.l(), autoClassificationError.k(), autoClassificationError.getPartIndex(), p.b(cVar, true), autoClassificationError.o(), new CameraProperties(null, null, null, 0, 15, null), autoClassificationError.r(), countryCode, str));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        b(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m697invoke();
            return Unit.a;
        }

        public final void m697invoke() {
            this.d.b().d(C0562B.c(null, C0292a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        c(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m698invoke();
            return Unit.a;
        }

        public final void m698invoke() {
            p.l(this.d, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0293a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0293a d = new C0293a();

            C0293a() {
                super(1);
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(o.AbstractC0521b.C0113b.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        d(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m699invoke();
            return Unit.a;
        }

        public final void m699invoke() {
            this.d.b().d(C0562B.c(null, C0293a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends l implements Function1<Option, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final GovernmentIdState.AutoClassificationManualSelect e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0294a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.AutoClassificationManualSelect d;
            final Option e;

            C0294a(GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, Option option) {
                super(1);
                this.d = autoClassificationManualSelect;
                this.e = option;
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = this.d;
                if (autoClassificationManualSelect == null) {
                    autoClassificationManualSelect = null;
                }
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = autoClassificationManualSelect;
                if (autoClassificationManualSelect2 == null) {
                    return;
                }
                cVar.e(autoClassificationManualSelect2.o((767 & 1) != 0 ? autoClassificationManualSelect2.currentPart : null, (767 & 2) != 0 ? autoClassificationManualSelect2.uploadingIds : null, (767 & 4) != 0 ? autoClassificationManualSelect2.parts : null, (767 & 8) != 0 ? autoClassificationManualSelect2.partIndex : 0, (767 & 16) != 0 ? autoClassificationManualSelect2.backState : null, (767 & 32) != 0 ? autoClassificationManualSelect2.captureFrames : null, (767 & 64) != 0 ? autoClassificationManualSelect2.cameraProperties : null, (767 & 128) != 0 ? autoClassificationManualSelect2.idConfigsForCountry : null, (767 & 256) != 0 ? autoClassificationManualSelect2.selectedCountryCode : this.e.getValue(), (767 & 512) != 0 ? autoClassificationManualSelect2.selectedIdClass : null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect) {
            super(1);
            this.d = aVar;
            this.e = autoClassificationManualSelect;
        }

        public final void a(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "it");
            this.d.b().d(C0562B.c(null, new C0294a(this.e, option), 1, null));
        }

        public Object invoke(Object obj) {
            a((Option) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends l implements Function1<Option, Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final GovernmentIdState.AutoClassificationManualSelect e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0295a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            final GovernmentIdState.AutoClassificationManualSelect d;
            final Option e;

            C0295a(GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, Option option) {
                super(1);
                this.d = autoClassificationManualSelect;
                this.e = option;
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = this.d;
                if (autoClassificationManualSelect == null) {
                    autoClassificationManualSelect = null;
                }
                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = autoClassificationManualSelect;
                if (autoClassificationManualSelect2 == null) {
                    return;
                }
                cVar.e(autoClassificationManualSelect2.o((767 & 1) != 0 ? autoClassificationManualSelect2.currentPart : null, (767 & 2) != 0 ? autoClassificationManualSelect2.uploadingIds : null, (767 & 4) != 0 ? autoClassificationManualSelect2.parts : null, (767 & 8) != 0 ? autoClassificationManualSelect2.partIndex : 0, (767 & 16) != 0 ? autoClassificationManualSelect2.backState : null, (767 & 32) != 0 ? autoClassificationManualSelect2.captureFrames : null, (767 & 64) != 0 ? autoClassificationManualSelect2.cameraProperties : null, (767 & 128) != 0 ? autoClassificationManualSelect2.idConfigsForCountry : null, (767 & 256) != 0 ? autoClassificationManualSelect2.selectedCountryCode : null, (767 & 512) != 0 ? autoClassificationManualSelect2.selectedIdClass : this.e.getValue()));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        f(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect) {
            super(1);
            this.d = aVar;
            this.e = autoClassificationManualSelect;
        }

        public final void a(@NotNull Option option) {
            Intrinsics.checkNotNullParameter(option, "it");
            this.d.b().d(C0562B.c(null, new C0295a(this.e, option), 1, null));
        }

        public Object invoke(Object obj) {
            a((Option) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        final IdConfig d;
        final GovernmentIdState.AutoClassificationManualSelect e;
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a i;
        final o.C0520a v;
        final C0327b w;

        g(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, o.C0520a c0520a, C0327b c0327b) {
            super(0);
            this.d = idConfig;
            this.e = autoClassificationManualSelect;
            this.i = aVar;
            this.v = c0520a;
            this.w = c0327b;
        }

        public Object invoke() {
            m700invoke();
            return Unit.a;
        }

        public final void m700invoke() {
            IdConfig idConfig = this.d;
            if (idConfig == null) {
                return;
            }
            GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = this.e;
            p.n(autoClassificationManualSelect, this.i, this.v, null, idConfig, this.w, autoClassificationManualSelect.getCameraProperties(), (1536 & 128) != 0, (1536 & 256) != 0 ? autoClassificationManualSelect.k() : this.d.b(), (1536 & 512) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (1536 & 1024) != 0 ? null : null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;
        final C0327b e;

        h(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar, C0327b c0327b) {
            super(0);
            this.d = aVar;
            this.e = c0327b;
        }

        public Object invoke() {
            m701invoke();
            return Unit.a;
        }

        public final void m701invoke() {
            p.l(this.d, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class i extends l implements Function0<Unit> {
        final ka.k<o.C0520a, GovernmentIdState, o.AbstractC0521b, Object>.a d;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/o$b;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0296a extends l implements Function1<r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c, Unit> {
            public static final C0296a d = new C0296a();

            C0296a() {
                super(1);
            }

            public final void a(@NotNull r<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.d(o.AbstractC0521b.C0113b.a);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a aVar) {
            super(0);
            this.d = aVar;
        }

        public Object invoke() {
            m702invoke();
            return Unit.a;
        }

        public final void m702invoke() {
            this.d.b().d(C0562B.c(null, C0296a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"w8/a$j", "Ln9/S;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "f", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "options", "", "c", "()Ljava/lang/String;", "label", "b", "selectedOptions", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class j implements S {
        final o.C0520a d;
        final GovernmentIdState.AutoClassificationManualSelect e;

        j(o.C0520a c0520a, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect) {
            this.d = c0520a;
            this.e = autoClassificationManualSelect;
        }

        @Override
        public InputSelectComponentStyle getStyles() {
            StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
            StepStyles.InputSelectStyleContainer base;
            StepStyles.GovernmentIdStepStyle styles = this.d.getStyles();
            if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        @NotNull
        public List<Option> b() {
            Object next;
            List<Option> listD;
            List<IdConfigForCountry> listS = this.e.s();
            GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = this.e;
            Iterator<T> it = listS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.b(((IdConfigForCountry) next).getCountryCode(), autoClassificationManualSelect.getSelectedCountryCode())) {
                    break;
                }
            }
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            return (idConfigForCountry == null || (listD = CollectionsKt.d(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()))) == null) ? CollectionsKt.j() : listD;
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        @NotNull
        public List<Option> d() {
            List<IdConfigForCountry> listS = this.e.s();
            ArrayList arrayList = new ArrayList(CollectionsKt.t(listS, 10));
            for (IdConfigForCountry idConfigForCountry : listS) {
                arrayList.add(new Option(idConfigForCountry.getCountryName(), idConfigForCountry.getCountryCode()));
            }
            return arrayList;
        }

        @Override
        public boolean getCanSelectMultipleValues() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"w8/a$k", "Ln9/S;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "f", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "d", "()Ljava/util/List;", "options", "", "c", "()Ljava/lang/String;", "label", "b", "selectedOptions", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class k implements S {
        final o.C0520a d;
        final List<Option> e;
        final GovernmentIdState.AutoClassificationManualSelect i;

        k(o.C0520a c0520a, List<Option> list, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect) {
            this.d = c0520a;
            this.e = list;
            this.i = autoClassificationManualSelect;
        }

        @Override
        public InputSelectComponentStyle getStyles() {
            StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle;
            StepStyles.InputSelectStyleContainer base;
            StepStyles.GovernmentIdStepStyle styles = this.d.getStyles();
            if (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null || (base = inputSelectStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override
        @NotNull
        public List<Option> b() {
            List<Option> list = this.e;
            GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = this.i;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.b(((Option) obj).getValue(), autoClassificationManualSelect.getSelectedIdClass())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        @Override
        public String getLabel() {
            return null;
        }

        @Override
        @NotNull
        public List<Option> d() {
            return this.e;
        }

        @Override
        public boolean getCanSelectMultipleValues() {
            return false;
        }
    }

    public C0855a(@NotNull C0586a c0586a) {
        Intrinsics.checkNotNullParameter(c0586a, "navigationStateManager");
        this.navigationStateManager = c0586a;
    }

    @NotNull
    public final C0856b a(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper) throws m {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        EnumC0834b errorType = renderState.getErrorType();
        int[] iArr = C0291a.a;
        int i2 = iArr[errorType.ordinal()];
        if (i2 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i2 != 2) {
                throw new m();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        String str = idClassRejectedTitle;
        int i3 = iArr[renderState.getErrorType().ordinal()];
        if (i3 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i3 != 2) {
                throw new m();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        return new C0856b(str, idClassRejectedContinueButtonText, renderProps.getStyles(), this.navigationStateManager.b(), new b(context), new c(context, videoCaptureHelper), new d(context));
    }

    @NotNull
    public final Screen.a b(@NotNull o.C0520a renderProps, @NotNull GovernmentIdState.AutoClassificationManualSelect renderState, @NotNull ka.k<? super o.C0520a, GovernmentIdState, ? extends o.AbstractC0521b, ? extends Object>.a context, @NotNull C0327b videoCaptureHelper) {
        Object next;
        List<IdConfig> listJ;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        j jVar = new j(renderProps, renderState);
        IdConfig idConfig = null;
        if (renderState.getSelectedCountryCode() == null) {
            listJ = CollectionsKt.j();
        } else {
            Iterator<T> it = renderState.s().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.b(((IdConfigForCountry) next).getCountryCode(), renderState.getSelectedCountryCode())) {
                    break;
                }
            }
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) next;
            if (idConfigForCountry == null || (listJ = idConfigForCountry.c()) == null) {
                listJ = CollectionsKt.j();
            }
        }
        List<IdConfig> list = listJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        for (IdConfig idConfig2 : list) {
            String idClassKey = renderProps.getStrings().G().get(idConfig2.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig2.getIdClassKey();
            }
            arrayList.add(new Option(idClassKey, idConfig2.getIdClassKey()));
        }
        if (renderState.getSelectedIdClass() != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.b(((IdConfig) next2).getIdClassKey(), renderState.getSelectedIdClass())) {
                    idConfig = next2;
                    break;
                }
            }
            idConfig = idConfig;
        }
        return new Screen.a(renderProps.getStrings().getManualClassificationTitle(), renderProps.getStyles(), jVar, new k(renderProps, arrayList, renderState), renderProps.getStrings().getCountryInputTitle(), renderProps.getStrings().getIdClassInputTitle(), renderProps.getStrings().getManualClassificationContinueButtonText(), idConfig != null, this.navigationStateManager.b(), new e(context, renderState), new f(context, renderState), new g(idConfig, renderState, context, renderProps, videoCaptureHelper), new h(context, videoCaptureHelper), new i(context));
    }
}
