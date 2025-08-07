package v0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import v0.k;

class d {

    private static final g0.j<c, ProviderInfo> f24052a = new g0.j<>(2);

    private static final Comparator<byte[]> f24053b = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        private final ContentProviderClient f24054a;

        b(Context context, Uri uri) {
            this.f24054a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f24054a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e7) {
                Log.w("FontsProvider", "Unable to query the content provider", e7);
                return null;
            }
        }

        @Override
        public void close() {
            ContentProviderClient contentProviderClient = this.f24054a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {

        String f24055a;

        String f24056b;

        List<List<byte[]>> f24057c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.f24055a = str;
            this.f24056b = str2;
            this.f24057c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f24055a, cVar.f24055a) && Objects.equals(this.f24056b, cVar.f24056b) && Objects.equals(this.f24057c, cVar.f24057c);
        }

        public int hashCode() {
            return Objects.hash(this.f24055a, this.f24056b, this.f24057c);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : p0.e.c(resources, eVar.c());
    }

    static k.a e(Context context, List<e> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        h1.a.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                e eVar = list.get(i7);
                ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoF == null) {
                    return k.a.b(1, null);
                }
                arrayList.add(h(context, eVar, providerInfoF.authority, cancellationSignal));
            }
            return k.a.a(0, arrayList);
        } finally {
            h1.a.b();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        h1.a.a("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfoD = f24052a.d(cVar);
            if (providerInfoD != null) {
                return providerInfoD;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f24053b);
            for (int i7 = 0; i7 < listD.size(); i7++) {
                ArrayList arrayList = new ArrayList(listD.get(i7));
                Collections.sort(arrayList, f24053b);
                if (c(listB, arrayList)) {
                    f24052a.f(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            h1.a.b();
            return null;
        } finally {
            h1.a.b();
        }
    }

    public static int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b2 = bArr[i7];
            byte b3 = bArr2[i7];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    static v0.k.b[] h(android.content.Context r16, v0.e r17, java.lang.String r18, android.os.CancellationSignal r19) {
        throw new UnsupportedOperationException("Method not decompiled: v0.d.h(android.content.Context, v0.e, java.lang.String, android.os.CancellationSignal):v0.k$b[]");
    }
}
