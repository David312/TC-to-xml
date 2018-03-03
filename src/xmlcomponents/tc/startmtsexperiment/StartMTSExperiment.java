package xmlcomponents.tc.startmtsexperiment;

import xmlcomponents.DueTime;
import xmlcomponents.ElementsNames;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.EssayCommands;

import java.util.List;

public class StartMTSExperiment extends XMLElement {

    private static final int PARAMETERS_LENGTH = 14;

    public StartMTSExperiment(String time, List<String> parameters) {
        super(ElementsNames.START_MTS_EXPERIMENT_ELEMENT);
        if(parameters == null || parameters.size() != PARAMETERS_LENGTH)
            throw new IllegalArgumentException();

        this.setAttribute(new DueTime(time));

        int i = 0;
        this.appendChild(new TCOrbit(parameters.get(i++)));

        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),1));
        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),2));
        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),3));
        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),4));
        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),5));
        this.appendChild(new MTS_T(Boolean.parseBoolean(parameters.get(i++)),6));

        this.appendChild(new Heater(Boolean.parseBoolean(parameters.get(i++)),1));
        this.appendChild(new Heater(Boolean.parseBoolean(parameters.get(i++)),2));
        this.appendChild(new Heater(Boolean.parseBoolean(parameters.get(i++)),3));

        this.appendChild(new Command(EssayCommands.valueOf(parameters.get(i++))));

        this.appendChild(new Reserved(Boolean.parseBoolean(parameters.get(i++)),1));
        this.appendChild(new Reserved(Boolean.parseBoolean(parameters.get(i++)),2));
        this.appendChild(new Reserved(Boolean.parseBoolean(parameters.get(i++)),3));
    }
}
