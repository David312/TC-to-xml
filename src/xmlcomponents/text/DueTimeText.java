package xmlcomponents.text;

public class DueTimeText extends XMLText {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = Integer.MAX_VALUE;

    public DueTimeText(String text){
        super(text);
        int i = Integer.parseInt(text);
        if(i < MIN_VALUE || i > MAX_VALUE)
            throw new IllegalArgumentException("The value \""+text+"\" must be in range " +
                    "[ "+Integer.toString(MIN_VALUE)+" , "+ Integer.toString(MAX_VALUE)+" ].");
        this.setText(text);
    }
}
