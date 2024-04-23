public class Pirates extends Event {
    public Pirates() {
        super("Pirate invasion");
    }

    @Override
    public void occur() {
        System.out.println("Space pirates have invaded the planet!");
    }
}