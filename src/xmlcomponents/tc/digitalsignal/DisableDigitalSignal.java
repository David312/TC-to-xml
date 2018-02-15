package xmlcomponents.tc.digitalsignal;

import xmlcomponents.ElementsNames;
import xmlcomponents.enumerates.StatusSignals;
import xmlcomponents.XMLElement;

public class DisableDigitalSignal extends XMLElement {
    public DisableDigitalSignal(StatusSignals signal){
        super(ElementsNames.DISABLE_DIGITAL_SIGNAL_ELEMENT);
        this.appendChild(new StatusSignalElement(signal));
    }
}
