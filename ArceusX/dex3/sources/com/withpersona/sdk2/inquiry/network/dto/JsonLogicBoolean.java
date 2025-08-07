package com.withpersona.sdk2.inquiry.network.dto;

import P9.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import com.withpersona.sdk2.inquiry.network.dto.ParsedRules;
import defpackage.g;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = false)
public final class JsonLogicBoolean implements Parcelable {

    @NotNull
    private final h parsedRules$delegate = P9.i.b(new JsonLogicBoolean$parsedRules$2(this));

    @NotNull
    private final String rule;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    public static final class Companion extends com.squareup.moshi.h<JsonLogicBoolean> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @z
        public void toJson(@NotNull t tVar, JsonLogicBoolean jsonLogicBoolean) {
        }

        private Companion() {
        }

        @f
        @NotNull
        public JsonLogicBoolean m139fromJson(@NotNull m mVar) {
            return new JsonLogicBoolean(mVar.k0().C0().K());
        }
    }

    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        @Override
        @NotNull
        public final JsonLogicBoolean createFromParcel(@NotNull Parcel parcel) {
            return new JsonLogicBoolean(parcel.readString());
        }

        @Override
        @NotNull
        public final JsonLogicBoolean[] newArray(int i) {
            return new JsonLogicBoolean[i];
        }
    }

    public JsonLogicBoolean(@NotNull String str) {
        this.rule = str;
    }

    public static JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    private final ParsedRules getParsedRules() {
        return (ParsedRules) this.parsedRules$delegate.getValue();
    }

    @g(ignore = true)
    private static void getParsedRules$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.rule;
    }

    @NotNull
    public final JsonLogicBoolean copy(@NotNull String str) {
        return new JsonLogicBoolean(str);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsonLogicBoolean) && Intrinsics.b(this.rule, ((JsonLogicBoolean) obj).rule);
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    public final Boolean getValue(@NotNull Map<String, ? extends Object> map, Object obj) throws P9.m {
        ParsedRules parsedRules = getParsedRules();
        if (parsedRules == null) {
            return null;
        }
        if (!(parsedRules instanceof ParsedRules.ComplexRules)) {
            if (!(parsedRules instanceof ParsedRules.PrimitiveRule)) {
                throw new P9.m();
            }
            ParsedRules.PrimitiveRule primitiveRule = (ParsedRules.PrimitiveRule) parsedRules;
            if (primitiveRule.getValue() instanceof Boolean) {
                return (Boolean) primitiveRule.getValue();
            }
            return null;
        }
        defpackage.g gVarA = JsonLogicBooleanKt.getJsonLogicEngine().a(((ParsedRules.ComplexRules) parsedRules).getExpression(), F.k(new Pair[]{P9.t.a("form", map), P9.t.a("value", obj)}));
        if (!(gVarA instanceof g.Success)) {
            if (Intrinsics.b(gVarA, g.a.c.a) ? true : Intrinsics.b(gVarA, g.a.C0229a.a) ? true : Intrinsics.b(gVarA, g.a.b.a)) {
                return null;
            }
            throw new P9.m();
        }
        Object value = ((g.Success) gVarA).getValue();
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        return null;
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    @NotNull
    public String toString() {
        return "JsonLogicBoolean(rule=" + this.rule + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        parcel.writeString(this.rule);
    }
}
