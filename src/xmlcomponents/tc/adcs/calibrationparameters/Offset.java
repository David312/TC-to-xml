package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.ADCSParameter;

public class Offset extends XMLElement {
    public Offset(String offset) {
        super(ElementsNames.OFFSET_ELEMENT);
        this.setText(new ADCSParameter(offset));
    }
}
