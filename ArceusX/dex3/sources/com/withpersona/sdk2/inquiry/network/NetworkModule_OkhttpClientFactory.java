package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import C9.h;
import C9.i;
import android.content.Context;
import ha.C0462j;
import java.util.Map;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class NetworkModule_OkhttpClientFactory implements d<OkHttpClient> {
    private final h<Context> contextProvider;
    private final h<d9.b> deviceInfoProvider;
    private final h<d9.c> deviceVendorIDProvider;
    private final h<Map<String, String>> headersProvider;
    private final h<Set<Interceptor>> interceptorsProvider;
    private final h<C0462j> loggerProvider;
    private final NetworkModule module;

    public NetworkModule_OkhttpClientFactory(NetworkModule networkModule, h<Set<Interceptor>> hVar, h<Map<String, String>> hVar2, h<Context> hVar3, h<d9.c> hVar4, h<d9.b> hVar5, h<C0462j> hVar6) {
        this.module = networkModule;
        this.interceptorsProvider = hVar;
        this.headersProvider = hVar2;
        this.contextProvider = hVar3;
        this.deviceVendorIDProvider = hVar4;
        this.deviceInfoProvider = hVar5;
        this.loggerProvider = hVar6;
    }

    public static NetworkModule_OkhttpClientFactory create(NetworkModule networkModule, O9.a<Set<Interceptor>> aVar, O9.a<Map<String, String>> aVar2, O9.a<Context> aVar3, O9.a<d9.c> aVar4, O9.a<d9.b> aVar5, O9.a<C0462j> aVar6) {
        return new NetworkModule_OkhttpClientFactory(networkModule, i.a(aVar), i.a(aVar2), i.a(aVar3), i.a(aVar4), i.a(aVar5), i.a(aVar6));
    }

    public static OkHttpClient okhttpClient(NetworkModule networkModule, Set<Interceptor> set, Map<String, String> map, Context context, d9.c cVar, d9.b bVar, C0462j c0462j) {
        return (OkHttpClient) g.d(networkModule.okhttpClient(set, map, context, cVar, bVar, c0462j));
    }

    public static NetworkModule_OkhttpClientFactory create(NetworkModule networkModule, h<Set<Interceptor>> hVar, h<Map<String, String>> hVar2, h<Context> hVar3, h<d9.c> hVar4, h<d9.b> hVar5, h<C0462j> hVar6) {
        return new NetworkModule_OkhttpClientFactory(networkModule, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
    }

    public OkHttpClient get() {
        return okhttpClient(this.module, (Set) this.interceptorsProvider.get(), (Map) this.headersProvider.get(), (Context) this.contextProvider.get(), (d9.c) this.deviceVendorIDProvider.get(), (d9.b) this.deviceInfoProvider.get(), (C0462j) this.loggerProvider.get());
    }
}
