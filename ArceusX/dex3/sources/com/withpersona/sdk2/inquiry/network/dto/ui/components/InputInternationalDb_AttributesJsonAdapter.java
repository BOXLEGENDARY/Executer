package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputInternationalDb_AttributesJsonAdapter extends h<InputInternationalDb.Attributes> {

    @NotNull
    private final h<List<InputInternationalDb.IdType>> listOfIdTypeAdapter;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefillIdbCountry", "prefillIdbType", "prefillIdbValue", "errorIdbCountry", "errorIdbType", "errorIdbValue", "hideCountryIfPrefilled", "hideTypeIfPrefilled", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "allowedIdTypes", "label", "labelIdbCountry", "labelIdbType", "labelIdbValue", "placeholderIdbCountry", "placeholderIdbType", "placeholderIdbValue", "hidden", "disabled"});

    public InputInternationalDb_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "prefillIdbCountry");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "hideCountryIfPrefilled");
        this.listOfIdTypeAdapter = wVar.f(A.j(List.class, new Type[]{InputInternationalDb.IdType.class}), L.d(), "allowedIdTypes");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputInternationalDb.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputInternationalDb.Attributes m264fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    list = (List) this.listOfIdTypeAdapter.fromJson(mVar);
                    if (list == null) {
                        throw c.x("allowedIdTypes", "allowedIdTypes", mVar);
                    }
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    str8 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    str12 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 17:
                    str13 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 18:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 19:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        if (list != null) {
            return new InputInternationalDb.Attributes(str, str2, str3, str4, str5, str6, bool, bool2, bool3, bool4, list, str7, str8, str9, str10, str11, str12, str13, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw c.o("allowedIdTypes", "allowedIdTypes", mVar);
    }

    public void toJson(@NotNull t tVar, InputInternationalDb.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefillIdbCountry");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillIdbCountry());
        tVar.Z("prefillIdbType");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillIdbType());
        tVar.Z("prefillIdbValue");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillIdbValue());
        tVar.Z("errorIdbCountry");
        this.nullableStringAdapter.toJson(tVar, attributes.getErrorIdbCountry());
        tVar.Z("errorIdbType");
        this.nullableStringAdapter.toJson(tVar, attributes.getErrorIdbType());
        tVar.Z("errorIdbValue");
        this.nullableStringAdapter.toJson(tVar, attributes.getErrorIdbValue());
        tVar.Z("hideCountryIfPrefilled");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHideCountryIfPrefilled());
        tVar.Z("hideTypeIfPrefilled");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHideTypeIfPrefilled());
        tVar.Z("hideCountryIfSingleChoice");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHideCountryIfSingleChoice());
        tVar.Z("hideTypeIfSingleChoice");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHideTypeIfSingleChoice());
        tVar.Z("allowedIdTypes");
        this.listOfIdTypeAdapter.toJson(tVar, attributes.getAllowedIdTypes());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("labelIdbCountry");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabelIdbCountry());
        tVar.Z("labelIdbType");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabelIdbType());
        tVar.Z("labelIdbValue");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabelIdbValue());
        tVar.Z("placeholderIdbCountry");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderIdbCountry());
        tVar.Z("placeholderIdbType");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderIdbType());
        tVar.Z("placeholderIdbValue");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholderIdbValue());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
