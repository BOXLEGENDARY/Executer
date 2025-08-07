package com.roblox.audio;

import androidx.appcompat.app.d;
import java.util.Set;

public abstract class a {

    private static a f19370a;

    public enum EnumC0174a {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    public interface b {
        void a(EnumC0174a enumC0174a, Set<EnumC0174a> set);
    }

    public static a b() {
        return f19370a;
    }

    public static boolean d() {
        return f19370a != null;
    }

    public void a() {
        a aVar = f19370a;
        if (this == aVar) {
            aVar.e();
            f19370a = null;
        }
    }

    public abstract EnumC0174a c();

    public abstract void e();

    public abstract void f(d dVar);

    public void g(boolean z7) {
    }

    protected void h(a aVar) {
        f19370a = aVar;
    }

    public abstract void i(b bVar);

    public abstract void j();
}
