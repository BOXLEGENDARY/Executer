package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ButtonVerifyPersonaComponentStyleJsonAdapter extends h<ButtonVerifyPersonaComponentStyle> {

    @NotNull
    private final h<AttributeStyles.ButtonBasedBackgroundColorStyle> nullableButtonBasedBackgroundColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedBorderColorStyle> nullableButtonBasedBorderColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedBorderRadiusStyle> nullableButtonBasedBorderRadiusStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedBorderWidthStyle> nullableButtonBasedBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedFontFamilyStyle> nullableButtonBasedFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedFontSizeStyle> nullableButtonBasedFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedFontWeightStyle> nullableButtonBasedFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedHeightStyle> nullableButtonBasedHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedJustifyStyle> nullableButtonBasedJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedLetterSpacingStyle> nullableButtonBasedLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedLineHeightStyle> nullableButtonBasedLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedMarginStyle> nullableButtonBasedMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedPaddingStyle> nullableButtonBasedPaddingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedTextColorStyle> nullableButtonBasedTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.ButtonBasedWidthStyle> nullableButtonBasedWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"padding", "margin", "justify", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "height", "width", "backgroundColor", "borderColor", "borderRadius", "borderWidth"});

    public ButtonVerifyPersonaComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableButtonBasedPaddingStyleAdapter = wVar.f(AttributeStyles.ButtonBasedPaddingStyle.class, L.d(), "padding");
        this.nullableButtonBasedMarginStyleAdapter = wVar.f(AttributeStyles.ButtonBasedMarginStyle.class, L.d(), "margin");
        this.nullableButtonBasedJustifyStyleAdapter = wVar.f(AttributeStyles.ButtonBasedJustifyStyle.class, L.d(), "justify");
        this.nullableButtonBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.ButtonBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableButtonBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.ButtonBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableButtonBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.ButtonBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableButtonBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.ButtonBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableButtonBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.ButtonBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableButtonBasedTextColorStyleAdapter = wVar.f(AttributeStyles.ButtonBasedTextColorStyle.class, L.d(), "textColor");
        this.nullableButtonBasedHeightStyleAdapter = wVar.f(AttributeStyles.ButtonBasedHeightStyle.class, L.d(), "height");
        this.nullableButtonBasedWidthStyleAdapter = wVar.f(AttributeStyles.ButtonBasedWidthStyle.class, L.d(), "width");
        this.nullableButtonBasedBackgroundColorStyleAdapter = wVar.f(AttributeStyles.ButtonBasedBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableButtonBasedBorderColorStyleAdapter = wVar.f(AttributeStyles.ButtonBasedBorderColorStyle.class, L.d(), "borderColor");
        this.nullableButtonBasedBorderRadiusStyleAdapter = wVar.f(AttributeStyles.ButtonBasedBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableButtonBasedBorderWidthStyleAdapter = wVar.f(AttributeStyles.ButtonBasedBorderWidthStyle.class, L.d(), "borderWidth");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ButtonVerifyPersonaComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ButtonVerifyPersonaComponentStyle m445fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = null;
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = null;
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = null;
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = null;
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = null;
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = null;
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = null;
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = null;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = null;
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = null;
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = null;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = null;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = null;
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = null;
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    buttonBasedPaddingStyle = (AttributeStyles.ButtonBasedPaddingStyle) this.nullableButtonBasedPaddingStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    buttonBasedMarginStyle = (AttributeStyles.ButtonBasedMarginStyle) this.nullableButtonBasedMarginStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    buttonBasedJustifyStyle = (AttributeStyles.ButtonBasedJustifyStyle) this.nullableButtonBasedJustifyStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    buttonBasedFontFamilyStyle = (AttributeStyles.ButtonBasedFontFamilyStyle) this.nullableButtonBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    buttonBasedFontSizeStyle = (AttributeStyles.ButtonBasedFontSizeStyle) this.nullableButtonBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    buttonBasedFontWeightStyle = (AttributeStyles.ButtonBasedFontWeightStyle) this.nullableButtonBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    buttonBasedLetterSpacingStyle = (AttributeStyles.ButtonBasedLetterSpacingStyle) this.nullableButtonBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    buttonBasedLineHeightStyle = (AttributeStyles.ButtonBasedLineHeightStyle) this.nullableButtonBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    buttonBasedTextColorStyle = (AttributeStyles.ButtonBasedTextColorStyle) this.nullableButtonBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    buttonBasedHeightStyle = (AttributeStyles.ButtonBasedHeightStyle) this.nullableButtonBasedHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    buttonBasedWidthStyle = (AttributeStyles.ButtonBasedWidthStyle) this.nullableButtonBasedWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    buttonBasedBackgroundColorStyle = (AttributeStyles.ButtonBasedBackgroundColorStyle) this.nullableButtonBasedBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    buttonBasedBorderColorStyle = (AttributeStyles.ButtonBasedBorderColorStyle) this.nullableButtonBasedBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    buttonBasedBorderRadiusStyle = (AttributeStyles.ButtonBasedBorderRadiusStyle) this.nullableButtonBasedBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    buttonBasedBorderWidthStyle = (AttributeStyles.ButtonBasedBorderWidthStyle) this.nullableButtonBasedBorderWidthStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new ButtonVerifyPersonaComponentStyle(buttonBasedPaddingStyle, buttonBasedMarginStyle, buttonBasedJustifyStyle, buttonBasedFontFamilyStyle, buttonBasedFontSizeStyle, buttonBasedFontWeightStyle, buttonBasedLetterSpacingStyle, buttonBasedLineHeightStyle, buttonBasedTextColorStyle, buttonBasedHeightStyle, buttonBasedWidthStyle, buttonBasedBackgroundColorStyle, buttonBasedBorderColorStyle, buttonBasedBorderRadiusStyle, buttonBasedBorderWidthStyle);
    }

    public void toJson(@NotNull t tVar, ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle) {
        if (buttonVerifyPersonaComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("padding");
        this.nullableButtonBasedPaddingStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getPadding());
        tVar.Z("margin");
        this.nullableButtonBasedMarginStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getMargin());
        tVar.Z("justify");
        this.nullableButtonBasedJustifyStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getJustify());
        tVar.Z("fontFamily");
        this.nullableButtonBasedFontFamilyStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableButtonBasedFontSizeStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableButtonBasedFontWeightStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableButtonBasedLetterSpacingStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableButtonBasedLineHeightStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableButtonBasedTextColorStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getTextColor());
        tVar.Z("height");
        this.nullableButtonBasedHeightStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getHeight());
        tVar.Z("width");
        this.nullableButtonBasedWidthStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getWidth());
        tVar.Z("backgroundColor");
        this.nullableButtonBasedBackgroundColorStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getBackgroundColor());
        tVar.Z("borderColor");
        this.nullableButtonBasedBorderColorStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getBorderColor());
        tVar.Z("borderRadius");
        this.nullableButtonBasedBorderRadiusStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableButtonBasedBorderWidthStyleAdapter.toJson(tVar, buttonVerifyPersonaComponentStyle.getBorderWidth());
        tVar.y();
    }
}
