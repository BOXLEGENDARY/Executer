package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_DigitalIdRequestJsonAdapter extends h<NextStep.GovernmentId.DigitalIdRequest> {

    @NotNull
    private final h<Map<String, Integer>> nullableMapOfStringIntAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"idType", "minAge", "elementToStoreLength"});

    public NextStep_GovernmentId_DigitalIdRequestJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "idType");
        this.nullableMapOfStringIntAdapter = wVar.f(A.j(Map.class, new Type[]{String.class, Integer.class}), L.d(), "elementToStoreLength");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.DigitalIdRequest");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.DigitalIdRequest m178fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        Map map = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                map = (Map) this.nullableMapOfStringIntAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.GovernmentId.DigitalIdRequest(str, str2, map);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.DigitalIdRequest digitalIdRequest) {
        if (digitalIdRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("idType");
        this.nullableStringAdapter.toJson(tVar, digitalIdRequest.getIdType());
        tVar.Z("minAge");
        this.nullableStringAdapter.toJson(tVar, digitalIdRequest.getMinAge());
        tVar.Z("elementToStoreLength");
        this.nullableMapOfStringIntAdapter.toJson(tVar, digitalIdRequest.getElementToStoreLength());
        tVar.y();
    }
}
