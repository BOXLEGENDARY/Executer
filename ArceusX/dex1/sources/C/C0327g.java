package C;

import C.InterfaceC0336k0;

final class C0327g extends InterfaceC0336k0.c {

    private final int f586a;

    private final String f587b;

    private final int f588c;

    private final int f589d;

    private final int f590e;

    private final int f591f;

    private final int f592g;

    private final int f593h;

    private final int f594i;

    private final int f595j;

    C0327g(int i7, String str, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f586a = i7;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f587b = str;
        this.f588c = i8;
        this.f589d = i9;
        this.f590e = i10;
        this.f591f = i11;
        this.f592g = i12;
        this.f593h = i13;
        this.f594i = i14;
        this.f595j = i15;
    }

    @Override
    public int b() {
        return this.f593h;
    }

    @Override
    public int c() {
        return this.f588c;
    }

    @Override
    public int d() {
        return this.f594i;
    }

    @Override
    public int e() {
        return this.f586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC0336k0.c)) {
            return false;
        }
        InterfaceC0336k0.c cVar = (InterfaceC0336k0.c) obj;
        return this.f586a == cVar.e() && this.f587b.equals(cVar.i()) && this.f588c == cVar.c() && this.f589d == cVar.f() && this.f590e == cVar.k() && this.f591f == cVar.h() && this.f592g == cVar.j() && this.f593h == cVar.b() && this.f594i == cVar.d() && this.f595j == cVar.g();
    }

    @Override
    public int f() {
        return this.f589d;
    }

    @Override
    public int g() {
        return this.f595j;
    }

    @Override
    public int h() {
        return this.f591f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f586a ^ 1000003) * 1000003) ^ this.f587b.hashCode()) * 1000003) ^ this.f588c) * 1000003) ^ this.f589d) * 1000003) ^ this.f590e) * 1000003) ^ this.f591f) * 1000003) ^ this.f592g) * 1000003) ^ this.f593h) * 1000003) ^ this.f594i) * 1000003) ^ this.f595j;
    }

    @Override
    public String i() {
        return this.f587b;
    }

    @Override
    public int j() {
        return this.f592g;
    }

    @Override
    public int k() {
        return this.f590e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f586a + ", mediaType=" + this.f587b + ", bitrate=" + this.f588c + ", frameRate=" + this.f589d + ", width=" + this.f590e + ", height=" + this.f591f + ", profile=" + this.f592g + ", bitDepth=" + this.f593h + ", chromaSubsampling=" + this.f594i + ", hdrFormat=" + this.f595j + "}";
    }
}
