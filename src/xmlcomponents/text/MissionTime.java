package xmlcomponents.text;

import xmlcomponents.text.XMLText;

public class MissionTime extends XMLText {
    public MissionTime(String text){
        super(text);
        Integer.parseInt(text);
        this.setText(text);
    }
}
