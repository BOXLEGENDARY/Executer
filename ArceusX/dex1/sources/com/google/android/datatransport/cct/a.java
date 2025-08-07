package com.google.android.datatransport.cct;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s2.g;

public final class a implements g {

    static final String f13868c;

    static final String f13869d;

    private static final String f13870e;

    private static final Set<q2.b> f13871f;

    public static final a f13872g;

    public static final a f13873h;

    private final String f13874a;

    private final String f13875b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13868c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f13869d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13870e = strA3;
        f13871f = Collections.unmodifiableSet(new HashSet(Arrays.asList(q2.b.b("proto"), q2.b.b("json"))));
        f13872g = new a(strA, null);
        f13873h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f13874a = str;
        this.f13875b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException(tAjeAKSIqDqzNP.fSKp);
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override
    public Set<q2.b> a() {
        return f13871f;
    }

    public byte[] b() {
        String str = this.f13875b;
        if (str == null && this.f13874a == null) {
            return null;
        }
        String str2 = this.f13874a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f13875b;
    }

    public String e() {
        return this.f13874a;
    }

    @Override
    public byte[] getExtras() {
        return b();
    }

    @Override
    public String getName() {
        return "cct";
    }
}
