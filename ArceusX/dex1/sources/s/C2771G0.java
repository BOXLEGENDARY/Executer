package s;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.oik.UJEa;
import z.C3043d0;

public class C2771G0 implements InterfaceC0334j0 {

    private final boolean f22958c;

    private final String f22959d;

    private final int f22960e;

    private final Map<Integer, InterfaceC0336k0> f22961f = new HashMap();

    private final C.R0 f22962g;

    static class a {
        static EncoderProfiles a(String str, int i7) {
            return CamcorderProfile.getAll(str, i7);
        }
    }

    public C2771G0(String str, C.R0 r02) throws NumberFormatException {
        boolean z7;
        int i7;
        this.f22959d = str;
        try {
            i7 = Integer.parseInt(str);
            z7 = true;
        } catch (NumberFormatException unused) {
            C3043d0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z7 = false;
            i7 = -1;
        }
        this.f22958c = z7;
        this.f22960e = i7;
        this.f22962g = r02;
    }

    private InterfaceC0336k0 c(int i7) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f22960e, i7);
        } catch (RuntimeException e7) {
            C3043d0.m(UJEa.fzjfauylMZ, "Unable to get CamcorderProfile by quality: " + i7, e7);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return D.a.a(camcorderProfile);
        }
        return null;
    }

    private InterfaceC0336k0 d() {
        Iterator<Integer> it = InterfaceC0334j0.f616b.iterator();
        while (it.hasNext()) {
            InterfaceC0336k0 interfaceC0336k0B = b(it.next().intValue());
            if (interfaceC0336k0B != null) {
                return interfaceC0336k0B;
            }
        }
        return null;
    }

    private InterfaceC0336k0 e() {
        for (int size = InterfaceC0334j0.f616b.size() - 1; size >= 0; size--) {
            InterfaceC0336k0 interfaceC0336k0B = b(size);
            if (interfaceC0336k0B != null) {
                return interfaceC0336k0B;
            }
        }
        return null;
    }

    private InterfaceC0336k0 f(int i7) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesA = a.a(this.f22959d, i7);
            if (encoderProfilesA == null) {
                return null;
            }
            if (androidx.camera.camera2.internal.compat.quirk.b.b(InvalidVideoProfilesQuirk.class) != null) {
                C3043d0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return D.a.b(encoderProfilesA);
                } catch (NullPointerException e7) {
                    C3043d0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e7);
                }
            }
        }
        return c(i7);
    }

    private boolean g(InterfaceC0336k0 interfaceC0336k0) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f22962g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<InterfaceC0336k0.c> listD = interfaceC0336k0.d();
        if (listD.isEmpty()) {
            return true;
        }
        InterfaceC0336k0.c cVar = listD.get(0);
        return camcorderProfileResolutionQuirk.f().contains(new Size(cVar.k(), cVar.h()));
    }

    @Override
    public boolean a(int i7) {
        return this.f22958c && b(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        InterfaceC0336k0 interfaceC0336k0E = null;
        if (!this.f22958c || !CamcorderProfile.hasProfile(this.f22960e, i7)) {
            return null;
        }
        if (this.f22961f.containsKey(Integer.valueOf(i7))) {
            return this.f22961f.get(Integer.valueOf(i7));
        }
        InterfaceC0336k0 interfaceC0336k0F = f(i7);
        if (interfaceC0336k0F == null || g(interfaceC0336k0F)) {
            interfaceC0336k0E = interfaceC0336k0F;
        } else if (i7 == 1) {
            interfaceC0336k0E = d();
        } else if (i7 == 0) {
            interfaceC0336k0E = e();
        }
        this.f22961f.put(Integer.valueOf(i7), interfaceC0336k0E);
        return interfaceC0336k0E;
    }
}
