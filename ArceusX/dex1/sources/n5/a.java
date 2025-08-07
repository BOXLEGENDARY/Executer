package N5;

import E6.h;
import K0.wJ.BtcVLuo;
import N5.b;
import Z.tNT.PexNRiLSd;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentManager;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.M;
import com.roblox.client.P;
import com.roblox.client.datastructures.NameValuePair;
import h7.l;
import h7.n;
import h7.s;
import java.util.ArrayList;
import java.util.List;

public class a implements b.a {

    private static a f2646j;

    private SharedPreferences f2647a;

    private int f2648b = 0;

    private int f2649c = 0;

    private int f2650d = 0;

    private int f2651e = 0;

    private long f2652f = 0;

    private int f2653g = 0;

    private Boolean f2654h = Boolean.TRUE;

    private List<NameValuePair> f2655i;

    private a() {
    }

    public static a e() {
        a aVar = f2646j;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            try {
                if (f2646j == null) {
                    f2646j = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2646j;
    }

    private h f() {
        return h.b();
    }

    public static void h(Context context) {
        s.a(context, "rate_me_maybe").edit().clear().apply();
        l.a("RateMeMaybe", "Cleared RateMeMaybe shared preferences.");
    }

    private void j(String str) {
        this.f2655i.set(3, new NameValuePair("btn", str));
        P.h("appRatingPrompt", "tap", this.f2655i);
    }

    private void l(Activity activity) {
        FragmentManager supportFragmentManager = ((d) activity).getSupportFragmentManager();
        if (supportFragmentManager.k0("rmmFragment") != null) {
            return;
        }
        b bVar = new b();
        bVar.t(this);
        try {
            bVar.show(supportFragmentManager, "rmmFragment");
            if (j6.d.a().a1()) {
                this.f2655i.set(3, new NameValuePair("btn", BtcVLuo.EnxAorAOmkkNx));
                P.h("appRatingPrompt", "impression", this.f2655i);
            } else {
                f().p("Mobile-Ratings-Shown-Android");
            }
        } catch (IllegalStateException e7) {
            l.d("RateMeMaybe", "Exception: " + e7.getMessage());
        }
    }

    @Override
    public void a() {
        if (j6.d.a().a1()) {
            j("close");
        }
        if (this.f2654h.booleanValue()) {
            b(true);
        } else {
            d();
        }
    }

    @Override
    public void b(boolean z7) {
        if (z7 || !j6.d.a().a1()) {
            f().p("Mobile-Ratings-RemindMe-Tapped-Android");
        } else {
            j("remind");
        }
    }

    @Override
    public void c(Context context) {
        SharedPreferences.Editor editorEdit = this.f2647a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, M.f19630a, 0).show();
        }
        if (j6.d.a().a1()) {
            j("yes");
        } else {
            f().p("Mobile-Ratings-Yes-Tapped-Android");
        }
    }

    @Override
    public void d() {
        SharedPreferences.Editor editorEdit = this.f2647a.edit();
        editorEdit.putBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", true);
        editorEdit.apply();
        if (j6.d.a().a1()) {
            j("not_now");
        } else {
            f().p("Mobile-Ratings-NotNow-Tapped-Android");
        }
    }

    public void g(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f2655i = arrayList;
        arrayList.add(new NameValuePair("target", "mobile"));
        this.f2655i.add(new NameValuePair("placeId", BuildConfig.FLAVOR));
        this.f2655i.add(new NameValuePair("gameId", BuildConfig.FLAVOR));
        this.f2655i.add(new NameValuePair("btn", BuildConfig.FLAVOR));
        SharedPreferences sharedPreferencesA = s.a(context, "rate_me_maybe");
        this.f2647a = sharedPreferencesA;
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        if (!"2.684.688".equals(this.f2647a.getString("CURRENT_APP_VERSION", BuildConfig.FLAVOR))) {
            h(context);
            editorEdit.putString("CURRENT_APP_VERSION", "2.684.688");
        }
        SharedPreferences sharedPreferences = this.f2647a;
        String str = PexNRiLSd.GksOwgAjZnIoXHN;
        if (sharedPreferences.getLong(str, 0L) == 0) {
            editorEdit.putLong(str, System.currentTimeMillis());
        }
        editorEdit.putInt("PREF_TOTAL_LAUNCH_COUNT", this.f2647a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0) + 1);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", this.f2647a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0) + 1);
        editorEdit.apply();
    }

    public void i(Activity activity, long j7, String str) {
        if (this.f2647a.getBoolean("PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION", false)) {
            return;
        }
        if (!n.f(activity)) {
            l.a("RateMeMaybe", "No Play Store installed on device.");
            return;
        }
        if (this.f2653g > this.f2647a.getInt("PREF_GAMES_PLAYED", 0)) {
            l.a("RateMeMaybe", "Hasn't played a number games higher than the minimum requested.");
            return;
        }
        if (this.f2652f > this.f2647a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            l.a("RateMeMaybe", "Hasn't played a game for more than the minimum time requested.");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f2647a.edit();
        int i7 = this.f2647a.getInt("PREF_TOTAL_LAUNCH_COUNT", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = this.f2647a.getLong("PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH", 0L);
        long j9 = this.f2647a.getLong("PREF_TIME_OF_LAST_PROMPT", 0L);
        int i8 = this.f2647a.getInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        if (i7 < this.f2648b || jCurrentTimeMillis - j8 < this.f2649c * 86400000) {
            l.a("RateMeMaybe", "Not enough time until initial prompt.");
            editorEdit.apply();
            return;
        }
        l.a("RateMeMaybe", "Enough time until initial prompt.");
        if (j9 != 0 && (i8 < this.f2650d || jCurrentTimeMillis - j9 < this.f2651e * 86400000)) {
            l.a("RateMeMaybe", "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)");
            editorEdit.apply();
            return;
        }
        l.a("RateMeMaybe", "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)");
        if (j6.d.a().a1()) {
            this.f2655i.set(1, new NameValuePair("placeId", Long.toString(j7)));
            this.f2655i.set(2, new NameValuePair("gameId", str));
        }
        editorEdit.putLong("PREF_TIME_OF_LAST_PROMPT", jCurrentTimeMillis);
        editorEdit.putInt("PREF_LAUNCHES_SINCE_LAST_PROMPT", 0);
        editorEdit.apply();
        l(activity);
    }

    public void k(int i7, int i8, int i9, int i10, long j7, int i11) {
        this.f2648b = i7;
        this.f2649c = i8;
        this.f2650d = i9;
        this.f2651e = i10;
        this.f2652f = j7;
        this.f2653g = i11;
    }

    public void m(long j7) {
        SharedPreferences.Editor editorEdit = this.f2647a.edit();
        if (j7 > this.f2647a.getLong("PREF_LONGEST_GAME_DURATION", 0L)) {
            editorEdit.putLong("PREF_LONGEST_GAME_DURATION", j7);
        }
        editorEdit.putInt("PREF_GAMES_PLAYED", this.f2647a.getInt("PREF_GAMES_PLAYED", 0) + 1);
        editorEdit.apply();
    }
}
