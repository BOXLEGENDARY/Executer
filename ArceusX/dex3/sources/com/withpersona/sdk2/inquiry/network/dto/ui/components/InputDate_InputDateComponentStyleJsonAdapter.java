package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputDate_InputDateComponentStyleJsonAdapter extends h<InputDate.InputDateComponentStyle> {

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
    private final h<AttributeStyles.DateSelectBackgroundColorStyle> nullableDateSelectBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.DateSelectBorderColorStyle> nullableDateSelectBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.DateSelectBorderRadiusStyle> nullableDateSelectBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.DateSelectBorderWidthStyle> nullableDateSelectBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.DateSelectStrokeColorStyle> nullableDateSelectStrokeColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.DateSelectTextColorStyle> nullableDateSelectTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputMarginStyle> nullableInputMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedJustifyStyle> nullableTextBasedJustifyStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "margin", "justify", "strokeColor"});

    public InputDate_InputDateComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexTextBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableDateSelectTextColorStyleAdapter = wVar.f(AttributeStyles.DateSelectTextColorStyle.class, L.d(), "textColor");
        this.nullableDateSelectBorderRadiusStyleAdapter = wVar.f(AttributeStyles.DateSelectBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableDateSelectBorderWidthStyleAdapter = wVar.f(AttributeStyles.DateSelectBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableDateSelectBackgroundColorStyleAdapter = wVar.f(AttributeStyles.DateSelectBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableDateSelectBorderColorStyleAdapter = wVar.f(AttributeStyles.DateSelectBorderColorStyle.class, L.d(), "borderColor");
        this.nullableInputMarginStyleAdapter = wVar.f(AttributeStyles.InputMarginStyle.class, L.d(), "margin");
        this.nullableTextBasedJustifyStyleAdapter = wVar.f(AttributeStyles.TextBasedJustifyStyle.class, L.d(), "justify");
        this.nullableDateSelectStrokeColorStyleAdapter = wVar.f(AttributeStyles.DateSelectStrokeColorStyle.class, L.d(), "strokeColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputDate.InputDateComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputDate.InputDateComponentStyle m262fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = null;
        AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = null;
        AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = null;
        AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = null;
        AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    dateSelectTextColorStyle = (AttributeStyles.DateSelectTextColorStyle) this.nullableDateSelectTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    dateSelectBorderRadiusStyle = (AttributeStyles.DateSelectBorderRadiusStyle) this.nullableDateSelectBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    dateSelectBorderWidthStyle = (AttributeStyles.DateSelectBorderWidthStyle) this.nullableDateSelectBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    dateSelectBackgroundColorStyle = (AttributeStyles.DateSelectBackgroundColorStyle) this.nullableDateSelectBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    dateSelectBorderColorStyle = (AttributeStyles.DateSelectBorderColorStyle) this.nullableDateSelectBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    dateSelectStrokeColorStyle = (AttributeStyles.DateSelectStrokeColorStyle) this.nullableDateSelectStrokeColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputDate.InputDateComponentStyle(complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, dateSelectTextColorStyle, dateSelectBorderRadiusStyle, dateSelectBorderWidthStyle, dateSelectBackgroundColorStyle, dateSelectBorderColorStyle, inputMarginStyle, textBasedJustifyStyle, dateSelectStrokeColorStyle);
    }

    public void toJson(@NotNull t tVar, InputDate.InputDateComponentStyle inputDateComponentStyle) {
        if (inputDateComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(tVar, inputDateComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(tVar, inputDateComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(tVar, inputDateComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(tVar, inputDateComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(tVar, inputDateComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableDateSelectTextColorStyleAdapter.toJson(tVar, inputDateComponentStyle.getTextColor());
        tVar.Z("borderRadius");
        this.nullableDateSelectBorderRadiusStyleAdapter.toJson(tVar, inputDateComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableDateSelectBorderWidthStyleAdapter.toJson(tVar, inputDateComponentStyle.getBorderWidth());
        tVar.Z("backgroundColor");
        this.nullableDateSelectBackgroundColorStyleAdapter.toJson(tVar, inputDateComponentStyle.getBackgroundColor());
        tVar.Z("borderColor");
        this.nullableDateSelectBorderColorStyleAdapter.toJson(tVar, inputDateComponentStyle.getBorderColor());
        tVar.Z("margin");
        this.nullableInputMarginStyleAdapter.toJson(tVar, inputDateComponentStyle.getMargin());
        tVar.Z("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(tVar, inputDateComponentStyle.getJustify());
        tVar.Z("strokeColor");
        this.nullableDateSelectStrokeColorStyleAdapter.toJson(tVar, inputDateComponentStyle.getStrokeColor());
        tVar.y();
    }
}
