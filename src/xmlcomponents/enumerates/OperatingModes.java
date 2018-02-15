package xmlcomponents.enumerates;

import xmlcomponents.text.OperatingMode;

public enum OperatingModes {
    OFF("OFF"),
    TEST("TEST"),
    AWAIT_LAUNCH("AWAIT_LAUNCH"),
    LAUNCH("LAUNCH"),
    LATENCY("LATENCY"),
    INITIALIZATION("INITIALIZATION"),
    COMMISSIONING("COMMISSIONING"),
    SAFE("SAFE"),
    BEACON("BEACON"),
    NOMINAL("NOMINAL"),
    EXPERIMENT("EXPERIMENT");

    private final String name;
    private OperatingModes(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
