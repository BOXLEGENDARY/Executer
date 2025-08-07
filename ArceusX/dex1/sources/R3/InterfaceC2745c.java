package r3;

import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import l3.C2526a;
import l3.InterfaceC2533h;
import l3.InterfaceC2534i;

public interface InterfaceC2745c extends InterfaceC2533h<C2526a.d.c> {
    Task<ModuleAvailabilityResponse> d(InterfaceC2534i... interfaceC2534iArr);

    @ResultIgnorabilityUnspecified
    Task<ModuleInstallResponse> h(C2746d c2746d);
}
