package com.roblox.client.db;

import Y0.s;
import Y0.u;
import a1.e;
import android.database.SQLException;
import b6.InterfaceC1742a;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import c1.g;
import c1.h;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w7.Jld.EZYiRMRTxKdo;

public final class RobloxDatabase_Impl extends RobloxDatabase {

    private volatile InterfaceC1742a f19944p;

    private volatile b6.d f19945q;

    class a extends u.b {
        a(int i7) {
            super(i7);
        }

        @Override
        public void a(g gVar) throws SQLException {
            gVar.z("CREATE TABLE IF NOT EXISTS `analytic_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serialized_event` TEXT NOT NULL, `event_name` TEXT, `event_context` TEXT, `serialized_params` TEXT, `retry_attempt_count` INTEGER)");
            gVar.z("CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))");
            gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '88309002ec78233a9a3477c82fbe69af')");
        }

        @Override
        public void b(g gVar) throws SQLException {
            gVar.z("DROP TABLE IF EXISTS `analytic_event`");
            gVar.z("DROP TABLE IF EXISTS `notification_id`");
            List list = ((s) RobloxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(gVar);
                }
            }
        }

        @Override
        public void c(g gVar) {
            List list = ((s) RobloxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(gVar);
                }
            }
        }

        @Override
        public void d(g gVar) {
            ((s) RobloxDatabase_Impl.this).mDatabase = gVar;
            RobloxDatabase_Impl.this.w(gVar);
            List list = ((s) RobloxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).c(gVar);
                }
            }
        }

        @Override
        public void e(g gVar) {
        }

        @Override
        public void f(g gVar) throws SQLException {
            a1.b.b(gVar);
        }

        @Override
        public u.c g(g gVar) {
            HashMap map = new HashMap(6);
            map.put("id", new e.a("id", "INTEGER", true, 1, null, 1));
            map.put("serialized_event", new e.a("serialized_event", "TEXT", true, 0, null, 1));
            map.put("event_name", new e.a("event_name", "TEXT", false, 0, null, 1));
            map.put("event_context", new e.a(vxbbqXNtzfMxs.SsC, "TEXT", false, 0, null, 1));
            map.put("serialized_params", new e.a("serialized_params", "TEXT", false, 0, null, 1));
            map.put("retry_attempt_count", new e.a(YGBtcyQ.wjTok, "INTEGER", false, 0, null, 1));
            e eVar = new e("analytic_event", map, new HashSet(0), new HashSet(0));
            e eVarA = e.a(gVar, "analytic_event");
            if (!eVar.equals(eVarA)) {
                return new u.c(false, "analytic_event(com.roblox.client.db.entities.AnalyticEvent).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(2);
            map2.put("notification_id", new e.a("notification_id", "TEXT", true, 1, null, 1));
            map2.put(EZYiRMRTxKdo.iDboJ, new e.a("last_received_timestamp_ms", "INTEGER", true, 0, null, 1));
            e eVar2 = new e("notification_id", map2, new HashSet(0), new HashSet(0));
            e eVarA2 = e.a(gVar, "notification_id");
            if (eVar2.equals(eVarA2)) {
                return new u.c(true, null);
            }
            return new u.c(false, "notification_id(com.roblox.client.db.entities.NotificationId).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
    }

    @Override
    public InterfaceC1742a D() {
        InterfaceC1742a interfaceC1742a;
        if (this.f19944p != null) {
            return this.f19944p;
        }
        synchronized (this) {
            try {
                if (this.f19944p == null) {
                    this.f19944p = new b6.b(this);
                }
                interfaceC1742a = this.f19944p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1742a;
    }

    @Override
    public b6.d E() {
        b6.d dVar;
        if (this.f19945q != null) {
            return this.f19945q;
        }
        synchronized (this) {
            try {
                if (this.f19945q == null) {
                    this.f19945q = new b6.e(this);
                }
                dVar = this.f19945q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "analytic_event", "notification_id");
    }

    @Override
    protected h h(Y0.h hVar) {
        return hVar.sqliteOpenHelperFactory.a(h.b.a(hVar.context).c(hVar.name).b(new u(hVar, new a(5), "88309002ec78233a9a3477c82fbe69af", "9db1597f250c1e8481d7591a61408d45")).a());
    }

    @Override
    public List<Z0.b> j(Map<Class<? extends Z0.a>, Z0.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.roblox.client.db.a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        return arrayList;
    }

    @Override
    public Set<Class<? extends Z0.a>> p() {
        return new HashSet();
    }

    @Override
    protected Map<Class<?>, List<Class<?>>> q() {
        HashMap map = new HashMap();
        map.put(InterfaceC1742a.class, b6.b.n());
        map.put(b6.d.class, b6.e.h());
        return map;
    }
}
