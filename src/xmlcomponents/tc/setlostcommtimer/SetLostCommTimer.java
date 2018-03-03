package xmlcomponents.tc.setlostcommtimer;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.text.MissionTime;

public class SetLostCommTimer extends XMLElement {
    public SetLostCommTimer(String time, String lostTimer){
        super(ElementsNames.SET_LOST_COMM_TIMER_ELEMENT);
        this.setAttribute(new DueTime(time));
        this.appendChild(new NewLostTimer(lostTimer));
    }
}
