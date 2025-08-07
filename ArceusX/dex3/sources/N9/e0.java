package n9;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/widget/ImageView;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;Ln9/s0;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e0 {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final QRCodeComponent d;
        final ImageView e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class C0255a {
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

        a(QRCodeComponent qRCodeComponent, ImageView imageView) {
            super(0);
            this.d = qRCodeComponent;
            this.e = imageView;
        }

        public Object invoke() throws P9.m {
            m668invoke();
            return Unit.a;
        }

        public final void m668invoke() throws P9.m {
            float f;
            StyleElements.SizeSet margin = this.d.e().getMargin();
            if (margin != null) {
                u9.d.c(this.e, margin);
            }
            ImageView imageView = this.e;
            ConstraintLayout.b layoutParams = imageView.getLayoutParams();
            StyleElements.PositionType justification = this.d.e().getJustification();
            if (justification != null && (layoutParams instanceof ConstraintLayout.b)) {
                ((ViewGroup.LayoutParams) layoutParams).width = -2;
                ConstraintLayout.b bVar = layoutParams;
                int i = C0255a.a[justification.ordinal()];
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
    }

    public static final ImageView a(@NotNull QRCodeComponent qRCodeComponent, @NotNull s0 s0Var) {
        String value;
        Intrinsics.checkNotNullParameter(qRCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        QRCode.Attributes attributes = qRCodeComponent.e().getAttributes();
        if (attributes != null && (value = attributes.getValue()) != null) {
            int width = qRCodeComponent.e().getWidth();
            HashMap map = new HashMap();
            map.put(C5.b.MARGIN, 0);
            try {
                D5.b bVarA = new F5.a().a(value, C5.a.QR_CODE, width, width, map);
                Integer strokeColor = qRCodeComponent.e().getStrokeColor();
                int iIntValue = strokeColor != null ? strokeColor.intValue() : -16777216;
                Integer fillColor = qRCodeComponent.e().getFillColor();
                int iIntValue2 = fillColor != null ? fillColor.intValue() : -1;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                for (int i = 0; i < width; i++) {
                    for (int i2 = 0; i2 < width; i2++) {
                        bitmapCreateBitmap.setPixel(i, i2, bVarA.c(i, i2) ? iIntValue : iIntValue2);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
                ImageView imageView = new ImageView(s0Var.getContext());
                imageView.setImageBitmap(bitmapCreateBitmap);
                s0Var.d(new a(qRCodeComponent, imageView));
                return imageView;
            } catch (C5.c unused) {
            }
        }
        return null;
    }
}
