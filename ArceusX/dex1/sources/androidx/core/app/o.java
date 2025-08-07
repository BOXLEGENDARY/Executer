package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

class o {

    private static final Object f10504a = new Object();

    private static final Object f10505b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt(KwdswzaUHE.ENNIjMAq, aVar.f());
        return bundle;
    }

    private static Bundle b(u uVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", uVar.i());
        bundle.putCharSequence("label", uVar.h());
        bundle.putCharSequenceArray("choices", uVar.e());
        bundle.putBoolean("allowFreeFormInput", uVar.c());
        bundle.putBundle("extras", uVar.g());
        Set<String> setD = uVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[uVarArr.length];
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            bundleArr[i7] = b(uVarArr[i7]);
        }
        return bundleArr;
    }
}
