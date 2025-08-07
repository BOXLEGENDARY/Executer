package m6;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;

public class C2594K {

    public int f22135a;

    public long f22136b;

    public long f22137c;

    public String f22138d;

    public String f22139e;

    public String f22140f;

    public long f22141g;

    public String f22142h;

    public String f22143i;

    public String f22144j;

    public String f22145k;

    public String f22146l;

    public String f22147m;

    public String f22148n;

    public String f22149o;

    public String f22150p;

    public long f22151q;

    public C2594K(Bundle bundle) {
        this.f22135a = 0;
        this.f22136b = 0L;
        this.f22137c = 0L;
        this.f22138d = BuildConfig.FLAVOR;
        this.f22139e = BuildConfig.FLAVOR;
        this.f22140f = BuildConfig.FLAVOR;
        this.f22141g = 0L;
        this.f22142h = BuildConfig.FLAVOR;
        this.f22143i = BuildConfig.FLAVOR;
        this.f22144j = BuildConfig.FLAVOR;
        this.f22145k = BuildConfig.FLAVOR;
        this.f22146l = BuildConfig.FLAVOR;
        this.f22147m = BuildConfig.FLAVOR;
        this.f22148n = BuildConfig.FLAVOR;
        this.f22149o = BuildConfig.FLAVOR;
        this.f22150p = BuildConfig.FLAVOR;
        this.f22151q = 0L;
        this.f22137c = bundle.getLong("roblox_placeId", 0L);
        this.f22138d = bundle.getString("roblox_accessCode");
        this.f22139e = bundle.getString("roblox_linkCode");
        this.f22140f = bundle.getString("roblox_gameId");
        this.f22136b = bundle.getLong("roblox_userId", 0L);
        this.f22141g = bundle.getLong("roblox_conversationId", 0L);
        this.f22142h = bundle.getString("roblox_reservedServerAccessCode");
        this.f22143i = bundle.getString("roblox_callId");
        this.f22135a = bundle.getInt("roblox_joinRequestType", -1);
        this.f22144j = bundle.getString("roblox_referralPage");
        this.f22145k = bundle.getString("roblox_launchData");
        this.f22148n = bundle.getString("roblox_joinAttemptId");
        this.f22149o = bundle.getString("roblox_joinAttemptOrigin");
        this.f22150p = bundle.getString("roblox_isoContext");
        if (j6.d.a().s0()) {
            this.f22151q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f22146l = bundle.getString("roblox_gameJoinContext");
        this.f22147m = bundle.getString("roblox_event_id");
    }
}
