package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.InterfaceC2320c;
import java.util.Set;
import z4.C3081g;

final class V extends InterfaceC2320c.d {

    private final String f18819a;

    private final Set f18820b;

    V(String str, Set set, C3081g c3081g) {
        this.f18819a = str;
        this.f18820b = set;
    }

    @Override
    public final String b() {
        return this.f18819a;
    }

    @Override
    public final Set<Integer> c() {
        return this.f18820b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2320c.d) {
            InterfaceC2320c.d dVar = (InterfaceC2320c.d) obj;
            String str = this.f18819a;
            if (str != null ? str.equals(dVar.b()) : dVar.b() == null) {
                if (this.f18820b.equals(dVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18819a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f18820b.hashCode();
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f18819a + ", verdictOptOut=" + this.f18820b.toString() + "}";
    }
}
