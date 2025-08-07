package com.google.mlkit.vision.text.internal;

import S3.C1352j8;
import S3.C1396n8;
import S3.C1440r9;
import S3.C1473u9;
import S3.E6;
import S3.G6;
import S3.H6;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;
import u5.C2938a;
import z5.C3082a;
import z5.InterfaceC3084c;

public final class zzn extends MobileVisionBase implements InterfaceC3084c {

    private final z5.d f19368A;

    zzn(c cVar, Executor executor, C1440r9 c1440r9, z5.d dVar) {
        super(cVar, executor);
        this.f19368A = dVar;
        H6 h62 = new H6();
        h62.e(dVar.g() ? E6.TYPE_THICK : E6.TYPE_THIN);
        C1352j8 c1352j8 = new C1352j8();
        C1396n8 c1396n8 = new C1396n8();
        c1396n8.a(a.a(dVar.d()));
        c1352j8.e(c1396n8.c());
        h62.h(c1352j8.f());
        c1440r9.d(C1473u9.f(h62, 1), G6.ON_DEVICE_TEXT_CREATE);
    }

    @Override
    public final int H() {
        return 4;
    }

    @Override
    public final Feature[] b() {
        return b.a(this.f19368A);
    }

    @Override
    public final Task<C3082a> d(C2938a c2938a) {
        return super.f(c2938a);
    }
}
