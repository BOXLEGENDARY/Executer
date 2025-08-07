package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import l3.C2527b;
import m3.C2571b;
import n3.C2652j;

final class y implements OnCompleteListener {

    private final C1803c f14197a;

    private final int f14198b;

    private final C2571b f14199c;

    private final long f14200d;

    private final long f14201e;

    y(C1803c c1803c, int i7, C2571b c2571b, long j7, long j8, String str, String str2) {
        this.f14197a = c1803c;
        this.f14198b = i7;
        this.f14199c = c2571b;
        this.f14200d = j7;
        this.f14201e = j8;
    }

    static y a(C1803c c1803c, int i7, C2571b c2571b) {
        boolean zP;
        if (!c1803c.e()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = C2652j.b().a();
        if (rootTelemetryConfigurationA == null) {
            zP = true;
        } else {
            if (!rootTelemetryConfigurationA.o()) {
                return null;
            }
            zP = rootTelemetryConfigurationA.p();
            t tVarT = c1803c.t(c2571b);
            if (tVarT != null) {
                if (!(tVarT.t() instanceof com.google.android.gms.common.internal.b)) {
                    return null;
                }
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) tVarT.t();
                if (bVar.J() && !bVar.f()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(tVarT, bVar, i7);
                    if (connectionTelemetryConfigurationB == null) {
                        return null;
                    }
                    tVarT.E();
                    zP = connectionTelemetryConfigurationB.q();
                }
            }
        }
        return new y(c1803c, i7, c2571b, zP ? System.currentTimeMillis() : 0L, zP ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration b(t tVar, com.google.android.gms.common.internal.b bVar, int i7) {
        int[] iArrN;
        int[] iArrO;
        ConnectionTelemetryConfiguration connectionTelemetryConfigurationH = bVar.H();
        if (connectionTelemetryConfigurationH == null || !connectionTelemetryConfigurationH.p() || ((iArrN = connectionTelemetryConfigurationH.n()) != null ? !v3.b.b(iArrN, i7) : !((iArrO = connectionTelemetryConfigurationH.o()) == null || !v3.b.b(iArrO, i7))) || tVar.q() >= connectionTelemetryConfigurationH.l()) {
            return null;
        }
        return connectionTelemetryConfigurationH;
    }

    @Override
    public final void onComplete(Task task) {
        t tVarT;
        int iQ;
        int i7;
        int i8;
        int iL;
        long j7;
        long j8;
        int iElapsedRealtime;
        if (this.f14197a.e()) {
            RootTelemetryConfiguration rootTelemetryConfigurationA = C2652j.b().a();
            if ((rootTelemetryConfigurationA == null || rootTelemetryConfigurationA.o()) && (tVarT = this.f14197a.t(this.f14199c)) != null && (tVarT.t() instanceof com.google.android.gms.common.internal.b)) {
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) tVarT.t();
                int i9 = 0;
                boolean zP = this.f14200d > 0;
                int iZ = bVar.z();
                int iO = 100;
                if (rootTelemetryConfigurationA != null) {
                    zP &= rootTelemetryConfigurationA.p();
                    int iL2 = rootTelemetryConfigurationA.l();
                    int iN = rootTelemetryConfigurationA.n();
                    iQ = rootTelemetryConfigurationA.q();
                    if (bVar.J() && !bVar.f()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(tVarT, bVar, this.f14198b);
                        if (connectionTelemetryConfigurationB == null) {
                            return;
                        }
                        boolean z7 = connectionTelemetryConfigurationB.q() && this.f14200d > 0;
                        iN = connectionTelemetryConfigurationB.l();
                        zP = z7;
                    }
                    i8 = iL2;
                    i7 = iN;
                } else {
                    iQ = 0;
                    i7 = 100;
                    i8 = 5000;
                }
                C1803c c1803c = this.f14197a;
                if (task.o()) {
                    iL = 0;
                } else if (task.m()) {
                    i9 = iO;
                    iL = -1;
                } else {
                    Exception excJ = task.j();
                    if (excJ instanceof C2527b) {
                        Status statusA = ((C2527b) excJ).a();
                        iO = statusA.o();
                        ConnectionResult connectionResultL = statusA.l();
                        if (connectionResultL != null) {
                            iL = connectionResultL.l();
                            i9 = iO;
                        }
                        i9 = iO;
                        iL = -1;
                    } else {
                        i9 = 101;
                        iL = -1;
                    }
                }
                if (zP) {
                    long j9 = this.f14200d;
                    long j10 = this.f14201e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j10);
                    j8 = jCurrentTimeMillis;
                    j7 = j9;
                } else {
                    j7 = 0;
                    j8 = 0;
                    iElapsedRealtime = -1;
                }
                c1803c.G(new MethodInvocation(this.f14198b, i9, iL, j7, j8, null, null, iZ, iElapsedRealtime), iQ, i8, i7);
            }
        }
    }
}
