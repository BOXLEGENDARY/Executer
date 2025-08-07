package B5;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2649g;
import z5.d;

public class a implements d {

    public static final a f358d = new C0004a().a();

    private final Executor f360b;

    final AtomicReference f359a = new AtomicReference();

    private final String f361c = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    public static class C0004a {

        private Executor f362a;

        public a a() {
            return new a(this.f362a, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }
    }

    public a(Executor executor, String str) {
        this.f360b = executor;
    }

    @Override
    public final Executor a() {
        return this.f360b;
    }

    @Override
    public final String b() {
        return "en";
    }

    @Override
    public final String c() {
        return true != g() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final String e() {
        return this.f361c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return C2649g.b(this.f360b, ((a) obj).f360b);
        }
        return false;
    }

    @Override
    public final String f() {
        return "optional-module-text-latin";
    }

    @Override
    public final boolean g() {
        return A5.a.a(this.f359a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override
    public final int h() {
        return g() ? 24317 : 24306;
    }

    public int hashCode() {
        return C2649g.c(this.f360b);
    }

    @Override
    public final String i() {
        return true != g() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }
}
