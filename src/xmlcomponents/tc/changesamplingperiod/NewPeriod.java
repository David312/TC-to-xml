package xmlcomponents.tc.changesamplingperiod;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.SecondsCount;

public class NewPeriod extends XMLElement {
    public NewPeriod(String seconds){
        super(ElementsNames.NEW_PERIOD_ELEMENT);
        this.setText(new SecondsCount(seconds));
    }
}
