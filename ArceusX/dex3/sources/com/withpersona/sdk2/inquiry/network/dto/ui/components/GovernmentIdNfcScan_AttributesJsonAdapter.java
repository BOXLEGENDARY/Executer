package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GovernmentIdNfcScan_AttributesJsonAdapter extends h<GovernmentIdNfcScan.Attributes> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<GovernmentIdNfcScan.DataGroupTypes>> nullableListOfDataGroupTypesAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"hidden", "disabled", "documentNumberLabel", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentSuccess", "enabledDataGroups", "authenticating", "reading", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "hidePrefilledInputs", "connectionLostPrompt", "unsupportedDocumentType", "retryError"});

    public GovernmentIdNfcScan_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "documentNumberLabel");
        this.nullableListOfDataGroupTypesAdapter = wVar.f(A.j(List.class, new Type[]{GovernmentIdNfcScan.DataGroupTypes.class}), L.d(), "enabledDataGroups");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "hidePrefilledInputs");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GovernmentIdNfcScan.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GovernmentIdNfcScan.Attributes m242fromJson(@NotNull m mVar) {
        mVar.e();
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
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
        List list = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Boolean bool = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 1:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str6 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str8 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    list = (List) this.nullableListOfDataGroupTypesAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    str12 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    str13 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    str14 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 17:
                    str15 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 18:
                    str16 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 19:
                    str17 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 20:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case 21:
                    str18 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 22:
                    str19 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 23:
                    str20 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new GovernmentIdNfcScan.Attributes(jsonLogicBoolean, jsonLogicBoolean2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, str13, str14, str15, str16, str17, bool, str18, str19, str20);
    }

    public void toJson(@NotNull t tVar, GovernmentIdNfcScan.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.Z("documentNumberLabel");
        this.nullableStringAdapter.toJson(tVar, attributes.getDocumentNumberLabel());
        tVar.Z("prefillCardAccessNumber");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillCardAccessNumber());
        tVar.Z("prefillDocumentNumber");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillDocumentNumber());
        tVar.Z("dateOfBirthLabel");
        this.nullableStringAdapter.toJson(tVar, attributes.getDateOfBirthLabel());
        tVar.Z("prefillDateOfBirth");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillDateOfBirth());
        tVar.Z("cardAccessNumberLabel");
        this.nullableStringAdapter.toJson(tVar, attributes.getCardAccessNumberLabel());
        tVar.Z("expirationDateLabel");
        this.nullableStringAdapter.toJson(tVar, attributes.getExpirationDateLabel());
        tVar.Z("prefillExpirationDate");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefillExpirationDate());
        tVar.Z("launchButtonText");
        this.nullableStringAdapter.toJson(tVar, attributes.getLaunchButtonText());
        tVar.Z("scanDocumentPrompt");
        this.nullableStringAdapter.toJson(tVar, attributes.getScanDocumentPrompt());
        tVar.Z("scanDocumentSuccess");
        this.nullableStringAdapter.toJson(tVar, attributes.getScanDocumentSuccess());
        tVar.Z("enabledDataGroups");
        this.nullableListOfDataGroupTypesAdapter.toJson(tVar, attributes.getEnabledDataGroups());
        tVar.Z("authenticating");
        this.nullableStringAdapter.toJson(tVar, attributes.getAuthenticating());
        tVar.Z("reading");
        this.nullableStringAdapter.toJson(tVar, attributes.getReading());
        tVar.Z("requiredText");
        this.nullableStringAdapter.toJson(tVar, attributes.getRequiredText());
        tVar.Z("scanDocumentError");
        this.nullableStringAdapter.toJson(tVar, attributes.getScanDocumentError());
        tVar.Z("enableNfcPrompt");
        this.nullableStringAdapter.toJson(tVar, attributes.getEnableNfcPrompt());
        tVar.Z("authenticationErrorPrompt");
        this.nullableStringAdapter.toJson(tVar, attributes.getAuthenticationErrorPrompt());
        tVar.Z("hidePrefilledInputs");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHidePrefilledInputs());
        tVar.Z("connectionLostPrompt");
        this.nullableStringAdapter.toJson(tVar, attributes.getConnectionLostPrompt());
        tVar.Z("unsupportedDocumentType");
        this.nullableStringAdapter.toJson(tVar, attributes.getUnsupportedDocumentType());
        tVar.Z("retryError");
        this.nullableStringAdapter.toJson(tVar, attributes.getRetryError());
        tVar.y();
    }
}
