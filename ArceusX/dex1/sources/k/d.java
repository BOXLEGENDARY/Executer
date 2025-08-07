package K;

import C.R0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

public class d {

    private final IncorrectJpegMetadataQuirk f1731a;

    public d(R0 r02) {
        this.f1731a = (IncorrectJpegMetadataQuirk) r02.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(n nVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f1731a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.i(nVar);
        }
        ByteBuffer byteBufferC = nVar.s()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return bArr;
    }
}
