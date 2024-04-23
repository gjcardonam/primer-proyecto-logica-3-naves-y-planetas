public class SolarStorm extends Event{
    public SolarStorm(){
        super("Solar storm event");
    }

    @Override
    public void occur() {
        System.out.println("A solar storm has disrupted the planet's atmosphere!");
    }
}