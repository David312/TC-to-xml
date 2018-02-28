package xmlcomponents.tc.startmtsexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MillisecondsDuration;

public class ExperimentDuration extends XMLElement {
    public ExperimentDuration(String duration) {
        super(ElementsNames.MTS_EXPERIMENT_DURATION_ELEMENT);
        Integer.parseInt(duration);
        this.setText(new MillisecondsDuration(duration));
    }
}
