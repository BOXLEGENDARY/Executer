package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2035a2;
import com.google.android.gms.internal.play_billing.Z1;
import java.io.IOException;
import java.util.List;

public abstract class AbstractC2035a2<MessageType extends AbstractC2035a2<MessageType, BuilderType>, BuilderType extends Z1<MessageType, BuilderType>> implements InterfaceC2155u3 {
    protected int zza = 0;

    protected static void d(Iterable iterable, List list) {
        Z1.d(iterable, list);
    }

    int b(F3 f32) {
        throw null;
    }

    @Override
    public final AbstractC2131q2 c() {
        try {
            int iH = h();
            AbstractC2131q2 abstractC2131q2 = AbstractC2131q2.f16138e;
            byte[] bArr = new byte[iH];
            C2154u2 c2154u2 = new C2154u2(bArr, 0, iH);
            a(c2154u2);
            c2154u2.b();
            return new C2119o2(bArr);
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e7);
        }
    }

    public final byte[] g() {
        try {
            int iH = h();
            byte[] bArr = new byte[iH];
            C2154u2 c2154u2 = new C2154u2(bArr, 0, iH);
            a(c2154u2);
            c2154u2.b();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }
}
