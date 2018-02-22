package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class ControllerParameters extends XMLElement {
    public static final String TRUE_VALUE = MT_Working.TRUE_VALUE;
    public static final String FALSE_VALUE = MT_Working.FALSE_VALUE;

    public ControllerParameters(List<List<String>> parameters) {
        super(ElementsNames.CONTROLLER_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != 5)
            throw new IllegalArgumentException();

        int i=0;
        this.appendChild(new Omega(parameters.get(i++)));
        this.appendChild(new K_PB(parameters.get(i++)));
        this.appendChild(new K_PE(parameters.get(i++)));
        this.appendChild(new M_M(parameters.get(i++)));
        this.appendChild(new MT_Working(parameters.get(i++)));
    }
}
