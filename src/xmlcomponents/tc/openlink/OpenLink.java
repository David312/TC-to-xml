package xmlcomponents.tc.openlink;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.SecondsDuration;

public class OpenLink extends XMLElement {
    public OpenLink(String visibility){
        super(ElementsNames.OPENLINK_ELEMENT);
        this.appendChild(new VisibilityDuration(visibility));
    }
}
