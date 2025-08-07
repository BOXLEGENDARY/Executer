package com.roblox.client.db;

import android.database.SQLException;
import c1.g;

final class a extends Z0.b {
    public a() {
        super(1, 2);
    }

    @Override
    public void a(g gVar) throws SQLException {
        gVar.z("CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))");
    }
}
