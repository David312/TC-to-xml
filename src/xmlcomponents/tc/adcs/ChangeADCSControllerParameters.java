package xmlcomponents.tc.adcs;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.controllerparameters.ControllerParameters;

import java.util.List;

public class ChangeADCSControllerParameters extends XMLElement {
    public static String TRUE_VALUE = ControllerParameters.TRUE_VALUE;
    public static String FALSE_VALUE = ControllerParameters.FALSE_VALUE;
    private static final int PARAMETERS_LENGTH = 5;

    public ChangeADCSControllerParameters(String time, List<List<String>> parameters) {
        super(ElementsNames.CHANGE_ADCS_CONTROLLER_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != PARAMETERS_LENGTH)
            throw new IllegalArgumentException();

        this.setAttribute(new DueTime(time));
        this.appendChild(new ControllerParameters(parameters));
    }
}
