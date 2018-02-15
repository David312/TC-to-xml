package xmlcomponents;

public enum StatusSignals {
    DAS_P3V("DAS_P3V"),
    DAS_P5V("DAS_P5V"),
    DAS_P15V("DAS_P15V"),
    DAS_N15V("DAS_N15V"),
    PDU_P3V3("PDU_P3V3"),
    PDU_P5V("PDU_P5V"),
    MGM1_P5V("MGM1_P5V"),
    MGM2_P5V("MGM2_P5V"),
    MGM3_P15V("MGM3_P15V"),
    MGM3_N15V("MGM1_N15V"),
    MGT_X_VBUS("MGT_X_VBUS"),
    TEMP_A_P5V("TEMP_A_P5V"),
    TEMP_B_P5V("TEMP_B_P5V"),
    MODEM_VBUS("MODEM_VBUS"),
    RW_P5V("RW_P5V"),
    RW_VBUS("RW_VBUS"),
    MTS_VBUS("MTS_VBUS"),
    BOOM1_VBUS("BOOM1_VBUS"),
    BOOM2_VBUS("BOOM2_VBUS"),
    TTC_STAT("TTC_STAT"),
    SMA_SB01("SMA_SB01"),
    SMA_SB02("SMA_SB02");

    private final String name;

    private StatusSignals(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
