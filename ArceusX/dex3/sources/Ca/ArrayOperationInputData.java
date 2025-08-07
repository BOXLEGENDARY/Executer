package Ca;

import com.roblox.client.personasdk.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LCa/b;", "", "", "operationData", "", "", "mappingOperation", "operationDefault", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class ArrayOperationInputData {

    private final List<Object> operationData;

    private final Map<String, Object> mappingOperation;

    private final Object operationDefault;

    public ArrayOperationInputData(List<? extends Object> list, Map<String, ? extends Object> map, Object obj) {
        this.operationData = list;
        this.mappingOperation = map;
        this.operationDefault = obj;
    }

    public final Map<String, Object> a() {
        return this.mappingOperation;
    }

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
        if (!(other instanceof ArrayOperationInputData)) {
            return false;
        }
        ArrayOperationInputData arrayOperationInputData = (ArrayOperationInputData) other;
        return Intrinsics.b(this.operationData, arrayOperationInputData.operationData) && Intrinsics.b(this.mappingOperation, arrayOperationInputData.mappingOperation) && Intrinsics.b(this.operationDefault, arrayOperationInputData.operationDefault);
    }

    public int hashCode() {
        List<Object> list = this.operationData;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Object> map = this.mappingOperation;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Object obj = this.operationDefault;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArrayOperationInputData(operationData=" + this.operationData + ", mappingOperation=" + this.mappingOperation + ", operationDefault=" + this.operationDefault + ")";
    }
}
