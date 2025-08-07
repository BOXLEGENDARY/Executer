package s9;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0476u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aE\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\b*\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aY\u0010\u0017\u001a\u00020\b*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "styles", "", "", "originalStrokeColors", "originalFillColors", "originalBackgroundColors", "", "c", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "b", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component", "e", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "newStrokeColor", "newFillColor", "newBackgroundColor", "f", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ThemeableLottieAnimationView d;
        final LocalImageComponentStyle e;
        final String[] i;
        final String[] v;
        final String[] w;

        b(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
            super(0);
            this.d = themeableLottieAnimationView;
            this.e = localImageComponentStyle;
            this.i = strArr;
            this.v = strArr2;
            this.w = strArr3;
        }

        public Object invoke() throws P9.m {
            m691invoke();
            return Unit.a;
        }

        public final void m691invoke() throws P9.m {
            e.d(this.d, this.e, this.i, this.v, this.w);
        }
    }

    public static final void b(@NotNull ImageView imageView, CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) throws P9.m {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (combinedStepImagePreviewComponentStyle != null && (marginValue = combinedStepImagePreviewComponentStyle.getMarginValue()) != null) {
            u9.d.c(imageView, marginValue);
        }
        u9.d.b(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getWidthValue() : null);
        u9.d.a(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getHeightValue() : null);
        ConstraintLayout.b layoutParams = imageView.getLayoutParams();
        if (combinedStepImagePreviewComponentStyle != null && (justify = combinedStepImagePreviewComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = layoutParams;
            int i = a.a[base2.ordinal()];
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 0.5f;
            } else {
                if (i != 3) {
                    throw new P9.m();
                }
                f = 1.0f;
            }
            bVar.z = f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void c(@NotNull ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, @NotNull String[] strArr, @NotNull String[] strArr2, @NotNull String[] strArr3) throws P9.m {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(strArr, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(strArr2, "originalFillColors");
        Intrinsics.checkNotNullParameter(strArr3, "originalBackgroundColors");
        if (themeableLottieAnimationView.isLaidOut()) {
            d(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3);
        } else {
            j9.o.b(themeableLottieAnimationView, new b(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3));
        }
    }

    public static final void d(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) throws P9.m {
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        f(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getStrokeColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null, strArr, strArr2, strArr3);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            u9.d.c(themeableLottieAnimationView, marginValue);
        }
        u9.d.b(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        u9.d.a(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ConstraintLayout.b layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = layoutParams;
            int i = a.a[base2.ordinal()];
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 0.5f;
            } else {
                if (i != 3) {
                    throw new P9.m();
                }
                f = 1.0f;
            }
            bVar.z = f;
        }
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    public static final void e(@NotNull ImageView imageView, @NotNull RemoteImage remoteImage) throws P9.m {
        Unit unit;
        float f;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(remoteImage, "component");
        StyleElements.SizeSet margin = remoteImage.getMargin();
        if (margin != null) {
            u9.d.c(imageView, margin);
        }
        u9.d.b(imageView, remoteImage.getWidth());
        u9.d.a(imageView, remoteImage.getHeight());
        ConstraintLayout.b layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = remoteImage.getJustification();
        if (justification != null) {
            if (layoutParams instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = layoutParams;
                int i = a.a[justification.ordinal()];
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 0.5f;
                } else {
                    if (i != 3) {
                        throw new P9.m();
                    }
                    f = 1.0f;
                }
                bVar.z = f;
            }
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar2 = layoutParams;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bVar2.z = C0476u.b(context, S8.a.b, null, false, false, 14, null) ? 0.5f : 0.0f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void f(@NotNull ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, @NotNull String[] strArr, @NotNull String[] strArr2, @NotNull String[] strArr3) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(strArr, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(strArr2, "originalFillColors");
        Intrinsics.checkNotNullParameter(strArr3, "originalBackgroundColors");
        if (num != null) {
            int iIntValue = num.intValue();
            for (String str : strArr) {
                themeableLottieAnimationView.C(Color.parseColor(str), iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            for (String str2 : strArr2) {
                themeableLottieAnimationView.C(Color.parseColor(str2), iIntValue2);
            }
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (String str3 : strArr3) {
                themeableLottieAnimationView.C(Color.parseColor(str3), iIntValue3);
            }
        }
    }
}
