package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends h<InternalErrorInfo.NoDiskSpaceErrorInfo> {
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;

    @NotNull
    private final m.b options = m.b.a(new String[]{"message"});

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.NoDiskSpaceErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InternalErrorInfo.NoDiskSpaceErrorInfo m122fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c8.c.x("message", "message", mVar);
                }
                i = -2;
            } else {
                continue;
            }
        }
        mVar.j();
        if (i == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(str);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, c8.c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(str, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("message");
        this.stringAdapter.toJson(tVar, noDiskSpaceErrorInfo.getMessage());
        tVar.y();
    }
}
