package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.AmplificationConstantBase;

import java.util.List;

public class K_PB extends XMLElement {
    public K_PB(List<String> value) {
        super(ElementsNames.K_PB_ELEMENT);
        if(value == null || value.size() != 1)
            throw new IllegalArgumentException();

        this.setText(new AmplificationConstantBase(value.get(0)));
    }
}
