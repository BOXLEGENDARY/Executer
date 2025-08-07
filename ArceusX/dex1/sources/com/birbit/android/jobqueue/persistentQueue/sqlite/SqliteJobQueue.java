package com.birbit.android.jobqueue.persistentQueue.sqlite;

import S5.Cg.XjqcfAbdbc;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import com.birbit.android.jobqueue.JobQueue;
import com.birbit.android.jobqueue.f;
import j2.C2491a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SqliteJobQueue implements JobQueue {

    private com.birbit.android.jobqueue.persistentQueue.sqlite.a f13797a;

    private final long f13798b;

    private SQLiteDatabase f13799c;

    private c f13800d;

    private JobSerializer f13801e;

    private com.birbit.android.jobqueue.persistentQueue.sqlite.b f13802f;

    private final StringBuilder f13803g = new StringBuilder();

    private final e f13804h;

    public interface JobSerializer {
        <T extends com.birbit.android.jobqueue.e> T deserialize(byte[] bArr) throws IOException, ClassNotFoundException;

        byte[] serialize(Object obj) throws IOException;
    }

    static class a extends Exception {
        a(String str) {
            super(str);
        }

        a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class b implements JobSerializer {
        @Override
        public <T extends com.birbit.android.jobqueue.e> T deserialize(byte[] bArr) throws Throwable {
            ObjectInputStream objectInputStream = null;
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(bArr));
                try {
                    T t7 = (T) objectInputStream2.readObject();
                    objectInputStream2.close();
                    return t7;
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override
        public byte[] serialize(Object obj) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream = null;
            if (obj == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    new ObjectOutputStream(byteArrayOutputStream2).writeObject(obj);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public SqliteJobQueue(h2.a aVar, long j7, JobSerializer jobSerializer) throws SQLException {
        String str;
        this.f13798b = j7;
        this.f13802f = new com.birbit.android.jobqueue.persistentQueue.sqlite.b(aVar.b(), "jobs_" + aVar.f());
        this.f13804h = new e(j7);
        Context contextB = aVar.b();
        if (aVar.p()) {
            str = null;
        } else {
            str = "db_" + aVar.f();
        }
        com.birbit.android.jobqueue.persistentQueue.sqlite.a aVar2 = new com.birbit.android.jobqueue.persistentQueue.sqlite.a(contextB, str);
        this.f13797a = aVar2;
        SQLiteDatabase writableDatabase = aVar2.getWritableDatabase();
        this.f13799c = writableDatabase;
        this.f13800d = new c(writableDatabase, "job_holder", com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13849a, 12, "job_holder_tags", 3, j7);
        this.f13801e = jobSerializer;
        if (aVar.q()) {
            this.f13800d.n(Long.MIN_VALUE);
        }
        j();
        c();
    }

    private void a(SQLiteStatement sQLiteStatement, String str, String str2) {
        sQLiteStatement.bindString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13811G.f13851c + 1, str);
        sQLiteStatement.bindString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13812H.f13851c + 1, str2);
    }

    private void b(SQLiteStatement sQLiteStatement, f fVar) {
        if (fVar.f() != null) {
            sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13813d.f13851c + 1, fVar.f().longValue());
        }
        sQLiteStatement.bindString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13851c + 1, fVar.e());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13815i.f13851c + 1, fVar.h());
        if (fVar.d() != null) {
            sQLiteStatement.bindString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13816v.f13851c + 1, fVar.d());
        }
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13817w.f13851c + 1, fVar.k());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13818y.f13851c + 1, fVar.a());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13819z.f13851c + 1, fVar.c());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13805A.f13851c + 1, fVar.l());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13806B.f13851c + 1, fVar.i());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13807C.f13851c + 1, fVar.b());
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13808D.f13851c + 1, fVar.F() ? 1L : 0L);
        sQLiteStatement.bindLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13809E.f13851c + 1, fVar.r() ? 1L : 0L);
    }

    private void c() {
        Cursor cursorRawQuery = this.f13799c.rawQuery(this.f13800d.f13823c, null);
        HashSet hashSet = new HashSet();
        while (cursorRawQuery.moveToNext()) {
            try {
                hashSet.add(cursorRawQuery.getString(0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        this.f13802f.h(hashSet);
    }

    private f d(Cursor cursor) throws a {
        String string = cursor.getString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13851c);
        try {
            com.birbit.android.jobqueue.e eVarK = k(this.f13802f.e(string));
            if (eVarK != null) {
                return new f.b().g(cursor.getLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13813d.f13851c)).j(cursor.getInt(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13815i.f13851c)).e(cursor.getString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13816v.f13851c)).l(cursor.getInt(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13817w.f13851c)).h(eVarK).f(string).n(h(string)).i(true).c(cursor.getLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13807C.f13851c), cursor.getInt(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13808D.f13851c) == 1).b(cursor.getLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13818y.f13851c)).d(cursor.getLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13819z.f13851c)).m(cursor.getLong(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13805A.f13851c)).k(cursor.getInt(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13806B.f13851c)).a();
            }
            throw new a("null job");
        } catch (IOException e7) {
            throw new a("cannot load job from disk", e7);
        }
    }

    private d e(com.birbit.android.jobqueue.c cVar) {
        return this.f13804h.a(cVar, this.f13803g);
    }

    private void f(String str) {
        this.f13799c.beginTransaction();
        try {
            SQLiteStatement sQLiteStatementH = this.f13800d.h();
            sQLiteStatementH.clearBindings();
            sQLiteStatementH.bindString(1, str);
            sQLiteStatementH.execute();
            SQLiteStatement sQLiteStatementG = this.f13800d.g();
            sQLiteStatementG.bindString(1, str);
            sQLiteStatementG.execute();
            this.f13799c.setTransactionSuccessful();
            this.f13802f.b(str);
        } finally {
            this.f13799c.endTransaction();
        }
    }

    private boolean g(f fVar) {
        SQLiteStatement sQLiteStatementJ = this.f13800d.j();
        SQLiteStatement sQLiteStatementK = this.f13800d.k();
        this.f13799c.beginTransaction();
        try {
            sQLiteStatementJ.clearBindings();
            b(sQLiteStatementJ, fVar);
            if (sQLiteStatementJ.executeInsert() != -1) {
                for (String str : fVar.m()) {
                    sQLiteStatementK.clearBindings();
                    a(sQLiteStatementK, fVar.e(), str);
                    sQLiteStatementK.executeInsert();
                }
                this.f13799c.setTransactionSuccessful();
                this.f13799c.endTransaction();
                return true;
            }
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    private Set<String> h(String str) {
        Cursor cursorRawQuery = this.f13799c.rawQuery(this.f13800d.f13824d, new String[]{str});
        try {
            if (cursorRawQuery.getCount() == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet();
            while (cursorRawQuery.moveToNext()) {
                hashSet.add(cursorRawQuery.getString(0));
            }
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    private void i(f fVar) {
        try {
            this.f13802f.f(fVar.e(), this.f13801e.serialize(fVar.g()));
        } catch (IOException e7) {
            throw new RuntimeException("cannot save job to disk", e7);
        }
    }

    private void j() throws SQLException {
        this.f13799c.execSQL(this.f13800d.f13825e);
    }

    private com.birbit.android.jobqueue.e k(byte[] bArr) {
        try {
            return this.f13801e.deserialize(bArr);
        } catch (Throwable th) {
            C2491a.d(th, "error while deserializing job", new Object[0]);
            return null;
        }
    }

    private void l(f fVar) {
        SQLiteStatement sQLiteStatementM = this.f13800d.m();
        fVar.C(fVar.k() + 1);
        fVar.D(this.f13798b);
        sQLiteStatementM.clearBindings();
        sQLiteStatementM.bindLong(1, fVar.k());
        sQLiteStatementM.bindLong(2, this.f13798b);
        sQLiteStatementM.bindString(3, fVar.e());
        sQLiteStatementM.execute();
    }

    @Override
    public void clear() throws SQLException {
        this.f13800d.o();
        c();
    }

    @Override
    public int count() {
        SQLiteStatement sQLiteStatementF = this.f13800d.f();
        sQLiteStatementF.clearBindings();
        sQLiteStatementF.bindLong(1, this.f13798b);
        return (int) sQLiteStatementF.simpleQueryForLong();
    }

    @Override
    public int countReadyJobs(com.birbit.android.jobqueue.c cVar) {
        return (int) e(cVar).a(this.f13799c, this.f13803g).simpleQueryForLong();
    }

    @Override
    public f findJobById(String str) {
        Cursor cursorRawQuery = this.f13799c.rawQuery(this.f13800d.f13821a, new String[]{str});
        try {
            if (cursorRawQuery.moveToFirst()) {
                return d(cursorRawQuery);
            }
            return null;
        } catch (a e7) {
            C2491a.d(e7, "invalid job on findJobById", new Object[0]);
            return null;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override
    public Set<f> findJobs(com.birbit.android.jobqueue.c cVar) {
        d dVarE = e(cVar);
        Cursor cursorRawQuery = this.f13799c.rawQuery(dVarE.c(this.f13800d), dVarE.f13858c);
        HashSet hashSet = new HashSet();
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    hashSet.add(d(cursorRawQuery));
                } catch (a e7) {
                    C2491a.d(e7, "invalid job found by tags.", new Object[0]);
                }
            } finally {
                cursorRawQuery.close();
            }
        }
        return hashSet;
    }

    @Override
    public Long getNextJobDelayUntilNs(com.birbit.android.jobqueue.c cVar) {
        try {
            long jSimpleQueryForLong = e(cVar).e(this.f13799c, this.f13800d).simpleQueryForLong();
            if (jSimpleQueryForLong == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jSimpleQueryForLong);
        } catch (SQLiteDoneException unused) {
            return null;
        }
    }

    @Override
    public boolean insert(f fVar) {
        i(fVar);
        if (fVar.q()) {
            return g(fVar);
        }
        SQLiteStatement sQLiteStatementJ = this.f13800d.j();
        sQLiteStatementJ.clearBindings();
        b(sQLiteStatementJ, fVar);
        long jExecuteInsert = sQLiteStatementJ.executeInsert();
        fVar.A(jExecuteInsert);
        return jExecuteInsert != -1;
    }

    @Override
    public boolean insertOrReplace(f fVar) {
        if (fVar.f() == null) {
            return insert(fVar);
        }
        i(fVar);
        fVar.D(Long.MIN_VALUE);
        SQLiteStatement sQLiteStatementI = this.f13800d.i();
        sQLiteStatementI.clearBindings();
        b(sQLiteStatementI, fVar);
        boolean z7 = sQLiteStatementI.executeInsert() != -1;
        C2491a.b(XjqcfAbdbc.ddeJEagyWsmVI, Boolean.valueOf(z7));
        return z7;
    }

    @Override
    public f nextJobAndIncRunCount(com.birbit.android.jobqueue.c cVar) {
        d dVarE = e(cVar);
        String strD = dVarE.d(this.f13800d);
        while (true) {
            Cursor cursorRawQuery = this.f13799c.rawQuery(strD, dVarE.f13858c);
            try {
                if (!cursorRawQuery.moveToNext()) {
                    cursorRawQuery.close();
                    return null;
                }
                f fVarD = d(cursorRawQuery);
                l(fVarD);
                return fVarD;
            } catch (a unused) {
                String string = cursorRawQuery.getString(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e.f13851c);
                if (string == null) {
                    C2491a.c("cannot find job id on a retrieved job", new Object[0]);
                } else {
                    f(string);
                }
            } finally {
                cursorRawQuery.close();
            }
        }
    }

    @Override
    public void onJobCancelled(f fVar) {
        SQLiteStatement sQLiteStatementL = this.f13800d.l();
        sQLiteStatementL.clearBindings();
        sQLiteStatementL.bindString(1, fVar.e());
        sQLiteStatementL.execute();
    }

    @Override
    public void remove(f fVar) {
        f(fVar.e());
    }

    @Override
    public void substitute(f fVar, f fVar2) {
        this.f13799c.beginTransaction();
        try {
            remove(fVar2);
            insert(fVar);
            this.f13799c.setTransactionSuccessful();
        } finally {
            this.f13799c.endTransaction();
        }
    }
}
