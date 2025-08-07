package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class QRCodeJsonAdapter extends h<QRCode> {
    private volatile Constructor<QRCode> constructorRef;

    @NotNull
    private final h<QRCode.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<QRCode.QRCodeComponentStyle> nullableQRCodeComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public QRCodeJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(QRCode.Attributes.class, L.d(), "attributes");
        this.nullableQRCodeComponentStyleAdapter = wVar.f(QRCode.QRCodeComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("QRCode");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public QRCode m292fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        QRCode.Attributes attributes = null;
        QRCode.QRCodeComponentStyle qRCodeComponentStyle = null;
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
                attributes = (QRCode.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                qRCodeComponentStyle = (QRCode.QRCodeComponentStyle) this.nullableQRCodeComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new QRCode(str, attributes, qRCodeComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<QRCode> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QRCode.class.getDeclaredConstructor(String.class, QRCode.Attributes.class, QRCode.QRCodeComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, qRCodeComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, QRCode qRCode) {
        if (qRCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, qRCode.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, qRCode.getAttributes());
        tVar.Z("styles");
        this.nullableQRCodeComponentStyleAdapter.toJson(tVar, qRCode.getStyles());
        tVar.y();
    }
}
