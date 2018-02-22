package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.ADCSParameter;


public class Axis extends XMLElement {
    public static final String x = "x";
    public static final String y = "y";
    public static final String z = "z";
    public static final String TRUE_VALUE = "1.0";
    public static final String FALSE_VALUE = "0.0";

    public Axis(String value, String axis) {
        super(axis + ElementsNames.AXIS_ELEMENT);
        if(!axis.equals(x) && !axis.equals(y) && !axis.equals(z)
                && !value.equals(TRUE_VALUE) && !value.equals(FALSE_VALUE))
            throw new IllegalArgumentException();

        this.setText(new ADCSParameter(value));
    }
}
