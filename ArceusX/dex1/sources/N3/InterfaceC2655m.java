package n3;

import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import l3.InterfaceC2533h;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
public interface InterfaceC2655m extends InterfaceC2533h<C2656n> {
    @ResultIgnorabilityUnspecified
    Task<Void> c(TelemetryData telemetryData);
}
