package Da;

import com.roblox.client.personasdk.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LDa/c;", "", "", "operationData", "", "", "mappingOperation", "operationDefault", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class OccurrenceCheckInputData {

    @NotNull
    private final List<Object> operationData;

    @NotNull
    private final Map<String, Object> mappingOperation;

    private final Object operationDefault;

    public OccurrenceCheckInputData(@NotNull List<? extends Object> list, @NotNull Map<String, ? extends Object> map, Object obj) {
        Intrinsics.checkNotNullParameter(list, "operationData");
        Intrinsics.checkNotNullParameter(map, "mappingOperation");
        this.operationData = list;
        this.mappingOperation = map;
        this.operationDefault = obj;
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.mappingOperation;
    }

    @NotNull
    public final List<Object> b() {
        return this.operationData;
    }

    public final Object getOperationDefault() {
        return this.operationDefault;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OccurrenceCheckInputData)) {
            return false;
        }
        OccurrenceCheckInputData occurrenceCheckInputData = (OccurrenceCheckInputData) other;
        return Intrinsics.b(this.operationData, occurrenceCheckInputData.operationData) && Intrinsics.b(this.mappingOperation, occurrenceCheckInputData.mappingOperation) && Intrinsics.b(this.operationDefault, occurrenceCheckInputData.operationDefault);
    }

    public int hashCode() {
        int iHashCode = ((this.operationData.hashCode() * 31) + this.mappingOperation.hashCode()) * 31;
        Object obj = this.operationDefault;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "OccurrenceCheckInputData(operationData=" + this.operationData + ", mappingOperation=" + this.mappingOperation + ", operationDefault=" + this.operationDefault + ")";
    }
}
