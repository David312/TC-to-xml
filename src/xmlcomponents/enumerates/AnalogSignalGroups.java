package xmlcomponents.enumerates;

import xmlcomponents.text.AnalogSignalGroup;

public enum AnalogSignalGroups {
    BATTERY_TEMPERATURES("BATTERYTEMPERATURES"),
    BATTERY_VOLTAGES("BATTERYVOLTAGES"),
    PSU_TEMPERATURES("PSUTEMPERATURES"),
    PSU_CURRENTS("PSUCURRENTS"),
    PDU_CURRENTS("PDUCURRENTS"),
    SOLAR_PANEL_TEMPERATURES("SOLARPANELTEMPERATURES"),
    SOLAR_PANEL_CURRENTS("SOLARPANELCURRENTS"),
    OBC_TEMPERATURES("OBCTEMPERATURES"),
    MGM_TEMPERATURES("MGMTEMPERATURES"),
    MGM1_OUTPUT("MGM1OUTPUT"),
    MGM2_OUTPUT("MGM2OUTPUT"),
    MGM3_OUTPUT("MGM3OUTPUT"),
    MGT_TEMPERATURES("MGTTEMPERATURES"),
    EBOX_TEMPERATURES("EBOXTEMPERATURES"),
    SOLAR_SENSOR_OUTPUT("SOLARSENSOROUTPUT"),
    RW_TEMPERATURES("RWTEMPERATURES"),
    MTS_TEMPERATURES("MTS_TEMPERATURES");

    private final String name;

    private AnalogSignalGroups(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public static AnalogSignalGroups toEnum(String s){
        for(AnalogSignalGroups g: AnalogSignalGroups.values()){
            if(g.toString().equals(s))
                return g;
        }
        throw new IllegalArgumentException();
    }
}
