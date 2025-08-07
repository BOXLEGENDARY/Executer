package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CheckInquiryResponse_DataJsonAdapter extends h<CheckInquiryResponse.Data> {

    @NotNull
    private final h<CheckInquiryResponse.Attributes> attributesAdapter;
    private volatile Constructor<CheckInquiryResponse.Data> constructorRef;

    @NotNull
    private final m.b options = m.b.a(new String[]{"id", "type", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public CheckInquiryResponse_DataJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "id");
        this.attributesAdapter = wVar.f(CheckInquiryResponse.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CheckInquiryResponse.Data");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CheckInquiryResponse.Data m137fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        String str2 = null;
        CheckInquiryResponse.Attributes attributes = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("id", "id", mVar);
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c.x("type", "type", mVar);
                }
            } else if (iP0 == 2) {
                attributes = (CheckInquiryResponse.Attributes) this.attributesAdapter.fromJson(mVar);
                if (attributes == null) {
                    throw c.x("attributes", "attributes", mVar);
                }
                i = -5;
            } else {
                continue;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str == null) {
                throw c.o("id", "id", mVar);
            }
            if (str2 != null) {
                return new CheckInquiryResponse.Data(str, str2, attributes);
            }
            throw c.o("type", "type", mVar);
        }
        Constructor<CheckInquiryResponse.Data> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CheckInquiryResponse.Data.class.getDeclaredConstructor(String.class, String.class, CheckInquiryResponse.Attributes.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str == null) {
            throw c.o("id", "id", mVar);
        }
        if (str2 != null) {
            return declaredConstructor.newInstance(str, str2, attributes, Integer.valueOf(i), null);
        }
        throw c.o("type", "type", mVar);
    }

    public void toJson(@NotNull t tVar, CheckInquiryResponse.Data data) {
        if (data == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("id");
        this.stringAdapter.toJson(tVar, data.getId());
        tVar.Z("type");
        this.stringAdapter.toJson(tVar, data.getType());
        tVar.Z("attributes");
        this.attributesAdapter.toJson(tVar, data.getAttributes());
        tVar.y();
    }
}
