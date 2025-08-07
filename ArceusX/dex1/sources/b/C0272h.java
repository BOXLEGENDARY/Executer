package B;

import C.AbstractC0345p;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
import z.T;

final class C0272h extends f0 {

    private final Executor f232b;

    private final T.e f233c;

    private final T.f f234d;

    private final T.g f235e;

    private final Rect f236f;

    private final Matrix f237g;

    private final int f238h;

    private final int f239i;

    private final int f240j;

    private final List<AbstractC0345p> f241k;

    C0272h(Executor executor, T.e eVar, T.f fVar, T.g gVar, Rect rect, Matrix matrix, int i7, int i8, int i9, List<AbstractC0345p> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f232b = executor;
        this.f234d = fVar;
        this.f235e = gVar;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f236f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f237g = matrix;
        this.f238h = i7;
        this.f239i = i8;
        this.f240j = i9;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f241k = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f232b.equals(f0Var.g())) {
            f0Var.j();
            T.f fVar = this.f234d;
            if (fVar != null ? fVar.equals(f0Var.l()) : f0Var.l() == null) {
                T.g gVar = this.f235e;
                if (gVar != null ? gVar.equals(f0Var.m()) : f0Var.m() == null) {
                    if (this.f236f.equals(f0Var.i()) && this.f237g.equals(f0Var.o()) && this.f238h == f0Var.n() && this.f239i == f0Var.k() && this.f240j == f0Var.h() && this.f241k.equals(f0Var.p())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    Executor g() {
        return this.f232b;
    }

    @Override
    int h() {
        return this.f240j;
    }

    public int hashCode() {
        int iHashCode = (((this.f232b.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        T.f fVar = this.f234d;
        int iHashCode2 = (iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        T.g gVar = this.f235e;
        return ((((((((((((iHashCode2 ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003) ^ this.f236f.hashCode()) * 1000003) ^ this.f237g.hashCode()) * 1000003) ^ this.f238h) * 1000003) ^ this.f239i) * 1000003) ^ this.f240j) * 1000003) ^ this.f241k.hashCode();
    }

    @Override
    Rect i() {
        return this.f236f;
    }

    @Override
    public T.e j() {
        return this.f233c;
    }

    @Override
    int k() {
        return this.f239i;
    }

    @Override
    public T.f l() {
        return this.f234d;
    }

    @Override
    T.g m() {
        return this.f235e;
    }

    @Override
    int n() {
        return this.f238h;
    }

    @Override
    Matrix o() {
        return this.f237g;
    }

    @Override
    List<AbstractC0345p> p() {
        return this.f241k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f232b + ", inMemoryCallback=" + this.f233c + ", onDiskCallback=" + this.f234d + ", outputFileOptions=" + this.f235e + ", cropRect=" + this.f236f + ", sensorToBufferTransform=" + this.f237g + ", rotationDegrees=" + this.f238h + ", jpegQuality=" + this.f239i + ", captureMode=" + this.f240j + ", sessionConfigCameraCaptureCallbacks=" + this.f241k + "}";
    }
}
