package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.AmplificationConstantExponent;

import java.util.List;

public class K_PE extends XMLElement {
    public K_PE(List<String> value) {
        super(ElementsNames.K_PE_ELEMENT);
        if(value == null || value.size() != 1)
            throw new IllegalArgumentException();

        this.setText(new AmplificationConstantExponent(value.get(0)));
    }
}
