package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface InterfaceC0336k0 {

    public static abstract class a {
        public static a a(int i7, String str, int i8, int i9, int i10, int i11) {
            return new C0323e(i7, str, i8, i9, i10, i11);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract int f();

        public abstract int g();
    }

    public static abstract class b implements InterfaceC0336k0 {
        public static b h(int i7, int i8, List<a> list, List<c> list2) {
            return new C0325f(i7, i8, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    public static abstract class c {
        public static c a(int i7, String str, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            return new C0327g(i7, str, i8, i9, i10, i11, i12, i13, i14, i15);
        }

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract int h();

        public abstract String i();

        public abstract int j();

        public abstract int k();
    }

    static String e(int i7) {
        switch (i7) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    static int f(int i7) {
        if (i7 == 3) {
            return 2;
        }
        if (i7 != 4) {
            return i7 != 5 ? -1 : 39;
        }
        return 5;
    }

    static String g(int i7) {
        switch (i7) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    int a();

    int b();

    List<a> c();

    List<c> d();
}
