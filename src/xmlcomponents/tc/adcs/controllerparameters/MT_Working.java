package xmlcomponents.tc.adcs.controllerparameters;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;

import java.util.List;

public class MT_Working extends XMLElement{
    public static final String TRUE_VALUE = Axis.TRUE_VALUE;
    public static final String FALSE_VALUE = Axis.FALSE_VALUE;

    public MT_Working(List<String> values) {
        super(ElementsNames.MT_WORKING_ELEMENT);
        if(values == null || values.size() != 3)
            throw new IllegalArgumentException();

        int i=0;
        this.appendChild(new Axis(values.get(i++), Axis.x));
        this.appendChild(new Axis(values.get(i++), Axis.y));
        this.appendChild(new Axis(values.get(i++), Axis.z));
    }
}
