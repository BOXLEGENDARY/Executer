package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;
import z4.C3077c;

final class C2331n extends IntegrityTokenRequest.Builder {

    private String f18868a;

    private Long f18869b;

    C2331n() {
    }

    @Override
    public final IntegrityTokenRequest build() {
        String str = this.f18868a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C3077c c3077c = null;
        return new C2332o(str, this.f18869b, c3077c, c3077c);
    }

    @Override
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j7) {
        this.f18869b = Long.valueOf(j7);
        return this;
    }

    @Override
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f18868a = str;
        return this;
    }
}
