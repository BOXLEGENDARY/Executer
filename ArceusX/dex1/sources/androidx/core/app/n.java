package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import g0.C2458b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class n implements k {

    private final Context f10495a;

    private final Notification.Builder f10496b;

    private final l.e f10497c;

    private RemoteViews f10498d;

    private RemoteViews f10499e;

    private final List<Bundle> f10500f = new ArrayList();

    private final Bundle f10501g = new Bundle();

    private int f10502h;

    private RemoteViews f10503i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        static Notification.Builder d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i7) {
            return builder.setSemanticAction(i7);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setForegroundServiceBehavior(i7);
        }
    }

    n(l.e eVar) {
        int i7;
        this.f10497c = eVar;
        Context context = eVar.f10455a;
        this.f10495a = context;
        Notification.Builder builderA = e.a(context, eVar.f10444K);
        this.f10496b = builderA;
        Notification notification = eVar.f10451R;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f10463i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f10459e).setContentText(eVar.f10460f).setContentInfo(eVar.f10465k).setContentIntent(eVar.f10461g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f10462h, (notification.flags & 128) != 0).setNumber(eVar.f10466l).setProgress(eVar.f10474t, eVar.f10475u, eVar.f10476v);
        IconCompat iconCompat = eVar.f10464j;
        c.b(builderA, iconCompat == null ? null : iconCompat.o(context));
        builderA.setSubText(eVar.f10471q).setUsesChronometer(eVar.f10469o).setPriority(eVar.f10467m);
        l.g gVar = eVar.f10470p;
        if (gVar instanceof l.f) {
            Iterator<l.a> it = ((l.f) gVar).j().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<l.a> it2 = eVar.f10456b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.f10437D;
        if (bundle != null) {
            this.f10501g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f10498d = eVar.f10441H;
        this.f10499e = eVar.f10442I;
        this.f10496b.setShowWhen(eVar.f10468n);
        a.g(this.f10496b, eVar.f10480z);
        a.e(this.f10496b, eVar.f10477w);
        a.h(this.f10496b, eVar.f10479y);
        a.f(this.f10496b, eVar.f10478x);
        this.f10502h = eVar.f10448O;
        b.b(this.f10496b, eVar.f10436C);
        b.c(this.f10496b, eVar.f10438E);
        b.f(this.f10496b, eVar.f10439F);
        b.d(this.f10496b, eVar.f10440G);
        b.e(this.f10496b, notification.sound, notification.audioAttributes);
        List listE = i8 < 28 ? e(g(eVar.f10457c), eVar.f10454U) : eVar.f10454U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f10496b, (String) it3.next());
            }
        }
        this.f10503i = eVar.f10443J;
        if (eVar.f10458d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < eVar.f10458d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), o.a(eVar.f10458d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f10501g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = eVar.f10453T;
        if (obj != null) {
            c.c(this.f10496b, obj);
        }
        this.f10496b.setExtras(eVar.f10437D);
        d.e(this.f10496b, eVar.f10473s);
        RemoteViews remoteViews = eVar.f10441H;
        if (remoteViews != null) {
            d.c(this.f10496b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f10442I;
        if (remoteViews2 != null) {
            d.b(this.f10496b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f10443J;
        if (remoteViews3 != null) {
            d.d(this.f10496b, remoteViews3);
        }
        e.b(this.f10496b, eVar.f10445L);
        e.e(this.f10496b, eVar.f10472r);
        e.f(this.f10496b, eVar.f10446M);
        e.g(this.f10496b, eVar.f10447N);
        e.d(this.f10496b, eVar.f10448O);
        if (eVar.f10435B) {
            e.c(this.f10496b, eVar.f10434A);
        }
        if (!TextUtils.isEmpty(eVar.f10444K)) {
            this.f10496b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i10 >= 28) {
            Iterator<s> it4 = eVar.f10457c.iterator();
            while (it4.hasNext()) {
                f.a(this.f10496b, it4.next().h());
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            g.a(this.f10496b, eVar.f10450Q);
            g.b(this.f10496b, l.d.a(null));
        }
        if (i11 >= 31 && (i7 = eVar.f10449P) != 0) {
            h.b(this.f10496b, i7);
        }
        if (eVar.f10452S) {
            if (this.f10497c.f10478x) {
                this.f10502h = 2;
            } else {
                this.f10502h = 1;
            }
            this.f10496b.setVibrate(null);
            this.f10496b.setSound(null);
            int i12 = notification.defaults & (-4);
            notification.defaults = i12;
            this.f10496b.setDefaults(i12);
            if (TextUtils.isEmpty(this.f10497c.f10477w)) {
                a.e(this.f10496b, "silent");
            }
            e.d(this.f10496b, this.f10502h);
        }
    }

    private void b(l.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : u.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i7 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i7 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i7 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i7 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f10496b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C2458b c2458b = new C2458b(list.size() + list2.size());
        c2458b.addAll(list);
        c2458b.addAll(list2);
        return new ArrayList(c2458b);
    }

    private static List<String> g(List<s> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override
    public Notification.Builder a() {
        return this.f10496b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        l.g gVar = this.f10497c.f10470p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews remoteViewsE = gVar != null ? gVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f10497c.f10441H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (gVar != null && (remoteViewsD = gVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (gVar != null && (remoteViewsF = this.f10497c.f10470p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (gVar != null && (bundleA = l.a(notificationD)) != null) {
            gVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f10496b.build();
    }

    Context f() {
        return this.f10495a;
    }
}
