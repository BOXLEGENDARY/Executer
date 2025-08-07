package backtraceio.library.watchdog;

public class BacktraceThreadWatcher {
    private boolean active;
    private int counter;
    private final int delay;
    private long lastTimestamp;
    private int privateCounter;
    private final int timeout;

    BacktraceThreadWatcher(int i7, int i8) {
        this.timeout = i7;
        this.delay = i8;
        setActive(true);
    }

    synchronized int getCounter() {
        return this.counter;
    }

    int getDelay() {
        return this.delay;
    }

    long getLastTimestamp() {
        return this.lastTimestamp;
    }

    int getPrivateCounter() {
        return this.privateCounter;
    }

    int getTimeout() {
        return this.timeout;
    }

    synchronized boolean isActive() {
        return this.active;
    }

    synchronized void setActive(boolean z7) {
        this.active = z7;
    }

    void setLastTimestamp(long j7) {
        this.lastTimestamp = j7;
    }

    void setPrivateCounter(int i7) {
        this.privateCounter = i7;
    }

    public synchronized void tickCounter() {
        this.counter++;
    }

    void tickPrivateCounter() {
        this.privateCounter++;
    }
}
