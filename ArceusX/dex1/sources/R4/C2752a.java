package r4;

import android.graphics.Typeface;

public final class C2752a extends f {

    private final Typeface f22894a;

    private final InterfaceC0221a f22895b;

    private boolean f22896c;

    public interface InterfaceC0221a {
        void a(Typeface typeface);
    }

    public C2752a(InterfaceC0221a interfaceC0221a, Typeface typeface) {
        this.f22894a = typeface;
        this.f22895b = interfaceC0221a;
    }

    private void d(Typeface typeface) {
        if (this.f22896c) {
            return;
        }
        this.f22895b.a(typeface);
    }

    @Override
    public void a(int i7) {
        d(this.f22894a);
    }

    @Override
    public void b(Typeface typeface, boolean z7) {
        d(typeface);
    }

    public void c() {
        this.f22896c = true;
    }
}
