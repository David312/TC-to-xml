package xmlcomponents;

import xmlcomponents.text.XMLText;

public abstract class XMLAttribute {
    private XMLText value = null;
    private final String attributeName;

    protected XMLAttribute(String name) {
        this.attributeName = name;
    }

    public void setValue(XMLText value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.attributeName + "=\"" + this.value.getText() + "\"";
    }
}
