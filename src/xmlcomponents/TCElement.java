package xmlcomponents;

public class TCElement extends XMLElement{
    public TCElement(XMLElement tc){
        super(ElementsNames.TC_ELEMENT);
        this.appendChild(tc);
    }
}
