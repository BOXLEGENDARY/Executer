package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.birbit.android.jobqueue.persistentQueue.sqlite.c;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import f6.ck.ZJZXBWla;

public class d {

    static final String f13854h = Long.toString(Long.MIN_VALUE);

    static final String f13855i = Long.toString(Long.MAX_VALUE);

    public final long f13856a;

    public final String f13857b;

    public final String[] f13858c;

    private SQLiteStatement f13859d;

    private String f13860e;

    private SQLiteStatement f13861f;

    private String f13862g;

    public d(long j7, String str, String[] strArr) {
        this.f13856a = j7;
        this.f13857b = str;
        this.f13858c = strArr;
    }

    public SQLiteStatement a(SQLiteDatabase sQLiteDatabase, StringBuilder sb) {
        SQLiteStatement sQLiteStatement = this.f13859d;
        if (sQLiteStatement == null) {
            sb.setLength(0);
            sb.append("SELECT SUM(case WHEN ");
            c.C0150c c0150c = a.f13816v;
            sb.append(c0150c.f13849a);
            sb.append(wtzgsqRsIZB.kpyAMFNTm);
            sb.append("SELECT count(*) group_cnt, ");
            sb.append(c0150c.f13849a);
            sb.append(" FROM ");
            sb.append("job_holder");
            sb.append(ZJZXBWla.rxno);
            sb.append(this.f13857b);
            sb.append(" GROUP BY ");
            sb.append(c0150c.f13849a);
            sb.append(")");
            this.f13859d = sQLiteDatabase.compileStatement(sb.toString());
        } else {
            sQLiteStatement.clearBindings();
        }
        int i7 = 1;
        while (true) {
            String[] strArr = this.f13858c;
            if (i7 > strArr.length) {
                return this.f13859d;
            }
            this.f13859d.bindString(i7, strArr[i7 - 1]);
            i7++;
        }
    }

    public void b() {
        SQLiteStatement sQLiteStatement = this.f13859d;
        if (sQLiteStatement != null) {
            sQLiteStatement.close();
            this.f13859d = null;
        }
        SQLiteStatement sQLiteStatement2 = this.f13861f;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.close();
            this.f13861f = null;
        }
    }

    public String c(c cVar) {
        if (this.f13860e == null) {
            this.f13860e = cVar.c(this.f13857b, null, new c.b[0]);
        }
        return this.f13860e;
    }

    public String d(c cVar) {
        if (this.f13862g == null) {
            String str = this.f13857b;
            c.b bVar = new c.b(a.f13815i, c.b.a.DESC);
            c.C0150c c0150c = a.f13818y;
            c.b.a aVar = c.b.a.ASC;
            this.f13862g = cVar.c(str, 1, bVar, new c.b(c0150c, aVar), new c.b(a.f13813d, aVar));
        }
        return this.f13862g;
    }

    public SQLiteStatement e(SQLiteDatabase sQLiteDatabase, c cVar) {
        SQLiteStatement sQLiteStatement = this.f13861f;
        if (sQLiteStatement == null) {
            String strD = cVar.d(a.f13807C.f13849a, this.f13857b, null, new c.b[0]);
            String strD2 = cVar.d(a.f13819z.f13849a, this.f13857b, null, new c.b[0]);
            StringBuilder sb = cVar.f13834n;
            sb.setLength(0);
            sb.append("SELECT * FROM (");
            sb.append(strD);
            sb.append(" ORDER BY 1 ASC LIMIT 1");
            sb.append(") UNION SELECT * FROM (");
            sb.append(strD2);
            sb.append(" ORDER BY 1 ASC LIMIT 1");
            sb.append(") ORDER BY 1 ASC LIMIT 1");
            this.f13861f = sQLiteDatabase.compileStatement(sb.toString());
        } else {
            sQLiteStatement.clearBindings();
        }
        int i7 = 1;
        while (true) {
            String[] strArr = this.f13858c;
            if (i7 > strArr.length) {
                this.f13861f.bindString(1, f13855i);
                this.f13861f.bindString(this.f13858c.length + 1, f13854h);
                return this.f13861f;
            }
            int i8 = i7 - 1;
            this.f13861f.bindString(i7, strArr[i8]);
            SQLiteStatement sQLiteStatement2 = this.f13861f;
            String[] strArr2 = this.f13858c;
            sQLiteStatement2.bindString(strArr2.length + i7, strArr2[i8]);
            i7++;
        }
    }
}
