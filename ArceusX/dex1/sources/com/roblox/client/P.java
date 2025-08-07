package com.roblox.client;

import android.content.Context;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeReportingInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P {

    private static String f19818a;

    private static List<NameValuePair> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    public static void b(String str) {
        ha.d.p().c(str);
    }

    public static void c(String str, String str2) {
        ha.d.p().d(str, str2);
    }

    public static void d(String str, String str2, String str3) {
        ha.d.p().e(str, str2, str3);
    }

    public static void e(String str, String str2, String str3) {
        ha.d.p().f(str, str2, str3);
    }

    public static void f(String str, String str2, int i7, int i8) {
        ha.d.p().g(str, str2, i7, i8);
    }

    public static void g(String str, String str2) {
        h(str, str2, null);
    }

    public static void h(String str, String str2, List<NameValuePair> list) {
        ha.d.p().h(str, str2, list);
    }

    public static void i(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("type", str2));
        h(str, "logout", arrayList);
    }

    public static void j(String str) {
        ArrayList arrayList = new ArrayList(w());
        if (ha.q.h()) {
            ha.h.f2110a.h("androidNotificationsSettings", str, arrayList, false);
        } else {
            h("androidNotificationsSettings", str, arrayList);
            x();
        }
    }

    public static void k(int i7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("property", String.valueOf(i7)));
        h("nsOpenContent", "touch", arrayList);
    }

    public static void l(String str, boolean z7) {
        ha.d.p().i(str, z7);
    }

    public static void m(String str, String str2, String str3, String str4) {
        List<NameValuePair> listA = a(str, str2, str3);
        listA.add(new NameValuePair("url", str4));
        h("pushNotificationAction", "deepLink", listA);
        x();
    }

    public static void n(String str, String str2, String str3, String str4, String str5, String str6, boolean z7, String str7, String str8) {
        List<NameValuePair> listA = a(str3, str4, str7);
        listA.add(new NameValuePair("actionTaken", str5));
        listA.add(new NameValuePair("clientState", str6));
        listA.add(new NameValuePair("openedClient", z7 ? "true" : "false"));
        listA.add(new NameValuePair("platformType", str2));
        if (ha.q.j()) {
            listA.addAll(w());
        }
        if (!ha.q.h()) {
            NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, listA);
            return;
        }
        ArrayList arrayList = new ArrayList(listA);
        for (Map.Entry entry : NativeReportingInterface.getPushNotificationSessionInfo(str).entrySet()) {
            arrayList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, listA);
        ha.h.f2110a.h("pushNotificationInteractedV2", str, arrayList, false);
    }

    public static void o(String str, String str2, String str3, String str4, String str5, boolean z7, String str6, String str7) {
        n(str, str2, str3, str4, null, str5, z7, str6, str7);
    }

    public static void p(String str, String str2, String str3) {
        q(str, str2, null, null, str3, "0", new ArrayList());
    }

    public static void q(String str, String str2, String str3, String str4, String str5, String str6, List<NameValuePair> list) {
        List<NameValuePair> listA = a(str3, str4, str6);
        listA.add(new NameValuePair("clientState", str5));
        listA.add(new NameValuePair("platformType", str2));
        listA.addAll(list);
        if (ha.q.j()) {
            listA.addAll(w());
        }
        if (j6.d.a().o1() && !ha.q.h()) {
            NativeReportingInterface.pushNotificationReceived("pushNotificationReceivedV2", str, listA);
        }
        if (j6.d.a().J3()) {
            return;
        }
        if (ha.q.h()) {
            ha.h.f2110a.h("pushNotificationReceived", str, listA, false);
        } else {
            h("pushNotificationReceived", str, listA);
            x();
        }
        if (!j6.d.a().G() || str4 == null) {
            return;
        }
        ha.i.a(str4);
    }

    public static void r(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f19818a) == null || !str2.equalsIgnoreCase(str)) {
            h7.l.a("rbx.eventstream", "fireScreenLoaded() " + str);
            f19818a = str;
            ha.d.p().j(str);
        }
    }

    public static void s(String str, String str2) {
        ha.d.p().k(str, str2);
        x();
    }

    public static void t(String str, String str2) {
        ha.d.p().l(str, str2);
        x();
    }

    public static void u(String str) {
        ha.d.p().m(str);
    }

    public static void v() {
        ha.d.p().n();
    }

    private static List<NameValuePair> w() {
        ArrayList arrayList = new ArrayList();
        Context contextA = RobloxApplication.a();
        if (contextA != null) {
            HashMap map = new HashMap(ha.j.a(contextA));
            for (String str : Q6.l.f4879a) {
                map.putAll(ha.j.b(contextA, str));
            }
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    public static void x() {
        ha.d.p().r();
    }
}
