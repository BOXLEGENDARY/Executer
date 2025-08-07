package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CapturePageConfig_RuleJsonAdapter extends h<CapturePageConfig.Rule> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<CapturePageConfig.RuleType> nullableRuleTypeAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"type", "isRequired"});

    public CapturePageConfig_RuleJsonAdapter(@NotNull w wVar) {
        this.nullableRuleTypeAdapter = wVar.f(CapturePageConfig.RuleType.class, L.d(), "type");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "isRequired");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig.Rule");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig.Rule m209fromJson(@NotNull m mVar) {
        mVar.e();
        CapturePageConfig.RuleType ruleType = null;
        Boolean bool = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                ruleType = (CapturePageConfig.RuleType) this.nullableRuleTypeAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig.Rule(ruleType, bool);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig.Rule rule) {
        if (rule == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("type");
        this.nullableRuleTypeAdapter.toJson(tVar, rule.getType());
        tVar.Z("isRequired");
        this.nullableBooleanAdapter.toJson(tVar, rule.isRequired());
        tVar.y();
    }
}
