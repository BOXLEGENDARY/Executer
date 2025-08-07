package bb;

import C9.h;
import android.content.Context;
import b9.InterfaceC0482a;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.a;
import f9.InterfaceC0574a;
import o8.InterfaceC0723a;
import u8.InterfaceC0808a;

public final class d {
    private final h<Context> a;
    private final h<a> b;
    private final h<InterfaceC0482a> c;
    private final h<InterfaceC0808a> d;
    private final h<InterfaceC0574a> e;
    private final h<InterfaceC0723a> f;

    public d(h<Context> hVar, h<a> hVar2, h<InterfaceC0482a> hVar3, h<InterfaceC0808a> hVar4, h<InterfaceC0574a> hVar5, h<InterfaceC0723a> hVar6) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
        this.d = hVar4;
        this.e = hVar5;
        this.f = hVar6;
    }

    public static d a(h<Context> hVar, h<a> hVar2, h<InterfaceC0482a> hVar3, h<InterfaceC0808a> hVar4, h<InterfaceC0574a> hVar5, h<InterfaceC0723a> hVar6) {
        return new d(hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
    }

    public static c c(Context context, String str, String str2, String str3, String str4, a aVar, GovernmentIdRequestArguments governmentIdRequestArguments, InterfaceC0482a interfaceC0482a, InterfaceC0808a interfaceC0808a, InterfaceC0574a interfaceC0574a, String str5, CameraProperties cameraProperties, InterfaceC0723a interfaceC0723a) {
        return new c(context, str, str2, str3, str4, aVar, governmentIdRequestArguments, interfaceC0482a, interfaceC0808a, interfaceC0574a, str5, cameraProperties, interfaceC0723a);
    }

    public c b(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, CameraProperties cameraProperties) {
        return c((Context) this.a.get(), str, str2, str3, str4, (a) this.b.get(), governmentIdRequestArguments, (InterfaceC0482a) this.c.get(), (InterfaceC0808a) this.d.get(), (InterfaceC0574a) this.e.get(), str5, cameraProperties, (InterfaceC0723a) this.f.get());
    }
}
