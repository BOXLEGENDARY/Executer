package com.withpersona.sdk2.inquiry.network;

import android.content.Context;
import bb.u;
import com.squareup.moshi.h;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import ha.C0462j;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public final class NetworkModule {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private String environmentId;
    private final String locale;
    private String organizationId;
    private String routingCountry;
    private final boolean useServerStyle;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<h.e> provideMoshiJsonAdapterFactory() {
            return L.f(new h.e[]{ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter(), NextStep.Companion.createAdapter(), UiComponentConfig.Companion.createAdapter(), LocalImage.Companion.createAdapter(), Id.Companion.createAdapter()});
        }

        private Companion() {
        }
    }

    public static final class NetworkConstants {

        @NotNull
        public static final String HEADER_KEY_PERSONA_COUNTRY = "Persona-Country";

        @NotNull
        public static final String HEADER_KEY_PERSONA_ENVIRONMENT_ID = "Persona-Organization-Id";

        @NotNull
        public static final String HEADER_KEY_PERSONA_ORGANIZATION_ID = "Persona-Environment-Id";

        @NotNull
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkModule(boolean z, String str, String str2, String str3) {
        this.useServerStyle = z;
        this.routingCountry = str;
        this.environmentId = str2;
        this.locale = str3;
    }

    public static final Response interceptor$lambda$10(w wVar, Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e) {
            Response.Builder builderCode = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage = e.getLocalizedMessage();
            return builderCode.message(localizedMessage != null ? localizedMessage : "").body(ResponseBody.Companion.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e.getLocalizedMessage())), MediaType.Companion.get("application/json"))).build();
        } catch (SocketTimeoutException e2) {
            Response.Builder builderCode2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage2 = e2.getLocalizedMessage();
            return builderCode2.message(localizedMessage2 != null ? localizedMessage2 : "").body(ResponseBody.Companion.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e2.getLocalizedMessage())), MediaType.Companion.get("application/json"))).build();
        } catch (UnknownHostException e3) {
            Response.Builder builderCode3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage3 = e3.getLocalizedMessage();
            return builderCode3.message(localizedMessage3 != null ? localizedMessage3 : "").body(ResponseBody.Companion.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e3.getLocalizedMessage())), MediaType.Companion.get("application/json"))).build();
        } catch (IOException e4) {
            Response.Builder builderCode4 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage4 = e4.getLocalizedMessage();
            return builderCode4.message(localizedMessage4 != null ? localizedMessage4 : "").body(ResponseBody.Companion.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e4.getLocalizedMessage())), MediaType.Companion.get("application/json"))).build();
        }
    }

    @NotNull
    public static final Set<h.e> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    public static final Response responseInterceptor$lambda$9(NetworkModule networkModule, Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        String str = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_COUNTRY);
        if (str != null) {
            networkModule.routingCountry = str;
        }
        String str2 = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (str2 != null) {
            networkModule.organizationId = str2;
        }
        String str3 = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (str3 != null) {
            networkModule.environmentId = str3;
        }
        return responseProceed;
    }

    @NotNull
    public final Interceptor interceptor(@NotNull final w wVar) {
        return new Interceptor() {
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkModule.interceptor$lambda$10(wVar, chain);
            }
        };
    }

    @NotNull
    public final String keyInflection() {
        return "camel";
    }

    @NotNull
    public final w moshi(@NotNull Set<Object> set, @NotNull Set<JsonAdapterBinding<?>> set2, @NotNull Set<h.e> set3) {
        w.b bVar = new w.b();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            bVar.b(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.c(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            bVar.a((h.e) it3.next());
        }
        return bVar.d();
    }

    @NotNull
    public final OkHttpClient okhttpClient(@NotNull Set<Interceptor> set, @NotNull final Map<String, String> map, @NotNull final Context context, @NotNull final d9.c cVar, @NotNull final d9.b bVar, @NotNull final C0462j c0462j) {
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() {
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                if (!chain.request().headers().names().contains("Accept")) {
                    builderNewBuilder = builderNewBuilder.header("Accept", "application/json");
                }
                Request.Builder builderHeader = builderNewBuilder.header("Persona-Version", "2023-08-08").header("Persona-Device-Manufacturer", bVar.b()).header("Persona-Device-Model", bVar.d()).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", bVar.c()).header("Persona-Device-Vendor-Id", cVar.b()).header("VTDGJLGG", String.valueOf(bVar.a())).header("Persona-Style-Variant", (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light");
                String string = this.locale;
                if (string == null) {
                    string = Locale.getDefault().toString();
                }
                Request.Builder builderHeader2 = builderHeader.header("Persona-Device-Locale", string).header("Persona-App-Bundle", context.getPackageName());
                String str = this.routingCountry;
                if (str != null) {
                    builderHeader2.header(NetworkModule.NetworkConstants.HEADER_KEY_PERSONA_COUNTRY, str);
                }
                String str2 = this.organizationId;
                if (str2 != null) {
                    builderHeader2.header(NetworkModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, str2);
                }
                String str3 = this.environmentId;
                if (str3 != null) {
                    builderHeader2.header(NetworkModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    builderHeader2.header((String) entry.getKey(), (String) entry.getValue());
                }
                return chain.proceed(a.a(a.a, builderHeader2.build(), c0462j, 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient.Builder builderConnectTimeout = builderAddNetworkInterceptor.readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).connectTimeout(1L, timeUnit);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderConnectTimeout.addInterceptor((Interceptor) it.next());
        }
        return builderConnectTimeout.build();
    }

    @NotNull
    public final Interceptor responseInterceptor() {
        return new Interceptor() {
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkModule.responseInterceptor$lambda$9(this.a, chain);
            }
        };
    }

    @NotNull
    public final u retrofit(@NotNull String str, @NotNull OkHttpClient okHttpClient, @NotNull w wVar) {
        return new u.b().g(okHttpClient).c(str).b(db.a.f(wVar)).e();
    }

    @NotNull
    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public NetworkModule(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : str2, str3);
    }
}
