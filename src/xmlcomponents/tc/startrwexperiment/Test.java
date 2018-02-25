package xmlcomponents.tc.startrwexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.RWTestTypes;
import xmlcomponents.text.RWTestType;

public class Test extends XMLElement {
    public Test(RWTestTypes test) {
        super(ElementsNames.RW_EXPERIMENT_TEST);
        this.setText(new RWTestType(test.toString()));
    }
}
