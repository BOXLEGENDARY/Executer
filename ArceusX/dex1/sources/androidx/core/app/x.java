package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class x implements Iterable<Intent> {

    private final ArrayList<Intent> f10557d = new ArrayList<>();

    private final Context f10558e;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private x(Context context) {
        this.f10558e = context;
    }

    public static x j(Context context) {
        return new x(context);
    }

    public x d(Intent intent) {
        this.f10557d.add(intent);
        return this;
    }

    public x e(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f10558e.getPackageManager());
            }
            g(component);
            d(supportParentActivityIntent);
        }
        return this;
    }

    public x g(ComponentName componentName) {
        int size = this.f10557d.size();
        try {
            Intent intentB = j.b(this.f10558e, componentName);
            while (intentB != null) {
                this.f10557d.add(size, intentB);
                intentB = j.b(this.f10558e, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    @Override
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f10557d.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f10557d.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f10557d.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.k(this.f10558e, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f10558e.startActivity(intent);
    }
}
