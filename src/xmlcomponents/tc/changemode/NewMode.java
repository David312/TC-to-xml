package xmlcomponents.tc.changemode;

import xmlcomponents.ElementsNames;
import xmlcomponents.OperatingModes;
import xmlcomponents.XMLElement;
import xmlcomponents.text.OperatingMode;

public class NewMode extends XMLElement {
    public NewMode(OperatingModes newMode){
        super(ElementsNames.NEW_MODE_ELEMENT);
        this.setText(new OperatingMode(newMode.toString()));
    }
}
