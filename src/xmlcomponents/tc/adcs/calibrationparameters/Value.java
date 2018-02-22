package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.ADCSParameter;

public class Value extends XMLElement {
    public Value(String value){
        super(ElementsNames.VALUE_ELEMENT);
        this.setText(new ADCSParameter(value));
    }
}
