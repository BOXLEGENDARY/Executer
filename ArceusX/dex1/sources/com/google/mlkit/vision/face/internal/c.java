package com.google.mlkit.vision.face.internal;

import n3.C2651i;
import o5.C2687d;
import w5.C2976e;

public final class c {

    private final d f19312a;

    private final C2687d f19313b;

    c(d dVar, C2687d c2687d) {
        this.f19312a = dVar;
        this.f19313b = c2687d;
    }

    public final FaceDetectorImpl a(C2976e c2976e) {
        C2651i.m(c2976e, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((g) this.f19312a.b(c2976e), this.f19313b, c2976e, null);
    }
}
