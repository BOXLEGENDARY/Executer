package u;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class j {

    private final c f23853a;

    private static class a implements c {

        private final InputConfiguration f23854a;

        a(Object obj) {
            this.f23854a = (InputConfiguration) obj;
        }

        @Override
        public Object b() {
            return this.f23854a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f23854a, ((c) obj).b());
            }
            return false;
        }

        public int hashCode() {
            return this.f23854a.hashCode();
        }

        public String toString() {
            return this.f23854a.toString();
        }
    }

    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    private interface c {
        Object b();
    }

    private j(c cVar) {
        this.f23853a = cVar;
    }

    public static j b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new j(new b(obj)) : new j(new a(obj));
    }

    public Object a() {
        return this.f23853a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f23853a.equals(((j) obj).f23853a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23853a.hashCode();
    }

    public String toString() {
        return this.f23853a.toString();
    }
}
