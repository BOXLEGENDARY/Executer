package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f10355a = (IconCompat) aVar.v(remoteActionCompat.f10355a, 1);
        remoteActionCompat.f10356b = aVar.l(remoteActionCompat.f10356b, 2);
        remoteActionCompat.f10357c = aVar.l(remoteActionCompat.f10357c, 3);
        remoteActionCompat.f10358d = (PendingIntent) aVar.r(remoteActionCompat.f10358d, 4);
        remoteActionCompat.f10359e = aVar.h(remoteActionCompat.f10359e, 5);
        remoteActionCompat.f10360f = aVar.h(remoteActionCompat.f10360f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f10355a, 1);
        aVar.D(remoteActionCompat.f10356b, 2);
        aVar.D(remoteActionCompat.f10357c, 3);
        aVar.H(remoteActionCompat.f10358d, 4);
        aVar.z(remoteActionCompat.f10359e, 5);
        aVar.z(remoteActionCompat.f10360f, 6);
    }
}
