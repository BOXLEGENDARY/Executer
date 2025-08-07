package J6;

import Z.tNT.PexNRiLSd;

public class b extends a {

    private X5.c f1725d;

    public b(X5.c cVar) {
        this.f1725d = cVar;
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{"channel_param", "default_channel_param", "base_url_param", "default_base_url_param", PexNRiLSd.LMjlQ, "user_agent_param", "default_user_agent_param", "dev_rpc_ip_port_override"};
    }

    @Override
    public String getString(int i7) {
        if (i7 == getColumnIndex("channel_param")) {
            return this.f1725d.f();
        }
        if (i7 == getColumnIndex("default_channel_param")) {
            return this.f1725d.c();
        }
        if (i7 == getColumnIndex("base_url_param")) {
            return this.f1725d.a();
        }
        if (i7 == getColumnIndex("default_base_url_param")) {
            return this.f1725d.b();
        }
        if (i7 == getColumnIndex("settings_param")) {
            return this.f1725d.h();
        }
        if (i7 == getColumnIndex("user_agent_param")) {
            return this.f1725d.i();
        }
        if (i7 == getColumnIndex("default_user_agent_param")) {
            return this.f1725d.d();
        }
        if (i7 == getColumnIndex("dev_rpc_ip_port_override")) {
            return this.f1725d.e();
        }
        return null;
    }
}
