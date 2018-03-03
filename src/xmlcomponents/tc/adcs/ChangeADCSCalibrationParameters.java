package xmlcomponents.tc.adcs;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.calibrationparameters.CalibrationParameters;

import java.util.List;

public class ChangeADCSCalibrationParameters extends XMLElement{
    public static String TRUE_VALUE = CalibrationParameters.TRUE_VALUE;
    public static String FALSE_VALUE = CalibrationParameters.FALSE_VALUE;
    private static final int PARAMETERS_LENGTH = 7;

    public ChangeADCSCalibrationParameters(String time, List<List<String>> parameters) {
        super(ElementsNames.CHANGE_ADCS_CALIBRATION_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != PARAMETERS_LENGTH)
            throw new IllegalArgumentException();
        this.setAttribute(new DueTime(time));
        this.appendChild(new CalibrationParameters(parameters));
    }
}
