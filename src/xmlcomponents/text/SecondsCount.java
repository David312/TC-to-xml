package xmlcomponents.text;

public class SecondsCount extends XMLText {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = Integer.MAX_VALUE;

    public SecondsCount(String seconds){
        super(seconds);
        int i = Integer.parseInt(seconds);
        if(i < MIN_VALUE || i > MAX_VALUE)
            throw new IllegalArgumentException("The value \""+seconds+"\" must be in range " +
                    "[ "+Integer.toString(MIN_VALUE)+" , "+ Integer.toString(MAX_VALUE)+" ].");
        this.setText(seconds);
    }
}
