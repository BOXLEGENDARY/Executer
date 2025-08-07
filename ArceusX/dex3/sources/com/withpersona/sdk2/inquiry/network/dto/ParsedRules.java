package com.withpersona.sdk2.inquiry.network.dto;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

abstract class ParsedRules {

    public static final class ComplexRules extends ParsedRules {

        @NotNull
        private final Map<String, Object> expression;

        public ComplexRules(@NotNull Map<String, ? extends Object> map) {
            super(null);
            this.expression = map;
        }

        public static ComplexRules copy$default(ComplexRules complexRules, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = complexRules.expression;
            }
            return complexRules.copy(map);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.expression;
        }

        @NotNull
        public final ComplexRules copy(@NotNull Map<String, ? extends Object> map) {
            return new ComplexRules(map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComplexRules) && Intrinsics.b(this.expression, ((ComplexRules) obj).expression);
        }

        @NotNull
        public final Map<String, Object> getExpression() {
            return this.expression;
        }

        public int hashCode() {
            return this.expression.hashCode();
        }

        @NotNull
        public String toString() {
            return "ComplexRules(expression=" + this.expression + ")";
        }
    }

    public static final class PrimitiveRule extends ParsedRules {

        @NotNull
        private final Object value;

        public PrimitiveRule(@NotNull Object obj) {
            super(null);
            this.value = obj;
        }

        public static PrimitiveRule copy$default(PrimitiveRule primitiveRule, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = primitiveRule.value;
            }
            return primitiveRule.copy(obj);
        }

        @NotNull
        public final Object component1() {
            return this.value;
        }

        @NotNull
        public final PrimitiveRule copy(@NotNull Object obj) {
            return new PrimitiveRule(obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimitiveRule) && Intrinsics.b(this.value, ((PrimitiveRule) obj).value);
        }

        @NotNull
        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "PrimitiveRule(value=" + this.value + ")";
        }
    }

    public ParsedRules(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedRules() {
    }
}
