package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.List;
import java.util.Map;
import n3.C2651i;

final class P2 implements Runnable {

    private final URL f16460d;

    private final String f16461e;

    final Q2 f16462i;

    private final W3.l f16463v;

    public P2(Q2 q22, String str, URL url, byte[] bArr, Map map, W3.l lVar, byte[] bArr2) {
        this.f16462i = q22;
        C2651i.f(str);
        C2651i.l(url);
        C2651i.l(lVar);
        this.f16460d = url;
        this.f16463v = lVar;
        this.f16461e = str;
    }

    private final void b(final int i7, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) throws IllegalStateException {
        this.f16462i.f16818a.a().z(new Runnable() {
            @Override
            public final void run() {
                this.f16446d.a(i7, exc, bArr, map);
            }
        });
    }

    final void a(int i7, Exception exc, byte[] bArr, Map map) {
        W3.l lVar = this.f16463v;
        lVar.f7651a.h(this.f16461e, i7, exc, bArr, map);
    }

    @Override
    public final void run() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P2.run():void");
    }
}
