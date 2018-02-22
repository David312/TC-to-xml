package xmlcomponents.tc.adcs;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.controllerparameters.ControllerParameters;

import java.util.List;

public class ChangeADCSControllerParameters extends XMLElement {
    public static String TRUE_VALUE = ControllerParameters.TRUE_VALUE;
    public static String FALSE_VALUE = ControllerParameters.FALSE_VALUE;

    public ChangeADCSControllerParameters(List<List<String>> parameters) {
        super(ElementsNames.CHANGE_ADCS_CONTROLLER_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != 5)
            throw new IllegalArgumentException();

        this.appendChild(new ControllerParameters(parameters));
    }
}
