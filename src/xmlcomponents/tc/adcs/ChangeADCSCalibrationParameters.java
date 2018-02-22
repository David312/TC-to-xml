package xmlcomponents.tc.adcs;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.calibrationparameters.CalibrationParameters;

import java.util.List;

public class ChangeADCSCalibrationParameters extends XMLElement{
    public static String TRUE_VALUE = CalibrationParameters.TRUE_VALUE;
    public static String FALSE_VALUE = CalibrationParameters.FALSE_VALUE;

    public ChangeADCSCalibrationParameters(List<List<String>> parameters) {
        super(ElementsNames.CHANGE_ADCS_CALIBRATION_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != 7)
            throw new IllegalArgumentException();
        this.appendChild(new CalibrationParameters(parameters));
    }
}
