package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"min_dimension_size", "max_dimension_size"});

    public GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, L.d(), "minDimensionSize");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(113);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details m108fromJson(@NotNull m mVar) throws j {
        mVar.e();
        Integer num = null;
        Integer num2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                num = (Integer) this.intAdapter.fromJson(mVar);
                if (num == null) {
                    throw c8.c.x("minDimensionSize", "min_dimension_size", mVar);
                }
            } else if (iP0 == 1 && (num2 = (Integer) this.intAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("maxDimensionSize", "max_dimension_size", mVar);
            }
        }
        mVar.j();
        if (num == null) {
            throw c8.c.o("minDimensionSize", "min_dimension_size", mVar);
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(iIntValue, num2.intValue());
        }
        throw c8.c.o("maxDimensionSize", "max_dimension_size", mVar);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("min_dimension_size");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getMinDimensionSize()));
        tVar.Z("max_dimension_size");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getMaxDimensionSize()));
        tVar.y();
    }
}
