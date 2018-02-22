package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MaximumTorque;

import java.util.List;

public class M_M extends XMLElement {
    public M_M(List<String> value) {
        super(ElementsNames.M_M_ELEMENT);
        if(value == null || value.size() != 1)
            throw new IllegalArgumentException();

        this.setText(new MaximumTorque(value.get(0)));
    }
}
