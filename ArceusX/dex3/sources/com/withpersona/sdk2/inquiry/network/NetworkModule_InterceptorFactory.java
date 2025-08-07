package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import C9.h;
import C9.i;
import com.squareup.moshi.w;
import okhttp3.Interceptor;

public final class NetworkModule_InterceptorFactory implements d<Interceptor> {
    private final NetworkModule module;
    private final h<w> moshiProvider;

    public NetworkModule_InterceptorFactory(NetworkModule networkModule, h<w> hVar) {
        this.module = networkModule;
        this.moshiProvider = hVar;
    }

    public static NetworkModule_InterceptorFactory create(NetworkModule networkModule, O9.a<w> aVar) {
        return new NetworkModule_InterceptorFactory(networkModule, i.a(aVar));
    }

    public static Interceptor interceptor(NetworkModule networkModule, w wVar) {
        return (Interceptor) g.d(networkModule.interceptor(wVar));
    }

    public static NetworkModule_InterceptorFactory create(NetworkModule networkModule, h<w> hVar) {
        return new NetworkModule_InterceptorFactory(networkModule, hVar);
    }

    public Interceptor get() {
        return interceptor(this.module, (w) this.moshiProvider.get());
    }
}
