package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CapturePageConfig_AutoCaptureConfigJsonAdapter extends h<CapturePageConfig.AutoCaptureConfig> {

    @NotNull
    private final h<List<CapturePageConfig.RuleSet>> nullableListOfRuleSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"ruleSets"});

    public CapturePageConfig_AutoCaptureConfigJsonAdapter(@NotNull w wVar) {
        this.nullableListOfRuleSetAdapter = wVar.f(A.j(List.class, new Type[]{CapturePageConfig.RuleSet.class}), L.d(), "ruleSets");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig.AutoCaptureConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig.AutoCaptureConfig m206fromJson(@NotNull m mVar) {
        mVar.e();
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfRuleSetAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig.AutoCaptureConfig(list);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
        if (autoCaptureConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("ruleSets");
        this.nullableListOfRuleSetAdapter.toJson(tVar, autoCaptureConfig.getRuleSets());
        tVar.y();
    }
}
