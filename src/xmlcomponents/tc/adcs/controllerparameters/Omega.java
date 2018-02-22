package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class Omega extends XMLElement {
    public Omega(List<String> values) {
        super(ElementsNames.OMEGA_ELEMENT);
        if(values == null || values.size() != 3)
            throw new IllegalArgumentException();

        int i=0;
        this.appendChild(new Omega_Axis(values.get(i++), Omega_Axis.x));
        this.appendChild(new Omega_Axis(values.get(i++), Omega_Axis.y));
        this.appendChild(new Omega_Axis(values.get(i++), Omega_Axis.z));
    }
}
