package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCheckbox_InputCheckboxComponentStyleJsonAdapter extends h<InputCheckbox.InputCheckboxComponentStyle> {

    @NotNull
    private final h<AttributeStyles.InputCheckboxFontFamilyStyle> nullableInputCheckboxFontFamilyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputCheckboxFontSizeStyle> nullableInputCheckboxFontSizeStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputCheckboxFontWeightStyle> nullableInputCheckboxFontWeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputCheckboxLetterSpacingStyle> nullableInputCheckboxLetterSpacingStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputCheckboxLineHeightStyle> nullableInputCheckboxLineHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.InputCheckboxTextColorStyle> nullableInputCheckboxTextColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.TextBasedTextColorStyle> nullableTextBasedTextColorStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight"});

    public InputCheckbox_InputCheckboxComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableInputCheckboxFontFamilyStyleAdapter = wVar.f(AttributeStyles.InputCheckboxFontFamilyStyle.class, L.d(), "fontFamily");
        this.nullableInputCheckboxFontSizeStyleAdapter = wVar.f(AttributeStyles.InputCheckboxFontSizeStyle.class, L.d(), "fontSize");
        this.nullableInputCheckboxFontWeightStyleAdapter = wVar.f(AttributeStyles.InputCheckboxFontWeightStyle.class, L.d(), "fontWeight");
        this.nullableInputCheckboxLetterSpacingStyleAdapter = wVar.f(AttributeStyles.InputCheckboxLetterSpacingStyle.class, L.d(), "letterSpacing");
        this.nullableInputCheckboxLineHeightStyleAdapter = wVar.f(AttributeStyles.InputCheckboxLineHeightStyle.class, L.d(), "lineHeight");
        this.nullableInputCheckboxTextColorStyleAdapter = wVar.f(AttributeStyles.InputCheckboxTextColorStyle.class, L.d(), "textColor");
        this.nullableTextBasedTextColorStyleAdapter = wVar.f(AttributeStyles.TextBasedTextColorStyle.class, L.d(), "textColorHighlight");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCheckbox.InputCheckboxComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCheckbox.InputCheckboxComponentStyle m255fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = null;
        AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = null;
        AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = null;
        AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = null;
        AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = null;
        AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    inputCheckboxFontFamilyStyle = (AttributeStyles.InputCheckboxFontFamilyStyle) this.nullableInputCheckboxFontFamilyStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    inputCheckboxFontSizeStyle = (AttributeStyles.InputCheckboxFontSizeStyle) this.nullableInputCheckboxFontSizeStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    inputCheckboxFontWeightStyle = (AttributeStyles.InputCheckboxFontWeightStyle) this.nullableInputCheckboxFontWeightStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    inputCheckboxLetterSpacingStyle = (AttributeStyles.InputCheckboxLetterSpacingStyle) this.nullableInputCheckboxLetterSpacingStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    inputCheckboxLineHeightStyle = (AttributeStyles.InputCheckboxLineHeightStyle) this.nullableInputCheckboxLineHeightStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    inputCheckboxTextColorStyle = (AttributeStyles.InputCheckboxTextColorStyle) this.nullableInputCheckboxTextColorStyleAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputCheckbox.InputCheckboxComponentStyle(inputCheckboxFontFamilyStyle, inputCheckboxFontSizeStyle, inputCheckboxFontWeightStyle, inputCheckboxLetterSpacingStyle, inputCheckboxLineHeightStyle, inputCheckboxTextColorStyle, textBasedTextColorStyle);
    }

    public void toJson(@NotNull t tVar, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle) {
        if (inputCheckboxComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("fontFamily");
        this.nullableInputCheckboxFontFamilyStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getFontFamily());
        tVar.Z("fontSize");
        this.nullableInputCheckboxFontSizeStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getFontSize());
        tVar.Z("fontWeight");
        this.nullableInputCheckboxFontWeightStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getFontWeight());
        tVar.Z("letterSpacing");
        this.nullableInputCheckboxLetterSpacingStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getLetterSpacing());
        tVar.Z("lineHeight");
        this.nullableInputCheckboxLineHeightStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getLineHeight());
        tVar.Z("textColor");
        this.nullableInputCheckboxTextColorStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getTextColor());
        tVar.Z("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(tVar, inputCheckboxComponentStyle.getTextColorHighlight());
        tVar.y();
    }
}
