package u5;

import P9.h;
import P9.i;
import P9.m;
import P9.o;
import P9.p;
import T9.a;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import u5.G;
import u5.J;
import w5.e;
import w5.f;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0002\u000f)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0013*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0011*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J)\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010#\u001a\u00020(ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Ll8/K;", "", "<init>", "()V", "Ll8/K$b;", "type", "Landroid/graphics/Bitmap;", "bitmap", "Ll8/J;", "g", "(Ll8/K$b;Landroid/graphics/Bitmap;)Ll8/J;", "Ll8/y;", "imageToAnalyze", "poseType", "LP9/o;", "a", "(Ll8/y;Ll8/K$b;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "imageRect", "", "i", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "j", "k", "Lw5/a;", "h", "(Lw5/a;Landroid/graphics/Rect;)Z", "Lu5/a;", "e", "(Lu5/a;)Landroid/graphics/Rect;", "requireStrictSelfie", "", "l", "(Z)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "d", "(Landroid/media/Image;I)Ljava/lang/Object;", "Landroidx/camera/core/n;", "b", "(Landroidx/camera/core/n;)Ljava/lang/Object;", "c", "(Ll8/y;)Ljava/lang/Object;", "", "D", "minFaceRatio", "Lw5/d;", "LP9/h;", "f", "()Lw5/d;", "faceDetector", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class K {

    private double minFaceRatio = 0.35d;

    @NotNull
    private final h faceDetector = i.b(d.d);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ll8/K$b;", "", "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class b {
        public static final b d = new b("Center", 0);
        public static final b e = new b("Left", 1);
        public static final b i = new b("Right", 2);
        private static final b[] v;
        private static final a w;

        static {
            b[] bVarArrC = c();
            v = bVarArrC;
            w = T9.b.a(bVarArrC);
        }

        private b(String str, int i2) {
        }

        private static final b[] c() {
            return new b[]{d, e, i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class c {
        public static final int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw5/d;", "a", "()Lw5/d;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends l implements Function0<w5.d> {
        public static final d d = new d();

        d() {
            super(0);
        }

        @NotNull
        public final w5.d invoke() {
            w5.d dVarA = w5.c.a(new e.a().c(0.35f).b(2).a());
            Intrinsics.checkNotNullExpressionValue(dVarA, "getClient(...)");
            return dVarA;
        }
    }

    private final Object a(y imageToAnalyze, b poseType) {
        Bitmap bitmapE = imageToAnalyze.e();
        if (bitmapE != null) {
            return o.b(g(poseType, bitmapE));
        }
        o.a aVar = o.e;
        return o.b(p.a(new RuntimeException("Error converting bitmap")));
    }

    private final Rect e(a aVar) {
        return (aVar.l() == 90 || aVar.l() == 270) ? new Rect(0, 0, aVar.i(), aVar.m()) : new Rect(0, 0, aVar.m(), aVar.i());
    }

    private final w5.d f() {
        return (w5.d) this.faceDetector.getValue();
    }

    private final J g(b type, Bitmap bitmap) throws m {
        int i = c.a[type.ordinal()];
        if (i == 1) {
            return new J.a(bitmap);
        }
        if (i == 2) {
            return new J.b(bitmap);
        }
        if (i == 3) {
            return new J.c(bitmap);
        }
        throw new m();
    }

    private final boolean h(w5.a aVar, Rect rect) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        f fVarD = aVar.d(6);
        if (fVarD == null) {
            return false;
        }
        double d2 = iWidth / 2;
        double dMin = (Math.min(iWidth, iHeight) * 0.4d) / 2;
        double d3 = iHeight / 2;
        return new Rect((int) (d2 - dMin), (int) (d3 - dMin), (int) (d2 + dMin), (int) (d3 + dMin)).contains((int) fVarD.a().x, (int) fVarD.a().y);
    }

    private final boolean i(Rect rect, Rect rect2) {
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        int i = iWidth / 2;
        int i2 = iHeight / 2;
        int iMin = Math.min(iWidth, iHeight) / 2;
        Rect rect3 = new Rect(0, 0, iWidth, iHeight);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(kotlin.ranges.b.c(rect2.width() - rect.right, 1) - kotlin.ranges.b.c(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i - iMin && rect.right < i + iMin && rect.top > i2 - iMin && rect.bottom < i2 + iMin;
    }

    private final boolean j(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * 0.8d;
    }

    private final boolean k(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * this.minFaceRatio;
    }

    @NotNull
    public final Object b(@NotNull n image) {
        Intrinsics.checkNotNullParameter(image, "image");
        y yVarE = z.e(image);
        if (yVarE != null) {
            return c(yVarE);
        }
        o.a aVar = o.e;
        return o.b(p.a(new RuntimeException("Null input image")));
    }

    @NotNull
    public final Object c(@NotNull y imageToAnalyze) {
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        a aVarD = imageToAnalyze.d();
        Rect rectE = e(aVarD);
        Task taskD = f().d(aVarD);
        Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
        try {
            a4.m.a(taskD);
            List list = (List) taskD.k();
            if (list.isEmpty()) {
                o.a aVar = o.e;
                return o.b(p.a(new G.g()));
            }
            if (list.size() != 1) {
                o.a aVar2 = o.e;
                return o.b(p.a(new G.f()));
            }
            Intrinsics.d(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Rect rectA = ((w5.a) obj).a();
                Intrinsics.checkNotNullExpressionValue(rectA, "getBoundingBox(...)");
                if (!j(rectA, rectE)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                o.a aVar3 = o.e;
                return o.b(p.a(new G.c()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Rect rectA2 = ((w5.a) obj2).a();
                Intrinsics.checkNotNullExpressionValue(rectA2, "getBoundingBox(...)");
                if (!k(rectA2, rectE)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                o.a aVar4 = o.e;
                return o.b(p.a(new G.d()));
            }
            Object objK = taskD.k();
            Intrinsics.checkNotNullExpressionValue(objK, "getResult(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) objK) {
                Rect rectA3 = ((w5.a) obj3).a();
                Intrinsics.checkNotNullExpressionValue(rectA3, "getBoundingBox(...)");
                if (i(rectA3, rectE)) {
                    arrayList3.add(obj3);
                }
            }
            if (arrayList3.isEmpty()) {
                o.a aVar5 = o.e;
                return o.b(p.a(new G.b()));
            }
            w5.a aVar6 = (w5.a) arrayList3.get(0);
            float fC = aVar6.c();
            if (-10.0f < fC && fC < 10.0f) {
                Intrinsics.d(aVar6);
                if (h(aVar6, rectE)) {
                    return a(imageToAnalyze, b.d);
                }
                o.a aVar7 = o.e;
                return o.b(p.a(new G.b()));
            }
            if (fC < -15.0f) {
                return a(imageToAnalyze, b.i);
            }
            if (15.0f < fC) {
                return a(imageToAnalyze, b.e);
            }
            o.a aVar8 = o.e;
            return o.b(p.a(new G.e()));
        } catch (ExecutionException unused) {
            o.a aVar9 = o.e;
            return o.b(p.a(new G.a()));
        }
    }

    @NotNull
    public final Object d(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        return c(z.d(image, rotationDegrees));
    }

    public final void l(boolean requireStrictSelfie) {
        this.minFaceRatio = requireStrictSelfie ? 0.45d : 0.35d;
    }
}
