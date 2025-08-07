package com.withpersona.sdk2.inquiry.network;

import C9.d;
import C9.g;
import com.squareup.moshi.h;
import java.util.Set;

public final class NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements d<Set<h.e>> {

    public static final class InstanceHolder {
        static final NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<h.e> provideMoshiJsonAdapterFactory() {
        return (Set) g.d(NetworkModule.Companion.provideMoshiJsonAdapterFactory());
    }

    public Set<h.e> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
