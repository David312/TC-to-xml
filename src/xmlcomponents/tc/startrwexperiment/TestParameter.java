package xmlcomponents.tc.startrwexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.RWTestParameter;

public class TestParameter extends XMLElement {
    public TestParameter(String parameter) {
        super(ElementsNames.RW_EXPERIMENT_TEST_PARAMETER);
        Double.parseDouble(parameter);
        this.setText(new RWTestParameter(parameter));
    }
}
