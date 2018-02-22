package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class CalibrationMatrix extends XMLElement {
    public CalibrationMatrix(List<String> values, int n) {
        super(ElementsNames.CALIBRATION_MATRIX_ELEMENT + n);
        if(n < 1 || n > 3 || values == null || values.size() != 9)
            throw new IllegalArgumentException();
        for(String v: values)
            this.appendChild(new Value(v));
    }
}
