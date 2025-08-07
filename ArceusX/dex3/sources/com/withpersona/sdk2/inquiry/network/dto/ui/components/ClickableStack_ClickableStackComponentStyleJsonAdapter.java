package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ClickableStack_ClickableStackComponentStyleJsonAdapter extends h<ClickableStack.ClickableStackComponentStyle> {

    @NotNull
    private final h<AttributeStyles.ClickableStackAlignmentStyle> nullableClickableStackAlignmentStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackAxisStyle> nullableClickableStackAxisStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackBackgroundColorStyle> nullableClickableStackBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackBorderColorStyle> nullableClickableStackBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackBorderRadiusStyle> nullableClickableStackBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackBorderWidthStyle> nullableClickableStackBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackChildSizesStyle> nullableClickableStackChildSizesStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackGapStyle> nullableClickableStackGapStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackMarginStyle> nullableClickableStackMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackPaddingStyle> nullableClickableStackPaddingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ClickableStackWidthStyle> nullableClickableStackWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"backgroundColor", "borderWidth", "borderColor", "borderRadius", "padding", "margin", "axis", "childSizes", "alignment", "gap", "width"});

    public ClickableStack_ClickableStackComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableClickableStackBackgroundColorStyleAdapter = wVar.f(AttributeStyles.ClickableStackBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableClickableStackBorderWidthStyleAdapter = wVar.f(AttributeStyles.ClickableStackBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableClickableStackBorderColorStyleAdapter = wVar.f(AttributeStyles.ClickableStackBorderColorStyle.class, L.d(), "borderColor");
        this.nullableClickableStackBorderRadiusStyleAdapter = wVar.f(AttributeStyles.ClickableStackBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableClickableStackPaddingStyleAdapter = wVar.f(AttributeStyles.ClickableStackPaddingStyle.class, L.d(), "padding");
        this.nullableClickableStackMarginStyleAdapter = wVar.f(AttributeStyles.ClickableStackMarginStyle.class, L.d(), "margin");
        this.nullableClickableStackAxisStyleAdapter = wVar.f(AttributeStyles.ClickableStackAxisStyle.class, L.d(), "axis");
        this.nullableClickableStackChildSizesStyleAdapter = wVar.f(AttributeStyles.ClickableStackChildSizesStyle.class, L.d(), "childSizes");
        this.nullableClickableStackAlignmentStyleAdapter = wVar.f(AttributeStyles.ClickableStackAlignmentStyle.class, L.d(), "alignment");
        this.nullableClickableStackGapStyleAdapter = wVar.f(AttributeStyles.ClickableStackGapStyle.class, L.d(), "gap");
        this.nullableClickableStackWidthStyleAdapter = wVar.f(AttributeStyles.ClickableStackWidthStyle.class, L.d(), "width");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClickableStack.ClickableStackComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ClickableStack.ClickableStackComponentStyle m222fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = null;
        AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = null;
        AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = null;
        AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = null;
        AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = null;
        AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = null;
        AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = null;
        AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = null;
        AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = null;
        AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = null;
        AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    clickableStackBackgroundColorStyle = (AttributeStyles.ClickableStackBackgroundColorStyle) this.nullableClickableStackBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    clickableStackBorderWidthStyle = (AttributeStyles.ClickableStackBorderWidthStyle) this.nullableClickableStackBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    clickableStackBorderColorStyle = (AttributeStyles.ClickableStackBorderColorStyle) this.nullableClickableStackBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    clickableStackBorderRadiusStyle = (AttributeStyles.ClickableStackBorderRadiusStyle) this.nullableClickableStackBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    clickableStackPaddingStyle = (AttributeStyles.ClickableStackPaddingStyle) this.nullableClickableStackPaddingStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    clickableStackMarginStyle = (AttributeStyles.ClickableStackMarginStyle) this.nullableClickableStackMarginStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    clickableStackAxisStyle = (AttributeStyles.ClickableStackAxisStyle) this.nullableClickableStackAxisStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    clickableStackChildSizesStyle = (AttributeStyles.ClickableStackChildSizesStyle) this.nullableClickableStackChildSizesStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    clickableStackAlignmentStyle = (AttributeStyles.ClickableStackAlignmentStyle) this.nullableClickableStackAlignmentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    clickableStackGapStyle = (AttributeStyles.ClickableStackGapStyle) this.nullableClickableStackGapStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    clickableStackWidthStyle = (AttributeStyles.ClickableStackWidthStyle) this.nullableClickableStackWidthStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new ClickableStack.ClickableStackComponentStyle(clickableStackBackgroundColorStyle, clickableStackBorderWidthStyle, clickableStackBorderColorStyle, clickableStackBorderRadiusStyle, clickableStackPaddingStyle, clickableStackMarginStyle, clickableStackAxisStyle, clickableStackChildSizesStyle, clickableStackAlignmentStyle, clickableStackGapStyle, clickableStackWidthStyle);
    }

    public void toJson(@NotNull t tVar, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        if (clickableStackComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("backgroundColor");
        this.nullableClickableStackBackgroundColorStyleAdapter.toJson(tVar, clickableStackComponentStyle.getBackgroundColor());
        tVar.Z("borderWidth");
        this.nullableClickableStackBorderWidthStyleAdapter.toJson(tVar, clickableStackComponentStyle.getBorderWidth());
        tVar.Z("borderColor");
        this.nullableClickableStackBorderColorStyleAdapter.toJson(tVar, clickableStackComponentStyle.getBorderColor());
        tVar.Z("borderRadius");
        this.nullableClickableStackBorderRadiusStyleAdapter.toJson(tVar, clickableStackComponentStyle.getBorderRadius());
        tVar.Z("padding");
        this.nullableClickableStackPaddingStyleAdapter.toJson(tVar, clickableStackComponentStyle.getPadding());
        tVar.Z("margin");
        this.nullableClickableStackMarginStyleAdapter.toJson(tVar, clickableStackComponentStyle.getMargin());
        tVar.Z("axis");
        this.nullableClickableStackAxisStyleAdapter.toJson(tVar, clickableStackComponentStyle.getAxis());
        tVar.Z("childSizes");
        this.nullableClickableStackChildSizesStyleAdapter.toJson(tVar, clickableStackComponentStyle.getChildSizes());
        tVar.Z("alignment");
        this.nullableClickableStackAlignmentStyleAdapter.toJson(tVar, clickableStackComponentStyle.getAlignment());
        tVar.Z("gap");
        this.nullableClickableStackGapStyleAdapter.toJson(tVar, clickableStackComponentStyle.getGap());
        tVar.Z("width");
        this.nullableClickableStackWidthStyleAdapter.toJson(tVar, clickableStackComponentStyle.getWidth());
        tVar.y();
    }
}
