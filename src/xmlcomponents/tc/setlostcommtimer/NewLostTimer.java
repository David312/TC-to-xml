package xmlcomponents.tc.setlostcommtimer;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MissionTime;

public class NewLostTimer extends XMLElement {
    public NewLostTimer (String lostTimer){
        super(ElementsNames.NEW_LOST_TIMER_ELEMENT);
        this.setText(new MissionTime(lostTimer));
    }
}
