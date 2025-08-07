package com.google.android.gms.measurement.internal;

import Z.tNT.PexNRiLSd;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.internal.measurement.C1920l6;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import f6.ck.ZJZXBWla;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import n3.C2651i;
import x3.C2989c;

public final class i4 extends AbstractC2230i2 {

    private static final String[] f16836g = {"firebase_", "google_", "ga_"};

    private static final String[] f16837h = {"_err"};

    public static final int f16838i = 0;

    private SecureRandom f16839c;

    private final AtomicLong f16840d;

    private int f16841e;

    private Integer f16842f;

    i4(N1 n1) {
        super(n1);
        this.f16842f = null;
        this.f16840d = new AtomicLong(0L);
    }

    static boolean V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean W(String str) {
        C2651i.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean X(Context context) {
        ActivityInfo receiverInfo;
        C2651i.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean Y(Context context, boolean z7) {
        C2651i.l(context);
        return i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean a0(String str) {
        return !f16837h[0].equals(str);
    }

    static final boolean d0(Bundle bundle, int i7) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    static final boolean e0(String str) {
        C2651i.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.f16818a.z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f16818a.z();
            return 256;
        }
        if (this.f16818a.z().B(null, Y0.f16613d0) && PexNRiLSd.rxDnsTksXyOdM.equals(str)) {
            this.f16818a.z();
            return 100;
        }
        this.f16818a.z();
        return 36;
    }

    private final Object g0(int i7, Object obj, boolean z7, boolean z8) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(obj.toString(), i7, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleU0 = u0((Bundle) parcelable);
                if (!bundleU0.isEmpty()) {
                    arrayList.add(bundleU0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean h0(String str, String[] strArr) {
        C2651i.l(strArr);
        for (String str2 : strArr) {
            if (Z(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static long q0(byte[] bArr) {
        C2651i.l(bArr);
        int length = bArr.length;
        int i7 = 0;
        C2651i.p(length > 0);
        long j7 = 0;
        for (int i8 = length - 1; i8 >= 0 && i8 >= bArr.length - 8; i8--) {
            j7 += (bArr[i8] & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    static MessageDigest s() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList<Bundle> u(List<zzab> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzab zzabVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.f17134d);
            bundle.putString("origin", zzabVar.f17135e);
            bundle.putLong("creation_timestamp", zzabVar.f17137v);
            bundle.putString(sMlEMqrxoGI.UrQFZ, zzabVar.f17136i.f17147e);
            W3.m.b(bundle, C2651i.l(zzabVar.f17136i.l()));
            bundle.putBoolean("active", zzabVar.f17138w);
            String str = zzabVar.f17139y;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzat zzatVar = zzabVar.f17140z;
            if (zzatVar != null) {
                bundle.putString("timed_out_event_name", zzatVar.f17142d);
                zzar zzarVar = zzatVar.f17143e;
                if (zzarVar != null) {
                    bundle.putBundle("timed_out_event_params", zzarVar.o());
                }
            }
            bundle.putLong("trigger_timeout", zzabVar.f17130A);
            zzat zzatVar2 = zzabVar.f17131B;
            if (zzatVar2 != null) {
                bundle.putString("triggered_event_name", zzatVar2.f17142d);
                zzar zzarVar2 = zzatVar2.f17143e;
                if (zzarVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzarVar2.o());
                }
            }
            bundle.putLong("triggered_timestamp", zzabVar.f17136i.f17148i);
            bundle.putLong("time_to_live", zzabVar.f17132C);
            zzat zzatVar3 = zzabVar.f17133D;
            if (zzatVar3 != null) {
                bundle.putString("expired_event_name", zzatVar3.f17142d);
                zzar zzarVar3 = zzatVar3.f17143e;
                if (zzarVar3 != null) {
                    bundle.putBundle("expired_event_params", zzarVar3.o());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void x(S2 s22, Bundle bundle, boolean z7) {
        if (bundle != null && s22 != null) {
            if (!bundle.containsKey("_sc") || z7) {
                String str = s22.f16513a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = s22.f16514b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", s22.f16515c);
                return;
            }
            z7 = false;
        }
        if (bundle != null && s22 == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    final void A(h4 h4Var, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        d0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        h4Var.a(str, "_err", bundle);
    }

    final void B(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f16818a.b().x().c("Not putting event parameter. Invalid value type. name, type", this.f16818a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void C(InterfaceC1906k0 interfaceC1906k0, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning boolean value to wrapper", e7);
        }
    }

    public final void D(InterfaceC1906k0 interfaceC1906k0, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning bundle list to wrapper", e7);
        }
    }

    public final void E(InterfaceC1906k0 interfaceC1906k0, Bundle bundle) {
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning bundle value to wrapper", e7);
        }
    }

    public final void F(InterfaceC1906k0 interfaceC1906k0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning byte array to wrapper", e7);
        }
    }

    public final void G(InterfaceC1906k0 interfaceC1906k0, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning int value to wrapper", e7);
        }
    }

    public final void H(InterfaceC1906k0 interfaceC1906k0, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning long value to wrapper", e7);
        }
    }

    public final void I(InterfaceC1906k0 interfaceC1906k0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16818a.b().w().b("Error returning string value to wrapper", e7);
        }
    }

    final void J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z7) {
        int i7;
        String str4;
        int iO;
        if (bundle == null) {
            return;
        }
        this.f16818a.z();
        int i8 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int iM0 = !z7 ? m0(str5) : 0;
                if (iM0 == 0) {
                    iM0 = l0(str5);
                }
                i7 = iM0;
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                w(bundle, i7, str5, str5, i7 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (T(bundle.get(str5))) {
                    this.f16818a.b().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iO = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    iO = O(str, str2, str5, bundle.get(str5), bundle, list, z7, false);
                }
                if (iO != 0 && !"_ev".equals(str4)) {
                    w(bundle, iO, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (W(str4) && !h0(str4, W3.o.f7659d) && (i8 = i8 + 1) > 0) {
                    this.f16818a.b().s().c("Item cannot contain custom parameters", this.f16818a.D().d(str2), this.f16818a.D().b(bundle));
                    d0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    final boolean K(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (e0(str)) {
                return true;
            }
            if (this.f16818a.q()) {
                this.f16818a.b().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2234j1.z(str));
            }
            return false;
        }
        C1920l6.b();
        if (this.f16818a.z().B(null, Y0.f16615e0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f16818a.q()) {
                this.f16818a.b().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (e0(str2)) {
            return true;
        }
        this.f16818a.b().s().b("Invalid admob_app_id. Analytics disabled.", C2234j1.z(str2));
        return false;
    }

    final boolean L(String str, int i7, String str2) {
        if (str2 == null) {
            this.f16818a.b().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        this.f16818a.b().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    final boolean M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f16818a.b().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        C2651i.l(str2);
        String[] strArr3 = f16836g;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                this.f16818a.b().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && h0(str2, strArr2)) {
            return true;
        }
        this.f16818a.b().s().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean N(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i7) {
                this.f16818a.b().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final int O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final boolean P(String str, String str2) {
        if (str2 == null) {
            this.f16818a.b().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f16818a.b().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f16818a.b().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f16818a.b().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.f16818a.b().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f16818a.b().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f16818a.b().s().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f16818a.b().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean R(String str) {
        h();
        if (C2989c.a(this.f16818a.f()).a(str) == 0) {
            return true;
        }
        this.f16818a.b().q().b("Permission not granted", str);
        return false;
    }

    final boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strU = this.f16818a.z().u();
        this.f16818a.d();
        return strU.equals(str);
    }

    final boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = C2989c.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            this.f16818a.b().r().b("Package name not found", e7);
            return true;
        } catch (CertificateException e8) {
            this.f16818a.b().r().b("Error obtaining certificate", e8);
            return true;
        }
    }

    final boolean b0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            C2651i.l(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final byte[] c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    protected final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f16818a.b().w().a("Utils falling back to Random for random id");
            }
        }
        this.f16840d.set(jNextLong);
    }

    @Override
    protected final boolean j() {
        return true;
    }

    final int j0(String str, Object obj) {
        return "_ldl".equals(str) ? N("user property referrer", str, f0(str), obj) : N("user property", str, f0(str), obj) ? 0 : 7;
    }

    final int k0(String str) {
        if (!P("event", str)) {
            return 2;
        }
        if (!M("event", W3.n.f7652a, W3.n.f7653b, str)) {
            return 13;
        }
        this.f16818a.z();
        return !L("event", 40, str) ? 2 : 0;
    }

    final int l0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        this.f16818a.z();
        return !L("event param", 40, str) ? 3 : 0;
    }

    final int m0(String str) {
        if (!Q("event param", str)) {
            return 3;
        }
        if (!M("event param", null, null, str)) {
            return 14;
        }
        this.f16818a.z();
        return !L("event param", 40, str) ? 3 : 0;
    }

    final int n0(String str) {
        if (!P("user property", str)) {
            return 6;
        }
        if (!M("user property", W3.p.f7660a, null, str)) {
            return 15;
        }
        this.f16818a.z();
        return !L("user property", 24, str) ? 6 : 0;
    }

    final Object o(String str, Object obj) {
        int i7 = 256;
        if ("_ev".equals(str)) {
            this.f16818a.z();
            return g0(256, obj, true, true);
        }
        if (V(str)) {
            this.f16818a.z();
        } else {
            this.f16818a.z();
            i7 = 100;
        }
        return g0(i7, obj, false, true);
    }

    public final int o0() {
        if (this.f16842f == null) {
            this.f16842f = Integer.valueOf(C1819d.f().a(this.f16818a.f()) / 1000);
        }
        return this.f16842f.intValue();
    }

    final Object p(String str, Object obj) {
        return "_ldl".equals(str) ? g0(f0(str), obj, true, false) : g0(f0(str), obj, false, false);
    }

    public final int p0(int i7) {
        return C1819d.f().h(this.f16818a.f(), 12451000);
    }

    public final String q(String str, int i7, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (z7) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i7))).concat("...");
        }
        return null;
    }

    public final URL r(long j7, String str, String str2, long j8) {
        try {
            C2651i.f(str2);
            C2651i.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 46000L, Integer.valueOf(o0())), str2, str, Long.valueOf(j8));
            if (str.equals(this.f16818a.z().v())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e7) {
            e = e7;
            this.f16818a.b().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e8) {
            e = e8;
            this.f16818a.b().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long r0() {
        long andIncrement;
        long j7;
        if (this.f16840d.get() != 0) {
            synchronized (this.f16840d) {
                this.f16840d.compareAndSet(-1L, 1L);
                andIncrement = this.f16840d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f16840d) {
            long jNextLong = new Random(System.nanoTime() ^ this.f16818a.c().a()).nextLong();
            int i7 = this.f16841e + 1;
            this.f16841e = i7;
            j7 = jNextLong + i7;
        }
        return j7;
    }

    public final long s0(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    final SecureRandom t() {
        h();
        if (this.f16839c == null) {
            this.f16839c = new SecureRandom();
        }
        return this.f16839c;
    }

    final Bundle t0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(ZJZXBWla.zkqkjxWFqcRCUQ, queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("term", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("content", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("aclid", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("cp1", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("anid", queryParameter9);
                }
                return bundle;
            } catch (UnsupportedOperationException e7) {
                this.f16818a.b().w().b("Install referrer url isn't a hierarchical URI", e7);
            }
        }
        return null;
    }

    final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objO = o(str, bundle.get(str));
                if (objO == null) {
                    this.f16818a.b().x().b("Param value can't be null", this.f16818a.D().e(str));
                } else {
                    B(bundle2, str, objO);
                }
            }
        }
        return bundle2;
    }

    final void v(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            this.f16818a.b().w().b("Params already contained engagement", Long.valueOf(j8));
        } else {
            j8 = 0;
        }
        bundle.putLong("_et", j7 + j8);
    }

    final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    final void w(Bundle bundle, int i7, String str, String str2, Object obj) {
        if (d0(bundle, i7)) {
            this.f16818a.z();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                C2651i.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final zzat w0(String str, String str2, Bundle bundle, String str3, long j7, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) != 0) {
            this.f16818a.b().r().b("Invalid conditional property event name", this.f16818a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleV0 = v0(str, str2, bundle2, v3.f.a("_o"), true);
        if (z7) {
            bundleV0 = u0(bundleV0);
        }
        C2651i.l(bundleV0);
        return new zzat(str2, new zzar(bundleV0), str3, j7);
    }

    final void y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f16818a.N().B(bundle, str, bundle2.get(str));
            }
        }
    }

    final void z(C2239k1 c2239k1, int i7) {
        int i8 = 0;
        for (String str : new TreeSet(c2239k1.f16870d.keySet())) {
            if (W(str) && (i8 = i8 + 1) > i7) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i7);
                sb.append(" params");
                this.f16818a.b().s().c(sb.toString(), this.f16818a.D().d(c2239k1.f16867a), this.f16818a.D().b(c2239k1.f16870d));
                d0(c2239k1.f16870d, 5);
                c2239k1.f16870d.remove(str);
            }
        }
    }
}
