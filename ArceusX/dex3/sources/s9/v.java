package s9;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle;
import ha.C0458f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n9.t0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "styles", "", "e", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;)V", "", "fontName", "d", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeight", "b", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justification", "c", "(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[StyleElements.FontWeight.values().length];
            try {
                iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StyleElements.FontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
            int[] iArr2 = new int[StyleElements.PositionType.values().length];
            try {
                iArr2[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    private static final int a(StyleElements.FontWeight fontWeight) throws P9.m {
        int i = a.a[fontWeight.ordinal()];
        if (i == 1) {
            return 300;
        }
        if (i == 2) {
            return 400;
        }
        if (i == 3) {
            return 500;
        }
        if (i == 4) {
            return 700;
        }
        if (i == 5) {
            return 800;
        }
        throw new P9.m();
    }

    public static final void b(@NotNull TextView textView, @NotNull StyleElements.FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface typefaceCreate = Typeface.create(textView.getTypeface(), a(fontWeight), false);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(...)");
        textView.setTypeface(typefaceCreate);
    }

    public static final void c(@NotNull TextView textView, @NotNull StyleElements.PositionType positionType) throws P9.m {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(positionType, "justification");
        int gravity = textView.getGravity() & 112;
        int i = a.b[positionType.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 8388611;
        } else if (i != 2) {
            if (i != 3) {
                throw new P9.m();
            }
            i2 = 8388613;
        }
        textView.setGravity(i2);
        textView.setGravity((textView.getGravity() & (-113)) | gravity);
    }

    public static final void d(@NotNull TextView textView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(str, "fontName");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Typeface typefaceA = t0.a(context, str);
        if (typefaceA != null) {
            textView.setTypeface(typefaceA);
        }
    }

    public static final void e(@NotNull TextView textView, @NotNull TextViewStyle textViewStyle) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textViewStyle, "styles");
        StyleElements.SizeSet marginValue = textViewStyle.getMarginValue();
        if (marginValue != null) {
            u9.d.c(textView, marginValue);
        }
        Integer textColorValue = textViewStyle.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = textViewStyle.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = textViewStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            double dDoubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) dDoubleValue);
            if (androidx.core.widget.j.c(textView) == 1) {
                int iA = androidx.core.widget.j.a(textView);
                int iB = androidx.core.widget.j.b(textView);
                int iD = (int) C0458f.d(dDoubleValue);
                if (iA <= 0) {
                    iA = (int) C0458f.d(12.0d);
                }
                int i = iB > 0 ? iB : 1;
                if (iA > iD) {
                    iA = iD;
                }
                androidx.core.widget.j.j(textView, iA, iD, i, 0);
            }
            Double lineHeightValue = textViewStyle.getLineHeightValue();
            if (lineHeightValue != null) {
                double dDoubleValue2 = lineHeightValue.doubleValue();
                if (Build.VERSION.SDK_INT >= 28) {
                    textView.setLineSpacing((float) (C0458f.a(dDoubleValue2) - C0458f.a(dDoubleValue)), 1.0f);
                }
            }
        }
        Double letterSpacingValue = textViewStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / textView.getTextSize()));
        }
        String fontNameValue = textViewStyle.getFontNameValue();
        if (fontNameValue != null) {
            d(textView, fontNameValue);
        }
        StyleElements.FontWeight fontWeightValue = textViewStyle.getFontWeightValue();
        if (fontWeightValue != null && Build.VERSION.SDK_INT >= 29) {
            b(textView, fontWeightValue);
        }
        StyleElements.PositionType justificationValue = textViewStyle.getJustificationValue();
        if (justificationValue != null) {
            c(textView, justificationValue);
        }
    }
}
