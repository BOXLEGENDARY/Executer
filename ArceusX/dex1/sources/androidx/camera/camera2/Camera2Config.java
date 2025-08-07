package androidx.camera.camera2;

import C.G;
import C.H;
import C.S;
import C.p1;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import s.C2769F0;
import s.C2858w;
import s.K0;
import z.C3039b0;
import z.C3061p;
import z.C3067w;
import z.r;

public final class Camera2Config {

    public static final class DefaultProvider implements C3067w.b {
        @Override
        public C3067w getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static C3067w c() {
        H.a aVar = new H.a() {
            @Override
            public final H a(Context context, S s7, C3061p c3061p, long j7) {
                return new C2858w(context, s7, c3061p, j7);
            }
        };
        G.a aVar2 = new G.a() {
            @Override
            public final G a(Context context, Object obj, Set set) {
                return Camera2Config.d(context, obj, set);
            }
        };
        return new C3067w.a().c(aVar).d(aVar2).g(new p1.c() {
            @Override
            public final p1 a(Context context) {
                return Camera2Config.e(context);
            }
        }).a();
    }

    public static G d(Context context, Object obj, Set set) throws C3039b0 {
        try {
            return new C2769F0(context, obj, set);
        } catch (r e7) {
            throw new C3039b0(e7);
        }
    }

    public static p1 e(Context context) throws C3039b0 {
        return new K0(context);
    }
}
