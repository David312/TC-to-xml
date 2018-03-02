package xmlcomponents.text;

public class AngularVelocity extends ADCSParameter {
    private static final double MIN_VALUE = -2*Math.PI;
    private static final double MAX_VALUE = 2*Math.PI;
    public AngularVelocity(String text) {
        super(text);
        double d = Double.parseDouble(text);
        if(d < MIN_VALUE || d > MAX_VALUE)
            throw new IllegalArgumentException("The value \""+text+"\" must be in range " +
                    "[ "+Double.toString(MIN_VALUE)+" , "+ Double.toString(MAX_VALUE)+" ].");
    }
}
