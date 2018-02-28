package xmlcomponents.tc.startmtsexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.BooleanText;

public class Reserved extends XMLElement {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 3;
    public Reserved(boolean b, int n) {
        super(ElementsNames.MTS_RESERVED_ELEMENT + n);
        if(n < MIN_VALUE || n > MAX_VALUE)
            throw new IllegalArgumentException();
        this.setText(new BooleanText(b));
    }
}
