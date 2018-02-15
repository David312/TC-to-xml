package xmlcomponents.tc.changemode;

import xmlcomponents.ElementsNames;
import xmlcomponents.OperatingModes;
import xmlcomponents.XMLElement;

public class ChangeMode extends XMLElement {
    public ChangeMode(OperatingModes newMode){
        super(ElementsNames.CHANGE_MODE_ELEMENT);

    }
}
