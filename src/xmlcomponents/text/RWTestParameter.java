package xmlcomponents.text;

public class RWTestParameter extends XMLText {
    private static final double MIN_VALUE = 0;
    // private static final double MAX_VALUE = 0;
    public RWTestParameter(String text) {
        super(text);
        double d = Double.parseDouble(text);
        if(d < MIN_VALUE)
            throw new IllegalArgumentException("The value \""+text+"\" must be positive.");
    }
}
