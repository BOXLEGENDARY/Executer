package backtraceio.library.enums;

import w7.Jld.EZYiRMRTxKdo;

public enum BatteryState {
    CHARGING("Charging"),
    UNKNOWN("Unknown"),
    FULL(EZYiRMRTxKdo.cySis),
    UNPLUGGED("Unplugged");

    private final String text;

    BatteryState(String str) {
        this.text = str;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
