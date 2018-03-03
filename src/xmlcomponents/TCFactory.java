package xmlcomponents;

import xmlcomponents.enumerates.AnalogSignalGroups;
import xmlcomponents.enumerates.OperatingModes;
import xmlcomponents.enumerates.RWTestTypes;
import xmlcomponents.enumerates.StatusSignals;
import xmlcomponents.tc.adcs.ChangeADCSCalibrationParameters;
import xmlcomponents.tc.adcs.ChangeADCSControllerParameters;
import xmlcomponents.tc.adcs.calibrationparameters.CalibrationParameters;
import xmlcomponents.tc.changemode.ChangeMode;
import xmlcomponents.tc.changesamplingperiod.ChangeSamplingPeriod;
import xmlcomponents.tc.digitalsignal.DisableDigitalSignal;
import xmlcomponents.tc.digitalsignal.EnableDigitalSignal;
import xmlcomponents.tc.openlink.OpenLink;
import xmlcomponents.tc.openlink.VisibilityDuration;
import xmlcomponents.tc.setlostcommtimer.SetLostCommTimer;
import xmlcomponents.tc.startmtsexperiment.StartMTSExperiment;
import xmlcomponents.tc.startrwexperiment.StartRWExperiment;


import java.util.List;

public class TCFactory {
    public static String TRUE_VALUE = CalibrationParameters.TRUE_VALUE;
    public static String FALSE_VALUE = CalibrationParameters.FALSE_VALUE;

    private TCFactory(){}

    public static XMLElement newOpenLink(String time, String duration){
        return new TCElement(new OpenLink(time, duration));
    }

    public static XMLElement newSetLostCommTimer(String time, String newLostTimer){
        return new TCElement(new SetLostCommTimer(time, newLostTimer));
    }

    public static XMLElement newChangeMode(String time, OperatingModes mode){
        return new TCElement(new ChangeMode(time, mode));
    }

    public static XMLElement newChangeSamplingPeriod(String time,
                                                     AnalogSignalGroups g,
                                                     String newPeriod) {
        return new TCElement(new ChangeSamplingPeriod(time, g, newPeriod));
    }

    public static XMLElement newEnableDigitalSignal(String time, StatusSignals s){
        return new TCElement(new EnableDigitalSignal(time, s));
    }

    public static XMLElement newDisableDigitalSignal(String time, StatusSignals s){
        return new TCElement(new DisableDigitalSignal(time, s));
    }

    public static XMLElement newChangeADCSCalibrationParameters(String time, List<List<String>> parameters){
        return new TCElement(new ChangeADCSCalibrationParameters(time, parameters));
    }

    public static XMLElement newChangeADCSControllerParameters(String time, List<List<String>> parameters){
        return new TCElement(new ChangeADCSControllerParameters(time, parameters));
    }

    public static XMLElement newStartRWExperiment(String time, RWTestTypes test, String parameter){
        return new TCElement(new StartRWExperiment(time, test, parameter));
    }

    public static XMLElement newStartMTSExperiment(String time, List<String> parameters){
        return new TCElement(new StartMTSExperiment(time, parameters));
    }
}
