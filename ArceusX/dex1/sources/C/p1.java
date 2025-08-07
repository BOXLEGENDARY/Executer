package C;

import android.content.Context;
import z.C3039b0;

public interface p1 {

    public static final p1 f680a = new a();

    class a implements p1 {
        a() {
        }

        @Override
        public X a(b bVar, int i7) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        p1 a(Context context) throws C3039b0;
    }

    X a(b bVar, int i7);
}
