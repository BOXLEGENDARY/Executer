package L;

import android.util.Size;
import java.util.Map;
import java.util.TreeMap;

public final class d {

    public static final Size f1937a = new Size(0, 0);

    public static final Size f1938b = new Size(320, 240);

    public static final Size f1939c = new Size(640, 480);

    public static final Size f1940d = new Size(720, 480);

    public static final Size f1941e = new Size(1280, 720);

    public static final Size f1942f = new Size(1920, 1080);

    public static final Size f1943g = new Size(1920, 1440);

    public static <T> T a(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static int b(int i7, int i8) {
        return i7 * i8;
    }

    public static int c(Size size) {
        return b(size.getWidth(), size.getHeight());
    }

    public static boolean d(Size size, Size size2) {
        return c(size) < c(size2);
    }
}
