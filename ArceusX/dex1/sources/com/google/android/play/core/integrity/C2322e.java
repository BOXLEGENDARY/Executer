package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

final class C2322e implements IntegrityManager {

    private final C2328k f18828a;

    C2322e(C2328k c2328k) {
        this.f18828a = c2328k;
    }

    @Override
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f18828a.b(integrityTokenRequest);
    }
}
