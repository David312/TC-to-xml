package xmlcomponents.tc.digitalsignal;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.enumerates.StatusSignals;
import xmlcomponents.XMLElement;

public class EnableDigitalSignal extends XMLElement {
    public EnableDigitalSignal(String time, StatusSignals signal){
        super(ElementsNames.ENABLE_DIGITAL_SIGNAL_ELEMENT);
        this.setAttribute(new DueTime(time));
        this.appendChild(new StatusSignalElement(signal));
    }
}
