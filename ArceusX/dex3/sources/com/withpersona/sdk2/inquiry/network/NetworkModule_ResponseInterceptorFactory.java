package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import okhttp3.Interceptor;

public final class NetworkModule_ResponseInterceptorFactory implements d<Interceptor> {
    private final NetworkModule module;

    public NetworkModule_ResponseInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ResponseInterceptorFactory create(NetworkModule networkModule) {
        return new NetworkModule_ResponseInterceptorFactory(networkModule);
    }

    public static Interceptor responseInterceptor(NetworkModule networkModule) {
        return (Interceptor) g.d(networkModule.responseInterceptor());
    }

    public Interceptor get() {
        return responseInterceptor(this.module);
    }
}
