package A2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import ka.oik.UJEa;

final class U extends SQLiteOpenHelper {

    private static final a f33A;

    private static final a f34B;

    private static final List<a> f35C;

    private static final String f36i = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    static int f37v = 5;

    private static final a f38w;

    private static final a f39y;

    private static final a f40z;

    private final int f41d;

    private boolean f42e;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() {
            @Override
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                U.y(sQLiteDatabase);
            }
        };
        f38w = aVar;
        a aVar2 = new a() {
            @Override
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                U.A(sQLiteDatabase);
            }
        };
        f39y = aVar2;
        a aVar3 = new a() {
            @Override
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f40z = aVar3;
        a aVar4 = new a() {
            @Override
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                U.N(sQLiteDatabase);
            }
        };
        f33A = aVar4;
        a aVar5 = new a() {
            @Override
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                U.U(sQLiteDatabase);
            }
        };
        f34B = aVar5;
        f35C = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    U(Context context, String str, int i7) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f42e = false;
        this.f41d = i7;
    }

    public static void A(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static void N(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static void U(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f36i);
    }

    private void Z(SQLiteDatabase sQLiteDatabase, int i7) {
        u(sQLiteDatabase);
        h0(sQLiteDatabase, 0, i7);
    }

    private void h0(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List<a> list = f35C;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                f35C.get(i7).a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void u(SQLiteDatabase sQLiteDatabase) {
        if (this.f42e) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public static void y(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(UJEa.YWjLpgea);
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    @Override
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f42e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Z(sQLiteDatabase, this.f41d);
    }

    @Override
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        Z(sQLiteDatabase, i8);
    }

    @Override
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        u(sQLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        u(sQLiteDatabase);
        h0(sQLiteDatabase, i7, i8);
    }
}
