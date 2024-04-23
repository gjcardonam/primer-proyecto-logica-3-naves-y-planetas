public class AirPoisonousScape extends Event{
    public AirPoisonousScape(){
        super("Poisonous air event");
    }

    @Override
    public void occur() {
        System.out.println("The air has become poisonous on the planet!");
    }
    
}
