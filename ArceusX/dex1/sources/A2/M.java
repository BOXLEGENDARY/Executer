package A2;

import B2.b;
import S5.Cg.XjqcfAbdbc;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.room.kU.HguUe;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import s2.i;
import v2.a;
import v2.c;

public class M implements InterfaceC0247d, B2.b, InterfaceC0246c {

    private static final q2.b f20y = q2.b.b("proto");

    private final U f21d;

    private final C2.a f22e;

    private final C2.a f23i;

    private final AbstractC0248e f24v;

    private final O9.a<String> f25w;

    interface b<T, U> {
        U apply(T t7);
    }

    private static class c {

        final String f26a;

        final String f27b;

        private c(String str, String str2) {
            this.f26a = str;
            this.f27b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    M(C2.a aVar, C2.a aVar2, AbstractC0248e abstractC0248e, U u7, O9.a<String> aVar3) {
        this.f21d = u7;
        this.f22e = aVar;
        this.f23i = aVar2;
        this.f24v = abstractC0248e;
        this.f25w = aVar3;
    }

    private v2.b A1() {
        return v2.b.b().b(v2.e.c().b(y1()).c(AbstractC0248e.f59a.f()).a()).a();
    }

    private long B1() {
        return z1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long C1() {
        return z1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private v2.f D1() {
        final long jA = this.f22e.a();
        return (v2.f) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return M.P1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long E1(SQLiteDatabase sQLiteDatabase, s2.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(D2.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) p2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.Q1((Cursor) obj);
            }
        });
    }

    private boolean G1() {
        return B1() * C1() >= this.f24v.f();
    }

    private List<AbstractC0254k> H1(List<AbstractC0254k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC0254k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0254k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f26a, cVar.f27b);
                }
                listIterator.set(AbstractC0254k.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }

    public Object I1(Cursor cursor) {
        while (cursor.moveToNext()) {
            e(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public Integer J1(long j7, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j7)};
        p2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f75a.I1((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static Object K1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static Object L1(Throwable th) {
        throw new B2.a("Timed out while trying to acquire the lock.", th);
    }

    public static SQLiteDatabase M1(Throwable th) {
        throw new B2.a("Timed out while trying to open db.", th);
    }

    public static Long N1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static v2.f O1(long j7, Cursor cursor) {
        cursor.moveToNext();
        return v2.f.c().c(cursor.getLong(0)).b(j7).a();
    }

    public static v2.f P1(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (v2.f) p2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.O1(j7, (Cursor) obj);
            }
        });
    }

    public static Long Q1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public Boolean R1(s2.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lE1 = E1(sQLiteDatabase, oVar);
        return lE1 == null ? Boolean.FALSE : (Boolean) p2(z1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lE1.toString()}), new b() {
            @Override
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static List S1(SQLiteDatabase sQLiteDatabase) {
        return (List) p2(sQLiteDatabase.rawQuery(sMlEMqrxoGI.zpJG, new String[0]), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.T1((Cursor) obj);
            }
        });
    }

    public static List T1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(s2.o.a().b(cursor.getString(1)).d(D2.a.b(cursor.getInt(2))).c(j2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public List U1(s2.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC0254k> listH2 = h2(sQLiteDatabase, oVar, this.f24v.d());
        for (q2.d dVar : q2.d.values()) {
            if (dVar != oVar.d()) {
                int iD = this.f24v.d() - listH2.size();
                if (iD <= 0) {
                    break;
                }
                listH2.addAll(h2(sQLiteDatabase, oVar.f(dVar), iD));
            }
        }
        return H1(listH2, i2(sQLiteDatabase, listH2));
    }

    public v2.a V1(Map map, a.C0233a c0233a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarO1 = o1(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(v2.c.c().c(bVarO1).b(j7).a());
        }
        k2(c0233a, map);
        c0233a.e(D1());
        c0233a.d(A1());
        c0233a.c((String) this.f25w.get());
        return c0233a.b();
    }

    public v2.a W1(String str, final Map map, final a.C0233a c0233a, SQLiteDatabase sQLiteDatabase) {
        return (v2.a) p2(sQLiteDatabase.rawQuery(str, new String[0]), new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f6a.V1(map, c0233a, (Cursor) obj);
            }
        });
    }

    public Object X1(List list, s2.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            i.a aVarK = s2.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z7) {
                aVarK.h(new s2.h(n2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new s2.h(n2(cursor.getString(4)), l2(j7)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC0254k.a(j7, oVar, aVarK.d()));
        }
        return null;
    }

    public static Object Y1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j7));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j7), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public Long Z1(s2.i iVar, s2.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (G1()) {
            e(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jS1 = s1(sQLiteDatabase, oVar);
        int iE = this.f24v.e();
        byte[] bArrA = iVar.e().a();
        boolean z7 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jS1));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put("payload", z7 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i7 = 1; i7 <= iCeil; i7++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i7 - 1) * iE, Math.min(i7 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static byte[] a2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public Object b2(Cursor cursor) {
        while (cursor.moveToNext()) {
            e(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public Object c2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        p2(sQLiteDatabase.rawQuery(str2, null), new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f80a.b2((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static Boolean d2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static Object e2(String str, c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) p2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())}), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.d2((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.c()));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static Object f2(long j7, s2.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        String[] strArr = {oVar.b(), String.valueOf(D2.a.a(oVar.d()))};
        String str = XjqcfAbdbc.WrKIsMPYUUYWF;
        if (sQLiteDatabase.update(str, contentValues, "backend_name = ? and priority = ?", strArr) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(D2.a.a(oVar.d())));
            sQLiteDatabase.insert(str, null, contentValues);
        }
        return null;
    }

    public Object g2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f22e.a()).execute();
        return null;
    }

    private List<AbstractC0254k> h2(SQLiteDatabase sQLiteDatabase, final s2.o oVar, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long lE1 = E1(sQLiteDatabase, oVar);
        if (lE1 == null) {
            return arrayList;
        }
        p2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lE1.toString()}, null, null, null, String.valueOf(i7)), new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f81a.X1(arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> i2(SQLiteDatabase sQLiteDatabase, List<AbstractC0254k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(list.get(i7).c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        p2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.Y1(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] j2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void k2(a.C0233a c0233a, Map<String, List<v2.c>> map) {
        for (Map.Entry<String, List<v2.c>> entry : map.entrySet()) {
            c0233a.a(v2.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] l2(long j7) {
        return (byte[]) p2(z1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.a2((Cursor) obj);
            }
        });
    }

    private <T> T m2(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f23i.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e7) {
                if (this.f23i.a() >= this.f24v.b() + jA) {
                    return bVar.apply(e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static q2.b n2(String str) {
        return str == null ? f20y : q2.b.b(str);
    }

    private c.b o1(int i7) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i7 == bVar.c()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.c()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i7 == bVar3.c()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.c()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.c()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i7 == bVar6.c()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i7 == bVar7.c()) {
            return bVar7;
        }
        w2.a.a(ZJZXBWla.hkXNcPpads, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    private static String o2(Iterable<AbstractC0254k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC0254k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private void p1(final SQLiteDatabase sQLiteDatabase) {
        m2(new d() {
            @Override
            public final Object a() {
                return M.K1(sQLiteDatabase);
            }
        }, new b() {
            @Override
            public final Object apply(Object obj) {
                return M.L1((Throwable) obj);
            }
        });
    }

    static <T> T p2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private long s1(SQLiteDatabase sQLiteDatabase, s2.o oVar) {
        Long lE1 = E1(sQLiteDatabase, oVar);
        if (lE1 != null) {
            return lE1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(D2.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    <T> T F1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseZ1 = z1();
        sQLiteDatabaseZ1.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseZ1);
            sQLiteDatabaseZ1.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseZ1.endTransaction();
        }
    }

    @Override
    public Iterable<s2.o> S() {
        return (Iterable) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return M.S1((SQLiteDatabase) obj);
            }
        });
    }

    @Override
    public void b() {
        F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f71a.g2((SQLiteDatabase) obj);
            }
        });
    }

    @Override
    public void close() {
        this.f21d.close();
    }

    @Override
    public void e(final long j7, final c.b bVar, final String str) {
        F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return M.e2(str, bVar, j7, (SQLiteDatabase) obj);
            }
        });
    }

    @Override
    public v2.a f() {
        final a.C0233a c0233aE = v2.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (v2.a) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f76a.W1(str, map, c0233aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override
    public void h1(final s2.o oVar, final long j7) {
        F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return M.f2(j7, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override
    public <T> T j(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseZ1 = z1();
        p1(sQLiteDatabaseZ1);
        try {
            T tExecute = aVar.execute();
            sQLiteDatabaseZ1.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseZ1.endTransaction();
        }
    }

    @Override
    public AbstractC0254k j1(final s2.o oVar, final s2.i iVar) {
        w2.a.b("SQLiteEventStore", HguUe.JEIdQlVZtpkuV, oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f12a.Z1(iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0254k.a(jLongValue, oVar, iVar);
    }

    @Override
    public void m1(Iterable<AbstractC0254k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + o2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            F1(new b() {
                @Override
                public final Object apply(Object obj) {
                    return this.f17a.c2(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override
    public boolean n(final s2.o oVar) {
        return ((Boolean) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f67a.R1(oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override
    public int q() {
        final long jA = this.f22e.a() - this.f24v.c();
        return ((Integer) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f15a.J1(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override
    public void t(Iterable<AbstractC0254k> iterable) {
        if (iterable.iterator().hasNext()) {
            z1().compileStatement("DELETE FROM events WHERE _id in " + o2(iterable)).execute();
        }
    }

    @Override
    public long v1(s2.o oVar) {
        return ((Long) p2(z1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(D2.a.a(oVar.d()))}), new b() {
            @Override
            public final Object apply(Object obj) {
                return M.N1((Cursor) obj);
            }
        })).longValue();
    }

    @Override
    public Iterable<AbstractC0254k> y0(final s2.o oVar) {
        return (Iterable) F1(new b() {
            @Override
            public final Object apply(Object obj) {
                return this.f65a.U1(oVar, (SQLiteDatabase) obj);
            }
        });
    }

    long y1() {
        return B1() * C1();
    }

    SQLiteDatabase z1() {
        final U u7 = this.f21d;
        Objects.requireNonNull(u7);
        return (SQLiteDatabase) m2(new d() {
            @Override
            public final Object a() {
                return u7.getWritableDatabase();
            }
        }, new b() {
            @Override
            public final Object apply(Object obj) {
                return M.M1((Throwable) obj);
            }
        });
    }
}
