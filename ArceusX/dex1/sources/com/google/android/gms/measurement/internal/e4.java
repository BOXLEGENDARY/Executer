package com.google.android.gms.measurement.internal;

import Q6.QtA.QXojhh;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.C1828a2;
import com.google.android.gms.internal.measurement.C1833b;
import com.google.android.gms.internal.measurement.C1835b1;
import com.google.android.gms.internal.measurement.C1836b2;
import com.google.android.gms.internal.measurement.C1851d1;
import com.google.android.gms.internal.measurement.C1854d4;
import com.google.android.gms.internal.measurement.C1891i1;
import com.google.android.gms.internal.measurement.C1907k1;
import com.google.android.gms.internal.measurement.C1947p1;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.InterfaceC2013x4;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import k0.BAKp.xAQOwX;
import n3.C2651i;
import o3.C2678a;

public final class e4 extends T3 {
    e4(c4 c4Var) {
        super(c4Var);
    }

    static <Builder extends InterfaceC2013x4> Builder D(Builder builder, byte[] bArr) throws C1854d4 {
        com.google.android.gms.internal.measurement.G3 g3B = com.google.android.gms.internal.measurement.G3.b();
        return g3B != null ? (Builder) builder.U(bArr, g3B) : (Builder) builder.N(bArr);
    }

    static List<com.google.android.gms.internal.measurement.L1> H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.K1 k1B = com.google.android.gms.internal.measurement.L1.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.K1 k1B2 = com.google.android.gms.internal.measurement.L1.B();
                    k1B2.D(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        k1B2.C(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        k1B2.E((String) obj);
                    } else if (obj instanceof Double) {
                        k1B2.B(((Double) obj).doubleValue());
                    }
                    k1B.v(k1B2);
                }
                if (k1B.s() > 0) {
                    arrayList.add(k1B.l());
                }
            }
        }
        return arrayList;
    }

    static List<Long> J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 * 64) + i8;
                if (i9 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i9)) {
                    j7 |= 1 << i8;
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    static boolean N(List<Long> list, int i7) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & list.get(i7 / 64).longValue()) != 0;
        }
        return false;
    }

    static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void m(com.google.android.gms.internal.measurement.G1 g12, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.L1> listJ = g12.J();
        int i7 = 0;
        while (true) {
            if (i7 >= listJ.size()) {
                i7 = -1;
                break;
            } else if (str.equals(listJ.get(i7).D())) {
                break;
            } else {
                i7++;
            }
        }
        com.google.android.gms.internal.measurement.K1 k1B = com.google.android.gms.internal.measurement.L1.B();
        k1B.D(str);
        if (obj instanceof Long) {
            k1B.C(((Long) obj).longValue());
        } else if (obj instanceof String) {
            k1B.E((String) obj);
        } else if (obj instanceof Double) {
            k1B.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            k1B.t(H((Bundle[]) obj));
        }
        if (i7 >= 0) {
            g12.D(i7, k1B);
        } else {
            g12.x(k1B);
        }
    }

    static final boolean n(zzat zzatVar, zzp zzpVar) {
        C2651i.l(zzatVar);
        C2651i.l(zzpVar);
        return (TextUtils.isEmpty(zzpVar.f17169e) && TextUtils.isEmpty(zzpVar.f17162J)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.L1 o(com.google.android.gms.internal.measurement.H1 h12, String str) {
        for (com.google.android.gms.internal.measurement.L1 l1 : h12.F()) {
            if (l1.D().equals(str)) {
                return l1;
            }
        }
        return null;
    }

    static final Object p(com.google.android.gms.internal.measurement.H1 h12, String str) {
        com.google.android.gms.internal.measurement.L1 l1O = o(h12, str);
        if (l1O == null) {
            return null;
        }
        if (l1O.X()) {
            return l1O.E();
        }
        if (l1O.V()) {
            return Long.valueOf(l1O.z());
        }
        if (l1O.S()) {
            return Double.valueOf(l1O.w());
        }
        if (l1O.y() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.L1> listF = l1O.F();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.L1 l1 : listF) {
            if (l1 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.L1 l12 : l1.F()) {
                    if (l12.X()) {
                        bundle.putString(l12.D(), l12.E());
                    } else if (l12.V()) {
                        bundle.putLong(l12.D(), l12.z());
                    } else if (l12.S()) {
                        bundle.putDouble(l12.D(), l12.w());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void q(StringBuilder sb, int i7, List<com.google.android.gms.internal.measurement.L1> list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        for (com.google.android.gms.internal.measurement.L1 l1 : list) {
            if (l1 != null) {
                s(sb, i8);
                sb.append("param {\n");
                v(sb, i8, "name", l1.W() ? this.f16818a.D().e(l1.D()) : null);
                v(sb, i8, "string_value", l1.X() ? l1.E() : null);
                v(sb, i8, "int_value", l1.V() ? Long.valueOf(l1.z()) : null);
                v(sb, i8, "double_value", l1.S() ? Double.valueOf(l1.w()) : null);
                if (l1.y() > 0) {
                    q(sb, i8, l1.F());
                }
                s(sb, i8);
                sb.append("}\n");
            }
        }
    }

    private final void r(StringBuilder sb, int i7, C1851d1 c1851d1) {
        String str;
        if (c1851d1 == null) {
            return;
        }
        s(sb, i7);
        sb.append("filter {\n");
        if (c1851d1.E()) {
            v(sb, i7, "complement", Boolean.valueOf(c1851d1.D()));
        }
        if (c1851d1.G()) {
            v(sb, i7, "param_name", this.f16818a.D().e(c1851d1.B()));
        }
        if (c1851d1.H()) {
            int i8 = i7 + 1;
            C1947p1 c1947p1Z = c1851d1.z();
            if (c1947p1Z != null) {
                s(sb, i8);
                sb.append("string_filter {\n");
                if (c1947p1Z.F()) {
                    switch (c1947p1Z.G()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = QXojhh.WqZPwh;
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    v(sb, i8, "match_type", str);
                }
                if (c1947p1Z.E()) {
                    v(sb, i8, "expression", c1947p1Z.z());
                }
                if (c1947p1Z.D()) {
                    v(sb, i8, "case_sensitive", Boolean.valueOf(c1947p1Z.C()));
                }
                if (c1947p1Z.w() > 0) {
                    s(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : c1947p1Z.B()) {
                        s(sb, i7 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(sb, i8);
                sb.append("}\n");
            }
        }
        if (c1851d1.F()) {
            w(sb, i7 + 1, "number_filter", c1851d1.y());
        }
        s(sb, i7);
        sb.append("}\n");
    }

    private static final void s(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    private static final String t(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void u(StringBuilder sb, int i7, String str, com.google.android.gms.internal.measurement.X1 x1) {
        if (x1 == null) {
            return;
        }
        s(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (x1.x() != 0) {
            s(sb, 4);
            sb.append(xAQOwX.MsGjljSXIAhSJd);
            int i8 = 0;
            for (Long l7 : x1.H()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (x1.z() != 0) {
            s(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : x1.J()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (x1.w() != 0) {
            s(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.F1 f12 : x1.G()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(f12.E() ? Integer.valueOf(f12.w()) : null);
                sb.append(":");
                sb.append(f12.D() ? Long.valueOf(f12.x()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (x1.y() != 0) {
            s(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.Z1 z1 : x1.I()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(z1.F() ? Integer.valueOf(z1.x()) : null);
                sb.append(": [");
                Iterator<Long> it = z1.C().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        s(sb, 3);
        sb.append("}\n");
    }

    private static final void v(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void w(StringBuilder sb, int i7, String str, C1891i1 c1891i1) {
        if (c1891i1 == null) {
            return;
        }
        s(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (c1891i1.D()) {
            int I2 = c1891i1.I();
            v(sb, i7, "comparison_type", I2 != 1 ? I2 != 2 ? I2 != 3 ? I2 != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c1891i1.F()) {
            v(sb, i7, "match_as_float", Boolean.valueOf(c1891i1.C()));
        }
        if (c1891i1.E()) {
            v(sb, i7, "comparison_value", c1891i1.y());
        }
        if (c1891i1.H()) {
            v(sb, i7, "min_comparison_value", c1891i1.B());
        }
        if (c1891i1.G()) {
            v(sb, i7, "max_comparison_value", c1891i1.z());
        }
        s(sb, i7);
        sb.append("}\n");
    }

    static int x(com.google.android.gms.internal.measurement.Q1 q1, String str) {
        for (int i7 = 0; i7 < q1.o0(); i7++) {
            if (str.equals(q1.i0(i7).C())) {
                return i7;
            }
        }
        return -1;
    }

    final <T extends Parcelable> T A(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (C2678a.C0210a unused) {
            this.f16818a.b().r().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final zzat B(C1833b c1833b) {
        Object obj;
        Bundle bundleZ = z(c1833b.e(), true);
        String string = (!bundleZ.containsKey("_o") || (obj = bundleZ.get("_o")) == null) ? "app" : obj.toString();
        String strB = W3.n.b(c1833b.d());
        if (strB == null) {
            strB = c1833b.d();
        }
        return new zzat(strB, new zzar(bundleZ), string, c1833b.a());
    }

    final com.google.android.gms.internal.measurement.H1 C(C2252n c2252n) {
        com.google.android.gms.internal.measurement.G1 g1B = com.google.android.gms.internal.measurement.H1.B();
        g1B.F(c2252n.f16918e);
        C2262p c2262p = new C2262p(c2252n.f16919f);
        while (c2262p.hasNext()) {
            String next = c2262p.next();
            com.google.android.gms.internal.measurement.K1 k1B = com.google.android.gms.internal.measurement.L1.B();
            k1B.D(next);
            Object objR = c2252n.f16919f.r(next);
            C2651i.l(objR);
            L(k1B, objR);
            g1B.x(k1B);
        }
        return g1B.l();
    }

    final String E(com.google.android.gms.internal.measurement.P1 p1) {
        if (p1 == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.R1 r1 : p1.z()) {
            if (r1 != null) {
                s(sb, 1);
                sb.append("bundle {\n");
                if (r1.l1()) {
                    v(sb, 1, "protocol_version", Integer.valueOf(r1.t1()));
                }
                v(sb, 1, "platform", r1.H());
                if (r1.h1()) {
                    v(sb, 1, "gmp_version", Long.valueOf(r1.C1()));
                }
                if (r1.r1()) {
                    v(sb, 1, "uploading_gmp_version", Long.valueOf(r1.H1()));
                }
                if (r1.f1()) {
                    v(sb, 1, "dynamite_version", Long.valueOf(r1.A1()));
                }
                if (r1.z0()) {
                    v(sb, 1, wtzgsqRsIZB.oax, Long.valueOf(r1.y1()));
                }
                v(sb, 1, "gmp_app_id", r1.E());
                v(sb, 1, "admob_app_id", r1.M1());
                v(sb, 1, "app_id", r1.N1());
                v(sb, 1, "app_version", r1.x());
                if (r1.x0()) {
                    v(sb, 1, "app_version_major", Integer.valueOf(r1.a0()));
                }
                v(sb, 1, "firebase_instance_id", r1.C());
                if (r1.e1()) {
                    v(sb, 1, "dev_cert_hash", Long.valueOf(r1.z1()));
                }
                v(sb, 1, "app_store", r1.w());
                if (r1.q1()) {
                    v(sb, 1, "upload_timestamp_millis", Long.valueOf(r1.G1()));
                }
                if (r1.o1()) {
                    v(sb, 1, "start_timestamp_millis", Long.valueOf(r1.F1()));
                }
                if (r1.g1()) {
                    v(sb, 1, "end_timestamp_millis", Long.valueOf(r1.B1()));
                }
                if (r1.k1()) {
                    v(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(r1.E1()));
                }
                if (r1.j1()) {
                    v(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(r1.D1()));
                }
                v(sb, 1, "app_instance_id", r1.O1());
                v(sb, 1, "resettable_device_id", r1.I());
                v(sb, 1, "ds_id", r1.B());
                if (r1.i1()) {
                    v(sb, 1, "limited_ad_tracking", Boolean.valueOf(r1.u0()));
                }
                v(sb, 1, "os_version", r1.G());
                v(sb, 1, "device_model", r1.z());
                v(sb, 1, "user_default_language", r1.J());
                if (r1.p1()) {
                    v(sb, 1, "time_zone_offset_minutes", Integer.valueOf(r1.v1()));
                }
                if (r1.y0()) {
                    v(sb, 1, "bundle_sequential_index", Integer.valueOf(r1.b1()));
                }
                if (r1.n1()) {
                    v(sb, 1, "service_upload", Boolean.valueOf(r1.v0()));
                }
                v(sb, 1, "health_monitor", r1.F());
                if (!this.f16818a.z().B(null, Y0.f16635o0) && r1.w0() && r1.x1() != 0) {
                    v(sb, 1, "android_id", Long.valueOf(r1.x1()));
                }
                if (r1.m1()) {
                    v(sb, 1, "retry_counter", Integer.valueOf(r1.u1()));
                }
                if (r1.A0()) {
                    v(sb, 1, "consent_signals", r1.y());
                }
                List<C1836b2> listO = r1.O();
                if (listO != null) {
                    for (C1836b2 c1836b2 : listO) {
                        if (c1836b2 != null) {
                            s(sb, 2);
                            sb.append("user_property {\n");
                            v(sb, 2, "set_timestamp_millis", c1836b2.Q() ? Long.valueOf(c1836b2.y()) : null);
                            v(sb, 2, "name", this.f16818a.D().f(c1836b2.C()));
                            v(sb, 2, "string_value", c1836b2.D());
                            v(sb, 2, "int_value", c1836b2.P() ? Long.valueOf(c1836b2.x()) : null);
                            v(sb, 2, "double_value", c1836b2.O() ? Double.valueOf(c1836b2.w()) : null);
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.D1> listL = r1.L();
                if (listL != null) {
                    for (com.google.android.gms.internal.measurement.D1 d12 : listL) {
                        if (d12 != null) {
                            s(sb, 2);
                            sb.append("audience_membership {\n");
                            if (d12.H()) {
                                v(sb, 2, "audience_id", Integer.valueOf(d12.w()));
                            }
                            if (d12.I()) {
                                v(sb, 2, "new_audience", Boolean.valueOf(d12.G()));
                            }
                            u(sb, 2, "current_data", d12.z());
                            if (d12.J()) {
                                u(sb, 2, "previous_data", d12.B());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.H1> listM = r1.M();
                if (listM != null) {
                    for (com.google.android.gms.internal.measurement.H1 h12 : listM) {
                        if (h12 != null) {
                            s(sb, 2);
                            sb.append("event {\n");
                            v(sb, 2, "name", this.f16818a.D().d(h12.E()));
                            if (h12.S()) {
                                v(sb, 2, "timestamp_millis", Long.valueOf(h12.z()));
                            }
                            if (h12.R()) {
                                v(sb, 2, "previous_timestamp_millis", Long.valueOf(h12.y()));
                            }
                            if (h12.Q()) {
                                v(sb, 2, "count", Integer.valueOf(h12.w()));
                            }
                            if (h12.x() != 0) {
                                q(sb, 2, h12.F());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                s(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final String F(C1835b1 c1835b1) {
        if (c1835b1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c1835b1.M()) {
            v(sb, 0, "filter_id", Integer.valueOf(c1835b1.x()));
        }
        v(sb, 0, "event_name", this.f16818a.D().d(c1835b1.D()));
        String strT = t(c1835b1.H(), c1835b1.I(), c1835b1.J());
        if (!strT.isEmpty()) {
            v(sb, 0, "filter_type", strT);
        }
        if (c1835b1.L()) {
            w(sb, 1, "event_count_filter", c1835b1.C());
        }
        if (c1835b1.w() > 0) {
            sb.append(wtzgsqRsIZB.CXMfpoErnBee);
            Iterator<C1851d1> it = c1835b1.E().iterator();
            while (it.hasNext()) {
                r(sb, 2, it.next());
            }
        }
        s(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String G(C1907k1 c1907k1) {
        if (c1907k1 == null) {
            return tAjeAKSIqDqzNP.hSKERacTnut;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c1907k1.G()) {
            v(sb, 0, "filter_id", Integer.valueOf(c1907k1.w()));
        }
        v(sb, 0, "property_name", this.f16818a.D().f(c1907k1.B()));
        String strT = t(c1907k1.D(), c1907k1.E(), c1907k1.F());
        if (!strT.isEmpty()) {
            v(sb, 0, "filter_type", strT);
        }
        r(sb, 1, c1907k1.x());
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> I(List<Long> list, List<Integer> list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.f16818a.b().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f16818a.b().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    final java.util.Map<java.lang.String, java.lang.Object> K(android.os.Bundle r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e4.K(android.os.Bundle, boolean):java.util.Map");
    }

    final void L(com.google.android.gms.internal.measurement.K1 k1, Object obj) {
        C2651i.l(obj);
        k1.z();
        k1.x();
        k1.w();
        k1.y();
        if (obj instanceof String) {
            k1.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            k1.C(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            k1.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            k1.t(H((Bundle[]) obj));
        } else {
            this.f16818a.b().r().b("Ignoring invalid (type) event param value", obj);
        }
    }

    final void M(C1828a2 c1828a2, Object obj) {
        C2651i.l(obj);
        c1828a2.v();
        c1828a2.t();
        c1828a2.s();
        if (obj instanceof String) {
            c1828a2.B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1828a2.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c1828a2.w(((Double) obj).doubleValue());
        } else {
            this.f16818a.b().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean O(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(this.f16818a.c().a() - j7) > j8;
    }

    final byte[] Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            this.f16818a.b().r().b("Failed to gzip content", e7);
            throw e7;
        }
    }

    @Override
    protected final boolean l() {
        return false;
    }

    final long y(byte[] bArr) throws NoSuchAlgorithmException {
        C2651i.l(bArr);
        this.f16818a.N().h();
        MessageDigest messageDigestS = i4.s();
        if (messageDigestS != null) {
            return i4.q0(messageDigestS.digest(bArr));
        }
        this.f16818a.b().r().a("Failed to get MD5");
        return 0L;
    }

    final Bundle z(Map<String, Object> map, boolean z7) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z7) {
                E6.b();
                if (this.f16818a.z().B(null, Y0.f16651w0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList2.add(z((Map) arrayList.get(i7), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        arrayList4.add(z((Map) arrayList3.get(i8), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }
}
