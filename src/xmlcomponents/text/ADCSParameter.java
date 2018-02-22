package xmlcomponents.text;

public class ADCSParameter extends XMLText{

    public ADCSParameter(String text) {
        super(text);
        Double.parseDouble(text);
        this.setText(text);
    }
}
