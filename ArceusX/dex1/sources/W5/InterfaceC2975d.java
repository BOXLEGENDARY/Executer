package w5;

import android.view.AbstractC1694h;
import android.view.InterfaceC1711y;
import com.google.android.gms.tasks.Task;
import java.util.List;
import l3.InterfaceC2534i;
import u5.C2938a;
import y5.InterfaceC3029a;

public interface InterfaceC2975d extends InterfaceC3029a<List<C2972a>>, InterfaceC2534i {
    @Override
    @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
    void close();

    Task<List<C2972a>> d(C2938a c2938a);
}
