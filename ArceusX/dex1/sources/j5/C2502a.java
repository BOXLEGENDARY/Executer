package j5;

import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;

final class C2502a extends f {

    private final String f21145a;

    private final String f21146b;

    C2502a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(KwdswzaUHE.klrkYIQmMcaf);
        }
        this.f21145a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f21146b = str2;
    }

    @Override
    public String b() {
        return this.f21145a;
    }

    @Override
    public String c() {
        return this.f21146b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21145a.equals(fVar.b()) && this.f21146b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f21145a.hashCode() ^ 1000003) * 1000003) ^ this.f21146b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f21145a + ", version=" + this.f21146b + "}";
    }
}
