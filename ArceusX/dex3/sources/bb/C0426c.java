package bb;

import C9.h;
import android.content.Context;
import b9.InterfaceC0482a;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.n;
import f9.InterfaceC0574a;
import java.util.List;
import o8.InterfaceC0723a;
import u8.InterfaceC0808a;

public final class C0426c {
    private final h<Context> a;
    private final h<InterfaceC0424a> b;
    private final h<InterfaceC0482a> c;
    private final h<InterfaceC0808a> d;
    private final h<InterfaceC0574a> e;
    private final h<InterfaceC0723a> f;

    public C0426c(h<Context> hVar, h<InterfaceC0424a> hVar2, h<InterfaceC0482a> hVar3, h<InterfaceC0808a> hVar4, h<InterfaceC0574a> hVar5, h<InterfaceC0723a> hVar6) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
        this.d = hVar4;
        this.e = hVar5;
        this.f = hVar6;
    }

    public static C0426c a(h<Context> hVar, h<InterfaceC0424a> hVar2, h<InterfaceC0482a> hVar3, h<InterfaceC0808a> hVar4, h<InterfaceC0574a> hVar5, h<InterfaceC0723a> hVar6) {
        return new C0426c(hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
    }

    public static C0425b c(Context context, String str, String str2, n nVar, List<? extends Selfie> list, InterfaceC0424a interfaceC0424a, String str3, String str4, String str5, InterfaceC0482a interfaceC0482a, InterfaceC0808a interfaceC0808a, InterfaceC0574a interfaceC0574a, String str6, CameraProperties cameraProperties, InterfaceC0723a interfaceC0723a, long j) {
        return new C0425b(context, str, str2, nVar, list, interfaceC0424a, str3, str4, str5, interfaceC0482a, interfaceC0808a, interfaceC0574a, str6, cameraProperties, interfaceC0723a, j);
    }

    public C0425b b(String str, String str2, n nVar, List<? extends Selfie> list, String str3, String str4, String str5, String str6, CameraProperties cameraProperties, long j) {
        return c((Context) this.a.get(), str, str2, nVar, list, (InterfaceC0424a) this.b.get(), str3, str4, str5, (InterfaceC0482a) this.c.get(), (InterfaceC0808a) this.d.get(), (InterfaceC0574a) this.e.get(), str6, cameraProperties, (InterfaceC0723a) this.f.get(), j);
    }
}
