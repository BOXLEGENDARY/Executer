package com.google.android.gms.common.moduleinstall.internal;

import I3.k;
import a4.C1574k;
import a4.C1576m;
import a4.InterfaceC1573j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.common.api.internal.C1805e;
import com.google.android.gms.common.api.internal.C1807g;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l3.AbstractC2531f;
import l3.C2526a;
import l3.C2527b;
import l3.InterfaceC2534i;
import m3.InterfaceC2578i;
import n3.C2651i;
import r3.C2746d;
import r3.InterfaceC2743a;
import r3.InterfaceC2745c;

public final class i extends AbstractC2531f implements InterfaceC2745c {

    private static final C2526a.g f14391k;

    private static final C2526a.AbstractC0203a f14392l;

    private static final C2526a f14393m;

    public static final int f14394n = 0;

    static {
        C2526a.g gVar = new C2526a.g();
        f14391k = gVar;
        f fVar = new f();
        f14392l = fVar;
        f14393m = new C2526a("ModuleInstall.API", fVar, gVar);
    }

    public i(Context context) {
        super(context, (C2526a<C2526a.d.c>) f14393m, C2526a.d.f21784x, AbstractC2531f.a.f21797c);
    }

    static final ApiFeatureRequest E(boolean z7, InterfaceC2534i... interfaceC2534iArr) {
        C2651i.m(interfaceC2534iArr, "Requested APIs must not be null.");
        C2651i.b(interfaceC2534iArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC2534i interfaceC2534i : interfaceC2534iArr) {
            C2651i.m(interfaceC2534i, "Requested API must not be null.");
        }
        return ApiFeatureRequest.o(Arrays.asList(interfaceC2534iArr), z7);
    }

    @Override
    public final Task<ModuleAvailabilityResponse> d(InterfaceC2534i... interfaceC2534iArr) {
        final ApiFeatureRequest apiFeatureRequestE = E(false, interfaceC2534iArr);
        if (apiFeatureRequestE.n().isEmpty()) {
            return C1576m.f(new ModuleAvailabilityResponse(true, 0));
        }
        AbstractC1808h.a aVarA = AbstractC1808h.a();
        aVarA.d(k.f1693a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.common.moduleinstall.internal.c) ((com.google.android.gms.common.moduleinstall.internal.j) obj).D()).h3(new BinderC2881k(this.f23662a, (C1574k) obj2), apiFeatureRequestE);
            }
        });
        return p(aVarA.a());
    }

    @Override
    public final Task<ModuleInstallResponse> h(C2746d c2746d) {
        final ApiFeatureRequest apiFeatureRequestL = ApiFeatureRequest.l(c2746d);
        final InterfaceC2743a interfaceC2743aB = c2746d.b();
        Executor executorC = c2746d.c();
        if (apiFeatureRequestL.n().isEmpty()) {
            return C1576m.f(new ModuleInstallResponse(0));
        }
        if (interfaceC2743aB == null) {
            AbstractC1808h.a aVarA = AbstractC1808h.a();
            aVarA.d(k.f1693a);
            aVarA.c(true);
            aVarA.e(27304);
            aVarA.b(new InterfaceC2578i() {
                @Override
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((com.google.android.gms.common.moduleinstall.internal.c) ((com.google.android.gms.common.moduleinstall.internal.j) obj).D()).n3(new BinderC2882l(this.f23664a, (C1574k) obj2), apiFeatureRequestL, null);
                }
            });
            return p(aVarA.a());
        }
        C2651i.l(interfaceC2743aB);
        C1804d c1804dY = executorC == null ? y(interfaceC2743aB, InterfaceC2743a.class.getSimpleName()) : C1805e.b(interfaceC2743aB, executorC, InterfaceC2743a.class.getSimpleName());
        final b bVar = new b(c1804dY);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC2578i interfaceC2578i = new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((c) ((j) obj).D()).n3(new g(this.f14379a, atomicReference, (C1574k) obj2, interfaceC2743aB), apiFeatureRequestL, bVar);
            }
        };
        InterfaceC2578i interfaceC2578i2 = new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((c) ((j) obj).D()).S5(new h(this.f14384a, (C1574k) obj2), bVar);
            }
        };
        C1807g.a aVarA2 = C1807g.a();
        aVarA2.g(c1804dY);
        aVarA2.d(k.f1693a);
        aVarA2.c(true);
        aVarA2.b(interfaceC2578i);
        aVarA2.f(interfaceC2578i2);
        aVarA2.e(27305);
        return q(aVarA2.a()).p(new InterfaceC1573j() {
            @Override
            public final Task a(Object obj) {
                int i7 = com.google.android.gms.common.moduleinstall.internal.i.f14394n;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? C1576m.f((ModuleInstallResponse) atomicReference2.get()) : C1576m.e(new C2527b(Status.f14054A));
            }
        });
    }
}
