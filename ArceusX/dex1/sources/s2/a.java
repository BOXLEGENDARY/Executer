package s2;

import java.io.IOException;

public final class a implements V4.a {

    public static final V4.a f23572a = new a();

    private static final class C0222a implements U4.d<v2.a> {

        static final C0222a f23573a = new C0222a();

        private static final U4.c f23574b = U4.c.a("window").b(X4.a.b().c(1).a()).a();

        private static final U4.c f23575c = U4.c.a("logSourceMetrics").b(X4.a.b().c(2).a()).a();

        private static final U4.c f23576d = U4.c.a("globalMetrics").b(X4.a.b().c(3).a()).a();

        private static final U4.c f23577e = U4.c.a("appNamespace").b(X4.a.b().c(4).a()).a();

        private C0222a() {
        }

        @Override
        public void a(v2.a aVar, U4.e eVar) throws IOException {
            eVar.b(f23574b, aVar.d());
            eVar.b(f23575c, aVar.c());
            eVar.b(f23576d, aVar.b());
            eVar.b(f23577e, aVar.a());
        }
    }

    private static final class b implements U4.d<v2.b> {

        static final b f23578a = new b();

        private static final U4.c f23579b = U4.c.a("storageMetrics").b(X4.a.b().c(1).a()).a();

        private b() {
        }

        @Override
        public void a(v2.b bVar, U4.e eVar) throws IOException {
            eVar.b(f23579b, bVar.a());
        }
    }

    private static final class c implements U4.d<v2.c> {

        static final c f23580a = new c();

        private static final U4.c f23581b = U4.c.a("eventsDroppedCount").b(X4.a.b().c(1).a()).a();

        private static final U4.c f23582c = U4.c.a("reason").b(X4.a.b().c(3).a()).a();

        private c() {
        }

        @Override
        public void a(v2.c cVar, U4.e eVar) throws IOException {
            eVar.a(f23581b, cVar.a());
            eVar.b(f23582c, cVar.b());
        }
    }

    private static final class d implements U4.d<v2.d> {

        static final d f23583a = new d();

        private static final U4.c f23584b = U4.c.a("logSource").b(X4.a.b().c(1).a()).a();

        private static final U4.c f23585c = U4.c.a("logEventDropped").b(X4.a.b().c(2).a()).a();

        private d() {
        }

        @Override
        public void a(v2.d dVar, U4.e eVar) throws IOException {
            eVar.b(f23584b, dVar.b());
            eVar.b(f23585c, dVar.a());
        }
    }

    private static final class e implements U4.d<l> {

        static final e f23586a = new e();

        private static final U4.c f23587b = U4.c.d("clientMetrics");

        private e() {
        }

        @Override
        public void a(l lVar, U4.e eVar) throws IOException {
            eVar.b(f23587b, lVar.b());
        }
    }

    private static final class f implements U4.d<v2.e> {

        static final f f23588a = new f();

        private static final U4.c f23589b = U4.c.a("currentCacheSizeBytes").b(X4.a.b().c(1).a()).a();

        private static final U4.c f23590c = U4.c.a("maxCacheSizeBytes").b(X4.a.b().c(2).a()).a();

        private f() {
        }

        @Override
        public void a(v2.e eVar, U4.e eVar2) throws IOException {
            eVar2.a(f23589b, eVar.a());
            eVar2.a(f23590c, eVar.b());
        }
    }

    private static final class g implements U4.d<v2.f> {

        static final g f23591a = new g();

        private static final U4.c f23592b = U4.c.a("startMs").b(X4.a.b().c(1).a()).a();

        private static final U4.c f23593c = U4.c.a("endMs").b(X4.a.b().c(2).a()).a();

        private g() {
        }

        @Override
        public void a(v2.f fVar, U4.e eVar) throws IOException {
            eVar.a(f23592b, fVar.b());
            eVar.a(f23593c, fVar.a());
        }
    }

    @Override
    public void a(V4.b<?> bVar) {
        bVar.a(l.class, e.f23586a);
        bVar.a(v2.a.class, C0222a.f23573a);
        bVar.a(v2.f.class, g.f23591a);
        bVar.a(v2.d.class, d.f23583a);
        bVar.a(v2.c.class, c.f23580a);
        bVar.a(v2.b.class, b.f23578a);
        bVar.a(v2.e.class, f.f23588a);
    }
}
