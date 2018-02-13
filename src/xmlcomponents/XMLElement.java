package xmlcomponents;

import java.util.ArrayList;
import java.util.List;

public abstract class XMLElement implements XMLElementInterface{
    protected String name = "";
    protected List<XMLElementInterface> children = null;

    public XMLElement(String name){
        this.name = name;
        this.children = new ArrayList<XMLElementInterface>();
    }

    @Override
    public void appendChild(XMLElementInterface e){
        this.children.add(e);
    }

    @Override
    public String toXMLString() {
        String representation = "<" + this.name + ">\n";
        for(XMLElementInterface e: this.children)
            representation += e.toXMLString();
        representation += "<" + this.name + "/>\n";
        return representation;
    }
}
