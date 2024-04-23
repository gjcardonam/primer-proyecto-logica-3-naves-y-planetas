import java.util.ArrayList;
import java.util.Random;

public class Asteroid extends Event {
    private ArrayList<Integer> ids;

    public Asteroid() {
        super("Asteroid impact");
        ids = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomId = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
            ids.add(randomId);
        }
    }

    @Override
    public void occur() {
        System.out.println("Critical alert! A barrage of asteroids has struck the ship");
    }
}