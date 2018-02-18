package xmlcomponents;

import xmlcomponents.tc.openlink.OpenLink;
import xmlcomponents.tc.openlink.VisibilityDuration;
import xmlcomponents.tc.setlostcommtimer.SetLostCommTimer;

public class TCFactory {
    private TCFactory(){}

    public static XMLElement newOpenLink(String duration){
        return new TCElement(new OpenLink(duration));
    }

    public static XMLElement newSetLostCommTimer(String newLostTimer){
        return new TCElement(new SetLostCommTimer(newLostTimer));
    }
}
