package xmlcomponents;

public class ElementsNames {
    public static final String _ELEMENT = "";
    // root element
    public static final String COMMANDS_ELEMENT = "commands";

    // Parent of all TCs
    public static final String TC_ELEMENT = "tc";

    // Distinct TC types
    public static final String OPENLINK_ELEMENT = "openlink";
    public static final String SET_LOST_COMM_TIMER_ELEMENT = "setlostcommtimer";
    public static final String CHANGE_MODE_ELEMENT = "changemode";
    public static final String CHANGE_SAMPLING_PERIOD_ELEMENT = "changesamplingperiod";
    public static final String ENABLE_DIGITAL_SIGNAL_ELEMENT = "enable_digital_signal";
    public static final String DISABLE_DIGITAL_SIGNAL_ELEMENT = "disable_digital_signal";
    public static final String CHANGE_ADCS_CALIBRATION_PARAMETERS_ELEMENT = "change_adcs_calibration_parameters";
    public static final String CHANGE_ADCS_CONTROLLER_PARAMETERS_ELEMENT = "change_adcs_controller_parameters";
    public static final String START_RW_EXPERIMENT_ELEMENT = "start_rw_experiment";

    // Openlink children
    public static final String VISIBILITY_DURATION_ELEMENT = "visibility_duration";

    // SetLostCommTimer children
    public static final String NEW_LOST_TIMER_ELEMENT = "new_lost_timer";

    // ChangeMode children
    public static final String NEW_MODE_ELEMENT = "new_mode";

    // ChangeSamplingPeriod children
    public static final String SIGNALS_TO_CHANGE_PERIOD_ELEMENT = "signals_to_change_period";
    public static final String NEW_PERIOD_ELEMENT = "new_period";

    // Disable/EnableDigitalSignal children
    public static final String STATUS_SIGNAL_ELEMENT = "status_signal";

    // ChangeADCSCalibrationParameters children
    public static final String CALIBRATION_PARAMETERS_ELEMENT = "calibration_parameters";

    // ChangeADCSControllerParameters children
    public static final String CONTROLLER_PARAMETERS_ELEMENT = "controller_parameters";

    // StartRWExperiment children
    public static final String RW_START_TIME_ELEMENT = "start_time";
    public static final String RW_EXPERIMENT_DURATION_ELEMENT = "experiment_duration";
    public static final String RW_CURRENT_ELEMENT = "current";
    public static final String RW_SPEED_ELEMENT = "speed";
    public static final String RW_TORQUE_ELEMENT = "torque";

    // StartMTSExperiment children
    public static final String MTS_START_TIME_ELEMENT = "start_time";
    public static final String MTS_EXPERIMENT_DURATION_ELEMENT = "experiment_duration";
    public static final String MTS_EXPERIMENT_MTS_PARAMETERS_ELEMENT = "experiment_mts_parameters";


    private ElementsNames(){}
}
