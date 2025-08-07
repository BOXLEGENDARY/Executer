package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputTextBasedComponentStyleJsonAdapter extends h<InputTextBasedComponentStyle> {

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
    private final h<AttributeStyles.ComplexTextBasedTextColorStyle> nullableComplexTextBasedTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputMarginStyle> nullableInputMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputTextBackgroundColorStyle> nullableInputTextBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputTextBorderColorStyle> nullableInputTextBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputTextBorderRadiusStyle> nullableInputTextBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputTextBorderWidthStyle> nullableInputTextBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputTextStrokeColorStyle> nullableInputTextStrokeColorStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"margin", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "strokeColor"});

    public InputTextBasedComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableInputMarginStyleAdapter = wVar.f(AttributeStyles.InputMarginStyle.class, L.d(), "margin");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableComplexTextBasedTextColorStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedTextColorStyle.class, L.d(), "textColor");
        this.nullableInputTextBorderRadiusStyleAdapter = wVar.f(AttributeStyles.InputTextBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableInputTextBorderWidthStyleAdapter = wVar.f(AttributeStyles.InputTextBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableInputTextBackgroundColorStyleAdapter = wVar.f(AttributeStyles.InputTextBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableInputTextBorderColorStyleAdapter = wVar.f(AttributeStyles.InputTextBorderColorStyle.class, L.d(), "borderColor");
        this.nullableInputTextStrokeColorStyleAdapter = wVar.f(AttributeStyles.InputTextStrokeColorStyle.class, L.d(), "strokeColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputTextBasedComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputTextBasedComponentStyle m447fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = null;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = null;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = null;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = null;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = null;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    complexTextBasedTextColorStyle = (AttributeStyles.ComplexTextBasedTextColorStyle) this.nullableComplexTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    inputTextBorderRadiusStyle = (AttributeStyles.InputTextBorderRadiusStyle) this.nullableInputTextBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    inputTextBorderWidthStyle = (AttributeStyles.InputTextBorderWidthStyle) this.nullableInputTextBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    inputTextBackgroundColorStyle = (AttributeStyles.InputTextBackgroundColorStyle) this.nullableInputTextBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    inputTextBorderColorStyle = (AttributeStyles.InputTextBorderColorStyle) this.nullableInputTextBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    inputTextStrokeColorStyle = (AttributeStyles.InputTextStrokeColorStyle) this.nullableInputTextStrokeColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, inputTextBorderColorStyle, inputTextStrokeColorStyle);
    }

    public void toJson(@NotNull t tVar, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        if (inputTextBasedComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("margin");
        this.nullableInputMarginStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getMargin());
        tVar.Z("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableComplexTextBasedTextColorStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getTextColor());
        tVar.Z("borderRadius");
        this.nullableInputTextBorderRadiusStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableInputTextBorderWidthStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getBorderWidth());
        tVar.Z("backgroundColor");
        this.nullableInputTextBackgroundColorStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getBackgroundColor());
        tVar.Z("borderColor");
        this.nullableInputTextBorderColorStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getBorderColor());
        tVar.Z("strokeColor");
        this.nullableInputTextStrokeColorStyleAdapter.toJson(tVar, inputTextBasedComponentStyle.getStrokeColor());
        tVar.y();
    }
}
