package xmlcomponents;

import xmlcomponents.tc.openlink.OpenLink;
import xmlcomponents.tc.openlink.VisibilityDuration;

public class TCFactory {
    private TCFactory(){}

    public static XMLElement newOpenLink(String duration){
        return new TCElement(new OpenLink(duration));
    }
}
