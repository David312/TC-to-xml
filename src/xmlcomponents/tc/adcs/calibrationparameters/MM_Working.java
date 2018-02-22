package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class MM_Working extends XMLElement {
    public static String TRUE_VALUE = MGM.TRUE_VALUE;
    public static String FALSE_VALUE = MGM.FALSE_VALUE;

    public MM_Working(List<String> values) {
        super(ElementsNames.MM_WORKING_ELEMENT);
        if(values == null || values.size() != 3)
            throw new IllegalArgumentException();
        int i = 1;
        for(String v: values)
            this.appendChild(new MGM(v,i++));
    }
}
