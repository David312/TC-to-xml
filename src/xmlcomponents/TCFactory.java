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

    public static XMLElement newOpenLink(String duration){
        return new TCElement(new OpenLink(duration));
    }

    public static XMLElement newSetLostCommTimer(String newLostTimer){
        return new TCElement(new SetLostCommTimer(newLostTimer));
    }

    public static XMLElement newChangeMode(OperatingModes mode){
        return new TCElement(new ChangeMode(mode));
    }

    public static XMLElement newChangeSamplingPeriod(AnalogSignalGroups g,
                                                     String newPeriod) {
        return new TCElement(new ChangeSamplingPeriod(g, newPeriod));
    }

    public static XMLElement newEnableDigitalSignal(StatusSignals s){
        return new TCElement(new EnableDigitalSignal(s));
    }

    public static XMLElement newDisableDigitalSignal(StatusSignals s){
        return new TCElement(new DisableDigitalSignal(s));
    }

    public static XMLElement newChangeADCSCalibrationParameters(List<List<String>> parameters){
        return new TCElement(new ChangeADCSCalibrationParameters(parameters));
    }

    public static XMLElement newChangeADCSControllerParameters(List<List<String>> parameters){
        return new TCElement(new ChangeADCSControllerParameters(parameters));
    }

    public static XMLElement newStartRWExperiment(RWTestTypes test, String parameter){
        return new TCElement(new StartRWExperiment(test, parameter));
    }

    public static XMLElement newStartMTSExperiment(List<String> parameters){
        return new TCElement(new StartMTSExperiment(parameters));
    }
}
