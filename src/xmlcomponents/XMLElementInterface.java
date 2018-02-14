package xmlcomponents;

import xmlcomponents.text.XMLTextInterface;

public interface XMLElementInterface {
    public String toXMLString();
    public void appendChild(XMLElementInterface e);
    public String getText();
    public void setText(XMLTextInterface text);
}
