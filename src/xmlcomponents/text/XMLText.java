package xmlcomponents.text;

public abstract class XMLText {
    private String text;

    public XMLText(String text){
        this.text = text + "\n";
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text + "\n";
    }
}
