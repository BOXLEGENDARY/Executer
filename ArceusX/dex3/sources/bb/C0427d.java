package bb;

import C9.e;
import C9.h;
import bb.C0425b;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.n;
import java.util.List;

public final class C0427d implements C0425b.a {
    private final C0426c a;

    C0427d(C0426c c0426c) {
        this.a = c0426c;
    }

    public static h<C0425b.a> b(C0426c c0426c) {
        return e.a(new C0427d(c0426c));
    }

    @Override
    public C0425b a(String str, String str2, String str3, String str4, n nVar, String str5, List<? extends Selfie> list, String str6, CameraProperties cameraProperties, long j) {
        return this.a.b(str, str2, nVar, list, str4, str3, str5, str6, cameraProperties, j);
    }
}
