package okio;

import I1.e;
import I1.g;
import I1.h;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import ha.C0886k;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00030\u00030\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b+\u0010\t\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0018R\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u0010)¨\u00061"}, d2 = {"LO1/u;", "Landroid/content/ComponentCallbacks2;", "LI1/g$a;", "Lz1/k;", "imageLoader", "<init>", "(Lz1/k;)V", "", "d", "()V", "c", "e", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "", "isOnline", "a", "(Z)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", "Landroid/content/Context;", "application", "LI1/g;", "i", "LI1/g;", "networkObserver", "v", "Z", "getShutdown", "()Z", "setShutdown", "getShutdown$annotations", "shutdown", "w", "_isOnline", "b", "y", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComponentCallbacks2C0422u implements ComponentCallbacks2, g.a {

    @NotNull
    private final WeakReference<C0886k> imageLoader;

    private Context application;

    private g networkObserver;

    private boolean shutdown;

    private boolean _isOnline = true;

    public ComponentCallbacks2C0422u(@NotNull C0886k c0886k) {
        this.imageLoader = new WeakReference<>(c0886k);
    }

    private final synchronized void d() {
        g eVar;
        try {
            C0886k c0886k = this.imageLoader.get();
            if (c0886k == null) {
                e();
            } else if (this.networkObserver == null) {
                if (c0886k.getOptions().getNetworkObserverEnabled()) {
                    Context context = c0886k.getContext();
                    c0886k.h();
                    eVar = h.a(context, this, null);
                } else {
                    eVar = new e();
                }
                this.networkObserver = eVar;
                this._isOnline = eVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized void a(boolean isOnline) {
        try {
            C0886k c0886k = this.imageLoader.get();
            if (c0886k != null) {
                c0886k.h();
                this._isOnline = isOnline;
            } else {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        d();
        return this._isOnline;
    }

    public final synchronized void c() {
        try {
            C0886k c0886k = this.imageLoader.get();
            if (c0886k == null) {
                e();
            } else if (this.application == null) {
                Context context = c0886k.getContext();
                this.application = context;
                context.registerComponentCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            g gVar = this.networkObserver;
            if (gVar != null) {
                gVar.shutdown();
            }
            this.imageLoader.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized void onConfigurationChanged(@NotNull Configuration newConfig) {
        if (this.imageLoader.get() == null) {
            e();
        }
    }

    @Override
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override
    public synchronized void onTrimMemory(int level) {
        try {
            C0886k c0886k = this.imageLoader.get();
            if (c0886k != null) {
                c0886k.h();
                c0886k.m(level);
            } else {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
