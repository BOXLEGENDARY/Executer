package y8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C0493e;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import j9.C0598a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import z8.C0890c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Ly8/d;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "", "f", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Ly8/e;", "viewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "i", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ly8/e;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "k", "a", "Landroid/view/ViewGroup;", "Lz8/c;", "b", "Lz8/c;", "binding", "", "value", "c", "Z", "e", "(Z)V", "isShowing", "d", "setup", "Landroid/view/View;", "Landroid/view/View;", "currentAssetIllustrationView", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {

    @NotNull
    private final ViewGroup contentView;

    private C0890c binding;

    private boolean isShowing;

    private boolean setup;

    private View currentAssetIllustrationView;

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
                iArr[IdConfig.b.z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends l implements Function0<Unit> {
        b() {
            super(0);
        }

        public Object invoke() {
            m723invoke();
            return Unit.a;
        }

        public final void m723invoke() {
            d.this.e(false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/core/view/WindowInsetsCompat;", "insets", "", "a", "(Landroidx/core/view/WindowInsetsCompat;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function1<WindowInsetsCompat, Unit> {
        final C0890c d;

        c(C0890c c0890c) {
            super(1);
            this.d = c0890c;
        }

        public final void a(@NotNull WindowInsetsCompat windowInsetsCompat) {
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            Space space = this.d.b;
            Intrinsics.checkNotNullExpressionValue(space, "bottomInset");
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = insetsIgnoringVisibility.bottom;
            space.setLayoutParams(layoutParams);
        }

        public Object invoke(Object obj) {
            a((WindowInsetsCompat) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0317d extends l implements Function0<Unit> {
        final C0890c d;

        C0317d(C0890c c0890c) {
            super(0);
            this.d = c0890c;
        }

        public Object invoke() {
            m724invoke();
            return Unit.a;
        }

        public final void m724invoke() {
            BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(this.d.c);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
            bottomSheetBehaviorM0.R0(5);
            FrameLayout frameLayoutA = this.d.a();
            Intrinsics.checkNotNullExpressionValue(frameLayoutA, "getRoot(...)");
            C0493e.c(frameLayoutA, null);
        }
    }

    public d(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "contentView");
        this.contentView = viewGroup;
    }

    public final void e(boolean z) {
        this.isShowing = z;
        k();
    }

    private final void f() {
        C0890c c0890c = this.binding;
        if (c0890c == null || this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(c0890c.c);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM0, "from(...)");
        b bVar = new b();
        FrameLayout frameLayout = c0890c.c;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "bottomSheet");
        C0598a.a(bottomSheetBehaviorM0, bVar, frameLayout, c0890c.d, c0890c.j);
        c0890c.j.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                d.g(bottomSheetBehaviorM0, view);
            }
        });
        c0890c.e.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                d.h(bottomSheetBehaviorM0, view);
            }
        });
        bottomSheetBehaviorM0.T0(true);
    }

    public static final void g(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public static final void h(BottomSheetBehavior bottomSheetBehavior, View view) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(5);
    }

    public static final void j(BottomSheetBehavior bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "$behavior");
        bottomSheetBehavior.R0(3);
    }

    public final void i(com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles.GovernmentIdStepStyle r20, @org.jetbrains.annotations.NotNull y8.CaptureTipsViewModel r21, com.withpersona.sdk2.inquiry.network.dto.NextStep.GovernmentId.AssetConfig.CapturePage r22) {
        throw new UnsupportedOperationException("Method not decompiled: y8.d.i(com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$GovernmentIdStepStyle, y8.e, com.withpersona.sdk2.inquiry.network.dto.NextStep$GovernmentId$AssetConfig$CapturePage):void");
    }

    public final void k() {
        C0890c c0890c = this.binding;
        if (c0890c == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout frameLayoutA = c0890c.a();
            Intrinsics.checkNotNullExpressionValue(frameLayoutA, "getRoot(...)");
            C0493e.c(frameLayoutA, new C0317d(c0890c));
        } else {
            FrameLayout frameLayoutA2 = c0890c.a();
            Intrinsics.checkNotNullExpressionValue(frameLayoutA2, "getRoot(...)");
            C0493e.c(frameLayoutA2, null);
        }
    }
}
