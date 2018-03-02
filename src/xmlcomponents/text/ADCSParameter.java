package xmlcomponents.text;

public class ADCSParameter extends XMLText{
    public ADCSParameter(String text) {
        super(text);
        double d = Double.parseDouble(text);
        this.setText(text);
    }
}
