package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class HorizontalStack_HorizontalStackComponentStyleJsonAdapter extends h<HorizontalStack.HorizontalStackComponentStyle> {

    @NotNull
    private final h<AttributeStyles.HorizontalStackAlignmentStyle> nullableHorizontalStackAlignmentStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackAxisStyle> nullableHorizontalStackAxisStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackBackgroundColorStyle> nullableHorizontalStackBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackBorderColorStyle> nullableHorizontalStackBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackBorderRadiusStyle> nullableHorizontalStackBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackBorderWidthStyle> nullableHorizontalStackBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackChildSizesStyle> nullableHorizontalStackChildSizesStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackGapStyle> nullableHorizontalStackGapStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackMarginStyle> nullableHorizontalStackMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackPaddingStyle> nullableHorizontalStackPaddingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HorizontalStackWidthStyle> nullableHorizontalStackWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"backgroundColor", "borderWidth", "borderColor", "borderRadius", "padding", "margin", "axis", "childSizes", "alignment", "gap", "width"});

    public HorizontalStack_HorizontalStackComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableHorizontalStackBackgroundColorStyleAdapter = wVar.f(AttributeStyles.HorizontalStackBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableHorizontalStackBorderWidthStyleAdapter = wVar.f(AttributeStyles.HorizontalStackBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableHorizontalStackBorderColorStyleAdapter = wVar.f(AttributeStyles.HorizontalStackBorderColorStyle.class, L.d(), "borderColor");
        this.nullableHorizontalStackBorderRadiusStyleAdapter = wVar.f(AttributeStyles.HorizontalStackBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableHorizontalStackPaddingStyleAdapter = wVar.f(AttributeStyles.HorizontalStackPaddingStyle.class, L.d(), "padding");
        this.nullableHorizontalStackMarginStyleAdapter = wVar.f(AttributeStyles.HorizontalStackMarginStyle.class, L.d(), "margin");
        this.nullableHorizontalStackAxisStyleAdapter = wVar.f(AttributeStyles.HorizontalStackAxisStyle.class, L.d(), "axis");
        this.nullableHorizontalStackChildSizesStyleAdapter = wVar.f(AttributeStyles.HorizontalStackChildSizesStyle.class, L.d(), "childSizes");
        this.nullableHorizontalStackAlignmentStyleAdapter = wVar.f(AttributeStyles.HorizontalStackAlignmentStyle.class, L.d(), "alignment");
        this.nullableHorizontalStackGapStyleAdapter = wVar.f(AttributeStyles.HorizontalStackGapStyle.class, L.d(), "gap");
        this.nullableHorizontalStackWidthStyleAdapter = wVar.f(AttributeStyles.HorizontalStackWidthStyle.class, L.d(), "width");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HorizontalStack.HorizontalStackComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public HorizontalStack.HorizontalStackComponentStyle m246fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = null;
        AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = null;
        AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = null;
        AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = null;
        AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = null;
        AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = null;
        AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = null;
        AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = null;
        AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = null;
        AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = null;
        AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    horizontalStackBackgroundColorStyle = (AttributeStyles.HorizontalStackBackgroundColorStyle) this.nullableHorizontalStackBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    horizontalStackBorderWidthStyle = (AttributeStyles.HorizontalStackBorderWidthStyle) this.nullableHorizontalStackBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    horizontalStackBorderColorStyle = (AttributeStyles.HorizontalStackBorderColorStyle) this.nullableHorizontalStackBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    horizontalStackBorderRadiusStyle = (AttributeStyles.HorizontalStackBorderRadiusStyle) this.nullableHorizontalStackBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    horizontalStackPaddingStyle = (AttributeStyles.HorizontalStackPaddingStyle) this.nullableHorizontalStackPaddingStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    horizontalStackMarginStyle = (AttributeStyles.HorizontalStackMarginStyle) this.nullableHorizontalStackMarginStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    horizontalStackAxisStyle = (AttributeStyles.HorizontalStackAxisStyle) this.nullableHorizontalStackAxisStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    horizontalStackChildSizesStyle = (AttributeStyles.HorizontalStackChildSizesStyle) this.nullableHorizontalStackChildSizesStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    horizontalStackAlignmentStyle = (AttributeStyles.HorizontalStackAlignmentStyle) this.nullableHorizontalStackAlignmentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    horizontalStackGapStyle = (AttributeStyles.HorizontalStackGapStyle) this.nullableHorizontalStackGapStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    horizontalStackWidthStyle = (AttributeStyles.HorizontalStackWidthStyle) this.nullableHorizontalStackWidthStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new HorizontalStack.HorizontalStackComponentStyle(horizontalStackBackgroundColorStyle, horizontalStackBorderWidthStyle, horizontalStackBorderColorStyle, horizontalStackBorderRadiusStyle, horizontalStackPaddingStyle, horizontalStackMarginStyle, horizontalStackAxisStyle, horizontalStackChildSizesStyle, horizontalStackAlignmentStyle, horizontalStackGapStyle, horizontalStackWidthStyle);
    }

    public void toJson(@NotNull t tVar, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        if (horizontalStackComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("backgroundColor");
        this.nullableHorizontalStackBackgroundColorStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getBackgroundColor());
        tVar.Z("borderWidth");
        this.nullableHorizontalStackBorderWidthStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getBorderWidth());
        tVar.Z("borderColor");
        this.nullableHorizontalStackBorderColorStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getBorderColor());
        tVar.Z("borderRadius");
        this.nullableHorizontalStackBorderRadiusStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getBorderRadius());
        tVar.Z("padding");
        this.nullableHorizontalStackPaddingStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getPadding());
        tVar.Z("margin");
        this.nullableHorizontalStackMarginStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getMargin());
        tVar.Z("axis");
        this.nullableHorizontalStackAxisStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getAxis());
        tVar.Z("childSizes");
        this.nullableHorizontalStackChildSizesStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getChildSizes());
        tVar.Z("alignment");
        this.nullableHorizontalStackAlignmentStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getAlignment());
        tVar.Z("gap");
        this.nullableHorizontalStackGapStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getGap());
        tVar.Z("width");
        this.nullableHorizontalStackWidthStyleAdapter.toJson(tVar, horizontalStackComponentStyle.getWidth());
        tVar.y();
    }
}
