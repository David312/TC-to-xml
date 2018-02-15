package xmlcomponents.tc.changesamplingperiod;

import xmlcomponents.enumerates.AnalogSignalGroups;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

public class ChangeSamplingPeriod extends XMLElement {
    public ChangeSamplingPeriod(AnalogSignalGroups signalsToChange,
                                String newPeriod){
        super(ElementsNames.CHANGE_SAMPLING_PERIOD_ELEMENT);
        this.appendChild(new SignalsToChangePeriod(signalsToChange));

    }
}
