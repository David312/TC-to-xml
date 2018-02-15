package xmlcomponents.tc.changesamplingperiod;

import xmlcomponents.enumerates.AnalogSignalGroups;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.AnalogSignalGroup;

public class SignalsToChangePeriod extends XMLElement {
    public SignalsToChangePeriod(AnalogSignalGroups group){
        super(ElementsNames.SIGNALS_TO_CHANGE_PERIOD_ELEMENT);
        this.setText(new AnalogSignalGroup(group.toString()));
    }
}
