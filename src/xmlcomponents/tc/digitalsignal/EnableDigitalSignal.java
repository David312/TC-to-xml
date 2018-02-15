package xmlcomponents.tc.digitalsignal;

import xmlcomponents.ElementsNames;
import xmlcomponents.StatusSignals;
import xmlcomponents.XMLElement;

public class EnableDigitalSignal extends XMLElement {
    public EnableDigitalSignal(StatusSignals signal){
        super(ElementsNames.ENABLE_DIGITAL_SIGNAL_ELEMENT);
        this.appendChild(new StatusSignalElement(signal));
    }
}
