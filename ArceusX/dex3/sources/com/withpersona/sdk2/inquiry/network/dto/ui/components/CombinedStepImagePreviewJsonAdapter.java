package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CombinedStepImagePreviewJsonAdapter extends h<CombinedStepImagePreview> {
    private volatile Constructor<CombinedStepImagePreview> constructorRef;

    @NotNull
    private final h<CombinedStepImagePreview.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle> nullableCombinedStepImagePreviewComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public CombinedStepImagePreviewJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(CombinedStepImagePreview.Attributes.class, L.d(), "attributes");
        this.nullableCombinedStepImagePreviewComponentStyleAdapter = wVar.f(CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CombinedStepImagePreview");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CombinedStepImagePreview m224fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        CombinedStepImagePreview.Attributes attributes = null;
        CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle = null;
        int i = -1;
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
                attributes = (CombinedStepImagePreview.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                combinedStepImagePreviewComponentStyle = (CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle) this.nullableCombinedStepImagePreviewComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new CombinedStepImagePreview(str, attributes, combinedStepImagePreviewComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<CombinedStepImagePreview> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CombinedStepImagePreview.class.getDeclaredConstructor(String.class, CombinedStepImagePreview.Attributes.class, CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, combinedStepImagePreviewComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, CombinedStepImagePreview combinedStepImagePreview) {
        if (combinedStepImagePreview == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, combinedStepImagePreview.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, combinedStepImagePreview.getAttributes());
        tVar.Z("styles");
        this.nullableCombinedStepImagePreviewComponentStyleAdapter.toJson(tVar, combinedStepImagePreview.getStyles());
        tVar.y();
    }
}
