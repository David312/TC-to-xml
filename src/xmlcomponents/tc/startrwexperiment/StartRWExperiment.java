package xmlcomponents.tc.startrwexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.RWTestTypes;

public class StartRWExperiment extends XMLElement{
    public StartRWExperiment(RWTestTypes test, String parameter) {
        super(ElementsNames.START_RW_EXPERIMENT_ELEMENT);
        this.appendChild(new Test(test));
        this.appendChild(new TestParameter(parameter));
    }
}
