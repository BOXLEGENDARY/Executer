package o5;

import N3.AbstractC0535f;
import N3.AbstractC0538i;
import N3.C0537h;
import U.Gw.oeVkjmfPcLbWm;
import Z.tNT.PexNRiLSd;
import a4.C1576m;
import a4.InterfaceC1569f;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import l3.InterfaceC2534i;
import n3.C2651i;
import r3.C2744b;
import r3.C2746d;

public class m {

    private static final AbstractC0538i f22459A;

    private static final AbstractC0538i f22460B;

    public static final Feature[] f22461a = new Feature[0];

    public static final Feature f22462b;

    public static final Feature f22463c;

    public static final Feature f22464d;

    public static final Feature f22465e;

    public static final Feature f22466f;

    public static final Feature f22467g;

    public static final Feature f22468h;

    public static final Feature f22469i;

    public static final Feature f22470j;

    public static final Feature f22471k;

    public static final Feature f22472l;

    public static final Feature f22473m;

    public static final Feature f22474n;

    public static final Feature f22475o;

    public static final Feature f22476p;

    public static final Feature f22477q;

    public static final Feature f22478r;

    public static final Feature f22479s;

    public static final Feature f22480t;

    public static final Feature f22481u;

    public static final Feature f22482v;

    public static final Feature f22483w;

    public static final Feature f22484x;

    public static final Feature f22485y;

    public static final Feature f22486z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f22462b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f22463c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f22464d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f22465e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f22466f = feature5;
        f22467g = new Feature("mlkit.ocr.chinese", 1L);
        f22468h = new Feature("mlkit.ocr.common", 1L);
        f22469i = new Feature("mlkit.ocr.devanagari", 1L);
        f22470j = new Feature("mlkit.ocr.japanese", 1L);
        f22471k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f22472l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f22473m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f22474n = feature8;
        Feature feature9 = new Feature(PexNRiLSd.RmYalYQytaNoZ, 1L);
        f22475o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f22476p = feature10;
        f22477q = new Feature("mlkit.image.caption", 1L);
        f22478r = new Feature("mlkit.docscan.detect", 1L);
        f22479s = new Feature("mlkit.docscan.crop", 1L);
        f22480t = new Feature("mlkit.docscan.enhance", 1L);
        f22481u = new Feature(JmBUOGMwkkxg.TlkybRWuYLOkb, 1L);
        f22482v = new Feature("mlkit.docscan.stain", 1L);
        f22483w = new Feature("mlkit.docscan.shadow", 1L);
        f22484x = new Feature("mlkit.quality.aesthetic", 1L);
        f22485y = new Feature("mlkit.quality.technical", 1L);
        f22486z = new Feature("mlkit.segmentation.subject", 1L);
        C0537h c0537h = new C0537h();
        c0537h.a("barcode", feature);
        c0537h.a("custom_ica", feature2);
        c0537h.a("face", feature3);
        c0537h.a("ica", feature4);
        c0537h.a(sMlEMqrxoGI.tZi, feature5);
        c0537h.a("langid", feature6);
        c0537h.a("nlclassifier", feature7);
        c0537h.a("tflite_dynamite", feature8);
        c0537h.a("barcode_ui", feature9);
        c0537h.a("smart_reply", feature10);
        f22459A = c0537h.b();
        C0537h c0537h2 = new C0537h();
        c0537h2.a("com.google.android.gms.vision.barcode", feature);
        c0537h2.a("com.google.android.gms.vision.custom.ica", feature2);
        c0537h2.a("com.google.android.gms.vision.face", feature3);
        c0537h2.a("com.google.android.gms.vision.ica", feature4);
        c0537h2.a("com.google.android.gms.vision.ocr", feature5);
        c0537h2.a("com.google.android.gms.mlkit.langid", feature6);
        c0537h2.a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c0537h2.a("com.google.android.gms.tflite_dynamite", feature8);
        c0537h2.a("com.google.android.gms.mlkit_smartreply", feature10);
        f22460B = c0537h2.b();
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) throws Throwable {
        if (C1819d.f().a(context) >= 221500000) {
            return b(context, f(f22460B, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f14419b, it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) C1576m.a(C2744b.a(context).d(new InterfaceC2534i() {
                @Override
                public final Feature[] b() {
                    Feature[] featureArr2 = m.f22461a;
                    return featureArr;
                }
            }).c(new InterfaceC1569f() {
                @Override
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).l();
        } catch (InterruptedException | ExecutionException e7) {
            Log.e(oeVkjmfPcLbWm.BELrBFqIVvQoE, "Failed to complete the task of features availability check", e7);
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, AbstractC0535f.m(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (C1819d.f().a(context) >= 221500000) {
            e(context, f(f22459A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final Feature[] featureArr) {
        C2744b.a(context).h(C2746d.d().a(new InterfaceC2534i() {
            @Override
            public final Feature[] b() {
                Feature[] featureArr2 = m.f22461a;
                return featureArr;
            }
        }).b()).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static Feature[] f(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            featureArr[i7] = (Feature) C2651i.l((Feature) map.get(list.get(i7)));
        }
        return featureArr;
    }
}
