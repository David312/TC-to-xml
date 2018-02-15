package gui.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public enum Telecommands {
    OPENLINK("OpenLink"),
    SET_LOST_COMM_TIMER("Set Lost Comm Timer"),
    CHANGE_MODE("Change Mode"),
    CHANGE_SAMPLING_PERIOD("Change Sampling Period"),
    ENABLE_DIGITAL_SIGNAL("Enable Digital Signal"),
    DISABLE_DIGITAL_SIGNAL("Disable Digital Signal"),
    CHANGE_ADCS_CALIBRATION_PARAMETERS("Change ADCS Calibration Parameters"),
    CHANGE_ADCS_CONTROLLER_PARAMETERS("Change ADCS Controller Parameters"),
    START_RW_EXPERIMENT("Start RW Experiment"),
    START_MTS_EXPERIMENT("Start MTS Experiment");

    private final StringProperty name;

    private Telecommands(String name){
        this.name = new SimpleStringProperty(name);
    }

    @Override
    public String toString(){
        return this.name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }
}
