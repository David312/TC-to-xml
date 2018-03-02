package xmlcomponents.tc.startmtsexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MillisecondsDuration;

public class TCOrbit extends XMLElement {
    public TCOrbit(String duration) {
        super(ElementsNames.MTS_TC_ORBIT_ELEMENT);
        Integer.parseInt(duration);
        this.setText(new MillisecondsDuration(duration));
    }
}
