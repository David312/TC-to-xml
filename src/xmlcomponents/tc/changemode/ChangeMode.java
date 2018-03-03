package xmlcomponents.tc.changemode;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.enumerates.OperatingModes;
import xmlcomponents.XMLElement;

public class ChangeMode extends XMLElement {
    public ChangeMode(String time, OperatingModes newMode){
        super(ElementsNames.CHANGE_MODE_ELEMENT);
        this.appendChild(new NewMode(newMode));
        this.setAttribute(new DueTime(time));
    }
}
