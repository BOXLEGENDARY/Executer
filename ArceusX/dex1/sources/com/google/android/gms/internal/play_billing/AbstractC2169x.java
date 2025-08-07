package com.google.android.gms.internal.play_billing;

abstract class AbstractC2169x implements A0 {
    AbstractC2169x() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            return a().equals(((A0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
