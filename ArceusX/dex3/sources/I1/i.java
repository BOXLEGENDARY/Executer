package I1;

import I1.g;
import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001\u0017\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LI1/i;", "LI1/g;", "Landroid/net/ConnectivityManager;", "connectivityManager", "LI1/g$a;", "listener", "<init>", "(Landroid/net/ConnectivityManager;LI1/g$a;)V", "Landroid/net/Network;", "network", "", "isOnline", "", "d", "(Landroid/net/Network;Z)V", "c", "(Landroid/net/Network;)Z", "shutdown", "()V", "a", "Landroid/net/ConnectivityManager;", "b", "LI1/g$a;", "I1/i$a", "LI1/i$a;", "networkCallback", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
final class i implements g {

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final g.a listener;

    @NotNull
    private final a networkCallback;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"I1/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override
        public void onAvailable(Network network) {
            i.this.d(network, true);
        }

        @Override
        public void onLost(Network network) {
            i.this.d(network, false);
        }
    }

    public i(@NotNull ConnectivityManager connectivityManager, @NotNull g.a aVar) {
        this.connectivityManager = connectivityManager;
        this.listener = aVar;
        a aVar2 = new a();
        this.networkCallback = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean isOnline) {
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        int length = allNetworks.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.b(network2, network) ? isOnline : c(network2)) {
                z = true;
                break;
            }
            i++;
        }
        this.listener.a(z);
    }

    @Override
    public boolean a() {
        for (Network network : this.connectivityManager.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void shutdown() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }
}
