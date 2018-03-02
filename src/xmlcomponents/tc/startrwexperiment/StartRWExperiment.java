package xmlcomponents.tc.startrwexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.RWTestTypes;

public class StartRWExperiment extends XMLElement{
    private static final String TORQUE_VALUE1 = "1.0";
    private static final String TORQUE_VALUE2 = "2.0";
    private static final String TORQUE_VALUE3 = "3.0";

    public StartRWExperiment(RWTestTypes test, String parameter) {
        super(ElementsNames.START_RW_EXPERIMENT_ELEMENT);
        this.appendChild(new Test(test));
        if(test.equals(RWTestTypes.TORQUE_MODE)){
            if(!parameter.equals(TORQUE_VALUE1) && !parameter.equals(TORQUE_VALUE2)
                    && !parameter.equals(TORQUE_VALUE3))
                throw new IllegalArgumentException("The test parameter values for Torque mode are any of " +
                        "[ "+TORQUE_VALUE1+" , "+TORQUE_VALUE2+" , "+TORQUE_VALUE3+" ].");
        }
        this.appendChild(new TestParameter(parameter));
    }
}
