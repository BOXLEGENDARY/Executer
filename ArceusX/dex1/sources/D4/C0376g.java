package D4;

import android.app.PendingIntent;
import java.util.List;

final class C0376g extends AbstractC0374e {

    private final int f949a;

    private final int f950b;

    private final int f951c;

    private final long f952d;

    private final long f953e;

    private final List f954f;

    private final List f955g;

    private final PendingIntent f956h;

    private final List f957i;

    C0376g(int i7, int i8, int i9, long j7, long j8, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f949a = i7;
        this.f950b = i8;
        this.f951c = i9;
        this.f952d = j7;
        this.f953e = j8;
        this.f954f = list;
        this.f955g = list2;
        this.f956h = pendingIntent;
        this.f957i = list3;
    }

    @Override
    public final long a() {
        return this.f952d;
    }

    @Override
    public final int c() {
        return this.f951c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0374e) {
            AbstractC0374e abstractC0374e = (AbstractC0374e) obj;
            if (this.f949a == abstractC0374e.h() && this.f950b == abstractC0374e.i() && this.f951c == abstractC0374e.c() && this.f952d == abstractC0374e.a() && this.f953e == abstractC0374e.j() && ((list = this.f954f) != null ? list.equals(abstractC0374e.l()) : abstractC0374e.l() == null) && ((list2 = this.f955g) != null ? list2.equals(abstractC0374e.k()) : abstractC0374e.k() == null) && ((pendingIntent = this.f956h) != null ? pendingIntent.equals(abstractC0374e.g()) : abstractC0374e.g() == null) && ((list3 = this.f957i) != null ? list3.equals(abstractC0374e.m()) : abstractC0374e.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Deprecated
    public final PendingIntent g() {
        return this.f956h;
    }

    @Override
    public final int h() {
        return this.f949a;
    }

    public final int hashCode() {
        int i7 = ((((this.f949a ^ 1000003) * 1000003) ^ this.f950b) * 1000003) ^ this.f951c;
        long j7 = this.f952d;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.f953e;
        long j10 = (j9 >>> 32) ^ j9;
        List list = this.f954f;
        int iHashCode = ((((((i7 * 1000003) ^ ((int) j8)) * 1000003) ^ ((int) j10)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f955g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f956h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f957i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override
    public final int i() {
        return this.f950b;
    }

    @Override
    public final long j() {
        return this.f953e;
    }

    @Override
    final List k() {
        return this.f955g;
    }

    @Override
    final List l() {
        return this.f954f;
    }

    @Override
    final List m() {
        return this.f957i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f949a + ", status=" + this.f950b + ", errorCode=" + this.f951c + ", bytesDownloaded=" + this.f952d + ", totalBytesToDownload=" + this.f953e + ", moduleNamesNullable=" + String.valueOf(this.f954f) + ", languagesNullable=" + String.valueOf(this.f955g) + ", resolutionIntent=" + String.valueOf(this.f956h) + ", splitFileIntents=" + String.valueOf(this.f957i) + "}";
    }
}
