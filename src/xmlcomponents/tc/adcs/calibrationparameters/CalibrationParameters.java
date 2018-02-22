package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.calibrationparameters.CalibrationMatrix;
import xmlcomponents.tc.adcs.calibrationparameters.CalibrationOffset;
import xmlcomponents.tc.adcs.calibrationparameters.MM_Working;

import java.util.List;

public class CalibrationParameters extends XMLElement{

    public static String TRUE_VALUE = MM_Working.TRUE_VALUE;
    public static String FALSE_VALUE = MM_Working.FALSE_VALUE;

    public CalibrationParameters(List<List<String>> parameters){
        super(ElementsNames.CALIBRATION_PARAMETERS_ELEMENT);
        if(parameters == null || parameters.size() != 7)
            throw new IllegalArgumentException();

        int i = 0;
        this.appendChild(new MM_Working(parameters.get(i++)));
        this.appendChild(new CalibrationMatrix(parameters.get(i++),1));
        this.appendChild(new CalibrationOffset(parameters.get(i++),1));
        this.appendChild(new CalibrationMatrix(parameters.get(i++),2));
        this.appendChild(new CalibrationOffset(parameters.get(i++),2));
        this.appendChild(new CalibrationMatrix(parameters.get(i++),3));
        this.appendChild(new CalibrationOffset(parameters.get(i++),3));
    }
}
