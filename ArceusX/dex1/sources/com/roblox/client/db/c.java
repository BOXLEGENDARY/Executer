package com.roblox.client.db;

import a6.C1585a;
import android.database.SQLException;
import c1.g;

final class c extends Z0.b {

    private final Z0.a f19947c;

    public c() {
        super(3, 4);
        this.f19947c = new C1585a();
    }

    @Override
    public void a(g gVar) throws SQLException {
        gVar.z("ALTER TABLE `analytic_event` ADD COLUMN `event_name` TEXT DEFAULT NULL");
        gVar.z("ALTER TABLE `analytic_event` ADD COLUMN `event_context` TEXT DEFAULT NULL");
        gVar.z("ALTER TABLE `analytic_event` ADD COLUMN `serialized_params` TEXT DEFAULT NULL");
        this.f19947c.a(gVar);
    }
}
