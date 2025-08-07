package bb;

import C9.h;
import bb.c;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;

public final class e implements c.a {
    private final d a;

    e(d dVar) {
        this.a = dVar;
    }

    public static h<c.a> b(d dVar) {
        return C9.e.a(new e(dVar));
    }

    @Override
    public c a(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, CameraProperties cameraProperties) {
        return this.a.b(str, str2, str4, str3, governmentIdRequestArguments, str5, cameraProperties);
    }
}
