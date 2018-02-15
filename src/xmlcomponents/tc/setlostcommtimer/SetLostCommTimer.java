package xmlcomponents.tc.setlostcommtimer;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MissionTime;

public class SetLostCommTimer extends XMLElement {
    public SetLostCommTimer(String lostTimer){
        super(ElementsNames.SET_LOST_COMM_TIMER_ELEMENT);
        this.appendChild(new NewLostTimer(lostTimer));
    }
}
