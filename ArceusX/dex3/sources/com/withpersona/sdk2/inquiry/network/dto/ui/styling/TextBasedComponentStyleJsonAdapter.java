package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class TextBasedComponentStyleJsonAdapter extends h<TextBasedComponentStyle> {

    @NotNull
    private final h<AttributeStyles.TextBasedFontFamilyStyle> nullableTextBasedFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedFontSizeStyle> nullableTextBasedFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedFontWeightStyle> nullableTextBasedFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedJustifyStyle> nullableTextBasedJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedLetterSpacingStyle> nullableTextBasedLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedLineHeightStyle> nullableTextBasedLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedMarginStyle> nullableTextBasedMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedTextColorStyle> nullableTextBasedTextColorStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"margin", "justify", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight"});

    public TextBasedComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableTextBasedMarginStyleAdapter = wVar.f(AttributeStyles.TextBasedMarginStyle.class, L.d(), "margin");
        this.nullableTextBasedJustifyStyleAdapter = wVar.f(AttributeStyles.TextBasedJustifyStyle.class, L.d(), "justify");
        this.nullableTextBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.TextBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableTextBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.TextBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableTextBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.TextBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableTextBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.TextBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableTextBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.TextBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableTextBasedTextColorStyleAdapter = wVar.f(AttributeStyles.TextBasedTextColorStyle.class, L.d(), "textColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TextBasedComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public TextBasedComponentStyle m520fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = null;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = null;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = null;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = null;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    textBasedMarginStyle = (AttributeStyles.TextBasedMarginStyle) this.nullableTextBasedMarginStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    textBasedFontFamilyStyle = (AttributeStyles.TextBasedFontFamilyStyle) this.nullableTextBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    textBasedFontSizeStyle = (AttributeStyles.TextBasedFontSizeStyle) this.nullableTextBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    textBasedFontWeightStyle = (AttributeStyles.TextBasedFontWeightStyle) this.nullableTextBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    textBasedLetterSpacingStyle = (AttributeStyles.TextBasedLetterSpacingStyle) this.nullableTextBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    textBasedLineHeightStyle = (AttributeStyles.TextBasedLineHeightStyle) this.nullableTextBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    textBasedTextColorStyle2 = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new TextBasedComponentStyle(textBasedMarginStyle, textBasedJustifyStyle, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, textBasedTextColorStyle, textBasedTextColorStyle2);
    }

    public void toJson(@NotNull t tVar, TextBasedComponentStyle textBasedComponentStyle) {
        if (textBasedComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("margin");
        this.nullableTextBasedMarginStyleAdapter.toJson(tVar, textBasedComponentStyle.getMargin());
        tVar.Z("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(tVar, textBasedComponentStyle.getJustify());
        tVar.Z("fontFamily");
        this.nullableTextBasedFontFamilyStyleAdapter.toJson(tVar, textBasedComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableTextBasedFontSizeStyleAdapter.toJson(tVar, textBasedComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableTextBasedFontWeightStyleAdapter.toJson(tVar, textBasedComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableTextBasedLetterSpacingStyleAdapter.toJson(tVar, textBasedComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableTextBasedLineHeightStyleAdapter.toJson(tVar, textBasedComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableTextBasedTextColorStyleAdapter.toJson(tVar, textBasedComponentStyle.getTextColor());
        tVar.Z("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(tVar, textBasedComponentStyle.getTextColorHighlight());
        tVar.y();
    }
}
