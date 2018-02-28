package xmlcomponents.text;

import xmlcomponents.enumerates.EssayCommands;

public class EssayCommand extends XMLText {
    public EssayCommand(EssayCommands command) {
        super(command.toString());
    }
}
