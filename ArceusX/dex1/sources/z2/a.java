package z2;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

public final class a implements Runnable {
    @Override
    public final void run() {
        AlarmManagerSchedulerBroadcastReceiver.b();
    }
}
