package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.AngularVelocity;

public class Omega_Axis extends XMLElement {
    public static final String x = "x";
    public static final String y = "y";
    public static final String z = "z";

    public Omega_Axis(String value, String axis) {
        super(ElementsNames.OMEGA_AXIS_ELEMENT + axis);
        if(!axis.equals(x) && !axis.equals(y) && !axis.equals(z))
            throw new IllegalArgumentException();

        this.setText(new AngularVelocity(value));
    }
}
