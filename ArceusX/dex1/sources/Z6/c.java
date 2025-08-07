package Z6;

import com.roblox.engine.jni.NativeSettingsInterface;
import h7.n;

public class c {
    public static boolean a() {
        return b() || n.i();
    }

    public static boolean b() {
        return NativeSettingsInterface.nativeIsLuaLoginEnabled();
    }
}
