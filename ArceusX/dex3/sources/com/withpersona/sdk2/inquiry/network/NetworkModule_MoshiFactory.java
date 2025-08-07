package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import C9.h;
import C9.i;
import com.squareup.moshi.h;
import com.squareup.moshi.w;
import java.util.Set;

public final class NetworkModule_MoshiFactory implements d<w> {
    private final h<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final h<Set<h.e>> jsonAdapterFactoryProvider;
    private final C9.h<Set<Object>> jsonAdaptersProvider;
    private final NetworkModule module;

    public NetworkModule_MoshiFactory(NetworkModule networkModule, C9.h<Set<Object>> hVar, C9.h<Set<JsonAdapterBinding<?>>> hVar2, C9.h<Set<h.e>> hVar3) {
        this.module = networkModule;
        this.jsonAdaptersProvider = hVar;
        this.jsonAdapterBindingsProvider = hVar2;
        this.jsonAdapterFactoryProvider = hVar3;
    }

    public static NetworkModule_MoshiFactory create(NetworkModule networkModule, O9.a<Set<Object>> aVar, O9.a<Set<JsonAdapterBinding<?>>> aVar2, O9.a<Set<h.e>> aVar3) {
        return new NetworkModule_MoshiFactory(networkModule, i.a(aVar), i.a(aVar2), i.a(aVar3));
    }

    public static w moshi(NetworkModule networkModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<h.e> set3) {
        return (w) g.d(networkModule.moshi(set, set2, set3));
    }

    public static NetworkModule_MoshiFactory create(NetworkModule networkModule, C9.h<Set<Object>> hVar, C9.h<Set<JsonAdapterBinding<?>>> hVar2, C9.h<Set<h.e>> hVar3) {
        return new NetworkModule_MoshiFactory(networkModule, hVar, hVar2, hVar3);
    }

    public w m129get() {
        return moshi(this.module, (Set) this.jsonAdaptersProvider.get(), (Set) this.jsonAdapterBindingsProvider.get(), (Set) this.jsonAdapterFactoryProvider.get());
    }
}
