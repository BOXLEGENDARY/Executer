package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputAddress_AttributesJsonAdapter extends h<InputAddress.Attributes> {

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"label", "editAddressManuallyPrompt", "placeholderAutocomplete", "fieldKeyAddressStreet1", "prefillAddressStreet1", "placeholderAddressStreet1", "fieldKeyAddressStreet2", "prefillAddressStreet2", "placeholderAddressStreet2", "fieldKeyAddressCity", "prefillAddressCity", "placeholderAddressCity", "fieldKeyAddressSubdivision", "prefillAddressSubdivision", "placeholderAddressSubdivision", "placeholderAddressSubdivisionUs", "fieldKeyAddressPostalCode", "prefillAddressPostalCode", "placeholderAddressPostalCode", "placeholderAddressPostalCodeUs", "selectedCountryCode", "hidden", "disabled"});

    public InputAddress_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "label");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputAddress.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputAddress.Attributes m249fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str8 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    str12 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    str13 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    str14 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    str15 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    str16 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    str17 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 21:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 22:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputAddress.Attributes(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, jsonLogicBoolean, jsonLogicBoolean2);
    }

    public void toJson(@NotNull t tVar, InputAddress.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("editAddressManuallyPrompt");
        this.nullableStringAdapter.toJson(tVar, attributes.getEditAddressManuallyPrompt());
        tVar.Z("placeholderAutocomplete");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAutocomplete());
        tVar.Z("fieldKeyAddressStreet1");
        this.nullableStringAdapter.toJson(tVar, attributes.getFieldKeyAddressStreet1());
        tVar.Z("prefillAddressStreet1");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillAddressStreet1());
        tVar.Z("placeholderAddressStreet1");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressStreet1());
        tVar.Z("fieldKeyAddressStreet2");
        this.nullableStringAdapter.toJson(tVar, attributes.getFieldKeyAddressStreet2());
        tVar.Z("prefillAddressStreet2");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillAddressStreet2());
        tVar.Z("placeholderAddressStreet2");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressStreet2());
        tVar.Z("fieldKeyAddressCity");
        this.nullableStringAdapter.toJson(tVar, attributes.getFieldKeyAddressCity());
        tVar.Z("prefillAddressCity");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillAddressCity());
        tVar.Z("placeholderAddressCity");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressCity());
        tVar.Z("fieldKeyAddressSubdivision");
        this.nullableStringAdapter.toJson(tVar, attributes.getFieldKeyAddressSubdivision());
        tVar.Z("prefillAddressSubdivision");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillAddressSubdivision());
        tVar.Z("placeholderAddressSubdivision");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressSubdivision());
        tVar.Z("placeholderAddressSubdivisionUs");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressSubdivisionUs());
        tVar.Z("fieldKeyAddressPostalCode");
        this.nullableStringAdapter.toJson(tVar, attributes.getFieldKeyAddressPostalCode());
        tVar.Z("prefillAddressPostalCode");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillAddressPostalCode());
        tVar.Z("placeholderAddressPostalCode");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressPostalCode());
        tVar.Z("placeholderAddressPostalCodeUs");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderAddressPostalCodeUs());
        tVar.Z("selectedCountryCode");
        this.nullableStringAdapter.toJson(tVar, attributes.getSelectedCountryCode());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
