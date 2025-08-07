package s3;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import m3.m;

final class BinderC2882l extends BinderC2871a {

    final C1574k f23667d;

    BinderC2882l(com.google.android.gms.common.moduleinstall.internal.i iVar, C1574k c1574k) {
        this.f23667d = c1574k;
    }

    @Override
    public final void W3(Status status, ModuleInstallResponse moduleInstallResponse) {
        m.c(status, moduleInstallResponse, this.f23667d);
    }
}
