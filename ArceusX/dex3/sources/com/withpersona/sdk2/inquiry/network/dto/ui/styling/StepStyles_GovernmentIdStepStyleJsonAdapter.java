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

public final class StepStyles_GovernmentIdStepStyleJsonAdapter extends h<StepStyles.GovernmentIdStepStyle> {

    @NotNull
    private final h<StepStyles.CombinedStepAlignment> nullableCombinedStepAlignmentAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepBorderColor> nullableGovernmentIdStepBorderColorAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepBorderRadius> nullableGovernmentIdStepBorderRadiusAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepBorderWidth> nullableGovernmentIdStepBorderWidthAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepFillColor> nullableGovernmentIdStepFillColorAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepImageLocalStyle> nullableGovernmentIdStepImageLocalStyleAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepInputSelectStyle> nullableGovernmentIdStepInputSelectStyleAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepPrimaryButtonComponentStyle> nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepRowHeight> nullableGovernmentIdStepRowHeightAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepSecondaryButtonComponentStyle> nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepStrokeColor> nullableGovernmentIdStepStrokeColorAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepTextBasedComponentStyle> nullableGovernmentIdStepTextBasedComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepTitleComponentStyle> nullableGovernmentIdStepTitleComponentStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HeaderButtonColorStyle> nullableHeaderButtonColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundColorStyle> nullableStepBackgroundColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundImageStyle> nullableStepBackgroundImageStyleAdapter;

    @NotNull
    private final h<StepStyles.StepPaddingStyle> nullableStepPaddingStyleAdapter;

    @NotNull
    private final h<StepStyles.StepTextBasedComponentStyle> nullableStepTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "disclaimerStyle", "height", "strokeColor", "fillColor", "borderColor", "borderRadius", "borderWidth", "padding", "inputSelectStyle", "imageLocalStyle", "alignment"});

    public StepStyles_GovernmentIdStepStyleJsonAdapter(@NotNull w wVar) {
        this.nullableHeaderButtonColorStyleAdapter = wVar.f(AttributeStyles.HeaderButtonColorStyle.class, L.d(), "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = wVar.f(StepStyles.StepBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = wVar.f(StepStyles.StepBackgroundImageStyle.class, L.d(), "backgroundImage");
        this.nullableGovernmentIdStepTitleComponentStyleAdapter = wVar.f(StepStyles.GovernmentIdStepTitleComponentStyle.class, L.d(), "titleStyle");
        this.nullableGovernmentIdStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.GovernmentIdStepTextBasedComponentStyle.class, L.d(), "textStyle");
        this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter = wVar.f(StepStyles.GovernmentIdStepPrimaryButtonComponentStyle.class, L.d(), "buttonPrimaryStyle");
        this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter = wVar.f(StepStyles.GovernmentIdStepSecondaryButtonComponentStyle.class, L.d(), "buttonSecondaryStyle");
        this.nullableStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.StepTextBasedComponentStyle.class, L.d(), "disclaimerStyle");
        this.nullableGovernmentIdStepRowHeightAdapter = wVar.f(StepStyles.GovernmentIdStepRowHeight.class, L.d(), "height");
        this.nullableGovernmentIdStepStrokeColorAdapter = wVar.f(StepStyles.GovernmentIdStepStrokeColor.class, L.d(), "strokeColor");
        this.nullableGovernmentIdStepFillColorAdapter = wVar.f(StepStyles.GovernmentIdStepFillColor.class, L.d(), "fillColor");
        this.nullableGovernmentIdStepBorderColorAdapter = wVar.f(StepStyles.GovernmentIdStepBorderColor.class, L.d(), "borderColor");
        this.nullableGovernmentIdStepBorderRadiusAdapter = wVar.f(StepStyles.GovernmentIdStepBorderRadius.class, L.d(), "borderRadius");
        this.nullableGovernmentIdStepBorderWidthAdapter = wVar.f(StepStyles.GovernmentIdStepBorderWidth.class, L.d(), "borderWidth");
        this.nullableStepPaddingStyleAdapter = wVar.f(StepStyles.StepPaddingStyle.class, L.d(), "padding");
        this.nullableGovernmentIdStepInputSelectStyleAdapter = wVar.f(StepStyles.GovernmentIdStepInputSelectStyle.class, L.d(), "inputSelectStyle");
        this.nullableGovernmentIdStepImageLocalStyleAdapter = wVar.f(StepStyles.GovernmentIdStepImageLocalStyle.class, L.d(), "imageLocalStyle");
        this.nullableCombinedStepAlignmentAdapter = wVar.f(StepStyles.CombinedStepAlignment.class, L.d(), "alignment");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.GovernmentIdStepStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.GovernmentIdStepStyle m471fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = null;
        StepStyles.GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = null;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = null;
        StepStyles.GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.GovernmentIdStepRowHeight governmentIdStepRowHeight = null;
        StepStyles.GovernmentIdStepStrokeColor governmentIdStepStrokeColor = null;
        StepStyles.GovernmentIdStepFillColor governmentIdStepFillColor = null;
        StepStyles.GovernmentIdStepBorderColor governmentIdStepBorderColor = null;
        StepStyles.GovernmentIdStepBorderRadius governmentIdStepBorderRadius = null;
        StepStyles.GovernmentIdStepBorderWidth governmentIdStepBorderWidth = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
        StepStyles.GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = null;
        StepStyles.GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle = null;
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
                    governmentIdStepTitleComponentStyle = (StepStyles.GovernmentIdStepTitleComponentStyle) this.nullableGovernmentIdStepTitleComponentStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    governmentIdStepTextBasedComponentStyle = (StepStyles.GovernmentIdStepTextBasedComponentStyle) this.nullableGovernmentIdStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    governmentIdStepPrimaryButtonComponentStyle = (StepStyles.GovernmentIdStepPrimaryButtonComponentStyle) this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    governmentIdStepSecondaryButtonComponentStyle = (StepStyles.GovernmentIdStepSecondaryButtonComponentStyle) this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    governmentIdStepRowHeight = (StepStyles.GovernmentIdStepRowHeight) this.nullableGovernmentIdStepRowHeightAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    governmentIdStepStrokeColor = (StepStyles.GovernmentIdStepStrokeColor) this.nullableGovernmentIdStepStrokeColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    governmentIdStepFillColor = (StepStyles.GovernmentIdStepFillColor) this.nullableGovernmentIdStepFillColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    governmentIdStepBorderColor = (StepStyles.GovernmentIdStepBorderColor) this.nullableGovernmentIdStepBorderColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    governmentIdStepBorderRadius = (StepStyles.GovernmentIdStepBorderRadius) this.nullableGovernmentIdStepBorderRadiusAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    governmentIdStepBorderWidth = (StepStyles.GovernmentIdStepBorderWidth) this.nullableGovernmentIdStepBorderWidthAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    governmentIdStepInputSelectStyle = (StepStyles.GovernmentIdStepInputSelectStyle) this.nullableGovernmentIdStepInputSelectStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    governmentIdStepImageLocalStyle = (StepStyles.GovernmentIdStepImageLocalStyle) this.nullableGovernmentIdStepImageLocalStyleAdapter.fromJson(mVar);
                    break;
                case 17:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new StepStyles.GovernmentIdStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, governmentIdStepTitleComponentStyle, governmentIdStepTextBasedComponentStyle, governmentIdStepPrimaryButtonComponentStyle, governmentIdStepSecondaryButtonComponentStyle, stepTextBasedComponentStyle, governmentIdStepRowHeight, governmentIdStepStrokeColor, governmentIdStepFillColor, governmentIdStepBorderColor, governmentIdStepBorderRadius, governmentIdStepBorderWidth, stepPaddingStyle, governmentIdStepInputSelectStyle, governmentIdStepImageLocalStyle, combinedStepAlignment);
    }

    public void toJson(@NotNull t tVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle) {
        if (governmentIdStepStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("textColor");
        this.nullableHeaderButtonColorStyleAdapter.toJson(tVar, governmentIdStepStyle.getHeaderButtonColor());
        tVar.Z("backgroundColor");
        this.nullableStepBackgroundColorStyleAdapter.toJson(tVar, governmentIdStepStyle.getBackgroundColor());
        tVar.Z("backgroundImage");
        this.nullableStepBackgroundImageStyleAdapter.toJson(tVar, governmentIdStepStyle.getBackgroundImage());
        tVar.Z("titleStyle");
        this.nullableGovernmentIdStepTitleComponentStyleAdapter.toJson(tVar, governmentIdStepStyle.getTitleStyle());
        tVar.Z("textStyle");
        this.nullableGovernmentIdStepTextBasedComponentStyleAdapter.toJson(tVar, governmentIdStepStyle.getTextStyle());
        tVar.Z("buttonPrimaryStyle");
        this.nullableGovernmentIdStepPrimaryButtonComponentStyleAdapter.toJson(tVar, governmentIdStepStyle.getButtonPrimaryStyle());
        tVar.Z("buttonSecondaryStyle");
        this.nullableGovernmentIdStepSecondaryButtonComponentStyleAdapter.toJson(tVar, governmentIdStepStyle.getButtonSecondaryStyle());
        tVar.Z("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(tVar, governmentIdStepStyle.getDisclaimerStyle());
        tVar.Z("height");
        this.nullableGovernmentIdStepRowHeightAdapter.toJson(tVar, governmentIdStepStyle.getHeight());
        tVar.Z("strokeColor");
        this.nullableGovernmentIdStepStrokeColorAdapter.toJson(tVar, governmentIdStepStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableGovernmentIdStepFillColorAdapter.toJson(tVar, governmentIdStepStyle.getFillColor());
        tVar.Z("borderColor");
        this.nullableGovernmentIdStepBorderColorAdapter.toJson(tVar, governmentIdStepStyle.getBorderColor());
        tVar.Z("borderRadius");
        this.nullableGovernmentIdStepBorderRadiusAdapter.toJson(tVar, governmentIdStepStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableGovernmentIdStepBorderWidthAdapter.toJson(tVar, governmentIdStepStyle.getBorderWidth());
        tVar.Z("padding");
        this.nullableStepPaddingStyleAdapter.toJson(tVar, governmentIdStepStyle.getPadding());
        tVar.Z("inputSelectStyle");
        this.nullableGovernmentIdStepInputSelectStyleAdapter.toJson(tVar, governmentIdStepStyle.getInputSelectStyle());
        tVar.Z("imageLocalStyle");
        this.nullableGovernmentIdStepImageLocalStyleAdapter.toJson(tVar, governmentIdStepStyle.getImageLocalStyle());
        tVar.Z("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(tVar, governmentIdStepStyle.getAlignment());
        tVar.y();
    }
}
