package xmlcomponents;

public abstract class XMLObject implements XMLObjectInterface{
    private String content;

    public XMLObject(String content){
        this.content = content + "\n";
    }

    @Override
    public String getContent(){
        return this.content;
    }

    @Override
    public void setContent(String content){
        this.content = content + "\n";
    }
}
