package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CheckInquiryResponseJsonAdapter extends h<CheckInquiryResponse> {

    @NotNull
    private final h<CheckInquiryResponse.Data> dataAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"data", "token"});

    public CheckInquiryResponseJsonAdapter(@NotNull w wVar) {
        this.dataAdapter = wVar.f(CheckInquiryResponse.Data.class, L.d(), "data");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "token");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CheckInquiryResponse");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CheckInquiryResponse m135fromJson(@NotNull m mVar) throws j {
        mVar.e();
        CheckInquiryResponse.Data data = null;
        String str = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                data = (CheckInquiryResponse.Data) this.dataAdapter.fromJson(mVar);
                if (data == null) {
                    throw c.x("data_", "data", mVar);
                }
            } else if (iP0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (data != null) {
            return new CheckInquiryResponse(data, str);
        }
        throw c.o("data_", "data", mVar);
    }

    public void toJson(@NotNull t tVar, CheckInquiryResponse checkInquiryResponse) {
        if (checkInquiryResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("data");
        this.dataAdapter.toJson(tVar, checkInquiryResponse.getData());
        tVar.Z("token");
        this.nullableStringAdapter.toJson(tVar, checkInquiryResponse.getToken());
        tVar.y();
    }
}
