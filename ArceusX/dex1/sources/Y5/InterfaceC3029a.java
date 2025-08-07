package y5;

import android.graphics.Matrix;
import android.media.Image;
import android.view.InterfaceC1700n;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;

public interface InterfaceC3029a<DetectionResultT> extends Closeable, InterfaceC1700n {
    Task<DetectionResultT> E(Image image, int i7, Matrix matrix);

    int H();
}
