package androidx.core.view;

import H3.QdLC.QcdySgfdST;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

public final class C1611d {

    private final f f10650a;

    public static final class a {

        private final c f10651a;

        public a(ClipData clipData, int i7) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f10651a = new b(clipData, i7);
            } else {
                this.f10651a = new C0088d(clipData, i7);
            }
        }

        public C1611d a() {
            return this.f10651a.a();
        }

        public a b(Bundle bundle) {
            this.f10651a.setExtras(bundle);
            return this;
        }

        public a c(int i7) {
            this.f10651a.c(i7);
            return this;
        }

        public a d(Uri uri) {
            this.f10651a.b(uri);
            return this;
        }
    }

    private static final class b implements c {

        private final ContentInfo.Builder f10652a;

        b(ClipData clipData, int i7) {
            this.f10652a = C1617g.a(clipData, i7);
        }

        @Override
        public C1611d a() {
            return new C1611d(new e(this.f10652a.build()));
        }

        @Override
        public void b(Uri uri) {
            this.f10652a.setLinkUri(uri);
        }

        @Override
        public void c(int i7) {
            this.f10652a.setFlags(i7);
        }

        @Override
        public void setExtras(Bundle bundle) {
            this.f10652a.setExtras(bundle);
        }
    }

    private interface c {
        C1611d a();

        void b(Uri uri);

        void c(int i7);

        void setExtras(Bundle bundle);
    }

    private static final class C0088d implements c {

        ClipData f10653a;

        int f10654b;

        int f10655c;

        Uri f10656d;

        Bundle f10657e;

        C0088d(ClipData clipData, int i7) {
            this.f10653a = clipData;
            this.f10654b = i7;
        }

        @Override
        public C1611d a() {
            return new C1611d(new g(this));
        }

        @Override
        public void b(Uri uri) {
            this.f10656d = uri;
        }

        @Override
        public void c(int i7) {
            this.f10655c = i7;
        }

        @Override
        public void setExtras(Bundle bundle) {
            this.f10657e = bundle;
        }
    }

    private static final class e implements f {

        private final ContentInfo f10658a;

        e(ContentInfo contentInfo) {
            this.f10658a = C1609c.a(x0.g.g(contentInfo));
        }

        @Override
        public ClipData a() {
            return this.f10658a.getClip();
        }

        @Override
        public int b() {
            return this.f10658a.getFlags();
        }

        @Override
        public ContentInfo c() {
            return this.f10658a;
        }

        @Override
        public int d() {
            return this.f10658a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f10658a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    private static final class g implements f {

        private final ClipData f10659a;

        private final int f10660b;

        private final int f10661c;

        private final Uri f10662d;

        private final Bundle f10663e;

        g(C0088d c0088d) {
            this.f10659a = (ClipData) x0.g.g(c0088d.f10653a);
            this.f10660b = x0.g.c(c0088d.f10654b, 0, 5, QcdySgfdST.AlreRRt);
            this.f10661c = x0.g.f(c0088d.f10655c, 1);
            this.f10662d = c0088d.f10656d;
            this.f10663e = c0088d.f10657e;
        }

        @Override
        public ClipData a() {
            return this.f10659a;
        }

        @Override
        public int b() {
            return this.f10661c;
        }

        @Override
        public ContentInfo c() {
            return null;
        }

        @Override
        public int d() {
            return this.f10660b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f10659a.getDescription());
            sb.append(", source=");
            sb.append(C1611d.e(this.f10660b));
            sb.append(", flags=");
            sb.append(C1611d.a(this.f10661c));
            Uri uri = this.f10662d;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + this.f10662d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f10663e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C1611d(f fVar) {
        this.f10650a = fVar;
    }

    static String a(int i7) {
        return (i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7);
    }

    static String e(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C1611d g(ContentInfo contentInfo) {
        return new C1611d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f10650a.a();
    }

    public int c() {
        return this.f10650a.b();
    }

    public int d() {
        return this.f10650a.d();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f10650a.c();
        Objects.requireNonNull(contentInfoC);
        return C1609c.a(contentInfoC);
    }

    public String toString() {
        return this.f10650a.toString();
    }
}
