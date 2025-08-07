package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Id_IdIconJsonAdapter extends h<Id.IdIcon> {

    @NotNull
    private final h<Id.IdLocalIcon> nullableIdLocalIconAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"iconFallback"});

    public Id_IdIconJsonAdapter(@NotNull w wVar) {
        this.nullableIdLocalIconAdapter = wVar.f(Id.IdLocalIcon.class, L.d(), "iconFallback");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Id.IdIcon");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Id.IdIcon m212fromJson(@NotNull m mVar) {
        mVar.e();
        Id.IdLocalIcon idLocalIcon = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                idLocalIcon = (Id.IdLocalIcon) this.nullableIdLocalIconAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new Id.IdIcon(idLocalIcon);
    }

    public void toJson(@NotNull t tVar, Id.IdIcon idIcon) {
        if (idIcon == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("iconFallback");
        this.nullableIdLocalIconAdapter.toJson(tVar, idIcon.getIconFallback());
        tVar.y();
    }
}
