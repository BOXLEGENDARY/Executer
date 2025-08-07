package com.google.android.gms.measurement;

import W3.m;
import W3.t;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.N1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.C2651i;

@Deprecated
public class AppMeasurement {

    private static volatile AppMeasurement f16235b;

    private final d f16236a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            C2651i.l(bundle);
            this.mAppId = (String) m.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) m.a(bundle, "origin", String.class, null);
            this.mName = (String) m.a(bundle, "name", String.class, null);
            this.mValue = m.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) m.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) m.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) m.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) m.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) m.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) m.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) m.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) m.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) m.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) m.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) m.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) m.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(N1 n1) {
        this.f16236a = new a(n1);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f16235b == null) {
            synchronized (AppMeasurement.class) {
                if (f16235b == null) {
                    t tVar = (t) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (tVar != null) {
                        f16235b = new AppMeasurement(tVar);
                    } else {
                        f16235b = new AppMeasurement(N1.H(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f16235b;
    }

    public void beginAdUnitExposure(String str) {
        this.f16236a.g0(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f16236a.l0(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f16236a.L0(str);
    }

    public long generateEventId() {
        return this.f16236a.zzb();
    }

    public String getAppInstanceId() {
        return this.f16236a.f();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listH0 = this.f16236a.h0(str, str2);
        ArrayList arrayList = new ArrayList(listH0 == null ? 0 : listH0.size());
        Iterator<Bundle> it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f16236a.e();
    }

    public String getCurrentScreenName() {
        return this.f16236a.i();
    }

    public String getGmpAppId() {
        return this.f16236a.h();
    }

    public int getMaxUserProperties(String str) {
        return this.f16236a.n(str);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f16236a.i0(str, str2, z7);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f16236a.k0(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C2651i.l(conditionalUserProperty);
        d dVar = this.f16236a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            m.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.j0(bundle);
    }

    public AppMeasurement(t tVar) {
        this.f16236a = new b(tVar);
    }
}
