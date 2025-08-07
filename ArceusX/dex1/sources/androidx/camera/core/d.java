package androidx.camera.core;

import C.InterfaceC0353t0;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

class d implements InterfaceC0353t0 {

    private final ImageReader f9423a;

    private final Object f9424b = new Object();

    private boolean f9425c = true;

    d(ImageReader imageReader) {
        this.f9423a = imageReader;
    }

    private boolean j(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    public void k(InterfaceC0353t0.a aVar) {
        aVar.a(this);
    }

    public void l(Executor executor, final InterfaceC0353t0.a aVar, ImageReader imageReader) {
        synchronized (this.f9424b) {
            try {
                if (!this.f9425c) {
                    executor.execute(new Runnable() {
                        @Override
                        public final void run() {
                            this.f9421d.k(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Surface a() {
        Surface surface;
        synchronized (this.f9424b) {
            surface = this.f9423a.getSurface();
        }
        return surface;
    }

    @Override
    public n c() {
        Image imageAcquireLatestImage;
        synchronized (this.f9424b) {
            try {
                imageAcquireLatestImage = this.f9423a.acquireLatestImage();
            } catch (RuntimeException e7) {
                if (!j(e7)) {
                    throw e7;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override
    public void close() {
        synchronized (this.f9424b) {
            this.f9423a.close();
        }
    }

    @Override
    public int d() {
        int imageFormat;
        synchronized (this.f9424b) {
            imageFormat = this.f9423a.getImageFormat();
        }
        return imageFormat;
    }

    @Override
    public void e(final InterfaceC0353t0.a aVar, final Executor executor) {
        synchronized (this.f9424b) {
            this.f9425c = false;
            this.f9423a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                @Override
                public final void onImageAvailable(ImageReader imageReader) {
                    this.f9418a.l(executor, aVar, imageReader);
                }
            }, E.l.a());
        }
    }

    @Override
    public void f() {
        synchronized (this.f9424b) {
            this.f9425c = true;
            this.f9423a.setOnImageAvailableListener(null, null);
        }
    }

    @Override
    public int g() {
        int maxImages;
        synchronized (this.f9424b) {
            maxImages = this.f9423a.getMaxImages();
        }
        return maxImages;
    }

    @Override
    public int getHeight() {
        int height;
        synchronized (this.f9424b) {
            height = this.f9423a.getHeight();
        }
        return height;
    }

    @Override
    public int getWidth() {
        int width;
        synchronized (this.f9424b) {
            width = this.f9423a.getWidth();
        }
        return width;
    }

    @Override
    public n h() {
        Image imageAcquireNextImage;
        synchronized (this.f9424b) {
            try {
                imageAcquireNextImage = this.f9423a.acquireNextImage();
            } catch (RuntimeException e7) {
                if (!j(e7)) {
                    throw e7;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }
}
