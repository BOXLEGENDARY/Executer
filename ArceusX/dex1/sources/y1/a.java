package y1;

import android.content.Context;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.interfaces.Database;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.watchdog.BacktraceANRWatchdog;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import java.util.List;
import java.util.Map;

public class a extends BacktraceBase {

    private BacktraceANRWatchdog f24416a;

    public a(Context context, b bVar, List<String> list) {
        this(context, bVar, null, list);
    }

    public void a(int i7, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        b(i7, onApplicationNotRespondingEvent, false);
    }

    public void b(int i7, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, boolean z7) {
        BacktraceANRWatchdog backtraceANRWatchdog = new BacktraceANRWatchdog(this, i7, z7);
        this.f24416a = backtraceANRWatchdog;
        backtraceANRWatchdog.setOnApplicationNotRespondingEvent(onApplicationNotRespondingEvent);
    }

    public void c(Throwable th) {
        d(th, null);
    }

    public void d(Throwable th, OnServerResponseEventListener onServerResponseEventListener) {
        e(th, null, onServerResponseEventListener);
    }

    public void e(Throwable th, Map<String, Object> map, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(new BacktraceReport(th, map), onServerResponseEventListener);
    }

    @Override
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    public a(Context context, b bVar, Database database, List<String> list) {
        this(context, bVar, database, null, list);
    }

    @Override
    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(backtraceReport, onServerResponseEventListener);
    }

    public a(Context context, b bVar, Database database, Map<String, Object> map, List<String> list) {
        super(context, bVar, database, map, list);
    }
}
