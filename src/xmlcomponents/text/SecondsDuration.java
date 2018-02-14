package xmlcomponents.text;

public class SecondsDuration extends XMLText {
    public SecondsDuration(String text){
        super(text);
        Integer.parseInt(text);
        this.setText(text);
    }
}
