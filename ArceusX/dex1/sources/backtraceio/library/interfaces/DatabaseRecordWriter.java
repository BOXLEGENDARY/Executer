package backtraceio.library.interfaces;

import java.io.IOException;

public interface DatabaseRecordWriter {
    String write(Object obj, String str) throws IOException;

    String write(byte[] bArr, String str) throws IOException;
}
