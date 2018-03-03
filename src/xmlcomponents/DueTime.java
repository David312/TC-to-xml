package xmlcomponents;

import xmlcomponents.text.DueTimeText;
import xmlcomponents.text.XMLText;

public class DueTime extends XMLAttribute {
    public DueTime(String value) {
        super(ElementsNames.DUE_TIME_ATTRIBUTE);
        this.setValue(new DueTimeText(value));
    }
}
