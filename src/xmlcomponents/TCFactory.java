package xmlcomponents;

import xmlcomponents.enumerates.AnalogSignalGroups;
import xmlcomponents.enumerates.OperatingModes;
import xmlcomponents.enumerates.StatusSignals;
import xmlcomponents.tc.changemode.ChangeMode;
import xmlcomponents.tc.changesamplingperiod.ChangeSamplingPeriod;
import xmlcomponents.tc.digitalsignal.DisableDigitalSignal;
import xmlcomponents.tc.digitalsignal.EnableDigitalSignal;
import xmlcomponents.tc.openlink.OpenLink;
import xmlcomponents.tc.openlink.VisibilityDuration;
import xmlcomponents.tc.setlostcommtimer.SetLostCommTimer;

public class TCFactory {
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
}
