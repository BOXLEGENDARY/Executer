package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class n {

    private final J0.b f10884a;

    private final char[] f10885b;

    private final a f10886c = new a(1024);

    private final Typeface f10887d;

    static class a {

        private final SparseArray<a> f10888a;

        private h f10889b;

        private a() {
            this(1);
        }

        a a(int i7) {
            SparseArray<a> sparseArray = this.f10888a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i7);
        }

        final h b() {
            return this.f10889b;
        }

        void c(h hVar, int i7, int i8) {
            a aVarA = a(hVar.b(i7));
            if (aVarA == null) {
                aVarA = new a();
                this.f10888a.put(hVar.b(i7), aVarA);
            }
            if (i8 > i7) {
                aVarA.c(hVar, i7 + 1, i8);
            } else {
                aVarA.f10889b = hVar;
            }
        }

        a(int i7) {
            this.f10888a = new SparseArray<>(i7);
        }
    }

    private n(Typeface typeface, J0.b bVar) {
        this.f10887d = typeface;
        this.f10884a = bVar;
        this.f10885b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(J0.b bVar) {
        int iK = bVar.k();
        for (int i7 = 0; i7 < iK; i7++) {
            h hVar = new h(this, i7);
            Character.toChars(hVar.f(), this.f10885b, i7 * 2);
            h(hVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            u0.m.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            u0.m.b();
        }
    }

    public char[] c() {
        return this.f10885b;
    }

    public J0.b d() {
        return this.f10884a;
    }

    int e() {
        return this.f10884a.l();
    }

    a f() {
        return this.f10886c;
    }

    Typeface g() {
        return this.f10887d;
    }

    void h(h hVar) {
        x0.g.h(hVar, "emoji metadata cannot be null");
        x0.g.b(hVar.c() > 0, "invalid metadata codepoint length");
        this.f10886c.c(hVar, 0, hVar.c() - 1);
    }
}
