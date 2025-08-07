package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputSelectComponentStyleJsonAdapter extends h<InputSelectComponentStyle> {

    @NotNull
    private final h<AttributeStyles.InputMarginStyle> nullableInputMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectBackgroundColorStyle> nullableInputSelectBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectBorderColorStyle> nullableInputSelectBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectBorderRadiusStyle> nullableInputSelectBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectBorderWidthStyle> nullableInputSelectBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectStrokeColorStyle> nullableInputSelectStrokeColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextColorStyle> nullableInputSelectTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextFontFamilyStyle> nullableInputSelectTextFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextFontSizeStyle> nullableInputSelectTextFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextFontWeightStyle> nullableInputSelectTextFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextLetterSpacingStyle> nullableInputSelectTextLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputSelectTextLineHeightStyle> nullableInputSelectTextLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedJustifyStyle> nullableTextBasedJustifyStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"margin", "justify", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "strokeColor"});

    public InputSelectComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableInputMarginStyleAdapter = wVar.f(AttributeStyles.InputMarginStyle.class, L.d(), "margin");
        this.nullableTextBasedJustifyStyleAdapter = wVar.f(AttributeStyles.TextBasedJustifyStyle.class, L.d(), "justify");
        this.nullableInputSelectTextFontFamilyStyleAdapter = wVar.f(AttributeStyles.InputSelectTextFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableInputSelectTextFontSizeStyleAdapter = wVar.f(AttributeStyles.InputSelectTextFontSizeStyle.class, L.d(), "fontSize");
        this.nullableInputSelectTextFontWeightStyleAdapter = wVar.f(AttributeStyles.InputSelectTextFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableInputSelectTextLetterSpacingStyleAdapter = wVar.f(AttributeStyles.InputSelectTextLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableInputSelectTextLineHeightStyleAdapter = wVar.f(AttributeStyles.InputSelectTextLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableInputSelectTextColorStyleAdapter = wVar.f(AttributeStyles.InputSelectTextColorStyle.class, L.d(), "textColor");
        this.nullableInputSelectBorderRadiusStyleAdapter = wVar.f(AttributeStyles.InputSelectBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableInputSelectBorderWidthStyleAdapter = wVar.f(AttributeStyles.InputSelectBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableInputSelectBackgroundColorStyleAdapter = wVar.f(AttributeStyles.InputSelectBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableInputSelectBorderColorStyleAdapter = wVar.f(AttributeStyles.InputSelectBorderColorStyle.class, L.d(), "borderColor");
        this.nullableInputSelectStrokeColorStyleAdapter = wVar.f(AttributeStyles.InputSelectStrokeColorStyle.class, L.d(), "strokeColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputSelectComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputSelectComponentStyle m446fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = null;
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = null;
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = null;
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = null;
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = null;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = null;
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = null;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = null;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = null;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = null;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = null;
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
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    inputSelectTextFontFamilyStyle = (AttributeStyles.InputSelectTextFontFamilyStyle) this.nullableInputSelectTextFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    inputSelectTextFontSizeStyle = (AttributeStyles.InputSelectTextFontSizeStyle) this.nullableInputSelectTextFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    inputSelectTextFontWeightStyle = (AttributeStyles.InputSelectTextFontWeightStyle) this.nullableInputSelectTextFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    inputSelectTextLetterSpacingStyle = (AttributeStyles.InputSelectTextLetterSpacingStyle) this.nullableInputSelectTextLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    inputSelectTextLineHeightStyle = (AttributeStyles.InputSelectTextLineHeightStyle) this.nullableInputSelectTextLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    inputSelectTextColorStyle = (AttributeStyles.InputSelectTextColorStyle) this.nullableInputSelectTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    inputSelectBorderRadiusStyle = (AttributeStyles.InputSelectBorderRadiusStyle) this.nullableInputSelectBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    inputSelectBorderWidthStyle = (AttributeStyles.InputSelectBorderWidthStyle) this.nullableInputSelectBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    inputSelectBackgroundColorStyle = (AttributeStyles.InputSelectBackgroundColorStyle) this.nullableInputSelectBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    inputSelectBorderColorStyle = (AttributeStyles.InputSelectBorderColorStyle) this.nullableInputSelectBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    inputSelectStrokeColorStyle = (AttributeStyles.InputSelectStrokeColorStyle) this.nullableInputSelectStrokeColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputSelectComponentStyle(inputMarginStyle, textBasedJustifyStyle, inputSelectTextFontFamilyStyle, inputSelectTextFontSizeStyle, inputSelectTextFontWeightStyle, inputSelectTextLetterSpacingStyle, inputSelectTextLineHeightStyle, inputSelectTextColorStyle, inputSelectBorderRadiusStyle, inputSelectBorderWidthStyle, inputSelectBackgroundColorStyle, inputSelectBorderColorStyle, inputSelectStrokeColorStyle);
    }

    public void toJson(@NotNull t tVar, InputSelectComponentStyle inputSelectComponentStyle) {
        if (inputSelectComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("margin");
        this.nullableInputMarginStyleAdapter.toJson(tVar, inputSelectComponentStyle.getMargin());
        tVar.Z("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(tVar, inputSelectComponentStyle.getJustify());
        tVar.Z("fontFamily");
        this.nullableInputSelectTextFontFamilyStyleAdapter.toJson(tVar, inputSelectComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableInputSelectTextFontSizeStyleAdapter.toJson(tVar, inputSelectComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableInputSelectTextFontWeightStyleAdapter.toJson(tVar, inputSelectComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableInputSelectTextLetterSpacingStyleAdapter.toJson(tVar, inputSelectComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableInputSelectTextLineHeightStyleAdapter.toJson(tVar, inputSelectComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableInputSelectTextColorStyleAdapter.toJson(tVar, inputSelectComponentStyle.getTextColor());
        tVar.Z("borderRadius");
        this.nullableInputSelectBorderRadiusStyleAdapter.toJson(tVar, inputSelectComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableInputSelectBorderWidthStyleAdapter.toJson(tVar, inputSelectComponentStyle.getBorderWidth());
        tVar.Z("backgroundColor");
        this.nullableInputSelectBackgroundColorStyleAdapter.toJson(tVar, inputSelectComponentStyle.getBackgroundColor());
        tVar.Z("borderColor");
        this.nullableInputSelectBorderColorStyleAdapter.toJson(tVar, inputSelectComponentStyle.getBorderColor());
        tVar.Z("strokeColor");
        this.nullableInputSelectStrokeColorStyleAdapter.toJson(tVar, inputSelectComponentStyle.getStrokeColor());
        tVar.y();
    }
}
