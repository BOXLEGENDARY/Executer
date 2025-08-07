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

public final class CapturePageConfig_RuleSetJsonAdapter extends h<CapturePageConfig.RuleSet> {

    @NotNull
    private final h<List<CapturePageConfig.Rule>> nullableListOfRuleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"rules"});

    public CapturePageConfig_RuleSetJsonAdapter(@NotNull w wVar) {
        this.nullableListOfRuleAdapter = wVar.f(A.j(List.class, new Type[]{CapturePageConfig.Rule.class}), L.d(), "rules");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig.RuleSet");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig.RuleSet m210fromJson(@NotNull m mVar) {
        mVar.e();
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfRuleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig.RuleSet(list);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig.RuleSet ruleSet) {
        if (ruleSet == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("rules");
        this.nullableListOfRuleAdapter.toJson(tVar, ruleSet.getRules());
        tVar.y();
    }
}
