package s9;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ha.C0458f;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "styles", "", "c", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "b", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V", "a", "d", "e", "f", "Landroid/graphics/drawable/LayerDrawable;", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)Landroid/graphics/drawable/LayerDrawable;", "Ls9/g;", "state", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;Ls9/g;)Landroid/graphics/drawable/LayerDrawable;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(@NotNull ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(g(clickableStackComponentStyle, g.e));
        }
    }

    public static final void b(@NotNull ConstraintLayout constraintLayout, @NotNull ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(clickableStackComponentStyle, "styles");
        e(constraintLayout, clickableStackComponentStyle);
        constraintLayout.setBackground(g(clickableStackComponentStyle, g.d));
        Double widthValue = clickableStackComponentStyle.getWidthValue();
        if (widthValue != null) {
            int iA = (int) C0458f.a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.s = -1;
            ((ViewGroup.MarginLayoutParams) bVar).width = iA;
            constraintLayout.setLayoutParams(bVar);
        }
    }

    public static final void c(@NotNull ConstraintLayout constraintLayout, @NotNull HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(horizontalStackComponentStyle, "styles");
        f(constraintLayout, horizontalStackComponentStyle);
        constraintLayout.setBackground(h(horizontalStackComponentStyle));
        Double widthValue = horizontalStackComponentStyle.getWidthValue();
        if (widthValue != null) {
            int iA = (int) C0458f.a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.s = -1;
            ((ViewGroup.MarginLayoutParams) bVar).width = iA;
            constraintLayout.setLayoutParams(bVar);
        }
    }

    public static final void d(@NotNull ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            e(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(g(clickableStackComponentStyle, g.i));
        }
    }

    private static final void e(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        StyleElements.SizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            u9.d.c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C0458f.a(dp4.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C0458f.a(dp3.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C0458f.a(dp2.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C0458f.a(dp.doubleValue()));
        }
    }

    private static final void f(ConstraintLayout constraintLayout, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        StyleElements.SizeSet marginValue = horizontalStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            u9.d.c(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = horizontalStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C0458f.a(dp4.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C0458f.a(dp3.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C0458f.a(dp2.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C0458f.a(dp.doubleValue()));
        }
    }

    private static final android.graphics.drawable.LayerDrawable g(com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack.ClickableStackComponentStyle r12, s9.g r13) throws P9.m {
        throw new UnsupportedOperationException("Method not decompiled: s9.h.g(com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack$ClickableStackComponentStyle, s9.g):android.graphics.drawable.LayerDrawable");
    }

    private static final LayerDrawable h(HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Object dp;
        Object dp2;
        Object dp3;
        Object dp4;
        Object obj;
        StyleElements.Size right;
        Double dp5;
        StyleElements.Size left;
        Double dp6;
        StyleElements.Size bottom;
        Double dp7;
        StyleElements.Size top;
        Double dp8;
        Double dp9;
        StyleElements.Size right2;
        StyleElements.Size left2;
        StyleElements.Size bottom2;
        StyleElements.Size top2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp = top2.getDp()) == null) {
            dp = obj;
        }
        StyleElements.SizeSet borderWidthValue2 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp2 = bottom2.getDp()) == null) {
            dp2 = obj;
        }
        StyleElements.SizeSet borderWidthValue3 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp3 = left2.getDp()) == null) {
            dp3 = obj;
        }
        StyleElements.SizeSet borderWidthValue4 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 == null || (right2 = borderWidthValue4.getRight()) == null || (dp4 = right2.getDp()) == null) {
            dp4 = obj;
        }
        Iterator it = CollectionsKt.m(new Object[]{dp, dp2, dp3, dp4}).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dCeil = Math.ceil(C0458f.a(((Number) next).doubleValue()));
                do {
                    Object next2 = it.next();
                    double dCeil2 = Math.ceil(C0458f.a(((Number) next2).doubleValue()));
                    if (Double.compare(dCeil, dCeil2) < 0) {
                        next = next2;
                        dCeil = dCeil2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        int iIntValue = ((Number) (obj != null ? obj : 0)).intValue();
        Integer baseBorderColorValue = horizontalStackComponentStyle.getBaseBorderColorValue();
        gradientDrawable.setStroke(iIntValue, baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0);
        StyleElements.Size borderRadiusValue = horizontalStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp9 = borderRadiusValue.getDp()) != null) {
            float fA = (float) C0458f.a(dp9.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        }
        Integer baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp8 = top.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C0458f.a(dp8.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp7 = bottom.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C0458f.a(dp7.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp6 = left.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C0458f.a(dp6.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp5 = right.getDp()) != null) {
            iIntValue -= (int) Math.ceil(C0458f.a(dp5.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue, -iCeil2);
        return layerDrawable;
    }
}
