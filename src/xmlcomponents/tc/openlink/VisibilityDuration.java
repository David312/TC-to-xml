package xmlcomponents.tc.openlink;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.SecondsDuration;

public class VisibilityDuration extends XMLElement{
    public VisibilityDuration(String visibility){
        super(ElementsNames.VISIBILITY_DURATION_ELEMENT);
        this.setText(new SecondsDuration(visibility));
    }
}
