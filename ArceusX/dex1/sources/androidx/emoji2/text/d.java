package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d {

    public static class a {

        private final b f10809a;

        public a(b bVar) {
            this.f10809a = bVar == null ? e() : bVar;
        }

        private f.c a(Context context, v0.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new k(context, eVar);
        }

        private List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private v0.e d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new v0.e(str, str2, "emojicompat-emoji-font", b(this.f10809a.b(packageManager, str2)));
        }

        private static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0093d() : new c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f10809a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f10809a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        public f.c c(Context context) {
            return a(context, h(context));
        }

        v0.e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            x0.g.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                return null;
            }
        }
    }

    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i7) {
            throw null;
        }
    }

    public static class c extends b {
        @Override
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i7) {
            return packageManager.queryIntentContentProviders(intent, i7);
        }
    }

    public static class C0093d extends c {
        @Override
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static k a(Context context) {
        return (k) new a(null).c(context);
    }
}
