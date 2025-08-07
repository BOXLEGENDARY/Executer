package I8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LI8/h;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h {

    @com.squareup.moshi.g(name = "transition")
    public static final h d = new h("Transition", 0);

    @com.squareup.moshi.g(name = "transition-back")
    public static final h e = new h("TransitionBack", 1);

    @com.squareup.moshi.g(name = "document-files-post")
    public static final h i = new h("DocumentFilesPost", 2);

    @com.squareup.moshi.g(name = "document-files-delete")
    public static final h v = new h("DocumentFilesDelete", 3);
    private static final h[] w;
    private static final T9.a y;

    static {
        h[] hVarArrC = c();
        w = hVarArrC;
        y = T9.b.a(hVarArrC);
    }

    private h(String str, int i2) {
    }

    private static final h[] c() {
        return new h[]{d, e, i, v};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) w.clone();
    }
}
