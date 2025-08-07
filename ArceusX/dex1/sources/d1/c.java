package d1;

import aa.o;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.util.Pair;
import c1.j;
import c1.k;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import w7.Jld.EZYiRMRTxKdo;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\rJ\u0015\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0013R(\u00106\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000603\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Ld1/c;", "Lc1/g;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", BuildConfig.FLAVOR, "sql", "Lc1/k;", "J", "(Ljava/lang/String;)Lc1/k;", BuildConfig.FLAVOR, "p", "()V", "f0", "v0", "d0", BuildConfig.FLAVOR, "V0", "()Z", "query", "Landroid/database/Cursor;", "q0", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lc1/j;", "X0", "(Lc1/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "K0", "(Lc1/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "z", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bindArgs", "e0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "sqLiteDatabase", "f", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "d", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "d1", "isWriteAheadLoggingEnabled", BuildConfig.FLAVOR, "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "e", "a", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements c1.g {

    private static final String[] f20272i = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    private static final String[] f20273v = new String[0];

    private final SQLiteDatabase delegate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", BuildConfig.FLAVOR, "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements o<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        final j f20275d;

        b(j jVar) {
            super(4);
            this.f20275d = jVar;
        }

        public final SQLiteCursor h(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f20275d;
            Intrinsics.d(sQLiteQuery);
            jVar.b(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "delegate");
        this.delegate = sQLiteDatabase;
    }

    public static final Cursor j(o oVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(oVar, EZYiRMRTxKdo.uQVIUiZkhKoFVl);
        return (Cursor) oVar.h(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor m(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(jVar, "$query");
        Intrinsics.d(sQLiteQuery);
        jVar.b(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override
    public k J(String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override
    public Cursor K0(final j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String query2 = query.getQuery();
        String[] strArr = f20273v;
        Intrinsics.d(cancellationSignal);
        return c1.b.e(sQLiteDatabase, query2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() {
            @Override
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.m(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override
    public boolean V0() {
        return this.delegate.inTransaction();
    }

    @Override
    public Cursor X0(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            @Override
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.j(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getQuery(), f20273v, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override
    public void d0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override
    public boolean d1() {
        return c1.b.d(this.delegate);
    }

    @Override
    public void e0(String sql, Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    public final boolean f(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.b(this.delegate, sqLiteDatabase);
    }

    @Override
    public void f0() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override
    public void p() {
        this.delegate.beginTransaction();
    }

    @Override
    public Cursor q0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return X0(new c1.a(query));
    }

    @Override
    public List<Pair<String, String>> v() {
        return this.delegate.getAttachedDbs();
    }

    @Override
    public void v0() {
        this.delegate.endTransaction();
    }

    @Override
    public void z(String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }
}
