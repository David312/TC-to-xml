package xmlcomponents.tc.digitalsignal;

import xmlcomponents.ElementsNames;
import xmlcomponents.StatusSignals;
import xmlcomponents.XMLElement;
import xmlcomponents.text.StatusSignal;

public class StatusSignalElement extends XMLElement {
    public StatusSignalElement(StatusSignals signal) {
        super(ElementsNames.STATUS_SIGNAL_ELEMENT);
        this.setText(new StatusSignal(signal.toString()));
    }
}
