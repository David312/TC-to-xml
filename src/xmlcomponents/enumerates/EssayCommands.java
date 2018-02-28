package xmlcomponents.enumerates;

public enum EssayCommands {
    ALL_ESSAYS("ALL_ESSAYS"),
    PERFORMANCE_1("PERFORMANCE_1"),
    PERFORMANCE_2("PERFORMANCE_2"),
    PERFORMANCE_3("PERFORMANCE_3"),
    PERFORMANCE_4("PERFORMANCE_4"),
    CYCLING_5("CYCLING_5"),
    CYCLING_6("CYCLING_6"),
    CYCLING_7("CYCLING_7"),
    TRANSITION_8("TRANSITION_8"),
    TRANSITION_9("TRANSITION_9"),
    TRANSITION_10("TRANSITION_10"),
    TRANSITION_11("TRANSITION_11"),
    LIFE_12("LIFE_12");

    private final String name;
    private EssayCommands(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
