package Q6;

import android.content.Context;
import java.util.HashMap;

public class p {

    private HashMap<String, i> f4886a;

    private HashMap<Long, String> f4887b;

    private class a implements i {

        private String f4888a;

        public a(String str) {
            this.f4888a = str;
        }

        @Override
        public void a(Context context, String str) {
            h7.l.d("rbx.push", "PNS expireById() unknown type: " + this.f4888a);
        }

        @Override
        public void b(Context context, S6.m mVar) {
            h7.l.d("rbx.push", "PNS put() unknown type: " + this.f4888a);
        }

        @Override
        public void clear() {
            h7.l.d("rbx.push", "PNS clear() unknown type: " + this.f4888a);
        }

        @Override
        public void d(Context context, long j7) {
            h7.l.d("rbx.push", "PNS expireToDate() unknown type: " + this.f4888a);
        }
    }

    private static class b {

        public static final p f4890a = new p();
    }

    public static p c() {
        return b.f4890a;
    }

    public void a() {
        this.f4887b.clear();
        this.f4886a.clear();
        g();
    }

    public i b(String str) {
        return this.f4886a.get(str);
    }

    public i d(String str) {
        if (!this.f4886a.containsKey(str)) {
            this.f4886a.put(str, new a(str));
        }
        return this.f4886a.get(str);
    }

    public i e(String str, long j7) {
        if (!this.f4886a.containsKey(str)) {
            this.f4886a.put(str, new Q6.b(j7));
        }
        return this.f4886a.get(str);
    }

    public String f(long j7) {
        return this.f4887b.get(Long.valueOf(j7));
    }

    public void g() {
        this.f4886a.put("FriendRequestReceived", new f());
        this.f4886a.put("FriendRequestAccepted", new e());
        this.f4886a.put("PrivateMessageReceived", new k());
    }

    public String h(long j7, String str) {
        return this.f4887b.put(Long.valueOf(j7), str);
    }

    public void i(String str) {
        this.f4886a.remove(str);
    }

    private p() {
        this.f4886a = new HashMap<>();
        this.f4887b = new HashMap<>();
        g();
    }
}
