package E4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class C0408n {

    private final C4.f f1151a;

    private final C0403i f1152b;

    private final Context f1153c;

    private final C0407m f1154d;

    private PackageInfo f1155e;

    public C0408n(Context context, C4.f fVar, C0403i c0403i) {
        C0407m c0407m = new C0407m(new C4.b(fVar));
        this.f1151a = fVar;
        this.f1152b = c0403i;
        this.f1153c = context;
        this.f1154d = c0407m;
    }

    private final PackageInfo d() {
        if (this.f1155e == null) {
            try {
                this.f1155e = this.f1153c.getPackageManager().getPackageInfo(this.f1153c.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f1155e;
    }

    private static X509Certificate e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e7) {
            Log.e("SplitCompat", "Cannot decode certificate.", e7);
            return null;
        }
    }

    public final boolean a(File[] fileArr) throws XmlPullParserException, IOException {
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? d().getLongVersionCode() : r0.versionCode;
        AssetManager assetManager = (AssetManager) G.c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f1154d.b(assetManager, fileArr[length]);
        } while (longVersionCode == this.f1154d.a());
        return false;
    }

    public final boolean b(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f1151a.g(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(java.io.File[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: E4.C0408n.c(java.io.File[]):boolean");
    }
}
