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

public final class StepStyles_SelfieStepStyleJsonAdapter extends h<StepStyles.SelfieStepStyle> {

    @NotNull
    private final h<StepStyles.CombinedStepAlignment> nullableCombinedStepAlignmentAdapter;

    @NotNull
    private final h<AttributeStyles.HeaderButtonColorStyle> nullableHeaderButtonColorStyleAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepBorderColor> nullableSelfieStepBorderColorAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepBorderWidth> nullableSelfieStepBorderWidthAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepFillColor> nullableSelfieStepFillColorAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepImageLocalStyle> nullableSelfieStepImageLocalStyleAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepStrokeColor> nullableSelfieStepStrokeColorAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepTextBasedComponentStyle> nullableSelfieStepTextBasedComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepTitleComponentStyle> nullableSelfieStepTitleComponentStyleAdapter;

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
    private final h<StepStyles.StepTextBasedComponentStyle> nullableStepTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "disclaimerStyle", "strokeColor", "borderColor", "borderWidth", "fillColor", "imageLocalStyle", "padding", "borderRadius", "alignment"});

    public StepStyles_SelfieStepStyleJsonAdapter(@NotNull w wVar) {
        this.nullableHeaderButtonColorStyleAdapter = wVar.f(AttributeStyles.HeaderButtonColorStyle.class, L.d(), "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = wVar.f(StepStyles.StepBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = wVar.f(StepStyles.StepBackgroundImageStyle.class, L.d(), "backgroundImage");
        this.nullableSelfieStepTitleComponentStyleAdapter = wVar.f(StepStyles.SelfieStepTitleComponentStyle.class, L.d(), "titleStyle");
        this.nullableSelfieStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.SelfieStepTextBasedComponentStyle.class, L.d(), "textStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepPrimaryButtonComponentStyle.class, L.d(), "buttonPrimaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepSecondaryButtonComponentStyle.class, L.d(), "buttonSecondaryStyle");
        this.nullableStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.StepTextBasedComponentStyle.class, L.d(), "disclaimerStyle");
        this.nullableSelfieStepStrokeColorAdapter = wVar.f(StepStyles.SelfieStepStrokeColor.class, L.d(), "strokeColor");
        this.nullableSelfieStepBorderColorAdapter = wVar.f(StepStyles.SelfieStepBorderColor.class, L.d(), "borderColor");
        this.nullableSelfieStepBorderWidthAdapter = wVar.f(StepStyles.SelfieStepBorderWidth.class, L.d(), "borderWidth");
        this.nullableSelfieStepFillColorAdapter = wVar.f(StepStyles.SelfieStepFillColor.class, L.d(), "fillColor");
        this.nullableSelfieStepImageLocalStyleAdapter = wVar.f(StepStyles.SelfieStepImageLocalStyle.class, L.d(), "imageLocalStyle");
        this.nullableStepPaddingStyleAdapter = wVar.f(StepStyles.StepPaddingStyle.class, L.d(), "padding");
        this.nullableStepBorderRadiusStyleAdapter = wVar.f(StepStyles.StepBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableCombinedStepAlignmentAdapter = wVar.f(StepStyles.CombinedStepAlignment.class, L.d(), "alignment");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepStyle m481fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = null;
        StepStyles.SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = null;
        StepStyles.StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = null;
        StepStyles.StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.SelfieStepStrokeColor selfieStepStrokeColor = null;
        StepStyles.SelfieStepBorderColor selfieStepBorderColor = null;
        StepStyles.SelfieStepBorderWidth selfieStepBorderWidth = null;
        StepStyles.SelfieStepFillColor selfieStepFillColor = null;
        StepStyles.SelfieStepImageLocalStyle selfieStepImageLocalStyle = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.StepBorderRadiusStyle stepBorderRadiusStyle = null;
        StepStyles.CombinedStepAlignment combinedStepAlignment = null;
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
                    selfieStepTitleComponentStyle = (StepStyles.SelfieStepTitleComponentStyle) this.nullableSelfieStepTitleComponentStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    selfieStepTextBasedComponentStyle = (StepStyles.SelfieStepTextBasedComponentStyle) this.nullableSelfieStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    stepPrimaryButtonComponentStyle = (StepStyles.StepPrimaryButtonComponentStyle) this.nullableStepPrimaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    stepSecondaryButtonComponentStyle = (StepStyles.StepSecondaryButtonComponentStyle) this.nullableStepSecondaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    selfieStepStrokeColor = (StepStyles.SelfieStepStrokeColor) this.nullableSelfieStepStrokeColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    selfieStepBorderColor = (StepStyles.SelfieStepBorderColor) this.nullableSelfieStepBorderColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    selfieStepBorderWidth = (StepStyles.SelfieStepBorderWidth) this.nullableSelfieStepBorderWidthAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    selfieStepFillColor = (StepStyles.SelfieStepFillColor) this.nullableSelfieStepFillColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    selfieStepImageLocalStyle = (StepStyles.SelfieStepImageLocalStyle) this.nullableSelfieStepImageLocalStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    stepBorderRadiusStyle = (StepStyles.StepBorderRadiusStyle) this.nullableStepBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, selfieStepTitleComponentStyle, selfieStepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, stepTextBasedComponentStyle, selfieStepStrokeColor, selfieStepBorderColor, selfieStepBorderWidth, selfieStepFillColor, selfieStepImageLocalStyle, stepPaddingStyle, stepBorderRadiusStyle, combinedStepAlignment);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepStyle selfieStepStyle) {
        if (selfieStepStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("textColor");
        this.nullableHeaderButtonColorStyleAdapter.toJson(tVar, selfieStepStyle.getHeaderButtonColor());
        tVar.Z("backgroundColor");
        this.nullableStepBackgroundColorStyleAdapter.toJson(tVar, selfieStepStyle.getBackgroundColor());
        tVar.Z("backgroundImage");
        this.nullableStepBackgroundImageStyleAdapter.toJson(tVar, selfieStepStyle.getBackgroundImage());
        tVar.Z("titleStyle");
        this.nullableSelfieStepTitleComponentStyleAdapter.toJson(tVar, selfieStepStyle.getTitleStyle());
        tVar.Z("textStyle");
        this.nullableSelfieStepTextBasedComponentStyleAdapter.toJson(tVar, selfieStepStyle.getTextStyle());
        tVar.Z("buttonPrimaryStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter.toJson(tVar, selfieStepStyle.getButtonPrimaryStyle());
        tVar.Z("buttonSecondaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter.toJson(tVar, selfieStepStyle.getButtonSecondaryStyle());
        tVar.Z("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(tVar, selfieStepStyle.getDisclaimerStyle());
        tVar.Z("strokeColor");
        this.nullableSelfieStepStrokeColorAdapter.toJson(tVar, selfieStepStyle.getStrokeColor());
        tVar.Z("borderColor");
        this.nullableSelfieStepBorderColorAdapter.toJson(tVar, selfieStepStyle.getBorderColor());
        tVar.Z("borderWidth");
        this.nullableSelfieStepBorderWidthAdapter.toJson(tVar, selfieStepStyle.getBorderWidth());
        tVar.Z("fillColor");
        this.nullableSelfieStepFillColorAdapter.toJson(tVar, selfieStepStyle.getFillColor());
        tVar.Z("imageLocalStyle");
        this.nullableSelfieStepImageLocalStyleAdapter.toJson(tVar, selfieStepStyle.getImageLocalStyle());
        tVar.Z("padding");
        this.nullableStepPaddingStyleAdapter.toJson(tVar, selfieStepStyle.getPadding());
        tVar.Z("borderRadius");
        this.nullableStepBorderRadiusStyleAdapter.toJson(tVar, selfieStepStyle.getBorderRadius());
        tVar.Z("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(tVar, selfieStepStyle.getAlignment());
        tVar.y();
    }
}
