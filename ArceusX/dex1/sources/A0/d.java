package A0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class d {

    private final b f4a;

    private static final class a implements b {

        final InputContentInfo f5a;

        a(Object obj) {
            this.f5a = (InputContentInfo) obj;
        }

        @Override
        public Uri a() {
            return this.f5a.getContentUri();
        }

        @Override
        public void b() {
            this.f5a.requestPermission();
        }

        @Override
        public Uri c() {
            return this.f5a.getLinkUri();
        }

        @Override
        public Object d() {
            return this.f5a;
        }

        @Override
        public ClipDescription getDescription() {
            return this.f5a.getDescription();
        }
    }

    private interface b {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    private d(b bVar) {
        this.f4a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f4a.a();
    }

    public ClipDescription b() {
        return this.f4a.getDescription();
    }

    public Uri c() {
        return this.f4a.c();
    }

    public void d() {
        this.f4a.b();
    }

    public Object e() {
        return this.f4a.d();
    }
}
