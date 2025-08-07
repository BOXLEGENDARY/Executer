package v8;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.InterfaceC0490b;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.j;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0446E;
import ha.C0588c;
import i9.C0596c;
import j9.C0601d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v8.ChooseCaptureMethodView;
import z8.C0891d;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B«\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010)\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b9\u0010,R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010,R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010,R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010GR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\b:\u0010,R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010.R\u0018\u0010]\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010\\R \u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lv8/j;", "Lcom/squareup/workflow1/ui/b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "captureOptions", "", Title.type, "body", "cameraText", "uploadButtonText", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onCameraCaptureClick", "onUploadClick", "onBack", "onCancel", "error", "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "pictographAsset", "", "localAsset", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;I)V", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Landroid/widget/Button;", "cameraButton", "uploadButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "idImage", "idImageContainer", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lcom/squareup/workflow1/ui/y;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "Ljava/lang/String;", "s", "i", "f", "v", "g", "w", "t", "y", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "k", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "z", "Lkotlin/jvm/functions/Function0;", "m", "()Lkotlin/jvm/functions/Function0;", "A", "p", "B", "l", "C", "n", "D", "E", "o", "F", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "r", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "G", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "H", "I", "j", "Landroid/view/View;", "currentPictographAssetView", "Lcom/squareup/workflow1/ui/A;", "J", "Lcom/squareup/workflow1/ui/A;", "a", "()Lcom/squareup/workflow1/ui/A;", "viewFactory", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ChooseCaptureMethodView implements InterfaceC0490b<ChooseCaptureMethodView> {

    @NotNull
    private final Function0<Unit> onUploadClick;

    @NotNull
    private final Function0<Unit> onBack;

    @NotNull
    private final Function0<Unit> onCancel;

    private final String error;

    @NotNull
    private final Function0<Unit> onErrorDismissed;

    private final StepStyles.GovernmentIdStepStyle styles;

    private final RemoteImage pictographAsset;

    private final int localAsset;

    private View currentPictographAssetView;

    @NotNull
    private final com.squareup.workflow1.ui.A<ChooseCaptureMethodView> viewFactory;

    @NotNull
    private final List<CaptureOptionNativeMobile> captureOptions;

    @NotNull
    private final String title;

    @NotNull
    private final String body;

    @NotNull
    private final String cameraText;

    @NotNull
    private final String uploadButtonText;

    @NotNull
    private final NavigationState navigationState;

    @NotNull
    private final Function0<Unit> onCameraCaptureClick;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements aa.n<LayoutInflater, ViewGroup, Boolean, C0891d> {
        public static final a d = new a();

        a() {
            super(3, C0891d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);
        }

        @NotNull
        public final C0891d f(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "p0");
            return C0891d.d(layoutInflater, viewGroup, z);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return f((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz8/d;", "binding", "Lcom/squareup/workflow1/ui/j;", "Lv8/j;", "e", "(Lz8/d;)Lcom/squareup/workflow1/ui/j;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function1<C0891d, com.squareup.workflow1.ui.j<ChooseCaptureMethodView>> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
            final ChooseCaptureMethodView d;

            a(ChooseCaptureMethodView chooseCaptureMethodView) {
                super(0);
                this.d = chooseCaptureMethodView;
            }

            public Object invoke() {
                m695invoke();
                return Unit.a;
            }

            public final void m695invoke() {
                this.d.l().invoke();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0290b extends kotlin.jvm.internal.l implements Function0<Unit> {
            final ChooseCaptureMethodView d;

            C0290b(ChooseCaptureMethodView chooseCaptureMethodView) {
                super(0);
                this.d = chooseCaptureMethodView;
            }

            public Object invoke() {
                m696invoke();
                return Unit.a;
            }

            public final void m696invoke() {
                this.d.n().invoke();
            }
        }

        b() {
            super(1);
        }

        public static final void f(C0891d c0891d, ChooseCaptureMethodView chooseCaptureMethodView, final ChooseCaptureMethodView chooseCaptureMethodView2, ViewEnvironment viewEnvironment) throws P9.m {
            Intrinsics.checkNotNullParameter(c0891d, "$binding");
            Intrinsics.checkNotNullParameter(chooseCaptureMethodView, "this$0");
            Intrinsics.checkNotNullParameter(chooseCaptureMethodView2, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Context context = c0891d.a().getContext();
            c0891d.i.setText(chooseCaptureMethodView2.getTitle());
            c0891d.b.setText(chooseCaptureMethodView2.getBody());
            if (chooseCaptureMethodView.h().contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
                if (StringsKt.Y(chooseCaptureMethodView.getCameraText())) {
                    c0891d.c.setText(null);
                    c0891d.c.setIcon(h.a.b(context, C0823D.c));
                } else {
                    c0891d.c.setText(chooseCaptureMethodView.getCameraText());
                    c0891d.c.setIcon((Drawable) null);
                }
                c0891d.c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChooseCaptureMethodView.b.g(chooseCaptureMethodView2, view);
                    }
                });
            }
            if (chooseCaptureMethodView.h().contains(CaptureOptionNativeMobile.UPLOAD)) {
                c0891d.j.setText(chooseCaptureMethodView2.getUploadButtonText());
                c0891d.j.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChooseCaptureMethodView.b.j(chooseCaptureMethodView2, view);
                    }
                });
            }
            NavigationState navigationState = chooseCaptureMethodView2.getNavigationState();
            a aVar = new a(chooseCaptureMethodView2);
            C0290b c0290b = new C0290b(chooseCaptureMethodView2);
            Pi2NavigationBar pi2NavigationBar = c0891d.h;
            Intrinsics.checkNotNullExpressionValue(pi2NavigationBar, "navigationBar");
            CoordinatorLayout coordinatorLayoutA = c0891d.a();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
            C0588c.a(navigationState, aVar, c0290b, pi2NavigationBar, coordinatorLayoutA);
            CoordinatorLayout coordinatorLayoutA2 = c0891d.a();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA2, "getRoot(...)");
            C0446E.b(coordinatorLayoutA2, chooseCaptureMethodView2.getError(), chooseCaptureMethodView2.o(), null, 0, 0, 56, null);
            if (chooseCaptureMethodView.getPictographAsset() == null) {
                c0891d.d.setAnimation(chooseCaptureMethodView.getLocalAsset());
            } else if (chooseCaptureMethodView.currentPictographAssetView == null) {
                RemoteImage pictographAsset = chooseCaptureMethodView.getPictographAsset();
                ConstraintLayout constraintLayout = c0891d.f;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "imageViewContainer");
                chooseCaptureMethodView.currentPictographAssetView = t9.a.b(pictographAsset, constraintLayout, false, 2, null);
                c0891d.g.setVisibility(8);
            }
            StepStyles.GovernmentIdStepStyle styles = chooseCaptureMethodView.getStyles();
            if (styles != null) {
                CoordinatorLayout coordinatorLayoutA3 = c0891d.a();
                Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA3, "getRoot(...)");
                Pi2NavigationBar pi2NavigationBar2 = c0891d.h;
                Intrinsics.checkNotNullExpressionValue(pi2NavigationBar2, "navigationBar");
                TextView textView = c0891d.i;
                Intrinsics.checkNotNullExpressionValue(textView, Title.type);
                TextView textView2 = c0891d.b;
                Intrinsics.checkNotNullExpressionValue(textView2, "body");
                MaterialButton materialButton = c0891d.c;
                Intrinsics.checkNotNullExpressionValue(materialButton, "cameraButton");
                Button button = c0891d.j;
                Intrinsics.checkNotNullExpressionValue(button, "uploadButton");
                ThemeableLottieAnimationView themeableLottieAnimationView = c0891d.d;
                Intrinsics.checkNotNullExpressionValue(themeableLottieAnimationView, "idImage");
                View view = c0891d.e;
                Intrinsics.checkNotNullExpressionValue(view, "idImageContainer");
                chooseCaptureMethodView.e(styles, coordinatorLayoutA3, pi2NavigationBar2, textView, textView2, materialButton, button, themeableLottieAnimationView, view, viewEnvironment);
            }
        }

        public static final void g(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
            Intrinsics.checkNotNullParameter(chooseCaptureMethodView, "$rendering");
            chooseCaptureMethodView.m().invoke();
        }

        public static final void j(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
            Intrinsics.checkNotNullParameter(chooseCaptureMethodView, "$rendering");
            chooseCaptureMethodView.p().invoke();
        }

        @NotNull
        public final com.squareup.workflow1.ui.j<ChooseCaptureMethodView> invoke(@NotNull final C0891d c0891d) {
            Intrinsics.checkNotNullParameter(c0891d, "binding");
            CoordinatorLayout coordinatorLayoutA = c0891d.a();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutA, "getRoot(...)");
            C0601d.c(coordinatorLayoutA, false, false, false, false, 15, null);
            final ChooseCaptureMethodView chooseCaptureMethodView = ChooseCaptureMethodView.this;
            return new com.squareup.workflow1.ui.j() {
                @Override
                public final void a(Object obj, ViewEnvironment viewEnvironment) throws P9.m {
                    ChooseCaptureMethodView.b.f(c0891d, chooseCaptureMethodView, (ChooseCaptureMethodView) obj, viewEnvironment);
                }
            };
        }
    }

    public ChooseCaptureMethodView(@NotNull List<? extends CaptureOptionNativeMobile> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull NavigationState navigationState, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, String str5, @NotNull Function0<Unit> function05, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i) {
        Intrinsics.checkNotNullParameter(list, "captureOptions");
        Intrinsics.checkNotNullParameter(str, Title.type);
        Intrinsics.checkNotNullParameter(str2, "body");
        Intrinsics.checkNotNullParameter(str3, "cameraText");
        Intrinsics.checkNotNullParameter(str4, "uploadButtonText");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(function0, "onCameraCaptureClick");
        Intrinsics.checkNotNullParameter(function02, "onUploadClick");
        Intrinsics.checkNotNullParameter(function03, "onBack");
        Intrinsics.checkNotNullParameter(function04, "onCancel");
        Intrinsics.checkNotNullParameter(function05, "onErrorDismissed");
        this.captureOptions = list;
        this.title = str;
        this.body = str2;
        this.cameraText = str3;
        this.uploadButtonText = str4;
        this.navigationState = navigationState;
        this.onCameraCaptureClick = function0;
        this.onUploadClick = function02;
        this.onBack = function03;
        this.onCancel = function04;
        this.error = str5;
        this.onErrorDismissed = function05;
        this.styles = governmentIdStepStyle;
        this.pictographAsset = remoteImage;
        this.localAsset = i;
        j.Companion companion = com.squareup.workflow1.ui.j.INSTANCE;
        this.viewFactory = new com.squareup.workflow1.ui.x(kotlin.jvm.internal.z.b(ChooseCaptureMethodView.class), a.d, new b());
    }

    public final void e(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, Button cameraButton, Button uploadButton, ThemeableLottieAnimationView idImage, View idImageContainer, ViewEnvironment viewEnvironment) throws P9.m {
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
            s9.d.f(cameraButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            s9.d.f(uploadButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            idImageContainer.setBackground(new ColorDrawable(fillColorValue.intValue()));
        }
        s9.e.f(idImage, styles.getStrokeColorValue(), styles.getFillColorValue(), null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0]);
    }

    @Override
    @NotNull
    public com.squareup.workflow1.ui.A<ChooseCaptureMethodView> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseCaptureMethodView)) {
            return false;
        }
        ChooseCaptureMethodView chooseCaptureMethodView = (ChooseCaptureMethodView) other;
        return Intrinsics.b(this.captureOptions, chooseCaptureMethodView.captureOptions) && Intrinsics.b(this.title, chooseCaptureMethodView.title) && Intrinsics.b(this.body, chooseCaptureMethodView.body) && Intrinsics.b(this.cameraText, chooseCaptureMethodView.cameraText) && Intrinsics.b(this.uploadButtonText, chooseCaptureMethodView.uploadButtonText) && Intrinsics.b(this.navigationState, chooseCaptureMethodView.navigationState) && Intrinsics.b(this.onCameraCaptureClick, chooseCaptureMethodView.onCameraCaptureClick) && Intrinsics.b(this.onUploadClick, chooseCaptureMethodView.onUploadClick) && Intrinsics.b(this.onBack, chooseCaptureMethodView.onBack) && Intrinsics.b(this.onCancel, chooseCaptureMethodView.onCancel) && Intrinsics.b(this.error, chooseCaptureMethodView.error) && Intrinsics.b(this.onErrorDismissed, chooseCaptureMethodView.onErrorDismissed) && Intrinsics.b(this.styles, chooseCaptureMethodView.styles) && Intrinsics.b(this.pictographAsset, chooseCaptureMethodView.pictographAsset) && this.localAsset == chooseCaptureMethodView.localAsset;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getCameraText() {
        return this.cameraText;
    }

    @NotNull
    public final List<CaptureOptionNativeMobile> h() {
        return this.captureOptions;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.captureOptions.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.cameraText.hashCode()) * 31) + this.uploadButtonText.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.onCameraCaptureClick.hashCode()) * 31) + this.onUploadClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        RemoteImage remoteImage = this.pictographAsset;
        return ((iHashCode3 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31) + Integer.hashCode(this.localAsset);
    }

    public final String getError() {
        return this.error;
    }

    public final int getLocalAsset() {
        return this.localAsset;
    }

    @NotNull
    public final NavigationState getNavigationState() {
        return this.navigationState;
    }

    @NotNull
    public final Function0<Unit> l() {
        return this.onBack;
    }

    @NotNull
    public final Function0<Unit> m() {
        return this.onCameraCaptureClick;
    }

    @NotNull
    public final Function0<Unit> n() {
        return this.onCancel;
    }

    @NotNull
    public final Function0<Unit> o() {
        return this.onErrorDismissed;
    }

    @NotNull
    public final Function0<Unit> p() {
        return this.onUploadClick;
    }

    public final RemoteImage getPictographAsset() {
        return this.pictographAsset;
    }

    public final StepStyles.GovernmentIdStepStyle getStyles() {
        return this.styles;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUploadButtonText() {
        return this.uploadButtonText;
    }

    @NotNull
    public String toString() {
        return "ChooseCaptureMethodView(captureOptions=" + this.captureOptions + ", title=" + this.title + ", body=" + this.body + ", cameraText=" + this.cameraText + ", uploadButtonText=" + this.uploadButtonText + ", navigationState=" + this.navigationState + ", onCameraCaptureClick=" + this.onCameraCaptureClick + ", onUploadClick=" + this.onUploadClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", pictographAsset=" + this.pictographAsset + ", localAsset=" + this.localAsset + ")";
    }
}
