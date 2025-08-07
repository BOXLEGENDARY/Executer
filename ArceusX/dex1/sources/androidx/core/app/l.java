package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import o0.C2675b;
import o0.C2676c;
import o0.C2677d;

public class l {

    public static class a {

        final Bundle f10406a;

        private IconCompat f10407b;

        private final u[] f10408c;

        private final u[] f10409d;

        private boolean f10410e;

        boolean f10411f;

        private final int f10412g;

        private final boolean f10413h;

        @Deprecated
        public int f10414i;

        public CharSequence f10415j;

        public PendingIntent f10416k;

        private boolean f10417l;

        public static final class C0083a {

            private final IconCompat f10418a;

            private final CharSequence f10419b;

            private final PendingIntent f10420c;

            private boolean f10421d;

            private final Bundle f10422e;

            private ArrayList<u> f10423f;

            private int f10424g;

            private boolean f10425h;

            private boolean f10426i;

            private boolean f10427j;

            public C0083a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f10426i && this.f10420c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0083a a(u uVar) {
                if (this.f10423f == null) {
                    this.f10423f = new ArrayList<>();
                }
                if (uVar != null) {
                    this.f10423f.add(uVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<u> arrayList3 = this.f10423f;
                if (arrayList3 != null) {
                    Iterator<u> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        u next = it.next();
                        if (next.k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                return new a(this.f10418a, this.f10419b, this.f10420c, this.f10422e, arrayList2.isEmpty() ? null : (u[]) arrayList2.toArray(new u[arrayList2.size()]), arrayList.isEmpty() ? null : (u[]) arrayList.toArray(new u[arrayList.size()]), this.f10421d, this.f10424g, this.f10425h, this.f10426i, this.f10427j);
            }

            public C0083a d(boolean z7) {
                this.f10421d = z7;
                return this;
            }

            public C0083a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i7 != 0 ? IconCompat.d(null, BuildConfig.FLAVOR, i7) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0083a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, boolean z7, int i7, boolean z8, boolean z9, boolean z10) {
                this.f10421d = true;
                this.f10425h = true;
                this.f10418a = iconCompat;
                this.f10419b = e.e(charSequence);
                this.f10420c = pendingIntent;
                this.f10422e = bundle;
                this.f10423f = uVarArr == null ? null : new ArrayList<>(Arrays.asList(uVarArr));
                this.f10421d = z7;
                this.f10424g = i7;
                this.f10425h = z8;
                this.f10426i = z9;
                this.f10427j = z10;
            }
        }

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.d(null, BuildConfig.FLAVOR, i7) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f10416k;
        }

        public boolean b() {
            return this.f10410e;
        }

        public Bundle c() {
            return this.f10406a;
        }

        public IconCompat d() {
            int i7;
            if (this.f10407b == null && (i7 = this.f10414i) != 0) {
                this.f10407b = IconCompat.d(null, KwdswzaUHE.cQjOMrrsU, i7);
            }
            return this.f10407b;
        }

        public u[] e() {
            return this.f10408c;
        }

        public int f() {
            return this.f10412g;
        }

        public boolean g() {
            return this.f10411f;
        }

        public CharSequence h() {
            return this.f10415j;
        }

        public boolean i() {
            return this.f10417l;
        }

        public boolean j() {
            return this.f10413h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, u[] uVarArr2, boolean z7, int i7, boolean z8, boolean z9, boolean z10) {
            this.f10411f = true;
            this.f10407b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f10414i = iconCompat.f();
            }
            this.f10415j = e.e(charSequence);
            this.f10416k = pendingIntent;
            this.f10406a = bundle == null ? new Bundle() : bundle;
            this.f10408c = uVarArr;
            this.f10409d = uVarArr2;
            this.f10410e = z7;
            this.f10412g = i7;
            this.f10411f = z8;
            this.f10413h = z9;
            this.f10417l = z10;
        }
    }

    public static class b extends g {

        private IconCompat f10428e;

        private IconCompat f10429f;

        private boolean f10430g;

        private CharSequence f10431h;

        private boolean f10432i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class C0084b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z7) {
                bigPictureStyle.showBigPictureWhenCollapsed(z7);
            }
        }

        @Override
        public void b(k kVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.f10492b);
            IconCompat iconCompat = this.f10428e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0084b.a(bigContentTitle, this.f10428e.o(kVar instanceof n ? ((n) kVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f10428e.e());
                }
            }
            if (this.f10430g) {
                if (this.f10429f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f10429f.o(kVar instanceof n ? ((n) kVar).f() : null));
                }
            }
            if (this.f10494d) {
                bigContentTitle.setSummaryText(this.f10493c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0084b.c(bigContentTitle, this.f10432i);
                C0084b.b(bigContentTitle, this.f10431h);
            }
        }

        @Override
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f10429f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f10430g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f10428e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends g {

        private CharSequence f10433e;

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override
        public void b(k kVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.f10492b).bigText(this.f10433e);
            if (this.f10494d) {
                bigTextStyleBigText.setSummaryText(this.f10493c);
            }
        }

        @Override
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f10433e = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends g {

        private int f10481e;

        private s f10482f;

        private PendingIntent f10483g;

        private PendingIntent f10484h;

        private PendingIntent f10485i;

        private boolean f10486j;

        private Integer f10487k;

        private Integer f10488l;

        private IconCompat f10489m;

        private CharSequence f10490n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i7) {
                return callStyle.setAnswerButtonColorHint(i7);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i7) {
                return callStyle.setDeclineButtonColorHint(i7);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z7) {
                return callStyle.setIsVideo(z7);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public f() {
        }

        public static f h(s sVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new f(1, sVar, null, pendingIntent, pendingIntent2);
        }

        public static f i(s sVar, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new f(2, sVar, pendingIntent, null, null);
        }

        private String k() {
            int i7 = this.f10481e;
            if (i7 == 1) {
                return this.f10491a.f10455a.getResources().getString(o0.f.f22374e);
            }
            if (i7 == 2) {
                return this.f10491a.f10455a.getResources().getString(o0.f.f22375f);
            }
            if (i7 != 3) {
                return null;
            }
            return this.f10491a.f10455a.getResources().getString(o0.f.f22376g);
        }

        private boolean l(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a m(int i7, int i8, Integer num, int i9, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.c(this.f10491a.f10455a, i9));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f10491a.f10455a.getResources().getString(i8));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarB = new a.C0083a(IconCompat.c(this.f10491a.f10455a, i7), spannableStringBuilder, pendingIntent).b();
            aVarB.c().putBoolean("key_action_priority", true);
            return aVarB;
        }

        private a n() {
            int i7 = C2677d.f22323b;
            int i8 = C2677d.f22322a;
            PendingIntent pendingIntent = this.f10483g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z7 = this.f10486j;
            return m(z7 ? i7 : i8, z7 ? o0.f.f22371b : o0.f.f22370a, this.f10487k, C2675b.f22318a, pendingIntent);
        }

        private a o() {
            int i7 = C2677d.f22324c;
            PendingIntent pendingIntent = this.f10484h;
            return pendingIntent == null ? m(i7, o0.f.f22373d, this.f10488l, C2675b.f22319b, this.f10485i) : m(i7, o0.f.f22372c, this.f10488l, C2675b.f22319b, pendingIntent);
        }

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f10481e);
            bundle.putBoolean("android.callIsVideo", this.f10486j);
            s sVar = this.f10482f;
            if (sVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(sVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", sVar.i());
                }
            }
            IconCompat iconCompat = this.f10489m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.o(this.f10491a.f10455a)));
            }
            bundle.putCharSequence("android.verificationText", this.f10490n);
            bundle.putParcelable("android.answerIntent", this.f10483g);
            bundle.putParcelable("android.declineIntent", this.f10484h);
            bundle.putParcelable("android.hangUpIntent", this.f10485i);
            Integer num = this.f10487k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f10488l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override
        public void b(k kVar) {
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequenceK = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceK = null;
            if (i7 < 31) {
                Notification.Builder builderA = kVar.a();
                s sVar = this.f10482f;
                builderA.setContentTitle(sVar != null ? sVar.c() : null);
                Bundle bundle = this.f10491a.f10437D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceK = this.f10491a.f10437D.getCharSequence("android.text");
                }
                if (charSequenceK == null) {
                    charSequenceK = k();
                }
                builderA.setContentText(charSequenceK);
                s sVar2 = this.f10482f;
                if (sVar2 != null) {
                    if (sVar2.a() != null) {
                        b.b(builderA, this.f10482f.a().o(this.f10491a.f10455a));
                    }
                    if (i7 >= 28) {
                        c.a(builderA, this.f10482f.h());
                    } else {
                        a.a(builderA, this.f10482f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i8 = this.f10481e;
            if (i8 == 1) {
                callStyleA = d.a(this.f10482f.h(), this.f10484h, this.f10483g);
            } else if (i8 == 2) {
                callStyleA = d.b(this.f10482f.h(), this.f10485i);
            } else if (i8 == 3) {
                callStyleA = d.c(this.f10482f.h(), this.f10485i, this.f10483g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f10481e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(kVar.a());
                Integer num = this.f10487k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f10488l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f10490n);
                IconCompat iconCompat = this.f10489m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.o(this.f10491a.f10455a));
                }
                d.f(callStyleA, this.f10486j);
            }
        }

        @Override
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> j() {
            a aVarO = o();
            a aVarN = n();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarO);
            ArrayList<a> arrayList2 = this.f10491a.f10456b;
            int i7 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!l(aVar) && i7 > 1) {
                        arrayList.add(aVar);
                        i7--;
                    }
                    if (aVarN != null && i7 == 1) {
                        arrayList.add(aVarN);
                        i7--;
                    }
                }
            }
            if (aVarN != null && i7 >= 1) {
                arrayList.add(aVarN);
            }
            return arrayList;
        }

        public f p(int i7) {
            this.f10487k = Integer.valueOf(i7);
            return this;
        }

        public f q(int i7) {
            this.f10488l = Integer.valueOf(i7);
            return this;
        }

        private f(int i7, s sVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (sVar == null || TextUtils.isEmpty(sVar.c())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f10481e = i7;
            this.f10482f = sVar;
            this.f10483g = pendingIntent3;
            this.f10484h = pendingIntent2;
            this.f10485i = pendingIntent;
        }
    }

    public static abstract class g {

        protected e f10491a;

        CharSequence f10492b;

        CharSequence f10493c;

        boolean f10494d = false;

        public void a(Bundle bundle) {
            if (this.f10494d) {
                bundle.putCharSequence("android.summaryText", this.f10493c);
            }
            CharSequence charSequence = this.f10492b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f10491a != eVar) {
                this.f10491a = eVar;
                if (eVar != null) {
                    eVar.z(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C2676c.f22321b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C2676c.f22320a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    public static class e {

        boolean f10434A;

        boolean f10435B;

        String f10436C;

        Bundle f10437D;

        int f10438E;

        int f10439F;

        Notification f10440G;

        RemoteViews f10441H;

        RemoteViews f10442I;

        RemoteViews f10443J;

        String f10444K;

        int f10445L;

        String f10446M;

        long f10447N;

        int f10448O;

        int f10449P;

        boolean f10450Q;

        Notification f10451R;

        boolean f10452S;

        Object f10453T;

        @Deprecated
        public ArrayList<String> f10454U;

        public Context f10455a;

        public ArrayList<a> f10456b;

        public ArrayList<s> f10457c;

        ArrayList<a> f10458d;

        CharSequence f10459e;

        CharSequence f10460f;

        PendingIntent f10461g;

        PendingIntent f10462h;

        RemoteViews f10463i;

        IconCompat f10464j;

        CharSequence f10465k;

        int f10466l;

        int f10467m;

        boolean f10468n;

        boolean f10469o;

        g f10470p;

        CharSequence f10471q;

        CharSequence f10472r;

        CharSequence[] f10473s;

        int f10474t;

        int f10475u;

        boolean f10476v;

        String f10477w;

        boolean f10478x;

        String f10479y;

        boolean f10480z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i7) {
                return builder.setContentType(i7);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i7) {
                return builder.setUsage(i7);
            }
        }

        public e(Context context, String str) {
            this.f10456b = new ArrayList<>();
            this.f10457c = new ArrayList<>();
            this.f10458d = new ArrayList<>();
            this.f10468n = true;
            this.f10480z = false;
            this.f10438E = 0;
            this.f10439F = 0;
            this.f10445L = 0;
            this.f10448O = 0;
            this.f10449P = 0;
            Notification notification = new Notification();
            this.f10451R = notification;
            this.f10455a = context;
            this.f10444K = str;
            notification.when = System.currentTimeMillis();
            this.f10451R.audioStreamType = -1;
            this.f10467m = 0;
            this.f10454U = new ArrayList<>();
            this.f10450Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void p(int i7, boolean z7) {
            if (z7) {
                Notification notification = this.f10451R;
                notification.flags = i7 | notification.flags;
            } else {
                Notification notification2 = this.f10451R;
                notification2.flags = (~i7) & notification2.flags;
            }
        }

        public e A(CharSequence charSequence) {
            this.f10451R.tickerText = e(charSequence);
            return this;
        }

        public e B(long[] jArr) {
            this.f10451R.vibrate = jArr;
            return this;
        }

        public e C(int i7) {
            this.f10439F = i7;
            return this;
        }

        public e D(long j7) {
            this.f10451R.when = j7;
            return this;
        }

        public e a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f10456b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f10456b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new n(this).c();
        }

        public Bundle d() {
            if (this.f10437D == null) {
                this.f10437D = new Bundle();
            }
            return this.f10437D;
        }

        public e f(boolean z7) {
            p(16, z7);
            return this;
        }

        public e g(String str) {
            this.f10436C = str;
            return this;
        }

        public e h(String str) {
            this.f10444K = str;
            return this;
        }

        public e i(int i7) {
            this.f10438E = i7;
            return this;
        }

        public e j(RemoteViews remoteViews) {
            this.f10451R.contentView = remoteViews;
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.f10461g = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f10460f = e(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f10459e = e(charSequence);
            return this;
        }

        public e n(int i7) {
            Notification notification = this.f10451R;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.f10451R.deleteIntent = pendingIntent;
            return this;
        }

        public e q(PendingIntent pendingIntent, boolean z7) {
            this.f10462h = pendingIntent;
            p(128, z7);
            return this;
        }

        public e r(Bitmap bitmap) {
            this.f10464j = bitmap == null ? null : IconCompat.b(l.b(this.f10455a, bitmap));
            return this;
        }

        public e s(int i7, int i8, int i9) {
            Notification notification = this.f10451R;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e t(boolean z7) {
            this.f10480z = z7;
            return this;
        }

        public e u(int i7) {
            this.f10466l = i7;
            return this;
        }

        public e v(boolean z7) {
            p(2, z7);
            return this;
        }

        public e w(int i7) {
            this.f10467m = i7;
            return this;
        }

        public e x(int i7) {
            this.f10451R.icon = i7;
            return this;
        }

        public e y(Uri uri) {
            Notification notification = this.f10451R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f10451R.audioAttributes = a.a(builderD);
            return this;
        }

        public e z(g gVar) {
            if (this.f10470p != gVar) {
                this.f10470p = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
