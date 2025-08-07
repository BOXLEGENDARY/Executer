package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputInternationalDb_IdTypeJsonAdapter extends h<InputInternationalDb.IdType> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"mask", "placeholder", "secure", "countryName", "countryCode", "idType", "name", "description"});

    public InputInternationalDb_IdTypeJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "mask");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "secure");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputInternationalDb.IdType");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputInternationalDb.IdType m265fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str6 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputInternationalDb.IdType(str, str2, bool, str3, str4, str5, str6, str7);
    }

    public void toJson(@NotNull t tVar, InputInternationalDb.IdType idType) {
        if (idType == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("mask");
        this.nullableStringAdapter.toJson(tVar, idType.getMask());
        tVar.Z("placeholder");
        this.nullableStringAdapter.toJson(tVar, idType.getPlaceholder());
        tVar.Z("secure");
        this.nullableBooleanAdapter.toJson(tVar, idType.getSecure());
        tVar.Z("countryName");
        this.nullableStringAdapter.toJson(tVar, idType.getCountryName());
        tVar.Z("countryCode");
        this.nullableStringAdapter.toJson(tVar, idType.getCountryCode());
        tVar.Z("idType");
        this.nullableStringAdapter.toJson(tVar, idType.getIdType());
        tVar.Z("name");
        this.nullableStringAdapter.toJson(tVar, idType.getName());
        tVar.Z("description");
        this.nullableStringAdapter.toJson(tVar, idType.getDescription());
        tVar.y();
    }
}
