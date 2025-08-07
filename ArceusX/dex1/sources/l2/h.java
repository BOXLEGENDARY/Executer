package l2;

import com.birbit.android.jobqueue.IntCallback;

public class h extends k2.b implements IntCallback.MessageWithCallback {

    private IntCallback f21772d;

    private int f21773e;

    private String f21774f;

    public h() {
        super(k2.g.f21288z);
        this.f21773e = -1;
    }

    @Override
    protected void a() {
        this.f21772d = null;
        this.f21773e = -1;
    }

    public IntCallback c() {
        return this.f21772d;
    }

    public String d() {
        return this.f21774f;
    }

    public int e() {
        return this.f21773e;
    }

    @Override
    public void setCallback(IntCallback intCallback) {
        this.f21772d = intCallback;
    }

    public String toString() {
        return "PublicQuery[" + this.f21773e + "]";
    }
}
