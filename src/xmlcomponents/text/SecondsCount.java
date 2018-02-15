package xmlcomponents.text;

public class SecondsCount extends XMLText {
    public SecondsCount(String seconds){
        super(seconds);
        Integer.parseInt(seconds);
        this.setText(seconds);
    }
}
