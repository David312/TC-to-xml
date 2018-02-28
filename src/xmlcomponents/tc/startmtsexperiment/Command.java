package xmlcomponents.tc.startmtsexperiment;

import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.EssayCommands;
import xmlcomponents.text.EssayCommand;

public class Command extends XMLElement {
    public Command(EssayCommands command) {
        super(ElementsNames.MTS_COMMAND_ELEMENT);
        this.setText(new EssayCommand(command));
    }
}
