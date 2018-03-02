package xmlcomponents.text;

public class MillisecondsDuration extends XMLText {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = Integer.MAX_VALUE;
    public MillisecondsDuration(String milliseconds) {
        super(milliseconds);
        int i = Integer.parseInt(milliseconds);
        if(i < MIN_VALUE || i > MAX_VALUE)
            throw new IllegalArgumentException("The value \""+milliseconds+"\" must be in range " +
                    "[ "+Integer.toString(MIN_VALUE)+" , "+ Integer.toString(MAX_VALUE)+" ].");
        this.setText(milliseconds);
    }
}
