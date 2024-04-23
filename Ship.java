import java.util.List;

public class Ship {
        private Room[][] rooms;
        private RandomAlgorithms randomAlgorithms;

        public Ship(){
            this.rooms = new Room[5][5];
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    this.rooms[i][j] = new Room();
                }
            }

            this.randomAlgorithms = new RandomAlgorithms();
        }

        public void addPerson(Person person){
            int attempts = 0;
            boolean successful = false;
            while (!successful && attempts < 3){
                try{
                    double n = this.randomAlgorithms.hash1(person.getId());
                    if (attempts == 1)
                        n = this.randomAlgorithms.hash2(person.getId());
                    if (attempts == 2)
                        n = this.randomAlgorithms.hash3(person.getId());
                    double indexRoom = Math.ceil(n / 4);
                    int i = (int) Math.ceil(indexRoom / 5);
                    int j = (int ) indexRoom % 5;
                    this.rooms[i][j].assignPlace(person, (int) n % 4);
                    successful = true;
                }
                catch (IllegalArgumentException e){
                    attempts++;
                }
            }            

            // System.out.println("Person " + person.getName() + " with id " + person.getId() + " was assigned to room " + i + " " + j + " " + " place " + (int) n % 4);

        }

        public void board(Person[] persons){
            for (Person person : persons){
                this.addPerson(person);
            }
        }

        // public Room getRoom(int x, int y){
        //     return this.rooms[x][y];
        // }

        public void listPeople(){
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    List<Person> persons = this.rooms[i][j].getPersons();
                    for (Person person : persons){
                        if(person != null){
                            System.out.println("Person " + person.getName() + " with id " + person.getId() + " is in room " + i + " " + j);
                        }
                    }
                }
            }
        }

        public void travel(Route route){
            Node node = route.getHead();
            while (node != null){
                System.out.println("Traveling to " + node.getPlanet().getName());
                node.getPlanet().generateEvent().occur();
                node = node.getNext();
            }
        }

    }
