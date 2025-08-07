package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_UiStepStyleJsonAdapter extends h<StepStyles.UiStepStyle> {

    @NotNull
    private final h<AttributeStyles.HeaderButtonColorStyle> nullableHeaderButtonColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundColorStyle> nullableStepBackgroundColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundImageStyle> nullableStepBackgroundImageStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBorderRadiusStyle> nullableStepBorderRadiusStyleAdapter;

    @NotNull
    private final h<StepStyles.StepPaddingStyle> nullableStepPaddingStyleAdapter;

    @NotNull
    private final h<StepStyles.StepPrimaryButtonComponentStyle> nullableStepPrimaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.StepSecondaryButtonComponentStyle> nullableStepSecondaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.UiStepAlignment> nullableUiStepAlignmentAdapter;

    @NotNull
    private final h<StepStyles.UiStepFillColor> nullableUiStepFillColorAdapter;

    @NotNull
    private final h<StepStyles.UiStepStrokeColor> nullableUiStepStrokeColorAdapter;

    @NotNull
    private final h<StepStyles.UiStepTextBasedComponentStyle> nullableUiStepTextBasedComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.UiStepTitleComponentStyle> nullableUiStepTitleComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "strokeColor", "fillColor", "alignment", "padding", "borderRadius"});

    public StepStyles_UiStepStyleJsonAdapter(@NotNull w wVar) {
        this.nullableHeaderButtonColorStyleAdapter = wVar.f(AttributeStyles.HeaderButtonColorStyle.class, L.d(), "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = wVar.f(StepStyles.StepBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = wVar.f(StepStyles.StepBackgroundImageStyle.class, L.d(), "backgroundImage");
        this.nullableUiStepTitleComponentStyleAdapter = wVar.f(StepStyles.UiStepTitleComponentStyle.class, L.d(), "titleStyle");
        this.nullableUiStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.UiStepTextBasedComponentStyle.class, L.d(), "textStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepPrimaryButtonComponentStyle.class, L.d(), "buttonPrimaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepSecondaryButtonComponentStyle.class, L.d(), "buttonSecondaryStyle");
        this.nullableUiStepStrokeColorAdapter = wVar.f(StepStyles.UiStepStrokeColor.class, L.d(), "strokeColor");
        this.nullableUiStepFillColorAdapter = wVar.f(StepStyles.UiStepFillColor.class, L.d(), "fillColor");
        this.nullableUiStepAlignmentAdapter = wVar.f(StepStyles.UiStepAlignment.class, L.d(), "alignment");
        this.nullableStepPaddingStyleAdapter = wVar.f(StepStyles.StepPaddingStyle.class, L.d(), "padding");
        this.nullableStepBorderRadiusStyleAdapter = wVar.f(StepStyles.StepBorderRadiusStyle.class, L.d(), "borderRadius");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.UiStepStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.UiStepStyle m500fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.UiStepTitleComponentStyle uiStepTitleComponentStyle = null;
        StepStyles.UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = null;
        StepStyles.StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = null;
        StepStyles.StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = null;
        StepStyles.UiStepStrokeColor uiStepStrokeColor = null;
        StepStyles.UiStepFillColor uiStepFillColor = null;
        StepStyles.UiStepAlignment uiStepAlignment = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.StepBorderRadiusStyle stepBorderRadiusStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    headerButtonColorStyle = (AttributeStyles.HeaderButtonColorStyle) this.nullableHeaderButtonColorStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    stepBackgroundColorStyle = (StepStyles.StepBackgroundColorStyle) this.nullableStepBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    stepBackgroundImageStyle = (StepStyles.StepBackgroundImageStyle) this.nullableStepBackgroundImageStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    uiStepTitleComponentStyle = (StepStyles.UiStepTitleComponentStyle) this.nullableUiStepTitleComponentStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    uiStepTextBasedComponentStyle = (StepStyles.UiStepTextBasedComponentStyle) this.nullableUiStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    stepPrimaryButtonComponentStyle = (StepStyles.StepPrimaryButtonComponentStyle) this.nullableStepPrimaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    stepSecondaryButtonComponentStyle = (StepStyles.StepSecondaryButtonComponentStyle) this.nullableStepSecondaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    uiStepStrokeColor = (StepStyles.UiStepStrokeColor) this.nullableUiStepStrokeColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    uiStepFillColor = (StepStyles.UiStepFillColor) this.nullableUiStepFillColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    uiStepAlignment = (StepStyles.UiStepAlignment) this.nullableUiStepAlignmentAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    stepBorderRadiusStyle = (StepStyles.StepBorderRadiusStyle) this.nullableStepBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new StepStyles.UiStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, uiStepTitleComponentStyle, uiStepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, uiStepStrokeColor, uiStepFillColor, uiStepAlignment, stepPaddingStyle, stepBorderRadiusStyle);
    }

    public void toJson(@NotNull t tVar, StepStyles.UiStepStyle uiStepStyle) {
        if (uiStepStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("textColor");
        this.nullableHeaderButtonColorStyleAdapter.toJson(tVar, uiStepStyle.getHeaderButtonColor());
        tVar.Z("backgroundColor");
        this.nullableStepBackgroundColorStyleAdapter.toJson(tVar, uiStepStyle.getBackgroundColor());
        tVar.Z("backgroundImage");
        this.nullableStepBackgroundImageStyleAdapter.toJson(tVar, uiStepStyle.getBackgroundImage());
        tVar.Z("titleStyle");
        this.nullableUiStepTitleComponentStyleAdapter.toJson(tVar, uiStepStyle.getTitleStyle());
        tVar.Z("textStyle");
        this.nullableUiStepTextBasedComponentStyleAdapter.toJson(tVar, uiStepStyle.getTextStyle());
        tVar.Z("buttonPrimaryStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter.toJson(tVar, uiStepStyle.getButtonPrimaryStyle());
        tVar.Z("buttonSecondaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter.toJson(tVar, uiStepStyle.getButtonSecondaryStyle());
        tVar.Z("strokeColor");
        this.nullableUiStepStrokeColorAdapter.toJson(tVar, uiStepStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableUiStepFillColorAdapter.toJson(tVar, uiStepStyle.getFillColor());
        tVar.Z("alignment");
        this.nullableUiStepAlignmentAdapter.toJson(tVar, uiStepStyle.getAlignment());
        tVar.Z("padding");
        this.nullableStepPaddingStyleAdapter.toJson(tVar, uiStepStyle.getPadding());
        tVar.Z("borderRadius");
        this.nullableStepBorderRadiusStyleAdapter.toJson(tVar, uiStepStyle.getBorderRadius());
        tVar.y();
    }
}
