package M;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class a0 {
    public static void a(Collection<Integer> collection, int i7) {
        x0.g.b(collection.contains(Integer.valueOf(i7)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", b(i7), c(collection)));
    }

    public static String b(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i7 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    private static String c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next().intValue()));
        }
        return "[" + String.join(", ", arrayList) + "]";
    }

    public static int d(int i7) {
        int i8 = 0;
        while (i7 != 0) {
            i8 += i7 & 1;
            i7 >>= 1;
        }
        return i8;
    }

    public static boolean e(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
