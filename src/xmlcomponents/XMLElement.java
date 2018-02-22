package xmlcomponents;

import xmlcomponents.text.XMLText;

import java.util.ArrayList;
import java.util.List;

public abstract class XMLElement implements XMLElementInterface{
    protected String name = "";
    protected List<XMLElementInterface> children = null;
    protected XMLText text = null;

    public XMLElement(String name){
        this.name = name;
        this.children = new ArrayList<XMLElementInterface>();
        this.text = null;
    }

    @Override
    public void appendChild(XMLElementInterface e){
        this.children.add(e);
    }

    @Override
    public String toXMLString(int depth) {
        // TODO: clean code
        String indentation = "";
        for (int i = 0; i < depth; i++)
            indentation += "  ";

        String representation = indentation + "<" + this.name + ">";
        if(this.text == null)
            representation += "\n";
        for(XMLElementInterface e: this.children)
            representation += e.toXMLString(depth + 1);

        if(this.text != null)
            representation += this.text.getText();

        if(this.text == null)
            representation += indentation;

        representation += "</" + this.name + ">\n";
        return representation;
    }

    @Override
    public String getText() {
        if(this.text != null)
            return this.text.getText();
        return null;
    }

    @Override
    public void setText(XMLText text) {
        this.text = text;
    }
}
