package I;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

final class b {
    static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static ImageWriter c(Surface surface, int i7) {
        return ImageWriter.newInstance(surface, i7);
    }

    static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
