package com.google.android.datatransport.cct;

import U.Gw.oeVkjmfPcLbWm;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AdRevenueScheme;
import com.google.android.datatransport.cct.d;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import j0.tkB.pkcpMQSgx;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r2.j;
import r2.k;
import r2.l;
import r2.m;
import r2.n;
import r2.o;
import r2.p;
import s2.h;
import s2.i;
import t2.f;
import t2.g;
import t2.m;

final class d implements m {

    private final U4.a f13877a;

    private final ConnectivityManager f13878b;

    private final Context f13879c;

    final URL f13880d;

    private final C2.a f13881e;

    private final C2.a f13882f;

    private final int f13883g;

    static final class a {

        final URL f13884a;

        final j f13885b;

        final String f13886c;

        a(URL url, j jVar, String str) {
            this.f13884a = url;
            this.f13885b = jVar;
            this.f13886c = str;
        }

        a a(URL url) {
            return new a(url, this.f13885b, this.f13886c);
        }
    }

    static final class b {

        final int f13887a;

        final URL f13888b;

        final long f13889c;

        b(int i7, URL url, long j7) {
            this.f13887a = i7;
            this.f13888b = url;
            this.f13889c = j7;
        }
    }

    d(Context context, C2.a aVar, C2.a aVar2, int i7) {
        this.f13877a = j.b();
        this.f13879c = context;
        this.f13878b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13880d = n(com.google.android.datatransport.cct.a.f13868c);
        this.f13881e = aVar2;
        this.f13882f = aVar;
        this.f13883g = i7;
    }

    public b e(a aVar) throws IOException {
        w2.a.e("CctTransportBackend", "Making request to: %s", aVar.f13884a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13884a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13883g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13886c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f13877a.a(aVar.f13885b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    w2.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    w2.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    w2.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (U4.b e7) {
            e = e7;
            w2.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            w2.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            w2.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            w2.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.e();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.e();
        }
        if (o.b.c(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.e() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            w2.a.c("CctTransportBackend", "Unable to find version code for package", e7);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a aVarB = r2.m.a().f(p.DEFAULT).g(this.f13882f.a()).h(this.f13881e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(r2.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b(GObvYfBKohxpYX.fQbmldaZp)).h(iVar2.b("manufacturer")).e(iVar2.b(pkcpMQSgx.acRVSHoTi)).c(iVar2.b(AdRevenueScheme.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                q2.b bVarB = hVarE.b();
                if (bVarB.equals(q2.b.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (bVarB.equals(q2.b.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    w2.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.c(iVar3.g("net-type"))).b(o.b.c(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static a l(a aVar, b bVar) {
        URL url = bVar.f13888b;
        if (url == null) {
            return null;
        }
        w2.a.a("CctTransportBackend", oeVkjmfPcLbWm.WypmQfX, url);
        return aVar.a(bVar.f13888b);
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Invalid url: " + str, e7);
        }
    }

    @Override
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f13878b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f13879c).getSimOperator()).c("application_build", Integer.toString(h(this.f13879c))).d();
    }

    @Override
    public g b(f fVar) {
        j jVarI = i(fVar);
        URL urlN = this.f13880d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) x2.b.a(5, new a(urlN, jVarI, strD), new x2.a() {
                @Override
                public final Object apply(Object obj) {
                    return this.f13876a.e((d.a) obj);
                }
            }, new x2.c() {
                @Override
                public final Object a(Object obj, Object obj2) {
                    return d.l((d.a) obj, (d.b) obj2);
                }
            });
            int i7 = bVar.f13887a;
            if (i7 == 200) {
                return g.e(bVar.f13889c);
            }
            if (i7 < 500 && i7 != 404) {
                return i7 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e7) {
            w2.a.c("CctTransportBackend", "Could not make request to the backend", e7);
            return g.f();
        }
    }

    d(Context context, C2.a aVar, C2.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
