package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000eR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", BuildConfig.FLAVOR, "d", "I", "c", "()I", "(I)V", "maxClientId", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/a;", "i", "Landroid/os/RemoteCallbackList;", "a", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/b$a;", "v", "Landroidx/room/b$a;", "binder", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    private int maxClientId;

    private final Map<Integer, String> clientNames = new LinkedHashMap();

    private final RemoteCallbackList<androidx.room.a> callbackList = new b();

    private final b.a binder = new a();

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/b$a;", "Landroidx/room/a;", "callback", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "C2", "(Landroidx/room/a;Ljava/lang/String;)I", "clientId", BuildConfig.FLAVOR, "F6", "(Landroidx/room/a;I)V", BuildConfig.FLAVOR, "tables", "n6", "(I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends b.a {
        a() {
        }

        @Override
        public int C2(androidx.room.a callback, String name) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i7 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(maxClientId), name);
                        i7 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i7;
        }

        @Override
        public void F6(androidx.room.a callback, int clientId) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.a().unregister(callback);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(clientId));
            }
        }

        @Override
        public void n6(int clientId, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<androidx.room.a> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(clientId));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i7);
                        Intrinsics.e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.b().get(num);
                        if (clientId != iIntValue && Intrinsics.b(str, str2)) {
                            try {
                                ((androidx.room.a) multiInstanceInvalidationService.a().getBroadcastItem(i7)).P1(tables);
                            } catch (RemoteException e7) {
                                Log.w("ROOM", "Error invoking a remote callback", e7);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                Unit unit = Unit.a;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/a;", "callback", BuildConfig.FLAVOR, "cookie", BuildConfig.FLAVOR, "a", "(Landroidx/room/a;Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends RemoteCallbackList<androidx.room.a> {
        b() {
        }

        @Override
        public void onCallbackDied(androidx.room.a callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    public final RemoteCallbackList<androidx.room.a> a() {
        return this.callbackList;
    }

    public final Map<Integer, String> b() {
        return this.clientNames;
    }

    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void d(int i7) {
        this.maxClientId = i7;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}
