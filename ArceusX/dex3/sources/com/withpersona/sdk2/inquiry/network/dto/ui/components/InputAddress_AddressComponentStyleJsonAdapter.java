package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputAddress_AddressComponentStyleJsonAdapter extends h<InputAddress.AddressComponentStyle> {

    @NotNull
    private final h<AttributeStyles.AddressTextStyle> nullableAddressTextStyleAdapter;

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
    private final m.b options = m.b.a(new String[]{"textStyle", "backgroundColor", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "borderColor", "margin"});

    public InputAddress_AddressComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableAddressTextStyleAdapter = wVar.f(AttributeStyles.AddressTextStyle.class, L.d(), "textStyle");
        this.nullableInputTextBackgroundColorStyleAdapter = wVar.f(AttributeStyles.InputTextBackgroundColorStyle.class, L.d(), "backgroundColor");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontSizeStyle.class, L.d(), "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableComplexTextBasedTextColorStyleAdapter = wVar.f(AttributeStyles.ComplexTextBasedTextColorStyle.class, L.d(), "textColor");
        this.nullableInputTextBorderRadiusStyleAdapter = wVar.f(AttributeStyles.InputTextBorderRadiusStyle.class, L.d(), "borderRadius");
        this.nullableInputTextBorderWidthStyleAdapter = wVar.f(AttributeStyles.InputTextBorderWidthStyle.class, L.d(), "borderWidth");
        this.nullableInputTextBorderColorStyleAdapter = wVar.f(AttributeStyles.InputTextBorderColorStyle.class, L.d(), "borderColor");
        this.nullableInputMarginStyleAdapter = wVar.f(AttributeStyles.InputMarginStyle.class, L.d(), "margin");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(56);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputAddress.AddressComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputAddress.AddressComponentStyle m248fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.AddressTextStyle addressTextStyle = null;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = null;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = null;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = null;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    addressTextStyle = (AttributeStyles.AddressTextStyle) this.nullableAddressTextStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    inputTextBackgroundColorStyle = (AttributeStyles.InputTextBackgroundColorStyle) this.nullableInputTextBackgroundColorStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    complexTextBasedTextColorStyle = (AttributeStyles.ComplexTextBasedTextColorStyle) this.nullableComplexTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    inputTextBorderRadiusStyle = (AttributeStyles.InputTextBorderRadiusStyle) this.nullableInputTextBorderRadiusStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    inputTextBorderWidthStyle = (AttributeStyles.InputTextBorderWidthStyle) this.nullableInputTextBorderWidthStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    inputTextBorderColorStyle = (AttributeStyles.InputTextBorderColorStyle) this.nullableInputTextBorderColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputAddress.AddressComponentStyle(addressTextStyle, inputTextBackgroundColorStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBorderColorStyle, inputMarginStyle);
    }

    public void toJson(@NotNull t tVar, InputAddress.AddressComponentStyle addressComponentStyle) {
        if (addressComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("textStyle");
        this.nullableAddressTextStyleAdapter.toJson(tVar, addressComponentStyle.getTextStyle());
        tVar.Z("backgroundColor");
        this.nullableInputTextBackgroundColorStyleAdapter.toJson(tVar, addressComponentStyle.getBackgroundColor());
        tVar.Z("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(tVar, addressComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(tVar, addressComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(tVar, addressComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(tVar, addressComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(tVar, addressComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableComplexTextBasedTextColorStyleAdapter.toJson(tVar, addressComponentStyle.getTextColor());
        tVar.Z("borderRadius");
        this.nullableInputTextBorderRadiusStyleAdapter.toJson(tVar, addressComponentStyle.getBorderRadius());
        tVar.Z("borderWidth");
        this.nullableInputTextBorderWidthStyleAdapter.toJson(tVar, addressComponentStyle.getBorderWidth());
        tVar.Z("borderColor");
        this.nullableInputTextBorderColorStyleAdapter.toJson(tVar, addressComponentStyle.getBorderColor());
        tVar.Z("margin");
        this.nullableInputMarginStyleAdapter.toJson(tVar, addressComponentStyle.getMargin());
        tVar.y();
    }
}
