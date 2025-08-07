package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p.C2713a;

public final class C2716d {

    public final Intent f22598a;

    public final Bundle f22599b;

    C2716d(Intent intent, Bundle bundle) {
        this.f22598a = intent;
        this.f22599b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f22598a.setData(uri);
        androidx.core.content.a.l(context, this.f22598a, this.f22599b);
    }

    public static final class a {

        private ArrayList<Bundle> f22602c;

        private Bundle f22603d;

        private ArrayList<Bundle> f22604e;

        private SparseArray<Bundle> f22605f;

        private Bundle f22606g;

        private final Intent f22600a = new Intent("android.intent.action.VIEW");

        private final C2713a.C0213a f22601b = new C2713a.C0213a();

        private int f22607h = 0;

        private boolean f22608i = true;

        public a() {
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.f.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f22600a.putExtras(bundle);
        }

        public C2716d a() {
            if (!this.f22600a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f22602c;
            if (arrayList != null) {
                this.f22600a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f22604e;
            if (arrayList2 != null) {
                this.f22600a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f22600a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f22608i);
            this.f22600a.putExtras(this.f22601b.a().a());
            Bundle bundle = this.f22606g;
            if (bundle != null) {
                this.f22600a.putExtras(bundle);
            }
            if (this.f22605f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f22605f);
                this.f22600a.putExtras(bundle2);
            }
            this.f22600a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f22607h);
            return new C2716d(this.f22600a, this.f22603d);
        }

        public a b(f fVar) {
            this.f22600a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }
    }
}
