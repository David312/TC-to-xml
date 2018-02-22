package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class CalibrationOffset extends XMLElement {
    public CalibrationOffset(List<String> offsets, int n) {
        super(ElementsNames.CALIBRATION_OFFSET_ELEMENT + n);
        if(n < 1 || n > 3 || offsets == null || offsets.size() != 3)
            throw new IllegalArgumentException();
        for(String off: offsets)
            this.appendChild(new Offset(off));
    }
}
