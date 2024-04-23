
public class Main {
    public static void main(String[] args) {
        Planet planetGama = new Planet("Gama");
        Planet planetBeta = new Planet("Beta");
        Planet planetSigma = new Planet("Sigma");

        planetGama.setEventProbability(
            0,
            0, 
            0.35, 
            0.35, 
            0.3
            );
        planetBeta.setEventProbability(
            0.4, 
            0.2, 
            0, 
            0.4, 
            0
            );
        planetSigma.setEventProbability(
            0, 
            0.25, 
            0.4, 
            0, 
            0.35
            );

        Person person1 = new Person("Jack", 222222);
        Person person2 = new Person("Rose", 222222);
        Person person3 = new Person("Kate", 444444);
        Person person4 = new Person("Leo", 555555);

        Person[] persons = {person1, person2, person3, person4};

        Ship ship = new Ship();
        ship.board(persons);

        ship.listPeople();

        Route route = new Route();
        route.addPlanet(planetGama);
        route.addPlanet(planetBeta);
        route.addPlanet(planetSigma);

        ship.travel(route);
    }
}
