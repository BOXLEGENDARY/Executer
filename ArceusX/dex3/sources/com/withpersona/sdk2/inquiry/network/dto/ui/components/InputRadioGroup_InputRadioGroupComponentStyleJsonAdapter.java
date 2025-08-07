package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputRadioGroup_InputRadioGroupComponentStyleJsonAdapter extends h<InputRadioGroup.InputRadioGroupComponentStyle> {

    @NotNull
    private final h<AttributeStyles.InputRadioGroupFontFamilyStyle> nullableInputRadioGroupFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputRadioGroupFontSizeStyle> nullableInputRadioGroupFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputRadioGroupFontWeightStyle> nullableInputRadioGroupFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputRadioGroupLetterSpacingStyle> nullableInputRadioGroupLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputRadioGroupLineHeightStyle> nullableInputRadioGroupLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputRadioGroupTextColorStyle> nullableInputRadioGroupTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedMarginStyle> nullableTextBasedMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedTextColorStyle> nullableTextBasedTextColorStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"margin", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight"});

    public InputRadioGroup_InputRadioGroupComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableTextBasedMarginStyleAdapter = wVar.f(AttributeStyles.TextBasedMarginStyle.class, L.d(), "margin");
        this.nullableInputRadioGroupFontFamilyStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableInputRadioGroupFontSizeStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupFontSizeStyle.class, L.d(), "fontSize");
        this.nullableInputRadioGroupFontWeightStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableInputRadioGroupLetterSpacingStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableInputRadioGroupLineHeightStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableInputRadioGroupTextColorStyleAdapter = wVar.f(AttributeStyles.InputRadioGroupTextColorStyle.class, L.d(), "textColor");
        this.nullableTextBasedTextColorStyleAdapter = wVar.f(AttributeStyles.TextBasedTextColorStyle.class, L.d(), "textColorHighlight");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputRadioGroup.InputRadioGroupComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputRadioGroup.InputRadioGroupComponentStyle m277fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = null;
        AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = null;
        AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = null;
        AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = null;
        AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = null;
        AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = null;
        AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
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
                    inputRadioGroupFontFamilyStyle = (AttributeStyles.InputRadioGroupFontFamilyStyle) this.nullableInputRadioGroupFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    inputRadioGroupFontSizeStyle = (AttributeStyles.InputRadioGroupFontSizeStyle) this.nullableInputRadioGroupFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    inputRadioGroupFontWeightStyle = (AttributeStyles.InputRadioGroupFontWeightStyle) this.nullableInputRadioGroupFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    inputRadioGroupLetterSpacingStyle = (AttributeStyles.InputRadioGroupLetterSpacingStyle) this.nullableInputRadioGroupLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    inputRadioGroupLineHeightStyle = (AttributeStyles.InputRadioGroupLineHeightStyle) this.nullableInputRadioGroupLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    inputRadioGroupTextColorStyle = (AttributeStyles.InputRadioGroupTextColorStyle) this.nullableInputRadioGroupTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputRadioGroup.InputRadioGroupComponentStyle(textBasedMarginStyle, inputRadioGroupFontFamilyStyle, inputRadioGroupFontSizeStyle, inputRadioGroupFontWeightStyle, inputRadioGroupLetterSpacingStyle, inputRadioGroupLineHeightStyle, inputRadioGroupTextColorStyle, textBasedTextColorStyle);
    }

    public void toJson(@NotNull t tVar, InputRadioGroup.InputRadioGroupComponentStyle inputRadioGroupComponentStyle) {
        if (inputRadioGroupComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("margin");
        this.nullableTextBasedMarginStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getMargin());
        tVar.Z("fontFamily");
        this.nullableInputRadioGroupFontFamilyStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableInputRadioGroupFontSizeStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableInputRadioGroupFontWeightStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableInputRadioGroupLetterSpacingStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableInputRadioGroupLineHeightStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableInputRadioGroupTextColorStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getTextColor());
        tVar.Z("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(tVar, inputRadioGroupComponentStyle.getTextColorHighlight());
        tVar.y();
    }
}
