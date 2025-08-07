package androidx.camera.lifecycle;

import H.f;
import android.view.InterfaceC1701o;
import androidx.camera.lifecycle.LifecycleCameraRepository;

final class a extends LifecycleCameraRepository.a {

    private final InterfaceC1701o f9535a;

    private final f.b f9536b;

    a(InterfaceC1701o interfaceC1701o, f.b bVar) {
        if (interfaceC1701o == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f9535a = interfaceC1701o;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f9536b = bVar;
    }

    @Override
    public f.b b() {
        return this.f9536b;
    }

    @Override
    public InterfaceC1701o c() {
        return this.f9535a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.a)) {
            return false;
        }
        LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
        return this.f9535a.equals(aVar.c()) && this.f9536b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f9535a.hashCode() ^ 1000003) * 1000003) ^ this.f9536b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f9535a + ", cameraId=" + this.f9536b + "}";
    }
}
