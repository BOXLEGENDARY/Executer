package bb;

import X9.c;
import ca.a;
import com.roblox.client.personasdk.R;
import java.io.File;
import java.io.FileInputStream;
import ka.K;
import ka.M;
import ka.i;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ls8/c;", "Lokhttp3/RequestBody;", "Ljava/io/File;", "file", "Lokhttp3/MediaType;", "mediaType", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;)V", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/f;", "sink", "", "writeTo", "(Lokio/f;)V", "Lka/K;", "", "a", "()Lka/K;", "Ljava/io/File;", "b", "Lokhttp3/MediaType;", "Lka/y;", "c", "Lka/y;", "flow", "d", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0760c extends RequestBody {

    @NotNull
    private final File file;

    private final MediaType mediaType;

    @NotNull
    private final y<Integer> flow;

    public C0760c(@NotNull File file, MediaType mediaType) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.mediaType = mediaType;
        this.flow = M.a(0);
    }

    @NotNull
    public final K<Integer> a() {
        return i.a(this.flow);
    }

    public long contentLength() {
        return this.file.length();
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public void writeTo(@NotNull f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int i = fileInputStream.read(bArr);
            long j = 0;
            int i2 = 0;
            while (i != -1) {
                j += i;
                sink.u0(bArr, 0, i);
                i = fileInputStream.read(bArr);
                int iB = a.b((j / length) * 100.0f);
                if (iB - i2 > 1 || iB >= 100) {
                    this.flow.f(Integer.valueOf(iB));
                    i2 = iB;
                }
            }
            Unit unit = Unit.a;
            c.a(fileInputStream, (Throwable) null);
        } finally {
        }
    }
}
