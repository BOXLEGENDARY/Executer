package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1cSDK;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFa1aSDK implements AFb1zSDK {
    private boolean getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1hSDK getMonetizationNetwork;

    public static final class AFa1tSDK implements AFa1cSDK.AFa1zSDK {
        private long getRevenue;

        AFa1tSDK(long j7) {
            this.getRevenue = j7;
        }

        @Override
        public final void AFAdRevenueData(String str) {
            Map<String, Object> map = AFa1aSDK.this.getMediationNetwork;
            if (map != null) {
                map.put("error", str);
            }
        }

        @Override
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFa1aSDK.this.getMediationNetwork;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFa1aSDK.this.getMediationNetwork) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFa1aSDK.getMediationNetwork;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1aSDK.this.getMediationNetwork;
                if (map4 != null) {
                    map4.put("link", BuildConfig.FLAVOR);
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getRevenue);
            Map<String, Object> map5 = AFa1aSDK.this.getMediationNetwork;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }
    }

    public AFa1aSDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private boolean getMediationNetwork() {
        return this.getCurrencyIso4217Code;
    }

    @Override
    public final boolean AFAdRevenueData() {
        if (!getMediationNetwork()) {
            return false;
        }
        Map<String, Object> map = this.getMediationNetwork;
        return map == null || map.isEmpty();
    }

    @Override
    public final void getCurrencyIso4217Code(boolean z7) {
        this.getCurrencyIso4217Code = z7;
    }

    @Override
    public final void getRevenue() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Context context;
        if (getMediationNetwork() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getMediationNetwork = new LinkedHashMap();
            AFa1tSDK aFa1tSDK = new AFa1tSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() {
                    private AFa1zSDK getMediationNetwork;
                    private Class getMonetizationNetwork;

                    AnonymousClass1(Class cls3, AFa1zSDK aFa1tSDK2) {
                        cls = cls3;
                        aFa1zSDK = aFa1tSDK2;
                    }

                    @Override
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1zSDK aFa1zSDK = aFa1zSDK;
                            if (aFa1zSDK != null) {
                                aFa1zSDK.AFAdRevenueData("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1zSDK aFa1zSDK2 = aFa1zSDK;
                            if (aFa1zSDK2 != null) {
                                aFa1zSDK2.getRevenue(string2, string3, string);
                            }
                        } else {
                            AFa1zSDK aFa1zSDK3 = aFa1zSDK;
                            if (aFa1zSDK3 != null) {
                                aFa1zSDK3.getRevenue(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1tSDK2.AFAdRevenueData("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e7) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e7);
                aFa1tSDK2.AFAdRevenueData(e7.toString());
            } catch (IllegalAccessException e8) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e8);
                aFa1tSDK2.AFAdRevenueData(e8.toString());
            } catch (NoSuchMethodException e9) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e9);
                aFa1tSDK2.AFAdRevenueData(e9.toString());
            } catch (InvocationTargetException e10) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e10);
                aFa1tSDK2.AFAdRevenueData(e10.toString());
            }
        }
    }

    @Override
    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.getMediationNetwork;
    }
}
