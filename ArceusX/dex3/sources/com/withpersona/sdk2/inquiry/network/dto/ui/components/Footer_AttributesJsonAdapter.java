package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Footer_AttributesJsonAdapter extends h<Footer.Attributes> {
    private volatile Constructor<Footer.Attributes> constructorRef;

    @NotNull
    private final h<List<UiComponentConfig>> listOfUiComponentConfigAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"children", "firstBelowTheFoldChildIndex"});

    public Footer_AttributesJsonAdapter(@NotNull w wVar) {
        this.listOfUiComponentConfigAdapter = wVar.f(A.j(List.class, new Type[]{UiComponentConfig.class}), L.d(), "children");
        this.nullableIntAdapter = wVar.f(Integer.class, L.d(), "firstBelowTheFoldChildIndex");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Footer.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Footer.Attributes m238fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        List list = null;
        Integer num = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.listOfUiComponentConfigAdapter.fromJson(mVar);
                if (list == null) {
                    throw c.x("children", "children", mVar);
                }
                i &= -2;
            } else if (iP0 == 1) {
                num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                i &= -3;
            }
        }
        mVar.j();
        if (i == -4) {
            return new Footer.Attributes(list, num);
        }
        Constructor<Footer.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Footer.Attributes.class.getDeclaredConstructor(List.class, Integer.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(list, num, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, Footer.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("children");
        this.listOfUiComponentConfigAdapter.toJson(tVar, attributes.getChildren());
        tVar.Z("firstBelowTheFoldChildIndex");
        this.nullableIntAdapter.toJson(tVar, attributes.getFirstBelowTheFoldChildIndex());
        tVar.y();
    }
}
