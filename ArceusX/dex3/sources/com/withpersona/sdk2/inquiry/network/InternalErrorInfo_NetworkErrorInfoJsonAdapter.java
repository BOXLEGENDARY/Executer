package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends h<InternalErrorInfo.NetworkErrorInfo> {

    @NotNull
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final h<ErrorResponse.Error> nullableErrorAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"code", "message", "isRecoverable", "responseError"});

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, L.d(), "code");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "message");
        this.booleanAdapter = wVar.f(Boolean.TYPE, L.d(), "isRecoverable");
        this.nullableErrorAdapter = wVar.f(ErrorResponse.Error.class, L.d(), "responseError");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(56);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.NetworkErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InternalErrorInfo.NetworkErrorInfo m121fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        Integer num = null;
        String str = null;
        Boolean bool = null;
        ErrorResponse.Error error = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                num = (Integer) this.intAdapter.fromJson(mVar);
                if (num == null) {
                    throw c8.c.x("code", "code", mVar);
                }
            } else if (iP0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(mVar);
                if (bool == null) {
                    throw c8.c.x("isRecoverable", "isRecoverable", mVar);
                }
            } else if (iP0 == 3) {
                error = (ErrorResponse.Error) this.nullableErrorAdapter.fromJson(mVar);
                i = -9;
            }
        }
        mVar.j();
        if (i == -9) {
            if (num == null) {
                throw c8.c.o("code", "code", mVar);
            }
            int iIntValue = num.intValue();
            if (bool != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, str, bool.booleanValue(), error);
            }
            throw c8.c.o("isRecoverable", "isRecoverable", mVar);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls, c8.c.c);
            this.constructorRef = declaredConstructor;
        }
        if (num == null) {
            throw c8.c.o("code", "code", mVar);
        }
        if (bool != null) {
            return declaredConstructor.newInstance(num, str, bool, error, Integer.valueOf(i), null);
        }
        throw c8.c.o("isRecoverable", "isRecoverable", mVar);
    }

    public void toJson(@NotNull t tVar, InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("code");
        this.intAdapter.toJson(tVar, Integer.valueOf(networkErrorInfo.getCode()));
        tVar.Z("message");
        this.nullableStringAdapter.toJson(tVar, networkErrorInfo.getMessage());
        tVar.Z("isRecoverable");
        this.booleanAdapter.toJson(tVar, Boolean.valueOf(networkErrorInfo.isRecoverable()));
        tVar.Z("responseError");
        this.nullableErrorAdapter.toJson(tVar, networkErrorInfo.getResponseError());
        tVar.y();
    }
}
