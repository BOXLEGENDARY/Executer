package s;

public class B1 {
    public static int a(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i7 + " can not be recognized.");
    }
}
