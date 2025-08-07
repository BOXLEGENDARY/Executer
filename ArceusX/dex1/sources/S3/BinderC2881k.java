package s3;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import m3.m;

final class BinderC2881k extends BinderC2871a {

    final C1574k f23666d;

    BinderC2881k(com.google.android.gms.common.moduleinstall.internal.i iVar, C1574k c1574k) {
        this.f23666d = c1574k;
    }

    @Override
    public final void e4(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        m.c(status, moduleAvailabilityResponse, this.f23666d);
    }
}
