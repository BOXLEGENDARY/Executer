package com.withpersona.sdk2.inquiry.network.dto;

import P9.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ParsedRules;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;

public final class JsonLogicBoolean$parsedRules$2 extends l implements Function0<ParsedRules> {
    final JsonLogicBoolean this$0;

    public JsonLogicBoolean$parsedRules$2(JsonLogicBoolean jsonLogicBoolean) {
        super(0);
        this.this$0 = jsonLogicBoolean;
    }

    public final ParsedRules m140invoke() {
        Object objFromJson = new w.b().d().c(Object.class).nullSafe().lenient().fromJson(this.this$0.getRule());
        if (!(objFromJson instanceof Map)) {
            if (objFromJson instanceof Boolean) {
                return new ParsedRules.PrimitiveRule(objFromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            Object key = entry.getKey();
            Pair pairA = key instanceof String ? t.a(key, entry.getValue()) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return new ParsedRules.ComplexRules(F.q(arrayList));
    }
}
