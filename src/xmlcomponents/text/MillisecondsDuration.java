package xmlcomponents.text;

public class MillisecondsDuration extends XMLText {
    public MillisecondsDuration(String milliseconds) {
        super(milliseconds);
        Integer.parseInt(milliseconds);
        this.setText(milliseconds);
    }
}
