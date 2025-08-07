package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class ThreadInformation {

    @SerializedName("fault")
    private final Boolean fault;

    @SerializedName("name")
    public String name;

    @SerializedName("stack")
    private final ArrayList<BacktraceStackFrame> stack;

    private ThreadInformation(String str, Boolean bool, ArrayList<BacktraceStackFrame> arrayList) {
        this.stack = arrayList == null ? new ArrayList<>() : arrayList;
        this.name = str;
        this.fault = bool;
    }

    ThreadInformation(Thread thread, ArrayList<BacktraceStackFrame> arrayList, Boolean bool) {
        this(thread.getName().toLowerCase(), bool, arrayList);
    }
}
