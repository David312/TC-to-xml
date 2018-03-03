package xmlcomponents.tc.changesamplingperiod;

import xmlcomponents.DueTime;
import xmlcomponents.enumerates.AnalogSignalGroups;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

public class ChangeSamplingPeriod extends XMLElement {
    public ChangeSamplingPeriod(String time,
                                AnalogSignalGroups signalsToChange,
                                String newPeriod){
        super(ElementsNames.CHANGE_SAMPLING_PERIOD_ELEMENT);
        this.setAttribute(new DueTime(time));
        this.appendChild(new SignalsToChangePeriod(signalsToChange));
        this.appendChild(new NewPeriod(newPeriod));
    }
}
