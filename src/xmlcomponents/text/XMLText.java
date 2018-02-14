package xmlcomponents.text;

public abstract class XMLText implements XMLTextInterface {
    private String text;

    public XMLText(String text){
        this.text = text + "\n";
    }

    @Override
    public String getText(){
        return this.text;
    }

    @Override
    public void setText(String text){
        this.text = text + "\n";
    }
}
