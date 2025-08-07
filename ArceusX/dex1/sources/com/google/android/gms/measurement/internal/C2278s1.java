package com.google.android.gms.measurement.internal;

import K0.wJ.BtcVLuo;
import android.content.SharedPreferences;
import android.os.Bundle;
import n3.C2651i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C2278s1 {

    private final String f17003a;

    private final Bundle f17004b;

    private Bundle f17005c;

    final C2303x1 f17006d;

    public C2278s1(C2303x1 c2303x1, String str, Bundle bundle) {
        this.f17006d = c2303x1;
        String str2 = BtcVLuo.yhmCLeIlV;
        C2651i.f(str2);
        this.f17003a = str2;
        this.f17004b = new Bundle();
    }

    public final android.os.Bundle a() {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2278s1.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.f17006d.o().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f17003a);
        } else {
            String str = this.f17003a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f17006d.f16818a.b().r().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e7) {
                        this.f17006d.f16818a.b().r().b("Cannot serialize bundle value to SharedPreferences", e7);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f17005c = bundle;
    }
}
