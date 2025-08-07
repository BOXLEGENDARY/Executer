package com.withpersona.sdk2.inquiry.network.dto.government_id;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class IdJsonAdapter extends h<Id> {

    @NotNull
    private final h<List<String>> listOfStringAdapter;

    @NotNull
    private final h<Id.IdIcon> nullableIdIconAdapter;

    @NotNull
    private final h<List<CapturePageConfig>> nullableListOfCapturePageConfigAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"class", "requiresSides", "icon", "capturePageConfigs"});

    @NotNull
    private final h<String> stringAdapter;

    public IdJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "class");
        this.listOfStringAdapter = wVar.f(A.j(List.class, new Type[]{String.class}), L.d(), "requiresSides");
        this.nullableIdIconAdapter = wVar.f(Id.IdIcon.class, L.d(), "icon");
        this.nullableListOfCapturePageConfigAdapter = wVar.f(A.j(List.class, new Type[]{CapturePageConfig.class}), L.d(), "capturePageConfigs");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(24);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Id");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Id m211fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        List list = null;
        Id.IdIcon idIcon = null;
        List list2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("class_", "class", mVar);
                }
            } else if (iP0 == 1) {
                list = (List) this.listOfStringAdapter.fromJson(mVar);
                if (list == null) {
                    throw c.x("requiresSides", "requiresSides", mVar);
                }
            } else if (iP0 == 2) {
                idIcon = (Id.IdIcon) this.nullableIdIconAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                list2 = (List) this.nullableListOfCapturePageConfigAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("class_", "class", mVar);
        }
        if (list != null) {
            return new Id(str, list, idIcon, list2);
        }
        throw c.o("requiresSides", "requiresSides", mVar);
    }

    public void toJson(@NotNull t tVar, Id id) {
        if (id == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("class");
        this.stringAdapter.toJson(tVar, id.getClass());
        tVar.Z("requiresSides");
        this.listOfStringAdapter.toJson(tVar, id.getRequiresSides());
        tVar.Z("icon");
        this.nullableIdIconAdapter.toJson(tVar, id.getIcon());
        tVar.Z("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(tVar, id.getCapturePageConfigs());
        tVar.y();
    }
}
