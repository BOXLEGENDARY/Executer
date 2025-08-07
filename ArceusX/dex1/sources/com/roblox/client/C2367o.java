package com.roblox.client;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import l6.ViewOnClickListenerC2545a;
import org.json.JSONException;
import y6.d;

public class C2367o {

    private Fragment f20146a;

    class a implements d.b {
        a() {
        }

        @Override
        public void a(boolean z7, d.c cVar) throws JSONException, Resources.NotFoundException {
            h7.l.i("rbx.catalog", "onAssetRetrieved() " + z7);
            if (z7) {
                d.c cVarC = C2367o.this.c(cVar);
                C2367o.this.d(cVarC.a(), cVarC.c(), cVarC.b(), cVarC.d());
            }
        }
    }

    public C2367o(Fragment fragment) {
        this.f20146a = fragment;
    }

    public y6.d.c c(y6.d.c r8) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.C2367o.c(y6.d$c):y6.d$c");
    }

    public void b() {
        if (h7.n.i()) {
            return;
        }
        long jI = j6.d.a().i();
        if (a0.o0("PREF_NAME_CATALOG_PROMO_SHOWN", Long.toString(jI), E6.k.e().g()) || jI <= 0) {
            return;
        }
        h7.l.i("rbx.catalog", "getCatalogPromo() " + jI);
        E6.i.b().c(new y6.d(jI, new a()));
    }

    protected void d(long j7, String str, String str2, String str3) throws Resources.NotFoundException {
        String simpleName = ViewOnClickListenerC2545a.class.getSimpleName();
        if (j6.d.a().i() == j7 && this.f20146a.isVisible() && this.f20146a.isResumed() && !this.f20146a.isRemoving() && this.f20146a.getFragmentManager() != null && this.f20146a.getFragmentManager().k0(simpleName) == null) {
            h7.l.i("rbx.catalog", "showPromo() title:" + str + wtzgsqRsIZB.tALKLnk + str2);
            ViewOnClickListenerC2545a viewOnClickListenerC2545a = new ViewOnClickListenerC2545a();
            viewOnClickListenerC2545a.setStyle(2, 0);
            int dimensionPixelSize = this.f20146a.getResources().getDimensionPixelSize(H.f19452b);
            Bundle bundle = new Bundle();
            bundle.putInt("dialogWidth", dimensionPixelSize);
            bundle.putInt("dialogHeight", -2);
            bundle.putLong("assetId", j7);
            bundle.putString("title", str);
            bundle.putString("description", str2);
            bundle.putString("thumbnail", str3);
            viewOnClickListenerC2545a.setArguments(bundle);
            viewOnClickListenerC2545a.show(this.f20146a.getFragmentManager(), simpleName);
            a0.A0("PREF_NAME_CATALOG_PROMO_SHOWN", Long.toString(j7), E6.k.e().g());
        }
    }
}
