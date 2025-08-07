package G1;

import ha.C0361l;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LG1/a;", "LG1/b;", "Ljava/io/File;", "", "addLastModifiedToFileCacheKey", "<init>", "(Z)V", "data", "LJ1/l;", "options", "", "b", "(Ljava/io/File;LJ1/l;)Ljava/lang/String;", "a", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b<File> {

    private final boolean addLastModifiedToFileCacheKey;

    public a(boolean z) {
        this.addLastModifiedToFileCacheKey = z;
    }

    @Override
    @NotNull
    public String a(@NotNull File data, @NotNull C0361l options) {
        if (!this.addLastModifiedToFileCacheKey) {
            return data.getPath();
        }
        return data.getPath() + ':' + data.lastModified();
    }
}
