package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"page_limit"});

    public GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, L.d(), "pageLimit");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(105);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details m116fromJson(@NotNull m mVar) throws j {
        mVar.e();
        Integer num = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (num = (Integer) this.intAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("pageLimit", "page_limit", mVar);
            }
        }
        mVar.j();
        if (num != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details(num.intValue());
        }
        throw c8.c.o("pageLimit", "page_limit", mVar);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("page_limit");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getPageLimit()));
        tVar.y();
    }
}
