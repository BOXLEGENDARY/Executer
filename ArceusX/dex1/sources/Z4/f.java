package Z4;

public interface f {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        private final int f8219d;

        a(int i7) {
            this.f8219d = i7;
        }

        public int c() {
            return this.f8219d;
        }
    }

    a a(String str);
}
