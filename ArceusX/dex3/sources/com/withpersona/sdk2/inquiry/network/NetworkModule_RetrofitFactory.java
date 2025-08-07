package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import C9.h;
import C9.i;
import bb.u;
import com.squareup.moshi.w;
import okhttp3.OkHttpClient;

public final class NetworkModule_RetrofitFactory implements d<u> {
    private final NetworkModule module;
    private final h<w> moshiProvider;
    private final h<OkHttpClient> okHttpClientProvider;
    private final h<String> serverEndpointProvider;

    public NetworkModule_RetrofitFactory(NetworkModule networkModule, h<String> hVar, h<OkHttpClient> hVar2, h<w> hVar3) {
        this.module = networkModule;
        this.serverEndpointProvider = hVar;
        this.okHttpClientProvider = hVar2;
        this.moshiProvider = hVar3;
    }

    public static NetworkModule_RetrofitFactory create(NetworkModule networkModule, O9.a<String> aVar, O9.a<OkHttpClient> aVar2, O9.a<w> aVar3) {
        return new NetworkModule_RetrofitFactory(networkModule, i.a(aVar), i.a(aVar2), i.a(aVar3));
    }

    public static u retrofit(NetworkModule networkModule, String str, OkHttpClient okHttpClient, w wVar) {
        return (u) g.d(networkModule.retrofit(str, okHttpClient, wVar));
    }

    public static NetworkModule_RetrofitFactory create(NetworkModule networkModule, h<String> hVar, h<OkHttpClient> hVar2, h<w> hVar3) {
        return new NetworkModule_RetrofitFactory(networkModule, hVar, hVar2, hVar3);
    }

    public u m133get() {
        return retrofit(this.module, (String) this.serverEndpointProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), (w) this.moshiProvider.get());
    }
}
