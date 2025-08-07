package t2;

import android.content.Context;

final class c extends h {

    private final Context f23796a;

    private final C2.a f23797b;

    private final C2.a f23798c;

    private final String f23799d;

    c(Context context, C2.a aVar, C2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f23796a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f23797b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f23798c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f23799d = str;
    }

    @Override
    public Context b() {
        return this.f23796a;
    }

    @Override
    public String c() {
        return this.f23799d;
    }

    @Override
    public C2.a d() {
        return this.f23798c;
    }

    @Override
    public C2.a e() {
        return this.f23797b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f23796a.equals(hVar.b()) && this.f23797b.equals(hVar.e()) && this.f23798c.equals(hVar.d()) && this.f23799d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f23796a.hashCode() ^ 1000003) * 1000003) ^ this.f23797b.hashCode()) * 1000003) ^ this.f23798c.hashCode()) * 1000003) ^ this.f23799d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f23796a + ", wallClock=" + this.f23797b + ", monotonicClock=" + this.f23798c + ", backendName=" + this.f23799d + "}";
    }
}
