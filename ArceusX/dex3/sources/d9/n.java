package d9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0003\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0005\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019\"\u0018\u0010 \u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006!"}, d2 = {"Landroid/content/Context;", "", "j", "(Landroid/content/Context;)Z", "h", "()Z", "b", "a", "", "", "packages", "i", "(Landroid/content/Context;Ljava/util/List;)Z", "binName", "c", "(Ljava/lang/String;)Z", "f", "g", "d", "k", "()Ljava/util/List;", "l", "command", "e", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/List;", "knownRootAppsPackages", "knownDangerousAppsPackages", "knownRootCloakingPackages", "binDirectories", "pathsThatShouldNotBeWritable", "Ljava/lang/Boolean;", "isDeviceRootedCachedValue", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class n {

    @NotNull
    private static final List<String> a = CollectionsKt.m(new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"});

    @NotNull
    private static final List<String> b = CollectionsKt.m(new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"});

    @NotNull
    private static final List<String> c = CollectionsKt.m(new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"});

    @NotNull
    private static final List<String> d = CollectionsKt.m(new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"});

    @NotNull
    private static final List<String> e = CollectionsKt.m(new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"});
    private static Boolean f;

    private static final boolean a(Context context) {
        return false;
    }

    private static final boolean b(Context context) {
        return false;
    }

    private static final boolean c(String str) {
        return false;
    }

    private static final boolean d() {
        return false;
    }

    private static final boolean e(String str) {
        return false;
    }

    private static final boolean f() {
        boolean z = false;
        boolean z2 = true;
        for (String str : l()) {
            if (StringsKt.K(str, "[ro.debuggable]", false, 2, (Object) null) && StringsKt.K(str, "[1]", false, 2, (Object) null)) {
                z = true;
            } else if (StringsKt.K(str, "[ro.secure]", false, 2, (Object) null) && StringsKt.K(str, "[0]", false, 2, (Object) null)) {
                z2 = false;
            }
        }
        return z && !z2;
    }

    private static final boolean g() {
        String str;
        String str2;
        Iterator<String> it = k().iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default(it.next(), new String[]{" "}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 6) {
                str = (String) listSplit$default.get(2);
                str2 = (String) listSplit$default.get(5);
            } else if (listSplit$default.size() == 4) {
                str = (String) listSplit$default.get(1);
                str2 = (String) listSplit$default.get(3);
            } else {
                continue;
            }
            Iterator<String> it2 = e.iterator();
            while (it2.hasNext()) {
                if (StringsKt.r(str, it2.next(), true)) {
                    int length = str2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        char cCharAt = str2.charAt(!z ? i : length);
                        boolean z2 = CharsKt.b(cCharAt) || cCharAt == '(' || cCharAt == ')';
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    Iterator it3 = StringsKt.split$default(str2.subSequence(i, length + 1).toString(), new String[]{","}, false, 0, 6, (Object) null).iterator();
                    while (it3.hasNext()) {
                        if (StringsKt.r((String) it3.next(), "rw", true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static final boolean h() {
        return false;
    }

    private static final boolean i(Context context, List<String> list) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static final boolean j(Context context) {
        return false;
    }

    private static final List<String> k() {
        return e("mount");
    }

    private static final List<String> l() {
        return e("getprop");
    }
}
