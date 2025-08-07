package com.withpersona.sdk2.camera;

import C9.e;
import C9.h;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.b;
import u5.s;
import u5.t;

public final class c implements b.a {
    private final t a;

    c(t tVar) {
        this.a = tVar;
    }

    public static h<b.a> b(t tVar) {
        return e.a(new c(tVar));
    }

    @Override
    public b a(CameraPreview cameraPreview, PreviewView previewView, s sVar) {
        return this.a.b(cameraPreview, previewView, sVar);
    }
}
