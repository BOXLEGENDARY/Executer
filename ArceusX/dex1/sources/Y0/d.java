package Y0;

import Q6.QtA.QXojhh;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003!\u0011\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"LY0/d;", "Lc1/h;", "LY0/i;", "delegate", "LY0/c;", "autoCloser", "<init>", "(Lc1/h;LY0/c;)V", BuildConfig.FLAVOR, "enabled", BuildConfig.FLAVOR, "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "d", "Lc1/h;", "b", "()Lc1/h;", "e", "LY0/c;", "LY0/d$a;", "i", "LY0/d$a;", "autoClosingDb", BuildConfig.FLAVOR, "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lc1/g;", "o0", "()Lc1/g;", "writableDatabase", "a", "c", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c1.h, i {

    private final c1.h delegate;

    public final Y0.c autoCloser;

    private final a autoClosingDb;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010#0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0016\u0010-\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0014R(\u00104\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t01\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LY0/d$a;", "Lc1/g;", "LY0/c;", "autoCloser", "<init>", "(LY0/c;)V", BuildConfig.FLAVOR, "b", "()V", BuildConfig.FLAVOR, "sql", "Lc1/k;", "J", "(Ljava/lang/String;)Lc1/k;", "p", "f0", "v0", "d0", BuildConfig.FLAVOR, "V0", "()Z", "query", "Landroid/database/Cursor;", "q0", "(Ljava/lang/String;)Landroid/database/Cursor;", "Lc1/j;", "X0", "(Lc1/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "K0", "(Lc1/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "z", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bindArgs", "e0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "d", "LY0/c;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "d1", "isWriteAheadLoggingEnabled", BuildConfig.FLAVOR, "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements c1.g {

        private final Y0.c autoCloser;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc1/g;", "obj", BuildConfig.FLAVOR, "Landroid/util/Pair;", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        static final class C0057a extends kotlin.jvm.internal.l implements Function1<c1.g, List<? extends Pair<String, String>>> {

            public static final C0057a f8032d = new C0057a();

            C0057a() {
                super(1);
            }

            public final List<Pair<String, String>> invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "obj");
                return gVar.v();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "db", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<c1.g, Object> {

            final String f8033d;

            b(String str) {
                super(1);
                this.f8033d = str;
            }

            public final Object invoke(c1.g gVar) throws SQLException {
                Intrinsics.checkNotNullParameter(gVar, "db");
                gVar.z(this.f8033d);
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "db", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<c1.g, Object> {

            final String f8034d;

            final Object[] f8035e;

            c(String str, Object[] objArr) {
                super(1);
                this.f8034d = str;
                this.f8035e = objArr;
            }

            public final Object invoke(c1.g gVar) throws SQLException {
                Intrinsics.checkNotNullParameter(gVar, "db");
                gVar.e0(this.f8034d, this.f8035e);
                return null;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        class C0058d extends kotlin.jvm.internal.j implements Function1<c1.g, Boolean> {

            public static final C0058d f8036d = new C0058d();

            C0058d() {
                super(1, c1.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            public final Boolean invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "p0");
                return Boolean.valueOf(gVar.V0());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "db", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.l implements Function1<c1.g, Boolean> {

            public static final e f8037d = new e();

            e() {
                super(1);
            }

            public final Boolean invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "db");
                return Boolean.valueOf(gVar.d1());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "obj", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.l implements Function1<c1.g, String> {

            public static final f f8038d = new f();

            f() {
                super(1);
            }

            public final String invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "obj");
                return gVar.getPath();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "it", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class g extends kotlin.jvm.internal.l implements Function1<c1.g, Object> {

            public static final g f8039d = new g();

            g() {
                super(1);
            }

            public final Object invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "it");
                return null;
            }
        }

        public a(Y0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.autoCloser = cVar;
        }

        @Override
        public c1.k J(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override
        public Cursor K0(c1.j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.autoCloser.j().K0(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override
        public boolean V0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(C0058d.f8036d)).booleanValue();
        }

        @Override
        public Cursor X0(c1.j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.autoCloser.j().X0(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        public final void b() {
            this.autoCloser.g(g.f8039d);
        }

        @Override
        public void close() throws IOException {
            this.autoCloser.d();
        }

        @Override
        public void d0() {
            Unit unit;
            c1.g delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.d0();
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override
        public boolean d1() {
            return ((Boolean) this.autoCloser.g(e.f8037d)).booleanValue();
        }

        @Override
        public void e0(String sql, Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.g(new c(sql, bindArgs));
        }

        @Override
        public void f0() {
            try {
                this.autoCloser.j().f0();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override
        public String getPath() {
            return (String) this.autoCloser.g(f.f8038d);
        }

        @Override
        public boolean isOpen() {
            c1.g delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override
        public void p() {
            try {
                this.autoCloser.j().p();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override
        public Cursor q0(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.autoCloser.j().q0(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override
        public List<Pair<String, String>> v() {
            return (List) this.autoCloser.g(C0057a.f8032d);
        }

        @Override
        public void v0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                c1.g delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.d(delegateDatabase);
                delegateDatabase.v0();
            } finally {
                this.autoCloser.e();
            }
        }

        @Override
        public void z(String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.g(new b(sql));
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R(\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130/j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"LY0/d$b;", "Lc1/k;", BuildConfig.FLAVOR, "sql", "LY0/c;", "autoCloser", "<init>", "(Ljava/lang/String;LY0/c;)V", "T", "Lkotlin/Function1;", "block", "j", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "supportSQLiteStatement", BuildConfig.FLAVOR, "f", "(Lc1/k;)V", BuildConfig.FLAVOR, "bindIndex", BuildConfig.FLAVOR, "value", "m", "(ILjava/lang/Object;)V", "close", "()V", "I", "()I", BuildConfig.FLAVOR, "t1", "()J", "index", "N0", "(I)V", "c0", "(IJ)V", BuildConfig.FLAVOR, "M", "(ID)V", "B", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "j0", "(I[B)V", "d", "Ljava/lang/String;", "e", "LY0/c;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "binds", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements c1.k {

        private final String sql;

        private final Y0.c autoCloser;

        private final ArrayList<Object> binds;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/k;", "obj", BuildConfig.FLAVOR, "a", "(Lc1/k;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<c1.k, Long> {

            public static final a f8043d = new a();

            a() {
                super(1);
            }

            public final Long invoke(c1.k kVar) {
                Intrinsics.checkNotNullParameter(kVar, "obj");
                return Long.valueOf(kVar.t1());
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lc1/g;", "db", "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C0059b<T> extends kotlin.jvm.internal.l implements Function1<c1.g, T> {

            final Function1<c1.k, T> f8045e;

            C0059b(Function1<? super c1.k, ? extends T> function1) {
                super(1);
                this.f8045e = function1;
            }

            public final T invoke(c1.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "db");
                c1.k kVarJ = gVar.J(b.this.sql);
                b.this.f(kVarJ);
                return (T) this.f8045e.invoke(kVarJ);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/k;", "obj", BuildConfig.FLAVOR, "a", "(Lc1/k;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.l implements Function1<c1.k, Integer> {

            public static final c f8046d = new c();

            c() {
                super(1);
            }

            public final Integer invoke(c1.k kVar) {
                Intrinsics.checkNotNullParameter(kVar, "obj");
                return Integer.valueOf(kVar.I());
            }
        }

        public b(String str, Y0.c cVar) {
            Intrinsics.checkNotNullParameter(str, "sql");
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.sql = str;
            this.autoCloser = cVar;
            this.binds = new ArrayList<>();
        }

        public final void f(c1.k supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.s();
                }
                Object obj = this.binds.get(i7);
                if (obj == null) {
                    supportSQLiteStatement.N0(i8);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.c0(i8, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.M(i8, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.B(i8, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.j0(i8, (byte[]) obj);
                }
                i7 = i8;
            }
        }

        private final <T> T j(Function1<? super c1.k, ? extends T> block) {
            return (T) this.autoCloser.g(new C0059b(block));
        }

        private final void m(int bindIndex, Object value) {
            int size;
            int i7 = bindIndex - 1;
            if (i7 >= this.binds.size() && (size = this.binds.size()) <= i7) {
                while (true) {
                    this.binds.add(null);
                    if (size == i7) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i7, value);
        }

        @Override
        public void B(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m(index, value);
        }

        @Override
        public int I() {
            return ((Number) j(c.f8046d)).intValue();
        }

        @Override
        public void M(int index, double value) {
            m(index, Double.valueOf(value));
        }

        @Override
        public void N0(int index) {
            m(index, null);
        }

        @Override
        public void c0(int index, long value) {
            m(index, Long.valueOf(value));
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public void j0(int index, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m(index, value);
        }

        @Override
        public long t1() {
            return ((Number) j(a.f8043d)).longValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u0016 \n*\u0014\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0018\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b.\u0010\u0015J\u0018\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b0\u00101J \u00102\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b3\u0010*J\u0010\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u000204H\u0096\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u000204H\u0096\u0001¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u000204H\u0096\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u000204H\u0096\u0001¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u000204H\u0096\u0001¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u000204H\u0096\u0001¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u000204H\u0096\u0001¢\u0006\u0004\bA\u00106J\u0018\u0010B\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u000204H\u0096\u0001¢\u0006\u0004\bC\u00106J \u0010E\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000204H\u0097\u0001¢\u0006\u0004\bJ\u00106J(\u0010K\u001a\n \n*\u0004\u0018\u00010#0#2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\bK\u0010LJ0\u0010O\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010M0M2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bQ\u0010FJ \u0010R\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u0010J%\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020NH\u0017¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020#H\u0017¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"LY0/d$c;", "Landroid/database/Cursor;", "delegate", "LY0/c;", "autoCloser", "<init>", "(Landroid/database/Cursor;LY0/c;)V", BuildConfig.FLAVOR, "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", BuildConfig.FLAVOR, "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "()V", BuildConfig.FLAVOR, "getBlob", "(I)[B", "getColumnCount", "()I", BuildConfig.FLAVOR, "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "getColumnNames", "()[Ljava/lang/String;", "getCount", BuildConfig.FLAVOR, "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", BuildConfig.FLAVOR, "getFloat", "(I)F", "getInt", "(I)I", BuildConfig.FLAVOR, "getLong", "(I)J", "getPosition", BuildConfig.FLAVOR, "getShort", "(I)S", "getString", "getType", BuildConfig.FLAVOR, "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", BuildConfig.FLAVOR, "uris", "setNotificationUris", "(Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUri", "()Landroid/net/Uri;", "getNotificationUris", "()Ljava/util/List;", "extras", "setExtras", "(Landroid/os/Bundle;)V", "d", "Landroid/database/Cursor;", "e", "LY0/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements Cursor {

        private final Cursor delegate;

        private final Y0.c autoCloser;

        public c(Cursor cursor, Y0.c cVar) {
            Intrinsics.checkNotNullParameter(cursor, QXojhh.ZRDtF);
            Intrinsics.checkNotNullParameter(cVar, "autoCloser");
            this.delegate = cursor;
            this.autoCloser = cVar;
        }

        @Override
        public void close() {
            this.delegate.close();
            this.autoCloser.e();
        }

        @Override
        public void copyStringToBuffer(int p02, CharArrayBuffer p1) {
            this.delegate.copyStringToBuffer(p02, p1);
        }

        @Override
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override
        public byte[] getBlob(int p02) {
            return this.delegate.getBlob(p02);
        }

        @Override
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override
        public int getColumnIndex(String p02) {
            return this.delegate.getColumnIndex(p02);
        }

        @Override
        public int getColumnIndexOrThrow(String p02) {
            return this.delegate.getColumnIndexOrThrow(p02);
        }

        @Override
        public String getColumnName(int p02) {
            return this.delegate.getColumnName(p02);
        }

        @Override
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override
        public double getDouble(int p02) {
            return this.delegate.getDouble(p02);
        }

        @Override
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override
        public float getFloat(int p02) {
            return this.delegate.getFloat(p02);
        }

        @Override
        public int getInt(int p02) {
            return this.delegate.getInt(p02);
        }

        @Override
        public long getLong(int p02) {
            return this.delegate.getLong(p02);
        }

        @Override
        public Uri getNotificationUri() {
            return c1.c.a(this.delegate);
        }

        @Override
        public List<Uri> getNotificationUris() {
            return c1.f.a(this.delegate);
        }

        @Override
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override
        public short getShort(int p02) {
            return this.delegate.getShort(p02);
        }

        @Override
        public String getString(int p02) {
            return this.delegate.getString(p02);
        }

        @Override
        public int getType(int p02) {
            return this.delegate.getType(p02);
        }

        @Override
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override
        public boolean isNull(int p02) {
            return this.delegate.isNull(p02);
        }

        @Override
        public boolean move(int p02) {
            return this.delegate.move(p02);
        }

        @Override
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override
        public boolean moveToPosition(int p02) {
            return this.delegate.moveToPosition(p02);
        }

        @Override
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override
        public void registerContentObserver(ContentObserver p02) {
            this.delegate.registerContentObserver(p02);
        }

        @Override
        public void registerDataSetObserver(DataSetObserver p02) {
            this.delegate.registerDataSetObserver(p02);
        }

        @Override
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override
        public Bundle respond(Bundle p02) {
            return this.delegate.respond(p02);
        }

        @Override
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            c1.e.a(this.delegate, extras);
        }

        @Override
        public void setNotificationUri(ContentResolver p02, Uri p1) {
            this.delegate.setNotificationUri(p02, p1);
        }

        @Override
        public void setNotificationUris(ContentResolver cr, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            c1.f.b(this.delegate, cr, uris);
        }

        @Override
        public void unregisterContentObserver(ContentObserver p02) {
            this.delegate.unregisterContentObserver(p02);
        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver p02) {
            this.delegate.unregisterDataSetObserver(p02);
        }
    }

    public d(c1.h hVar, Y0.c cVar) {
        Intrinsics.checkNotNullParameter(hVar, "delegate");
        Intrinsics.checkNotNullParameter(cVar, "autoCloser");
        this.delegate = hVar;
        this.autoCloser = cVar;
        cVar.k(getDelegate());
        this.autoClosingDb = new a(cVar);
    }

    @Override
    public c1.h getDelegate() {
        return this.delegate;
    }

    @Override
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override
    public String getName() {
        return this.delegate.getName();
    }

    @Override
    public c1.g o0() {
        this.autoClosingDb.b();
        return this.autoClosingDb;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
