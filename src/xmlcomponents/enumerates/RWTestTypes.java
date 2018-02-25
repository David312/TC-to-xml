package xmlcomponents.enumerates;

public enum RWTestTypes {

    CONNECTION("CONNECTION"),
    ACTIVATION("ACTIVATION"),
    CURRENT_MODE("CURRENT_MODE"),
    SPEED_MODE("SPEED_MODE"),
    TORQUE_MODE("TORQUE_MODE");

    private final String name;
    private RWTestTypes(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
