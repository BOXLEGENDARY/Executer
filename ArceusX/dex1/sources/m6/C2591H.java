package m6;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;

public class C2591H {

    private long f22105a = 0;

    private long f22106b = 0;

    private long f22107c = 0;

    private String f22108d = BuildConfig.FLAVOR;

    private String f22109e = BuildConfig.FLAVOR;

    private String f22110f = BuildConfig.FLAVOR;

    private String f22111g = BuildConfig.FLAVOR;

    private String f22112h = BuildConfig.FLAVOR;

    private String f22113i = BuildConfig.FLAVOR;

    private int f22114j = -1;

    private String f22115k = BuildConfig.FLAVOR;

    private String f22116l = BuildConfig.FLAVOR;

    private String f22117m = BuildConfig.FLAVOR;

    private String f22118n = BuildConfig.FLAVOR;

    private String f22119o = BuildConfig.FLAVOR;

    private String f22120p = BuildConfig.FLAVOR;

    private long f22121q = 0;

    private C2591H() {
    }

    public static Bundle L(Bundle bundle, C2591H c2591h) {
        if (c2591h == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", c2591h.o());
        bundle.putLong("mUserId", c2591h.t());
        bundle.putLong("mConversationId", c2591h.f());
        bundle.putString("mAccessCode", c2591h.d());
        bundle.putString("mLinkCode", c2591h.n());
        bundle.putString("mGameId", c2591h.h());
        bundle.putInt("mRequestType", c2591h.r());
        bundle.putString("mReferralPage", c2591h.p());
        bundle.putString("mLaunchData", c2591h.m());
        bundle.putString("mJoinAttemptId", c2591h.k());
        bundle.putString("mJoinAttemptOrigin", c2591h.l());
        bundle.putString("mIsoContext", c2591h.j());
        if (j6.d.a().s0()) {
            bundle.putLong("mReferredByPlayerId", c2591h.q());
        }
        if (j6.d.a().C1()) {
            bundle.putString("mReservedServerAccessCode", c2591h.s());
            bundle.putString("mCallId", c2591h.e());
        }
        bundle.putString("mGameJoinContext", c2591h.i());
        bundle.putString("roblox_event_id", c2591h.g());
        return bundle;
    }

    public static Bundle M(C2591H c2591h) {
        return L(null, c2591h);
    }

    public static C2591H a(Long l7, Long l8, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l9) {
        int i7;
        C2591H c2591h = new C2591H();
        long jLongValue = l7 != null ? l7.longValue() : -1L;
        long jLongValue2 = l8 != null ? l8.longValue() : -1L;
        long jLongValue3 = l9 != null ? l9.longValue() : -1L;
        if (jLongValue2 != -1) {
            c2591h.K(jLongValue2);
            long j7 = jLongValue;
            if (j7 != -1) {
                c2591h.F(j7);
            }
            i7 = 1;
        } else {
            long j8 = jLongValue;
            if (j8 != -1) {
                c2591h.F(j8);
                if (str2 != null) {
                    c2591h.E(str2);
                } else if (str != null) {
                    c2591h.u(str);
                } else {
                    if (str3 != null) {
                        c2591h.y(str3);
                        i7 = 3;
                    } else if (!j6.d.a().C1() || str4 == null) {
                        i7 = 0;
                    } else {
                        c2591h.J(str4);
                        i7 = 8;
                    }
                    if (j6.d.a().C1() && str5 != null) {
                        c2591h.v(str5);
                    }
                }
                i7 = 2;
                if (j6.d.a().C1()) {
                    c2591h.v(str5);
                }
            } else {
                i7 = -1;
            }
        }
        if (num != null) {
            c2591h.I(num.intValue());
        } else {
            c2591h.I(i7);
        }
        if (str6 != null) {
            c2591h.G(str6);
        }
        if (str7 != null) {
            c2591h.D(str7);
        }
        if (j6.d.a().s0() && jLongValue3 != -1) {
            c2591h.H(jLongValue3);
        }
        if (str8 != null) {
            c2591h.z(str8);
        }
        if (str9 != null) {
            c2591h.x(str9);
        }
        if (str10 != null) {
            c2591h.B(str10);
        }
        if (str11 != null) {
            c2591h.C(str11);
        }
        if (str12 != null) {
            c2591h.A(str12);
        }
        return c2591h;
    }

    public static C2591H b(Long l7, Long l8, String str, String str2, String str3) {
        C2591H c2591h = new C2591H();
        long jLongValue = l7 != null ? l7.longValue() : -1L;
        long jLongValue2 = l8 != null ? l8.longValue() : -1L;
        if (jLongValue != -1 && jLongValue2 != -1) {
            c2591h.w(jLongValue2);
            c2591h.F(jLongValue);
            c2591h.I(6);
        }
        if (str != null) {
            c2591h.G(str);
        }
        if (str2 != null) {
            c2591h.B(str2);
        }
        if (str3 != null) {
            c2591h.C(str3);
        }
        return c2591h;
    }

    public static C2591H c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C2591H c2591h = new C2591H();
        c2591h.F(bundle.getLong("mPlaceId", 0L));
        c2591h.K(bundle.getLong("mUserId", 0L));
        c2591h.w(bundle.getLong("mConversationId", 0L));
        c2591h.u(bundle.getString("mAccessCode", BuildConfig.FLAVOR));
        c2591h.E(bundle.getString("mLinkCode", BuildConfig.FLAVOR));
        c2591h.y(bundle.getString("mGameId", BuildConfig.FLAVOR));
        c2591h.I(bundle.getInt("mRequestType", -1));
        c2591h.G(bundle.getString("mReferralPage", BuildConfig.FLAVOR));
        c2591h.D(bundle.getString("mLaunchData"));
        c2591h.B(bundle.getString("mJoinAttemptId", BuildConfig.FLAVOR));
        c2591h.C(bundle.getString("mJoinAttemptOrigin", BuildConfig.FLAVOR));
        c2591h.A(bundle.getString("mIsoContext", BuildConfig.FLAVOR));
        c2591h.z(bundle.getString("mGameJoinContext"));
        c2591h.x(bundle.getString("roblox_event_id"));
        if (j6.d.a().s0()) {
            c2591h.H(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (j6.d.a().C1()) {
            c2591h.J(bundle.getString("mReservedServerAccessCode", BuildConfig.FLAVOR));
            c2591h.v(bundle.getString("mCallId", BuildConfig.FLAVOR));
        }
        return c2591h;
    }

    public void A(String str) {
        this.f22120p = str;
    }

    public void B(String str) {
        this.f22118n = str;
    }

    public void C(String str) {
        this.f22119o = str;
    }

    public void D(String str) {
        this.f22115k = str;
    }

    public void E(String str) {
        this.f22109e = str;
    }

    public void F(long j7) {
        this.f22105a = j7;
    }

    public void G(String str) {
        this.f22113i = str;
    }

    public void H(long j7) {
        this.f22121q = j7;
    }

    public void I(int i7) {
        this.f22114j = i7;
    }

    public void J(String str) {
        this.f22111g = str;
    }

    public void K(long j7) {
        this.f22106b = j7;
    }

    public String d() {
        return this.f22108d;
    }

    public String e() {
        return this.f22112h;
    }

    public long f() {
        return this.f22107c;
    }

    public String g() {
        return this.f22117m;
    }

    public String h() {
        return this.f22110f;
    }

    public String i() {
        return this.f22116l;
    }

    public String j() {
        return this.f22120p;
    }

    public String k() {
        return this.f22118n;
    }

    public String l() {
        return this.f22119o;
    }

    public String m() {
        return this.f22115k;
    }

    public String n() {
        return this.f22109e;
    }

    public long o() {
        return this.f22105a;
    }

    public String p() {
        return this.f22113i;
    }

    public long q() {
        return this.f22121q;
    }

    public int r() {
        return this.f22114j;
    }

    public String s() {
        return this.f22111g;
    }

    public long t() {
        return this.f22106b;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f22105a + ", userId:" + this.f22106b + ", conversationId:" + this.f22107c + ", accessCode:" + this.f22108d + ", linkCode:" + this.f22109e + ", gameId:" + this.f22110f + ", reservedServerAccessCode:" + this.f22111g + ", callId:" + this.f22112h + ", reqType:" + this.f22114j + ", referralPage:" + this.f22113i + ", launchData:" + this.f22115k + ", gameJoinContext:" + this.f22116l + ", eventId:" + this.f22117m + ", joinAttemptId:" + this.f22118n + ", joinAttemptOrigin:" + this.f22119o + ", mIsoContext:" + this.f22120p + ", referredByPlayerId:" + this.f22121q + " }";
    }

    public void u(String str) {
        this.f22108d = str;
    }

    public void v(String str) {
        this.f22112h = str;
    }

    public void w(long j7) {
        this.f22107c = j7;
    }

    public void x(String str) {
        this.f22117m = str;
    }

    public void y(String str) {
        this.f22110f = str;
    }

    public void z(String str) {
        this.f22116l = str;
    }
}
