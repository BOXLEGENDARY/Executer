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

public final class StepStyles_DocumentStepStyleJsonAdapter extends h<StepStyles.DocumentStepStyle> {

    @NotNull
    private final h<StepStyles.CombinedStepAlignment> nullableCombinedStepAlignmentAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepBorderColor> nullableDocumentStepBorderColorAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepBorderRadius> nullableDocumentStepBorderRadiusAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepBorderWidth> nullableDocumentStepBorderWidthAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepFillColor> nullableDocumentStepFillColorAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepImageLocalStyle> nullableDocumentStepImageLocalStyleAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepStrokeColor> nullableDocumentStepStrokeColorAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepTextBasedComponentStyle> nullableDocumentStepTextBasedComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepTitleComponentStyle> nullableDocumentStepTitleComponentStyleAdapter;

    @NotNull
    private final h<AttributeStyles.HeaderButtonColorStyle> nullableHeaderButtonColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundColorStyle> nullableStepBackgroundColorStyleAdapter;

    @NotNull
    private final h<StepStyles.StepBackgroundImageStyle> nullableStepBackgroundImageStyleAdapter;

    @NotNull
    private final h<StepStyles.StepPaddingStyle> nullableStepPaddingStyleAdapter;

    @NotNull
    private final h<StepStyles.StepPrimaryButtonComponentStyle> nullableStepPrimaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.StepSecondaryButtonComponentStyle> nullableStepSecondaryButtonComponentStyleAdapter;

    @NotNull
    private final h<StepStyles.StepTextBasedComponentStyle> nullableStepTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"textColor", "backgroundColor", "backgroundImage", "titleStyle", "textStyle", "disclaimerStyle", "buttonPrimaryStyle", "buttonSecondaryStyle", "strokeColor", "fillColor", "borderColor", "borderRadius", "borderWidth", "imageLocalStyle", "padding", "alignment"});

    public StepStyles_DocumentStepStyleJsonAdapter(@NotNull w wVar) {
        this.nullableHeaderButtonColorStyleAdapter = wVar.f(AttributeStyles.HeaderButtonColorStyle.class, L.d(), "headerButtonColor");
        this.nullableStepBackgroundColorStyleAdapter = wVar.f(StepStyles.StepBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableStepBackgroundImageStyleAdapter = wVar.f(StepStyles.StepBackgroundImageStyle.class, L.d(), "backgroundImage");
        this.nullableDocumentStepTitleComponentStyleAdapter = wVar.f(StepStyles.DocumentStepTitleComponentStyle.class, L.d(), "titleStyle");
        this.nullableDocumentStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.DocumentStepTextBasedComponentStyle.class, L.d(), "textStyle");
        this.nullableStepTextBasedComponentStyleAdapter = wVar.f(StepStyles.StepTextBasedComponentStyle.class, L.d(), "disclaimerStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepPrimaryButtonComponentStyle.class, L.d(), "buttonPrimaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter = wVar.f(StepStyles.StepSecondaryButtonComponentStyle.class, L.d(), "buttonSecondaryStyle");
        this.nullableDocumentStepStrokeColorAdapter = wVar.f(StepStyles.DocumentStepStrokeColor.class, L.d(), "strokeColor");
        this.nullableDocumentStepFillColorAdapter = wVar.f(StepStyles.DocumentStepFillColor.class, L.d(), "fillColor");
        this.nullableDocumentStepBorderColorAdapter = wVar.f(StepStyles.DocumentStepBorderColor.class, L.d(), "borderColor");
        this.nullableDocumentStepBorderRadiusAdapter = wVar.f(StepStyles.DocumentStepBorderRadius.class, L.d(), "borderRadius");
        this.nullableDocumentStepBorderWidthAdapter = wVar.f(StepStyles.DocumentStepBorderWidth.class, L.d(), "borderWidth");
        this.nullableDocumentStepImageLocalStyleAdapter = wVar.f(StepStyles.DocumentStepImageLocalStyle.class, L.d(), "imageLocalStyle");
        this.nullableStepPaddingStyleAdapter = wVar.f(StepStyles.StepPaddingStyle.class, L.d(), "padding");
        this.nullableCombinedStepAlignmentAdapter = wVar.f(StepStyles.CombinedStepAlignment.class, L.d(), "alignment");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.DocumentStepStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.DocumentStepStyle m457fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = null;
        StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle = null;
        StepStyles.StepBackgroundImageStyle stepBackgroundImageStyle = null;
        StepStyles.DocumentStepTitleComponentStyle documentStepTitleComponentStyle = null;
        StepStyles.DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = null;
        StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle = null;
        StepStyles.StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = null;
        StepStyles.StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = null;
        StepStyles.DocumentStepStrokeColor documentStepStrokeColor = null;
        StepStyles.DocumentStepFillColor documentStepFillColor = null;
        StepStyles.DocumentStepBorderColor documentStepBorderColor = null;
        StepStyles.DocumentStepBorderRadius documentStepBorderRadius = null;
        StepStyles.DocumentStepBorderWidth documentStepBorderWidth = null;
        StepStyles.DocumentStepImageLocalStyle documentStepImageLocalStyle = null;
        StepStyles.StepPaddingStyle stepPaddingStyle = null;
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
                    documentStepTitleComponentStyle = (StepStyles.DocumentStepTitleComponentStyle) this.nullableDocumentStepTitleComponentStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    documentStepTextBasedComponentStyle = (StepStyles.DocumentStepTextBasedComponentStyle) this.nullableDocumentStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    stepTextBasedComponentStyle = (StepStyles.StepTextBasedComponentStyle) this.nullableStepTextBasedComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    stepPrimaryButtonComponentStyle = (StepStyles.StepPrimaryButtonComponentStyle) this.nullableStepPrimaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    stepSecondaryButtonComponentStyle = (StepStyles.StepSecondaryButtonComponentStyle) this.nullableStepSecondaryButtonComponentStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    documentStepStrokeColor = (StepStyles.DocumentStepStrokeColor) this.nullableDocumentStepStrokeColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    documentStepFillColor = (StepStyles.DocumentStepFillColor) this.nullableDocumentStepFillColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    documentStepBorderColor = (StepStyles.DocumentStepBorderColor) this.nullableDocumentStepBorderColorAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    documentStepBorderRadius = (StepStyles.DocumentStepBorderRadius) this.nullableDocumentStepBorderRadiusAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    documentStepBorderWidth = (StepStyles.DocumentStepBorderWidth) this.nullableDocumentStepBorderWidthAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    documentStepImageLocalStyle = (StepStyles.DocumentStepImageLocalStyle) this.nullableDocumentStepImageLocalStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    stepPaddingStyle = (StepStyles.StepPaddingStyle) this.nullableStepPaddingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    combinedStepAlignment = (StepStyles.CombinedStepAlignment) this.nullableCombinedStepAlignmentAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new StepStyles.DocumentStepStyle(headerButtonColorStyle, stepBackgroundColorStyle, stepBackgroundImageStyle, documentStepTitleComponentStyle, documentStepTextBasedComponentStyle, stepTextBasedComponentStyle, stepPrimaryButtonComponentStyle, stepSecondaryButtonComponentStyle, documentStepStrokeColor, documentStepFillColor, documentStepBorderColor, documentStepBorderRadius, documentStepBorderWidth, documentStepImageLocalStyle, stepPaddingStyle, combinedStepAlignment);
    }

    public void toJson(@NotNull t tVar, StepStyles.DocumentStepStyle documentStepStyle) {
        if (documentStepStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("textColor");
        this.nullableHeaderButtonColorStyleAdapter.toJson(tVar, documentStepStyle.getHeaderButtonColor());
        tVar.Z("backgroundColor");
        this.nullableStepBackgroundColorStyleAdapter.toJson(tVar, documentStepStyle.getBackgroundColor());
        tVar.Z("backgroundImage");
        this.nullableStepBackgroundImageStyleAdapter.toJson(tVar, documentStepStyle.getBackgroundImage());
        tVar.Z("titleStyle");
        this.nullableDocumentStepTitleComponentStyleAdapter.toJson(tVar, documentStepStyle.getTitleStyle());
        tVar.Z("textStyle");
        this.nullableDocumentStepTextBasedComponentStyleAdapter.toJson(tVar, documentStepStyle.getTextStyle());
        tVar.Z("disclaimerStyle");
        this.nullableStepTextBasedComponentStyleAdapter.toJson(tVar, documentStepStyle.getDisclaimerStyle());
        tVar.Z("buttonPrimaryStyle");
        this.nullableStepPrimaryButtonComponentStyleAdapter.toJson(tVar, documentStepStyle.getButtonPrimaryStyle());
        tVar.Z("buttonSecondaryStyle");
        this.nullableStepSecondaryButtonComponentStyleAdapter.toJson(tVar, documentStepStyle.getButtonSecondaryStyle());
        tVar.Z("strokeColor");
        this.nullableDocumentStepStrokeColorAdapter.toJson(tVar, documentStepStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableDocumentStepFillColorAdapter.toJson(tVar, documentStepStyle.getFillColor());
        tVar.Z("borderColor");
        this.nullableDocumentStepBorderColorAdapter.toJson(tVar, documentStepStyle.getBorderColor());
        tVar.Z("borderRadius");
        this.nullableDocumentStepBorderRadiusAdapter.toJson(tVar, documentStepStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableDocumentStepBorderWidthAdapter.toJson(tVar, documentStepStyle.getBorderWidth());
        tVar.Z("imageLocalStyle");
        this.nullableDocumentStepImageLocalStyleAdapter.toJson(tVar, documentStepStyle.getImageLocalStyle());
        tVar.Z("padding");
        this.nullableStepPaddingStyleAdapter.toJson(tVar, documentStepStyle.getPadding());
        tVar.Z("alignment");
        this.nullableCombinedStepAlignmentAdapter.toJson(tVar, documentStepStyle.getAlignment());
        tVar.y();
    }
}
