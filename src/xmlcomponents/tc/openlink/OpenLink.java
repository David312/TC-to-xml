package xmlcomponents.tc.openlink;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.SecondsDuration;

public class OpenLink extends XMLElement {
    public OpenLink(String time, String visibility){
        super(ElementsNames.OPENLINK_ELEMENT);
        this.setAttribute(new DueTime(time));
        this.appendChild(new VisibilityDuration(visibility));
    }
}
