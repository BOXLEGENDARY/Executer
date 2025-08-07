package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GovernmentIdNfcScanJsonAdapter extends h<GovernmentIdNfcScan> {

    @NotNull
    private final h<GovernmentIdNfcScan.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<GovernmentIdNfcScan.GovernmentIdNfcScanStyles> nullableGovernmentIdNfcScanStylesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public GovernmentIdNfcScanJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(GovernmentIdNfcScan.Attributes.class, L.d(), "attributes");
        this.nullableGovernmentIdNfcScanStylesAdapter = wVar.f(GovernmentIdNfcScan.GovernmentIdNfcScanStyles.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GovernmentIdNfcScan");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GovernmentIdNfcScan m241fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        GovernmentIdNfcScan.Attributes attributes = null;
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                attributes = (GovernmentIdNfcScan.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                governmentIdNfcScanStyles = (GovernmentIdNfcScan.GovernmentIdNfcScanStyles) this.nullableGovernmentIdNfcScanStylesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new GovernmentIdNfcScan(str, attributes, governmentIdNfcScanStyles);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, GovernmentIdNfcScan governmentIdNfcScan) {
        if (governmentIdNfcScan == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, governmentIdNfcScan.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, governmentIdNfcScan.getAttributes());
        tVar.Z("styles");
        this.nullableGovernmentIdNfcScanStylesAdapter.toJson(tVar, governmentIdNfcScan.getStyles());
        tVar.y();
    }
}
