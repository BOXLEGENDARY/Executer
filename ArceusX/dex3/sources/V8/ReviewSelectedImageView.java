package v8;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0356g;
import ha.C0446E;
import ha.C0588c;
import ha.InterfaceC0883h;
import i9.C0596c;
import j9.C0601d;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v8.ReviewSelectedImageView;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010'\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b2\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b6\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\b9\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u0010*R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\bS\u0010IR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lv8/J;", "Lcom/squareup/workflow1/ui/b;", "Lz1/h;", "imageLoader", "", Title.type, "body", "confirmButtonText", "chooseNewPhotoText", "fileToReviewPath", "fileMimeType", "fileName", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotoClick", "onChooseNewPhotoClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "isAutoClassifying", "<init>", "(Lz1/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Z)V", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "usePhotoButton", "Landroid/widget/Button;", "chooseNewPhotoButton", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lcom/squareup/workflow1/ui/y;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lz1/h;", "k", "()Lz1/h;", "e", "Ljava/lang/String;", "s", "i", "v", "f", "w", "y", "j", "z", "h", "A", "B", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "l", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "C", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "D", "o", "E", "m", "F", "n", "G", "g", "H", "p", "I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "J", "Z", "t", "()Z", "Lcom/squareup/workflow1/ui/A;", "K", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ReviewSelectedImageView implements InterfaceC0490b<ReviewSelectedImageView> {

    private final String fileName;

    @NotNull
    private final NavigationState navigationState;

    @NotNull
    private final Function0<Unit> onUsePhotoClick;

    @NotNull
    private final Function0<Unit> onChooseNewPhotoClick;

    @NotNull
    private final Function0<Unit> onBack;

    @NotNull
    private final Function0<Unit> onCancel;

    private final String error;

    @NotNull
    private final Function0<Unit> onErrorDismissed;

    private final StepStyles.GovernmentIdStepStyle styles;

    private final boolean isAutoClassifying;

    @NotNull
    private final com.squareup.workflow1.ui.A<ReviewSelectedImageView> viewFactory;

    @NotNull
    private final InterfaceC0883h imageLoader;

    @NotNull
    private final String title;

    @NotNull
    private final String body;

    @NotNull
    private final String confirmButtonText;

    @NotNull
    private final String chooseNewPhotoText;

    @NotNull
    private final String fileToReviewPath;

    @NotNull
    private final String fileMimeType;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, z8.h> {
        public static final a d = new a();

        a() {
            super(3, z8.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);
        }

        @NotNull
        public final z8.h f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return z8.h.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz8/h;", "binding", "Lcom/squareup/workflow1/ui/j;", "Lv8/J;", "e", "(Lz8/h;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<z8.h, com.squareup.workflow1.ui.j<ReviewSelectedImageView>> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
            final ReviewSelectedImageView d;

            a(ReviewSelectedImageView reviewSelectedImageView) {
                super(0);
                this.d = reviewSelectedImageView;
            }

            public Object invoke() {
                m693invoke();
                return Unit.a;
            }

            public final void m693invoke() {
                this.d.m().invoke();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0289b extends kotlin.jvm.internal.l implements Function0<Unit> {
            final ReviewSelectedImageView d;

            C0289b(ReviewSelectedImageView reviewSelectedImageView) {
                super(0);
                this.d = reviewSelectedImageView;
            }

            public Object invoke() {
                m694invoke();
                return Unit.a;
            }

            public final void m694invoke() {
                this.d.n().invoke();
            }
        }

        b() {
            super(1);
        }

        public static final void f(z8.h hVar, final ReviewSelectedImageView reviewSelectedImageView, ReviewSelectedImageView reviewSelectedImageView2, ViewEnvironment viewEnvironment) throws P9.m {
            Intrinsics.checkNotNullParameter(hVar, "$binding");
            Intrinsics.checkNotNullParameter(reviewSelectedImageView, "this$0");
            Intrinsics.checkNotNullParameter(reviewSelectedImageView2, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            hVar.i.setText(reviewSelectedImageView2.getTitle());
            hVar.b.setText(reviewSelectedImageView2.getBody());
            hVar.j.setText(reviewSelectedImageView.getConfirmButtonText());
            hVar.j.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ReviewSelectedImageView.b.g(reviewSelectedImageView, view);
                }
            });
            hVar.c.setText(reviewSelectedImageView.getChooseNewPhotoText());
            hVar.c.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ReviewSelectedImageView.b.j(reviewSelectedImageView, view);
                }
            });
            File file = new File(reviewSelectedImageView.getFileToReviewPath());
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(reviewSelectedImageView.getFileToReviewPath(), options);
            if (StringsKt.F(reviewSelectedImageView.getFileMimeType(), "image/", false, 2, (Object) null)) {
                ImageView imageView = hVar.f;
                Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
                InterfaceC0883h imageLoader = reviewSelectedImageView.getImageLoader();
                C0356g.a aVarS = new C0356g.a(imageView.getContext()).d(file).s(imageView);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setSize(options.outWidth, options.outHeight);
                gradientDrawable.setColor(0);
                aVarS.i(gradientDrawable);
                imageLoader.a(aVarS.a());
            } else {
                hVar.f.setVisibility(8);
                hVar.d.setVisibility(0);
                hVar.e.setVisibility(0);
                hVar.e.setText(reviewSelectedImageView.getFileName());
            }
            NavigationState navigationState = reviewSelectedImageView2.getNavigationState();
            a aVar = new a(reviewSelectedImageView2);
            C0289b c0289b = new C0289b(reviewSelectedImageView2);
            Pi2NavigationBar pi2NavigationBar = hVar.h;
            Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
            ScrollView scrollViewA = hVar.a();
            Intrinsics.checkNotNullExpressionValue(scrollViewA, "getRoot(...)");
            C0588c.a(navigationState, aVar, c0289b, pi2NavigationBar, scrollViewA);
            hVar.j.setIsLoading(reviewSelectedImageView2.getIsAutoClassifying());
            ScrollView scrollViewA2 = hVar.a();
            Intrinsics.checkNotNullExpressionValue(scrollViewA2, "getRoot(...)");
            C0446E.b(scrollViewA2, reviewSelectedImageView2.getError(), reviewSelectedImageView2.p(), null, 0, 0, 56, null);
            StepStyles.GovernmentIdStepStyle styles = reviewSelectedImageView.getStyles();
            if (styles != null) {
                ScrollView scrollViewA3 = hVar.a();
                Intrinsics.checkNotNullExpressionValue(scrollViewA3, "getRoot(...)");
                Pi2NavigationBar pi2NavigationBar2 = hVar.h;
                Intrinsics.checkNotNullExpressionValue(pi2NavigationBar2, "navigationBar");
                TextView textView = hVar.i;
                Intrinsics.checkNotNullExpressionValue(textView, Title.type);
                TextView textView2 = hVar.b;
                Intrinsics.checkNotNullExpressionValue(textView2, "body");
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = hVar.j;
                Intrinsics.checkNotNullExpressionValue(buttonWithLoadingIndicator, "usePhotoButton");
                Button button = hVar.c;
                Intrinsics.checkNotNullExpressionValue(button, "chooseNewPhotoButton");
                reviewSelectedImageView.c(styles, scrollViewA3, pi2NavigationBar2, textView, textView2, buttonWithLoadingIndicator, button, viewEnvironment);
            }
        }

        public static final void g(ReviewSelectedImageView reviewSelectedImageView, View view) {
            Intrinsics.checkNotNullParameter(reviewSelectedImageView, "this$0");
            reviewSelectedImageView.q().invoke();
        }

        public static final void j(ReviewSelectedImageView reviewSelectedImageView, View view) {
            Intrinsics.checkNotNullParameter(reviewSelectedImageView, "this$0");
            reviewSelectedImageView.o().invoke();
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<ReviewSelectedImageView> invoke(@NotNull final z8.h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "binding");
            ScrollView scrollViewA = hVar.a();
            Intrinsics.checkNotNullExpressionValue(scrollViewA, "getRoot(...)");
            C0601d.c(scrollViewA, false, false, false, false, 15, null);
            final ReviewSelectedImageView reviewSelectedImageView = ReviewSelectedImageView.this;
            return new com.squareup.workflow1.ui.j() {
                @Override
                public final void a(Object obj, ViewEnvironment viewEnvironment) throws P9.m {
                    ReviewSelectedImageView.b.f(hVar, reviewSelectedImageView, (ReviewSelectedImageView) obj, viewEnvironment);
                }
            };
        }
    }

    public ReviewSelectedImageView(@NotNull InterfaceC0883h interfaceC0883h, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, String str8, @NotNull Function0<Unit> function05, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC0883h, "imageLoader");
        Intrinsics.checkNotNullParameter(str, Title.type);
        Intrinsics.checkNotNullParameter(str2, "body");
        Intrinsics.checkNotNullParameter(str3, "confirmButtonText");
        Intrinsics.checkNotNullParameter(str4, "chooseNewPhotoText");
        Intrinsics.checkNotNullParameter(str5, "fileToReviewPath");
        Intrinsics.checkNotNullParameter(str6, "fileMimeType");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function0, "onUsePhotoClick");
        Intrinsics.checkNotNullParameter(function02, "onChooseNewPhotoClick");
        Intrinsics.checkNotNullParameter(function03, "onBack");
        Intrinsics.checkNotNullParameter(function04, "onCancel");
        Intrinsics.checkNotNullParameter(function05, "onErrorDismissed");
        this.imageLoader = interfaceC0883h;
        this.title = str;
        this.body = str2;
        this.confirmButtonText = str3;
        this.chooseNewPhotoText = str4;
        this.fileToReviewPath = str5;
        this.fileMimeType = str6;
        this.fileName = str7;
        this.navigationState = navigationState;
        this.onUsePhotoClick = function0;
        this.onChooseNewPhotoClick = function02;
        this.onBack = function03;
        this.onCancel = function04;
        this.error = str8;
        this.onErrorDismissed = function05;
        this.styles = governmentIdStepStyle;
        this.isAutoClassifying = z;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new com.squareup.workflow1.ui.x(kotlin.jvm.internal.z.b(ReviewSelectedImageView.class), a.d, new b());
    }

    public final void c(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, ButtonWithLoadingIndicator usePhotoButton, Button chooseNewPhotoButton, ViewEnvironment viewEnvironment) throws P9.m {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            C0596c.a(viewEnvironment, iIntValue);
        }
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableBackgroundImageDrawable = styles.backgroundImageDrawable(context);
        if (drawableBackgroundImageDrawable != null) {
            root.setBackground(drawableBackgroundImageDrawable);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            s9.v.e(title, titleStyleValue);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            s9.v.e(body, textStyleValue);
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            s9.d.d(usePhotoButton, buttonPrimaryStyleValue);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            s9.d.f(chooseNewPhotoButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
    }

    @Override
    @NotNull
    public com.squareup.workflow1.ui.A<ReviewSelectedImageView> a() {
        return this.viewFactory;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getChooseNewPhotoText() {
        return this.chooseNewPhotoText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewSelectedImageView)) {
            return false;
        }
        ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) other;
        return Intrinsics.b(this.imageLoader, reviewSelectedImageView.imageLoader) && Intrinsics.b(this.title, reviewSelectedImageView.title) && Intrinsics.b(this.body, reviewSelectedImageView.body) && Intrinsics.b(this.confirmButtonText, reviewSelectedImageView.confirmButtonText) && Intrinsics.b(this.chooseNewPhotoText, reviewSelectedImageView.chooseNewPhotoText) && Intrinsics.b(this.fileToReviewPath, reviewSelectedImageView.fileToReviewPath) && Intrinsics.b(this.fileMimeType, reviewSelectedImageView.fileMimeType) && Intrinsics.b(this.fileName, reviewSelectedImageView.fileName) && Intrinsics.b(this.navigationState, reviewSelectedImageView.navigationState) && Intrinsics.b(this.onUsePhotoClick, reviewSelectedImageView.onUsePhotoClick) && Intrinsics.b(this.onChooseNewPhotoClick, reviewSelectedImageView.onChooseNewPhotoClick) && Intrinsics.b(this.onBack, reviewSelectedImageView.onBack) && Intrinsics.b(this.onCancel, reviewSelectedImageView.onCancel) && Intrinsics.b(this.error, reviewSelectedImageView.error) && Intrinsics.b(this.onErrorDismissed, reviewSelectedImageView.onErrorDismissed) && Intrinsics.b(this.styles, reviewSelectedImageView.styles) && this.isAutoClassifying == reviewSelectedImageView.isAutoClassifying;
    }

    @NotNull
    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getFileMimeType() {
        return this.fileMimeType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.imageLoader.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.confirmButtonText.hashCode()) * 31) + this.chooseNewPhotoText.hashCode()) * 31) + this.fileToReviewPath.hashCode()) * 31) + this.fileMimeType.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onUsePhotoClick.hashCode()) * 31) + this.onChooseNewPhotoClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str2 = this.error;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        return ((iHashCode3 + (governmentIdStepStyle != null ? governmentIdStepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAutoClassifying);
    }

    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFileToReviewPath() {
        return this.fileToReviewPath;
    }

    @NotNull
    public final InterfaceC0883h getImageLoader() {
        return this.imageLoader;
    }

    @NotNull
    public final NavigationState getNavigationState() {
        return this.navigationState;
    }

    @NotNull
    public final Function0<Unit> m() {
        return this.onBack;
    }

    @NotNull
    public final Function0<Unit> n() {
        return this.onCancel;
    }

    @NotNull
    public final Function0<Unit> o() {
        return this.onChooseNewPhotoClick;
    }

    @NotNull
    public final Function0<Unit> p() {
        return this.onErrorDismissed;
    }

    @NotNull
    public final Function0<Unit> q() {
        return this.onUsePhotoClick;
    }

    public final StepStyles.GovernmentIdStepStyle getStyles() {
        return this.styles;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getIsAutoClassifying() {
        return this.isAutoClassifying;
    }

    @NotNull
    public String toString() {
        return "ReviewSelectedImageView(imageLoader=" + this.imageLoader + ", title=" + this.title + ", body=" + this.body + ", confirmButtonText=" + this.confirmButtonText + ", chooseNewPhotoText=" + this.chooseNewPhotoText + ", fileToReviewPath=" + this.fileToReviewPath + ", fileMimeType=" + this.fileMimeType + ", fileName=" + this.fileName + ", navigationState=" + this.navigationState + ", onUsePhotoClick=" + this.onUsePhotoClick + ", onChooseNewPhotoClick=" + this.onChooseNewPhotoClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", isAutoClassifying=" + this.isAutoClassifying + ")";
    }
}
