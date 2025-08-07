package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import j2.C2491a;
import ka.oik.UJEa;

public class c {

    String f13821a;

    String f13822b;

    String f13823c;

    String f13824d;

    String f13825e;

    private SQLiteStatement f13826f;

    private SQLiteStatement f13827g;

    private SQLiteStatement f13828h;

    private SQLiteStatement f13829i;

    private SQLiteStatement f13830j;

    private SQLiteStatement f13831k;

    private SQLiteStatement f13832l;

    private SQLiteStatement f13833m;

    final StringBuilder f13834n = new StringBuilder();

    final SQLiteDatabase f13835o;

    final String f13836p;

    final String f13837q;

    final int f13838r;

    final String f13839s;

    final int f13840t;

    final long f13841u;

    public static class a {

        final String f13842a;

        final String f13843b;

        public a(String str, String str2) {
            this.f13842a = str;
            this.f13843b = str2;
        }
    }

    public static class b {

        final C0150c f13844a;

        final a f13845b;

        public enum a {
            ASC,
            DESC
        }

        public b(C0150c c0150c, a aVar) {
            this.f13844a = c0150c;
            this.f13845b = aVar;
        }
    }

    public static class C0150c {

        final String f13849a;

        final String f13850b;

        public final int f13851c;

        public final a f13852d;

        public final boolean f13853e;

        public C0150c(String str, String str2, int i7) {
            this(str, str2, i7, null, false);
        }

        public C0150c(String str, String str2, int i7, a aVar) {
            this(str, str2, i7, aVar, false);
        }

        public C0150c(String str, String str2, int i7, a aVar, boolean z7) {
            this.f13849a = str;
            this.f13850b = str2;
            this.f13851c = i7;
            this.f13852d = aVar;
            this.f13853e = z7;
        }
    }

    public c(SQLiteDatabase sQLiteDatabase, String str, String str2, int i7, String str3, int i8, long j7) {
        this.f13835o = sQLiteDatabase;
        this.f13836p = str;
        this.f13838r = i7;
        this.f13837q = str2;
        this.f13841u = j7;
        this.f13840t = i8;
        this.f13839s = str3;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE ");
        C0150c c0150c = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13814e;
        sb.append(c0150c.f13849a);
        sb.append(" = ?");
        this.f13821a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM ");
        sb2.append(str);
        sb2.append(" WHERE ");
        sb2.append(c0150c.f13849a);
        sb2.append(" IN ( SELECT ");
        C0150c c0150c2 = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13811G;
        sb2.append(c0150c2.f13849a);
        sb2.append(" FROM ");
        sb2.append(str3);
        sb2.append(" WHERE ");
        C0150c c0150c3 = com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13812H;
        sb2.append(c0150c3.f13849a);
        sb2.append(" = ?)");
        this.f13822b = sb2.toString();
        this.f13823c = "SELECT " + c0150c.f13849a + " FROM " + str;
        this.f13824d = "SELECT " + c0150c3.f13849a + " FROM job_holder_tags WHERE " + c0150c2.f13849a + " = ?";
        StringBuilder sb3 = new StringBuilder();
        sb3.append("UPDATE ");
        sb3.append(str);
        sb3.append(" SET ");
        sb3.append(com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13809E.f13849a);
        sb3.append(UJEa.whCp);
        this.f13825e = sb3.toString();
    }

    static void a(StringBuilder sb, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("cannot create placeholders for 0 items");
        }
        sb.append("?");
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(",?");
        }
    }

    public static String b(String str, C0150c c0150c, C0150c... c0150cArr) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (");
        sb.append(c0150c.f13849a);
        sb.append(" ");
        sb.append(c0150c.f13850b);
        sb.append("  primary key ");
        for (C0150c c0150c2 : c0150cArr) {
            sb.append(", `");
            sb.append(c0150c2.f13849a);
            sb.append("` ");
            sb.append(c0150c2.f13850b);
            if (c0150c2.f13853e) {
                sb.append(" UNIQUE");
            }
        }
        for (C0150c c0150c3 : c0150cArr) {
            a aVar = c0150c3.f13852d;
            if (aVar != null) {
                sb.append(", FOREIGN KEY(`");
                sb.append(c0150c3.f13849a);
                sb.append("`) REFERENCES ");
                sb.append(aVar.f13842a);
                sb.append("(`");
                sb.append(aVar.f13843b);
                sb.append("`) ON DELETE CASCADE");
            }
        }
        sb.append(" );");
        C2491a.b(sb.toString(), new Object[0]);
        return sb.toString();
    }

    public static String e(String str) {
        return "DROP TABLE IF EXISTS " + str;
    }

    public String c(String str, Integer num, b... bVarArr) {
        this.f13834n.setLength(0);
        this.f13834n.append("SELECT * FROM ");
        this.f13834n.append(this.f13836p);
        if (str != null) {
            StringBuilder sb = this.f13834n;
            sb.append(" WHERE ");
            sb.append(str);
        }
        int length = bVarArr.length;
        boolean z7 = true;
        int i7 = 0;
        while (i7 < length) {
            b bVar = bVarArr[i7];
            if (z7) {
                this.f13834n.append(" ORDER BY ");
            } else {
                this.f13834n.append(",");
            }
            StringBuilder sb2 = this.f13834n;
            sb2.append(bVar.f13844a.f13849a);
            sb2.append(" ");
            sb2.append(bVar.f13845b);
            i7++;
            z7 = false;
        }
        if (num != null) {
            StringBuilder sb3 = this.f13834n;
            sb3.append(" LIMIT ");
            sb3.append(num);
        }
        return this.f13834n.toString();
    }

    public String d(String str, String str2, Integer num, b... bVarArr) {
        this.f13834n.setLength(0);
        StringBuilder sb = this.f13834n;
        sb.append("SELECT ");
        sb.append(str);
        sb.append(" FROM ");
        sb.append(this.f13836p);
        if (str2 != null) {
            StringBuilder sb2 = this.f13834n;
            sb2.append(GObvYfBKohxpYX.GmnsYhuNJuda);
            sb2.append(str2);
        }
        int length = bVarArr.length;
        boolean z7 = true;
        int i7 = 0;
        while (i7 < length) {
            b bVar = bVarArr[i7];
            if (z7) {
                this.f13834n.append(" ORDER BY ");
            } else {
                this.f13834n.append(",");
            }
            StringBuilder sb3 = this.f13834n;
            sb3.append(bVar.f13844a.f13849a);
            sb3.append(" ");
            sb3.append(bVar.f13845b);
            i7++;
            z7 = false;
        }
        if (num != null) {
            StringBuilder sb4 = this.f13834n;
            sb4.append(" LIMIT ");
            sb4.append(num);
        }
        return this.f13834n.toString();
    }

    public SQLiteStatement f() {
        if (this.f13832l == null) {
            this.f13832l = this.f13835o.compileStatement("SELECT COUNT(*) FROM " + this.f13836p + " WHERE " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13805A.f13849a + " != ?");
        }
        return this.f13832l;
    }

    public SQLiteStatement g() {
        if (this.f13830j == null) {
            this.f13830j = this.f13835o.compileStatement("DELETE FROM " + this.f13839s + " WHERE " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13811G.f13849a + "= ?");
        }
        return this.f13830j;
    }

    public SQLiteStatement h() {
        if (this.f13829i == null) {
            this.f13829i = this.f13835o.compileStatement("DELETE FROM " + this.f13836p + " WHERE " + this.f13837q + " = ?");
        }
        return this.f13829i;
    }

    public SQLiteStatement i() {
        if (this.f13828h == null) {
            this.f13834n.setLength(0);
            StringBuilder sb = this.f13834n;
            sb.append("INSERT OR REPLACE INTO ");
            sb.append(this.f13836p);
            this.f13834n.append(" VALUES (");
            for (int i7 = 0; i7 < this.f13838r; i7++) {
                if (i7 != 0) {
                    this.f13834n.append(",");
                }
                this.f13834n.append("?");
            }
            this.f13834n.append(")");
            this.f13828h = this.f13835o.compileStatement(this.f13834n.toString());
        }
        return this.f13828h;
    }

    public SQLiteStatement j() {
        if (this.f13826f == null) {
            this.f13834n.setLength(0);
            StringBuilder sb = this.f13834n;
            sb.append("INSERT INTO ");
            sb.append(this.f13836p);
            this.f13834n.append(" VALUES (");
            for (int i7 = 0; i7 < this.f13838r; i7++) {
                if (i7 != 0) {
                    this.f13834n.append(",");
                }
                this.f13834n.append("?");
            }
            this.f13834n.append(")");
            this.f13826f = this.f13835o.compileStatement(this.f13834n.toString());
        }
        return this.f13826f;
    }

    public SQLiteStatement k() {
        if (this.f13827g == null) {
            this.f13834n.setLength(0);
            StringBuilder sb = this.f13834n;
            sb.append("INSERT INTO ");
            sb.append("job_holder_tags");
            this.f13834n.append(" VALUES (");
            for (int i7 = 0; i7 < this.f13840t; i7++) {
                if (i7 != 0) {
                    this.f13834n.append(",");
                }
                this.f13834n.append("?");
            }
            this.f13834n.append(")");
            this.f13827g = this.f13835o.compileStatement(this.f13834n.toString());
        }
        return this.f13827g;
    }

    public SQLiteStatement l() {
        if (this.f13833m == null) {
            this.f13833m = this.f13835o.compileStatement("UPDATE " + this.f13836p + " SET " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13809E.f13849a + " = 1  WHERE " + this.f13837q + " = ? ");
        }
        return this.f13833m;
    }

    public SQLiteStatement m() {
        if (this.f13831k == null) {
            this.f13831k = this.f13835o.compileStatement("UPDATE " + this.f13836p + " SET " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13817w.f13849a + " = ? , " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13805A.f13849a + " = ?  WHERE " + this.f13837q + " = ? ");
        }
        return this.f13831k;
    }

    public void n(long j7) throws SQLException {
        this.f13835o.execSQL("UPDATE job_holder SET " + com.birbit.android.jobqueue.persistentQueue.sqlite.a.f13819z.f13849a + "=?", new Object[]{Long.valueOf(j7)});
    }

    public void o() throws SQLException {
        this.f13835o.execSQL("DELETE FROM job_holder");
        this.f13835o.execSQL("DELETE FROM job_holder_tags");
        p();
    }

    public void p() throws SQLException {
        this.f13835o.execSQL("VACUUM");
    }
}
