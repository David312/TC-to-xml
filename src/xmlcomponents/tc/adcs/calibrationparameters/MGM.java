package xmlcomponents.tc.adcs.calibrationparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.ADCSParameter;

public class MGM extends XMLElement {
    public static String TRUE_VALUE = "1.0";
    public static String FALSE_VALUE = "0.0";

    public MGM(String value, int n) {
        super(ElementsNames.MGM_ELEMENT + n);
        if(n < 1 || n > 3)
            throw new IllegalArgumentException();

        Double.parseDouble(value);
        this.setText(new ADCSParameter(value));
    }
}
