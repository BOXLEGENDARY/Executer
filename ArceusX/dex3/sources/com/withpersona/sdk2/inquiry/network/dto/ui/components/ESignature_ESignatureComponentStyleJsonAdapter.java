package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ESignature_ESignatureComponentStyleJsonAdapter extends h<ESignature.ESignatureComponentStyle> {

    @NotNull
    private final h<AttributeStyles.ComplexTextBasedFontFamilyStyle> nullableComplexTextBasedFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ComplexTextBasedFontSizeStyle> nullableComplexTextBasedFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ComplexTextBasedFontWeightStyle> nullableComplexTextBasedFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ComplexTextBasedLetterSpacingStyle> nullableComplexTextBasedLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ComplexTextBasedLineHeightStyle> nullableComplexTextBasedLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureBackgroundColorStyle> nullableESignatureBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureBorderColorStyle> nullableESignatureBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureBorderRadiusStyle> nullableESignatureBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureBorderWidthStyle> nullableESignatureBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureFillColorStyle> nullableESignatureFillColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignaturePrimaryButtonStyles> nullableESignaturePrimaryButtonStylesAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureSecondaryButtonStyles> nullableESignatureSecondaryButtonStylesAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureTextColorStyle> nullableESignatureTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureTextStylesContainer> nullableESignatureTextStylesContainerAdapter;

    @NotNull
    private final h<AttributeStyles.ESignatureTitleStylesContainer> nullableESignatureTitleStylesContainerAdapter;

    @NotNull
    private final h<AttributeStyles.InputMarginStyle> nullableInputMarginStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"buttonPrimaryStyle", "buttonSecondaryStyle", "titleStyle", "textStyle", "fillColor", "backgroundColor", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "borderColor", "margin"});

    public ESignature_ESignatureComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableESignaturePrimaryButtonStylesAdapter = wVar.f(AttributeStyles.ESignaturePrimaryButtonStyles.class, L.d(), "buttonPrimaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter = wVar.f(AttributeStyles.ESignatureSecondaryButtonStyles.class, L.d(), "buttonSecondaryStyle");
        this.nullableESignatureTitleStylesContainerAdapter = wVar.f(AttributeStyles.ESignatureTitleStylesContainer.class, L.d(), "titleStyle");
        this.nullableESignatureTextStylesContainerAdapter = wVar.f(AttributeStyles.ESignatureTextStylesContainer.class, L.d(), "textStyle");
        this.nullableESignatureFillColorStyleAdapter = wVar.f(AttributeStyles.ESignatureFillColorStyle.class, L.d(), "fillColor");
        this.nullableESignatureBackgroundColorStyleAdapter = wVar.f(AttributeStyles.ESignatureBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableESignatureTextColorStyleAdapter = wVar.f(AttributeStyles.ESignatureTextColorStyle.class, L.d(), "textColor");
        this.nullableESignatureBorderRadiusStyleAdapter = wVar.f(AttributeStyles.ESignatureBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableESignatureBorderWidthStyleAdapter = wVar.f(AttributeStyles.ESignatureBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableESignatureBorderColorStyleAdapter = wVar.f(AttributeStyles.ESignatureBorderColorStyle.class, L.d(), "borderColor");
        this.nullableInputMarginStyleAdapter = wVar.f(AttributeStyles.InputMarginStyle.class, L.d(), "margin");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ESignature.ESignatureComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ESignature.ESignatureComponentStyle m236fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = null;
        AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = null;
        AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = null;
        AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = null;
        AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = null;
        AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = null;
        AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = null;
        AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = null;
        AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    eSignaturePrimaryButtonStyles = (AttributeStyles.ESignaturePrimaryButtonStyles) this.nullableESignaturePrimaryButtonStylesAdapter.fromJson(mVar);
                    break;
                case 1:
                    eSignatureSecondaryButtonStyles = (AttributeStyles.ESignatureSecondaryButtonStyles) this.nullableESignatureSecondaryButtonStylesAdapter.fromJson(mVar);
                    break;
                case 2:
                    eSignatureTitleStylesContainer = (AttributeStyles.ESignatureTitleStylesContainer) this.nullableESignatureTitleStylesContainerAdapter.fromJson(mVar);
                    break;
                case 3:
                    eSignatureTextStylesContainer = (AttributeStyles.ESignatureTextStylesContainer) this.nullableESignatureTextStylesContainerAdapter.fromJson(mVar);
                    break;
                case 4:
                    eSignatureFillColorStyle = (AttributeStyles.ESignatureFillColorStyle) this.nullableESignatureFillColorStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    eSignatureBackgroundColorStyle = (AttributeStyles.ESignatureBackgroundColorStyle) this.nullableESignatureBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    eSignatureTextColorStyle = (AttributeStyles.ESignatureTextColorStyle) this.nullableESignatureTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    eSignatureBorderRadiusStyle = (AttributeStyles.ESignatureBorderRadiusStyle) this.nullableESignatureBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    eSignatureBorderWidthStyle = (AttributeStyles.ESignatureBorderWidthStyle) this.nullableESignatureBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    eSignatureBorderColorStyle = (AttributeStyles.ESignatureBorderColorStyle) this.nullableESignatureBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new ESignature.ESignatureComponentStyle(eSignaturePrimaryButtonStyles, eSignatureSecondaryButtonStyles, eSignatureTitleStylesContainer, eSignatureTextStylesContainer, eSignatureFillColorStyle, eSignatureBackgroundColorStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, eSignatureTextColorStyle, eSignatureBorderRadiusStyle, eSignatureBorderWidthStyle, eSignatureBorderColorStyle, inputMarginStyle);
    }

    public void toJson(@NotNull t tVar, ESignature.ESignatureComponentStyle eSignatureComponentStyle) {
        if (eSignatureComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("buttonPrimaryStyle");
        this.nullableESignaturePrimaryButtonStylesAdapter.toJson(tVar, eSignatureComponentStyle.getButtonPrimaryStyle());
        tVar.Z("buttonSecondaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter.toJson(tVar, eSignatureComponentStyle.getButtonSecondaryStyle());
        tVar.Z("titleStyle");
        this.nullableESignatureTitleStylesContainerAdapter.toJson(tVar, eSignatureComponentStyle.getTitleStyle());
        tVar.Z("textStyle");
        this.nullableESignatureTextStylesContainerAdapter.toJson(tVar, eSignatureComponentStyle.getTextStyle());
        tVar.Z("fillColor");
        this.nullableESignatureFillColorStyleAdapter.toJson(tVar, eSignatureComponentStyle.getFillColor());
        tVar.Z("backgroundColor");
        this.nullableESignatureBackgroundColorStyleAdapter.toJson(tVar, eSignatureComponentStyle.getBackgroundColor());
        tVar.Z("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(tVar, eSignatureComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(tVar, eSignatureComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(tVar, eSignatureComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(tVar, eSignatureComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(tVar, eSignatureComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableESignatureTextColorStyleAdapter.toJson(tVar, eSignatureComponentStyle.getTextColor());
        tVar.Z("borderRadius");
        this.nullableESignatureBorderRadiusStyleAdapter.toJson(tVar, eSignatureComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableESignatureBorderWidthStyleAdapter.toJson(tVar, eSignatureComponentStyle.getBorderWidth());
        tVar.Z("borderColor");
        this.nullableESignatureBorderColorStyleAdapter.toJson(tVar, eSignatureComponentStyle.getBorderColor());
        tVar.Z("margin");
        this.nullableInputMarginStyleAdapter.toJson(tVar, eSignatureComponentStyle.getMargin());
        tVar.y();
    }
}
