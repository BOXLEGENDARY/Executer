package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class P2<T> {

    private static volatile N2 f14986h;

    public static final int f14990l = 0;

    final M2 f14991a;

    final String f14992b;

    private final T f14993c;

    private volatile int f14994d = -1;

    private volatile T f14995e;

    private final boolean f14996f;

    private static final Object f14985g = new Object();

    private static final AtomicReference<Collection<P2<?>>> f14987i = new AtomicReference<>();

    private static final R2 f14988j = new R2(G2.f14764a, null);

    private static final AtomicInteger f14989k = new AtomicInteger();

    P2(M2 m22, String str, Object obj, boolean z7, O2 o2) {
        if (m22.f14833b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14991a = m22;
        this.f14992b = str;
        this.f14993c = obj;
        this.f14996f = true;
    }

    @Deprecated
    public static void d(final Context context) {
        synchronized (f14985g) {
            try {
                N2 n22 = f14986h;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (n22 == null || n22.a() != context) {
                    C1995v2.d();
                    Q2.b();
                    C2.d();
                    f14986h = new C1963r2(context, C1837b3.a(new X2() {
                        @Override
                        public final Object zza() {
                            U2 u2C;
                            U2 u2C2;
                            Context contextCreateDeviceProtectedStorageContext = context;
                            int i7 = P2.f14990l;
                            String str = Build.TYPE;
                            String str2 = Build.TAGS;
                            if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                return U2.c();
                            }
                            if (C1956q2.a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                StrictMode.allowThreadDiskWrites();
                                try {
                                    File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                    u2C = file.exists() ? U2.d(file) : U2.c();
                                } catch (RuntimeException e7) {
                                    Log.e("HermeticFileOverrides", "no data dir", e7);
                                    u2C = U2.c();
                                }
                                if (u2C.b()) {
                                    File file2 = (File) u2C.a();
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                        try {
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            while (true) {
                                                String line = bufferedReader.readLine();
                                                if (line == null) {
                                                    break;
                                                }
                                                String[] strArrSplit = line.split(" ", 3);
                                                if (strArrSplit.length != 3) {
                                                    Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                                                } else {
                                                    String str3 = new String(strArrSplit[0]);
                                                    String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                    String strDecode2 = (String) map2.get(strArrSplit[2]);
                                                    if (strDecode2 == null) {
                                                        String str4 = new String(strArrSplit[2]);
                                                        strDecode2 = Uri.decode(str4);
                                                        if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                            map2.put(str4, strDecode2);
                                                        }
                                                    }
                                                    if (!map.containsKey(str3)) {
                                                        map.put(str3, new HashMap());
                                                    }
                                                    ((Map) map.get(str3)).put(strDecode, strDecode2);
                                                }
                                            }
                                            String string = file2.toString();
                                            StringBuilder sb = new StringBuilder(string.length() + 7);
                                            sb.append("Parsed ");
                                            sb.append(string);
                                            Log.i("HermeticFileOverrides", sb.toString());
                                            D2 d22 = new D2(map);
                                            bufferedReader.close();
                                            u2C2 = U2.d(d22);
                                        } finally {
                                            try {
                                                bufferedReader.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } catch (IOException e8) {
                                        throw new RuntimeException(e8);
                                    }
                                } else {
                                    u2C2 = U2.c();
                                }
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                return u2C2;
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th;
                            }
                        }
                    }));
                    f14989k.incrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void e() {
        f14989k.incrementAndGet();
    }

    abstract T a(Object obj);

    public final T b() {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.P2.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f14991a.f14835d;
        return this.f14992b;
    }
}
