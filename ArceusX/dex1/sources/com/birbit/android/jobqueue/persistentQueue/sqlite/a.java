package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.birbit.android.jobqueue.persistentQueue.sqlite.c;

public class a extends SQLiteOpenHelper {

    static final c.C0150c f13805A;

    static final c.C0150c f13806B;

    static final c.C0150c f13807C;

    static final c.C0150c f13808D;

    static final c.C0150c f13809E;

    static final c.C0150c f13810F;

    static final c.C0150c f13811G;

    static final c.C0150c f13812H;

    static final c.C0150c f13813d = new c.C0150c("insertionOrder", "integer", 0);

    static final c.C0150c f13814e;

    static final c.C0150c f13815i;

    static final c.C0150c f13816v;

    static final c.C0150c f13817w;

    static final c.C0150c f13818y;

    static final c.C0150c f13819z;

    static {
        c.C0150c c0150c = new c.C0150c("_id", "text", 1, null, true);
        f13814e = c0150c;
        f13815i = new c.C0150c("priority", "integer", 2);
        f13816v = new c.C0150c("group_id", "text", 3);
        f13817w = new c.C0150c("run_count", "integer", 4);
        f13818y = new c.C0150c("created_ns", "long", 5);
        f13819z = new c.C0150c("delay_until_ns", "long", 6);
        f13805A = new c.C0150c("running_session_id", "long", 7);
        f13806B = new c.C0150c("network_type", "integer", 8);
        f13807C = new c.C0150c("deadline", "integer", 9);
        f13808D = new c.C0150c("cancel_on_deadline", "integer", 10);
        f13809E = new c.C0150c("cancelled", "integer", 11);
        f13810F = new c.C0150c("_id", "integer", 0);
        f13811G = new c.C0150c("job_id", "text", 1, new c.a("job_holder", c0150c.f13849a));
        f13812H = new c.C0150c("tag_name", "text", 2);
    }

    public a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
    }

    private void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE job_holder ADD COLUMN ");
        c.C0150c c0150c = f13809E;
        sb.append(c0150c.f13849a);
        sb.append(" ");
        sb.append(c0150c.f13850b);
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(c.b("job_holder", f13813d, f13814e, f13815i, f13816v, f13817w, f13818y, f13819z, f13805A, f13806B, f13807C, f13808D, f13809E));
        c.C0150c c0150c = f13810F;
        c.C0150c c0150c2 = f13811G;
        c.C0150c c0150c3 = f13812H;
        sQLiteDatabase.execSQL(c.b("job_holder_tags", c0150c, c0150c2, c0150c3));
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS TAG_NAME_INDEX ON job_holder_tags(" + c0150c3.f13849a + ")");
    }

    @Override
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) throws SQLException {
        onUpgrade(sQLiteDatabase, i7, i8);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) throws SQLException {
        if (i7 == 11) {
            b(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.execSQL(c.e("job_holder"));
        sQLiteDatabase.execSQL(c.e("job_holder_tags"));
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS TAG_NAME_INDEX");
        onCreate(sQLiteDatabase);
    }
}
