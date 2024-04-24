public class Pirates extends Event {
    public Pirates() {
        super("Pirates", "Space pirates invasion");
    }

    @Override
    public void occur() {
        System.out.println("Space pirates have invaded the planet!");
    }
}