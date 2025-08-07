package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class q extends l {

    private final Object f19220d;

    public q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f19220d = bool;
    }

    private static boolean w(q qVar) {
        Object obj = qVar.f19220d;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f19220d instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f19220d == null) {
            return qVar.f19220d == null;
        }
        if (w(this) && w(qVar)) {
            return ((this.f19220d instanceof BigInteger) || (qVar.f19220d instanceof BigInteger)) ? o().equals(qVar.o()) : t().longValue() == qVar.t().longValue();
        }
        Object obj2 = this.f19220d;
        if (obj2 instanceof Number) {
            Object obj3 = qVar.f19220d;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return n().compareTo(qVar.n()) == 0;
                }
                double dQ = q();
                double dQ2 = qVar.q();
                if (dQ != dQ2) {
                    return Double.isNaN(dQ) && Double.isNaN(dQ2);
                }
                return true;
            }
        }
        return obj2.equals(qVar.f19220d);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f19220d == null) {
            return 31;
        }
        if (w(this)) {
            jDoubleToLongBits = t().longValue();
        } else {
            Object obj = this.f19220d;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(t().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal n() {
        Object obj = this.f19220d;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(u());
    }

    public BigInteger o() {
        Object obj = this.f19220d;
        return obj instanceof BigInteger ? (BigInteger) obj : w(this) ? BigInteger.valueOf(t().longValue()) : NumberLimits.parseBigInteger(u());
    }

    public boolean p() {
        return v() ? ((Boolean) this.f19220d).booleanValue() : Boolean.parseBoolean(u());
    }

    public double q() {
        return x() ? t().doubleValue() : Double.parseDouble(u());
    }

    public int r() {
        return x() ? t().intValue() : Integer.parseInt(u());
    }

    public long s() {
        return x() ? t().longValue() : Long.parseLong(u());
    }

    public Number t() {
        Object obj = this.f19220d;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String u() {
        Object obj = this.f19220d;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (x()) {
            return t().toString();
        }
        if (v()) {
            return ((Boolean) this.f19220d).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f19220d.getClass());
    }

    public boolean v() {
        return this.f19220d instanceof Boolean;
    }

    public boolean x() {
        return this.f19220d instanceof Number;
    }

    public q(Number number) {
        Objects.requireNonNull(number);
        this.f19220d = number;
    }

    public q(String str) {
        Objects.requireNonNull(str);
        this.f19220d = str;
    }
}
