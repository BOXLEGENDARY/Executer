package n9;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.C0487e;
import c9.C0488f;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aI\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/view/View;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Ln9/s0;)Landroid/view/View;", "", "lottieRes", "drawableRes", "", "", "originalStrokeColors", "originalFillColors", "Lj1/a;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;Ln9/s0;II[Ljava/lang/String;[Ljava/lang/String;)Lj1/a;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Y {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class A extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        A(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m630invoke();
            return Unit.a;
        }

        public final void m630invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class B extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        B(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m631invoke();
            return Unit.a;
        }

        public final void m631invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        C(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m632invoke();
            return Unit.a;
        }

        public final void m632invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class D extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        D(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m633invoke();
            return Unit.a;
        }

        public final void m633invoke() {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = (int) C0458f.a(44.0d);
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class E extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        E(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m634invoke();
            return Unit.a;
        }

        public final void m634invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class F extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        F(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m635invoke();
            return Unit.a;
        }

        public final void m635invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class G extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        G(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m636invoke();
            return Unit.a;
        }

        public final void m636invoke() {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).O = 0.5f;
            }
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class H extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        H(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m637invoke();
            return Unit.a;
        }

        public final void m637invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class I extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        I(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m638invoke();
            return Unit.a;
        }

        public final void m638invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class J extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        J(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m639invoke();
            return Unit.a;
        }

        public final void m639invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class K extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        K(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m640invoke();
            return Unit.a;
        }

        public final void m640invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0662a {
        public static final int[] a;

        static {
            int[] iArr = new int[LocalImage.Image.values().length];
            try {
                iArr[LocalImage.Image.START_HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_START_HERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalImage.Image.ANIMATED_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalImage.Image.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalImage.Image.ID_FRONT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalImage.Image.ID_BACK_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalImage.Image.SELFIE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalImage.Image.DOCUMENT_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_START_HERO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_HERO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_SCAN_READY_HERO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalImage.Image.PASSPORT_NFC_CHECK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_ID_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalImage.Image.GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalImage.Image.CREATE_PERSONA_CTA_CARD_ICON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalImage.Image.OPTION_CHECK_ICON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalImage.Image.OPTION_FLAG_ICON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LocalImage.Image.OPTION_GLOBE_ICON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LocalImage.Image.OPTION_HOME_ICON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_DOCUMENT_ICON.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LocalImage.Image.OPTION_ID_ICON.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LocalImage.Image.OPTION_PHONE_ICON.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LocalImage.Image.OPTION_USER_ICON.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0663b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;
        final String[] i;
        final String[] v;

        C0663b(C0487e c0487e, LocalImageComponent localImageComponent, String[] strArr, String[] strArr2) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
            this.i = strArr;
            this.v = strArr2;
        }

        public Object invoke() throws P9.m {
            m641invoke();
            return Unit.a;
        }

        public final void m641invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), this.i, this.v, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0664c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        C0664c(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m642invoke();
            return Unit.a;
        }

        public final void m642invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0665d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        C0665d(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m643invoke();
            return Unit.a;
        }

        public final void m643invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#02214F"}, new String[]{"#AA84FF", "#F2EAFF"}, new String[]{"#FFFFFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0666e extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        C0666e(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m644invoke();
            return Unit.a;
        }

        public final void m644invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0667f extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        C0667f(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m645invoke();
            return Unit.a;
        }

        public final void m645invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0668g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        C0668g(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m646invoke();
            return Unit.a;
        }

        public final void m646invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0669h extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        C0669h(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m647invoke();
            return Unit.a;
        }

        public final void m647invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0670i extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        C0670i(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m648invoke();
            return Unit.a;
        }

        public final void m648invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#4C4293"}, new String[]{"#B5B5CC"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0671j extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        C0671j(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m649invoke();
            return Unit.a;
        }

        public final void m649invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0672k extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        C0672k(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m650invoke();
            return Unit.a;
        }

        public final void m650invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#190051", "#02214F"}, new String[]{"#AA84FF"}, new String[]{"#AA84FF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        l(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m651invoke();
            return Unit.a;
        }

        public final void m651invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        m(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m652invoke();
            return Unit.a;
        }

        public final void m652invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#190052"}, new String[]{"#F1EBFF", "#8552FF"}, new String[]{"#FFFFFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        n(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m653invoke();
            return Unit.a;
        }

        public final void m653invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        o(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m654invoke();
            return Unit.a;
        }

        public final void m654invoke() {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).O = 0.5f;
            }
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        p(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m655invoke();
            return Unit.a;
        }

        public final void m655invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#02214F", "#190051"}, new String[]{"#E5E5EA"}, new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class q extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final int e;

        q(C0488f c0488f, int i) {
            super(0);
            this.d = c0488f;
            this.e = i;
        }

        public Object invoke() {
            m656invoke();
            return Unit.a;
        }

        public final void m656invoke() {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            int i = this.e;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        r(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m657invoke();
            return Unit.a;
        }

        public final void m657invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087"}, new String[0], new String[0]);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        s(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m658invoke();
            return Unit.a;
        }

        public final void m658invoke() {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).O = 0.5f;
            }
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        t(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m659invoke();
            return Unit.a;
        }

        public final void m659invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class u extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        u(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m660invoke();
            return Unit.a;
        }

        public final void m660invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        v(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m661invoke();
            return Unit.a;
        }

        public final void m661invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class w extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        w(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m662invoke();
            return Unit.a;
        }

        public final void m662invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class x extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        x(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m663invoke();
            return Unit.a;
        }

        public final void m663invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class y extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;

        y(C0487e c0487e) {
            super(0);
            this.d = c0487e;
        }

        public Object invoke() {
            m664invoke();
            return Unit.a;
        }

        public final void m664invoke() {
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class z extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final LocalImageComponent e;

        z(C0487e c0487e, LocalImageComponent localImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = localImageComponent;
        }

        public Object invoke() throws P9.m {
            m665invoke();
            return Unit.a;
        }

        public final void m665invoke() throws P9.m {
            ThemeableLottieAnimationView themeableLottieAnimationView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "lottieView");
            s9.e.c(themeableLottieAnimationView, this.e.e().getStyles(), new String[]{"#280087", "#322A7E"}, new String[]{"#CBB1FF"}, new String[]{"#F1EBFF"});
        }
    }

    @NotNull
    public static final j1.a b(@NotNull LocalImageComponent localImageComponent, @NotNull s0 s0Var, int i, int i2, @NotNull String[] strArr, @NotNull String[] strArr2) {
        Intrinsics.checkNotNullParameter(localImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(strArr, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(strArr2, "originalFillColors");
        if (localImageComponent.e().getStyles() != null) {
            C0487e c0487eD = C0487e.d(s0Var.getLayoutInflater());
            c0487eD.b.setAnimation(i);
            s0Var.d(new C0663b(c0487eD, localImageComponent, strArr, strArr2));
            Intrinsics.d(c0487eD);
            return c0487eD;
        }
        int dimension = (int) s0Var.getContext().getResources().getDimension(S8.c.e);
        C0488f c0488fD = C0488f.d(s0Var.getLayoutInflater());
        c0488fD.b.setImageResource(i2);
        s0Var.d(new C0664c(c0488fD, dimension));
        Intrinsics.d(c0488fD);
        return c0488fD;
    }

    public static final android.view.View c(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent r22, @org.jetbrains.annotations.NotNull n9.s0 r23) {
        throw new UnsupportedOperationException("Method not decompiled: n9.Y.c(com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent, n9.s0):android.view.View");
    }

    public static final void d(C0487e c0487e, P1.d dVar) {
        Intrinsics.checkNotNullParameter(c0487e, "$this_apply");
        c0487e.b.s();
    }
}
