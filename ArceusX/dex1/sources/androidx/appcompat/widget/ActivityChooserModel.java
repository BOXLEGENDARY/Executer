package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable {

    static final String f9112n = "ActivityChooserModel";

    private static final Object f9113o = new Object();

    private static final Map<String, ActivityChooserModel> f9114p = new HashMap();

    final Context f9118d;

    final String f9119e;

    private Intent f9120f;

    private OnChooseActivityListener f9127m;

    private final Object f9115a = new Object();

    private final List<ActivityResolveInfo> f9116b = new ArrayList();

    private final List<HistoricalRecord> f9117c = new ArrayList();

    private ActivitySorter f9121g = new a();

    private int f9122h = 50;

    boolean f9123i = true;

    private boolean f9124j = false;

    private boolean f9125k = true;

    private boolean f9126l = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        @Override
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j7, float f7) {
            this(ComponentName.unflattenFromString(str), j7, f7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public int hashCode() {
            ComponentName componentName = this.activity;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j7 = this.time;
            return ((((iHashCode + 31) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public String toString() {
            return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        public HistoricalRecord(ComponentName componentName, long j7, float f7) {
            this.activity = componentName;
            this.time = j7;
            this.weight = f7;
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    private static final class a implements ActivitySorter {

        private final Map<ComponentName, ActivityResolveInfo> f9128a = new HashMap();

        a() {
        }

        @Override
        public void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            Map<ComponentName, ActivityResolveInfo> map = this.f9128a;
            map.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ActivityResolveInfo activityResolveInfo = list.get(i7);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f7 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f7;
                    f7 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    private final class b extends AsyncTask<Object, Void, Void> {
        b() {
        }

        @Override
        public Void doInBackground(Object... objArr) throws IOException {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = ActivityChooserModel.this.f9118d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            try {
                                xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                                xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                                xmlSerializerNewSerializer.startTag(null, "historical-records");
                                int size = list.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    HistoricalRecord historicalRecord = (HistoricalRecord) list.remove(0);
                                    xmlSerializerNewSerializer.startTag(null, "historical-record");
                                    xmlSerializerNewSerializer.attribute(null, "activity", historicalRecord.activity.flattenToString());
                                    xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(historicalRecord.time));
                                    xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(historicalRecord.weight));
                                    xmlSerializerNewSerializer.endTag(null, "historical-record");
                                }
                                xmlSerializerNewSerializer.endTag(null, "historical-records");
                                xmlSerializerNewSerializer.endDocument();
                                ActivityChooserModel.this.f9123i = true;
                            } catch (Throwable th) {
                                ActivityChooserModel.this.f9123i = true;
                                if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e7) {
                            Log.e(ActivityChooserModel.f9112n, "Error writing historical record file: " + ActivityChooserModel.this.f9119e, e7);
                            ActivityChooserModel.this.f9123i = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                            }
                        }
                    } catch (IllegalStateException e8) {
                        Log.e(ActivityChooserModel.f9112n, "Error writing historical record file: " + ActivityChooserModel.this.f9119e, e8);
                        ActivityChooserModel.this.f9123i = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                } catch (IllegalArgumentException e9) {
                    Log.e(ActivityChooserModel.f9112n, "Error writing historical record file: " + ActivityChooserModel.this.f9119e, e9);
                    ActivityChooserModel.this.f9123i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (FileNotFoundException e10) {
                Log.e(ActivityChooserModel.f9112n, "Error writing historical record file: " + str, e10);
                return null;
            }
        }
    }

    private ActivityChooserModel(Context context, String str) {
        this.f9118d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f9119e = str;
            return;
        }
        this.f9119e = str + ".xml";
    }

    private boolean a(HistoricalRecord historicalRecord) {
        boolean zAdd = this.f9117c.add(historicalRecord);
        if (zAdd) {
            this.f9125k = true;
            l();
            k();
            r();
            notifyChanged();
        }
        return zAdd;
    }

    private void c() {
        boolean zJ = j() | m();
        l();
        if (zJ) {
            r();
            notifyChanged();
        }
    }

    public static ActivityChooserModel d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f9113o) {
            try {
                Map<String, ActivityChooserModel> map = f9114p;
                activityChooserModel = map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    private boolean j() {
        if (!this.f9126l || this.f9120f == null) {
            return false;
        }
        this.f9126l = false;
        this.f9116b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f9118d.getPackageManager().queryIntentActivities(this.f9120f, 0);
        int size = listQueryIntentActivities.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f9116b.add(new ActivityResolveInfo(listQueryIntentActivities.get(i7)));
        }
        return true;
    }

    private void k() {
        if (!this.f9124j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f9125k) {
            this.f9125k = false;
            if (TextUtils.isEmpty(this.f9119e)) {
                return;
            }
            new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f9117c), this.f9119e);
        }
    }

    private void l() {
        int size = this.f9117c.size() - this.f9122h;
        if (size <= 0) {
            return;
        }
        this.f9125k = true;
        for (int i7 = 0; i7 < size; i7++) {
            this.f9117c.remove(0);
        }
    }

    private boolean m() throws IOException {
        if (!this.f9123i || !this.f9125k || TextUtils.isEmpty(this.f9119e)) {
            return false;
        }
        this.f9123i = false;
        this.f9124j = true;
        n();
        return true;
    }

    private void n() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.n():void");
    }

    private boolean r() {
        if (this.f9121g == null || this.f9120f == null || this.f9116b.isEmpty() || this.f9117c.isEmpty()) {
            return false;
        }
        this.f9121g.sort(this.f9120f, this.f9116b, Collections.unmodifiableList(this.f9117c));
        return true;
    }

    public Intent b(int i7) {
        synchronized (this.f9115a) {
            try {
                if (this.f9120f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f9116b.get(i7).resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f9120f);
                intent.setComponent(componentName);
                if (this.f9127m != null) {
                    if (this.f9127m.onChooseActivity(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo e(int i7) {
        ResolveInfo resolveInfo;
        synchronized (this.f9115a) {
            c();
            resolveInfo = this.f9116b.get(i7).resolveInfo;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f9115a) {
            c();
            size = this.f9116b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f9115a) {
            try {
                c();
                List<ActivityResolveInfo> list = this.f9116b;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (list.get(i7).resolveInfo == resolveInfo) {
                        return i7;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f9115a) {
            try {
                c();
                if (this.f9116b.isEmpty()) {
                    return null;
                }
                return this.f9116b.get(0).resolveInfo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int size;
        synchronized (this.f9115a) {
            c();
            size = this.f9117c.size();
        }
        return size;
    }

    public void o(int i7) {
        synchronized (this.f9115a) {
            try {
                c();
                ActivityResolveInfo activityResolveInfo = this.f9116b.get(i7);
                ActivityResolveInfo activityResolveInfo2 = this.f9116b.get(0);
                float f7 = activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                a(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f7));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(Intent intent) {
        synchronized (this.f9115a) {
            try {
                if (this.f9120f == intent) {
                    return;
                }
                this.f9120f = intent;
                this.f9126l = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.f9115a) {
            this.f9127m = onChooseActivityListener;
        }
    }
}
