package C;

import C.InterfaceC0336k0;

final class C0323e extends InterfaceC0336k0.a {

    private final int f541a;

    private final String f542b;

    private final int f543c;

    private final int f544d;

    private final int f545e;

    private final int f546f;

    C0323e(int i7, String str, int i8, int i9, int i10, int i11) {
        this.f541a = i7;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f542b = str;
        this.f543c = i8;
        this.f544d = i9;
        this.f545e = i10;
        this.f546f = i11;
    }

    @Override
    public int b() {
        return this.f543c;
    }

    @Override
    public int c() {
        return this.f545e;
    }

    @Override
    public int d() {
        return this.f541a;
    }

    @Override
    public String e() {
        return this.f542b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC0336k0.a)) {
            return false;
        }
        InterfaceC0336k0.a aVar = (InterfaceC0336k0.a) obj;
        return this.f541a == aVar.d() && this.f542b.equals(aVar.e()) && this.f543c == aVar.b() && this.f544d == aVar.g() && this.f545e == aVar.c() && this.f546f == aVar.f();
    }

    @Override
    public int f() {
        return this.f546f;
    }

    @Override
    public int g() {
        return this.f544d;
    }

    public int hashCode() {
        return ((((((((((this.f541a ^ 1000003) * 1000003) ^ this.f542b.hashCode()) * 1000003) ^ this.f543c) * 1000003) ^ this.f544d) * 1000003) ^ this.f545e) * 1000003) ^ this.f546f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f541a + ", mediaType=" + this.f542b + ", bitrate=" + this.f543c + ", sampleRate=" + this.f544d + ", channels=" + this.f545e + ", profile=" + this.f546f + "}";
    }
}
