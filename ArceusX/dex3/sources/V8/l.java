package V8;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LV8/l;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "y", "z", "A", "B", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class l {
    private static final l[] C;
    private static final T9.a D;
    public static final l d = new l("FaceNotCentered", 0);
    public static final l e = new l("FaceTooClose", 1);
    public static final l i = new l("FaceTooFar", 2);
    public static final l v = new l("MultipleFaces", 3);
    public static final l w = new l("IncompleteFace", 4);
    public static final l y = new l("FaceNotFound", 5);
    public static final l z = new l("IncorrectPose", 6);
    public static final l A = new l("FaceDetectionUnsupported", 7);
    public static final l B = new l("Other", 8);

    static {
        l[] lVarArrC = c();
        C = lVarArrC;
        D = T9.b.a(lVarArrC);
    }

    private l(String str, int i2) {
    }

    private static final l[] c() {
        return new l[]{d, e, i, v, w, y, z, A, B};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) C.clone();
    }
}
