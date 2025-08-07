package com.withpersona.sdk2.inquiry.selfie.view;

import V8.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0458f;
import ha.C0476u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001]B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\f*\u00020$2\b\b\u0001\u0010%\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\f*\u00020$2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020,*\u00020\n2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010.J\u001d\u00103\u001a\u00020\f*\u0002002\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010BR$\u0010L\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010P\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010QR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00170R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010QR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "previewView", "", "setPreviewView", "(Landroid/view/View;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "o", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;", "viewState", "", "showProgress", "Lkotlin/Function0;", "onAnimationEnd", "v", "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "q", "()Z", "onComplete", "p", "(Lkotlin/jvm/functions/Function0;)V", "LW8/d;", "rawRes", "x", "(LW8/d;ILkotlin/jvm/functions/Function0;)V", "s", "(LW8/d;Lkotlin/jvm/functions/Function0;)V", "", "duration", "Landroid/view/ViewPropertyAnimator;", "j", "(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;", "m", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "drawable", "y", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V", "A", "(Landroid/content/Context;)Z", "d", "LW8/d;", "binding", "e", "LP9/h;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "i", "getDrawableRight", "drawableRight", "I", "leftPoseAnimation", "w", "rightPoseAnimation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "leftPoseImage", "z", "getRightPoseImage", "setRightPoseImage", "rightPoseImage", "Landroid/view/View;", "", "B", "Ljava/util/List;", "oneShotOnCompositionLoadedListeners", "C", "oneShotOnAnimationCompleteListeners", "D", "remoteImageView", "E", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;", "currentViewState", "b", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SelfieOverlayView extends ConstraintLayout {

    private View previewView;

    @NotNull
    private final List<Function0<Unit>> oneShotOnCompositionLoadedListeners;

    @NotNull
    private final List<Function0<Unit>> oneShotOnAnimationCompleteListeners;

    private View remoteImageView;

    private b currentViewState;

    @NotNull
    private final W8.d binding;

    @NotNull
    private final P9.h drawableLeft;

    @NotNull
    private final P9.h drawableRight;

    private final int leftPoseAnimation;

    private final int rightPoseAnimation;

    private RemoteImage leftPoseImage;

    private RemoteImage rightPoseImage;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            List listR0 = CollectionsKt.r0(SelfieOverlayView.this.oneShotOnAnimationCompleteListeners);
            SelfieOverlayView.this.oneShotOnAnimationCompleteListeners.clear();
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "y", "z", "A", "B", "C", "D", "E", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b {
        private static final b[] F;
        private static final T9.a G;
        public static final b d = new b("CLEAR", 0);
        public static final b e = new b("CENTER", 1);
        public static final b i = new b("CENTER_COMPLETE", 2);
        public static final b v = new b("LOOK_LEFT_HINT", 3);
        public static final b w = new b("LOOK_LEFT", 4);
        public static final b y = new b("LOOK_LEFT_COMPLETE", 5);
        public static final b z = new b("LOOK_RIGHT_HINT", 6);
        public static final b A = new b("LOOK_RIGHT", 7);
        public static final b B = new b("LOOK_RIGHT_COMPLETE", 8);
        public static final b C = new b("FINALIZING", 9);
        public static final b D = new b("COMPLETE_WITH_CAPTURE", 10);
        public static final b E = new b("COMPLETE", 11);

        static {
            b[] bVarArrC = c();
            F = bVarArrC;
            G = T9.b.a(bVarArrC);
        }

        private b(String str, int i2) {
        }

        private static final b[] c() {
            return new b[]{d, e, i, v, w, y, z, A, B, C, D, E};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) F.clone();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class c {
        public static final int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.D.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.E.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/drawable/Drawable;", "a", "()Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends l implements Function0<Drawable> {
        final Context d;

        d(Context context) {
            super(0);
            this.d = context;
        }

        public final Drawable invoke() {
            Integer numF = C0476u.f(this.d, S8.a.q, null, false, 6, null);
            return numF != null ? androidx.core.content.a.e(this.d, numF.intValue()) : androidx.core.content.a.e(this.d, V8.f.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/drawable/Drawable;", "a", "()Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends l implements Function0<Drawable> {
        final Context d;

        e(Context context) {
            super(0);
            this.d = context;
        }

        public final Drawable invoke() {
            Integer numF = C0476u.f(this.d, S8.a.s, null, false, 6, null);
            return numF != null ? androidx.core.content.a.e(this.d, numF.intValue()) : androidx.core.content.a.e(this.d, V8.f.b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends l implements Function0<Unit> {
        final Function0<Unit> e;

        f(Function0<Unit> function0) {
            super(0);
            this.e = function0;
        }

        public Object invoke() {
            m589invoke();
            return Unit.a;
        }

        public final void m589invoke() {
            SelfieOverlayView selfieOverlayView = SelfieOverlayView.this;
            selfieOverlayView.x(selfieOverlayView.binding, i.a, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends l implements Function0<Unit> {
        final Function0<Unit> e;

        g(Function0<Unit> function0) {
            super(0);
            this.e = function0;
        }

        public Object invoke() {
            m590invoke();
            return Unit.a;
        }

        public final void m590invoke() {
            SelfieOverlayView selfieOverlayView = SelfieOverlayView.this;
            selfieOverlayView.x(selfieOverlayView.binding, i.a, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends l implements Function0<Unit> {
        final W8.d d;
        final SelfieOverlayView e;
        final Function0<Unit> i;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends l implements Function0<Unit> {
            final SelfieOverlayView d;
            final W8.d e;
            final Function0<Unit> i;

            a(SelfieOverlayView selfieOverlayView, W8.d dVar, Function0<Unit> function0) {
                super(0);
                this.d = selfieOverlayView;
                this.e = dVar;
                this.i = function0;
            }

            public static final void b(Function0 function0) {
                if (function0 != null) {
                    function0.invoke();
                }
            }

            public Object invoke() {
                m592invoke();
                return Unit.a;
            }

            public final void m592invoke() {
                SelfieOverlayView selfieOverlayView = this.d;
                AppCompatImageView appCompatImageView = this.e.d;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "hintAnimation");
                ViewPropertyAnimator viewPropertyAnimatorK = SelfieOverlayView.k(selfieOverlayView, appCompatImageView, 0L, 1, null);
                final Function0<Unit> function0 = this.i;
                viewPropertyAnimatorK.withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        SelfieOverlayView.h.a.b(function0);
                    }
                });
                SelfieOverlayView selfieOverlayView2 = this.d;
                View view = this.e.f;
                Intrinsics.checkNotNullExpressionValue(view, "hintOverlayView");
                SelfieOverlayView.k(selfieOverlayView2, view, 0L, 1, null);
            }
        }

        h(W8.d dVar, SelfieOverlayView selfieOverlayView, Function0<Unit> function0) {
            super(0);
            this.d = dVar;
            this.e = selfieOverlayView;
            this.i = function0;
        }

        public static final void b(SelfieOverlayView selfieOverlayView, W8.d dVar, Function0 function0) {
            Intrinsics.checkNotNullParameter(selfieOverlayView, "this$0");
            Intrinsics.checkNotNullParameter(dVar, "$this_switchAnimation");
            selfieOverlayView.oneShotOnAnimationCompleteListeners.add(new a(selfieOverlayView, dVar, function0));
            dVar.d.s();
        }

        public Object invoke() {
            m591invoke();
            return Unit.a;
        }

        public final void m591invoke() {
            this.d.d.setFrame(0);
            SelfieOverlayView selfieOverlayView = this.e;
            AppCompatImageView appCompatImageView = this.d.d;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "hintAnimation");
            ViewPropertyAnimator viewPropertyAnimatorN = SelfieOverlayView.n(selfieOverlayView, appCompatImageView, 0L, 1, null);
            final SelfieOverlayView selfieOverlayView2 = this.e;
            final W8.d dVar = this.d;
            final Function0<Unit> function0 = this.i;
            viewPropertyAnimatorN.withEndAction(new Runnable() {
                @Override
                public final void run() {
                    SelfieOverlayView.h.b(selfieOverlayView2, dVar, function0);
                }
            });
            SelfieOverlayView selfieOverlayView3 = this.e;
            View view = this.d.f;
            Intrinsics.checkNotNullExpressionValue(view, "hintOverlayView");
            SelfieOverlayView.n(selfieOverlayView3, view, 0L, 1, null);
        }
    }

    public SelfieOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean A(Context context) {
        return (C0476u.f(context, S8.a.q, null, false, 6, null) == null || C0476u.f(context, S8.a.s, null, false, 6, null) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.drawableLeft.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.drawableRight.getValue();
    }

    private final ViewPropertyAnimator j(final View view, long j) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(0.0f).setDuration(j).withEndAction(new Runnable() {
            @Override
            public final void run() {
                SelfieOverlayView.l(view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    static ViewPropertyAnimator k(SelfieOverlayView selfieOverlayView, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        return selfieOverlayView.j(view, j);
    }

    public static final void l(View view) {
        Intrinsics.checkNotNullParameter(view, "$this_animateHide");
        view.setVisibility(4);
    }

    private final ViewPropertyAnimator m(View view, long j) {
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    static ViewPropertyAnimator n(SelfieOverlayView selfieOverlayView, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 200;
        }
        return selfieOverlayView.m(view, j);
    }

    public static final void r(SelfieOverlayView selfieOverlayView, P1.d dVar) {
        Intrinsics.checkNotNullParameter(selfieOverlayView, "this$0");
        List listR0 = CollectionsKt.r0(selfieOverlayView.oneShotOnCompositionLoadedListeners);
        selfieOverlayView.oneShotOnCompositionLoadedListeners.clear();
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    private final void s(final W8.d dVar, final Function0<Unit> function0) {
        View view = dVar.b;
        Intrinsics.checkNotNullExpressionValue(view, "blindsView");
        m(view, 80L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                SelfieOverlayView.t(this.d, dVar, function0);
            }
        });
    }

    public static final void t(SelfieOverlayView selfieOverlayView, W8.d dVar, final Function0 function0) {
        Intrinsics.checkNotNullParameter(selfieOverlayView, "this$0");
        Intrinsics.checkNotNullParameter(dVar, "$this_playBlinkAnimation");
        View view = dVar.b;
        Intrinsics.checkNotNullExpressionValue(view, "blindsView");
        selfieOverlayView.j(view, 80L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                SelfieOverlayView.u(function0);
            }
        });
    }

    public static final void u(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void w(SelfieOverlayView selfieOverlayView, b bVar, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        selfieOverlayView.v(bVar, z, function0);
    }

    public final void x(W8.d dVar, int i, Function0<Unit> function0) {
        this.oneShotOnCompositionLoadedListeners.add(new h(dVar, this, function0));
        dVar.d.setAnimation(i);
    }

    private final void y(final ImageView imageView, Drawable drawable) {
        if (Intrinsics.b(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            k(this, imageView, 0L, 1, null).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    SelfieOverlayView.z(imageView);
                }
            });
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(0.0f);
        n(this, imageView, 0L, 1, null);
    }

    public static final void z(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "$this_switchImageDrawable");
        imageView.setImageDrawable(null);
    }

    public final RemoteImage getLeftPoseImage() {
        return this.leftPoseImage;
    }

    public final RemoteImage getRightPoseImage() {
        return this.rightPoseImage;
    }

    public final void o(@NotNull StepStyles.SelfieStepStyle styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer selfieCaptureFeedBoxBorderColorValue = styles.getSelfieCaptureFeedBoxBorderColorValue();
        if (selfieCaptureFeedBoxBorderColorValue != null) {
            this.binding.h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
        }
        Double selfieCaptureFeedBoxBorderWidthValue = styles.getSelfieCaptureFeedBoxBorderWidthValue();
        if (selfieCaptureFeedBoxBorderWidthValue != null) {
            this.binding.h.setStrokeWidth((float) C0458f.a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
        }
        Integer selfieCaptureIconStrokeColor = styles.getSelfieCaptureIconStrokeColor();
        if (selfieCaptureIconStrokeColor != null) {
            int iIntValue = selfieCaptureIconStrokeColor.intValue();
            this.binding.d.C(Color.parseColor("#022050"), iIntValue);
            this.binding.d.C(Color.parseColor("#280087"), iIntValue);
        }
        Integer selfieCaptureIconFillColor = styles.getSelfieCaptureIconFillColor();
        if (selfieCaptureIconFillColor != null) {
            int iIntValue2 = selfieCaptureIconFillColor.intValue();
            this.binding.d.C(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.d.C(Color.parseColor("#8552FF"), iIntValue2);
        }
        Integer selfieCaptureIconBackgroundFillColor = styles.getSelfieCaptureIconBackgroundFillColor();
        if (selfieCaptureIconBackgroundFillColor != null) {
            this.binding.d.C(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public final void p(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Pi2CircleMaskView pi2CircleMaskView = this.binding.c;
        Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView, "circleMask");
        Pi2CircleMaskView.e(pi2CircleMaskView, false, onComplete, 1, null);
    }

    public final boolean q() {
        return this.binding.c.g();
    }

    public final void setLeftPoseImage(RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final void setPreviewView(@NotNull View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    public final void setRightPoseImage(RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }

    public final void v(@NotNull b viewState, boolean showProgress, Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (this.currentViewState == viewState) {
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zA = A(context);
        W8.d dVar = this.binding;
        if (showProgress) {
            dVar.h.setVisibility(0);
        } else {
            dVar.h.setVisibility(8);
        }
        switch (c.a[viewState.ordinal()]) {
            case 1:
                dVar.c.h();
                dVar.h.f(0.0f, onAnimationEnd);
                break;
            case 2:
                Pi2CircleMaskView pi2CircleMaskView = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView, false, null, 3, null);
                dVar.h.f(0.0f, onAnimationEnd);
                break;
            case 3:
                Pi2CircleMaskView pi2CircleMaskView2 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView2, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView2, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView, 0.0f, null, 2, null);
                s(this.binding, onAnimationEnd);
                break;
            case 4:
                Pi2CircleMaskView pi2CircleMaskView3 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView3, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView3, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView2 = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView2, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView2, 0.0f, null, 2, null);
                if (!zA) {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        break;
                    }
                } else {
                    x(this.binding, this.leftPoseAnimation, onAnimationEnd);
                    break;
                }
                break;
            case 5:
                Pi2CircleMaskView pi2CircleMaskView4 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView4, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView4, false, null, 3, null);
                dVar.h.f(0.0f, onAnimationEnd);
                if (!zA) {
                    RemoteImage remoteImage = this.leftPoseImage;
                    if (remoteImage == null) {
                        dVar.g.setVisibility(0);
                        ImageView imageView = dVar.e;
                        Intrinsics.checkNotNullExpressionValue(imageView, "hintImage");
                        y(imageView, getDrawableLeft());
                        break;
                    } else {
                        this.remoteImageView = t9.a.a(remoteImage, this, true);
                        break;
                    }
                }
                break;
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                Pi2CircleMaskView pi2CircleMaskView5 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView5, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView5, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView3 = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView3, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView3, 50.0f, null, 2, null);
                s(this.binding, onAnimationEnd);
                break;
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                Pi2CircleMaskView pi2CircleMaskView6 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView6, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView6, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView4 = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView4, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView4, 50.0f, null, 2, null);
                if (!zA) {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        break;
                    }
                } else {
                    x(this.binding, this.rightPoseAnimation, onAnimationEnd);
                    break;
                }
                break;
            case R.styleable.LottieAnimationView_lottie_loop:
                Pi2CircleMaskView pi2CircleMaskView7 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView7, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView7, false, null, 3, null);
                dVar.h.f(50.0f, onAnimationEnd);
                if (!zA) {
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    if (remoteImage2 == null) {
                        dVar.g.setVisibility(0);
                        ImageView imageView2 = dVar.e;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "hintImage");
                        y(imageView2, getDrawableRight());
                        break;
                    } else {
                        this.remoteImageView = t9.a.a(remoteImage2, this, true);
                        break;
                    }
                }
                break;
            case R.styleable.LottieAnimationView_lottie_progress:
                Pi2CircleMaskView pi2CircleMaskView8 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView8, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView8, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView5 = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView5, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView5, 100.0f, null, 2, null);
                s(this.binding, onAnimationEnd);
                break;
            case R.styleable.LottieAnimationView_lottie_rawRes:
                Pi2CircleMaskView pi2CircleMaskView9 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView9, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView9, false, null, 3, null);
                dVar.h.e();
                break;
            case R.styleable.LottieAnimationView_lottie_renderMode:
                Pi2CircleMaskView pi2CircleMaskView10 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView10, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView10, false, null, 3, null);
                Pi2ProgressArcView pi2ProgressArcView6 = dVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2ProgressArcView6, "progressArc");
                Pi2ProgressArcView.g(pi2ProgressArcView6, 100.0f, null, 2, null);
                s(this.binding, new f(onAnimationEnd));
                break;
            case R.styleable.LottieAnimationView_lottie_repeatCount:
                Pi2CircleMaskView pi2CircleMaskView11 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(pi2CircleMaskView11, "circleMask");
                Pi2CircleMaskView.e(pi2CircleMaskView11, false, null, 3, null);
                dVar.h.f(100.0f, new g(onAnimationEnd));
                break;
        }
    }

    public SelfieOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelfieOverlayView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        W8.d dVarC = W8.d.c(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
        this.binding = dVarC;
        this.drawableLeft = P9.i.b(new d(context));
        this.drawableRight = P9.i.b(new e(context));
        int i2 = S8.a.r;
        Integer numF = C0476u.f(context, i2, null, false, 6, null);
        this.leftPoseAnimation = numF != null ? numF.intValue() : i.b;
        Integer numF2 = C0476u.f(context, i2, null, false, 6, null);
        this.rightPoseAnimation = numF2 != null ? numF2.intValue() : i.c;
        this.oneShotOnCompositionLoadedListeners = new ArrayList();
        this.oneShotOnAnimationCompleteListeners = new ArrayList();
        ThemeableLottieAnimationView themeableLottieAnimationView = dVarC.d;
        themeableLottieAnimationView.f(new P1.i() {
            @Override
            public final void a(P1.d dVar) {
                SelfieOverlayView.r(this.a, dVar);
            }
        });
        themeableLottieAnimationView.e(new a());
        int color = Color.parseColor("#022050");
        Context context2 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i3 = c4.b.l;
        themeableLottieAnimationView.C(color, C0476u.d(context2, i3, null, false, 6, null));
        int color2 = Color.parseColor("#AA85FF");
        Context context3 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i4 = c4.b.m;
        themeableLottieAnimationView.C(color2, C0476u.d(context3, i4, null, false, 6, null));
        int color3 = Color.parseColor("#280087");
        Context context4 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        themeableLottieAnimationView.C(color3, C0476u.d(context4, i3, null, false, 6, null));
        int color4 = Color.parseColor("#8552FF");
        Context context5 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        themeableLottieAnimationView.C(color4, C0476u.d(context5, i4, null, false, 6, null));
        Context context6 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        int iD = C0476u.d(context6, i4, null, false, 6, null);
        Context context7 = dVarC.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        themeableLottieAnimationView.C(Color.parseColor("#DBCCFF"), androidx.core.graphics.a.c(iD, C0476u.d(context7, c4.b.n, null, false, 6, null), 0.66f));
    }
}
