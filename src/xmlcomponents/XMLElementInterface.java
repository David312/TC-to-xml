package xmlcomponents;

import xmlcomponents.text.XMLText;

public interface XMLElementInterface {
    public String toXMLString(int depth);
    public void appendChild(XMLElementInterface e);
    public String getText();
    public void setText(XMLText text);
    public void setAttribute(XMLAttribute attr);
}
