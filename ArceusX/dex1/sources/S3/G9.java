package S3;

import android.os.IBinder;
import android.os.IInterface;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;

public abstract class G9 extends B implements H9 {
    public static H9 E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(wtzgsqRsIZB.TbXPAFg);
        return iInterfaceQueryLocalInterface instanceof H9 ? (H9) iInterfaceQueryLocalInterface : new F9(iBinder);
    }
}
